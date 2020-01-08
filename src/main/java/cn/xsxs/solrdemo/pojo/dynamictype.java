package cn.xsxs.solrdemo.pojo;

import org.apache.solr.client.solrj.beans.Field;
import org.springframework.data.solr.core.mapping.SolrDocument;

@SolrDocument(collection = "collection1")
public class dynamictype extends userlabel{
    @Field("dt_type")
    private String dtType;

    public String getDtType() {
        return dtType;
    }

    public void setDtType(String dtType) {
        this.dtType = dtType;
    }

    @Override
    public String toString() {
        return "dynamictype{" +
                ", dtType='" + dtType + '\'' +
                '}';
    }
}
