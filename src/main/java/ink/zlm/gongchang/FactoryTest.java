package ink.zlm.gongchang;

/**
 * @author Zhao Luming(赵路明)
 * @create 2021-01-29 上午 9:06
 */
public class FactoryTest {

	public static void main(String[] args) {
		SendFactory factory = new SendFactory();
		Sender sender = factory.produce("sms");
		sender.Send();
		Sender sender2 = factory.produce("mail");
		sender2.Send();
	}
}
