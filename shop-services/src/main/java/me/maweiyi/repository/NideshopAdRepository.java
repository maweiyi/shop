package me.maweiyi.repository;

import me.maweiyi.entity.NideshopAd;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NideshopAdRepository extends JpaRepository<NideshopAd, Integer> {

}
