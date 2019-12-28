package day1.classroom;
public class Mobile {
	
	public int makeCall(int num)
	{
		//System.out.println(num);
		return num;
	}
	
	public String sendSMS()
	{
		System.out.println("SendSMS");
		return "sendSMS";
	}
	
	public void shutDown() 
	{
		System.out.println("system is shutDown");
	}
	
	public static void main(String[] args)
		{		
		Mobile calls = new Mobile();
		int number = calls.makeCall(3453453);
		System.out.println(number);
		//System.out.println(calls.makeACall());
		calls.sendSMS();
		calls.shutDown();
	}

}