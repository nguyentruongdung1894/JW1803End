/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bkap.Controller;

import bkap.Connection.D_Connection;
import bkap.Entity.Comment;
import bkap.Entity.D_banner;
import bkap.Entity.ProductAdmin;
import bkap.Entity.Sale;
import bkap.Entity.Search;
import bkap.Entity.Supplier;
import bkap.Entity.UserAdmin;
import bkap.Model.D_Model;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author ScorPius 31
 */
@Controller
@RequestMapping(value = "/admin")
public class D_Controller {

    private final D_Model d_model;

    public D_Controller() {
        d_model = new D_Model();
    }

    @RequestMapping(value = "/index")
    public ModelAndView getProduct() {
        ModelAndView model = new ModelAndView("index-admin");
        return model;
    }

    @RequestMapping(value = "/admin")
    public ModelAndView getAdmin() {
        ModelAndView model = new ModelAndView("AccountAdmin");       
        List<UserAdmin> listAdmin = d_model.getAdmin();    
        Search searchuser=new Search();       
        model.getModelMap().addAttribute("searchuser", searchuser);
        model.addObject("listAdmin", listAdmin);
        return model;
    }

    @RequestMapping(value = "/user")
    public ModelAndView getUser() {
        ModelAndView model = new ModelAndView("AccountUser");
        List<UserAdmin> listUser = d_model.getUser();
        Search searchuser=new Search();       
        model.getModelMap().addAttribute("searchuser", searchuser);
        model.addObject("listUser", listUser);
        return model;
    }

    @RequestMapping(value = "/productMen-admin")
    public ModelAndView getMadmin() {
        ModelAndView model = new ModelAndView("Men-admin");
        List<ProductAdmin> listMadmin = d_model.getProductMen();
        List<D_banner> listBannerMen = d_model.getBannerMen();
        List<D_banner> listBannerWomen = d_model.getBannerWomen();    
        Search usersearch=new Search();       
        model.getModelMap().addAttribute("usersearch", usersearch);
        model.addObject("listMadmin", listMadmin);
        model.addObject("listBannerMen", listBannerMen);
        model.addObject("listBannerWomen", listBannerWomen);
        return model;
    }

    @RequestMapping(value = "/productWomen-admin")
    public ModelAndView getWadmin() {
        ModelAndView model = new ModelAndView("Women-admin");
        List<ProductAdmin> listWadmin = d_model.getProductWomen();
        List<D_banner> listBannerMen = d_model.getBannerMen();
        List<D_banner> listBannerWomen = d_model.getBannerWomen();
        Search usersearch=new Search();       
        model.getModelMap().addAttribute("usersearch", usersearch);
        model.addObject("listWadmin", listWadmin);
        model.addObject("listBannerMen", listBannerMen);
        model.addObject("listBannerWomen", listBannerWomen);
        return model;
    }

    @RequestMapping(value = "/productBag-admin")
    public ModelAndView getBadmin() {
        ModelAndView model = new ModelAndView("Bag-admin");
        List<ProductAdmin> listBadmin = d_model.getProductBag();
        List<D_banner> listBannerMen = d_model.getBannerMen();
        List<D_banner> listBannerWomen = d_model.getBannerWomen();
        Search usersearch=new Search();       
        model.getModelMap().addAttribute("usersearch", usersearch);
        model.addObject("listBadmin", listBadmin);
        model.addObject("listBannerMen", listBannerMen);
        model.addObject("listBannerWomen", listBannerWomen);
        return model;
    }

    @RequestMapping(value = "/productFootwear-admin")
    public ModelAndView getFadmin() {
        ModelAndView model = new ModelAndView("Footwear-admin");
        List<ProductAdmin> listFadmin = d_model.getProductFootwear();
        List<D_banner> listBannerMen = d_model.getBannerMen();
        List<D_banner> listBannerWomen = d_model.getBannerWomen();
        Search usersearch=new Search();       
        model.getModelMap().addAttribute("usersearch", usersearch);
        model.addObject("listFadmin", listFadmin);
        model.addObject("listBannerMen", listBannerMen);
        model.addObject("listBannerWomen", listBannerWomen);
        return model;
    }

