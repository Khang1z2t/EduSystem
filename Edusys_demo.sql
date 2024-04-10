use master

create database EduSystem
go

use EduSystem
go

-- cac bang 
-- Trang Thai da xoa hay chua 0 false 1 true
create table NhanVien(
	MaNV nvarchar(50) not null,
	Email nvarchar(50) not null,
	MatKhau nvarchar(50) not null,
	HoTen nvarchar(50) not null,
	TinhTrang nvarchar(10),
	Hinh nvarchar(50),
	VaiTro bit not null,
	TrangThai bit not null,
	primary key(MaNV)
)
go

create table ChuyenDe(
	MaCD nvarchar(5) not null,
	TenCD nvarchar(50) not null,
	HocPhi float not null,
	ThoiLuong int not null,
	Hinh nvarchar(50) not null,
	MoTa nvarchar(255) not null,
	TrangThai bit not null,
	primary key(MaCD)
)
go

create table KhoaHoc(
	MaKH int identity(1,1) not null,
	MaCD nvarchar(5) not null,
	HocPhi float not null,
	ThoiLuong int not null,
	NgayKG date not null,
	GhiChu nvarchar(50) not null,
	MaNV nvarchar(50) not null,
	NgayTao date not null,
	TrangThai bit not null,
	primary key(MaKH),
	foreign key(MaCD) references ChuyenDe(MaCD),
	foreign key(MaNV) references NhanVien(MaNV)
)
go

create table NguoiHoc(
	MaNH nvarchar(7) not null, 
	HoTen nvarchar(50) not null,
	NgaySinh date not null,
	GioiTinh bit not null,
	DienThoai nvarchar(50) not null,
	Email nvarchar(50) not null,
	GhiChu nvarchar(max) null,
	MaNV nvarchar(50) not null,
	NgayDK date not null,
	TrangThai bit not null,
	primary key(MaNH),
	foreign key(MaNV) references NhanVien(MaNV)
)
go

create table HocVien(
	MaHV int identity(1,1) not null,
	MaKH int not null,
	MaNH nvarchar(7) not null,
	Diem float not null,
	TrangThai bit not null,
	primary key(MaHV),
	foreign key(MaNH) references NguoiHoc(MaNH) on delete no action on update cascade,
	foreign key(MaKH) references KhoaHoc(MaKH) on delete cascade on update cascade
)
go


-- cac stored procedure 
create proc sp_ThongKeNguoiHoc
as 
begin 
	select 
		year(NgayDK) Nam,
		count(*) SoLuong,
		min(NgayDK) DauTien,
		max(NgayDK) CuoiCung
	from NguoiHoc
	group by year(NgayDK)
end
go

create proc sp_BangDiem(@MaKH int)
as 
begin
	select 
		nh.MaNH,
		nh.HoTen, 
		hv.Diem,
		hv.TrangThai
	from HocVien hv 
	inner join NguoiHoc nh on nh.MaNH = hv.MaNH
	where hv.MaKH = @MaKH and hv.TrangThai = 0
	order by hv.Diem desc
end
go

create proc sp_ThongKeDiem
as
begin
	select 
		TenCD ChuyenDe,
		count(MaHV) SoHV,
		min(Diem) ThapNhat,
		max(Diem) CaoNhat,
		avg(Diem) TrungBinh
	from KhoaHoc kh
	inner join HocVien hv on kh.MaKH = hv.MaKH
	inner join ChuyenDe cd on cd.MaCD = kh.MaCD
	group by TenCD
end 
go

create proc sp_ThongKeDoanhThu(@year int)
as 
begin
	select 
		TenCD ChuyenDe,
		count(distinct kh.MaKH) SoKH,
		count(hv.MaHV) SoHV,
		sum(kh.HocPhi) DoanhThu,
		min(kh.HocPhi) ThapNhat,
		max(kh.HocPhi) CaoNhat,
		avg(kh.HocPhi) TrungBinh
	from KhoaHoc kh
	inner join HocVien hv on hv.MaKH = kh.MaKH
	inner join ChuyenDe cd on cd.MaCD = kh.MaCD
	where year(NgayKG) = @year
	group by TenCD
end
go

alter table NhanVien add constraint [DF_NV_VaiTro] default ((0)) for [VaiTro]
go

alter table NhanVien add constraint [DF_NV_TrangThai] default ((0)) for [TrangThai]
go

alter table ChuyenDe add constraint [DF_CD_HocPhi] default ((0)) for [HocPhi]
go

alter table ChuyenDe add constraint [DF_CD_ThoiLuong] default ((0)) for [ThoiLuong]
go

alter table ChuyenDe add constraint [DF_CD_MoTa] default ('') for [MoTa]
go

alter table ChuyenDe add constraint [DF_CD_Hinh] default ('profile.png') for [Hinh]
go

alter table ChuyenDe add constraint [DF_CD_TrangThai] default ((0)) for [TrangThai]
go
 
alter table KhoaHoc add constraint [DF_KH_HocPhi] default ((0)) for [HocPhi]
go

alter table KhoaHoc add constraint [DF_KH_ThoiLuong] default ((0)) for [ThoiLuong]
go

alter table KhoaHoc add constraint [DF_KH_NgayTao] default (getdate()) for [NgayTao]
go

alter table KhoaHoc add constraint [DF_KH_TrangThai] default ((0)) for [TrangThai]
go

alter table NguoiHoc add constraint [DF_NH_NgayDK] default (getdate()) for [NgayDK]
go

alter table NguoiHoc add constraint [DF_NH_TrangThai] default ((0)) for [TrangThai]
go

alter table HocVien add constraint [DF_HV_Diem] default ((0)) for [Diem]
go

alter table HocVien add constraint [DF_HV_TrangThai] default ((0)) for [TrangThai]
go

insert into NhanVien
values 
	(N'admin', 'khangdqbps36645@fpt.edu.vn', '123', N'Bảo Khang', N'Chưa có', null, 1, 0),
	(N'khang', 'ngoc.duyen.260615@gmail.com', '123', N'Bảo Khang', N'Chưa có', 'khang.png', 1, 0),
	(N'yuno', 'kbao040@gmail.com', '123', N'Khang Yuno', N'Đã có', 'yuno.png', 0, 0)
go     

insert into KhoaHoc(MaKH,MaCD, HocPhi, ThoiLuong, NgayKG, GhiChu, MaNV, NgayTao, TrangThai)
values (1,'JAV01', 250, 90, '04-04-2024', N'test', 'khang', '01-04-2024', 0)
go

