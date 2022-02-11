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
 * 型号：一级顶
 */
public class LevelOneCeiling implements Matter {
    
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
        return "一级顶";
    }
    
    @Override
    public BigDecimal price() {
        return new BigDecimal(260);
    }
    
    @Override
    public String desc() {
        return "造型只做低一级，只有一个层次的吊顶，一般离顶120-150mm";
    }
}
