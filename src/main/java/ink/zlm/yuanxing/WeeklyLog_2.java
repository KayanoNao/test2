package ink.zlm.yuanxing;

/**
 * @author Zhao Luming(赵路明)
 * @create 2021-01-29 上午 9:02
 */
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;

public class WeeklyLog_2 implements Serializable{

	private Attachment_2 attachment;
	private String date;
	private String name;
	private String content;
	public Attachment_2 getAttachment() {
		return attachment;
	}
	public void setAttachment(Attachment_2 attachment) {
		this.attachment = attachment;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	//通过序列化进行深克隆
	public WeeklyLog_2 deepclone() throws Exception {
		//将对象写入流中,
		ByteArrayOutputStream bao = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(bao);
		oos.writeObject(this);
		//将对象取出来
		ByteArrayInputStream bi = new ByteArrayInputStream(bao.toByteArray());
		ObjectInputStream ois = new ObjectInputStream(bi);
		return (WeeklyLog_2)ois.readObject();


	}
}
