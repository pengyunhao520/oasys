package cn.gson.oasys.controller.user;

import cn.gson.oasys.model.dao.user.UnitDao;
import cn.gson.oasys.model.entity.user.Unit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * 单位管理
 */
@Controller
@RequestMapping("/")
public class UnitController {

    @Autowired
    private UnitDao unitDao;

    /**
     * 单位管理主界面
     * @param model
     * @return
     */
    @RequestMapping("unitmanage")
    public String unitManage(Model model) {
        List<Unit> units = (List<Unit>) unitDao.findAll();
        System.out.println(units);
        model.addAttribute("units",units);
        return "user/unitmanage";
    }

    /**
     * 添加和修改
     * @param unit
     * @param xg
     * @param br
     * @param model
     * @return
     */
    @RequestMapping(value = "unitedit" ,method = RequestMethod.POST)
    public String addunit(@Valid Unit unit, @RequestParam("xg") String xg, BindingResult br, Model model){
        System.out.println(br.hasErrors());
        System.out.println(br.getFieldError());
        if(!br.hasErrors()){
            System.out.println("没有错误");
            Unit addunit = unitDao.save(unit);
            if(addunit!=null){
                System.out.println("插入成功");
                model.addAttribute("success",1);
                return "/unitmanage";
            }
        }
        System.out.println("有错误");
        model.addAttribute("errormess","错误！~");
        return "user/unitedit";
    }

    /**
     * 显示页面
     * @param unitId
     * @param model
     * @return
     */
    @RequestMapping(value = "unitedit" ,method = RequestMethod.GET)
    public String changeUnit(@RequestParam(value = "unit",required=false)Long unitId,Model model){
        if(unitId!=null){
            Unit unit = unitDao.findOne(unitId);
            model.addAttribute("unit",unit);
        }
        return "user/unitedit";
    }

    /**
     * 删除
     * @param unitid
     * @param model
     * @return
     */
    @RequestMapping("deleteunit")
    public String deletUnit(@RequestParam("unitid") Long unitid,Model model){
        Unit unit = unitDao.findOne(unitid);
        unitDao.delete(unit);
        model.addAttribute("success",1);
        return "/unitmanage";
    }

}

