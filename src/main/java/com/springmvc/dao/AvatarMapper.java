package com.springmvc.dao;

import com.springmvc.entity.Avatar;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface AvatarMapper {
    List<Avatar> listAvatar();
}