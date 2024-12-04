package kr.or.iei.point.dao;

import java.util.ArrayList;

import kr.or.iei.point.vo.Gold;
import kr.or.iei.point.vo.Grade;
import kr.or.iei.point.vo.Silver;
import kr.or.iei.point.vo.Vip;

public class PointDao {
	ArrayList<Grade> members;

	public PointDao() {
		super();
		members = new ArrayList<Grade>();
		
		members.add(new Silver("silver","회원1",1000));
		members.add(new Silver("silver","회원2",2000));
		members.add(new Gold("gold", "회원3", 1000));
		members.add(new Gold("gold", "회원4", 2000));
		members.add(new Vip("vip", "회원5", 1000));
		members.add(new Vip("vip", "회원6", 2000));
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
	}
	public void deleteMember(int searchIndex) {
		members.remove(searchIndex);
	}
	
	public boolean deleteMember(String name) {
		int searchIndex = searchMember(name);
		if(searchIndex == -1) {
			return false;
		}else {
			members.remove(searchIndex);
			return true;
		}
	}
}
















