package com.dao;

import com.domain.Cate;
import com.util.PageModel;

import java.util.List;

public interface CateDao {
     List<Cate> queryAll(String likeValue, PageModel pageModel);

      int saveOne(Cate cate);

     Cate queryById(String cid);

     int updateOne(Cate cate);

     int deleteOne(String cid);
}
