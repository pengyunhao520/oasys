package cn.gson.oasys.model.entity.humanresources;

import java.util.Date;

/**
 * @author Administrator
 * 人事合同
 */
public class PersonnelContract {
    //主键id
    private Long id;
    //员工姓名
    private String employee;
    //合同状态
    private String contractstatus;
    //合同编号
    private String contractno;
    //合同类型
    private String contracttype;
    //是否有竞业条款
    private char competitionclause;
    //是否有保密协议
    private char confidentialityagreement;
    //签约日期
    private Date signingdate;
    //到期日期
    private Date expiredate;
    //鉴证机关
    private String assuranceagency;
    //鉴证日期
    private Date authenticatedate;
    //违约责任
    private String breakcontract;
    //其他事宜
    private String elses;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmployee() {
        return employee;
    }

    public void setEmployee(String employee) {
        this.employee = employee;
    }

    public String getContractstatus() {
        return contractstatus;
    }

    public void setContractstatus(String contractstatus) {
        this.contractstatus = contractstatus;
    }

    public String getContractno() {
        return contractno;
    }

    public void setContractno(String contractno) {
        this.contractno = contractno;
    }

    public String getContracttype() {
        return contracttype;
    }

    public void setContracttype(String contracttype) {
        this.contracttype = contracttype;
    }

    public char getCompetitionclause() {
        return competitionclause;
    }

    public void setCompetitionclause(char competitionclause) {
        this.competitionclause = competitionclause;
    }

    public char getConfidentialityagreement() {
        return confidentialityagreement;
    }

    public void setConfidentialityagreement(char confidentialityagreement) {
        this.confidentialityagreement = confidentialityagreement;
    }

    public Date getSigningdate() {
        return signingdate;
    }

    public void setSigningdate(Date signingdate) {
        this.signingdate = signingdate;
    }

    public Date getExpiredate() {
        return expiredate;
    }

    public void setExpiredate(Date expiredate) {
        this.expiredate = expiredate;
    }

    public String getAssuranceagency() {
        return assuranceagency;
    }

    public void setAssuranceagency(String assuranceagency) {
        this.assuranceagency = assuranceagency;
    }

    public Date getAuthenticatedate() {
        return authenticatedate;
    }

    public void setAuthenticatedate(Date authenticatedate) {
        this.authenticatedate = authenticatedate;
    }

    public String getBreakcontract() {
        return breakcontract;
    }

    public void setBreakcontract(String breakcontract) {
        this.breakcontract = breakcontract;
    }

    public String getElses() {
        return elses;
    }

    public void setElses(String elses) {
        this.elses = elses;
    }

    @Override
    public String toString() {
        return "PersonnelContract{" +
                "id=" + id +
                ", employee='" + employee + '\'' +
                ", contractstatus='" + contractstatus + '\'' +
                ", contractno='" + contractno + '\'' +
                ", contracttype='" + contracttype + '\'' +
                ", competitionclause=" + competitionclause +
                ", confidentialityagreement=" + confidentialityagreement +
                ", signingdate=" + signingdate +
                ", expiredate=" + expiredate +
                ", assuranceagency='" + assuranceagency + '\'' +
                ", authenticatedate=" + authenticatedate +
                ", breakcontract='" + breakcontract + '\'' +
                ", elses='" + elses + '\'' +
                '}';
    }
}

