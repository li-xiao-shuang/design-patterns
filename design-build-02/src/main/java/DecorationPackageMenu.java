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

import matter.Matter;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @author lixiaoshuang
 */
public class DecorationPackageMenu implements IMenu {
    
    private List<Matter> list = new ArrayList<>();  // 装修清单
    
    private BigDecimal price = BigDecimal.ZERO;      // 装修价格
    
    private BigDecimal area;  // 面积
    
    private String grade;     // 装修等级；豪华欧式、轻奢田园、现代简约
    
    private DecorationPackageMenu() {
    }
    
    public DecorationPackageMenu(Double area, String grade) {
        this.area = new BigDecimal(area);
        this.grade = grade;
    }
    
    @Override
    public IMenu appendCeiling(Matter matter) {
        list.add(matter);
        price = price.add(area.multiply(new BigDecimal("0.2")).multiply(matter.price()));
        return this;
    }
    
    @Override
    public IMenu appendCoat(Matter matter) {
        list.add(matter);
        price = price.add(area.multiply(new BigDecimal("1.4")).multiply(matter.price()));
        return this;
    }
    
    @Override
    public IMenu appendFloor(Matter matter) {
        list.add(matter);
        price = price.add(area.multiply(matter.price()));
        return this;
    }
    
    @Override
    public IMenu appendTile(Matter matter) {
        list.add(matter);
        price = price.add(area.multiply(matter.price()));
        return this;
    }
    
    @Override
    public String getDetail() {
        
        StringBuilder detail = new StringBuilder(
                "\r\n-------------------------------------------------------\r\n" + "装修清单" + "\r\n" + "套餐等级：" + grade
                        + "\r\n" + "套餐价格：" + price.setScale(2, BigDecimal.ROUND_HALF_UP) + " 元\r\n" + "房屋面积："
                        + area.doubleValue() + " 平米\r\n" + "材料清单：\r\n");
        
        for (Matter matter : list) {
            detail.append(matter.scene()).append("：").append(matter.brand()).append("、").append(matter.model())
                    .append("、平米价格：").append(matter.price()).append(" 元。\n");
        }
        
        return detail.toString();
    }
}
