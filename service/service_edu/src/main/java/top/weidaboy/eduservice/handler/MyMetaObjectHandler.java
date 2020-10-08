package top.weidaboy.eduservice.handler;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class MyMetaObjectHandler implements MetaObjectHandler {


    //gmt ：世界时间
    @Override  //在插入前
    public void insertFill(MetaObject metaObject) {
        //create ：创建时间
        this.setFieldValByName("gmtCreate", new Date(), metaObject);
        //modified ： 修改时间
        this.setFieldValByName("gmtModified", new Date(), metaObject);
    }

    @Override  //在更新前
    public void updateFill(MetaObject metaObject) {
        //modified ： 修改时间
        this.setFieldValByName("gmtModified", new Date(), metaObject);
    }
}
