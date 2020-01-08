package cn.xsxs.solrdemo.pojo;

import org.apache.solr.client.solrj.beans.Field;
import org.springframework.data.solr.core.mapping.SolrDocument;

@SolrDocument(collection = "collection1")
public class filtercontent extends dynamictype{
    @Field("kc_filter")
    private Integer kcFilter;
    @Field("kc_content")
    private String kcContent;

    @Override
    public String toString() {
        return "filtercontent{" +
                ", kcFilter=" + kcFilter +
                ", kcContent='" + kcContent + '\'' +
                '}';
    }

    public Integer getKcFilter() {
        return kcFilter;
    }

    public void setKcFilter(Integer kcFilter) {
        this.kcFilter = kcFilter;
    }

    public String getKcContent() {
        return kcContent;
    }

    public void setKcContent(String kcContent) {
        this.kcContent = kcContent;
    }
}
