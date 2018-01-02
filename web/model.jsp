<%--
  Created by IntelliJ IDEA.
  User: win7
  Date: 2017/5/5
  Time: 16:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>模型</title>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="shortcut icon" href="images/favicon.png" />
    <link href="css/jquery-accordion-menu.css" rel="stylesheet" type="text/css" />
    <script src="js/jquery-1.11.2.min.js" type="text/javascript"></script>
    <script src="js/jquery-accordion-menu.js" type="text/javascript"></script>
    <link href="css/font-awesome.css" rel="stylesheet" type="text/css" />
    <!-- Style Sheet-->
    <link rel='stylesheet' id='bootstrap-css-css'  href='css/bootstrap5152.css?ver=1.0' type='text/css' media='all' />
    <link rel='stylesheet' id='responsive-css-css'  href='css/responsive5152.css?ver=1.0' type='text/css' media='all' />
    <link rel='stylesheet' id='pretty-photo-css-css'  href='js/prettyphoto/prettyPhotoaeb9.css?ver=3.1.4' type='text/css' media='all' />
    <link rel='stylesheet' id='main-css-css'  href='css/main5152.css?ver=1.0' type='text/css' media='all' />
    <link rel='stylesheet' id='custom-css-css'  href='css/custom5152.html?ver=1.0' type='text/css' media='all' />
    <link href="css/styles.css" rel="stylesheet">
    <script src="js/echarts.js"></script>
    <link rel="stylesheet" href="css/style1.css">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />

</head>
<body>

<div class="header-wrapper" style="height: 150px;position: fixed; top:0; z-index:99;">
    <header>
        <div class="container">
            <div class="logo-container">
                <div style="width: 120px;height: 25px;float: left">
                    <p id="logo" style="font-weight: bold;font-size: 25px; color: rgba(255, 255, 255, 100);">企业视窗</p>
                </div>
                <span class="tag-line">北邮人团队</span>
            </div>

            <div style="position: absolute;top: 20px; left: 200px; width: 730px" >
                <form id="search-form" class="search-form clearfix"  action="search.action" autocomplete="off">
                    <input class="search-term required" type="text" id="s" name="companyname" placeholder="请输入查询内容" title="请输入查询内容" />
                    <input  style="background-color: #f0b70c" class="search-btn" type="submit" value="搜索" />
                    <div id="search-error-container"></div>
                </form>
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

<!-- Start of Page Container -->
<div class="page-container" style="position:relative;top: 150px">
    <div class="container">

        <h1 style="font-size: 30px">
            企业画像模型
        </h1>
        <div align="center">
            <br/>
            <div id="model_picture" style="width: 800px;height:600px;">
                <img src="images/model.bmp"  width="800px" height="600px" />
            </div>

            <div id="model_word" style="width: 800px;height:100px;">
                <h1>
                    我们的模型从数据方面来分为了5个大方面，5个大方面下包含有各自的小方面，我们以每个小方面的分数及其所占比重计算5个大方面的分数以及总分数，并将计算结果标准化为0-10分的区间。
                    详细计算过程：
                    将所有小方面的分数计算出来以后，标准化为0-10分，然后对所有小方面平均分配比重，计算出来一个初始总分数分布：
                </h1>
            </div>

            <div id="calculate_picture1" style="width: 800px;height:150px;">
                <img src="images/calculate1.png"  width="800px" height="150px" />
            </div>

            <div id="calculate_word1" style="width: 800px;height:100px;">
                <h1>
                    然后对比重进行调整，以企业财务为例：
                    财务分 =（负债总额/资产总额+利润总额/营业总收入）/ 2 * 标准化系数，得到财务分的一个分布：
                </h1>
            </div>
            <div id="calculate_picture2" style="width: 800px;height:150px;">
                <img src="images/calculate2.png"  width="800px" height="150px" />
            </div>
            <div id="calculate_word2" style="width: 800px;height:100px;">
                <h1>
                    我们可以看到，财务分大多数的公司在7-8分之间，说明大部分的公司在财务状况方面良好，那么对应的在总分的分布中，分数相对较高的公司应该占据相当一部分数量，而现在的总分分部并不符合，所以我们应当对财务分数所占比重进行调整。
                </h1>
            </div>
        </div>


    </div>
</div>
<!-- End of Page Container -->

<!-- Start of Footer -->
<footer id="footer-wrapper"  style="position:relative;top: 100px">
    <div id="footer">
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
</body>
</html>
