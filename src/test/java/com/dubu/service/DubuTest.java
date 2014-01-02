package com.dubu.service;

import com.dubu.dao.BattlerMapper;
import com.dubu.mem.CategoryMapper;
import com.dubu.dao.DubuMapper;
import com.dubu.model.Battler;

import com.dubu.model.BattlerExample;
import com.dubu.model.BattlerKey;
import com.dubu.model.Category;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * User: dubu
 * Date: 13. 12. 24
 * Time: 오후 5:28
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/applicationContext-test.xml"})
public class DubuTest {

    private static final Log log = LogFactory.getLog(DubuTest.class);

    @Resource private BattlerMapper battlerMapper;

    @Autowired
    private DubuMapper dubuMapper;

    @Autowired
    private CategoryMapper categoryMapper;

    @Resource
    private com.dubu.dao.mybatis.MybatisBattleMapper mybatisBattleMapper;

    /**
     * critica test
     * whre 조건식 만들기
    */
    @Test
    public void criticaTest() {
        BattlerExample battlerExample = new BattlerExample();
        battlerExample.createCriteria().andBattleIdBetween(22197, 22203);
        List<Battler> rs = battlerMapper.selectByExample(battlerExample);
        log.error(rs);
    }


    /**
     * 구현체없이  interface 로 만들기.
     */
    @Test
    public void autoGenTest() {
        //log.info("hello world");
        BattlerKey key = new BattlerKey();
        key.setBattleId(22197);
        key.setBattleRank(1);
        key.setRegdttm(new Date());
        Battler rs = battlerMapper.selectByPrimaryKey(key);
        battlerMapper.selectByPrimaryKey(new BattlerKey());
    }

    /**
     *  구현체 직접 구현하기.
     */
    @Test
    public void daoImpleTest(){
        BattlerExample battlerExample = new BattlerExample();
        battlerExample.createCriteria().andBattleIdBetween(22197, 22203);
        List<Battler> rs = mybatisBattleMapper.selectByExample(battlerExample);
        log.error(rs);
    }

    /**
     * 그냥 mapping 해서 쓰기
     */
    public void selectSimpleTest() {
        dubuMapper.selectSimple();
    }

    @Test
    /**
     * memory db test
     */
    public void memDBTest() {
        //log.info("hello world");

        List<Category> rs = categoryMapper.getCategoryList();
        log.info(rs);
    }
}
