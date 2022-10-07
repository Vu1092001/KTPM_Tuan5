package com.example.QuanLyChuyenBayJPA.service;

import java.util.List;

import com.example.QuanLyChuyenBayJPA.entity.MayBay;

public interface MayBayService {
	List<MayBay> findMayBayTamBayLH10000();
	int CountMayBayLoaiBoeing();
}
