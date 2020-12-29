package com.my.mods.identityCard.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.my.mods.identityCard.entity.IdentityCard;
import com.my.mods.identityCard.mapper.IdentityCardMapper;
import com.my.mods.identityCard.service.IIdentityCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IdentityCardServiceImpl extends ServiceImpl<IdentityCardMapper, IdentityCard>
        implements IIdentityCardService {

    private IdentityCardMapper mapper;

    @Autowired
    public void setMapper(IdentityCardMapper mapper) {
        this.mapper = mapper;
    }
}
