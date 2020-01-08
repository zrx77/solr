package cn.xsxs.solrdemo.service;

import cn.xsxs.solrdemo.pojo.dynamictype;

import java.util.List;

public interface ISolrService {
    List<dynamictype> search(String queryString);
}
