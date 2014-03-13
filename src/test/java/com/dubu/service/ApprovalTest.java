package com.dubu.service;

import com.dubu.dao.ApprovalMapper;
import com.dubu.model.Approval;
import com.dubu.model.ApprovalExample;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * User: dubu9
 * Date: 14. 3. 13
 * Time: 오후 4:07
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/applicationContext-test.xml"})
public class ApprovalTest {

    private static final Log log = LogFactory.getLog(ApprovalTest.class);

    @Resource
    private ApprovalMapper approvalMapper;

    @Test
    public void select() {
        Approval rs = approvalMapper.selectByPrimaryKey(1);
        log.info(rs);
    }

    @Test
    public void catiaTest() {
        ApprovalExample where = new ApprovalExample();
//        where.createCriteria().andApprovalidEqualTo(5);
//        where.createCriteria().andApprovalidBetween(2, 5);
        where.createCriteria().andServicecdEqualTo("C9").andBicartseqBetween(88507L,88509L);
        List<Approval> rs =  approvalMapper.selectByExample(where);
    }


    @Test
    public void updateTest(){
        Approval approval = new Approval();
        approval.setApprovalstatcd("X");
        approval.setBiflatform("papper");

        ApprovalExample where = new ApprovalExample();
        where.createCriteria().andServicecdEqualTo("C9").andBicartseqBetween(88507L,88509L);

        approvalMapper.updateByExampleSelective(approval,where);
    }
}
