package bitcamp_Team1;

import java.util.ArrayList;
import java.util.Scanner;

public class BankInfo{
	

	public BankInfoVo inputUserInfo() {
		Scanner scanner = new Scanner(System.in);
		BankInfoVo bankInfo = new BankInfoVo();
		System.out.println("이름을 입력해주세요");
		bankInfo.setName(scanner.nextLine());
		
		return bankInfo;
	}
	
	public void method() {
	BankInfo bankInfo = new BankInfo();
	ArrayList<BankInfo> a = new ArrayList<BankInfo>();
	a.add(bankInfo);
		for(int i = 0 ; i<a.size(); i++) {
		System.out.println(i);
		
		}
	}
	//수정중
}
