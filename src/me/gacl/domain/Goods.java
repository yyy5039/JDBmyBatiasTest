package me.gacl.domain;

public class Goods {
    private int goodID;
    private String goodName;
    private int ownerID;
    private String reMark;
    
    private Myuser myuser;
    
    public Myuser getMyuser() {
        return myuser;
    }

    public void setMyuser(Myuser myuser) {
        this.myuser = myuser;
    }

    public Goods (int gID,String name,int oID,String remark){
        this.goodID=gID;
        this.goodName=name;
        this.ownerID=oID;
        this.reMark=remark;
    }
    
    public Goods (){
    }
    
    public Goods (String name,int oID,String remark){
        goodName=name;
        ownerID=oID;
        reMark=remark;
    }
    
    
    public int getGoodID() {
        return goodID;
    }
    public void setGoodID(int goodID) {
        this.goodID = goodID;
    }
    public String getGoodName() {
        return goodName;
    }
    public void setGoodName(String goodName) {
        this.goodName = goodName;
    }
    public int getOwnerID() {
        return ownerID;
    }
    public void setOwnerID(int ownerID) {
        this.ownerID = ownerID;
    }
    public String getReMark() {
        return reMark;
    }
    public void setReMark(String reMark) {
        this.reMark = reMark;
    }
    
    public String  toString(){
    return "goodID="+goodID+"  goodName="+goodName+"   ownerID="+ownerID+"  reMark"+reMark;
    }

}
