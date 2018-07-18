package cn.tcse.bigdap.smartqags.web.service.impl;

import java.util.List;
import javax.annotation.Resource;

import cn.tcse.bigdap.smartqags.core.generic.GenericDao;
import cn.tcse.bigdap.smartqags.core.generic.GenericServiceImpl;
import cn.tcse.bigdap.smartqags.web.dao.RoleMapper;
import cn.tcse.bigdap.smartqags.web.model.Role;
import org.springframework.stereotype.Service;
import cn.tcse.bigdap.smartqags.core.generic.GenericDao;
import cn.tcse.bigdap.smartqags.core.generic.GenericServiceImpl;
import cn.tcse.bigdap.smartqags.web.dao.RoleMapper;
import cn.tcse.bigdap.smartqags.web.model.Role;
import cn.tcse.bigdap.smartqags.web.service.RoleService;

/**
 * 角色Service实现类
 *
 * @author StarZou
 * @since 2014年6月10日 下午4:16:33
 */
@Service
public class RoleServiceImpl extends GenericServiceImpl<Role, Long> implements RoleService {

    @Resource
    private RoleMapper roleMapper;

    @Override
    public GenericDao<Role, Long> getDao() {
        return roleMapper;
    }

    @Override
    public List<Role> selectRolesByUserId(Long userId) {
        return roleMapper.selectRolesByUserId(userId);
    }

}
