create database QLKS


use QLKS

create table Login(
	username nvarchar(20),
	passwordd nvarchar(25),
	primary key (username)
)

insert into Login values('admin', '12345');

select * from Login

drop table 
create table Khach_Hang (
	ID int identity,
	TenKH nvarchar(50) not null,
	Diachi nvarchar(50) ,
	SDT nvarchar(11),
	gender nvarchar(15),
	room nvarchar(10)
)
drop table Khach_Hang
select * from Khach_Hang where id = 7


create table Loai_Phong(
	MaPhong nvarchar(50) primary key,
	tinhTrang nvarchar(50),
	cleanStatus nvarchar(50),
	bedType nvarchar(50),
	Gia varchar(50),
)
drop table Loai_Phong
select MaPhong from Loai_Phong where tinhTrang = N'Trống' and cleanStatus = N'Đã vệ sinh'

select * from Loai_Phong
update Loai_Phong set tinhTrang = N'Trống' , cleanStatus= N'Chưa vệ sinh' where MaPhong =N'101'



create table KH_CheckOut(
	ID int identity,
	TenKH nvarchar(50) not null,
	Diachi nvarchar(50) ,
	SDT nvarchar(11),
	gender nvarchar(15),
	room nvarchar(10)
)
drop database QLKS

select * from KH_CheckOut


create table employee(
	ID int identity primary key,
	TenNV nvarchar(50) not null,
	Age varchar(10),
	gender nvarchar(10),
	job nvarchar(50),
	Luong varchar(50),
	phone varchar(11),
	Diachi nvarchar(50),
)


select * from employee

