package org.lanqiao.jingdong;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.lanqiao.entity.Cart;
import org.lanqiao.mapper.CartMapper;
import org.lanqiao.mapper.ProDetailMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Reader;

/**
 * Created by David on 2019/8/9.
 */
public class Test {
    private static SqlSessionFactory sqlSessionFactory;
    private static Reader reader;

    static {
        try {
            reader = Resources.getResourceAsReader("mybatis-Config.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        SqlSession session = sqlSessionFactory.openSession();

        CartMapper cartMapper = session.getMapper(CartMapper.class);

        System.out.println(cartMapper.getAllCart(1));

    }
}
