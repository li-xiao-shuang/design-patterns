import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author lixiaoshuang
 */
public class CacheServiceImplTest {
    
    @Test
    public void get() {
        CacheService cacheService = new CacheServiceImpl();
        cacheService.set("username", "哈哈哈", 1);
        String username = cacheService.get("username", 1);
        System.out.println(username);
    }
}