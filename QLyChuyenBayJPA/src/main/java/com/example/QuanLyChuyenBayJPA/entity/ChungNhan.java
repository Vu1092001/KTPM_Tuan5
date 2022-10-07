package com.example.QuanLyChuyenBayJPA.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity(name = "chungnhan")
public class ChungNhan implements Serializable {
	@Id
	@ManyToOne(optional = false)
	@JoinColumn(name = "MaNV", nullable = false)
	private NhanVien nhanVien;
	@Id
	@ManyToOne(optional = false)
	@JoinColumn(name = "MaMB", nullable = false)
	private MayBay mayBay;

	public NhanVien getNhanVien() {
		return nhanVien;
	}

	public void setNhanVien(NhanVien nhanVien) {
		this.nhanVien = nhanVien;
	}

	public MayBay getMayBay() {
		return mayBay;
	}

	public void setMayBay(MayBay mayBay) {
		this.mayBay = mayBay;
	}

	public ChungNhan(NhanVien nhanVien, MayBay mayBay) {
		super();
		this.nhanVien = nhanVien;
		this.mayBay = mayBay;
	}

	public ChungNhan() {
		super();
	}

	@Override
	public String toString() {
		return "ChungNhan [nhanVien=" + nhanVien + ", mayBay=" + mayBay + "]";
	}

}
