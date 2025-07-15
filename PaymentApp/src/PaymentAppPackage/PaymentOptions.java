package PaymentAppPackage;

import java.util.HashMap;
import java.util.Map;

public class PaymentOptions 
{
	private static final Map<Integer,Payment>payOptions=new HashMap<>();
	static
	{
		payOptions.put(1, new DebitCardPayment());
		payOptions.put(2, new CreditCardPayment());
		payOptions.put(3, new UpiPayment());
		payOptions.put(4, new NetBankingPayment());
		payOptions.put(5, new CashPayment());
	}
	
	public static Payment getPayment(int options)
	{
		return payOptions.get(options);
	}

}
