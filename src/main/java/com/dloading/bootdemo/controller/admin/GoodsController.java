package com.dloading.bootdemo.controller.admin;


import com.dloading.bootdemo.model.Goods;
import com.dloading.bootdemo.model.PageBean;
import com.dloading.bootdemo.model.Result;
import com.dloading.bootdemo.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Dloading
 * @since 2019/12/18
 *
 * 商品控制器
 */

@RestController
@RequestMapping("/goods")
public class GoodsController {

    @Autowired
    private GoodsService goodsService;

    /**
     * 分页查询方法
     *
     * @param goods
     * @param padeCode
     * @param pageSize
     * @return
     */
    @RequestMapping("/findByConPage")
    public PageBean findByPage(Goods goods,
                               @RequestParam(value = "pageCode", required = false) int padeCode,
                               @RequestParam(value = "pageSize", required = false) int pageSize) {
        return goodsService.findGoodsByPage(goods, padeCode, pageSize);
    }

    /**
     * 增加商品方法
     * @param goods
     * @return
     */
    @RequestMapping("/create")
    public Result addGoods(@RequestBody Goods goods){
        try{
            goodsService.addGoods(goods);
            return new Result(true,"创建成功");
        }catch (Exception e){
            e.printStackTrace();
            return new Result(false,"未知错误");
        }
    }

    /**
     * 更新商品数据
     * @param goods
     * @return
     */
    @RequestMapping("/update")
    public Result updateGoodsById(@RequestBody Goods goods){
        try{
            if (goods!=null&&goods.getId()!=null){
                goodsService.updateGoodsById(goods);
                return new Result(true,"更新数据成功");
            }else {
                return new Result(false,"数据为空或id不存在");
            }
        }catch (Exception e){
            e.printStackTrace();
            return new Result(false,"发生未知错误");
        }
    }

    /**
     * 根据id查询商品集
     * @param id
     * @return
     */
    @RequestMapping("/findById")
    public List<Goods> findGoodsById(@RequestParam(value = "id",required = false) Long id){
        return goodsService.findGoodsById(id);
    }

    /**
     * 批量删除
     * @param ids
     * @return
     */
    @RequestMapping("/delete")
    public Result deleteGoods(@RequestBody Long... ids){
        try {
            goodsService.deleteGoodsById(ids);
            return new Result(true,"删除数据成功");
        }catch (Exception e){
            e.printStackTrace();
            return new Result(false,"发生未知错误");
        }
    }
}
