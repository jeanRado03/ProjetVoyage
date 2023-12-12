package com.example.testweb.repository;

import com.example.testweb.model.Bouquet_Activite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface BouquetActiviteRepository extends JpaRepository<Bouquet_Activite, String> {
    @Query(value = "SELECT * FROM getSequence(:length , :prefix, :sequence)", nativeQuery = true)
    String getSequence(@Param("length") int length, @Param("prefix") String prefix, @Param("sequence") int sequence);

    @Query(value = "SELECT * FROM v_nextbouquetactivite", nativeQuery = true)
    int getNextVal();
}
