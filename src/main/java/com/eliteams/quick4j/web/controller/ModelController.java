package com.eliteams.quick4j.web.controller;

import com.eliteams.quick4j.web.model.Node;
import com.eliteams.quick4j.web.service.impl.NodeServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

/**
 * Created by Administrator on 2016/12/8.
 */
@Controller
@RequestMapping(value="/model")
public class ModelController {
   /**
    * 添加设备模型
    * */

     @Resource
     private NodeServiceImpl nodeServiceImpl;
     @RequestMapping(value="/addEq", method = RequestMethod.POST )
    public String CreateModel( @Valid Node node, BindingResult result,Model model, HttpServletRequest request){

         /*User u=new User();u.setUsername("chen");
         UserServiceImpl up=new UserServiceImpl();System.out.print(up.insert(u));*/
         /*System.out.println(node);
         int test=nodeServiceImpl.insert(node);
         System.out.println(test);*/


        return "conceptmodel";
    }

}
