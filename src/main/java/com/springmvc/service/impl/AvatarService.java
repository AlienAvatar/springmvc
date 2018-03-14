package com.springmvc.service.impl;

import com.springmvc.dao.AvatarMapper;
import com.springmvc.entity.Avatar;
import com.springmvc.service.IAvatarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AvatarService implements IAvatarService {

    @Autowired
    private AvatarMapper avatarMapper;

    public List<Avatar> listAvatar() {
        List<Avatar> result = avatarMapper.listAvatar();
        return result;
    }
}
