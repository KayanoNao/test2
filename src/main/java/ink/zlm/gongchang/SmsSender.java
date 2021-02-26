package ink.zlm.gongchang;

/**
 * @author Zhao Luming(赵路明)
 * @create 2021-01-29 上午 9:05
 */
public class SmsSender implements Sender {

	@Override
	public void Send() {
		System.out.println("this is sms sender!");
	}
}