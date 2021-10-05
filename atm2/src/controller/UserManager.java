package controller;

import java.util.Random;
import java.util.Scanner;

import models.User;

public class UserManager {

	static UserManager instance = new UserManager();
	
	Scanner sc = new Scanner(System.in);
	Random rn = new Random();
	
	static final int ACC_MAX_CNT = 3;			// 최대 개설 가능한 계좌 수
	User[] user = null;							// 전체 회원정보
	int userCnt = 0;							// 전체 회원 수

}
