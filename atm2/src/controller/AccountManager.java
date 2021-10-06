package controller;

import java.util.Random;
import java.util.Scanner;

import Lv8test.User;
import Lv8test.UserManager;

public class AccountManager {

	static AccountManager instance = new AccountManager();
	Scanner sc = new Scanner(System.in);
	Random rn = new Random();
	
	//계좌번호 생성 (중복금지)
	void createAcc(int log) {
		int cnt = UserManager.instance.user[log].accCnt;
		
		if(cnt == 3) {
			System.out.println("[메세지] 계좌개설은 3개까지만 가능합니다.");
			return;
		}
		
		UserManager.instance.user[log].acc[cnt] = new Account();
		
		boolean result = true;
		int account = 0;
		while(result) {
			account = rn.nextInt(90000) + 10000;
		}
	}

	//계좌조회
		void printAcc(int log) {
			User temp = UserManager.instance.user[log];
			System.out.println("ID : " + temp.id);
			System.out.println("PW : " + temp.pw);
			for(int i=0;i<)

