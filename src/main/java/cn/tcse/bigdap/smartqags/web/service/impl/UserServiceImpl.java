package cn.tcse.bigdap.smartqags.web.service.impl;

import java.util.List;
import javax.annotation.Resource;

import cn.tcse.bigdap.smartqags.web.dao.UserMapper;
import org.springframework.stereotype.Service;
import cn.tcse.bigdap.smartqags.core.generic.GenericDao;
import cn.tcse.bigdap.smartqags.core.generic.GenericServiceImpl;
import cn.tcse.bigdap.smartqags.web.dao.UserMapper;
import cn.tcse.bigdap.smartqags.web.model.User;
import cn.tcse.bigdap.smartqags.web.model.UserExample;
import cn.tcse.bigdap.smartqags.web.service.UserService;

/**
 * 用户Service实现类
 *
 * @author StarZou
 * @since 2014年7月5日 上午11:54:24
 */
@Service
public class UserServiceImpl extends GenericServiceImpl<User, Long> implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public int insert(User model) {
        return userMapper.insertSelective(model);
    }

    @Override
    public int update(User model) {
        return userMapper.updateByPrimaryKeySelective(model);
    }

    @Override
    public int delete(Long id) {
        return userMapper.deleteByPrimaryKey(id);
    }

    @Override
    public User authentication(User user) {
        return userMapper.authentication(user);
    }

    @Override
    public User selectById(Long id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public GenericDao<User, Long> getDao() {
        return userMapper;
    }

    @Override
    public User selectByUsername(String username) {
        UserExample example = new UserExample();
        example.createCriteria().andUsernameEqualTo(username);
        final List<User> list = userMapper.selectByExample(example);
        return list.get(0);
    }

}
