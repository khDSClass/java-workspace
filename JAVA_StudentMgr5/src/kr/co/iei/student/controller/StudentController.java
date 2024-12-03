package kr.co.iei.student.controller;

import java.util.Scanner;

import kr.co.iei.student.dao.StudentDao;

public class StudentController {
	Scanner sc;
	//컨트롤러가 데이터가 필요하면 dao를 통해서 데이터를 가져오거나 편집
	StudentDao dao;

	public StudentController() {
		super();
		sc = new Scanner(System.in);
		dao = new StudentDao();
	}
	
}
