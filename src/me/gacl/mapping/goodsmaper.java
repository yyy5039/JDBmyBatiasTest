package me.gacl.mapping;


import me.gacl.domain.Goods;

public interface goodsmaper {
    
   public void insertGoods(Goods good);
   
   public void updateGoods(Goods good);
   
   public Goods getGoodsByID(int goodID) throws Exception;;
   

}
