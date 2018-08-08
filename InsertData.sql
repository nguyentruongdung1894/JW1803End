﻿INSERT dbo.Danhmuccha 
        ( Ten_danh_muc_cha )
VALUES  ( N'Men'  -- Ten_danh_muc - nvarchar(50)
          )
INSERT dbo.Danhmuccha
        ( Ten_danh_muc_cha )
VALUES  ( N'Women'  -- Ten_danh_muc - nvarchar(50)
          )
INSERT dbo.Danhmuccha 
        ( Ten_danh_muc_cha )
VALUES  ( N'Bag'  -- Ten_danh_muc - nvarchar(50)
          )
INSERT dbo.Danhmuccha
        ( Ten_danh_muc_cha )
VALUES  ( N'Footwear'  -- Ten_danh_muc - nvarchar(50)
          )
--Insert Men-----------------------------------------------------
INSERT dbo.Danhmuccon VALUES  (1, N'Clothing', 1, 1)
INSERT dbo.Danhmuccon VALUES  (1, N'Wallets', 2, 1)
INSERT dbo.Danhmuccon VALUES  (1, N'Footwear', 3, 1)
INSERT dbo.Danhmuccon VALUES  (1, N'Watches', 4, 1)
INSERT dbo.Danhmuccon VALUES  (1, N'Accessories', 5, 1)
INSERT dbo.Danhmuccon VALUES  (1, N'Bags', 6, 1)
INSERT dbo.Danhmuccon VALUES  (1, N'Caps & Hats', 7, 1)


INSERT dbo.Danhmuccon VALUES  (1, N'Jewellery', 8, 1)
INSERT dbo.Danhmuccon VALUES  (1, N'Sunglasses', 9, 1)
INSERT dbo.Danhmuccon VALUES  (1, N'Perfumes', 10, 1)
INSERT dbo.Danhmuccon VALUES  (1, N'Beauty', 11, 1)
INSERT dbo.Danhmuccon VALUES  (1, N'Shirts', 12, 1)
INSERT dbo.Danhmuccon VALUES  (1, N'Sunglasses', 13, 1)
INSERT dbo.Danhmuccon VALUES  (1, N'Swimwear', 14, 1)

--Insert Women-----------------------------------------------------
INSERT dbo.Danhmuccon VALUES  (2, N'Clothing', 1, 1)
INSERT dbo.Danhmuccon VALUES  (2, N'Wallets', 2, 1)
INSERT dbo.Danhmuccon VALUES  (2, N'Footwear', 3, 1)
INSERT dbo.Danhmuccon VALUES  (2, N'Watches', 4, 1)
INSERT dbo.Danhmuccon VALUES  (2, N'Accessories', 5, 1)
INSERT dbo.Danhmuccon VALUES  (2, N'Bags', 6, 1)
INSERT dbo.Danhmuccon VALUES  (2, N'Caps & Hats', 7, 1)


INSERT dbo.Danhmuccon VALUES  (2, N'Jewellery', 8, 1)
INSERT dbo.Danhmuccon VALUES  (2, N'Sunglasses', 9, 1)
INSERT dbo.Danhmuccon VALUES  (2, N'Perfumes', 10, 1)
INSERT dbo.Danhmuccon VALUES  (2, N'Beauty', 11, 1)
INSERT dbo.Danhmuccon VALUES  (2, N'Shirts', 12, 1)
INSERT dbo.Danhmuccon VALUES  (2, N'Sunglasses', 13, 1)
INSERT dbo.Danhmuccon VALUES  (2, N'Swimwear', 14, 1)

INSERT dbo.Danhmuccon VALUES  (3, N'Sunglasses', 13, 1)
INSERT dbo.Danhmuccon VALUES  (4, N'Swimwear', 14, 1)

