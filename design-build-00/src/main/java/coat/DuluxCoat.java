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
 * 品牌；多乐士(Dulux)
 */
public class DuluxCoat implements Matter {
    
    @Override
    public String scene() {
        return "涂料";
    }
    
    @Override
    public String brand() {
        return "多乐士(Dulux)";
    }
    
    @Override
    public String model() {
        return "第二代";
    }
    
    @Override
    public BigDecimal price() {
        return new BigDecimal(719);
    }
    
    @Override
    public String desc() {
        return "多乐士是阿克苏诺贝尔旗下的著名建筑装饰油漆品牌，产品畅销于全球100个国家，每年全球有5000万户家庭使用多乐士油漆。";
    }
}
