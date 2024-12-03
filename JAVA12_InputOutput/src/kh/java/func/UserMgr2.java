package kh.java.func;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class UserMgr2 {
	//ArrayList, User모두 Serializable을 구현한 상태여야 내보내기가 가능
	ArrayList<User> members;
	Scanner sc;	
	public UserMgr2() {
		super();
		importUser();
		sc = new Scanner(System.in);
	}
	public void main() {
		while(true) {
			System.out.println("1. 유저 정보 등록");
			System.out.println("2. 유저 전체 출력");
			//System.out.println("3. 데이터 내보내기");//backup2.txt파일로 내보내기
			//System.out.println("4. 데이터 불러오기");//backup2.txt파일에서 불러오기
			System.out.print("선택 >> ");
			int select = sc.nextInt();
			switch(select) {
			case 1:
				insertUser();
				break;
			case 2:
				printAllUser();
				break;
			case 3:
				exportUser();
				System.out.println("내보내기 완료");
				break;
			case 4:
				importUser();
				System.out.println("불러오기 완료");
				break;
			}
			
		}
	}
	
	public void insertUser() {
		User u = new User();
		System.out.print("아이디 입력 : ");
		String id = sc.next();
		u.setId(id);
		System.out.print("비밀번호 입력 : ");
		u.setPw(sc.next());
		System.out.print("이름 입력 : ");
		u.setName(sc.next());
		System.out.print("나이 입력 : ");
		u.setAge(sc.nextInt());
		members.add(u);
		System.out.println("회원 등록 완료!");
		exportUser();
	}
	
	public void printAllUser() {
		System.out.println("아이디\t비밀번호\t이름\t나이");
		for(User u : members) {
			System.out.println(u.getId()+"\t"+u.getPw()+"\t"+u.getName()+"\t"+u.getAge());
		}
	}
	
	public void exportUser() {
		//자원반환 할 보조스트림 생성
		ObjectOutputStream oos = null;
		
		try {
			//1. 파일을 내보낼 주스트림 생성
			FileOutputStream fos = new FileOutputStream("backup2.txt");
			//만들어진 주스트림으로 보조스트림 생성
			oos = new ObjectOutputStream(fos);
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
	public void importUser() {
		File file = new File("backup2.txt");
		if(!file.exists()) {
			return;
		}
		//파일을 읽어오기위한 보조스트림 선언
		ObjectInputStream ois = null;
		
		try {
			//1. 주스트림 생성
			FileInputStream fis = new FileInputStream(file);
			//주스트림이용해서 보조스트림 생성
			ois = new ObjectInputStream(fis);
			//2. 메소드 이용해서 데이터 불러오기
			Object obj = ois.readObject();
			members = (ArrayList<User>)obj;
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
				//3. 자원반환
				ois.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}




