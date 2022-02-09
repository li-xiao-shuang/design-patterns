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

package goods;

import lombok.Data;

/**
 * @author lixiaoshuang
 */
@Data
public class DeliverReq {
    
    private String userName;              // 用户姓名
    
    private String userPhone;             // 用户手机
    
    private String sku;                   // 商品SKU
    
    private String orderId;               // 订单ID
    
    private String consigneeUserName;     // 收货人姓名
    
    private String consigneeUserPhone;    // 收货人手机
    
    private String consigneeUserAddress;  // 收获人地址
    
}
