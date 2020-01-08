package cn.xsxs.solrdemo.pojo;

import org.apache.solr.client.solrj.beans.Field;
import org.springframework.data.solr.core.mapping.SolrDocument;

@SolrDocument(collection = "collection1")
public class userlabel extends picture{
    @Field("ul_pid")
    private Integer ulPid;
    @Field("ul_type")
    private Integer ulType;

    @Override
    public String toString() {
        return "userlabel{" +
                ", ulPid=" + ulPid +
                ", ulType=" + ulType +
                '}';
    }

    public Integer getUlPid() {
        return ulPid;
    }

    public void setUlPid(Integer ulPid) {
        this.ulPid = ulPid;
    }

    public Integer getUlType() {
        return ulType;
    }

    public void setUlType(Integer ulType) {
        this.ulType = ulType;
    }
}
