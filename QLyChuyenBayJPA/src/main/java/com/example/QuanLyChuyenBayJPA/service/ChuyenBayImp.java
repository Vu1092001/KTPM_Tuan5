package com.example.QuanLyChuyenBayJPA.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.QuanLyChuyenBayJPA.entity.ChuyenBay;
import com.example.QuanLyChuyenBayJPA.repository.ChuyenBayRepository;
@Service
public class ChuyenBayImp implements ChuyenBayService{
	@Autowired
	private ChuyenBayRepository chuyenBayRepository;
	@Override
	public List<ChuyenBay> findChuyenBaysDaLat() {
		// TODO Auto-generated method stub
		return chuyenBayRepository.findChuyenBaysDaLat();
	}

	@Override
	public List<ChuyenBay> findChuyenBaysDoDaiNH10000LH8000() {
		// TODO Auto-generated method stub
		return chuyenBayRepository.findChuyenBaysDoDaiNH10000LH8000();
	}

	@Override
	public List<ChuyenBay> findChuyenBaysfromSGNtoBMV() {
		// TODO Auto-generated method stub
		return chuyenBayRepository.findChuyenBaysfromSGNtoBMV();
	}

	@Override
	public int CountChuyenBaysfromSG() {
		// TODO Auto-generated method stub
		return chuyenBayRepository.CountChuyenBaysfromSG();
	}

}
