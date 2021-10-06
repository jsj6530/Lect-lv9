package controller;

import java.util.Random;
import java.util.Scanner;

import Lv8test.UserManager;
import models.Account;

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
			result = UserManager.instance.getCheckAcc(account);
		}
		UserManager.instance.user[log].acc[cnt].number = account;
		UserManager.instance.user[log].accCnt += 1;
	}
		}
		
	}
	


