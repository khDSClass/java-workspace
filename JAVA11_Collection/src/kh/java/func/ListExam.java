package kh.java.func;

import java.util.ArrayList;
import java.util.Scanner;

public class ListExam {
	ArrayList<String> cache;
	public ListExam() {
		super();
		cache = new ArrayList<String>();
	}
	public void lru() {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("캐시의 크기를 입력하세요(0~30) : ");
		int cacheSize = sc.nextInt();
//		String [] arr = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"};
//		String [] arr = {"Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul"};
//		String [] arr = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome"};
//		String [] arr = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome"};
//		String [] arr = {"Jeju", "Pangyo", "NewYork", "newyork"};
		String [] arr = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA"};
		int time = 0;
		if(cacheSize == 0) {
			time = 5*arr.length;
		}else {
			for(int i=0;i<arr.length;i++) {
				String str = arr[i].toLowerCase();
				//중복체크
				int searchIndex = cache.indexOf(str);
				if(searchIndex == -1) {
					time += 5;
					if(cache.size() == cacheSize) {
						cache.remove(0);
					}
					cache.add(str);
				}else {
					time += 1;
					cache.remove(searchIndex);
					cache.add(str);
				}
				System.out.println(cache);
			}
		}
		
		System.out.println("총 수행 시간 : "+time);
		
	}
	
	public void kakaoMap1() {
		int n = 5;
		int[] arr1 = {9,20,28,18,11};
		int[] arr2 = {30,1,21,17,28};
		ArrayList<ArrayList<Boolean>> map1 = new ArrayList<ArrayList<Boolean>>();
		ArrayList<ArrayList<Boolean>> map2 = new ArrayList<ArrayList<Boolean>>();
		for(int i=0;i<n;i++) {
			//String str1 = Integer.toBinaryString(arr1[i]);
			int num = arr1[i];
			String str2 = Integer.toBinaryString(arr2[i]);
			ArrayList<Boolean> numList1 = new ArrayList<Boolean>();
			ArrayList<Boolean> numList2 = new ArrayList<Boolean>();
			for(int j=0;j<n;j++) {
				if(num%2 == 1) {
					numList1.add(0,true);
				}else {
					numList1.add(0,false);
				}
				num /= 2;
			}
			/*
			for(int j=0;j<str1.length();j++) {
				char ch = str1.charAt(j);
				numList1.add(ch=='1');
				//numList1.add(ch=='1'?true:false);
				
				if(ch == '1') {
					numList1.add(true);
				}else {
					numList1.add(false);
				}
				
			}
			*/
			
			while(numList1.size() != n) {
				numList1.add(0,false);
			}
			
			for(int j=0;j<str2.length();j++) {
				char ch = str2.charAt(j);
				numList2.add(ch=='1');
			}
			while(numList2.size() != n) {
				numList2.add(0,false);
			}
			map1.add(numList1);
			map2.add(numList2);
		}
		
		for(int i=0;i<map1.size();i++) {
			ArrayList<Boolean> list = map1.get(i);
			for(int j=0;j<list.size();j++) {
				boolean b = list.get(j);
				System.out.print(b?"#":" ");
			}
			System.out.println();
		}
		System.out.println("---------------------------------------------");
		for(ArrayList<Boolean> list : map2) {
			for(boolean b : list) {
				System.out.print(b?"#":" ");
			}
			System.out.println();
		}
		System.out.println("---------------------------------------------");
		for(int i=0;i<n;i++) {
			ArrayList<Boolean> list1 = map1.get(i);
			ArrayList<Boolean> list2 = map2.get(i);
			for(int j=0;j<n;j++) {
				System.out.print(list1.get(j) || list2.get(j)?"#":" ");
			}
			System.out.println();
		}
	}
	
}













