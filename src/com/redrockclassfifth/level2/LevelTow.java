package com.redrockclassfifth.level2;


public class LevelTow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bank bank=new bank();
		peopleO p1=new peopleO("a", bank);
		p1.start();
		peoplet p2=new peoplet(bank);
		Thread p3=new Thread(p2,"2");
		p3.start();

	}

}
class peopleO extends Thread{
	private bank bank;
	public peopleO(String name,bank bank) {
		super(name);
		this.bank=bank;
	}
	public void run(){
		System.out.println("取钱"+bank.getMoney(400));
	}
}
class peoplet implements Runnable{
	private bank bank;
	
	public peoplet(bank bank) {
		super();
		this.bank = bank;
	}

	public void run(){
		System.out.println("取钱"+bank.getMoney(400));
	}
}
class bank{
	private int money=500;
	//取钱的方法返回取钱的时间
	public  synchronized  int getMoney(int number){
		if(number<0){
			return -1;
		}else if(money<0){
			return -2;
		}else if(number-money >0){
			return -3;
		}else{
			try{
				Thread.sleep(1000);//模拟取钱的时间
			}catch (InterruptedException e){
				e.printStackTrace();
			}
			money-=number;
			System.out.println("余额"+money);
		}
		return number;
	}
}
