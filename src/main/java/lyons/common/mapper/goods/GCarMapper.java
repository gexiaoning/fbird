package lyons.common.mapper.goods;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import lyons.common.model.goods.GCar;

public interface GCarMapper {
    
    /** find goods of car by username*/
    List<GCar> selectByuName(@Param("username") String username);

    /** delete one goods of car by car-id and username*/
    int deleteByCondition(@Param("gCarUName") String gCarUName, @Param("gCarGId") String gCarGId);

    /** add goods to car*/
    int addGoods(GCar car);


    

}