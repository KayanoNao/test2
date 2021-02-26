package ink.zlm.daili;

/**
 * @author Zhao Luming(赵路明)
 * @create 2021-01-29 上午 9:10
 */
/**
 * 接口实现
 * 目标对象
 */
public class UserDao implements IUserDao {
	public void save() {
		System.out.println("----已经保存数据!----");
	}
}
