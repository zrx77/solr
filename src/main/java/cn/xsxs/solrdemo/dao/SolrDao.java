package cn.xsxs.solrdemo.dao;

import cn.xsxs.solrdemo.pojo.dynamictype;
import org.apache.solr.client.solrj.SolrQuery;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("sd")
public interface SolrDao {
    List<dynamictype> search(SolrQuery query);
}
