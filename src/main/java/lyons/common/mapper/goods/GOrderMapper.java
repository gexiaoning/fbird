package lyons.common.mapper.goods;

import java.util.List;

import lyons.common.model.goods.GOrder;

public interface GOrderMapper {
    

    int insertsBatchOrder(List<GOrder> listOrder);
    
    
    
    

}