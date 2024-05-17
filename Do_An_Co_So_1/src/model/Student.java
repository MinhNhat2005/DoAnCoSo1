package model;

import java.util.Scanner;

public class Student {
	private int id;
	private String masv;
	private String ten;
	private String lop;
	private String phong;


	public Student() {
		this.masv = "";
		this.ten = "";
		this.lop = "";
		this.phong = "";
		
	}

	public Student(String masv, String ten, String lop, String phong) {
		this.masv = masv;
		this.ten = ten;
		this.lop = lop;
		this.phong = phong;
		
	}

	public Student(int id, String masv, String ten, String lop, String phong) {
		this.id = id;
		this.masv = masv;
		this.ten = ten;
		this.lop = lop;
		this.phong = phong;
	
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMasv() {
		return masv;
	}

	public void setMasv(String masv) {
		this.masv = masv;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public String getLop() {
		return lop;
	}

	public void setLop(String lop) {
		this.lop = lop;
	}

	public String getPhong() {
		return phong;
	}

	public void setPhong(String phong) {
		this.phong = phong;
	}
	

	public void input() {
		try (Scanner sc = new Scanner(System.in)) {
			try {

				System.out.print("Nhập mã sinh viên: ");
				this.masv = sc.nextLine();
				System.out.print("Nhập tên: ");
				this.ten = sc.nextLine();
				System.out.println("Nhập tên lớp: ");
				this.lop = sc.nextLine();
				System.out.print("Nhập địa chỉ: ");
				this.phong = sc.nextLine();
				
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", masv=" + masv + ", ten=" + ten + ", lop=" + lop + ", phong=" + phong +  "]";
	}

}