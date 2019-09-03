package com.design.pattern.principle.demeter;

import lombok.extern.slf4j.Slf4j;

/**
 * TeamLeader
 *
 * @author shunhua
 * @date 2019-09-03
 */
@Slf4j
public class TeamLeader {
    /**
     * 关注Member
     */
    public void findProject(){
        Member member  = new Member();
        log.info(String.valueOf(member));
    }
}