package cn.tcse.bigdap.smartqags.web.service.impl;

import java.util.List;
import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import cn.tcse.bigdap.smartqags.core.generic.GenericDao;
import cn.tcse.bigdap.smartqags.core.generic.GenericServiceImpl;
import cn.tcse.bigdap.smartqags.web.dao.PermissionMapper;
import cn.tcse.bigdap.smartqags.web.model.Permission;
import cn.tcse.bigdap.smartqags.web.service.PermissionService;

/**
 * 权限Service实现类
 *
 * @author StarZou
 * @since 2014年6月10日 下午12:05:03
 */
@Service
public class PermissionServiceImpl extends GenericServiceImpl<Permission, Long> implements PermissionService {

    @Resource
    private PermissionMapper permissionMapper;


    @Override
    public GenericDao<Permission, Long> getDao() {
        return permissionMapper;
    }

    @Override
    public List<Permission> selectPermissionsByRoleId(Long roleId) {
        return permissionMapper.selectPermissionsByRoleId(roleId);
    }
}
