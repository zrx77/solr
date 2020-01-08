package cn.xsxs.solrdemo.pojo;

import org.apache.solr.client.solrj.beans.Field;
import org.springframework.data.solr.core.mapping.SolrDocument;

@SolrDocument(collection = "collection1")
public class whoami extends paccount{
    @Field("w_type")
    private String wType;

    @Override
    public String toString() {
        return "whoami{" +
                ", wType='" + wType + '\'' +
                '}';
    }

    public String getwType() {
        return wType;
    }

    public void setwType(String wType) {
        this.wType = wType;
    }
}
