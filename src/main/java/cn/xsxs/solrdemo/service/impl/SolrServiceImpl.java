package cn.xsxs.solrdemo.service.impl;

import cn.xsxs.solrdemo.dao.SolrDao;
import cn.xsxs.solrdemo.pojo.dynamictype;
import cn.xsxs.solrdemo.service.ISolrService;
import lombok.extern.log4j.Log4j2;
import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.impl.HttpSolrServer;
import org.apache.solr.client.solrj.request.FieldAnalysisRequest;
import org.apache.solr.client.solrj.response.AnalysisResponseBase.TokenInfo;
import org.apache.solr.client.solrj.response.AnalysisResponseBase.AnalysisPhase;
import org.apache.solr.client.solrj.response.FieldAnalysisResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Log4j2
@Service("solrService")
public class SolrServiceImpl implements ISolrService {
    @Autowired
    SolrDao sd;
    private String url = "http://http://localhost:8080/solr/collection1";
    @Override
    public List<dynamictype> search(String queryString) {
        SolrQuery query = new SolrQuery();
        query.setQuery(queryString);
        query.set("uname","item_keywords");
        List<dynamictype> searchresult = sd.search(query);
        return searchresult;
    }
}
