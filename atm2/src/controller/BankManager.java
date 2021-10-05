package controller;

import java.util.Scanner;

import models.Bank;

public class BankManager {
	Scanner sc = new Scanner(System.in);
	static BankManager instance = new BankManager();
	
	Bank bank = new Bank();
	
	void printMenu() {
		System.out.println("[" + bank.name + " ATM]");
		System.out.println("[1.로그인]");
		System.out.println("[2.회원가입]");
		System.out.println("[0.종료]");
	}
	
	void run() {
		FileManager.instance.load();
		UserManager.instance.printAllUser();
		boolean loop = true;
		while(loop) {
			printMenu();
			
			System.out.print("메뉴 선택 : ");
			int sel = sc.nextInt();
			
			if(sel == 1) { login(); }
			else if(sel == 2) { join(); }
			else if(sel == 0) {
				loop = false;
			}
		}
	}
}
