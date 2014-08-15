
public class ExceptionA extends Exception{
    public ExceptionA(String sms)
	{
	    super("Exception is from ExceptionA" + sms);
	}
}