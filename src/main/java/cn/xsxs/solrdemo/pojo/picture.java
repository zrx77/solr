package cn.xsxs.solrdemo.pojo;

import lombok.Data;
import org.apache.solr.client.solrj.beans.Field;
import org.springframework.data.solr.core.mapping.SolrDocument;

@SolrDocument(collection = "collection1")
public class picture extends money{
    @Field("pi_img")
    private String piImg;
    @Field("pi_background")
    private String piBackground;

    @Override
    public String toString() {
        return "picture{" +
                ", piImg='" + piImg + '\'' +
                ", piBackground='" + piBackground + '\'' +
                '}';
    }

    public String getPiImg() {
        return piImg;
    }

    public void setPiImg(String piImg) {
        this.piImg = piImg;
    }

    public String getPiBackground() {
        return piBackground;
    }

    public void setPiBackground(String piBackground) {
        this.piBackground = piBackground;
    }
}
