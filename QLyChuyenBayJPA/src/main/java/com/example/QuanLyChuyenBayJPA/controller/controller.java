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
import com.example.QuanLyChuyenBayJPA.service.ChuyenBayService;
import com.example.QuanLyChuyenBayJPA.service.MayBayService;
import com.example.QuanLyChuyenBayJPA.service.NhanVienService;

@RestController
public class controller {
	@Autowired 
	ChuyenBayService chuyenBayService;
	@Autowired
	MayBayService mayBayService;
	@Autowired
	NhanVienService nhanVienService;
	//////////////////Cho biết các chuyến bay đi Đà Lạt (DAD)./////////////////////////
	@GetMapping("/bai1")
	public List<ChuyenBay> bai1() {
		return chuyenBayService.findChuyenBaysDaLat();
	}
	///////////////////Cho biết các loại máy bay có tầm bay lớn hơn 10,000km////////////////////////
	@GetMapping("/bai2")
	public List<MayBay> bai2(){
		return mayBayService.findMayBayTamBayLH10000();
	}
	////////////////Tìm các nhân viên có lương nhỏ hơn 10,000.///////////////////////////
	@GetMapping("/bai3")
	public List<NhanVien> bai3(){
		return nhanVienService.findNVLuongNH10000();
	}
	////////////////Cho biết các chuyến bay có độ dài đường bay nhỏ hơn 10.000km và lớn hơn 8.000km.////////////////
	@GetMapping("/bai4")
	public List<ChuyenBay> bai4(){
		return chuyenBayService.findChuyenBaysDoDaiNH10000LH8000();
	}
	//Cho biết các chuyến bay xuất phát từ Sài Gòn (SGN) đi Ban Mê Thuộc (BMV).
	@GetMapping("/bai5")
	public List<ChuyenBay> findChuyenBaysfromSGNtoBMV(){
		return chuyenBayService.findChuyenBaysfromSGNtoBMV();
	}
	//Có bao nhiêu chuyến bay xuất phát từ Sài Gòn (SGN)
	@GetMapping("/bai6")
	public int CountChuyenBaysfromSG() {
		return chuyenBayService.CountChuyenBaysfromSG();
	}
	//Có bao nhiêu loại máy báy Boeing
	@GetMapping("/bai7")
	public int CountMayBayLoaiBoeing() {
		return mayBayService.CountMayBayLoaiBoeing();
	}
	//Cho biết tổng số lương phải trả cho các nhân viên.
	@GetMapping("/bai8")
	public int TongLuongNVPhaiTra() {
		return nhanVienService.TongLuongNVPhaiTra();
	}
	//Cho biết mã số của các phi công lái máy báy Boeing.
	@GetMapping("/bai9")
	public List<String> findNVLaiBoeing(){
		return nhanVienService.findNVLaiBoeing();
	}
	//Cho biết các nhân viên có thể lái máy bay có mã số 747
	@GetMapping("/bai10")
	public List<NhanVien> findNVByMaMB(){
		return nhanVienService.findNVByMaMB();
	}
	
}
