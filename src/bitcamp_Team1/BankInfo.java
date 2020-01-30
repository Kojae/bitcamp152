package bitcamp_Team1;

import java.util.ArrayList;
import java.util.Scanner;

public class BankInfo {

	BankInfoVo bankInfo = new BankInfoVo();     	// 전역변수
	public Object method() {						//정의해 놓은 모든 method실행, 재귀로 return	
		Scanner scanner = new Scanner(System.in);
		bankInfo = inputUserInfo(bankInfo);
		ArrayList<BankInfoVo> arr = new ArrayList<BankInfoVo>();
		
		if(checkYn()) {
		System.out.println("들어옴");
		arr.add(bankInfo);
		}
		System.out.println("array get0 \n"+arr.get(0));
		for (int i = 0; i < arr.size(); i++) {
			output(arr.get(i));
			System.out.println("어레이 사이즈"+arr.size());
		}
		
		System.out.println("\n\n 더 입력하시겠습니까 ? ");
		String ys = scanner.nextLine().toUpperCase();
		
		return ys.equals("Y") ? method() : null;
	}
	
//	System.out.println("\n------은행 정보 시스템 : 전체 고객 출력 -------\n\n계좌번호 \t 이름 \t 월입금액 \t 기간(년) \t 이율 \t 원금"+
//	"\t 이자액 \t 만기시 환급액");
	public void output(BankInfoVo bankInfoVo) {
		System.out.println("\n\n계좌번호 \t 이름 \t 월입금액 \t 기간(년) \t 이율 \t 원금"+
					"\t 이자액 \t 만기시 환급액");
		System.out.println(bankInfoVo.toString());
	}
	
	public boolean checkYn() {
		System.out.println("가입하시겠습니까 ? ");
		Scanner scanner = new Scanner(System.in);
		String ys=scanner.nextLine();
		
		return ys.toUpperCase().equals("Y") ? true : false;
		
	}
	
	public BankInfoVo inputUserInfo(BankInfoVo bankInfo) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름을 입력해주세요");
		bankInfo.setName(scanner.nextLine());
		System.out.println("몇년동안 적금하실건가요 ? ");
		bankInfo.setContractTerm(scanner.nextInt());
		System.out.println("월 입금액은 얼마 ? ");
		bankInfo.setAccountCount(bankInfo.getAccountCount()+1);
		bankInfo.setDepositMoney(scanner.nextInt());
		bankInfo.setTotalMoney(bankInfo.getDepositMoney()*bankInfo.getContractTerm()*12);
		bankInfo.setInterestRateMoney((int)(bankInfo.getTotalMoney()*BankInfoVo.interestRate ));
		bankInfo.setRefundAmount(bankInfo.getTotalMoney()+bankInfo.getInterestRateMoney());
	
		return bankInfo;
	}
	// 수정중
}
