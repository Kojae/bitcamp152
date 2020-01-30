package bitcamp_Team1;

public class BankInfoVo {
	/**
	 * 이자율
	 */
	static double interestRate = 0.02;			//이자율
	private int bankCode = 100 ;  				//지점 코드		
	private int accountCount = 001;			//계좌번호 증가값
	private String accountNumber ="";		//계좌번호
	private String name = "";					//이름
	private int contractTerm = 0;				//적금계약 기간
	private int depositMoney = 0;				//월 입금액 
	private int totalMoney = 0;					//원금 총액
	private int interestRateMoney = 0;			//이자액
	private int refundAmount = 0;				//만기시 환급액
	
	//수정중 
	
	public String getAccountNumber() {
		return accountNumber;
	}
	/** 계좌번호*/
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public static double getInterestRate() {
		return interestRate;
	}
	public int getTotalMoney() {
		return totalMoney;
	}
	/**  원금 총액*/
	public void setTotalMoney(int totalMoney) {
		this.totalMoney = totalMoney;
	}
	public int getInterestRateMoney() {
		return interestRateMoney;
	}
	/** 이자액 */
	public void setInterestRateMoney(int interestRateMoney) {
		this.interestRateMoney = interestRateMoney;
	}
	public int getRefundAmount() {
		return refundAmount;
	}
	/** 만기시 환급액 */
	public void setRefundAmount(int refundAmount) {
		this.refundAmount = refundAmount;
	}
	public int getBankCode() {
		return bankCode;
	}
	/** 은행 지점 코드 */
	public void setBankCode(int bankCode) {
		this.bankCode = bankCode;
	}
	public int getAccountCount() {
		return accountCount;
	}
	/**  지점별 계좌 코드 증가값 */
	public void setAccountCount(int accountCount) {
		this.accountCount += accountCount;
	}
	public String getName() {
		return name;
	}
	/** 이름 */
	public void setName(String name) {
		this.name = name;
	}
	public int getContractTerm() {
		return contractTerm;
	}
	/** 계약기간 */
	public void setContractTerm(int contractTerm) {
		this.contractTerm = contractTerm;
	}
	public int getDepositMoney() {
		return depositMoney;
	}
	/** 월 입금액 */
	public void setDepositMoney(int depositMoney) {
		this.depositMoney = depositMoney;
	}
}
