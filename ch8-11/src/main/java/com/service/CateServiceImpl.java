package com.service;

import com.dao.CateDao;
import com.dao.CateDaoImpl;
import com.domain.Cate;
import com.util.PageModel;

import java.util.List;

public class CateServiceImpl implements CateService{
    CateDao dao=new CateDaoImpl();
    @Override
    public List<Cate> queryAll(String likeValue,PageModel pageModel) {
        return dao.queryAll(likeValue, pageModel);
    }

    @Override
    public int saveOne(Cate cate) {
        return dao.saveOne(cate);
    }

    @Override
    public Cate queryById(String cid) {
        return dao.queryById(cid);
    }

    @Override
    public int updateOne(Cate cate) {
        return dao.updateOne(cate);
    }

    @Override
    public int deleteOne(String cid) {
        return dao.deleteOne(cid);
    }
}