--Insert Khuyen Mai-----------------------------------------------------
INSERT dbo.Khuyenmai VALUES  ( '2018-01-02', '2018-02-24', 0)
INSERT dbo.Khuyenmai VALUES  ( '1980-02-01', '1980-02-25', 10)
INSERT dbo.Khuyenmai VALUES  ( '2018-03-01', '2018-04-13', 20)
INSERT dbo.Khuyenmai VALUES  ( '2018-03-12', '2018-03-20', 30)
INSERT dbo.Khuyenmai VALUES  ( '2018-05-01', '2018-06-02', 40)
INSERT dbo.Khuyenmai VALUES  ( '2018-05-01', '2018-05-08', 50)

--Insert Nha Cung Cap-----------------------------------------------------
DELETE FROM dbo.Nha_cung_cap
DBCC CHECKIDENT ('Nha_cung_cap', RESEED, 0)
INSERT dbo.Nha_cung_cap VALUES  ( N'Pháp', N'Hà Nội', 0982220891 ,'14141998')
INSERT dbo.Nha_cung_cap VALUES  ( N'P.A Việt Nam', N'Hà Nội', 0982220891 ,'14141998')
INSERT dbo.Nha_cung_cap VALUES  ( N'Tenten.vn', N'Hà Nội', 0982220891 ,'14141998')
INSERT dbo.Nha_cung_cap VALUES  ( N'Mắt Bão', N'Hà Nội', 0982220891 ,'14141998')
INSERT dbo.Nha_cung_cap VALUES  ( N'Nhân Hòa', N'Hà Nội', 0982220891 ,'14141998')
INSERT dbo.Nha_cung_cap VALUES  ( N'FPT', N'Hà Nội', 0982220891 ,'14141998')

--Insert Ma Hinh Anh-----------------------------------------------------
INSERT dbo.Danh_muc_anh VALUES  ( '../jsp/', '../jsp/', '../jsp/' )

--Insert Product-----------------------------------------------------
DELETE FROM dbo.SanPham
DBCC CHECKIDENT ('SanPham', RESEED, 0)

INSERT dbo.SanPham VALUES  ( 1 , N'Formal Blue Shirt' , '../jsp/images/m1.jpg' , '2013-02-15'  , 50 , 'New' , 642.21 , 1 ,25 , 1 , 1)
INSERT dbo.SanPham VALUES  ( 2 , N'Gabi Full Sleeve Sweatshirt' , '../jsp/images/m2.jpg' , '2013-02-15'  , 50 , 'New' , 212.24 , 1 ,25 , 1 , 1)
INSERT dbo.SanPham VALUES  ( 3 , N'Dark Blue Track Pants' , '../jsp/images/m3.jpg' , '2013-02-15'  , 50 , 'New' , 544.41 , 1 ,25 , 1 , 1)
INSERT dbo.SanPham VALUES  ( 4 , N'Round Neck Black T-Shirt' , '../jsp/images/m4.jpg' , '2013-02-15'  , 50 , 'New' , 124.54 , 1 ,25 , 1 , 1)
INSERT dbo.SanPham VALUES  ( 5 , N'Men Black Jeans' , '../jsp/images/m5.jpg' , '2013-02-15'  , 50 , 'New' , 642.21 , 1 ,25 , 1 , 1)
INSERT dbo.SanPham VALUES  ( 6 , N'Analog Watch' , '../jsp/images/m7.jpg' , '2013-02-15'  , 50 , 'New' , 212.24 , 1 ,25 , 1 , 1)
INSERT dbo.SanPham VALUES  ( 7 , N'Reversible Belt' , '../jsp/images/m6.jpg' , '2013-02-15'  , 50 , 'New' , 544.41 , 1 ,25 , 1 , 1)
INSERT dbo.SanPham VALUES  ( 8 , N'Party Men Blazer' , '../jsp/images/m8.jpg' , '2013-02-15' , 50 , 'New' , 124.54 , 1 ,25 , 1 , 1)


