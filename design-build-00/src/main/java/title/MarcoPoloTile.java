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

package title;

import matter.Matter;

import java.math.BigDecimal;

/**
 * 地砖
 * 品牌；马可波罗(MARCO POLO)
 */
public class MarcoPoloTile implements Matter {
    
    @Override
    public String scene() {
        return "地砖";
    }
    
    @Override
    public String brand() {
        return "马可波罗(MARCO POLO)";
    }
    
    @Override
    public String model() {
        return "缺省";
    }
    
    @Override
    public BigDecimal price() {
        return new BigDecimal(140);
    }
    
    @Override
    public String desc() {
        return "“马可波罗”品牌诞生于1996年，作为国内最早品牌化的建陶品牌，以“文化陶瓷”占领市场，享有“仿古砖至尊”的美誉。";
    }
    
}
