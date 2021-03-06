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

package pay;

import mode.IPayMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;

/**
 * @author lixiaoshuang
 */
public abstract class Pay {
    
    protected Logger logger = LoggerFactory.getLogger(Pay.class);
    
    protected IPayMode payMode;
    
    public Pay(IPayMode payMode) {
        this.payMode = payMode;
    }
    
    public abstract String transfer(String uId, String tradeId, BigDecimal amount);
}
