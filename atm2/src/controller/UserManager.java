package controller;

import java.util.Random;
import java.util.Scanner;

import Lv8test.Account;
import models.User;

public class UserManager {

	static UserManager instance = new UserManager();
	
	Scanner sc = new Scanner(System.in);
	Random rn = new Random();
	
	static final int ACC_MAX_CNT = 3;			// 최대 개설 가능한 계좌 수
	User[] user = null;							// 전체 회원정보
	int userCnt = 0;							// 전체 회원 수

	void setAccount() {
		String[] ids = {"aa", "bb", "cc", "dd", "ee"};
		String[] pws = {"0111", "0222",     "0333",   "0444",    "0555"};
		int[] money   = { 87000,  12000,      49000,    34000,    128000};
		int[] accs   = { 10000,  20000     ,  30000  ,  400000  ,50000 };
		
		userCnt = 5;
		user = new User[userCnt];
		for(int i=0; i<userCnt; i++) {
			user[i] = new User();
			user[i].id = ids[i];
			user[i].pw = pws[i];

		}
}
