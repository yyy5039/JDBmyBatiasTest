package me.gacl.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author gacl
 * users表所对应的实体类
 */
public class Myuser {

    //实体类的属性和表的字段名称一一对应
    private int id;
    private String name;
    private int age;
    private List<Goods> goodList;
    
//    private ArrayList<Map<String, Object>> goods;
//    
//    
//    public ArrayList<Map<String, Object>> getGoods(){
//     return   goods; 
//    }
//
//    public void setGoods(ArrayList<Map<String, Object>> goods) {
//        this.goods = goods;
//    }

    public List<Goods> getGoodList() {
        return goodList;
    }

    public void setGoodList(List<Goods> goodList) {
        this.goodList = goodList;
    }

    public Myuser(int id,String name, int age){
    this.id =id;
    this.name=name;
    this.age=age;
    }
    
    public Myuser(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User [id=" + id + ", name=" + name + ", age=" + age + "]";
    }
}