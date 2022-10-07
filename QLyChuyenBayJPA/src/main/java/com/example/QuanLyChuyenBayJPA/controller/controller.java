package com.example.QuanLyChuyenBayJPA.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.QuanLyChuyenBayJPA.entity.ChuyenBay;
import com.example.QuanLyChuyenBayJPA.entity.MayBay;
import com.example.QuanLyChuyenBayJPA.entity.NhanVien;
import com.example.QuanLyChuyenBayJPA.repository.ChuyenBayRepository;
import com.example.QuanLyChuyenBayJPA.repository.MayBayRepository;
import com.example.QuanLyChuyenBayJPA.repository.NhanVienRepository;

@RestController
public class controller {
	@Autowired
	ChuyenBayRepository chuyenBayRepository; 
	@Autowired
	MayBayRepository mayBayRepository;
	@Autowired
	NhanVienRepository nhanVienRepository;
	//////////////////Cho biết các chuyến bay đi Đà Lạt (DAD)./////////////////////////
	@GetMapping("/bai1")
	public List<ChuyenBay> bai1() {
		return chuyenBayRepository.findChuyenBaysDaLat();
	}
	///////////////////Cho biết các loại máy bay có tầm bay lớn hơn 10,000km////////////////////////
	@GetMapping("/bai2")
	public List<MayBay> bai2(){
		return mayBayRepository.findMayBayTamBayLH10000();
	}
	////////////////Tìm các nhân viên có lương nhỏ hơn 10,000.///////////////////////////
	@GetMapping("/bai3")
	public List<NhanVien> bai3(){
		return nhanVienRepository.findNVLuongNH10000();
	}
	////////////////Cho biết các chuyến bay có độ dài đường bay nhỏ hơn 10.000km và lớn hơn 8.000km.////////////////
	@GetMapping("/bai4")
	public List<ChuyenBay> bai4(){
		return chuyenBayRepository.findChuyenBaysDoDaiNH10000LH8000();
	}
	//Cho biết các chuyến bay xuất phát từ Sài Gòn (SGN) đi Ban Mê Thuộc (BMV).
	@GetMapping("/bai5")
	public List<ChuyenBay> findChuyenBaysfromSGNtoBMV(){
		return chuyenBayRepository.findChuyenBaysfromSGNtoBMV();
	} 
}
