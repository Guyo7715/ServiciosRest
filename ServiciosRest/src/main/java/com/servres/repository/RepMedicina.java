package com.servres.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.servres.entity.Medicina;

@Repository
public interface RepMedicina extends JpaRepository<Medicina, Long> {
	
	@Query(value ="select md.* from medicina md join cita ct on md.id_cita=ct.id join paciente pt on ct.id_paciente = pt.id "
			+ " where pt.nro_documento= :nro_documento", nativeQuery= true)
	
	List<Medicina> consultaMedicina(@Param("nro_documento") Integer nro_documento);

}
