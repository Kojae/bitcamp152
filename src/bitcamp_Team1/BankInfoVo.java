package bitcamp_Team1;

public class BankInfoVo {
	static double interestRate = 0.02;	//이자율
	private int bankCode = 0 ;  				//지점별 계좌 코드
	private int accountNumber = 0;				//계좌번호
	private String name = "";					//이름
	private int contractTerm = 0;				//적금계약 기간
	private int depositMoney = 0;				//월 입금액 
	
	//수정중 
	
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
