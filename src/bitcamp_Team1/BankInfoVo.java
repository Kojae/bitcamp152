package bitcamp_Team1;

public class BankInfoVo {
	static double interestRate = 0.02;	//������
	private int bankCode = 0 ;  				//������ ���� �ڵ�
	private int accountNumber = 0;				//���¹�ȣ
	private String name = "";					//�̸�
	private int contractTerm = 0;				//���ݰ�� �Ⱓ
	private int depositMoney = 0;				//�� �Աݾ� 
	
	//������ 
	
	public static double getInterestRate() {
		return interestRate;
	}
	public int getBankCode() {
		return bankCode;
	}
	public void setBankCode(int bankCode) {
		this.bankCode = bankCode;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getContractTerm() {
		return contractTerm;
	}
	public void setContractTerm(int contractTerm) {
		this.contractTerm = contractTerm;
	}
	public int getDepositMoney() {
		return depositMoney;
	}
	public void setDepositMoney(int depositMoney) {
		this.depositMoney = depositMoney;
	}
}
