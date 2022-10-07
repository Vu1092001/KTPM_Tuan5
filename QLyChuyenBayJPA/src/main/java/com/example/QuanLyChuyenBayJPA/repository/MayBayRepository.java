package com.example.QuanLyChuyenBayJPA.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.QuanLyChuyenBayJPA.entity.MayBay;

public interface MayBayRepository extends JpaRepository<MayBay, String>{
	@Query(value = "select *from maybay where TamBay > 10000", nativeQuery = true)
	public List<MayBay> findMayBayTamBayLH10000();
	
	@Query(value = "select count(*) from maybay where Loai LIKE '%Boeing%'", nativeQuery = true)
	public int CountMayBayLoaiBoeing();
}
