/*
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

import master.EGM;
import master.IIR;

import java.util.concurrent.TimeUnit;

/**
 * @author lixiaoshuang
 */
public class CacheServiceImpl implements CacheService {
    
    private RedisUtils redisUtils = new RedisUtils();
    
    private EGM egm = new EGM();
    
    private IIR iir = new IIR();
    
    
    @Override
    public String get(String key, int redisType) {
        if (redisType == 1) {
            return egm.gain(key);
        }
        if (redisType == 2) {
            return iir.get(key);
        }
        return redisUtils.get(key);
    }
    
    @Override
    public void set(String key, String value, int redisType) {
        if (1 == redisType) {
            egm.set(key, value);
            return;
        }
        
        if (2 == redisType) {
            iir.set(key, value);
            return;
        }
        
        redisUtils.set(key, value);
    }
    
    @Override
    public void set(String key, String value, long timeout, TimeUnit timeUnit, int redisType) {
        if (1 == redisType) {
            egm.setEx(key, value, timeout, timeUnit);
            return;
        }
        
        if (2 == redisType) {
            iir.setExpire(key, value, timeout, timeUnit);
            return;
        }
        
        redisUtils.set(key, value, timeout, timeUnit);
    }
    
    @Override
    public void del(String key, int redisType) {
        if (1 == redisType) {
            egm.delete(key);
            return;
        }
        
        if (2 == redisType) {
            iir.del(key);
            return;
        }
        
        redisUtils.del(key);
    }
}
