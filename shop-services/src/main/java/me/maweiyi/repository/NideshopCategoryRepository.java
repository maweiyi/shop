package me.maweiyi.repository;

import java.util.List;
import me.maweiyi.entity.NideshopCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface NideshopCategoryRepository extends JpaRepository<NideshopCategory, Integer> {

  @Query(value = "select * from nideshop_category inner join nideshop_goods on nideshop_category.id=nideshop_goods.category_id", nativeQuery = true)
  List<NideshopCategory> listNideshopCategoryAndNideshopGoods();

  @Query(value = "select * from nideshop_category where parent_id= 0", nativeQuery = true)
  List<NideshopCategory> listNideshopCategoryWithParentId();
}
