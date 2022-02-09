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

import lombok.Data;

import java.util.Map;

/**
 * 奖励请求参数
 *
 * @author lixiaoshuang
 */
@Data
public class AwardReq {
    
    private String uid;                 // 用户唯一ID
    
    private Integer awardType;          // 奖品类型(可以用枚举定义)；1优惠券、2实物商品、3第三方兑换卡(爱奇艺)
    
    private String awardNumber;         // 奖品编号；sku、couponNumber、cardId
    
    private String bizId;               // 业务ID，防重复
    
    private Map<String, String> extMap; // 扩展信息
    
}
