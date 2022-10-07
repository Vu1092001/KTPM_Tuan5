package com.example.QuanLyChuyenBayJPA.service;

import java.util.List;

import com.example.QuanLyChuyenBayJPA.entity.NhanVien;

public interface NhanVienService {
	List<NhanVien> findNVLuongNH10000();
	int TongLuongNVPhaiTra();
	List<String> findNVLaiBoeing();
	List<NhanVien> findNVByMaMB();
}
