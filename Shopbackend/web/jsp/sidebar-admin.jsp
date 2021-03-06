<%-- 
    Document   : sidebaradmin
    Created on : Jul 18, 2018, 10:59:10 AM
    Author     : ScorPius 31
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<div id="sidebar" class="sidebar responsive">
    <script type="text/javascript">
        try {
            ace.settings.check('sidebar', 'fixed')
        } catch (e) {
        }
    </script>

    <div class="sidebar-shortcuts" id="sidebar-shortcuts">
        <div class="sidebar-shortcuts-large" id="sidebar-shortcuts-large">
            <button class="btn btn-success">
                <i class="ace-icon fa fa-signal"></i>
            </button>

            <button class="btn btn-info">
                <i class="ace-icon fa fa-pencil"></i>
            </button>

            <button class="btn btn-warning">
                <i class="ace-icon fa fa-users"></i>
            </button>

            <button class="btn btn-danger">
                <i class="ace-icon fa fa-cogs"></i>
            </button>
        </div>

        <div class="sidebar-shortcuts-mini" id="sidebar-shortcuts-mini">
            <span class="btn btn-success"></span>

            <span class="btn btn-info"></span>

            <span class="btn btn-warning"></span>

            <span class="btn btn-danger"></span>
        </div>
    </div><!-- /.sidebar-shortcuts -->

    <ul class="nav nav-list">
        <li class="active">
            <a href="index.htm">
                <i class="menu-icon fa fa-tachometer"></i>
                <span class="menu-text"> Dashboard </span>
            </a>

            <b class="arrow"></b>
        </li>

        <li class="">
            <a href="" class="dropdown-toggle">
                <i class="menu-icon fa fa-list"></i>
                <span class="menu-text"> Quản lí người dùng </span>

                <b class="arrow fa fa-angle-down"></b>
            </a>

            <b class="arrow"></b>

            <ul class="submenu">
                <li class="">
                    <a href="admin.htm">
                        <i class="menu-icon fa fa-caret-right"></i>
                        Admin
                    </a>

                    <b class="arrow"></b>
                </li>
                <li class="">
                    <a href="user.htm">
                        <i class="menu-icon fa fa-caret-right"></i>
                        User
                    </a>

                    <b class="arrow"></b>
                </li>
            </ul>	
        </li>

        <li class="">
            <a href="getData.htm">
                <i class="menu-icon fa fa-list"></i>
                <span class="menu-text">Quản lí sản phẩm</span>
            </a>
        </li>

        <li class="">
            <a href="getSupplier.htm">
                <i class="menu-icon fa fa-list"></i>
                <span class="menu-text">Quản lí nhà cung cấp</span>
            </a>	
        </li>

        <li class="">
            <a href="getSale.htm">
                <i class="menu-icon fa fa-list"></i>
                <span class="menu-text"> Quản lí khuyến mại</span>
            </a>	
        </li>

        <li class="">
            <a href="getcomment.htm">
                <i class="menu-icon fa fa-list"></i>
                <span class="menu-text">Quản lí bình luận</span>
            </a>	
        </li>
        
        <li class="">
            <a href="getSize.htm">
                <i class="menu-icon fa fa-list"></i>
                <span class="menu-text">Quản lí size</span>
            </a>	
        </li>

        <li class="">
            <a href="getColor.htm">
                <i class="menu-icon fa fa-list"></i>
                <span class="menu-text">Quản lí màu sắc</span>
            </a>	
        </li>
        
        <li class="">
            <a href="">
                <i class="menu-icon fa fa-list"></i>
                <span class="menu-text"> Quản lí danh mục ảnh</span>
            </a>	
        </li>     

        <li class="">
            <a href="getOrder.htm">
                <i class="menu-icon fa fa-list"></i>
                <span class="menu-text"> Quản lí hóa đơn</span>
            </a>	
        </li>      

        <li class="">
            <a href="getPay.htm">
                <i class="menu-icon fa fa-list"></i>
                <span class="menu-text">Quản lí phương thức thanh toán</span>
            </a>	
        </li>

        <li class="">
            <a href="getShip.htm">
                <i class="menu-icon fa fa-list"></i>
                <span class="menu-text">Quản lí Ship</span>
            </a>	
        </li>

    </ul><!-- /.nav-list -->

    <div class="sidebar-toggle sidebar-collapse" id="sidebar-collapse">
        <i class="ace-icon fa fa-angle-double-left" data-icon1="ace-icon fa fa-angle-double-left" data-icon2="ace-icon fa fa-angle-double-right"></i>
    </div>

    <script type="text/javascript">
        try {
            ace.settings.check('sidebar', 'collapsed')
        } catch (e) {
        }
    </script>
</div>
