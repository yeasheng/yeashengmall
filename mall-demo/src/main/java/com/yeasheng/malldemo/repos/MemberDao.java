package com.yeasheng.malldemo.repos;

import com.yeasheng.malldemo.entity.MemberEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Desc:
 * @author: yansheng
 * @date: 2019/6/16
 */
public interface MemberDao extends JpaRepository<MemberEntity,Integer>{
}

