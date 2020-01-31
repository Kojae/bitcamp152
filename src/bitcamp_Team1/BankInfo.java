package bitcamp_Team1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BankInfo {

	List<BankInfoVo> arr = new ArrayList<BankInfoVo>();
	int count=0;
	public void method() {						
		Scanner scanner = new Scanner(System.in);
		if(checkYn()) {
		BankInfoVo bankInfo = inputUserInfo();
		arr.add(bankInfo);
		}
		output(arr.get(arr.size()-1));
		System.out.println("\n\n 더 입력하시겠습니까 ? ");
		String ys = scanner.nextLine().toUpperCase();
		
		if(ys.equals("Y")) {
			method();
		}else {
			System.out.println("\n--------------전체 고객 정보 출력--------------");
			for(int i =0 ; i<arr.size(); i++) {
				output(arr.get(i));
			}
		}
	}
	
	public void output(BankInfoVo bankInfoVo) {
		System.out.println("\n계좌번호 \t 이름 \t 월입금액 \t 기간(년)\t이율 \t 원금 "+
					"\t이자액 \t  만기시 환급액");
		System.out.println(bankInfoVo.toString());
	}
	
	public boolean checkYn() {
		System.out.println("가입하시겠습니까 ? ");
		Scanner scanner = new Scanner(System.in);
		String ys=scanner.nextLine();
		
		return ys.toUpperCase().equals("Y") ? true : false;
		
	}
	
	public BankInfoVo inputUserInfo() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("이름을 입력해주세요");
		String name = scanner.nextLine();
		System.out.println("몇년동안 적금하실건가요? ? ");
		int term = scanner.nextInt();
		System.out.println("월 입금액은 얼마로 하시겠습니까? ? ");
		int depositMoeny =scanner.nextInt();
		
		BankInfoVo bankInfo = new BankInfoVo(name,term,depositMoeny,Integer.toString(arr.size()));
	
		return bankInfo;
	}
//	public BankInfoVo inputUserInfo() {
//		BankInfoVo bankInfo = new BankInfoVo(); 
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("이름을 입력해주세요");
//		bankInfo.setName(scanner.nextLine());
//		System.out.println("몇년동안 적금하실건가요? ? ");
//		bankInfo.setContractTerm(scanner.nextInt());
//		System.out.println("월 입금액은 얼마로 하시겠습니까? ? ");
//		bankInfo.setAccountCount(bankInfo.getAccountCount()+1);
//		bankInfo.setDepositMoney(scanner.nextInt());
//		bankInfo.setTotalMoney(bankInfo.getDepositMoney()*bankInfo.getContractTerm()*12);
//		bankInfo.setInterestRateMoney((int)(bankInfo.getTotalMoney()*BankInfoVo.interestRate ));
//		bankInfo.setRefundAmount(bankInfo.getTotalMoney()+bankInfo.getInterestRateMoney());
//	
//		return bankInfo;
//	}
}