    @RequestMapping(value = "/getData")
    public ModelAndView getDataProduct() {
        ModelAndView model = new ModelAndView("Product-admin");
        int sizeRowofPage = 10;
        HashMap map = d_model.getDataPagination(1, sizeRowofPage);
        String url = (String) map.get("url");
        List<ProductAdmin> listProduct = new ArrayList<>();
        try {
            ResultSet rs = (ResultSet) map.get("rs");
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
                listProduct.add(pro);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Connection conn = (Connection) map.get("conn");
            CallableStatement callSt = (CallableStatement) map.get("callSt");
            D_Connection.closeDataBase(conn, callSt);
        }
        Search usersearch=new Search();       
        model.getModelMap().addAttribute("usersearch", usersearch);
        model.getModelMap().put("listProduct", listProduct);
        model.getModelMap().put("url", url);
        return model;
    }

    @RequestMapping(value = "/getDataPagging")
    public ModelAndView getDataProductPagging(@RequestParam("page") String page) {
        ModelAndView model = new ModelAndView("Product-admin");
        int pageInt = Integer.parseInt(page);
        int sizeRowofPage = 10;
        HashMap map = d_model.getDataPagination(pageInt, sizeRowofPage);
        String url = (String) map.get("url");
        List<ProductAdmin> listProduct = new ArrayList<>();
        try {
            ResultSet rs = (ResultSet) map.get("rs");
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
                listProduct.add(pro);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            Connection conn = (Connection) map.get("conn");
            CallableStatement callSt = (CallableStatement) map.get("callSt");
            D_Connection.closeDataBase(conn, callSt);
        }
        model.getModelMap().put("listProduct", listProduct);
        Search usersearch=new Search();       
        model.getModelMap().addAttribute("usersearch", usersearch);
        model.getModelMap().put("url", url);
        return model;
    }
    
    @RequestMapping(value = "/mens-filter")
    public ModelAndView getmens(int productMenById) {
        ModelAndView model = new ModelAndView("men-filter");
        List<D_banner> listBannerMen = d_model.getBannerMen();
        List<D_banner> listBannerWomen = d_model.getBannerWomen();
        List<ProductAdmin> listProductM=d_model.getProductMenById(productMenById);
        Search usersearch=new Search();       
        model.getModelMap().addAttribute("usersearch", usersearch);
        model.addObject("listBannerMen", listBannerMen);
        model.addObject("listBannerWomen", listBannerWomen);
        model.addObject("listProductM", listProductM);
        return model;
    }

    @RequestMapping(value = "/womens-filter")
    public ModelAndView getwomens(int productWomenById) {
        ModelAndView model = new ModelAndView("women-filter");
        List<D_banner> listBannerMen = d_model.getBannerMen();
        List<D_banner> listBannerWomen = d_model.getBannerWomen();
        List<ProductAdmin> listProductW=d_model.getProductWomenById(productWomenById);
        Search usersearch=new Search();       
        model.getModelMap().addAttribute("usersearch", usersearch);
        model.addObject("listBannerMen", listBannerMen);
        model.addObject("listBannerWomen", listBannerWomen);
        model.addObject("listProductW", listProductW);
        return model;
    }
    
    @RequestMapping(value = "/delete-product")
    public String delete(int productId){
        boolean check=d_model.deleteProduct(productId);
        if(check){          
            return "redirect:getData.htm";
        }
        else{
            return "error";
        }
    }
    
