package com.dloading.bootdemo.service;

import com.dloading.bootdemo.mapper.GoodsMapper;
import com.dloading.bootdemo.model.Goods;
import com.dloading.bootdemo.model.PageBean;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @author Dloading
 * @since 2019/12/18
 * 商品业务逻辑层
 */
@Service
public class GoodsService  {

    @Autowired
    private GoodsMapper goodsMapper;

    /**
     * 分页查询商品
     * @param goods
     * @return
     */
    public PageBean findGoodsByPage(Goods goods, int pageCode, int pageSize){
        //mybatis分页插件使用
        PageHelper.startPage(pageCode,pageSize);

        //调用分页查询方法，其实就是查询所有数据，mybatis自动帮我们进行分页计算
        Page<Goods> page=goodsMapper.findGoodsByPage(goods);

        return new PageBean(page.getTotal(),page.getResult());
    }

    /**
     * 根据商品id查询商品
     * @param id
     * @return
     */
    public List<Goods> findGoodsById(@RequestParam(value = "id", required = false) Long id){
        return goodsMapper.findGoodsById(id);
    }

    /**
     * 添加商品
     * @param goods
     * @return
     */
    public void addGoods(Goods goods){
        goodsMapper.addGoods(goods);
    }

    /**
     * 更新商品
     * @param goods
     */
    public void updateGoodsById(Goods goods){
         goodsMapper.updateGoodsById(goods);
    }

    /**
     * 根据商品id删除商品
     * @param ids
     */
    public void deleteGoodsById(Long... ids){
        for (Long id:ids){
            goodsMapper.deleteGoodsById(id);
        }
    }
}
