package cn.gson.oasys.model.entity.humanresources;

import javax.persistence.*;
import java.util.Date;

/**
 * @author Administrator
 * 基本信息
 */
@Entity
@Table(name = "personnel_baseinformation")
public class PersonnelBaseInformation {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    //主键 编号
    private Long id;
    //姓名
    private String name;
    //科室
    private Long dept;
    //岗位类别(科室类别)
    private String deptcategoy;
    //岗位分类(本人专业)
    private String postclassify;
    //人员类别
    private String personcategory;
    //人员性质(国家职工、临时职工)
    private String personnature;
    //性别
    private String sex;
    //出生年月
    private Date birthdate;
    //籍贯
    private String nativeplace;
    //民族
    private int nation;
    //政治面貌
    private String politiccountenance;
    //电话号码
    private String tel;
    //身份证号码
    private String idnumber;
    //参加工作时间
    private Date joinjobtime;
    //入院时间
    private Date hospitalizedtime;
    //全日制第一学历
    private int education;
    //第一学历毕业学校
    private String school;
    //专业
    private String major;
    //在职学历
    private String jobeducation;
    //毕业院校以及时间
    private String Graduationtimemajorschool;
    //执业资格
    private String professionalqualification;
    //执业资格取得时间
    private Date professionalqualificationtime;
    //执业范围（医师必填)
    private String scopeofpractice;
    //现有职称
    private String nowtitle;
    //现有职称取得时间
    private Date nowtitletime;
    //岗位类别
    private String postcategory;
    //岗位等级
    private String joblevel;
    //第一次签合同时间
    private Date firstcontracttime;
    //合同到期时间
    private Date firstcontractexpiretime;
    //第二次签合同时间
    private Date secondcontracttime;
    //第二次签合同年限
    private Date secondcontractexpiretime;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getDept() {
        return dept;
    }

    public void setDept(Long dept) {
        this.dept = dept;
    }

    public String getDeptcategoy() {
        return deptcategoy;
    }

    public void setDeptcategoy(String deptcategoy) {
        this.deptcategoy = deptcategoy;
    }

    public String getPostclassify() {
        return postclassify;
    }

    public void setPostclassify(String postclassify) {
        this.postclassify = postclassify;
    }

    public String getPersoncategory() {
        return personcategory;
    }

    public void setPersoncategory(String personcategory) {
        this.personcategory = personcategory;
    }

    public String getPersonnature() {
        return personnature;
    }

    public void setPersonnature(String personnature) {
        this.personnature = personnature;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public String getNativeplace() {
        return nativeplace;
    }

    public void setNativeplace(String nativeplace) {
        this.nativeplace = nativeplace;
    }

    public int getNation() {
        return nation;
    }

    public void setNation(int nation) {
        this.nation = nation;
    }

    public String getPoliticcountenance() {
        return politiccountenance;
    }

    public void setPoliticcountenance(String politiccountenance) {
        this.politiccountenance = politiccountenance;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getIdnumber() {
        return idnumber;
    }

    public void setIdnumber(String idnumber) {
        this.idnumber = idnumber;
    }

    public Date getJoinjobtime() {
        return joinjobtime;
    }

    public void setJoinjobtime(Date joinjobtime) {
        this.joinjobtime = joinjobtime;
    }

    public Date getHospitalizedtime() {
        return hospitalizedtime;
    }

    public void setHospitalizedtime(Date hospitalizedtime) {
        this.hospitalizedtime = hospitalizedtime;
    }

    public int getEducation() {
        return education;
    }

    public void setEducation(int education) {
        this.education = education;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getProfessionalqualification() {
        return professionalqualification;
    }

    public void setProfessionalqualification(String professionalqualification) {
        this.professionalqualification = professionalqualification;
    }

    public Date getProfessionalqualificationtime() {
        return professionalqualificationtime;
    }

    public void setProfessionalqualificationtime(Date professionalqualificationtime) {
        this.professionalqualificationtime = professionalqualificationtime;
    }

    public String getScopeofpractice() {
        return scopeofpractice;
    }

    public void setScopeofpractice(String scopeofpractice) {
        this.scopeofpractice = scopeofpractice;
    }

    public String getNowtitle() {
        return nowtitle;
    }

    public void setNowtitle(String nowtitle) {
        this.nowtitle = nowtitle;
    }

    public Date getNowtitletime() {
        return nowtitletime;
    }

    public void setNowtitletime(Date nowtitletime) {
        this.nowtitletime = nowtitletime;
    }

    public String getPostcategory() {
        return postcategory;
    }

    public void setPostcategory(String postcategory) {
        this.postcategory = postcategory;
    }

    public String getJoblevel() {
        return joblevel;
    }

    public void setJoblevel(String joblevel) {
        this.joblevel = joblevel;
    }

    public Date getFirstcontracttime() {
        return firstcontracttime;
    }

    public void setFirstcontracttime(Date firstcontracttime) {
        this.firstcontracttime = firstcontracttime;
    }

    public Date getFirstcontractexpiretime() {
        return firstcontractexpiretime;
    }

    public void setFirstcontractexpiretime(Date firstcontractexpiretime) {
        this.firstcontractexpiretime = firstcontractexpiretime;
    }

    public Date getSecondcontracttime() {
        return secondcontracttime;
    }

    public void setSecondcontracttime(Date secondcontracttime) {
        this.secondcontracttime = secondcontracttime;
    }

    public Date getSecondcontractexpiretime() {
        return secondcontractexpiretime;
    }

    public void setSecondcontractexpiretime(Date secondcontractexpiretime) {
        this.secondcontractexpiretime = secondcontractexpiretime;
    }

    @Override
    public String toString() {
        return "PersonnelBaseInformation{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dept=" + dept +
                ", deptcategoy='" + deptcategoy + '\'' +
                ", postclassify='" + postclassify + '\'' +
                ", personcategory='" + personcategory + '\'' +
                ", personnature='" + personnature + '\'' +
                ", sex='" + sex + '\'' +
                ", birthdate=" + birthdate +
                ", nativeplace='" + nativeplace + '\'' +
                ", nation=" + nation +
                ", politiccountenance='" + politiccountenance + '\'' +
                ", tel='" + tel + '\'' +
                ", idnumber='" + idnumber + '\'' +
                ", joinjobtime=" + joinjobtime +
                ", hospitalizedtime=" + hospitalizedtime +
                ", education=" + education +
                ", school='" + school + '\'' +
                ", major='" + major + '\'' +
                ", professionalqualification='" + professionalqualification + '\'' +
                ", professionalqualificationtime=" + professionalqualificationtime +
                ", scopeofpractice='" + scopeofpractice + '\'' +
                ", nowtitle='" + nowtitle + '\'' +
                ", nowtitletime=" + nowtitletime +
                ", postcategory='" + postcategory + '\'' +
                ", joblevel='" + joblevel + '\'' +
                ", firstcontracttime=" + firstcontracttime +
                ", firstcontractexpiretime=" + firstcontractexpiretime +
                ", secondcontracttime=" + secondcontracttime +
                ", secondcontractexpiretime=" + secondcontractexpiretime +
                '}';
    }
}
