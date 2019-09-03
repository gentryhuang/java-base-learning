package com.design.pattern.principle.demeter;

/**
 * Boss
 *
 * @author shunhua
 * @date 2019-09-03
 */
public class Boss {
    /**
     * 对Member不需要见，只关心TeamLeader
     * @param teamLeader
     */
    public void findProject(TeamLeader teamLeader){
        teamLeader.findProject();
    }
}