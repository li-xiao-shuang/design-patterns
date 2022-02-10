package util;/*
 * Copyright 2021 Gypsophila open source organization.
 *
 * Licensed under the Apache License,Version2.0(the"License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

/**
 * @author lixiaoshuang
 */
public class RedisUtils {
    
    private Logger logger = LoggerFactory.getLogger(RedisUtils.class);
    
    private Map<String, String> dataMap = new ConcurrentHashMap<>();
    
    public String get(String key) {
        logger.info("Redis获取数据 key：{}", key);
        return dataMap.get(key);
    }
    
    public void set(String key, String value) {
        logger.info("Redis写入数据 key：{} val：{}", key, value);
        dataMap.put(key, value);
    }
    
    public void set(String key, String value, long timeout, TimeUnit timeUnit) {
        logger.info("Redis写入数据 key：{} val：{} timeout：{} timeUnit：{}", key, value, timeout, timeUnit.toString());
        dataMap.put(key, value);
    }
    
    public void del(String key) {
        logger.info("Redis删除数据 key：{}", key);
        dataMap.remove(key);
    }
}
