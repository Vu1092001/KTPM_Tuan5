package com.example.QuanLyChuyenBayJPA.entity;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@EqualsAndHashCode
@NoArgsConstructor @AllArgsConstructor
public class ChungNhanPK implements Serializable {
    private String nhanVien;
    private int mayBay;
	public String getNhanVien() {
		return nhanVien;
	}
	public void setNhanVien(String nhanVien) {
		this.nhanVien = nhanVien;
	}
	public int getMayBay() {
		return mayBay;
	}
	public void setMayBay(int mayBay) {
		this.mayBay = mayBay;
	}
	protected ChungNhanPK(String nhanVien, int mayBay) {
		super();
		this.nhanVien = nhanVien;
		this.mayBay = mayBay;
	}
	protected ChungNhanPK() {
		super();
	}
	@Override
	public String toString() {
		return "ChungNhanPK [nhanVien=" + nhanVien + ", mayBay=" + mayBay + "]";
	}
    
    

}