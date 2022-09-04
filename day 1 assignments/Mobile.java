package week1.day1.assignments;


public class Mobile {

	private void makeCall()
	{
		String mobileModel="iphone";
		float mobileWeight= 0.45f;
		System.out.println("Make Call . Mobile Model:"+mobileModel+", Mobile Weight:"+mobileWeight);
	}
	private void sendMsg()
	{
        boolean fullCharged=true;
        int mobileCost=60000;
        System.out.println("Send Message. FullCharged:"+fullCharged +", Mobile Cost:"+mobileCost);
	}
    	public static void main(String[] args) {
    	   System.out.println("This is my mobile");
           Mobile obj1 = new Mobile();
           obj1.makeCall();
           obj1.sendMsg();
   
	}

}
