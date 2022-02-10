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

package factory.impl;

import factory.ICacheAdapter;
import master.IIR;

import java.util.concurrent.TimeUnit;

/**
 * @author lixiaoshuang
 */
public class IIRCacheAdapter implements ICacheAdapter {
    
    private IIR iir = new IIR();
    
    @Override
    public String get(String key) {
        return iir.get(key);
    }
    
    @Override
    public void set(String key, String value) {
        iir.set(key, value);
    }
    
    @Override
    public void set(String key, String value, long timeout, TimeUnit timeUnit) {
        iir.setExpire(key, value, timeout, timeUnit);
    }
    
    @Override
    public void del(String key) {
        iir.del(key);
    }
}
