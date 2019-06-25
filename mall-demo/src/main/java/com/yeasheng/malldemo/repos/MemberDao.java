package com.yeasheng.malldemo.repos;

import com.yeasheng.malldemo.entity.MemberEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Desc:
 * @author: yansheng
 * @date: 2019/6/16
 */
@Repository
public interface MemberDao extends JpaRepository<MemberEntity,Integer>{
}

