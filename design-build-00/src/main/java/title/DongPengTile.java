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
 * 地砖 品牌：东鹏瓷砖
 */
public class DongPengTile implements Matter {
    
    @Override
    public String scene() {
        return "地砖";
    }
    
    @Override
    public String brand() {
        return "东鹏瓷砖";
    }
    
    @Override
    public String model() {
        return "10001";
    }
    
    @Override
    public BigDecimal price() {
        return new BigDecimal(102);
    }
    
    @Override
    public String desc() {
        return "东鹏瓷砖以品质铸就品牌，科技推动品牌，口碑传播品牌为宗旨，2014年品牌价值132.35亿元，位列建陶行业榜首。";
    }
    
}
