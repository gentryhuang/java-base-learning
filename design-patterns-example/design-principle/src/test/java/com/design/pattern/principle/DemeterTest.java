package com.design.pattern.principle;

import com.design.pattern.principle.demeter.Boss;
import com.design.pattern.principle.demeter.TeamLeader;
import org.junit.Test;

/**
 * DemeterTest
 *
 * @author shunhua
 * @date 2019-09-03
 */
public class DemeterTest {

    @Test
    public void test(){
        Boss boss = new Boss();
        TeamLeader teamLeader = new TeamLeader();
        boss.findProject(teamLeader);
    }

}