INSERT dbo.SanPham VALUES  ( 15 , N'Quần Bò' , '../jsp/images/w1.jpg' , '2013-02-15'  , 50 , 'New' , 300000 , 1 ,25 , 1 , 1)
INSERT dbo.SanPham VALUES  ( 16 , N'Quần Bò' , '../jsp/images/w2.jpg' , '2013-02-15'  , 50 , 'New' , 300000 , 1 ,25 , 1 , 1)
INSERT dbo.SanPham VALUES  ( 15 , N'Quần Jean' , '../jsp/images/w3.jpg' , '2013-02-15'  , 50 , 'New' , 300000 , 1 ,25 , 1 , 1)
INSERT dbo.SanPham VALUES  ( 16 , N'Quần Jean' , '../jsp/images/w4.jpg' , '2013-02-15'  , 50 , 'New' , 300000 , 1 ,25 , 1 , 1)
INSERT dbo.SanPham VALUES  ( 17 , N'Pink Track Pants' , '../jsp/images/w5.jpg' , '2013-02-15'  , 50 , 'New' , 141.54 , 1 ,25 , 1 , 1)
INSERT dbo.SanPham VALUES  ( 18 , N'Analog Watch' , '../jsp/images/w6.jpg' , '2013-02-15'  , 50 , 'New' , 545.14 , 1 ,25 , 1 , 1)
INSERT dbo.SanPham VALUES  ( 19 , N'Ankle Length Socks' , '../jsp/images/w7.jpg' , '2013-02-15'  , 50 , 'New' , 151.21 , 1 ,25 , 1 , 1)
INSERT dbo.SanPham VALUES  ( 20 , N'Reebok Women Tights' , '../jsp/images/w8.jpg' , '2013-02-15'  , 50 , 'New' , 125.44 , 1 ,25 , 1 , 1)

----------------Insert Túi----------------------------------------------

INSERT dbo.SanPham VALUES  ( 29 , N'Laptop Messenger Bag' , '../jsp/images/b1.jpg' , '2018-07-12'  , 50 , 'New' , 150.99 , 1 ,25 , 1 , 1)
INSERT dbo.SanPham VALUES  ( 29 , N'Puma Backpack' , '../jsp/images/b2.jpg' , '2018-07-12'  , 50 , 'New' , 150.99 , 1 ,25 , 1 , 1)
INSERT dbo.SanPham VALUES  ( 29 , N' Laptop Backpack' , '../jsp/images/b3.jpg' , '2018-07-12'  , 50 , 'New' , 150.99 , 1 ,25 , 1 , 1)
INSERT dbo.SanPham VALUES  ( 29 , N'Travel Duffel Bag' , '../jsp/images/b4.jpg' , '2018-07-12'  , 50 , 'New' , 150.99 , 1 ,25 , 1 , 1)
INSERT dbo.SanPham VALUES  ( 29 , N' Hand-held Bag' , '../jsp/images/b5.jpg' , '2018-07-12' , 50 , 'New' , 150.99 , 1 ,25 , 1 , 1)
INSERT dbo.SanPham VALUES  ( 29 , N'Butterflies Bag' , '../jsp/images/b6.jpg' , '2018-07-12'  , 50 , 'New' , 150.99 , 1 ,25 , 1 , 1)
INSERT dbo.SanPham VALUES  ( 29 , N'Costa Swiss Bag' , '../jsp/images/b7.jpg' , '2018-07-12'  , 50 , 'New' , 150.99 , 1 ,25 , 1 , 1)
INSERT dbo.SanPham VALUES  ( 29 , N'Noble Designs Bag' , '../jsp/images/b8.jpg' , '2018-07-12'  , 50 , 'New' , 150.99 , 1 ,25 , 1 , 1)

