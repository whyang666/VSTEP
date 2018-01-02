<%@ page import="com.opensymphony.xwork2.ActionContext" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="c" uri="/struts-tags" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<html>--%>
<!--[if lt IE 7]> <html class="lt-ie9 lt-ie8 lt-ie7" lang="en-US"> <![endif]-->
<!--[if IE 7]>    <html class="lt-ie9 lt-ie8" lang="en-US"> <![endif]-->
<!--[if IE 8]>    <html class="lt-ie9" lang="en-US"> <![endif]-->
<!--[if gt IE 8]><!--> <html lang="en-US"> <!--<![endif]-->
<head>
    <!-- META TAGS -->
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <title>企业像</title>

    <link rel="shortcut icon" href="images/favicon.png" />
    <!-- Style Sheet-->
    <link rel="stylesheet" href="style.css"/>
    <link rel='stylesheet' id='bootstrap-css-css'  href='css/bootstrap5152.css?ver=1.0' type='text/css' media='all' />
    <link rel='stylesheet' id='responsive-css-css'  href='css/responsive5152.css?ver=1.0' type='text/css' media='all' />
    <link rel='stylesheet' id='pretty-photo-css-css'  href='js/prettyphoto/prettyPhotoaeb9.css?ver=3.1.4' type='text/css' media='all' />
    <link rel='stylesheet' id='main-css-css'  href='css/main5152.css?ver=1.0' type='text/css' media='all' />
    <link rel='stylesheet' id='custom-css-css'  href='css/custom5152.html?ver=1.0' type='text/css' media='all' />

</head>

<body>

<!-- Start of Header -->
<div class="header-wrapper">
    <header>
        <div class="container">
            <div class="logo-container">
                <div style="width: 120px;height: 25px;float: left">
                    <p id="logo" style="font-weight: bold;font-size: 25px; color: rgba(255, 255, 255, 100);">企业视窗</p>
                </div>
                <span class="tag-line">北邮人团队</span>
            </div>
            <!-- Start of Main Navigation -->
            <nav class="main-nav">
                <div class="menu-top-menu-container">
                    <ul id="menu-top-menu" class="clearfix">
                        <li><a href="index.jsp">主页</a></li>
                        <li><a href="model.jsp">模型展示</a></li>
                        <li><a href="#footer-wrapper" class="scroll">联系我们</a></li>
                    </ul>
                </div>
            </nav>
            <!-- End of Main Navigation -->
        </div>
    </header>
</div>
<!-- End of Header -->

<!-- Start of Search Wrapper -->
<div class="search-area-wrapper">
    <div class="search-area container">
        <h3 class="search-header">旅游企业视窗——真“像”一查到底</h3>
        <p class="search-tag-line">权威数据来源 & 洞察企业实力</p>


        <form id="search-form" class="search-form clearfix"  action="search.action" autocomplete="off">
            <input class="search-term required" type="text" id="s" name="companyname" placeholder="请输入查询内容" title="请输入查询内容" />
            <input class="search-btn" type="submit" value="搜索" />
            <div id="search-error-container"></div>
        </form>
    </div>
</div>
<!-- End of Search Wrapper -->

<!-- Start of Page Container -->
<div class="page-container">
    <div class="container">
        <h1>搜索结果</h1>
        <div class="row">

            <!-- start of page content -->
            <div class="span8 main-listing">
                <h3>暂无搜索结果</h3>
            </div>
            <!-- end of page content -->

            <!-- start of sidebar -->
            <aside class="span4 page-sidebar">

                <section class="widget">
                    <h2 class="title">公司排行榜       得分</h2>
                    <span class="article-meta">23 Feb, 2017 in <a href="#" title="View all posts in Website Dev">Website Dev</a></span>
                    <ul class="articles">
                        <s:iterator value="#rankinglist" id="company">
                            <li class="article-entry standard">
                                <h3>
                                    <a href="detail.action?companyname=<s:property value="#company.companyName" />">
                                        <s:property value="#company.companyName" />
                                    </a>
                                </h3>

                                <span class="like-count"><s:property value="#company.companyScore"/> </span>
                            </li>
                        </s:iterator>
                    </ul>
                </section>

            </aside>
            <!-- end of sidebar -->
        </div>
    </div>
</div>
<!-- End of Page Container -->

<!-- Start of Footer -->
<footer id="footer-wrapper"  style="position:relative;top: 100px">
    <div id="footer" class="container">
        <div class="row">

            <div class="span3">
                <section class="widget">
                    <h3 class="title">什么是企业画像</h3>
                    <div class="textwidget">
                        <p>通过对旅游企业不诚信线索的调研，构建我们的指标体系和模型，从而得到每个企业的个性化画像，让消费者一目了然其公司状态，最终实现对各企业的实时监管</p>
                        <p>为工商部门和普通大众提供一个透明的，可视化平台，动员全社会力量共同监制不诚信企业行为。</p>
                    </div>
                </section>
            </div>

            <div class="span3">
                <section class="widget"><h3 class="title">我们的团队</h3>
                    <ul>
                        <li>裴仪瑶</li>
                        <li>党蓉</li>
                        <li>马飞飞</li>
                        <li>王昊阳</li>
                        <li>沈富豪</li>
                    </ul>
                </section>
            </div>


            <div class="span3">
                <section class="widget">
                    <h3 class="title">数据支持</h3>
                    <p>龙信数据</p>
                </section>
            </div>

            <div class="span3">
                <section class="widget">
                    <h3 class="title">联系我们</h3>
                    <p>电话：18911912812</p>
                    <p>电子邮件：799625048@qq.com</p>
                    <p>地址：北京邮电大学</p>
                </section>
            </div>

        </div>
    </div>
    <!-- end of #footer -->
</footer>
<!-- End of Footer -->

<a href="#top" id="scroll-top"></a>

<!-- script -->
<script type='text/javascript' src='js/jquery-1.8.3.min.js'></script>
<script type='text/javascript' src='js/jquery.easing.1.34e44.js?ver=1.3'></script>
<script type='text/javascript' src='js/prettyphoto/jquery.prettyPhotoaeb9.js?ver=3.1.4'></script>
<script type='text/javascript' src='js/jquery.liveSearchd5f7.js?ver=2.0'></script>
<script type='text/javascript' src='js/jflickrfeed.js'></script>
<script type='text/javascript' src='js/jquery.formd471.js?ver=3.18'></script>
<script type='text/javascript' src='js/jquery.validate.minfc6b.js?ver=1.10.0'></script>
<script type='text/javascript' src='js/custom5152.js?ver=1.0'></script>

<div style="display:none"><script src='http://v7.cnzz.com/stat.php?id=155540&web_id=155540' language='JavaScript' charset='gb2312'></script></div>
</body>
</html>
