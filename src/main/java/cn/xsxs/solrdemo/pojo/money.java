package cn.xsxs.solrdemo.pojo;

import org.apache.solr.client.solrj.beans.Field;
import org.springframework.data.solr.core.mapping.SolrDocument;

@SolrDocument(collection = "collection1")
public class money extends whoami{
    @Field("a_id")
    private Integer aId;
    @Field("c_time")
    private String cTime;
    @Field("c_price")
    private Integer cPrice;
    @Field("c_type")
    private String cType;

    @Override
    public String toString() {
        return "money{" +
                ", aId=" + aId +
                ", cTime='" + cTime + '\'' +
                ", cPrice=" + cPrice +
                ", cType='" + cType + '\'' +
                '}';
    }


    public Integer getaId() {
        return aId;
    }

    public void setaId(Integer aId) {
        this.aId = aId;
    }

    public String getcTime() {
        return cTime;
    }

    public void setcTime(String cTime) {
        this.cTime = cTime;
    }

    public Integer getcPrice() {
        return cPrice;
    }

    public void setcPrice(Integer cPrice) {
        this.cPrice = cPrice;
    }

    public String getcType() {
        return cType;
    }

    public void setcType(String cType) {
        this.cType = cType;
    }
}
