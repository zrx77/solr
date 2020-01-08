package cn.xsxs.solrdemo.util;

import org.apache.solr.client.solrj.impl.HttpSolrServer;

public class getSolrServer {
    public HttpSolrServer Server() {
        final int ONE_HUNDRED_MS = 100;
        String solrUrl = "http://localhost:8080/solr";
        HttpSolrServer solrServer = new HttpSolrServer(solrUrl);
        solrServer.setConnectionTimeout(ONE_HUNDRED_MS);
        solrServer.setDefaultMaxConnectionsPerHost(100);
        solrServer.setMaxTotalConnections(100);
        return solrServer;
    }
}
