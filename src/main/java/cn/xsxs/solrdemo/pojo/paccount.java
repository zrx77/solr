package cn.xsxs.solrdemo.pojo;

import org.apache.solr.client.solrj.beans.Field;
import org.springframework.data.solr.core.mapping.SolrDocument;

@SolrDocument(collection = "collection1")
public class paccount extends UserInfo{
    @Field("pa_background")
    private String paBackground;
    @Field("pa_pid")
    private Integer paPid;
    @Field("pa_certificate")
    private String paCertificate;
    @Field("pa_intro")
    private String paIntro;
    @Field("pa_tx")
    private String paTx;
    @Field("pa_userid")
    private Integer paUserid;
    @Field("pa_accountstatus")
    private Integer paAccountstatus;
    @Field("pa_devicecode")
    private String paDevicecode;

    @Override
    public String toString() {
        return "paccount{" +
                ", paBackground='" + paBackground + '\'' +
                ", paPid=" + paPid +
                ", paCertificate='" + paCertificate + '\'' +
                ", paIntro='" + paIntro + '\'' +
                ", paTx='" + paTx + '\'' +
                ", paUserid=" + paUserid +
                ", paAccountstatus=" + paAccountstatus +
                ", paDevicecode='" + paDevicecode + '\'' +
                '}';
    }

    public String getPaBackground() {
        return paBackground;
    }

    public void setPaBackground(String paBackground) {
        this.paBackground = paBackground;
    }

    public Integer getPaPid() {
        return paPid;
    }

    public void setPaPid(Integer paPid) {
        this.paPid = paPid;
    }

    public String getPaCertificate() {
        return paCertificate;
    }

    public void setPaCertificate(String paCertificate) {
        this.paCertificate = paCertificate;
    }

    public String getPaIntro() {
        return paIntro;
    }

    public void setPaIntro(String paIntro) {
        this.paIntro = paIntro;
    }

    public String getPaTx() {
        return paTx;
    }

    public void setPaTx(String paTx) {
        this.paTx = paTx;
    }

    public Integer getPaUserid() {
        return paUserid;
    }

    public void setPaUserid(Integer paUserid) {
        this.paUserid = paUserid;
    }

    public Integer getPaAccountstatus() {
        return paAccountstatus;
    }

    public void setPaAccountstatus(Integer paAccountstatus) {
        this.paAccountstatus = paAccountstatus;
    }

    public String getPaDevicecode() {
        return paDevicecode;
    }

    public void setPaDevicecode(String paDevicecode) {
        this.paDevicecode = paDevicecode;
    }
}

