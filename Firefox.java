
public class Firefox {

	public static void main(String[] args)
	{
		String mobile = "iphone 15 Pro Max";
		int battery = 4000;
		char category = 'a';  //For a Second handmobile we select by category
		float offerprice =33456.5565f;
		double actualprice = 35444.2323232342d;
		long imei =6566434367666l;
		boolean isChargeravailable = true;
		System.out.println("Mobile Name : " + mobile);
		System.out.println("Battery Capacity : " + battery + " mah");
		System.out.println("Condition : " + category);
		System.out.println("Actual Price : " + actualprice);
		System.out.println("Final Price : " + offerprice);
		System.out.println("IMEI Number : " + imei);
		System.out.println("Chargeravailable : " + isChargeravailable);
		
		System.out.println(mobile + " " + battery  + " " +category + " " + offerprice + " " +imei);//concat
	}

}
