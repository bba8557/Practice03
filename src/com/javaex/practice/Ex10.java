package com.javaex.practice;

import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int sum = 0;

		for (int i = 1; i < 6; i++) {
			System.out.print("숫자: ");
			int num = sc.nextInt();
			if (num >= sum) {
				sum = num;
			}
		}
		System.out.println("최대값은 " + sum + " 입니다.");

		sc.close();
	}
}
