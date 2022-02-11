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

package coat;

import matter.Matter;

import java.math.BigDecimal;

/**
 * 涂料
 * 品牌；立邦
 */
public class LiBangCoat implements Matter {
    
    @Override
    public String scene() {
        return "涂料";
    }
    
    @Override
    public String brand() {
        return "立邦";
    }
    
    @Override
    public String model() {
        return "默认级别";
    }
    
    @Override
    public BigDecimal price() {
        return new BigDecimal(650);
    }
    
    @Override
    public String desc() {
        return "立邦始终以开发绿色产品、注重高科技、高品质为目标，以技术力量不断推进科研和开发，满足消费者需求。";
    }
}