    @RequestMapping(value = "/iUpdate")
    public ModelAndView iUpdate(int productId){
        ModelAndView model=new ModelAndView("updateProduct-admin");       
        ProductAdmin proUpdate=d_model.getProductById(productId);
        List<Supplier> sup=d_model.getSupplier();
        List<Sale> sale=d_model.getSale();
        model.addObject("sup", sup);
        model.addObject("sale", sale);
        model.getModelMap().addAttribute("proUpdate", proUpdate);      
        return model;
    }
    
    @RequestMapping(value = "/update")
    public String update(ProductAdmin pro){
        boolean check=d_model.UpdateProduct(pro);
        if(check){          
            return "redirect:getData.htm";
        }
        else{
            return "error";
        }
    }
    
    @RequestMapping(value = "/iInsert")
    public ModelAndView iIsert(){
        ModelAndView model=new ModelAndView("insertProduct-admin");
        ProductAdmin proInsert=new ProductAdmin();
        List<Supplier> sup=d_model.getSupplier();
        List<Sale> sale=d_model.getSale();
        model.addObject("sup", sup);
        model.addObject("sale", sale);
        model.getModelMap().addAttribute("proInsert", proInsert);
        return model;
    }
    
    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public String Isert(ProductAdmin proAdmin){
        boolean check=d_model.inserProduct(proAdmin);
        if(check){          
            return "redirect:getData.htm";
        }
        else{
            return "error";
        }
    }
    
    @RequestMapping(value = "/delete-user")
    public String deleteUser(int userId){
        boolean check=d_model.deleteUser(userId);
        if(check){          
            return "redirect:admin.htm";
        }
        else{
            return "error";
        }
    }
    
    @RequestMapping(value = "/iUpdate-User")
    public ModelAndView iUpdateUser(int userId){
        ModelAndView model=new ModelAndView("updateUser-admin");       
        UserAdmin useradminUpdate=d_model.getUserById(userId);
        model.getModelMap().addAttribute("useradminUpdate", useradminUpdate);      
        return model;
    }
    
    @RequestMapping(value = "/update-User")
    public String updateUser(UserAdmin useradmin){
        boolean check=d_model.UpdateUser(useradmin);
        if(check){          
            return "redirect:admin.htm";
        }
        else{
            return "error";
        }
    }
    
    @RequestMapping(value = "/iInsert-User")
    public ModelAndView iIsertUser(){
        ModelAndView model=new ModelAndView("insertUser-admin");
        UserAdmin useradminInsert=new UserAdmin();
        model.getModelMap().addAttribute("useradminInsert", useradminInsert);
        return model;
    }
    
    @RequestMapping(value = "/insert-User", method = RequestMethod.POST)
    public String IsertUser(UserAdmin useradmin){
        boolean check=d_model.inserUser(useradmin);
        if(check){          
            return "redirect:admin.htm";
        }
        else{
            return "error";
        }
    }
    
    @RequestMapping(value = "/search")
    public ModelAndView search(Search str){
        ModelAndView model=new ModelAndView("search");    
        Search usersearch=new Search();
        List<ProductAdmin> prosearch=d_model.search(str);    
        model.getModelMap().addAttribute("usersearch", usersearch);
        model.addObject("prosearch", prosearch);
        return model;
    }
    
    @RequestMapping(value = "/searchuser")
    public ModelAndView searchuser(Search str){
        ModelAndView model=new ModelAndView("searchUser");    
        Search searchuser=new Search();
        List<UserAdmin> search=d_model.searchUser(str);    
        model.getModelMap().addAttribute("searchuser", searchuser);
        model.addObject("search", search);
        return model;
    }
    
    @RequestMapping(value = "/getcomment")
    public ModelAndView getcomment(){
        ModelAndView model=new ModelAndView("comment-admin");    
        List<Comment> listcomment=d_model.getcomment();
        model.addObject("listcomment", listcomment);
        return model;
    }
    
