package bitcamp_Team1;

public class BankInfoVo {
	/**
	 * ������
	 */
	static double interestRate = 0.02;			//������
	private int bankCode = 100 ;  				//���� �ڵ�		
	private int accountCount = 001;			//���¹�ȣ ������
	private String accountNumber ="";		//���¹�ȣ
	private String name = "";					//�̸�
	private int contractTerm = 0;				//���ݰ�� �Ⱓ
	private int depositMoney = 0;				//�� �Աݾ� 
	private int totalMoney = 0;					//���� �Ѿ�
	private int interestRateMoney = 0;			//���ھ�
	private int refundAmount = 0;				//����� ȯ�޾�
	
	//������ 
	
	public String getAccountNumber() {
		return accountNumber;
	}
	/** ���¹�ȣ*/
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public static double getInterestRate() {
		return interestRate;
	}
	public int getTotalMoney() {
		return totalMoney;
	}
	/**  ���� �Ѿ�*/
	public void setTotalMoney(int totalMoney) {
		this.totalMoney = totalMoney;
	}
	public int getInterestRateMoney() {
		return interestRateMoney;
	}
	/** ���ھ� */
	public void setInterestRateMoney(int interestRateMoney) {
		this.interestRateMoney = interestRateMoney;
	}
	public int getRefundAmount() {
		return refundAmount;
	}
	/** ����� ȯ�޾� */
	public void setRefundAmount(int refundAmount) {
		this.refundAmount = refundAmount;
	}
	public int getBankCode() {
		return bankCode;
	}
	/** ���� ���� �ڵ� */
	public void setBankCode(int bankCode) {
		this.bankCode = bankCode;
	}
	public int getAccountCount() {
		return accountCount;
	}
	/**  ������ ���� �ڵ� ������ */
	public void setAccountCount(int accountCount) {
		this.accountCount += accountCount;
	}
	public String getName() {
		return name;
	}
	/** �̸� */
	public void setName(String name) {
		this.name = name;
	}
	public int getContractTerm() {
		return contractTerm;
	}
	/** ���Ⱓ */
	public void setContractTerm(int contractTerm) {
		this.contractTerm = contractTerm;
	}
	public int getDepositMoney() {
		return depositMoney;
	}
	/** �� �Աݾ� */
	public void setDepositMoney(int depositMoney) {
		this.depositMoney = depositMoney;
	}
}
