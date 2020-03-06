package com.icoom.repository;

import com.icoom.dataobject.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest {
    @Autowired
    private ProductCategoryRepository repository;

//    @Test
//    public void findOne() throws Exception{
//        ProductCategory productCategory = repository.findOne(2);
//        System.out.println(productCategory.toString());
//        productCategory.setCategoryName("男生最爱");
//        productCategory.setCategoryType(4);
//        repository.save(productCategory);
//    }

    @Test
    @Transactional
    public void saveTest() throws Exception{
        ProductCategory productCategory = new ProductCategory("男生最爱",3);
        ProductCategory result = repository.save(productCategory);
        //判断是否为空
        Assert.assertNotNull(result);
    }

    @Test
    public void findByCategoryTypeIn() throws Exception{
        List<Integer> list = Arrays.asList(2,3,4);

        List<ProductCategory> result = repository.findByCategoryTypeIn(list);
        Assert.assertNotEquals(0,result.size());
    }
}
