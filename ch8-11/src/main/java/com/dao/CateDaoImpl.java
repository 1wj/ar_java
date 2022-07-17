package com.dao;

import com.domain.Cate;
import com.util.JdbcUtil;
import com.util.PageModel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CateDaoImpl implements CateDao{
    //查全部
    @Override
    public List<Cate> queryAll(String likeValue, PageModel pageModel) {
        StringBuffer sql=new StringBuffer("select cid,cname,describe_1,DATE_FORMAT(ccreatetime,'%Y-%m-%d %H:%i:%s') ctime from test");
        String pageSql=" limit "+(pageModel.getPageNo()-1) * pageModel.getPageSize()+","+pageModel.getPageSize();
        if(likeValue!=null && !"".equals(likeValue)){
            sql.append(" where cid like "+" \"%"+likeValue+"%\" "+"or cname like "+" \"%"+likeValue+"%\" "+
                    "or describe_1 like "+" \"%"+likeValue+"%\" "+ "");
        }
        sql.append(pageSql);
        List<Cate> list=new ArrayList<>();
        Connection conn = JdbcUtil.getconn();
        PreparedStatement ps=null;
        ResultSet rs=null;
        try {
             ps = conn.prepareStatement(String.valueOf(sql));
             rs=ps.executeQuery();
             while(rs.next()){

                Cate cate=new Cate();
                cate.setCid(rs.getInt("cid"));
                cate.setCname(rs.getString("cname"));
                cate.setDescribe_1(rs.getString("describe_1"));
                cate.setCcreatetime( rs.getString("ctime"));
                list.add(cate);
             }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }  finally {
            JdbcUtil.close();
        }


        //开始查询总条数
        StringBuffer sqlCount=new StringBuffer("select cid,cname,describe_1,DATE_FORMAT(ccreatetime,'%Y-%m-%d %H:%i:%s') ctime from test");
        if(likeValue!=null && !"".equals(likeValue)){
            sqlCount.append(" where cid like "+" \"%"+likeValue+"%\" "+"or cname like "+" \"%"+likeValue+"%\" "+
                    "or describe_1 like "+" \"%"+likeValue+"%\" "+ "");
        }
        List<Cate> list2=new ArrayList<>();
        Connection conn2 = JdbcUtil.getconn();
        PreparedStatement ps2=null;
        ResultSet rs2=null;
        try {
            ps2 = conn2.prepareStatement(String.valueOf(sqlCount));
            rs2=ps2.executeQuery();
            while(rs2.next()){
                Cate cate2=new Cate();
                cate2.setCid(rs2.getInt("cid"));
                cate2.setCname(rs2.getString("cname"));
                cate2.setDescribe_1(rs2.getString("describe_1"));
                cate2.setCcreatetime( rs2.getString("ctime"));
                list2.add(cate2);
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }  finally {
            JdbcUtil.close();
        }
        pageModel.setRecodeCount(list2.size());



        return list;

    }
    //添加
    @Override
    public int saveOne(Cate cate) {
        String sql="insert into test values(null,?,?,now())";
        Connection conn = JdbcUtil.getconn();
        PreparedStatement ps=null;
        int i=0;
        try {
            ps=conn.prepareStatement(sql);
            ps.setString(1,cate.getCname());
            ps.setString(2,cate.getDescribe_1());
             i= ps.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            JdbcUtil.close();
        }
        return i;
    }

    //根据id查
    @Override
    public Cate queryById(String cid) {
        String sql="select cid,cname,describe_1,DATE_FORMAT(ccreatetime,'%Y-%m-%d %H:%i:%s') ctime from test where cid=?";
        Connection conn = JdbcUtil.getconn();
        PreparedStatement ps=null;
        ResultSet rs=null;
        Cate cate=new Cate();
        try {
            ps = conn.prepareStatement(sql);
            ps.setInt(1,Integer.valueOf(cid));
            rs=ps.executeQuery();
            while(rs.next()){

                 cate=new Cate();
                cate.setCid(rs.getInt("cid"));
                cate.setCname(rs.getString("cname"));
                cate.setDescribe_1(rs.getString("describe_1"));
                cate.setCcreatetime( rs.getString("ctime"));

            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }  finally {
            JdbcUtil.close();
        }
        return cate;
    }

    //修改
    @Override
    public int updateOne(Cate cate) {
        String sql="update test set cname=? , describe_1=? where cid=?";
        Connection conn = JdbcUtil.getconn();
        PreparedStatement ps=null;
        int res=0;
        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1,cate.getCname());
            ps.setString(2,cate.getDescribe_1());
            ps.setInt(3,Integer.valueOf(cate.getCid()));
            res=ps.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }  finally {
            JdbcUtil.close();
        }
        return res;
    }

    //删除
    @Override
    public int deleteOne(String cid) {
        String sql="delete from test  where cid=?";
        Connection conn = JdbcUtil.getconn();
        PreparedStatement ps=null;
        int res=0;
        try {
            ps = conn.prepareStatement(sql);
            ps.setInt(1,Integer.valueOf(cid));
            res=ps.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }  finally {
            JdbcUtil.close();
        }
        return res;
    }


}
