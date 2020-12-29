package com.my.mods.user.service;

import com.my.common.R;
import com.my.mods.user.entity.Users;
import com.baomidou.mybatisplus.extension.service.IService;
import com.my.mods.user.vo.UserParam;
import com.my.mods.user.vo.UserVo;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Ashin
 * @since 2020-11-09
 */
public interface IUsersService extends IService<Users> {

    public R<UserVo> list(UserParam param) throws Exception;

}
