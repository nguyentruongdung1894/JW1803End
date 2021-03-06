/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bkap.Model;

import bkap.Connection.D_Connection;
import bkap.Connection.Pagination;
import bkap.Entity.Color;
import bkap.Entity.Comment;
import bkap.Entity.D_banner;
import bkap.Entity.Order;
import bkap.Entity.Pay;
import bkap.Entity.ProductAdmin;
import bkap.Entity.Sale;
import bkap.Entity.Search;
import bkap.Entity.Ship;
import bkap.Entity.Size;
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
            call = conn.prepareCall("{call InsertProdcut(?,?,?,?,?,?,?,?,?,?,?)}");
            call.setInt(1, proAdmin.getCategoryId());
            call.setString(2, proAdmin.getProductName());
            call.setString(3, proAdmin.getProductImage());
            call.setDate(4, proAdmin.getDate());     
            call.setInt(5, proAdmin.getQuantity());
            call.setString(6, proAdmin.getDescription());         
            call.setFloat(7, proAdmin.getPrice());       
            call.setInt(8, proAdmin.getSaleId());
            call.setInt(9, proAdmin.getView());
            call.setInt(10, proAdmin.getSupplier());
            call.setBoolean(11, proAdmin.isStatus());          
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
            call = conn.prepareCall("{call UpdateProduct(?,?,?,?,?,?,?,?,?,?,?,?)}");
            call.setInt(1, pro.getProductId());
            call.setInt(2, pro.getCategoryId());
            call.setString(3, pro.getProductName());
            call.setString(4, pro.getProductImage());
            call.setDate(5, pro.getDate());
            call.setInt(6, pro.getQuantity());
            call.setString(7, pro.getDescription());         
            call.setFloat(8, pro.getPrice());       
            call.setInt(9, pro.getSaleId());
            call.setInt(10, pro.getView());
            call.setInt(11, pro.getSupplier());
            call.setBoolean(12, pro.isStatus());   
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
    
    public Supplier getSupplierById(int idSupplier){
        Connection conn=null;
        CallableStatement call=null;
        Supplier supplier=new Supplier();
        try {
            conn=D_Connection.openDataBase();
            call=conn.prepareCall("{call getSupplierById(?)}");
            call.setInt(1, idSupplier);
            ResultSet rs=call.executeQuery();
            if(rs.next()){
                supplier.setSupplierId(rs.getInt("Ma_nha_cung_cap"));
                supplier.setSupplierName(rs.getString("Ten_nha_cung_cap"));
                supplier.setAddress(rs.getString("Dia_chi"));
                supplier.setPhone(rs.getInt("So_dien_thoai"));
                supplier.setFax(rs.getString("So_fax"));               
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            D_Connection.closeDataBase(conn, call);
        }
        return supplier;
    }
    
    public boolean insertSupplier(Supplier supplier) {
        Connection conn = null;
        CallableStatement call = null;
        try {
            conn = D_Connection.openDataBase();
            call = conn.prepareCall("{call InsertSupplier(?,?,?,?)}");
            call.setString(1, supplier.getSupplierName());
            call.setString(2, supplier.getAddress());
            call.setInt(3, supplier.getPhone());
            call.setString(4, supplier.getFax());                    
            call.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            D_Connection.closeDataBase(conn, call);
        }
        return true;
    }
    
    public boolean UpdateSupplier(Supplier supplier) {
        Connection conn = null;
        CallableStatement call = null;
        try {
            conn = D_Connection.openDataBase();
            call = conn.prepareCall("{call UpdateSupplier(?,?,?,?,?)}");
            call.setInt(1, supplier.getSupplierId());
            call.setString(2, supplier.getSupplierName());
            call.setString(3, supplier.getAddress());
            call.setInt(4, supplier.getPhone());
            call.setString(5, supplier.getFax());           
            call.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            D_Connection.closeDataBase(conn, call);
        }
        return true;
    }
    
    public boolean deleteSupplier(int idSupplier) {
        Connection conn = null;
        CallableStatement call = null;
        try {
            conn = D_Connection.openDataBase();
            call = conn.prepareCall("{call DeleteSupplier(?)}");
            call.setInt(1, idSupplier);
            call.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            D_Connection.closeDataBase(conn, call);
        }
        return true;
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
    
    
    public Sale getSaleById(int idSale){
        Connection conn=null;
        CallableStatement call=null;
        Sale sale=new Sale();
        try {
            conn=D_Connection.openDataBase();
            call=conn.prepareCall("{call getSaleById(?)}");
            call.setInt(1, idSale);
            ResultSet rs=call.executeQuery();
            if(rs.next()){
                sale.setSaleid(rs.getInt("Ma_Giam_Gia"));
                sale.setDateInput(rs.getDate("Ngay_bat_dau"));
                sale.setDateOutput(rs.getDate("Ngay_ket_thuc"));
                sale.setLevelSale(rs.getInt("Muc_do_giam_gia"));              
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            D_Connection.closeDataBase(conn, call);
        }
        return sale;
    }
    
    public boolean insertSale(Sale sale) {
        Connection conn = null;
        CallableStatement call = null;
        try {
            conn = D_Connection.openDataBase();
            call = conn.prepareCall("{call InsertSale(?,?,?)}");
            call.setDate(1, sale.getDateInput());
            call.setDate(2, sale.getDateOutput());
            call.setInt(3, sale.getLevelSale());                
            call.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            D_Connection.closeDataBase(conn, call);
        }
        return true;
    }
    
    public boolean UpdateSale(Sale sale) {
        Connection conn = null;
        CallableStatement call = null;
        try {
            conn = D_Connection.openDataBase();
            call = conn.prepareCall("{call UpdateSale(?,?,?,?)}");
            call.setInt(1, sale.getSaleid());
            call.setDate(2, sale.getDateInput());
            call.setDate(3, sale.getDateOutput());
            call.setInt(4, sale.getLevelSale());       
            call.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            D_Connection.closeDataBase(conn, call);
        }
        return true;
    }
    
    public boolean deleteSale(int idSale) {
        Connection conn = null;
        CallableStatement call = null;
        try {
            conn = D_Connection.openDataBase();
            call = conn.prepareCall("{call DeleteSale(?)}");
            call.setInt(1, idSale);
            call.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            D_Connection.closeDataBase(conn, call);
        }
        return true;
    }
    
    public List<ProductAdmin> search(Search str) {
        Connection conn = null;
        CallableStatement call = null;
        List<ProductAdmin> search = new ArrayList<>();
        try {
            conn = D_Connection.openDataBase();
            call = conn.prepareCall("{call search(?)}");
            call.setString(1, str.getStr());
            ResultSet rs = call.executeQuery();
            while (rs.next()) {
                ProductAdmin pro = new ProductAdmin();
                pro.setProductId(rs.getInt("Ma_san_pham"));
                pro.setCategoryId(rs.getInt("Ma_danh_muc_con"));
                pro.setProductName(rs.getString("Ten_san_pham"));
                pro.setProductImage(rs.getString("Hinh_anh"));
                pro.setDate(rs.getDate("Ngay_Nhap"));
                pro.setQuantity(rs.getInt("So_luong"));
                pro.setDescription(rs.getString("Mo_ta"));
                pro.setPrice(rs.getFloat("Don_gia"));
                pro.setSaleId(rs.getInt("Ma_Giam_Gia"));
                pro.setView(rs.getInt("Luot_xem"));
                pro.setSupplier(rs.getInt("Ma_nha_cung_cap"));
                pro.setStatus(rs.getBoolean("Trang_Thai"));
                search.add(pro);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            D_Connection.closeDataBase(conn, call);
        }
        return search;
    }
    
    public List<UserAdmin> searchUser(Search str) {
        Connection conn = null;
        CallableStatement call = null;
        List<UserAdmin> searchUser = new ArrayList<>();
        try {
            conn = D_Connection.openDataBase();
            call = conn.prepareCall("{call searchUser(?)}");
            call.setString(1, str.getStr());
            ResultSet rs = call.executeQuery();
            while (rs.next()) {
                UserAdmin pro = new UserAdmin();
                pro.setIdCustomer(rs.getInt("Ma_khach_hang"));
                pro.setNameCustomer(rs.getString("Ten_khach_hang"));
                pro.setUserName(rs.getString("Ten_dang_nhap"));
                pro.setPassword(rs.getString("Mat_khau"));
                pro.setAddress(rs.getString("Dia_chi"));
                pro.setTelephone(rs.getInt("So_dien_thoai"));
                pro.setEmail(rs.getString("Gmail"));
                pro.setBirthday(rs.getDate("Ngay_sinh"));
                pro.setRole(rs.getInt("Quyen_truy_cap"));
                searchUser.add(pro);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            D_Connection.closeDataBase(conn, call);
        }
        return searchUser;
    }
    
    public List<Comment> getcomment(){
        Connection conn = null;
        CallableStatement call = null;
        List<Comment> listcomment = new ArrayList<>();
        try {
            conn = D_Connection.openDataBase();
            call = conn.prepareCall("{call getComment()}");          
            ResultSet rs = call.executeQuery();
            while (rs.next()) {
                Comment a = new Comment();
                a.setId(rs.getInt("Id"));   
                a.setIdCustomer(rs.getInt("Ma_khach_hang"));   
                a.setIdProduct(rs.getInt("Ma_san_pham"));                      
                a.setNameProduct(rs.getString("Ten_san_pham"));
                a.setNameCustomer(rs.getString("Ten_khach_hang"));       
                a.setContent(rs.getString("content"));
                a.setDateComment(rs.getDate("Ngay_binh_luan"));
                a.setStatus(rs.getBoolean("Trang_thai"));
                listcomment.add(a);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            D_Connection.closeDataBase(conn, call);
        }
        return listcomment;
    }
    
    public Comment getCmtById(int id){
        Connection conn=null;
        CallableStatement call=null;
        Comment cmt=new Comment();
        try {
            conn=D_Connection.openDataBase();
            call=conn.prepareCall("{call getCommentById(?)}");
            call.setInt(1, id);
            ResultSet rs=call.executeQuery();
            if(rs.next()){
                cmt.setId(rs.getInt("Id"));   
                cmt.setIdCustomer(rs.getInt("Ma_khach_hang"));   
                cmt.setIdProduct(rs.getInt("Ma_san_pham"));                      
                cmt.setNameProduct(rs.getString("Ten_san_pham"));
                cmt.setNameCustomer(rs.getString("Ten_khach_hang"));       
                cmt.setContent(rs.getString("content"));
                cmt.setDateComment(rs.getDate("Ngay_binh_luan"));
                cmt.setStatus(rs.getBoolean("Trang_thai"));                          
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            D_Connection.closeDataBase(conn, call);
        }
        return cmt;
    }
    
    public boolean UpdatCmt(Comment cmt) {
        Connection conn = null;
        CallableStatement call = null;
        try {
            conn = D_Connection.openDataBase();
            call = conn.prepareCall("{call UpdateComment(?,?,?,?,?,?)}");
            call.setInt(1, cmt.getId());
            call.setInt(2, cmt.getIdCustomer());
            call.setInt(3, cmt.getIdProduct());
            call.setDate(4, cmt.getDateComment());
            call.setString(5, cmt.getContent());         
            call.setBoolean(6, cmt.getStatus());           
            call.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            D_Connection.closeDataBase(conn, call);
        }
        return true;
    }
    
    public List<Pay> getPay() {
        Connection conn = null;
        CallableStatement call = null;
        List<Pay> pay = new ArrayList<>();
        try {
            conn = D_Connection.openDataBase();
            call = conn.prepareCall("{call getPay()}");          
            ResultSet rs = call.executeQuery();
            while (rs.next()) {
                Pay a = new Pay();
                a.setIdPay(rs.getInt("Ma_thanh_toan"));
                a.setPaymenttype(rs.getString("Hinh_thuc_thanh_toan"));          
                a.setStatus(rs.getBoolean("Trang_thai"));       
                pay.add(a);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            D_Connection.closeDataBase(conn, call);
        }
        return pay;
    }
    
    
    public Pay getPayById(int idPay){
        Connection conn=null;
        CallableStatement call=null;
        Pay pay=new Pay();
        try {
            conn=D_Connection.openDataBase();
            call=conn.prepareCall("{call getPayById(?)}");
            call.setInt(1, idPay);
            ResultSet rs=call.executeQuery();
            if(rs.next()){
                pay.setIdPay(rs.getInt("Ma_thanh_toan"));
                pay.setPaymenttype(rs.getString("Hinh_thuc_thanh_toan"));
                pay.setStatus(rs.getBoolean("Trang_thai"));                         
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            D_Connection.closeDataBase(conn, call);
        }
        return pay;
    }
    
    public boolean insertPay(Pay pay) {
        Connection conn = null;
        CallableStatement call = null;
        try {
            conn = D_Connection.openDataBase();
            call = conn.prepareCall("{call Insertpay(?,?)}");
            call.setString(1, pay.getPaymenttype());
            call.setBoolean(2, pay.isStatus());            
            call.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            D_Connection.closeDataBase(conn, call);
        }
        return true;
    }
    
    public boolean UpdatePay(Pay pay) {
        Connection conn = null;
        CallableStatement call = null;
        try {
            conn = D_Connection.openDataBase();
            call = conn.prepareCall("{call Updatepay(?,?,?)}");
            call.setInt(1, pay.getIdPay());
            call.setString(2, pay.getPaymenttype());
            call.setBoolean(3, pay.isStatus());     
            call.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            D_Connection.closeDataBase(conn, call);
        }
        return true;
    }
    
    public boolean deletePay(int idPay) {
        Connection conn = null;
        CallableStatement call = null;
        try {
            conn = D_Connection.openDataBase();
            call = conn.prepareCall("{call DeletePay(?)}");
            call.setInt(1, idPay);
            call.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            D_Connection.closeDataBase(conn, call);
        }
        return true;
    }
    
    public List<Ship> getShip() {
        Connection conn = null;
        CallableStatement call = null;
        List<Ship> ship = new ArrayList<>();
        try {
            conn = D_Connection.openDataBase();
            call = conn.prepareCall("{call getShip()}");          
            ResultSet rs = call.executeQuery();
            while (rs.next()) {
                Ship a = new Ship();
                a.setIdShip(rs.getInt("Ma_ship"));
                a.setNameShip(rs.getString("Ten_ship"));          
                a.setPhone(rs.getInt("So_dien_thoai"));   
                a.setDistance(rs.getInt("Khoang_cach"));
                a.setPrice(rs.getDouble("Gia_ship"));          
                a.setBit(rs.getBoolean("Trang_thai"));   
                ship.add(a);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            D_Connection.closeDataBase(conn, call);
        }
        return ship;
    }
    
    
    public Ship getShipById(int idShip){
        Connection conn=null;
        CallableStatement call=null;
        Ship ship=new Ship();
        try {
            conn=D_Connection.openDataBase();
            call=conn.prepareCall("{call getShipById(?)}");
            call.setInt(1, idShip);
            ResultSet rs=call.executeQuery();
            if(rs.next()){
                ship.setIdShip(rs.getInt("Ma_ship"));
                ship.setNameShip(rs.getString("Ten_ship"));          
                ship.setPhone(rs.getInt("So_dien_thoai"));   
                ship.setDistance(rs.getInt("Khoang_cach"));
                ship.setPrice(rs.getDouble("Gia_ship"));          
                ship.setBit(rs.getBoolean("Trang_thai"));                        
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            D_Connection.closeDataBase(conn, call);
        }
        return ship;
    }
    
    public boolean insertShip(Ship ship) {
        Connection conn = null;
        CallableStatement call = null;
        try {
            conn = D_Connection.openDataBase();
            call = conn.prepareCall("{call InsertShip(?,?,?,?,?)}");
            call.setString(1, ship.getNameShip());
            call.setInt(2, ship.getPhone());  
            call.setInt(3, ship.getDistance());
            call.setDouble(4, ship.getPrice());  
            call.setBoolean(5, ship.isBit());
            call.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            D_Connection.closeDataBase(conn, call);
        }
        return true;
    }
    
    public boolean UpdateShip(Ship ship) {
        Connection conn = null;
        CallableStatement call = null;
        try {
            conn = D_Connection.openDataBase();
            call = conn.prepareCall("{call UpdateShip(?,?,?,?,?,?)}");
            call.setInt(1, ship.getIdShip());
            call.setString(2, ship.getNameShip());
            call.setInt(3, ship.getPhone());  
            call.setInt(4, ship.getDistance());
            call.setDouble(5, ship.getPrice());  
            call.setBoolean(6, ship.isBit());
            call.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            D_Connection.closeDataBase(conn, call);
        }
        return true;
    }
    
    public boolean deleteShip(int idShip) {
        Connection conn = null;
        CallableStatement call = null;
        try {
            conn = D_Connection.openDataBase();
            call = conn.prepareCall("{call DeleteShip(?)}");
            call.setInt(1, idShip);
            call.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            D_Connection.closeDataBase(conn, call);
        }
        return true;
    }
    
    public List<Size> getSize() {
        Connection conn = null;
        CallableStatement call = null;
        List<Size> size = new ArrayList<>();
        try {
            conn = D_Connection.openDataBase();
            call = conn.prepareCall("{call getSize()}");          
            ResultSet rs = call.executeQuery();
            while (rs.next()) {
                Size a = new Size();
                a.setId(rs.getInt("Ma_size"));
                a.setNameSize(rs.getString("Ten_size"));          
                a.setStatus(rs.getBoolean("Trang_thai"));   
                size.add(a);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            D_Connection.closeDataBase(conn, call);
        }
        return size;
    }
    
    
    public Size getSizeById(int idSize){
        Connection conn=null;
        CallableStatement call=null;
        Size size=new Size();
        try {
            conn=D_Connection.openDataBase();
            call=conn.prepareCall("{call getSizeById(?)}");
            call.setInt(1, idSize);
            ResultSet rs=call.executeQuery();
            if(rs.next()){
                size.setId(rs.getInt("Ma_size"));
                size.setNameSize(rs.getString("Ten_size"));          
                size.setStatus(rs.getBoolean("Trang_thai"));                          
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            D_Connection.closeDataBase(conn, call);
        }
        return size;
    }
    
    public boolean insertSize(Size size) {
        Connection conn = null;
        CallableStatement call = null;
        try {
            conn = D_Connection.openDataBase();
            call = conn.prepareCall("{call InsertSize(?,?)}");
            call.setString(1, size.getNameSize());
            call.setBoolean(2, size.isStatus());  
            call.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            D_Connection.closeDataBase(conn, call);
        }
        return true;
    }
    
    public boolean UpdateSize(Size size) {
        Connection conn = null;
        CallableStatement call = null;
        try {
            conn = D_Connection.openDataBase();
            call = conn.prepareCall("{call UpdateSize(?,?,?)}");
            call.setInt(1, size.getId());
            call.setString(2, size.getNameSize());
            call.setBoolean(3, size.isStatus());  
            call.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            D_Connection.closeDataBase(conn, call);
        }
        return true;
    }
    
    public boolean DeleteSize(int idSize) {
        Connection conn = null;
        CallableStatement call = null;
        try {
            conn = D_Connection.openDataBase();
            call = conn.prepareCall("{call DeleteSize(?)}");
            call.setInt(1, idSize);
            call.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            D_Connection.closeDataBase(conn, call);
        }
        return true;
    }
    
        public List<Color> getColor() {
        Connection conn = null;
        CallableStatement call = null;
        List<Color> color = new ArrayList<>();
        try {
            conn = D_Connection.openDataBase();
            call = conn.prepareCall("{call getColor()}");          
            ResultSet rs = call.executeQuery();
            while (rs.next()) {
                Color a = new Color();
                a.setId(rs.getInt("Ma_mau"));
                a.setNameColor(rs.getString("Ten_mau"));          
                a.setStatus(rs.getBoolean("Trang_thai"));   
                color.add(a);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            D_Connection.closeDataBase(conn, call);
        }
        return color;
    }
    
    
    public Color getColorById(int idColor){
        Connection conn=null;
        CallableStatement call=null;
        Color color=new Color();
        try {
            conn=D_Connection.openDataBase();
            call=conn.prepareCall("{call getColorById(?)}");
            call.setInt(1, idColor);
            ResultSet rs=call.executeQuery();
            if(rs.next()){
                color.setId(rs.getInt("Ma_mau"));
                color.setNameColor(rs.getString("Ten_mau"));          
                color.setStatus(rs.getBoolean("Trang_thai"));                          
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            D_Connection.closeDataBase(conn, call);
        }
        return color;
    }
    
    public boolean insertColor(Color color) {
        Connection conn = null;
        CallableStatement call = null;
        try {
            conn = D_Connection.openDataBase();
            call = conn.prepareCall("{call InsertColor(?,?)}");
            call.setString(1, color.getNameColor());
            call.setBoolean(2, color.isStatus());  
            call.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            D_Connection.closeDataBase(conn, call);
        }
        return true;
    }
    
    public boolean UpdateColor(Color color) {
        Connection conn = null;
        CallableStatement call = null;
        try {
            conn = D_Connection.openDataBase();
            call = conn.prepareCall("{call UpdateColor(?,?,?)}");
            call.setInt(1, color.getId());
            call.setString(2, color.getNameColor());
            call.setBoolean(3, color.isStatus());  
            call.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            D_Connection.closeDataBase(conn, call);
        }
        return true;
    }
    
    public boolean DeleteColor(int idColor) {
        Connection conn = null;
        CallableStatement call = null;
        try {
            conn = D_Connection.openDataBase();
            call = conn.prepareCall("{call DeleteColor(?)}");
            call.setInt(1, idColor);
            call.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            D_Connection.closeDataBase(conn, call);
        }
        return true;
    }
    
    
    public List<Order> getOrder() {
        Connection conn = null;
        CallableStatement call = null;
        List<Order> order = new ArrayList<>();
        try {
            conn = D_Connection.openDataBase();
            call = conn.prepareCall("{call GetOrder()}");          
            ResultSet rs = call.executeQuery();
            while (rs.next()) {
                Order a = new Order();
                a.setId(rs.getInt("Ma_hoa_don"));
                a.setIdCustomer(rs.getInt("Ma_khach_hang"));          
                a.setQuantity(rs.getDouble("Tong_tien"));   
                a.setDatebuy(rs.getDate("Ngay_mua"));
                a.setIdShip(rs.getInt("Ma_ship"));          
                a.setIdPay(rs.getInt("Ma_thanh_toan")); 
                a.setStatus(rs.getBoolean("Tinh_trang"));
                order.add(a);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            D_Connection.closeDataBase(conn, call);
        }
        return order;
    }   
}
