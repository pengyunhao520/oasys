package cn.gson.oasys.model.entity.filesenddao;


import cn.gson.oasys.model.entity.process.ProcessList;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

/**
 * @author Administrator
 * 发文
 */
@Entity
@Table(name = "document_registration")
public class DocumentRegistration {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    //主键 编号
    private Long id;
    //日期
    private Date date;
    //文号
    private String documentno;
    //密级
    private String secretlevel;
    //文种
    private String genre;
    //附件
    private String enclosure;
    //份数
    private int count;
    //拟稿单位
    private String draftedby;
    //拟稿人
    private String drafter;
    //签发人
    private String approver;
    //文件名称
    private String title;
    //归档号
    private int filingno;

    //归档情况
    private String archiving;

    //文件内容
    private String content;

    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="pro_id")
    private ProcessList proId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @JsonFormat(pattern = "yyyy-MM=dd",timezone = "GMT+8")
    public Date getDate() {
        return date;
    }

    @DateTimeFormat(pattern = "yyyy-MM=dd")
    public void setDate(Date date) {
        this.date = date;
    }

    public String getDocumentno() {
        return documentno;
    }

    public void setDocumentno(String documentno) {
        this.documentno = documentno;
    }

    public String getSecretlevel() {
        return secretlevel;
    }

    public void setSecretlevel(String secretlevel) {
        this.secretlevel = secretlevel;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getEnclosure() {
        return enclosure;
    }

    public void setEnclosure(String enclosure) {
        this.enclosure = enclosure;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getDraftedby() {
        return draftedby;
    }

    public void setDraftedby(String draftedby) {
        this.draftedby = draftedby;
    }

    public String getDrafter() {
        return drafter;
    }

    public void setDrafter(String drafter) {
        this.drafter = drafter;
    }

    public String getApprover() {
        return approver;
    }

    public void setApprover(String approver) {
        this.approver = approver;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getFilingno() {
        return filingno;
    }

    public void setFilingno(int filingno) {
        this.filingno = filingno;
    }

    public String getArchiving() {
        return archiving;
    }

    public void setArchiving(String archiving) {
        this.archiving = archiving;
    }

    public ProcessList getProId() {
        return proId;
    }
    public void setProId(ProcessList proId) {
        this.proId = proId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "DocumentRegistrationDao{" +
                "id=" + id +
                ", date=" + date +
                ", documentno='" + documentno + '\'' +
                ", secretlevel='" + secretlevel + '\'' +
                ", genre='" + genre + '\'' +
                ", enclosure='" + enclosure + '\'' +
                ", count=" + count +
                ", draftedby='" + draftedby + '\'' +
                ", drafter='" + drafter + '\'' +
                ", approver='" + approver + '\'' +
                ", title='" + title + '\'' +
                ", filingno=" + filingno +
                ", archiving='" + archiving + '\'' +
                ", proId='" + proId + '\'' +
                ", content='" + content + '\'' +
                '}';
    }


}
