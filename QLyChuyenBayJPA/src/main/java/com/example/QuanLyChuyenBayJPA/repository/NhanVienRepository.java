package com.example.QuanLyChuyenBayJPA.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.QuanLyChuyenBayJPA.entity.NhanVien;

public interface NhanVienRepository  extends JpaRepository<NhanVien, String>{
	@Query(value = "select *from nhanvien where Luong < 10000", nativeQuery = true)
	public List<NhanVien> findNVLuongNH10000();
	
	@Query(value = "SELECT SUM(Luong) FROM nhanvien", nativeQuery = true)
	public int TongLuongNVPhaiTra();
	
	@Query(value = "select c.MaNV from chungnhan c join maybay m on c.MaMB=m.MaMB where m.Loai like '%Boeing%'", nativeQuery = true)
	public List<String> findNVLaiBoeing();
	
	@Query(value = "select  n.MaNV,n.Ten,n.Luong FROM chungnhan c join nhanvien n on c.MaNV = N.MaNV where c.MaMB = 747", nativeQuery = true)
	public List<NhanVien> findNVByMaMB();

}
