package com.newlecture.app.util;

public class Program {

	public static void main(String[] args) {
		 IntList list = new IntList();
		 list.add(3);
		 list.add(5);
		 int size = list.size();
		 System.out.printf("size : %d\n", size); // clear하기 전 상태
		 
		 list.clear();
		 size = list.size();
		 System.out.printf("size : %d\n", size); // clear한 후 상태
		 
		 list.add(7);
		 int num = list.get(0);
		 System.out.printf("num : %d\n", num);	// 0번째 num값 출력
		 num = list.get(1);						// 1번째 값 읽기 -> 1번째 값 없음  -> IndexOutOfBoundsException 오류 발생
	} // end of main
} // end of Program

