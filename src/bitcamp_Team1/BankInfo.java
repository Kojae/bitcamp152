package bitcamp_Team1;

import java.util.ArrayList;
import java.util.Scanner;

public class BankInfo {

	BankInfoVo bankInfo = new BankInfoVo();     	// ��������
	public Object method() {						//������ ���� ��� method����, ��ͷ� return	
		Scanner scanner = new Scanner(System.in);
		bankInfo = inputUserInfo(bankInfo);
		ArrayList<BankInfoVo> arr = new ArrayList<BankInfoVo>();
		
		if(checkYn()) {
		System.out.println("����");
		arr.add(bankInfo);
		}
		System.out.println("array get0 \n"+arr.get(0));
		for (int i = 0; i < arr.size(); i++) {
			output(arr.get(i));
			System.out.println("��� ������"+arr.size());
		}
		
		System.out.println("\n\n �� �Է��Ͻðڽ��ϱ� ? ");
		String ys = scanner.nextLine().toUpperCase();
		
		return ys.equals("Y") ? method() : null;
	}
	
//	System.out.println("\n------���� ���� �ý��� : ��ü �� ��� -------\n\n���¹�ȣ \t �̸� \t ���Աݾ� \t �Ⱓ(��) \t ���� \t ����"+
//	"\t ���ھ� \t ����� ȯ�޾�");
	public void output(BankInfoVo bankInfoVo) {
		System.out.println("\n\n���¹�ȣ \t �̸� \t ���Աݾ� \t �Ⱓ(��) \t ���� \t ����"+
					"\t ���ھ� \t ����� ȯ�޾�");
		System.out.println(bankInfoVo.toString());
	}
	
	public boolean checkYn() {
		System.out.println("�����Ͻðڽ��ϱ� ? ");
		Scanner scanner = new Scanner(System.in);
		String ys=scanner.nextLine();
		
		return ys.toUpperCase().equals("Y") ? true : false;
		
	}
	
	public BankInfoVo inputUserInfo(BankInfoVo bankInfo) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("�̸��� �Է����ּ���");
		bankInfo.setName(scanner.nextLine());
		System.out.println("��⵿�� �����Ͻǰǰ��� ? ");
		bankInfo.setContractTerm(scanner.nextInt());
		System.out.println("�� �Աݾ��� �� ? ");
		bankInfo.setAccountCount(bankInfo.getAccountCount()+1);
		bankInfo.setDepositMoney(scanner.nextInt());
		bankInfo.setTotalMoney(bankInfo.getDepositMoney()*bankInfo.getContractTerm()*12);
		bankInfo.setInterestRateMoney((int)(bankInfo.getTotalMoney()*BankInfoVo.interestRate ));
		bankInfo.setRefundAmount(bankInfo.getTotalMoney()+bankInfo.getInterestRateMoney());
	
		return bankInfo;
	}
	// ������
}
