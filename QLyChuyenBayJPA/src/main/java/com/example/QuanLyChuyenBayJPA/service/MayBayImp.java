package com.example.QuanLyChuyenBayJPA.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.QuanLyChuyenBayJPA.entity.MayBay;
import com.example.QuanLyChuyenBayJPA.repository.MayBayRepository;
@Service
public class MayBayImp implements MayBayService {
	@Autowired
	MayBayRepository mayBayRepository;
	@Override
	public List<MayBay> findMayBayTamBayLH10000() {
		// TODO Auto-generated method stub
		return mayBayRepository.findMayBayTamBayLH10000();
	}

	@Override
	public int CountMayBayLoaiBoeing() {
		// TODO Auto-generated method stub
		return mayBayRepository.CountMayBayLoaiBoeing();
	}
	
}
