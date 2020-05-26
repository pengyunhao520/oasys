package cn.gson.oasys.controller.humanresources;

import cn.gson.oasys.model.dao.humanresources.PersonnelBaseInformationDao;
import cn.gson.oasys.model.entity.humanresources.PersonnelBaseInformation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import java.util.List;

/**
 * @author Administrator
 */
@Controller
@RequestMapping("/")
public class PersonnelBaseInformationController {
    @Autowired
    private PersonnelBaseInformationDao pbiDao;

    /**
     * 单位管理主界面
     * @param model
     * @return
     */
    @RequestMapping("PersonnelBaseInformationmanage")
    public String personnelBaseInformationManage(Model model) {
        List<PersonnelBaseInformation> pbi = (List<PersonnelBaseInformation>) pbiDao.findAll();
        model.addAttribute("pbi",pbi);
        return "humanresources/PersonnelBaseInformationmanage";
    }

    /**
     * 添加和修改
     * @param pbi
     * @param xg
     * @param br
     * @param model
     * @return
     */
    @RequestMapping(value = "PersonnelBaseInformationedit" ,method = RequestMethod.POST)
    public String addpersonnelBaseInformation(@Valid PersonnelBaseInformation pbi, @RequestParam("xg") String xg, BindingResult br, Model model){
        System.out.println(br.hasErrors());
        System.out.println(br.getFieldError());
        if(!br.hasErrors()){
            System.out.println("没有错误");
            PersonnelBaseInformation addpbi = pbiDao.save(pbi);
            if(addpbi!=null){
                System.out.println("插入成功");
                model.addAttribute("success",1);
                return "/PersonnelBaseInformationmanage";
            }
        }
        System.out.println("有错误");
        model.addAttribute("errormess","错误！~");
        return "humanresources/PersonnelBaseInformationedit";
    }

    /**
     * 显示页面
     * @param id
     * @param model
     * @return
     */
    @RequestMapping(value = "PersonnelBaseInformationedit" ,method = RequestMethod.GET)
    public String changePersonnelBaseInformation(@RequestParam(value = "pbi",required=false)Long id, Model model){
        if(id!=null){
            PersonnelBaseInformation pbi = pbiDao.findOne(id);
            model.addAttribute("pbi",pbi);
        }
        return "user/PersonnelBaseInformationedit";
    }

    /**
     * 删除
     * @param id
     * @param model
     * @return
     */
    @RequestMapping("deletePersonnelBaseInformation")
    public String deletPersonnelBaseInformation(@RequestParam("id") Long id,Model model){
        PersonnelBaseInformation pbi = pbiDao.findOne(id);
        pbiDao.delete(pbi);
        model.addAttribute("success",1);
        return "/PersonnelBaseInformationmanage";
    }
}
