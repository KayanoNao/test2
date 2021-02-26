package ink.zlm.yuanxing;

/**
 * @author Zhao Luming(赵路明)
 * @create 2021-01-29 上午 9:00
 */

import java.io.Serializable;

public class Attachment_2 implements Serializable {
	private String name;	//附件名

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void download() {
		System.out.println("下载附件"+name);
	}
}
