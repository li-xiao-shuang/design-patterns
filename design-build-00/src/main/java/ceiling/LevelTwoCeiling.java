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

package ceiling;

import matter.Matter;

import java.math.BigDecimal;

/**
 * 吊顶
 * 品牌；装修公司自带
 * 型号：二级顶
 */
public class LevelTwoCeiling implements Matter {
    
    @Override
    public String scene() {
        return "吊顶";
    }
    
    @Override
    public String brand() {
        return "装修公司自带";
    }
    
    @Override
    public String model() {
        return "二级顶";
    }
    
    @Override
    public BigDecimal price() {
        return new BigDecimal(260);
    }
    
    @Override
    public String desc() {
        return "两个层次的吊顶，二级吊顶高度一般就往下吊20cm，要是层高很高，也可增加每级的厚度";
    }
}
