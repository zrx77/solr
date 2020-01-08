package cn.xsxs.solrdemo.pojo;

import org.apache.solr.client.solrj.beans.Field;
import org.springframework.data.annotation.Id;
import org.springframework.data.solr.core.mapping.SolrDocument;

@SolrDocument(collection = "collection1")
public class UserInfo{
    @Id
    private Integer id;
    @Field("uid")
    private String uid;
    @Field("uname")
    private String uname;
    @Field("upwd")
    private String upwd;
    @Field("p_phone")
    private String pPhone;
    @Field("p_idnumber")
    private String pIdnumber;
    @Field("p_brithday")
    private String pBrithday;
    @Field("p_sex")
    private Integer  pSex;
    @Field("p_cityid")
    private Integer pCityid;
    @Field("p_age")
    private String pAge;


    @Override
    public String toString() {
        return "UserInfo{" +
                "id=" + id +
                ", uid='" + uid + '\'' +
                ", uname='" + uname + '\'' +
                ", upwd='" + upwd + '\'' +
                ", pPhone='" + pPhone + '\'' +
                ", pIdnumber='" + pIdnumber + '\'' +
                ", pBrithday='" + pBrithday + '\'' +
                ", pSex=" + pSex +
                ", pCityid=" + pCityid +
                ", pAge='" + pAge + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUpwd() {
        return upwd;
    }

    public void setUpwd(String upwd) {
        this.upwd = upwd;
    }

    public String getpPhone() {
        return pPhone;
    }

    public void setpPhone(String pPhone) {
        this.pPhone = pPhone;
    }

    public String getpIdnumber() {
        return pIdnumber;
    }

    public void setpIdnumber(String pIdnumber) {
        this.pIdnumber = pIdnumber;
    }

    public String getpBrithday() {
        return pBrithday;
    }

    public void setpBrithday(String pBrithday) {
        this.pBrithday = pBrithday;
    }

    public Integer getpSex() {
        return pSex;
    }

    public void setpSex(Integer pSex) {
        this.pSex = pSex;
    }

    public Integer getpCityid() {
        return pCityid;
    }

    public void setpCityid(Integer pCityid) {
        this.pCityid = pCityid;
    }

    public String getpAge() {
        return pAge;
    }

    public void setpAge(String pAge) {
        this.pAge = pAge;
    }
}

