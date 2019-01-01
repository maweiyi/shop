package me.maweiyi.repository;

import me.maweiyi.entity.NideshopChannel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NideshopChannelRepository extends JpaRepository<NideshopChannel, Integer> {
}
