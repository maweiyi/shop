package me.maweiyi.repository;

import java.util.List;
import me.maweiyi.entity.NideshopBrand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface NideshopBrandRepository extends JpaRepository<NideshopBrand, Integer> {

  @Query(value = "select * from nideshop_brand where sort_order < ?1 order by sort_order", nativeQuery = true)
  List<NideshopBrand> listNideshopBrandBySortOrder(Integer value);
}
