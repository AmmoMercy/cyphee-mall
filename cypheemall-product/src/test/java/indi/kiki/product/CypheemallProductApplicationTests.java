package indi.kiki.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import indi.kiki.product.entity.BrandEntity;
import indi.kiki.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Iterator;
import java.util.List;

@SpringBootTest
class CypheemallProductApplicationTests {
    @Autowired
    BrandService bs;

    @Test
    void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();
//        brandEntity.setName("Apple");
//        bs.save(brandEntity);
//        System.out.println("保存成功...");
//        brandEntity.setBrandId(1L);
//        brandEntity.setDescript("Think Different");
//        bs.updateById(brandEntity);
        List<BrandEntity> brand_id = bs.list(new QueryWrapper<BrandEntity>().eq("brand_id", 1L));
        for (Iterator<BrandEntity> iterator = brand_id.iterator(); iterator.hasNext(); ) {
            BrandEntity next = iterator.next();
            System.out.println(next);
        }
    }

}
