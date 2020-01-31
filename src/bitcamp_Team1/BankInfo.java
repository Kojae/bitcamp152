package bitcamp_Team1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BankInfo {

	List<BankInfoVo> arr = new ArrayList<BankInfoVo>();
	int count=0;
	
	public void method() {						
		Scanner scanner = new Scanner(System.in);
		arr.add(inputUserInfo());
		arr.removeAll(Collections.singleton(null));
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
	
	public BankInfoVo inputUserInfo() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("이름을 입력해주세요");
		String name = scanner.nextLine();
		System.out.println("몇년동안 적금하실건가요? ? ");
		int term = scanner.nextInt();
		System.out.println("월 입금액은 얼마로 하시겠습니까? ? ");
		int depositMoeny =scanner.nextInt();
		int total=depositMoeny*term*12;
		int interestRateMoney = (int)(total*BankInfoVo.interestRate);
		int refundAmount = total+interestRateMoney;
		
		System.out.println(name+"님의 예상 금액은       원금 : "+total+"원, 만기시 금액  : 이율 "+
		(int)(BankInfoVo.getInterestRate()*100) +"% --> "+total+
				" + "+interestRateMoney+" = "+refundAmount+" 원 입니다 \n ");
		
		if(checkYn()) {
		BankInfoVo bankInfo = new BankInfoVo(name,term,depositMoeny,total,interestRateMoney,
				refundAmount,Integer.toString(arr.size()));
		return bankInfo;
		}else{
		 return null;
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
	


}
