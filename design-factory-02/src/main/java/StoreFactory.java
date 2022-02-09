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

import store.ICommodity;
import store.impl.CardCommodityService;
import store.impl.CouponCommodityService;
import store.impl.GoodsCommodityService;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lixiaoshuang
 */
public class StoreFactory {

    private static final Map<Integer, ICommodity> COMMODITY_MAP = new HashMap<Integer, ICommodity>() {{
        put(1, new CouponCommodityService());
        put(2, new GoodsCommodityService());
        put(3, new CardCommodityService());
    }};

    public ICommodity getCommodityService(Integer commodityType) {
        ICommodity iCommodity = COMMODITY_MAP.get(commodityType);
        if (null != iCommodity) {
            return iCommodity;
        }
        throw new RuntimeException("不存在的商品服务类型");
    }

}
