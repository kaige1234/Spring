package cn.com.ssm.common;

/**
 * 公共类
 */
public class Const {
    public static final String CURRENT_USER = "CURRENT_USER";
    public static final String USERNAME ="username";
    public static final String EMAIL ="email";
    public interface Role{
        int ROLE_CUSTOMER = 0;//普通用户
        int ROLE_ADMIN = 1;//管理员
    }
}
