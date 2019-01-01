package me.maweiyi.repository;


import java.util.List;
import me.maweiyi.entity.NideshopGoods;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;

public interface NideshopGoodsRepository extends JpaRepository<NideshopGoods, Integer>, Repository<NideshopGoods, Integer> {

  List<NideshopGoods> findNideshopGoodsByIsHot(Boolean isHot);
  List<NideshopGoods> findNideshopGoodsByIsNew(Boolean isNew);
}
