package com.example.QuanLyChuyenBayJPA.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.QuanLyChuyenBayJPA.entity.NhanVien;
import com.example.QuanLyChuyenBayJPA.repository.NhanVienRepository;
@Service
public class NhanVienImp implements NhanVienService {
	@Autowired
	NhanVienRepository nhanVienRepository;
	@Override
	public List<NhanVien> findNVLuongNH10000() {
		// TODO Auto-generated method stub
		return nhanVienRepository.findNVLuongNH10000();
	}

	@Override
	public int TongLuongNVPhaiTra() {
		// TODO Auto-generated method stub
		return nhanVienRepository.TongLuongNVPhaiTra();
	}

	@Override
	public List<String> findNVLaiBoeing() {
		// TODO Auto-generated method stub
		return nhanVienRepository.findNVLaiBoeing();
	}

	@Override
	public List<NhanVien> findNVByMaMB() {
		// TODO Auto-generated method stub
		return nhanVienRepository.findNVByMaMB();
	}

}
