package com.fourelementSoftech.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.fourelementSoftech.entity.Timing;

@Repository
public interface TimingRepository extends JpaRepository<Timing, Serializable> {

	@Query("Select timingName from Timing")
	public List<String> getTimingsName();
}
