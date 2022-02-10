import factory.impl.EGMCacheAdapter;
import factory.impl.IIRCacheAdapter;
import factory.JDKProxy;
import impl.CacheService;
import impl.CacheServiceImpl;
import org.junit.Test;

/**
 * @author lixiaoshuang
 */
public class JDKProxyTest {
    
    @Test
    public void test_CacheService() {
        
        CacheService proxy_EGM = JDKProxy.getProxy(CacheServiceImpl.class, new EGMCacheAdapter());
        proxy_EGM.set("user_name_01", "哈哈");
        String val01 = proxy_EGM.get("user_name_01");
        System.out.println("测试结果：" + val01);
        
        CacheService proxy_IIR = JDKProxy.getProxy(CacheServiceImpl.class, new IIRCacheAdapter());
        proxy_IIR.set("user_name_01", "嘻嘻");
        String val02 = proxy_IIR.get("user_name_01");
        System.out.println("测试结果：" + val02);
        
    }
}