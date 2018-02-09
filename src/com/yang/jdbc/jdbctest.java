package com.yang.jdbc;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.mysql.jdbc.Driver;

import me.gacl.domain.Myuser;

public class jdbctest {

        public static void main2(String[] args) {
            String resource = "conf.xml";
            //使用类加载器加载mybatis的配置文件（它也加载关联的映射文件）
            InputStream is = jdbctest.class.getClassLoader().getResourceAsStream(resource);
            //构建sqlSession的工厂
            SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(is);
            //使用MyBatis提供的Resources类加载mybatis的配置文件（它也加载关联的映射文件）
            //Reader reader = Resources.getResourceAsReader(resource); 
            //构建sqlSession的工厂
            //SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
            //创建能执行映射文件中sql的sqlSession
            SqlSession session = sessionFactory.openSession();
            /**
             * 映射sql的标识字符串，
             * me.gacl.mapping.userMapper是userMapper.xml文件中mapper标签的namespace属性的值，
             * getUser是select标签的id属性值，通过select标签的id属性值就可以找到要执行的SQL
             */
            String statement = "me.gacl.mapping.usermaper.upUserIDBatch";//映射sql的标识字符串
            //Map<String,String> map=new HashMap<String,String>();
            //map.put("1","28");
            List<Myuser>  mylist=new ArrayList<Myuser>();
            Myuser updateAge1=new Myuser();
            updateAge1.setAge(31);
            updateAge1.setName("EWS");
            updateAge1.setId(1);
            
            Myuser updateAge2=new Myuser();
            updateAge2.setAge(11);
            updateAge2.setName("dsw");
            updateAge2.setId(2);
            
            mylist.add(updateAge1);
            mylist.add(updateAge2);
            session.update(statement, mylist);
            session.commit();
            
//            Myuser updateAge3=new Myuser();
//            updateAge3.setAge(11);
//            updateAge3.setName("dsw");
//            updateAge3.setId(21);
//            statement = "me.gacl.mapping.usermaper.insertUser";//映射sql的标识字符串
//            session.insert(statement, updateAge3);
//            session.commit();
            
            statement = "me.gacl.mapping.usermaper.selectUserById";//映射sql的标识字符串
            //执行查询返回一个唯一user对象的sql
            Myuser user = session.selectOne(statement, 4);
            System.out.println(user);
        }
//            Connection conn = null;
//            Statement state = null;
//            ResultSet set = null;
//            try {
//                //ע�����ݿ�����
//                DriverManager.registerDriver(new Driver());
//                //��ȡ���ݿ�����
//                 conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/sys", "root", "123456");
//                //��ȡ����������
//                 state= conn.createStatement();
//                //���ô���������ִ��sql���
//                 set=state.executeQuery("select * from sys_config");
//
//                while(set.next()){
//                    System.out.println(set.getString("variable"));
//                }
//            } catch (SQLException e) {
//                // TODO Auto-generated catch block
//                e.printStackTrace();
//            }finally{
//                try {
//                    set.close();
//                    state.close();
//                    conn.close();
//                } catch (SQLException e) {
//                    // TODO Auto-generated catch block
//                    e.printStackTrace();
//                }
//            
//            }
//        }

}
