package com.my.test;

import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.my.mods.identityCard.entity.IdentityCard;
import com.my.mods.identityCard.mapper.IdentityCardMapper;

public class Test {

    public static void main(String args[]) {
        IService<IdentityCard> service = new ServiceImpl<IdentityCardMapper, IdentityCard>();
        System.out.println(service.getBaseMapper());
    }

}
