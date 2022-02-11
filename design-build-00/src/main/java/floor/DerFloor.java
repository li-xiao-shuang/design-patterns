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

package floor;

import matter.Matter;

import java.math.BigDecimal;

/**
 * 地板
 * 品牌；德尔(Der)
 */
public class DerFloor implements Matter {
    
    @Override
    public String scene() {
        return "地板";
    }
    
    @Override
    public String brand() {
        return "德尔(Der)";
    }
    
    @Override
    public String model() {
        return "A+";
    }
    
    @Override
    public BigDecimal price() {
        return new BigDecimal(119);
    }
    
    @Override
    public String desc() {
        return "DER德尔集团是全球领先的专业木地板制造商，北京2008年奥运会家装和公装地板供应商";
    }
    
}
