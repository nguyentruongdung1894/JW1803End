USE [ProjectEnd]
GO
/****** Object:  Table [dbo].[Binh_luan]    Script Date: 25/07/2018 12:15:35 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Binh_luan](
	[Ma_khach_hang] [int] NOT NULL,
	[Ma_san_pham] [int] NOT NULL,
	[Ngay_binh_luan] [date] NULL,
	[Trang_thai] [bit] NULL,
PRIMARY KEY CLUSTERED 
(
	[Ma_khach_hang] ASC,
	[Ma_san_pham] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[Danh_muc_anh]    Script Date: 25/07/2018 12:15:35 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Danh_muc_anh](
	[Ma_hinh_anh] [int] IDENTITY(1,1) NOT NULL,
	[Url1] [varchar](50) NOT NULL,
	[Url2] [varchar](50) NOT NULL,
	[Url3] [varchar](50) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[Ma_hinh_anh] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Danhmuccha]    Script Date: 25/07/2018 12:15:35 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Danhmuccha](
	[Ma_danh_muc_cha] [int] IDENTITY(1,1) NOT NULL,
	[Ten_danh_muc_cha] [nvarchar](50) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[Ma_danh_muc_cha] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[Danhmuccon]    Script Date: 25/07/2018 12:15:35 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Danhmuccon](
	[Ma_danh_muc_con] [int] IDENTITY(1,1) NOT NULL,
	[Ma_danh_muc_cha] [int] NOT NULL,
	[Ten_danh_muc_con] [nvarchar](50) NOT NULL,
	[Do_uu_tien] [int] NOT NULL,
	[Trang_thai] [bit] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[Ma_danh_muc_con] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[Hoa_don]    Script Date: 25/07/2018 12:15:35 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Hoa_don](
	[Ma_hoa_don] [int] IDENTITY(1,1) NOT NULL,
	[Ma_khach_hang] [int] NOT NULL,
	[Tong_tien] [money] NULL,
	[Ngay_mua] [date] NULL,
	[Ma_ship] [int] NULL,
	[Ma_thanh_toan] [int] NULL,
	[Tinh_trang] [bit] NULL,
PRIMARY KEY CLUSTERED 
(
	[Ma_hoa_don] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[Hoa_don_chi_tiet]    Script Date: 25/07/2018 12:15:35 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Hoa_don_chi_tiet](
	[Ma_san_pham] [int] NOT NULL,
	[Ma_hoa_don] [int] NOT NULL,
	[So_luong] [int] NULL,
	[Tong_chi_tiet] [money] NULL,
PRIMARY KEY CLUSTERED 
(
	[Ma_san_pham] ASC,
	[Ma_hoa_don] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[Khach_hang]    Script Date: 25/07/2018 12:15:35 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Khach_hang](
	[Ma_khach_hang] [int] IDENTITY(1,1) NOT NULL,
	[Ten_khach_hang] [nvarchar](20) NULL,
	[Ten_dang_nhap] [varchar](20) NULL,
	[Mat_khau] [varchar](20) NULL,
	[Dia_chi] [nvarchar](50) NULL,
	[So_dien_thoai] [int] NULL,
	[Gmail] [varchar](20) NULL,
	[Ngay_sinh] [date] NULL,
	[Quyen_truy_cap] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[Ma_khach_hang] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Khuyenmai]    Script Date: 25/07/2018 12:15:35 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Khuyenmai](
	[Ma_Giam_Gia] [int] IDENTITY(1,1) NOT NULL,
	[Ngay_bat_dau] [date] NOT NULL,
	[Ngay_ket_thuc] [date] NOT NULL,
	[Muc_do_giam_gia] [int] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[Ma_Giam_Gia] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[Mau_sac]    Script Date: 25/07/2018 12:15:35 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Mau_sac](
	[Ma_mau] [int] IDENTITY(1,1) NOT NULL,
	[Ten_mau] [nvarchar](20) NULL,
	[Trang_thai] [bit] NULL,
PRIMARY KEY CLUSTERED 
(
	[Ma_mau] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[Mau_sac_san_pham]    Script Date: 25/07/2018 12:15:35 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Mau_sac_san_pham](
	[Ma_mau] [int] NOT NULL,
	[Ma_san_pham] [int] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[Ma_mau] ASC,
	[Ma_san_pham] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[Nha_cung_cap]    Script Date: 25/07/2018 12:15:35 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Nha_cung_cap](
	[Ma_nha_cung_cap] [int] IDENTITY(1,1) NOT NULL,
	[Ten_nha_cung_cap] [nvarchar](50) NOT NULL,
	[Dia_chi] [nvarchar](50) NOT NULL,
	[So_dien_thoai] [int] NOT NULL,
	[So_fax] [varchar](20) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[Ma_nha_cung_cap] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[SanPham]    Script Date: 25/07/2018 12:15:35 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[SanPham](
	[Ma_san_pham] [int] IDENTITY(1,1) NOT NULL,
	[Ma_danh_muc_con] [int] NOT NULL,
	[Ten_san_pham] [nvarchar](50) NOT NULL,
	[Hinh_anh] [varchar](100) NOT NULL,
	[Ngay_Nhap] [date] NOT NULL,
	[Ma_hinh_anh] [int] NOT NULL,
	[So_luong] [int] NOT NULL,
	[Mo_ta] [text] NOT NULL,
	[Don_gia] [float] NOT NULL,
	[Ma_Giam_Gia] [int] NOT NULL,
	[Luot_xem] [int] NOT NULL,
	[Ma_nha_cung_cap] [int] NOT NULL,
	[Trang_Thai] [bit] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[Ma_san_pham] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Ship]    Script Date: 25/07/2018 12:15:35 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Ship](
	[Ma_ship] [int] IDENTITY(1,1) NOT NULL,
	[Ten_ship] [nvarchar](20) NULL,
	[So_dien_thoai] [int] NULL,
	[Khoang_cach] [int] NULL,
	[Gia_ship] [money] NULL,
	[Trang_thai] [bit] NULL,
PRIMARY KEY CLUSTERED 
(
	[Ma_ship] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[Size]    Script Date: 25/07/2018 12:15:35 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Size](
	[Ma_size] [int] IDENTITY(1,1) NOT NULL,
	[Ten_size] [nvarchar](20) NULL,
	[Trang_thai] [bit] NULL,
PRIMARY KEY CLUSTERED 
(
	[Ma_size] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[Size_san_pham]    Script Date: 25/07/2018 12:15:35 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Size_san_pham](
	[Ma_size] [int] NOT NULL,
	[Ma_san_pham] [int] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[Ma_size] ASC,
	[Ma_san_pham] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[Slide]    Script Date: 25/07/2018 12:15:35 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Slide](
	[SlideId] [int] IDENTITY(1,1) NOT NULL,
	[SlideImage] [varchar](50) NULL,
	[SlideUuTien] [int] NULL,
	[SlideStatus] [bit] NULL,
PRIMARY KEY CLUSTERED 
(
	[SlideId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Thanh_toan]    Script Date: 25/07/2018 12:15:35 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Thanh_toan](
	[Ma_thanh_toan] [int] IDENTITY(1,1) NOT NULL,
	[Hinh_thuc_thanh_toan] [nvarchar](20) NULL,
	[Trang_thai] [bit] NULL,
PRIMARY KEY CLUSTERED 
(
	[Ma_thanh_toan] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[Ua_thich]    Script Date: 25/07/2018 12:15:35 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Ua_thich](
	[Ma_khach_hang] [int] NOT NULL,
	[Ma_san_pham] [int] NOT NULL,
	[Trang_thai] [bit] NULL,
PRIMARY KEY CLUSTERED 
(
	[Ma_khach_hang] ASC,
	[Ma_san_pham] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET IDENTITY_INSERT [dbo].[Danh_muc_anh] ON 

INSERT [dbo].[Danh_muc_anh] ([Ma_hinh_anh], [Url1], [Url2], [Url3]) VALUES (1, N'../jsp/', N'../jsp/', N'../jsp/')
INSERT [dbo].[Danh_muc_anh] ([Ma_hinh_anh], [Url1], [Url2], [Url3]) VALUES (2, N'../jsp/', N'../jsp/', N'../jsp/')
INSERT [dbo].[Danh_muc_anh] ([Ma_hinh_anh], [Url1], [Url2], [Url3]) VALUES (3, N'../jsp/', N'../jsp/', N'../jsp/')
INSERT [dbo].[Danh_muc_anh] ([Ma_hinh_anh], [Url1], [Url2], [Url3]) VALUES (4, N'../jsp/', N'../jsp/', N'../jsp/')
INSERT [dbo].[Danh_muc_anh] ([Ma_hinh_anh], [Url1], [Url2], [Url3]) VALUES (5, N'../jsp/', N'../jsp/', N'../jsp/')
INSERT [dbo].[Danh_muc_anh] ([Ma_hinh_anh], [Url1], [Url2], [Url3]) VALUES (6, N'../jsp/', N'../jsp/', N'../jsp/')
SET IDENTITY_INSERT [dbo].[Danh_muc_anh] OFF
SET IDENTITY_INSERT [dbo].[Danhmuccha] ON 

INSERT [dbo].[Danhmuccha] ([Ma_danh_muc_cha], [Ten_danh_muc_cha]) VALUES (1, N'Men')
INSERT [dbo].[Danhmuccha] ([Ma_danh_muc_cha], [Ten_danh_muc_cha]) VALUES (2, N'Women')
INSERT [dbo].[Danhmuccha] ([Ma_danh_muc_cha], [Ten_danh_muc_cha]) VALUES (3, N'Bag')
INSERT [dbo].[Danhmuccha] ([Ma_danh_muc_cha], [Ten_danh_muc_cha]) VALUES (4, N'Footwear')
SET IDENTITY_INSERT [dbo].[Danhmuccha] OFF
SET IDENTITY_INSERT [dbo].[Danhmuccon] ON 

INSERT [dbo].[Danhmuccon] ([Ma_danh_muc_con], [Ma_danh_muc_cha], [Ten_danh_muc_con], [Do_uu_tien], [Trang_thai]) VALUES (1, 1, N'Clothing', 1, 1)
INSERT [dbo].[Danhmuccon] ([Ma_danh_muc_con], [Ma_danh_muc_cha], [Ten_danh_muc_con], [Do_uu_tien], [Trang_thai]) VALUES (2, 1, N'Wallets', 2, 1)
INSERT [dbo].[Danhmuccon] ([Ma_danh_muc_con], [Ma_danh_muc_cha], [Ten_danh_muc_con], [Do_uu_tien], [Trang_thai]) VALUES (3, 1, N'Footwear', 3, 1)
INSERT [dbo].[Danhmuccon] ([Ma_danh_muc_con], [Ma_danh_muc_cha], [Ten_danh_muc_con], [Do_uu_tien], [Trang_thai]) VALUES (4, 1, N'Watches', 4, 1)
INSERT [dbo].[Danhmuccon] ([Ma_danh_muc_con], [Ma_danh_muc_cha], [Ten_danh_muc_con], [Do_uu_tien], [Trang_thai]) VALUES (5, 1, N'Accessories', 5, 1)
INSERT [dbo].[Danhmuccon] ([Ma_danh_muc_con], [Ma_danh_muc_cha], [Ten_danh_muc_con], [Do_uu_tien], [Trang_thai]) VALUES (6, 1, N'Bags', 6, 1)
INSERT [dbo].[Danhmuccon] ([Ma_danh_muc_con], [Ma_danh_muc_cha], [Ten_danh_muc_con], [Do_uu_tien], [Trang_thai]) VALUES (7, 1, N'Caps & Hats', 7, 1)
INSERT [dbo].[Danhmuccon] ([Ma_danh_muc_con], [Ma_danh_muc_cha], [Ten_danh_muc_con], [Do_uu_tien], [Trang_thai]) VALUES (8, 1, N'Jewellery', 8, 1)
INSERT [dbo].[Danhmuccon] ([Ma_danh_muc_con], [Ma_danh_muc_cha], [Ten_danh_muc_con], [Do_uu_tien], [Trang_thai]) VALUES (9, 1, N'Sunglasses', 9, 1)
INSERT [dbo].[Danhmuccon] ([Ma_danh_muc_con], [Ma_danh_muc_cha], [Ten_danh_muc_con], [Do_uu_tien], [Trang_thai]) VALUES (10, 1, N'Perfumes', 10, 1)
INSERT [dbo].[Danhmuccon] ([Ma_danh_muc_con], [Ma_danh_muc_cha], [Ten_danh_muc_con], [Do_uu_tien], [Trang_thai]) VALUES (11, 1, N'Beauty', 11, 1)
INSERT [dbo].[Danhmuccon] ([Ma_danh_muc_con], [Ma_danh_muc_cha], [Ten_danh_muc_con], [Do_uu_tien], [Trang_thai]) VALUES (12, 1, N'Shirts', 12, 1)
INSERT [dbo].[Danhmuccon] ([Ma_danh_muc_con], [Ma_danh_muc_cha], [Ten_danh_muc_con], [Do_uu_tien], [Trang_thai]) VALUES (13, 1, N'Sunglasses', 13, 1)
INSERT [dbo].[Danhmuccon] ([Ma_danh_muc_con], [Ma_danh_muc_cha], [Ten_danh_muc_con], [Do_uu_tien], [Trang_thai]) VALUES (14, 1, N'Swimwear', 14, 1)
INSERT [dbo].[Danhmuccon] ([Ma_danh_muc_con], [Ma_danh_muc_cha], [Ten_danh_muc_con], [Do_uu_tien], [Trang_thai]) VALUES (15, 2, N'Clothing', 1, 1)
INSERT [dbo].[Danhmuccon] ([Ma_danh_muc_con], [Ma_danh_muc_cha], [Ten_danh_muc_con], [Do_uu_tien], [Trang_thai]) VALUES (16, 2, N'Wallets', 2, 1)
INSERT [dbo].[Danhmuccon] ([Ma_danh_muc_con], [Ma_danh_muc_cha], [Ten_danh_muc_con], [Do_uu_tien], [Trang_thai]) VALUES (17, 2, N'Footwear', 3, 1)
INSERT [dbo].[Danhmuccon] ([Ma_danh_muc_con], [Ma_danh_muc_cha], [Ten_danh_muc_con], [Do_uu_tien], [Trang_thai]) VALUES (18, 2, N'Watches', 4, 1)
INSERT [dbo].[Danhmuccon] ([Ma_danh_muc_con], [Ma_danh_muc_cha], [Ten_danh_muc_con], [Do_uu_tien], [Trang_thai]) VALUES (19, 2, N'Accessories', 5, 1)
INSERT [dbo].[Danhmuccon] ([Ma_danh_muc_con], [Ma_danh_muc_cha], [Ten_danh_muc_con], [Do_uu_tien], [Trang_thai]) VALUES (20, 2, N'Bags', 6, 1)
INSERT [dbo].[Danhmuccon] ([Ma_danh_muc_con], [Ma_danh_muc_cha], [Ten_danh_muc_con], [Do_uu_tien], [Trang_thai]) VALUES (21, 2, N'Caps & Hats', 7, 1)
INSERT [dbo].[Danhmuccon] ([Ma_danh_muc_con], [Ma_danh_muc_cha], [Ten_danh_muc_con], [Do_uu_tien], [Trang_thai]) VALUES (22, 2, N'Jewellery', 8, 1)
INSERT [dbo].[Danhmuccon] ([Ma_danh_muc_con], [Ma_danh_muc_cha], [Ten_danh_muc_con], [Do_uu_tien], [Trang_thai]) VALUES (23, 2, N'Sunglasses', 9, 1)
INSERT [dbo].[Danhmuccon] ([Ma_danh_muc_con], [Ma_danh_muc_cha], [Ten_danh_muc_con], [Do_uu_tien], [Trang_thai]) VALUES (24, 2, N'Perfumes', 10, 1)
INSERT [dbo].[Danhmuccon] ([Ma_danh_muc_con], [Ma_danh_muc_cha], [Ten_danh_muc_con], [Do_uu_tien], [Trang_thai]) VALUES (25, 2, N'Beauty', 11, 1)
INSERT [dbo].[Danhmuccon] ([Ma_danh_muc_con], [Ma_danh_muc_cha], [Ten_danh_muc_con], [Do_uu_tien], [Trang_thai]) VALUES (26, 2, N'Shirts', 12, 1)
INSERT [dbo].[Danhmuccon] ([Ma_danh_muc_con], [Ma_danh_muc_cha], [Ten_danh_muc_con], [Do_uu_tien], [Trang_thai]) VALUES (27, 2, N'Sunglasses', 13, 1)
INSERT [dbo].[Danhmuccon] ([Ma_danh_muc_con], [Ma_danh_muc_cha], [Ten_danh_muc_con], [Do_uu_tien], [Trang_thai]) VALUES (28, 2, N'Swimwear', 14, 1)
INSERT [dbo].[Danhmuccon] ([Ma_danh_muc_con], [Ma_danh_muc_cha], [Ten_danh_muc_con], [Do_uu_tien], [Trang_thai]) VALUES (29, 3, N'Sunglasses', 13, 1)
INSERT [dbo].[Danhmuccon] ([Ma_danh_muc_con], [Ma_danh_muc_cha], [Ten_danh_muc_con], [Do_uu_tien], [Trang_thai]) VALUES (30, 4, N'Swimwear', 14, 1)
SET IDENTITY_INSERT [dbo].[Danhmuccon] OFF
SET IDENTITY_INSERT [dbo].[Khach_hang] ON 

INSERT [dbo].[Khach_hang] ([Ma_khach_hang], [Ten_khach_hang], [Ten_dang_nhap], [Mat_khau], [Dia_chi], [So_dien_thoai], [Gmail], [Ngay_sinh], [Quyen_truy_cap]) VALUES (1, N'Dũng', N'admin', N'admin', N'Hưng Hà Thái Bình', 123, N'nguyendung1894', CAST(N'1998-04-01' AS Date), 1)
INSERT [dbo].[Khach_hang] ([Ma_khach_hang], [Ten_khach_hang], [Ten_dang_nhap], [Mat_khau], [Dia_chi], [So_dien_thoai], [Gmail], [Ngay_sinh], [Quyen_truy_cap]) VALUES (2, N'Anh', N'admin1', N'admin1', N'Hưng Hà Thái Bình', 123, N'nguyendung1894', CAST(N'1998-04-01' AS Date), 1)
INSERT [dbo].[Khach_hang] ([Ma_khach_hang], [Ten_khach_hang], [Ten_dang_nhap], [Mat_khau], [Dia_chi], [So_dien_thoai], [Gmail], [Ngay_sinh], [Quyen_truy_cap]) VALUES (3, N'Anh', N'user1', N'user1', N'Hưng Hà Thái Bình', 123, N'nguyendung1894', CAST(N'1998-04-01' AS Date), 2)
INSERT [dbo].[Khach_hang] ([Ma_khach_hang], [Ten_khach_hang], [Ten_dang_nhap], [Mat_khau], [Dia_chi], [So_dien_thoai], [Gmail], [Ngay_sinh], [Quyen_truy_cap]) VALUES (4, N'Duc', N'user2', N'user2', N'Hưng Hà Thái Bình', 123, N'nguyendung1894', CAST(N'1998-04-01' AS Date), 2)
SET IDENTITY_INSERT [dbo].[Khach_hang] OFF
SET IDENTITY_INSERT [dbo].[Khuyenmai] ON 

INSERT [dbo].[Khuyenmai] ([Ma_Giam_Gia], [Ngay_bat_dau], [Ngay_ket_thuc], [Muc_do_giam_gia]) VALUES (1, CAST(N'2018-01-02' AS Date), CAST(N'2018-02-24' AS Date), 0)
INSERT [dbo].[Khuyenmai] ([Ma_Giam_Gia], [Ngay_bat_dau], [Ngay_ket_thuc], [Muc_do_giam_gia]) VALUES (2, CAST(N'1980-02-01' AS Date), CAST(N'1980-02-25' AS Date), 10)
INSERT [dbo].[Khuyenmai] ([Ma_Giam_Gia], [Ngay_bat_dau], [Ngay_ket_thuc], [Muc_do_giam_gia]) VALUES (3, CAST(N'2018-03-01' AS Date), CAST(N'2018-04-13' AS Date), 20)
INSERT [dbo].[Khuyenmai] ([Ma_Giam_Gia], [Ngay_bat_dau], [Ngay_ket_thuc], [Muc_do_giam_gia]) VALUES (4, CAST(N'2018-03-12' AS Date), CAST(N'2018-03-20' AS Date), 30)
INSERT [dbo].[Khuyenmai] ([Ma_Giam_Gia], [Ngay_bat_dau], [Ngay_ket_thuc], [Muc_do_giam_gia]) VALUES (5, CAST(N'2018-05-01' AS Date), CAST(N'2018-06-02' AS Date), 40)
INSERT [dbo].[Khuyenmai] ([Ma_Giam_Gia], [Ngay_bat_dau], [Ngay_ket_thuc], [Muc_do_giam_gia]) VALUES (6, CAST(N'2018-05-01' AS Date), CAST(N'2018-05-08' AS Date), 50)
SET IDENTITY_INSERT [dbo].[Khuyenmai] OFF
SET IDENTITY_INSERT [dbo].[Nha_cung_cap] ON 

INSERT [dbo].[Nha_cung_cap] ([Ma_nha_cung_cap], [Ten_nha_cung_cap], [Dia_chi], [So_dien_thoai], [So_fax]) VALUES (1, N'Pháp', N'Hà Nội', 982220891, N'14141998')
INSERT [dbo].[Nha_cung_cap] ([Ma_nha_cung_cap], [Ten_nha_cung_cap], [Dia_chi], [So_dien_thoai], [So_fax]) VALUES (2, N'P.A Việt Nam', N'Hà Nội', 982220891, N'14141998')
INSERT [dbo].[Nha_cung_cap] ([Ma_nha_cung_cap], [Ten_nha_cung_cap], [Dia_chi], [So_dien_thoai], [So_fax]) VALUES (3, N'Tenten.vn', N'Hà Nội', 982220891, N'14141998')
INSERT [dbo].[Nha_cung_cap] ([Ma_nha_cung_cap], [Ten_nha_cung_cap], [Dia_chi], [So_dien_thoai], [So_fax]) VALUES (4, N'Mắt Bão', N'Hà Nội', 982220891, N'14141998')
INSERT [dbo].[Nha_cung_cap] ([Ma_nha_cung_cap], [Ten_nha_cung_cap], [Dia_chi], [So_dien_thoai], [So_fax]) VALUES (5, N'Nhân Hòa', N'Hà Nội', 982220891, N'14141998')
INSERT [dbo].[Nha_cung_cap] ([Ma_nha_cung_cap], [Ten_nha_cung_cap], [Dia_chi], [So_dien_thoai], [So_fax]) VALUES (6, N'FPT', N'Hà Nội', 982220891, N'14141998')
SET IDENTITY_INSERT [dbo].[Nha_cung_cap] OFF
SET IDENTITY_INSERT [dbo].[SanPham] ON 

INSERT [dbo].[SanPham] ([Ma_san_pham], [Ma_danh_muc_con], [Ten_san_pham], [Hinh_anh], [Ngay_Nhap], [Ma_hinh_anh], [So_luong], [Mo_ta], [Don_gia], [Ma_Giam_Gia], [Luot_xem], [Ma_nha_cung_cap], [Trang_Thai]) VALUES (1, 1, N'Formal Blue Shirt', N'../jsp/images/m1.jpg', CAST(N'2013-02-15' AS Date), 1, 50, N'New', 642.21, 1, 25, 1, 1)
INSERT [dbo].[SanPham] ([Ma_san_pham], [Ma_danh_muc_con], [Ten_san_pham], [Hinh_anh], [Ngay_Nhap], [Ma_hinh_anh], [So_luong], [Mo_ta], [Don_gia], [Ma_Giam_Gia], [Luot_xem], [Ma_nha_cung_cap], [Trang_Thai]) VALUES (2, 2, N'Gabi Full Sleeve Sweatshirt', N'../jsp/images/m2.jpg', CAST(N'2013-02-15' AS Date), 1, 50, N'New', 212.24, 1, 25, 1, 1)
INSERT [dbo].[SanPham] ([Ma_san_pham], [Ma_danh_muc_con], [Ten_san_pham], [Hinh_anh], [Ngay_Nhap], [Ma_hinh_anh], [So_luong], [Mo_ta], [Don_gia], [Ma_Giam_Gia], [Luot_xem], [Ma_nha_cung_cap], [Trang_Thai]) VALUES (3, 3, N'Dark Blue Track Pants', N'../jsp/images/m3.jpg', CAST(N'2013-02-15' AS Date), 1, 50, N'New', 544.41, 1, 25, 1, 1)
INSERT [dbo].[SanPham] ([Ma_san_pham], [Ma_danh_muc_con], [Ten_san_pham], [Hinh_anh], [Ngay_Nhap], [Ma_hinh_anh], [So_luong], [Mo_ta], [Don_gia], [Ma_Giam_Gia], [Luot_xem], [Ma_nha_cung_cap], [Trang_Thai]) VALUES (4, 4, N'Round Neck Black T-Shirt', N'../jsp/images/m4.jpg', CAST(N'2013-02-15' AS Date), 1, 50, N'New', 124.54, 1, 25, 1, 1)
INSERT [dbo].[SanPham] ([Ma_san_pham], [Ma_danh_muc_con], [Ten_san_pham], [Hinh_anh], [Ngay_Nhap], [Ma_hinh_anh], [So_luong], [Mo_ta], [Don_gia], [Ma_Giam_Gia], [Luot_xem], [Ma_nha_cung_cap], [Trang_Thai]) VALUES (5, 5, N'Men Black Jeans', N'../jsp/images/m5.jpg', CAST(N'2013-02-15' AS Date), 1, 50, N'New', 642.21, 1, 25, 1, 1)
INSERT [dbo].[SanPham] ([Ma_san_pham], [Ma_danh_muc_con], [Ten_san_pham], [Hinh_anh], [Ngay_Nhap], [Ma_hinh_anh], [So_luong], [Mo_ta], [Don_gia], [Ma_Giam_Gia], [Luot_xem], [Ma_nha_cung_cap], [Trang_Thai]) VALUES (6, 6, N'Analog Watch', N'../jsp/images/m7.jpg', CAST(N'2013-02-15' AS Date), 1, 50, N'New', 212.24, 1, 25, 1, 1)
INSERT [dbo].[SanPham] ([Ma_san_pham], [Ma_danh_muc_con], [Ten_san_pham], [Hinh_anh], [Ngay_Nhap], [Ma_hinh_anh], [So_luong], [Mo_ta], [Don_gia], [Ma_Giam_Gia], [Luot_xem], [Ma_nha_cung_cap], [Trang_Thai]) VALUES (7, 7, N'Reversible Belt', N'../jsp/images/m6.jpg', CAST(N'2013-02-15' AS Date), 1, 50, N'New', 544.41, 1, 25, 1, 1)
INSERT [dbo].[SanPham] ([Ma_san_pham], [Ma_danh_muc_con], [Ten_san_pham], [Hinh_anh], [Ngay_Nhap], [Ma_hinh_anh], [So_luong], [Mo_ta], [Don_gia], [Ma_Giam_Gia], [Luot_xem], [Ma_nha_cung_cap], [Trang_Thai]) VALUES (8, 8, N'Party Men Blazer', N'../jsp/images/m8.jpg', CAST(N'2013-02-15' AS Date), 1, 50, N'New', 124.54, 1, 25, 1, 1)
INSERT [dbo].[SanPham] ([Ma_san_pham], [Ma_danh_muc_con], [Ten_san_pham], [Hinh_anh], [Ngay_Nhap], [Ma_hinh_anh], [So_luong], [Mo_ta], [Don_gia], [Ma_Giam_Gia], [Luot_xem], [Ma_nha_cung_cap], [Trang_Thai]) VALUES (9, 15, N'Quần Bò', N'../jsp/images/w1.jpg', CAST(N'2013-02-15' AS Date), 1, 50, N'New', 300000, 1, 25, 1, 1)
INSERT [dbo].[SanPham] ([Ma_san_pham], [Ma_danh_muc_con], [Ten_san_pham], [Hinh_anh], [Ngay_Nhap], [Ma_hinh_anh], [So_luong], [Mo_ta], [Don_gia], [Ma_Giam_Gia], [Luot_xem], [Ma_nha_cung_cap], [Trang_Thai]) VALUES (10, 16, N'Quần Bò', N'../jsp/images/w2.jpg', CAST(N'2013-02-15' AS Date), 1, 50, N'New', 300000, 1, 25, 1, 1)
INSERT [dbo].[SanPham] ([Ma_san_pham], [Ma_danh_muc_con], [Ten_san_pham], [Hinh_anh], [Ngay_Nhap], [Ma_hinh_anh], [So_luong], [Mo_ta], [Don_gia], [Ma_Giam_Gia], [Luot_xem], [Ma_nha_cung_cap], [Trang_Thai]) VALUES (11, 15, N'Quần Jean', N'../jsp/images/w3.jpg', CAST(N'2013-02-15' AS Date), 1, 50, N'New', 300000, 1, 25, 1, 1)
INSERT [dbo].[SanPham] ([Ma_san_pham], [Ma_danh_muc_con], [Ten_san_pham], [Hinh_anh], [Ngay_Nhap], [Ma_hinh_anh], [So_luong], [Mo_ta], [Don_gia], [Ma_Giam_Gia], [Luot_xem], [Ma_nha_cung_cap], [Trang_Thai]) VALUES (12, 16, N'Quần Jean', N'../jsp/images/w4.jpg', CAST(N'2013-02-15' AS Date), 1, 50, N'New', 300000, 1, 25, 1, 1)
INSERT [dbo].[SanPham] ([Ma_san_pham], [Ma_danh_muc_con], [Ten_san_pham], [Hinh_anh], [Ngay_Nhap], [Ma_hinh_anh], [So_luong], [Mo_ta], [Don_gia], [Ma_Giam_Gia], [Luot_xem], [Ma_nha_cung_cap], [Trang_Thai]) VALUES (13, 17, N'Pink Track Pants', N'../jsp/images/w5.jpg', CAST(N'2013-02-15' AS Date), 1, 50, N'New', 141.54, 1, 25, 1, 1)
INSERT [dbo].[SanPham] ([Ma_san_pham], [Ma_danh_muc_con], [Ten_san_pham], [Hinh_anh], [Ngay_Nhap], [Ma_hinh_anh], [So_luong], [Mo_ta], [Don_gia], [Ma_Giam_Gia], [Luot_xem], [Ma_nha_cung_cap], [Trang_Thai]) VALUES (14, 18, N'Analog Watch', N'../jsp/images/w6.jpg', CAST(N'2013-02-15' AS Date), 1, 50, N'New', 545.14, 1, 25, 1, 1)
INSERT [dbo].[SanPham] ([Ma_san_pham], [Ma_danh_muc_con], [Ten_san_pham], [Hinh_anh], [Ngay_Nhap], [Ma_hinh_anh], [So_luong], [Mo_ta], [Don_gia], [Ma_Giam_Gia], [Luot_xem], [Ma_nha_cung_cap], [Trang_Thai]) VALUES (15, 19, N'Ankle Length Socks', N'../jsp/images/w7.jpg', CAST(N'2013-02-15' AS Date), 1, 50, N'New', 151.21, 1, 25, 1, 1)
INSERT [dbo].[SanPham] ([Ma_san_pham], [Ma_danh_muc_con], [Ten_san_pham], [Hinh_anh], [Ngay_Nhap], [Ma_hinh_anh], [So_luong], [Mo_ta], [Don_gia], [Ma_Giam_Gia], [Luot_xem], [Ma_nha_cung_cap], [Trang_Thai]) VALUES (16, 20, N'Reebok Women Tights', N'../jsp/images/w8.jpg', CAST(N'2013-02-15' AS Date), 1, 50, N'New', 125.44, 1, 25, 1, 1)
INSERT [dbo].[SanPham] ([Ma_san_pham], [Ma_danh_muc_con], [Ten_san_pham], [Hinh_anh], [Ngay_Nhap], [Ma_hinh_anh], [So_luong], [Mo_ta], [Don_gia], [Ma_Giam_Gia], [Luot_xem], [Ma_nha_cung_cap], [Trang_Thai]) VALUES (17, 29, N'Laptop Messenger Bag', N'../jsp/images/b1.jpg', CAST(N'2018-07-12' AS Date), 1, 50, N'New', 150.99, 1, 25, 1, 1)
INSERT [dbo].[SanPham] ([Ma_san_pham], [Ma_danh_muc_con], [Ten_san_pham], [Hinh_anh], [Ngay_Nhap], [Ma_hinh_anh], [So_luong], [Mo_ta], [Don_gia], [Ma_Giam_Gia], [Luot_xem], [Ma_nha_cung_cap], [Trang_Thai]) VALUES (18, 29, N'Puma Backpack', N'../jsp/images/b2.jpg', CAST(N'2018-07-12' AS Date), 1, 50, N'New', 150.99, 1, 25, 1, 1)
INSERT [dbo].[SanPham] ([Ma_san_pham], [Ma_danh_muc_con], [Ten_san_pham], [Hinh_anh], [Ngay_Nhap], [Ma_hinh_anh], [So_luong], [Mo_ta], [Don_gia], [Ma_Giam_Gia], [Luot_xem], [Ma_nha_cung_cap], [Trang_Thai]) VALUES (19, 29, N' Laptop Backpack', N'../jsp/images/b3.jpg', CAST(N'2018-07-12' AS Date), 1, 50, N'New', 150.99, 1, 25, 1, 1)
INSERT [dbo].[SanPham] ([Ma_san_pham], [Ma_danh_muc_con], [Ten_san_pham], [Hinh_anh], [Ngay_Nhap], [Ma_hinh_anh], [So_luong], [Mo_ta], [Don_gia], [Ma_Giam_Gia], [Luot_xem], [Ma_nha_cung_cap], [Trang_Thai]) VALUES (20, 29, N'Travel Duffel Bag', N'../jsp/images/b4.jpg', CAST(N'2018-07-12' AS Date), 1, 50, N'New', 150.99, 1, 25, 1, 1)
INSERT [dbo].[SanPham] ([Ma_san_pham], [Ma_danh_muc_con], [Ten_san_pham], [Hinh_anh], [Ngay_Nhap], [Ma_hinh_anh], [So_luong], [Mo_ta], [Don_gia], [Ma_Giam_Gia], [Luot_xem], [Ma_nha_cung_cap], [Trang_Thai]) VALUES (21, 29, N' Hand-held Bag', N'../jsp/images/b5.jpg', CAST(N'2018-07-12' AS Date), 1, 50, N'New', 150.99, 1, 25, 1, 1)
INSERT [dbo].[SanPham] ([Ma_san_pham], [Ma_danh_muc_con], [Ten_san_pham], [Hinh_anh], [Ngay_Nhap], [Ma_hinh_anh], [So_luong], [Mo_ta], [Don_gia], [Ma_Giam_Gia], [Luot_xem], [Ma_nha_cung_cap], [Trang_Thai]) VALUES (22, 29, N'Butterflies Bag', N'../jsp/images/b6.jpg', CAST(N'2018-07-12' AS Date), 1, 50, N'New', 150.99, 1, 25, 1, 1)
INSERT [dbo].[SanPham] ([Ma_san_pham], [Ma_danh_muc_con], [Ten_san_pham], [Hinh_anh], [Ngay_Nhap], [Ma_hinh_anh], [So_luong], [Mo_ta], [Don_gia], [Ma_Giam_Gia], [Luot_xem], [Ma_nha_cung_cap], [Trang_Thai]) VALUES (23, 29, N'Costa Swiss Bag', N'../jsp/images/b7.jpg', CAST(N'2018-07-12' AS Date), 1, 50, N'New', 150.99, 1, 25, 1, 1)
INSERT [dbo].[SanPham] ([Ma_san_pham], [Ma_danh_muc_con], [Ten_san_pham], [Hinh_anh], [Ngay_Nhap], [Ma_hinh_anh], [So_luong], [Mo_ta], [Don_gia], [Ma_Giam_Gia], [Luot_xem], [Ma_nha_cung_cap], [Trang_Thai]) VALUES (24, 29, N'Noble Designs Bag', N'../jsp/images/b8.jpg', CAST(N'2018-07-12' AS Date), 1, 50, N'New', 150.99, 1, 25, 1, 1)
INSERT [dbo].[SanPham] ([Ma_san_pham], [Ma_danh_muc_con], [Ten_san_pham], [Hinh_anh], [Ngay_Nhap], [Ma_hinh_anh], [So_luong], [Mo_ta], [Don_gia], [Ma_Giam_Gia], [Luot_xem], [Ma_nha_cung_cap], [Trang_Thai]) VALUES (25, 30, N'Running Shoes', N'../jsp/images/s1.jpg', CAST(N'2018-07-12' AS Date), 1, 50, N'New', 120.25, 1, 25, 1, 1)
INSERT [dbo].[SanPham] ([Ma_san_pham], [Ma_danh_muc_con], [Ten_san_pham], [Hinh_anh], [Ngay_Nhap], [Ma_hinh_anh], [So_luong], [Mo_ta], [Don_gia], [Ma_Giam_Gia], [Luot_xem], [Ma_nha_cung_cap], [Trang_Thai]) VALUES (26, 30, N'Shoetopia Lace Up', N'../jsp/images/s2.jpg', CAST(N'2018-05-12' AS Date), 1, 50, N'New', 132.32, 1, 25, 1, 1)
INSERT [dbo].[SanPham] ([Ma_san_pham], [Ma_danh_muc_con], [Ten_san_pham], [Hinh_anh], [Ngay_Nhap], [Ma_hinh_anh], [So_luong], [Mo_ta], [Don_gia], [Ma_Giam_Gia], [Luot_xem], [Ma_nha_cung_cap], [Trang_Thai]) VALUES (27, 30, N'Steemo Casuals(Black)', N'../jsp/images/s3.jpg', CAST(N'2018-03-23' AS Date), 1, 50, N'New', 147.45, 1, 25, 1, 1)
INSERT [dbo].[SanPham] ([Ma_san_pham], [Ma_danh_muc_con], [Ten_san_pham], [Hinh_anh], [Ngay_Nhap], [Ma_hinh_anh], [So_luong], [Mo_ta], [Don_gia], [Ma_Giam_Gia], [Luot_xem], [Ma_nha_cung_cap], [Trang_Thai]) VALUES (28, 30, N'Benetton Flip Flops', N'../jsp/images/s4.jpg', CAST(N'2018-04-18' AS Date), 1, 50, N'New', 255.78, 1, 25, 1, 1)
INSERT [dbo].[SanPham] ([Ma_san_pham], [Ma_danh_muc_con], [Ten_san_pham], [Hinh_anh], [Ngay_Nhap], [Ma_hinh_anh], [So_luong], [Mo_ta], [Don_gia], [Ma_Giam_Gia], [Luot_xem], [Ma_nha_cung_cap], [Trang_Thai]) VALUES (29, 30, N'Moonwalk Bellies', N'../jsp/images/s5.jpg', CAST(N'2018-02-11' AS Date), 1, 50, N'New', 125.21, 1, 25, 1, 1)
INSERT [dbo].[SanPham] ([Ma_san_pham], [Ma_danh_muc_con], [Ten_san_pham], [Hinh_anh], [Ngay_Nhap], [Ma_hinh_anh], [So_luong], [Mo_ta], [Don_gia], [Ma_Giam_Gia], [Luot_xem], [Ma_nha_cung_cap], [Trang_Thai]) VALUES (30, 30, N'Aero Canvas Loafers', N'../jsp/images/s6.jpg', CAST(N'2018-10-12' AS Date), 1, 50, N'New', 675.78, 1, 25, 1, 1)
INSERT [dbo].[SanPham] ([Ma_san_pham], [Ma_danh_muc_con], [Ten_san_pham], [Hinh_anh], [Ngay_Nhap], [Ma_hinh_anh], [So_luong], [Mo_ta], [Don_gia], [Ma_Giam_Gia], [Luot_xem], [Ma_nha_cung_cap], [Trang_Thai]) VALUES (31, 30, N'Sparx Sporty Canvas Shoes', N'../jsp/images/s7.jpg', CAST(N'2018-09-24' AS Date), 1, 50, N'New', 542.54, 1, 25, 1, 1)
INSERT [dbo].[SanPham] ([Ma_san_pham], [Ma_danh_muc_con], [Ten_san_pham], [Hinh_anh], [Ngay_Nhap], [Ma_hinh_anh], [So_luong], [Mo_ta], [Don_gia], [Ma_Giam_Gia], [Luot_xem], [Ma_nha_cung_cap], [Trang_Thai]) VALUES (32, 30, N'Women BLACK Heels', N'../jsp/images/s8.jpg', CAST(N'2018-01-12' AS Date), 1, 50, N'New', 687.15, 1, 25, 1, 1)
INSERT [dbo].[SanPham] ([Ma_san_pham], [Ma_danh_muc_con], [Ten_san_pham], [Hinh_anh], [Ngay_Nhap], [Ma_hinh_anh], [So_luong], [Mo_ta], [Don_gia], [Ma_Giam_Gia], [Luot_xem], [Ma_nha_cung_cap], [Trang_Thai]) VALUES (33, 1, N'Skinny Jeans', N'../image/1.jpg', CAST(N'2018-07-12' AS Date), 1, 1, N'New', 143.55999755859375, 2, 1, 2, 1)
SET IDENTITY_INSERT [dbo].[SanPham] OFF
ALTER TABLE [dbo].[Binh_luan]  WITH CHECK ADD FOREIGN KEY([Ma_khach_hang])
REFERENCES [dbo].[Khach_hang] ([Ma_khach_hang])
GO
ALTER TABLE [dbo].[Binh_luan]  WITH CHECK ADD FOREIGN KEY([Ma_san_pham])
REFERENCES [dbo].[SanPham] ([Ma_san_pham])
GO
ALTER TABLE [dbo].[Danhmuccon]  WITH CHECK ADD FOREIGN KEY([Ma_danh_muc_cha])
REFERENCES [dbo].[Danhmuccha] ([Ma_danh_muc_cha])
GO
ALTER TABLE [dbo].[Hoa_don]  WITH CHECK ADD FOREIGN KEY([Ma_khach_hang])
REFERENCES [dbo].[Khach_hang] ([Ma_khach_hang])
GO
ALTER TABLE [dbo].[Hoa_don]  WITH CHECK ADD FOREIGN KEY([Ma_ship])
REFERENCES [dbo].[Ship] ([Ma_ship])
GO
ALTER TABLE [dbo].[Hoa_don]  WITH CHECK ADD FOREIGN KEY([Ma_thanh_toan])
REFERENCES [dbo].[Thanh_toan] ([Ma_thanh_toan])
GO
ALTER TABLE [dbo].[Hoa_don_chi_tiet]  WITH CHECK ADD FOREIGN KEY([Ma_hoa_don])
REFERENCES [dbo].[Hoa_don] ([Ma_hoa_don])
GO
ALTER TABLE [dbo].[Hoa_don_chi_tiet]  WITH CHECK ADD FOREIGN KEY([Ma_san_pham])
REFERENCES [dbo].[SanPham] ([Ma_san_pham])
GO
ALTER TABLE [dbo].[Mau_sac_san_pham]  WITH CHECK ADD FOREIGN KEY([Ma_mau])
REFERENCES [dbo].[Mau_sac] ([Ma_mau])
GO
ALTER TABLE [dbo].[Mau_sac_san_pham]  WITH CHECK ADD FOREIGN KEY([Ma_san_pham])
REFERENCES [dbo].[SanPham] ([Ma_san_pham])
GO
ALTER TABLE [dbo].[SanPham]  WITH CHECK ADD FOREIGN KEY([Ma_danh_muc_con])
REFERENCES [dbo].[Danhmuccon] ([Ma_danh_muc_con])
GO
ALTER TABLE [dbo].[SanPham]  WITH CHECK ADD FOREIGN KEY([Ma_Giam_Gia])
REFERENCES [dbo].[Khuyenmai] ([Ma_Giam_Gia])
GO
ALTER TABLE [dbo].[SanPham]  WITH CHECK ADD FOREIGN KEY([Ma_hinh_anh])
REFERENCES [dbo].[Danh_muc_anh] ([Ma_hinh_anh])
GO
ALTER TABLE [dbo].[SanPham]  WITH CHECK ADD FOREIGN KEY([Ma_nha_cung_cap])
REFERENCES [dbo].[Nha_cung_cap] ([Ma_nha_cung_cap])
GO
ALTER TABLE [dbo].[Size_san_pham]  WITH CHECK ADD FOREIGN KEY([Ma_san_pham])
REFERENCES [dbo].[SanPham] ([Ma_san_pham])
GO
ALTER TABLE [dbo].[Size_san_pham]  WITH CHECK ADD FOREIGN KEY([Ma_size])
REFERENCES [dbo].[Size] ([Ma_size])
GO
ALTER TABLE [dbo].[Ua_thich]  WITH CHECK ADD FOREIGN KEY([Ma_khach_hang])
REFERENCES [dbo].[Khach_hang] ([Ma_khach_hang])
GO
ALTER TABLE [dbo].[Ua_thich]  WITH CHECK ADD FOREIGN KEY([Ma_san_pham])
REFERENCES [dbo].[SanPham] ([Ma_san_pham])
GO
/****** Object:  StoredProcedure [dbo].[DeleteProduct]    Script Date: 25/07/2018 12:15:35 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE procedure [dbo].[DeleteProduct]
@productId varchar(50)
AS
BEGIN
	DELETE dbo.SanPham
	WHERE Ma_san_pham=@productId
END
GO
/****** Object:  StoredProcedure [dbo].[getAdmin]    Script Date: 25/07/2018 12:15:35 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROC [dbo].[getAdmin]
AS
BEGIN
	SELECT * FROM dbo.Khach_hang kh WHERE kh.Quyen_truy_cap=1
END
GO
/****** Object:  StoredProcedure [dbo].[GetBannerParentMen]    Script Date: 25/07/2018 12:15:35 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROC [dbo].[GetBannerParentMen]
AS
BEGIN
	SELECT *
	FROM dbo.Danhmuccha dm INNER JOIN dbo.Danhmuccon dmc ON dmc.Ma_danh_muc_cha = dm.Ma_danh_muc_cha	
	WHERE dmc.Trang_thai=1 AND dm.Ma_danh_muc_cha=1 ORDER BY dmc.Do_uu_tien ASC
END
GO
/****** Object:  StoredProcedure [dbo].[GetBannerParentWomen]    Script Date: 25/07/2018 12:15:35 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROC [dbo].[GetBannerParentWomen]
AS
BEGIN
	SELECT *
	FROM dbo.Danhmuccha dm INNER JOIN dbo.Danhmuccon dmc ON dmc.Ma_danh_muc_cha = dm.Ma_danh_muc_cha	
	WHERE dmc.Trang_thai=1 AND dm.Ma_danh_muc_cha=2 ORDER BY dmc.Do_uu_tien ASC
END
GO
/****** Object:  StoredProcedure [dbo].[getProductBag]    Script Date: 25/07/2018 12:15:35 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROC [dbo].[getProductBag]
AS
BEGIN
	SELECT TOP 8 * FROM dbo.SanPham sp INNER JOIN dbo.Danhmuccon dmc ON dmc.Ma_danh_muc_con = sp.Ma_danh_muc_con
		INNER JOIN dbo.Danhmuccha dm ON dm.Ma_danh_muc_cha = dmc.Ma_danh_muc_cha
		WHERE dm.Ma_danh_muc_cha=3 AND sp.Trang_Thai=1 ORDER BY sp.Ngay_Nhap DESC
END
GO
/****** Object:  StoredProcedure [dbo].[getProductBagN]    Script Date: 25/07/2018 12:15:35 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROC [dbo].[getProductBagN]
AS
BEGIN
	SELECT * FROM dbo.SanPham sp INNER JOIN dbo.Danhmuccon dmc ON dmc.Ma_danh_muc_con = sp.Ma_danh_muc_con
		INNER JOIN dbo.Danhmuccha dm ON dm.Ma_danh_muc_cha = dmc.Ma_danh_muc_cha
		WHERE dm.Ma_danh_muc_cha=3 AND sp.Trang_Thai=1 ORDER BY sp.Ma_san_pham ASC
END
GO
/****** Object:  StoredProcedure [dbo].[getProductById]    Script Date: 25/07/2018 12:15:35 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROC [dbo].[getProductById]
@Id INT
AS
BEGIN
	SELECT * FROM dbo.SanPham sp WHERE sp.Ma_san_pham=@Id AND sp.Trang_Thai=1
END
GO
/****** Object:  StoredProcedure [dbo].[getProductFootwear]    Script Date: 25/07/2018 12:15:35 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROC [dbo].[getProductFootwear]
AS
BEGIN
	SELECT TOP 8 * FROM dbo.SanPham sp INNER JOIN dbo.Danhmuccon dmc ON dmc.Ma_danh_muc_con = sp.Ma_danh_muc_con
		INNER JOIN dbo.Danhmuccha dm ON dm.Ma_danh_muc_cha = dmc.Ma_danh_muc_cha
		WHERE dm.Ma_danh_muc_cha=4 AND sp.Trang_Thai=1 ORDER BY sp.Ngay_Nhap DESC
END
GO
/****** Object:  StoredProcedure [dbo].[getProductFootwearN]    Script Date: 25/07/2018 12:15:35 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROC [dbo].[getProductFootwearN]
AS
BEGIN
	SELECT  * FROM dbo.SanPham sp INNER JOIN dbo.Danhmuccon dmc ON dmc.Ma_danh_muc_con = sp.Ma_danh_muc_con
		INNER JOIN dbo.Danhmuccha dm ON dm.Ma_danh_muc_cha = dmc.Ma_danh_muc_cha
		WHERE dm.Ma_danh_muc_cha=4 AND sp.Trang_Thai=1 ORDER BY sp.Ma_san_pham ASC
END
GO
/****** Object:  StoredProcedure [dbo].[getProductMen]    Script Date: 25/07/2018 12:15:35 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROC [dbo].[getProductMen]
AS
BEGIN
	SELECT TOP 8 * FROM dbo.SanPham sp INNER JOIN dbo.Danhmuccon dmc ON dmc.Ma_danh_muc_con = sp.Ma_danh_muc_con
		INNER JOIN dbo.Danhmuccha dm ON dm.Ma_danh_muc_cha = dmc.Ma_danh_muc_cha
	WHERE dm.Ma_danh_muc_cha=1 AND sp.Trang_Thai=1 ORDER BY sp.Ngay_Nhap DESC
END
GO
/****** Object:  StoredProcedure [dbo].[getProductMenById]    Script Date: 25/07/2018 12:15:35 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROC [dbo].[getProductMenById]
@Id INT
AS
BEGIN
	SELECT * 
	FROM dbo.Danhmuccha dm INNER JOIN dbo.Danhmuccon dmc ON dmc.Ma_danh_muc_cha = dm.Ma_danh_muc_cha
		INNER JOIN dbo.SanPham sp ON sp.Ma_danh_muc_con = dmc.Ma_danh_muc_con
	WHERE dm.Ma_danh_muc_cha=1 AND sp.Ma_danh_muc_con=@Id AND sp.Trang_Thai=1 
END
GO
/****** Object:  StoredProcedure [dbo].[getProductMenN]    Script Date: 25/07/2018 12:15:35 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROC [dbo].[getProductMenN]
AS
BEGIN
	SELECT * FROM dbo.SanPham sp INNER JOIN dbo.Danhmuccon dmc ON dmc.Ma_danh_muc_con = sp.Ma_danh_muc_con
		INNER JOIN dbo.Danhmuccha dm ON dm.Ma_danh_muc_cha = dmc.Ma_danh_muc_cha
	WHERE dm.Ma_danh_muc_cha=1 AND sp.Trang_Thai=1 ORDER BY sp.Ma_san_pham ASC
END
GO
/****** Object:  StoredProcedure [dbo].[getProductWomen]    Script Date: 25/07/2018 12:15:35 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROC [dbo].[getProductWomen]
AS
BEGIN
	SELECT TOP 8 * FROM dbo.SanPham sp INNER JOIN dbo.Danhmuccon dmc ON dmc.Ma_danh_muc_con = sp.Ma_danh_muc_con
		INNER JOIN dbo.Danhmuccha dm ON dm.Ma_danh_muc_cha = dmc.Ma_danh_muc_cha
		WHERE dm.Ma_danh_muc_cha=2 AND sp.Trang_Thai=1 ORDER BY sp.Ngay_Nhap DESC
END
GO
/****** Object:  StoredProcedure [dbo].[getProductWomenById]    Script Date: 25/07/2018 12:15:35 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROC [dbo].[getProductWomenById]
@Id INT
AS
BEGIN
	SELECT * 
	FROM dbo.Danhmuccha dm INNER JOIN dbo.Danhmuccon dmc ON dmc.Ma_danh_muc_cha = dm.Ma_danh_muc_cha
		INNER JOIN dbo.SanPham sp ON sp.Ma_danh_muc_con = dmc.Ma_danh_muc_con
	WHERE dm.Ma_danh_muc_cha=2 AND sp.Ma_danh_muc_con=@Id AND sp.Trang_Thai=1 
END
GO
/****** Object:  StoredProcedure [dbo].[getProductWomenN]    Script Date: 25/07/2018 12:15:35 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROC [dbo].[getProductWomenN]
AS
BEGIN
	SELECT * FROM dbo.SanPham sp INNER JOIN dbo.Danhmuccon dmc ON dmc.Ma_danh_muc_con = sp.Ma_danh_muc_con
		INNER JOIN dbo.Danhmuccha dm ON dm.Ma_danh_muc_cha = dmc.Ma_danh_muc_cha
		WHERE dm.Ma_danh_muc_cha=2 AND sp.Trang_Thai=1 ORDER BY sp.Ma_san_pham ASC
END

GO
/****** Object:  StoredProcedure [dbo].[getSale]    Script Date: 25/07/2018 12:15:35 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROC [dbo].[getSale]
as
BEGIN
	SELECT * FROM dbo.Khuyenmai
END
GO
/****** Object:  StoredProcedure [dbo].[getSupplier]    Script Date: 25/07/2018 12:15:35 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROC [dbo].[getSupplier]
as
BEGIN
	SELECT * FROM dbo.Nha_cung_cap 
END
GO
/****** Object:  StoredProcedure [dbo].[getUser]    Script Date: 25/07/2018 12:15:35 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROC [dbo].[getUser]
AS
BEGIN
	SELECT * FROM dbo.Khach_hang kh WHERE kh.Quyen_truy_cap=2
END
GO
/****** Object:  StoredProcedure [dbo].[InsertProdcut]    Script Date: 25/07/2018 12:15:35 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE procedure [dbo].[InsertProdcut]
@madmc int,
@nameProduct NVARCHAR(50),
@image VARCHAR(100),
@inputdate DATE,
@imageid INT,
@quantity INT,
@mota TEXT,
@price FLOAT,
@saleid INT,
@view INT,
@suppliersid INT,
@trangthai BIT
as
BEGIN
	insert into dbo.SanPham
	values(@madmc ,@nameProduct ,@image ,@inputdate ,@imageid ,@quantity ,@mota ,@price ,@saleid ,@view ,@suppliersid ,@trangthai );
END
GO
/****** Object:  StoredProcedure [dbo].[SP_DisplayPageNo]    Script Date: 25/07/2018 12:15:35 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROCEDURE [dbo].[SP_DisplayPageNo]
	@CurrentPage int ,
	@PageSize int,
	@table nvarchar(200),
	@actionName nvarchar(100),
	@sql nvarchar(4000) OUTPUT
AS
BEGIN
	--Khai báo và lấy tổng số bản ghi lấy về
	DECLARE @TotalRecord int;
	DECLARE @sqlString nvarchar(200);
	SET @sqlString = N'SELECT @TotalRecord=Count(*) FROM '+@table;
	EXECUTE sp_executesql @sqlString,N'@TotalRecord int out',@TotalRecord out;

	--Khai báo và set tổng số trang cần phân ra dựa vào tổng số bản ghi và số bản ghi trên 1 trang
	DECLARE @TotalPage int;
	IF @TotalRecord%@PageSize>0
		SET @TotalPage=(@TotalRecord/@PageSize)+1;
	ELSE
		SET @TotalPage=@TotalRecord/@PageSize;

	--Xử lý trường hợp nếu trang đang chọn truyền vào nhỏ hơn 1
	IF @CurrentPage<1
		SET @CurrentPage=1;

	--Xử lý trường hợp nếu trang đang chọn truyền vào lớn hơn tổng số trang được chia
	IF @CurrentPage>@TotalPage
		SET @CurrentPage=@TotalPage

	--Set nội dung cho link phân trang
	SET @sql='Trang: '
		IF @CurrentPage>1
		BEGIN
			SET @sql=@sql+ N' <a href="'+@actionName+'?page=1" title="Trang đầu">&lt;&lt;</a>'
			SET @sql=@sql+ ' <a href="'+@actionName+'?page='+ Cast((@CurrentPage-1) AS
			NVARCHAR(4))+N'" title="Trang trước">&lt;</a>'
		END
	DECLARE @i int
	SET @i=1
	WHILE @i<=@TotalPage
	BEGIN
		IF @i=@CurrentPage
			SET @sql=@sql+'['+Cast(Cast(@i AS int) AS nvarchar(4))+'] '
		ELSE
			SET @sql=@sql+' <a href="'+@actionName+'?page='+Cast(@i AS nvarchar(4))+'">'+Cast(@i AS nvarchar(4))+'</a> '
		SET @i=@i+1
	END

	IF @CurrentPage<@TotalPage
	BEGIN
		SET @sql=@sql+ N' <a href="'+@actionName+'?page='+Cast((@CurrentPage+1) AS
		NVARCHAR(4))+N'" title="Trang sau">&gt;</a>'
		SET @sql=@sql+ N' <a href="'+@actionName+'?page='+cast(@TotalPage AS nvarchar(6))+ N'"title="Trang cuối">&gt;&gt;</a>'
	END
	SELECT @sql AS Paging
END

GO
/****** Object:  StoredProcedure [dbo].[SP_Paging]    Script Date: 25/07/2018 12:15:35 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROCEDURE [dbo].[SP_Paging]
	@CurrentPage int,
	@PageSize int,
	@table nvarchar(200),
	@tableId nvarchar(100)
AS
Begin
	-- Tính tổng số bản ghi
	DECLARE @TotalRecord int, @TotalPage INT
    
	--khai bao cau lenh va thuc thi cau lenh lay tong so ban ghi cua bang can phan trang
	DECLARE @SqlString nvarchar(500);
	DECLARE @SqlString1 nvarchar(500);
		SET @SqlString = N'SELECT @TotalRecord=Count(*) FROM '+@table;
		EXECUTE sp_executesql @SqlString,N'@TotalRecord int out',@TotalRecord out;

	-- Tính tổng số trang
	IF @TotalRecord%@PageSize>0
		SET @TotalPage=(@TotalRecord/@PageSize)+1
	ELSE
		SET @TotalPage=@TotalRecord/@PageSize

	--Xử lý trường hợp @CurrentPage<1
	IF @CurrentPage<1
	SET @CurrentPage=1

	--Xử lý trường hợp @CurrentPage>@Tolal
	IF @CurrentPage>@TotalPage
		SET @CurrentPage=@TotalPage

	--Xử lý lấy dữ liệu của trang hiện tại
		SET @SqlString1 = 'Begin WITH temp AS (SELECT ROW_NUMBER() OVER(ORDER BY
		'+@tableId+') AS RowNum, * FROM '+@table+') Select * From temp Where RowNum Between
		('+CAST(@CurrentPage AS nvarchar(10))+' - 1)*'+CAST(@PageSize AS nvarchar(10))+'+1 AND
		'+CAST(@CurrentPage AS nvarchar(10))+'*'+CAST(@PageSize AS nvarchar(10))+' END;'
		 execute sp_executesql @SqlString1;
END
GO
/****** Object:  StoredProcedure [dbo].[UpdateProduct]    Script Date: 25/07/2018 12:15:35 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROC [dbo].[UpdateProduct]
@productId varchar(50),
@madmc int,
@nameProduct NVARCHAR(50),
@image VARCHAR(100),
@inputdate DATE,
@imageid INT,
@quantity INT,
@mota TEXT,
@price FLOAT,
@saleid INT,
@view INT,
@suppliersid INT,
@trangthai BIT
AS
BEGIN
	UPDATE dbo.SanPham
	SET Ma_danh_muc_con=@madmc,
		Ten_san_pham =@nameProduct,
	Hinh_anh=@image,
	Ngay_Nhap=@inputdate,
	Ma_hinh_anh =@imageid,
	So_luong=@quantity,
	Mo_ta=@mota,
	Don_gia =@price,
	Ma_Giam_Gia=@saleid,
	Luot_xem=@view,
	Ma_nha_cung_cap=@suppliersid,
	Trang_Thai=@trangthai
	WHERE Ma_san_pham=@productId
END
GO
