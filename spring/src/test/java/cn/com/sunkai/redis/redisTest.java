package cn.com.sunkai.redis;

import cn.com.ssm.Iservice.IProductService;
import cn.com.ssm.common.RedisCacheManager;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/*@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations =
        {"classpath*:spring/spring.xml","classpath*:spring/springmvc_dao.xml"
                ,"classpath*:spring/springmvc_redis.xml"
                ,"classpath*:spring/springmvc_trasction.xml"})*/
public class redisTest {
    private RedisCacheManager redisCacheManager;

    public RedisCacheManager getRedisCacheManager() {
        return redisCacheManager;
    }

    public void setRedisCacheManager(RedisCacheManager redisCacheManager) {
        this.redisCacheManager = redisCacheManager;
    }

    @Test
    public void redistExpire() throws Exception {
        //redisCacheManager.expire("str",10L);
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext(new String[]{"spring/spring.xml","spring/springmvc_dao.xml","spring/springmvc_redis.xml","spring/springmvc_trasction.xml"});
        IProductService iProductService = (IProductService)applicationContext.getBean("IProductService");
        iProductService.getList(2,20);
    }
}
