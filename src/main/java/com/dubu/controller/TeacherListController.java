package com.dubu.controller;

import com.dubu.dao.BattlerMapper;
import com.dubu.dao.RankerMapper;
import com.dubu.model.*;
import org.apache.ibatis.binding.BindingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * User: dubu
 * Date: 13. 12. 30
 * Time: 오후 7:18
 */
@Controller
@RequestMapping("teacher")
public class TeacherListController {
    @Resource
    private BattlerMapper battlerMapper;

    @Autowired
    private RankerMapper rankerMapper;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public void list(Model model) {

        BattlerExample battlerExample = new BattlerExample();
        battlerExample.createCriteria().andBattleIdBetween(22197, 22203);
        List<Battler> rankList = battlerMapper.selectByExample(battlerExample);

        //gen 보기
//        Map cityMap = new LinkedHashMap();
//        cityMap.put(true, "London");
//        cityMap.put(false, "Paris");
        //cityMap.put(3, "New York");

        // select type 설정
        Map<Object, String> map = new HashMap<Object, String>();
        for (BloodType o : BloodType.class.getEnumConstants()) {
            map.put(o.ordinal(), o.name());
        }
        model.addAttribute("cityMap", map);


//        model.addAttribute("rankList", personRankingService.findListWithPersonalInfo(cpId, domain, gender, paging));
//        model.addAttribute("paging", paging);
//        model.addAttribute("genderList", Gender.values());
//        model.addAttribute("cpList", cpService.findListHasTeacher());
//        model.addAttribute("rankTypeList", PersonRatingType.values());
//        model.addAttribute("currentCp", cpId);
//        model.addAttribute("currentDomain", domain);
//        model.addAttribute("currentGender", gender);

        model.addAttribute("rankList", rankList);
    }


    @RequestMapping(value = "/form", method = RequestMethod.GET)
    public String create(Model model) {

        model.addAttribute("ranker", new Ranker());
        return "/teacher/form";
    }

    @RequestMapping(value = "/form/{id}", method = RequestMethod.GET)
    public String modify(Model model ,@PathVariable Integer id ) {
        //new or modify
        RankerExample rankerExample = new RankerExample();
        RankerKey key = new RankerKey() ;
        key.setMzUserId(id);
        key.setTournamentId(56);
        Ranker ranker = rankerMapper.selectByPrimaryKey(key);
        if(ranker == null) ranker = new Ranker();
        model.addAttribute("ranker", ranker);
        return "/teacher/form";
    }

    @RequestMapping(value = "/form", method = RequestMethod.POST)
    public ModelAndView save(@Valid Ranker recoder , BindingResult bindingResult) {


        if(bindingResult.hasErrors()){

            return new ModelAndView("/teacher/form" ).addObject("exception", new BindException(bindingResult).getAllErrors().get(0).getDefaultMessage());
            //throw new BindException(bindingResult);

        }

       // 처음이냐 수정이냐 판별이 필요하다.


       if(recoder != null){

           rankerMapper.updateByPrimaryKey(recoder);
       }

        return new ModelAndView("redirect:form/"+recoder.getMzUserId() );
    }



    // 이거 따로 뺄 수있다.
    public enum BloodType {
        A(1, "A형"),
        B(2, "B형"),
        AB(3, "AB형"),
        O(4, "O형"),
        Z(5, "Z형");
        private BloodType(int a, String b) {
        }
    }

}
