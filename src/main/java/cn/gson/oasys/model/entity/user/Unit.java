package cn.gson.oasys.model.entity.user;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * 单位实体类
 */
@Entity
public class Unit {
    //主键id
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    //单位名称
    private String name;
    //单位电话
    private String phone;
    //单位地址
    private String address;
    //邮编
    private String postalcode;
    //网址
    private String website;
    //邮箱
    private String email;
    //银行卡号
    private String banknuber;
    //开户行
    private String openingbank;


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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPostalcode() {
        return postalcode;
    }

    public void setPostalcode(String postalcode) {
        this.postalcode = postalcode;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBanknuber() {
        return banknuber;
    }

    public void setBanknuber(String banknuber) {
        this.banknuber = banknuber;
    }

    public String getOpeningbank() {
        return openingbank;
    }

    public void setOpeningbank(String openingbank) {
        this.openingbank = openingbank;
    }

    @Override
    public String toString() {
        return "Unit{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", postalcode='" + postalcode + '\'' +
                ", website='" + website + '\'' +
                ", email='" + email + '\'' +
                ", banknuber='" + banknuber + '\'' +
                ", openingbank='" + openingbank + '\'' +
                '}';
    }

}