    @RequestMapping(value = "/iUpdate-Cmt")
    public ModelAndView iCmt(int id){
        ModelAndView model=new ModelAndView("updateCmt");       
        Comment cmt=d_model.getCmtById(id);      
        model.getModelMap().addAttribute("cmt", cmt);      
        return model;
    }
    
    @RequestMapping(value = "/update-Cmt")
    public String updateCmt(Comment cmt){
        boolean check=d_model.UpdatCmt(cmt);
        if(check){          
            return "redirect:iUpdate-Cmt.htm";
        }
        else{
            return "error";
        }
    }
    
    @RequestMapping(value = "/getSupplier")
    public ModelAndView getSupplier(){
        ModelAndView model=new ModelAndView("supplier");
        List<Supplier> supplier=d_model.getSupplier();
        model.addObject("supplier", supplier);
        return model;
    }
    
    @RequestMapping(value = "/delete-supplier")
    public String deleteSupplier(int idSupplier){
        boolean check=d_model.deleteSupplier(idSupplier);
        if(check){          
            return "redirect:getSupplier.htm";
        }
        else{
            return "error";
        }
    }
    
    @RequestMapping(value = "/iUpdate-supplier")
    public ModelAndView iUpdatesupplier(int idSupplier){
        ModelAndView model=new ModelAndView("updatesupplier-admin");       
        Supplier supplier=d_model.getSupplierById(idSupplier);
        
        model.getModelMap().addAttribute("supplier", supplier);      
        return model;
    }
    
    @RequestMapping(value = "/update-supplier")
    public String updatesupplier(Supplier sup){
        boolean check=d_model.UpdateSupplier(sup);
        if(check){          
            return "redirect:getSupplier.htm";
        }
        else{
            return "error";
        }
    }
   
    @RequestMapping(value = "/iInsert-supplier")
    public ModelAndView iIsertsupplier(){
        ModelAndView model=new ModelAndView("insertsupplier-admin");
        Supplier supplier=new Supplier();       
        model.getModelMap().addAttribute("supplier", supplier);
        return model;
    }
    
    @RequestMapping(value = "/insert-supplier", method = RequestMethod.POST)
    public String Isertsupplier(Supplier sup){
        boolean check=d_model.insertSupplier(sup);
        if(check){          
            return "redirect:getSupplier.htm";
        }
        else{
            return "error";
        }
    }
    
    @RequestMapping(value = "/getSale")
    public ModelAndView getSale(){
        ModelAndView model=new ModelAndView("sale");
        List<Sale> sale=d_model.getSale();
        model.addObject("sale", sale);
        return model;
    }
    
    @RequestMapping(value = "/delete-sale")
    public String deleteSale(int idSale){
        boolean check=d_model.deleteSale(idSale);
        if(check){          
            return "redirect:getSale.htm";
        }
        else{
            return "error";
        }
    }
    
    @RequestMapping(value = "/iUpdate-sale")
    public ModelAndView iUpdatesale(int idSale){
        ModelAndView model=new ModelAndView("updatesale-admin");       
        Sale sale=d_model.getSaleById(idSale);      
        model.getModelMap().addAttribute("sale", sale);      
        return model;
    }
    
    @RequestMapping(value = "/update-sale")
    public String updatesale(Sale sale){
        boolean check=d_model.UpdateSale(sale);
        if(check){          
            return "redirect:getSale.htm";
        }
        else{
            return "error";
        }
    }
   
    @RequestMapping(value = "/iInsert-sale")
    public ModelAndView iIsertsale(){
        ModelAndView model=new ModelAndView("insertsale-admin");
        Sale sale=new Sale();       
        model.getModelMap().addAttribute("sale", sale);
        return model;
    }
    
    @RequestMapping(value = "/insert-sale", method = RequestMethod.POST)
    public String Isertsale(Sale sale){
        boolean check=d_model.insertSale(sale);
        if(check){          
            return "redirect:getSale.htm";
        }
        else{
            return "error";
        }
    }
}
