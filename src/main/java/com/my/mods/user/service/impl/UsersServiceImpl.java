package com.my.mods.user.service.impl;

import com.my.common.R;
import com.my.mods.user.entity.Users;
import com.my.mods.user.mapper.UsersMapper;
import com.my.mods.user.service.IUsersService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.my.mods.user.vo.UserParam;
import com.my.mods.user.vo.UserVo;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Ashin
 * @since 2020-11-09
 */
@Service
public class UsersServiceImpl extends ServiceImpl<UsersMapper, Users> implements IUsersService {

    @Override
    public R<UserVo> list(UserParam param) throws Exception {
        this.list();
        return R.ok();
    }
}
