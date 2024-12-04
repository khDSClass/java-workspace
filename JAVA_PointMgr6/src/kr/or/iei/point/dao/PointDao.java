package kr.or.iei.point.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import kr.or.iei.point.vo.Gold;
import kr.or.iei.point.vo.Grade;
import kr.or.iei.point.vo.Silver;
import kr.or.iei.point.vo.Vip;

public class PointDao {
	ArrayList<Grade> members;

	public PointDao() {
		super();
		importMember();
		/*
		members = new ArrayList<Grade>();
		
		members.add(new Silver("silver","회원1",1000));
		members.add(new Silver("silver","회원2",2000));
		members.add(new Gold("gold", "회원3", 1000));
		members.add(new Gold("gold", "회원4", 2000));
		members.add(new Vip("vip", "회원5", 1000));
		members.add(new Vip("vip", "회원6", 2000));
		*/
	}
	public void insertMember(Grade g) {
		members.add(g);
	}
	
	public void insertMember(String grade, String name, int point) {
		switch(grade) {
		case "silver":
			Silver s = new Silver(grade, name, point);
			members.add(s);
			break;
		case "gold":
			Gold g = new Gold(grade, name, point);
			members.add(g);
			break;
		case "vip":
			Vip v = new Vip(grade, name, point);
			members.add(v);
			break;
		}
		exportMember();
	}
	
	public ArrayList<Grade> printAllMember() {
		return members;
	}
	
	public int searchMember(String name) {
		for(int i=0;i<members.size();i++) {
			Grade g = members.get(i);
			if(g.getName().equals(name)) {
				return i;
			}
		}
		return -1;
	}
	public Grade getMember(int searchIndex) {
		Grade g = members.get(searchIndex);
		return g;
	}
	public void updateMember(int searchIndex, String grade, String name, int point) {
		switch(grade) {
		case "silver":
			Silver s = new Silver(grade, name, point);
			members.set(searchIndex, s);
			break;
		case "gold":
			Gold g = new Gold(grade, name, point);
			members.set(searchIndex, g);
			break;
		case "vip":
			Vip v = new Vip(grade, name, point);
			members.set(searchIndex, v);
			break;
		}
		exportMember();
	}
	public void deleteMember(int searchIndex) {
		members.remove(searchIndex);
		exportMember();
	}
	
	public boolean deleteMember(String name) {
		int searchIndex = searchMember(name);
		if(searchIndex == -1) {
			return false;
		}else {
			members.remove(searchIndex);
			exportMember();
			return true;
		}
	}
	
	public void exportMember() {
		ObjectOutputStream oos = null;
		try {
			//1. 스트림 생성
			FileOutputStream fos = new FileOutputStream("backup.txt");
			//생성된 스트림으로 보조스트림 생성
			oos = new ObjectOutputStream(fos);
			//2. 메소드를 통한 데이터 출력
			oos.writeObject(members);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				//3. 자원반환
				oos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void importMember() {
		File checkFile = new File("backup.txt");
		if(!checkFile.exists()) {
			members = new ArrayList<Grade>();
			return;
		}
		ObjectInputStream ois = null;		
		try {
			//1. 파일내용을 가져오기위한 주 스트림 생성
			FileInputStream fis = new FileInputStream("backup.txt");
			//주스트림을 이용한 보조스트림 생성
			ois = new ObjectInputStream(fis);
			Object obj = ois.readObject();
			members = (ArrayList<Grade>)obj;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				ois.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
















