package com.dubu.service;

import com.dubu.dao.BattlerMapper;
import com.dubu.model.Battler;
import com.dubu.model.BattlerExample;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * User: dubu
 * Date: 14. 1. 2
 * Time: 오후 6:08
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/applicationContext-memMy.xml"})
public class MemMyTest {

    private static final Log log = LogFactory.getLog(MemMyTest.class);

    @Autowired
    private BattlerMapper battlerMapper;

    @Test
    public void criticaTest() {
        BattlerExample battlerExample = new BattlerExample();
        battlerExample.createCriteria().andBattleIdBetween(22197, 22203);
        List<Battler> rs = battlerMapper.selectByExample(battlerExample);
        log.error(rs);
    }

}

