
package lyons.common.service.goods;

import java.util.List;

import lyons.common.model.goods.Goods;


public interface GoodsService
{
    /** find all goods **/
    List<Goods> findAllGoods();

    /** find goods by keyword*/
    List<Goods> queryByKeyword(String keyword);

    /** find goods by id*/
    Goods findDetail(String gId);
}
