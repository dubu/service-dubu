package com.dubu.dao.mybatis;

import com.dubu.dao.BattlerMapper;
import com.dubu.model.Battler;
import com.dubu.model.BattlerExample;
import com.dubu.model.BattlerKey;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * User: dubu
 * Date: 13. 12. 30
 * Time: 오후 5:47
 */

public class MybatisBattleMapper extends SqlSessionDaoSupport implements BattlerMapper{

    public int countByExample(BattlerExample example) {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public int deleteByExample(BattlerExample example) {

        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public int deleteByPrimaryKey(BattlerKey key) {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public int insert(Battler record) {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public int insertSelective(Battler record) {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public List<Battler> selectByExample(BattlerExample example) {

        List<Battler>  rs = getSqlSession().selectList("com.dubu.dao.BattlerMapper.selectByExample", example);
        return null;
    }

    public Battler selectByPrimaryKey(BattlerKey key) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public int updateByExampleSelective(Battler record, BattlerExample example) {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public int updateByExample(Battler record, BattlerExample example) {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public int updateByPrimaryKeySelective(Battler record) {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public int updateByPrimaryKey(Battler record) {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
