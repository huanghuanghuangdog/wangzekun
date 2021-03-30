package cn.bdqn.Spring;

// 定义UserService
public class UserServiceImpl {
    private UserDao userDao;

    // 构造方法接收UserDao类型的对象
    public UserServiceImpl(UserDao userDao){
        this.userDao = userDao;
    }
}
