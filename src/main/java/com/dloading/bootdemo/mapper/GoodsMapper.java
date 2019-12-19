package com.dloading.bootdemo.mapper;


import com.dloading.bootdemo.model.Goods;
import com.github.pagehelper.Page;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * @author Dloading
 * @since 2019/12/18
 *
 */
@Repository
public interface GoodsMapper {

   Page<Goods> findGoodsByPage(Goods goods);

   List<Goods> findGoodsById(Long id);

   void addGoods(Goods goods);

   void updateGoodsById(Goods goods);

   void deleteGoodsById(Long id);
}
