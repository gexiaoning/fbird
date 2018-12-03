package lyons.common.mapper.goods;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import lyons.common.model.goods.Goods;

public interface GoodsMapper {
    
    List<Goods> selectAll();

    List<Goods> selectByCondition(@Param("keyword") String keyword);

    Goods selectBygId(int gId);

    
    
    
    
    
}