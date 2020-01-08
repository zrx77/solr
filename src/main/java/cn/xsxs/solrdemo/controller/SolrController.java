package cn.xsxs.solrdemo.controller;

import cn.xsxs.solrdemo.service.impl.SolrServiceImpl;
import lombok.extern.log4j.Log4j2;
import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.impl.HttpSolrServer;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@Log4j2
@CrossOrigin
@RestController
public class SolrController {
    @Autowired
    SolrServiceImpl solrService;
    @Value("${spring.data.solr.host}")
    private String url;

    @GetMapping("/search/{q}")
    public QueryResponse findAll(@PathVariable("q") String queryString) throws Exception {
        HttpSolrServer server = new HttpSolrServer(url);
        queryString = new String(queryString.getBytes("utf-8"), "utf-8");
        SolrQuery query = new SolrQuery();
        query.set("q", "uname:" + queryString + "*");
        query.set("q1", "dt_type:" + queryString + "*");
        query.set("q2", "kc_content:" + queryString + "*");
        query.set("df", "item_keywords");
        QueryResponse response1 = server.query(query);
        if (response1.getResults().getNumFound() != 0) {
            return response1;
        } else {
            return null;
        }
    }

}
