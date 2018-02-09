package me.gacl.mapping;

import java.util.HashMap;
import java.util.List;

import me.gacl.domain.Myuser;

public interface usermaper {

        /**
         * 新增用戶
         * @param user
         * @return
         * @throws Exception
         */
        public int insertUser(Myuser user) throws Exception;
        /**
         * 修改用戶
         * @param user
         * @param id
         * @return
         * @throws Exception
         */
        public int updateUser (Myuser user) throws Exception;
         /**
          * 刪除用戶
          * @param id
          * @return
          * @throws Exception
          */
        public int deleteUser(int id) throws Exception;
        /**
         * 根据id查询用户信息
         * @param id
         * @return
         * @throws Exception
         */
        public Myuser selectUserById(int id) throws Exception;
        
        public Myuser selectUserByIdAndAge(HashMap<String,Integer> hashMap) throws Exception;
         /**
          * 查询所有的用户信息
          * @return
          * @throws Exception
          */
        public List<Myuser> selectAllUser() throws Exception;
        
        public void upUserIDBatch(List<Myuser> listMyuser) throws Exception;       
        

}
