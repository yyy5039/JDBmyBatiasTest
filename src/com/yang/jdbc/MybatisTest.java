package com.yang.jdbc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import me.gacl.domain.Goods;
import me.gacl.domain.Myuser;
import me.gacl.mapping.goodsmaper;
import me.gacl.mapping.usermaper;

public class MybatisTest {
    public static void main(String[] args) {
        Test();
    
    }
    
    private static void Test(){
        SqlSession session=DBTools.getSession();
        usermaper mapper=session.getMapper(usermaper.class);
        
        goodsmaper goodmaper=session.getMapper(goodsmaper.class);

        try {

            
//          Goods goods1=new Goods(27,"特别4而且",3,"fwef");
//          goodmaper.updateGoods(goods1);

          Goods goods=goodmaper.getGoodsByID(1);
          System.out.print("goods----->"+goods.toString()+"\r\n");
          System.out.print("myuser----->"+goods.getMyuser().toString()+"\r\n");
          
//          Myuser user=mapper.selectUserById(2);
//          System.out.println(user.toString());         
          
//        HashMap<String,Integer> hashmap=new HashMap<String,Integer>();
//        hashmap.put("id", 2);
//        hashmap.put("age", 11);

//        
//        Myuser user1=new Myuser(123,"纷3纷",33);
//        mapper.updateUser(user1);

        
        Myuser IDuser=mapper.selectUserById(4);
        List<Goods> userGoodsList=IDuser.getGoodList();
        for(Goods mapgood:userGoodsList){
        System.out.print("IDuser:--->"+IDuser.toString()+"\r\n");
        System.out.print("  goodName--->"+mapgood.toString()+"\r\n");
        }
        


        
        session.commit();
        } catch (Exception e) {
            e.printStackTrace();
            session.rollback();
        }
    }
}
