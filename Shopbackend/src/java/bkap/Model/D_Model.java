/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bkap.Model;

import bkap.Connection.D_Connection;
import bkap.Connection.Pagination;
import bkap.Entity.D_banner;
import bkap.Entity.ProductAdmin;
import bkap.Entity.Sale;
import bkap.Entity.Supplier;
import bkap.Entity.UserAdmin;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author ScorPius 31
 */
public class D_Model {

    public List<UserAdmin> getAdmin() {
        Connection conn = null;
        CallableStatement call = null;
        List<UserAdmin> listAdmin = new ArrayList<>();
        try {
            conn = D_Connection.openDataBase();
            call = conn.prepareCall("{call getAdmin()}");
            ResultSet rs = call.executeQuery();
            while (rs.next()) {
                UserAdmin a = new UserAdmin();
                a.setIdCustomer(rs.getInt("Ma_khach_hang"));
                a.setNameCustomer(rs.getString("Ten_khach_hang"));
                a.setUserName(rs.getString("Ten_dang_nhap"));
                a.setPassword(rs.getString("Mat_khau"));
                a.setAddress(rs.getString("Dia_chi"));
                a.setTelephone(rs.getInt("So_dien_thoai"));
                a.setEmail(rs.getString("Gmail"));
                a.setBirthday(rs.getDate("Ngay_sinh"));
                a.setRole(rs.getInt("Quyen_truy_cap"));
                listAdmin.add(a);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            D_Connection.closeDataBase(conn, call);
        }
        return listAdmin;
    }

    public List<UserAdmin> getUser() {
        Connection conn = null;
        CallableStatement call = null;
        List<UserAdmin> listUser = new ArrayList<>();
        try {
            conn = D_Connection.openDataBase();
            call = conn.prepareCall("{call getUser()}");
            ResultSet rs = call.executeQuery();
            while (rs.next()) {
                UserAdmin a = new UserAdmin();
                a.setIdCustomer(rs.getInt("Ma_khach_hang"));
                a.setNameCustomer(rs.getString("Ten_khach_hang"));
                a.setUserName(rs.getString("Ten_dang_nhap"));
                a.setPassword(rs.getString("Mat_khau"));
                a.setAddress(rs.getString("Dia_chi"));
                a.setTelephone(rs.getInt("So_dien_thoai"));
                a.setEmail(rs.getString("Gmail"));
                a.setBirthday(rs.getDate("Ngay_sinh"));
                a.setRole(rs.getInt("Quyen_truy_cap"));
                listUser.add(a);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            D_Connection.closeDataBase(conn, call);
        }
        return listUser;
    }

    public List<ProductAdmin> getProductMen() {
        Connection conn = null;
        CallableStatement call = null;
        List<ProductAdmin> listMen = new ArrayList<>();
        try {
            conn = D_Connection.openDataBase();
            call = conn.prepareCall("{call getProductMenN()}");
            ResultSet rs = call.executeQuery();
            while (rs.next()) {
                ProductAdmin pro = new ProductAdmin();
                pro.setProductId(rs.getInt("Ma_san_pham"));
                pro.setCategoryId(rs.getInt("Ma_danh_muc_con"));
                pro.setProductName(rs.getString("Ten_san_pham"));
                pro.setProductImage(rs.getString("Hinh_anh"));
                pro.setDate(rs.getDate("Ngay_Nhap"));
                pro.setImageId(rs.getInt("Ma_hinh_anh"));
                pro.setQuantity(rs.getInt("So_luong"));
                pro.setDescription(rs.getString("Mo_ta"));
                pro.setPrice(rs.getFloat("Don_gia"));
                pro.setSaleId(rs.getInt("Ma_Giam_Gia"));
                pro.setView(rs.getInt("Luot_xem"));
                pro.setSupplier(rs.getInt("Ma_nha_cung_cap"));
                pro.setStatus(rs.getBoolean("Trang_Thai"));
                listMen.add(pro);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            D_Connection.closeDataBase(conn, call);
        }
        return listMen;
    }

    public List<ProductAdmin> getProductWomen() {
        Connection conn = null;
        CallableStatement call = null;
        List<ProductAdmin> listWomen = new ArrayList<>();
        try {
            conn = D_Connection.openDataBase();
            call = conn.prepareCall("{call getProductWomenN()}");
            ResultSet rs = call.executeQuery();
            while (rs.next()) {
                ProductAdmin pro = new ProductAdmin();
                pro.setProductId(rs.getInt("Ma_san_pham"));
                pro.setCategoryId(rs.getInt("Ma_danh_muc_con"));
                pro.setProductName(rs.getString("Ten_san_pham"));
                pro.setProductImage(rs.getString("Hinh_anh"));
                pro.setDate(rs.getDate("Ngay_Nhap"));
                pro.setImageId(rs.getInt("Ma_hinh_anh"));
                pro.setQuantity(rs.getInt("So_luong"));
                pro.setDescription(rs.getString("Mo_ta"));
                pro.setPrice(rs.getFloat("Don_gia"));
                pro.setSaleId(rs.getInt("Ma_Giam_Gia"));
                pro.setView(rs.getInt("Luot_xem"));
                pro.setSupplier(rs.getInt("Ma_nha_cung_cap"));
                pro.setStatus(rs.getBoolean("Trang_Thai"));
                listWomen.add(pro);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            D_Connection.closeDataBase(conn, call);
        }
        return listWomen;
    }

    public List<ProductAdmin> getProductBag() {
        Connection conn = null;
        CallableStatement call = null;
        List<ProductAdmin> listBag = new ArrayList<>();
        try {
            conn = D_Connection.openDataBase();
            call = conn.prepareCall("{call getProductBagN()}");
            ResultSet rs = call.executeQuery();
            while (rs.next()) {
                ProductAdmin pro = new ProductAdmin();
                pro.setProductId(rs.getInt("Ma_san_pham"));
                pro.setCategoryId(rs.getInt("Ma_danh_muc_con"));
                pro.setProductName(rs.getString("Ten_san_pham"));
                pro.setProductImage(rs.getString("Hinh_anh"));
                pro.setDate(rs.getDate("Ngay_Nhap"));
                pro.setImageId(rs.getInt("Ma_hinh_anh"));
                pro.setQuantity(rs.getInt("So_luong"));
                pro.setDescription(rs.getString("Mo_ta"));
                pro.setPrice(rs.getFloat("Don_gia"));
                pro.setSaleId(rs.getInt("Ma_Giam_Gia"));
                pro.setView(rs.getInt("Luot_xem"));
                pro.setSupplier(rs.getInt("Ma_nha_cung_cap"));
                pro.setStatus(rs.getBoolean("Trang_Thai"));
                listBag.add(pro);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            D_Connection.closeDataBase(conn, call);
        }
        return listBag;
    }

    public List<ProductAdmin> getProductFootwear() {
        Connection conn = null;
        CallableStatement call = null;
        List<ProductAdmin> listFootwear = new ArrayList<>();
        try {
            conn = D_Connection.openDataBase();
            call = conn.prepareCall("{call getProductFootwearN()}");
            ResultSet rs = call.executeQuery();
            while (rs.next()) {
                ProductAdmin pro = new ProductAdmin();
                pro.setProductId(rs.getInt("Ma_san_pham"));
                pro.setCategoryId(rs.getInt("Ma_danh_muc_con"));
                pro.setProductName(rs.getString("Ten_san_pham"));
                pro.setProductImage(rs.getString("Hinh_anh"));
                pro.setDate(rs.getDate("Ngay_Nhap"));
                pro.setImageId(rs.getInt("Ma_hinh_anh"));
                pro.setQuantity(rs.getInt("So_luong"));
                pro.setDescription(rs.getString("Mo_ta"));
                pro.setPrice(rs.getFloat("Don_gia"));
                pro.setSaleId(rs.getInt("Ma_Giam_Gia"));
                pro.setView(rs.getInt("Luot_xem"));
                pro.setSupplier(rs.getInt("Ma_nha_cung_cap"));
                pro.setStatus(rs.getBoolean("Trang_Thai"));
                listFootwear.add(pro);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            D_Connection.closeDataBase(conn, call);
        }
        return listFootwear;
    }

    public HashMap getDataPagination(int page, int pageSize) {
        HashMap map = Pagination.getDataForPagination(page, pageSize, "SanPham", "Ma_san_pham",
                "getDataPagging.htm");
        return map;
    }

    //    Banner
    public List<D_banner> getBannerMen() {
        Connection conn = null;
        CallableStatement call = null;
        List<D_banner> listBannerMen = new ArrayList<>();
        try {
            conn = D_Connection.openDataBase();
            call = conn.prepareCall("{call GetBannerParentMen()}");
            ResultSet rs = call.executeQuery();
            while (rs.next()) {
                D_banner banner = new D_banner();
                banner.setMadanhmuccha(rs.getInt("Ma_danh_muc_cha"));
                banner.setTendanhmuccha(rs.getString("Ten_danh_muc_cha"));
                banner.setMadanhmuccon(rs.getInt("Ma_danh_muc_con"));
                banner.setTendanhmuccon(rs.getString("Ten_danh_muc_con"));
                banner.setDouutien(rs.getInt("Do_uu_tien"));
                banner.setTrangthai(rs.getBoolean("Trang_thai"));
                listBannerMen.add(banner);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            D_Connection.closeDataBase(conn, call);
        }
        return listBannerMen;
    }

    public List<D_banner> getBannerWomen() {
        Connection conn = null;
        CallableStatement call = null;
        List<D_banner> listBannerWomen = new ArrayList<>();
        try {
            conn = D_Connection.openDataBase();
            call = conn.prepareCall("{call GetBannerParentWomen()}");
            ResultSet rs = call.executeQuery();
            while (rs.next()) {
                D_banner banner = new D_banner();
                banner.setMadanhmuccha(rs.getInt("Ma_danh_muc_cha"));
                banner.setTendanhmuccha(rs.getString("Ten_danh_muc_cha"));
                banner.setMadanhmuccon(rs.getInt("Ma_danh_muc_con"));
                banner.setTendanhmuccon(rs.getString("Ten_danh_muc_con"));
                banner.setDouutien(rs.getInt("Do_uu_tien"));
                banner.setTrangthai(rs.getBoolean("Trang_thai"));
                listBannerWomen.add(banner);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            D_Connection.closeDataBase(conn, call);
        }
        return listBannerWomen;
    }
    
    public ProductAdmin getProductById(int productId){
        Connection conn=null;
        CallableStatement call=null;
        ProductAdmin pro=new ProductAdmin();
        try {
            conn=D_Connection.openDataBase();
            call=conn.prepareCall("{call getProductById(?)}");
            call.setInt(1, productId);
            ResultSet rs=call.executeQuery();
            if(rs.next()){
                pro.setProductId(rs.getInt("Ma_san_pham"));
                pro.setCategoryId(rs.getInt("Ma_danh_muc_con"));
                pro.setProductName(rs.getString("Ten_san_pham"));
                pro.setProductImage(rs.getString("Hinh_anh"));
                pro.setDate(rs.getDate("Ngay_Nhap"));
                pro.setImageId(rs.getInt("Ma_hinh_anh"));
                pro.setQuantity(rs.getInt("So_luong"));
                pro.setDescription(rs.getString("Mo_ta"));
                pro.setPrice(rs.getFloat("Don_gia"));
                pro.setSaleId(rs.getInt("Ma_Giam_Gia"));
                pro.setView(rs.getInt("Luot_xem"));
                pro.setSupplier(rs.getInt("Ma_nha_cung_cap"));
                pro.setStatus(rs.getBoolean("Trang_Thai"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            D_Connection.closeDataBase(conn, call);
        }
        return pro;
    }
    
    public List<ProductAdmin> getProductMenById(int productMenById) {
        Connection conn = null;
        CallableStatement call = null;
        List<ProductAdmin> ProductMenById = new ArrayList<>();
        try {
            conn = D_Connection.openDataBase();
            call = conn.prepareCall("{call getProductMenById(?)}");
            call.setInt(1, productMenById);
            ResultSet rs = call.executeQuery();
            while (rs.next()) {
                ProductAdmin pro = new ProductAdmin();
                pro.setProductId(rs.getInt("Ma_san_pham"));
                pro.setCategoryId(rs.getInt("Ma_danh_muc_con"));
                pro.setProductName(rs.getString("Ten_san_pham"));
                pro.setProductImage(rs.getString("Hinh_anh"));
                pro.setDate(rs.getDate("Ngay_Nhap"));
                pro.setImageId(rs.getInt("Ma_hinh_anh"));
                pro.setQuantity(rs.getInt("So_luong"));
                pro.setDescription(rs.getString("Mo_ta"));
                pro.setPrice(rs.getFloat("Don_gia"));
                pro.setSaleId(rs.getInt("Ma_Giam_Gia"));
                pro.setView(rs.getInt("Luot_xem"));
                pro.setSupplier(rs.getInt("Ma_nha_cung_cap"));
                pro.setStatus(rs.getBoolean("Trang_Thai"));
                ProductMenById.add(pro);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            D_Connection.closeDataBase(conn, call);
        }
        return ProductMenById;
    }

    public List<ProductAdmin> getProductWomenById(int productWomenById) {
        Connection conn = null;
        CallableStatement call = null;
        List<ProductAdmin> ProductWomenById = new ArrayList<>();
        try {
            conn = D_Connection.openDataBase();
            call = conn.prepareCall("{call getProductWomenById(?)}");
            call.setInt(1, productWomenById);
            ResultSet rs = call.executeQuery();
            while (rs.next()) {
                ProductAdmin pro = new ProductAdmin();
                pro.setProductId(rs.getInt("Ma_san_pham"));
                pro.setCategoryId(rs.getInt("Ma_danh_muc_con"));
                pro.setProductName(rs.getString("Ten_san_pham"));
                pro.setProductImage(rs.getString("Hinh_anh"));
                pro.setDate(rs.getDate("Ngay_Nhap"));
                pro.setImageId(rs.getInt("Ma_hinh_anh"));
                pro.setQuantity(rs.getInt("So_luong"));
                pro.setDescription(rs.getString("Mo_ta"));
                pro.setPrice(rs.getFloat("Don_gia"));
                pro.setSaleId(rs.getInt("Ma_Giam_Gia"));
                pro.setView(rs.getInt("Luot_xem"));
                pro.setSupplier(rs.getInt("Ma_nha_cung_cap"));
                pro.setStatus(rs.getBoolean("Trang_Thai"));
                ProductWomenById.add(pro);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            D_Connection.closeDataBase(conn, call);
        }
        return ProductWomenById;
    }
//    Banner

    public boolean inserProduct(ProductAdmin proAdmin) {
        Connection conn = null;
        CallableStatement call = null;
        try {
            conn = D_Connection.openDataBase();
            call = conn.prepareCall("{call InsertProdcut(?,?,?,?,?,?,?,?,?,?,?,?)}");
            call.setInt(1, proAdmin.getCategoryId());
            call.setString(2, proAdmin.getProductName());
            call.setString(3, proAdmin.getProductImage());
            call.setDate(4, proAdmin.getDate());
            call.setInt(5, proAdmin.getImageId());        
            call.setInt(6, proAdmin.getQuantity());
            call.setString(7, proAdmin.getDescription());         
            call.setFloat(8, proAdmin.getPrice());       
            call.setInt(9, proAdmin.getSaleId());
            call.setInt(10, proAdmin.getView());
            call.setInt(11, proAdmin.getSupplier());
            call.setBoolean(12, proAdmin.isStatus());          
            call.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            D_Connection.closeDataBase(conn, call);
        }
        return true;
    }

    public boolean UpdateProduct(ProductAdmin pro) {
        Connection conn = null;
        CallableStatement call = null;
        try {
            conn = D_Connection.openDataBase();
            call = conn.prepareCall("{call UpdateProduct(?,?,?,?,?,?,?,?,?,?,?,?,?)}");
            call.setInt(1, pro.getProductId());
            call.setInt(2, pro.getCategoryId());
            call.setString(3, pro.getProductName());
            call.setString(4, pro.getProductImage());
            call.setDate(5, pro.getDate());
            call.setInt(6, pro.getImageId());        
            call.setInt(7, pro.getQuantity());
            call.setString(8, pro.getDescription());         
            call.setFloat(9, pro.getPrice());       
            call.setInt(10, pro.getSaleId());
            call.setInt(11, pro.getView());
            call.setInt(12, pro.getSupplier());
            call.setBoolean(13, pro.isStatus());   
            call.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            D_Connection.closeDataBase(conn, call);
        }
        return true;
    }

    public boolean deleteProduct(int productId) {
        Connection conn = null;
        CallableStatement call = null;
        try {
            conn = D_Connection.openDataBase();
            call = conn.prepareCall("{call DeleteProduct(?)}");
            call.setInt(1, productId);
            call.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            D_Connection.closeDataBase(conn, call);
        }
        return true;
    }
    
    public UserAdmin getUserById(int userId){
        Connection conn=null;
        CallableStatement call=null;
        UserAdmin user=new UserAdmin();
        try {
            conn=D_Connection.openDataBase();
            call=conn.prepareCall("{call getUserById(?)}");
            call.setInt(1, userId);
            ResultSet rs=call.executeQuery();
            if(rs.next()){
                user.setIdCustomer(rs.getInt("Ma_khach_hang"));
                user.setNameCustomer(rs.getString("Ten_khach_hang"));
                user.setUserName(rs.getString("Ten_dang_nhap"));
                user.setPassword(rs.getString("Mat_khau"));
                user.setAddress(rs.getString("Dia_chi"));
                user.setTelephone(rs.getInt("So_dien_thoai"));
                user.setEmail(rs.getString("Gmail"));
                user.setBirthday(rs.getDate("Ngay_sinh"));
                user.setRole(rs.getInt("Quyen_truy_cap"));               
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            D_Connection.closeDataBase(conn, call);
        }
        return user;
    }
    
    public boolean inserUser(UserAdmin userAdmin) {
        Connection conn = null;
        CallableStatement call = null;
        try {
            conn = D_Connection.openDataBase();
            call = conn.prepareCall("{call InsertUser(?,?,?,?,?,?,?,?)}");
            call.setString(1, userAdmin.getNameCustomer());
            call.setString(2, userAdmin.getUserName());
            call.setString(3, userAdmin.getPassword());
            call.setString(4, userAdmin.getAddress());
            call.setInt(5, userAdmin.getTelephone());        
            call.setString(6, userAdmin.getEmail());
            call.setDate(7, userAdmin.getBirthday());         
            call.setInt(8, userAdmin.getRole());                 
            call.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            D_Connection.closeDataBase(conn, call);
        }
        return true;
    }
    
    public boolean UpdateUser(UserAdmin userAdmin) {
        Connection conn = null;
        CallableStatement call = null;
        try {
            conn = D_Connection.openDataBase();
            call = conn.prepareCall("{call UpdateUser(?,?,?,?,?,?,?,?,?)}");
            call.setInt(1, userAdmin.getIdCustomer());
            call.setString(2, userAdmin.getNameCustomer());
            call.setString(3, userAdmin.getUserName());
            call.setString(4, userAdmin.getPassword());
            call.setString(5, userAdmin.getAddress());
            call.setInt(6, userAdmin.getTelephone());        
            call.setString(7, userAdmin.getEmail());
            call.setDate(8, userAdmin.getBirthday());         
            call.setInt(9, userAdmin.getRole());   
            call.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            D_Connection.closeDataBase(conn, call);
        }
        return true;
    }
    
    public boolean deleteUser(int userId) {
        Connection conn = null;
        CallableStatement call = null;
        try {
            conn = D_Connection.openDataBase();
            call = conn.prepareCall("{call DeleteUser(?)}");
            call.setInt(1, userId);
            call.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            D_Connection.closeDataBase(conn, call);
        }
        return true;
    }
    
    public List<Supplier> getSupplier() {
        Connection conn = null;
        CallableStatement call = null;
        List<Supplier> Supplier = new ArrayList<>();
        try {
            conn = D_Connection.openDataBase();
            call = conn.prepareCall("{call getSupplier()}");          
            ResultSet rs = call.executeQuery();
            while (rs.next()) {
                Supplier a = new Supplier();
                a.setSupplierId(rs.getInt("Ma_nha_cung_cap"));
                a.setSupplierName(rs.getString("Ten_nha_cung_cap"));          
                a.setAddress(rs.getString("Dia_chi"));
                a.setPhone(rs.getInt("So_dien_thoai"));
                a.setFax(rs.getString("So_fax"));             
                Supplier.add(a);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            D_Connection.closeDataBase(conn, call);
        }
        return Supplier;
    }
    
    public List<Sale> getSale() {
        Connection conn = null;
        CallableStatement call = null;
        List<Sale> sale = new ArrayList<>();
        try {
            conn = D_Connection.openDataBase();
            call = conn.prepareCall("{call getSale()}");          
            ResultSet rs = call.executeQuery();
            while (rs.next()) {
                Sale a = new Sale();
                a.setSaleid(rs.getInt("Ma_Giam_Gia"));
                a.setDateInput(rs.getDate("Ngay_bat_dau"));          
                a.setDateOutput(rs.getDate("Ngay_ket_thuc"));
                a.setLevelSale(rs.getInt("Muc_do_giam_gia"));          
                sale.add(a);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            D_Connection.closeDataBase(conn, call);
        }
        return sale;
    }
}
