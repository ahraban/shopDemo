package cz.ahraban.demoshop.repository;

import cz.ahraban.demoshop.entity.WatchEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WatchRepository extends JpaRepository<WatchEntity, Long> {
}
