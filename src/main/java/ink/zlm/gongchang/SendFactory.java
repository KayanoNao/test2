package ink.zlm.gongchang;

/**
 * @author Zhao Luming(赵路明)
 * @create 2021-01-29 上午 9:06
 */
public class SendFactory {

	public Sender produce(String type) {
		if ("mail".equals(type)) {
			return new MailSender();
		} else if ("sms".equals(type)) {
			return new SmsSender();
		} else {
			System.out.println("请输入正确的类型!");
			return null;
		}
	}
}
