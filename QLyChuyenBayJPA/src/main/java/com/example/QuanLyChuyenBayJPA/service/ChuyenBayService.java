package com.example.QuanLyChuyenBayJPA.service;

import java.util.List;

import com.example.QuanLyChuyenBayJPA.entity.ChuyenBay;

public interface ChuyenBayService {
	List<ChuyenBay> findChuyenBaysDaLat ();
	List<ChuyenBay> findChuyenBaysDoDaiNH10000LH8000();
	List<ChuyenBay> findChuyenBaysfromSGNtoBMV();
	int  CountChuyenBaysfromSG();
}