INSERT dbo.SanPham VALUES  ( 30 , N'Running Shoes' , '../jsp/images/s1.jpg' , '2018-07-12' , 50 , 'New' , 120.25 , 1 ,25 , 1 , 1)
INSERT dbo.SanPham VALUES  ( 30 , N'Shoetopia Lace Up' , '../jsp/images/s2.jpg' , '2018-05-12'  , 50 , 'New' , 132.32 , 1 ,25 , 1 , 1)
INSERT dbo.SanPham VALUES  ( 30 , N'Steemo Casuals(Black)' , '../jsp/images/s3.jpg' , '2018-03-23'  , 50 , 'New' , 147.45 , 1 ,25 , 1 , 1)
INSERT dbo.SanPham VALUES  ( 30 , N'Benetton Flip Flops' , '../jsp/images/s4.jpg' , '2018-04-18' , 50 , 'New' , 255.78 , 1 ,25 , 1 , 1)
INSERT dbo.SanPham VALUES  ( 30 , N'Moonwalk Bellies' , '../jsp/images/s5.jpg' , '2018-02-11'  , 50 , 'New' , 125.21 , 1 ,25 , 1 , 1)
INSERT dbo.SanPham VALUES  ( 30 , N'Aero Canvas Loafers' , '../jsp/images/s6.jpg' , '2018-10-12'  , 50 , 'New' , 675.78 , 1 ,25 , 1 , 1)
INSERT dbo.SanPham VALUES  ( 30 , N'Sparx Sporty Canvas Shoes' , '../jsp/images/s7.jpg' , '2018-09-24'  , 50 , 'New' , 542.54 , 1 ,25 , 1 , 1)
INSERT dbo.SanPham VALUES  ( 30 , N'Women BLACK Heels' , '../jsp/images/s8.jpg' , '2018-01-12'  , 50 , 'New' , 687.15 , 1 ,25 , 1 , 1)



INSERT dbo.Khach_hang
        ( Ten_khach_hang ,
          Ten_dang_nhap ,
          Mat_khau ,
          Dia_chi ,
          So_dien_thoai ,
          Gmail ,
          Ngay_sinh ,
          Quyen_truy_cap
        )
VALUES  ( N'Dũng' , -- Ten_khach_hang - nvarchar(20)
          'admin' , -- Ten_dang_nhap - varchar(20)
          'admin' , -- Mat_khau - varchar(20)
          N'Hưng Hà Thái Bình' , -- Dia_chi - nvarchar(50)
          123 , -- So_dien_thoai - int
          'nguyendung1894' , -- Gmail - varchar(20)
          '1998-04-01' , -- Ngay_sinh - date
          1  -- Quyen_truy_cap - int
        )
INSERT dbo.Khach_hang
        ( Ten_khach_hang ,
          Ten_dang_nhap ,
          Mat_khau ,
          Dia_chi ,
          So_dien_thoai ,
          Gmail ,
          Ngay_sinh ,
          Quyen_truy_cap
        )
VALUES  ( N'Anh' , -- Ten_khach_hang - nvarchar(20)
          'admin1' , -- Ten_dang_nhap - varchar(20)
          'admin1' , -- Mat_khau - varchar(20)
          N'Hưng Hà Thái Bình' , -- Dia_chi - nvarchar(50)
          123 , -- So_dien_thoai - int
          'nguyendung1894' , -- Gmail - varchar(20)
          '1998-04-01' , -- Ngay_sinh - date
          1  -- Quyen_truy_cap - int
        )
INSERT dbo.Khach_hang
VALUES  ( N'Anh' , -- Ten_khach_hang - nvarchar(20)
          'user1' , -- Ten_dang_nhap - varchar(20)
          'user1' , -- Mat_khau - varchar(20)
          N'Hưng Hà Thái Bình' , -- Dia_chi - nvarchar(50)
          123 , -- So_dien_thoai - int
          'nguyendung1894' , -- Gmail - varchar(20)
          '1998-04-01' , -- Ngay_sinh - date
          2  -- Quyen_truy_cap - int
        )
INSERT dbo.Khach_hang
VALUES  ( N'Duc' , -- Ten_khach_hang - nvarchar(20)
          'user2' , -- Ten_dang_nhap - varchar(20)
          'user2' , -- Mat_khau - varchar(20)
          N'Hưng Hà Thái Bình' , -- Dia_chi - nvarchar(50)
          123 , -- So_dien_thoai - int
          'nguyendung1894' , -- Gmail - varchar(20)
          '1998-04-01' , -- Ngay_sinh - date
          2  -- Quyen_truy_cap - int
        )