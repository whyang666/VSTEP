<%@ taglib prefix="s" uri="/struts-tags" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!--[if lt IE 7]> <html class="lt-ie9 lt-ie8 lt-ie7" lang="en-US"> <![endif]-->
<!--[if IE 7]>    <html class="lt-ie9 lt-ie8" lang="en-US"> <![endif]-->
<!--[if IE 8]>    <html class="lt-ie9" lang="en-US"> <![endif]-->
<!--[if gt IE 8]><!--> <html lang="en-US"> <!--<![endif]-->
<head>
    <!-- META TAGS -->
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <script src="js/echarts.js"></script>

    <title>公司对比页</title>

    <link rel="shortcut icon" href="images/favicon.png" />

    <!-- Style Sheet-->
    <link rel='stylesheet' id='bootstrap-css-css'  href='css/bootstrap5152.css?ver=1.0' type='text/css' media='all' />
    <link rel='stylesheet' id='responsive-css-css'  href='css/responsive5152.css?ver=1.0' type='text/css' media='all' />
    <link rel='stylesheet' id='pretty-photo-css-css'  href='js/prettyphoto/prettyPhotoaeb9.css?ver=3.1.4' type='text/css' media='all' />
    <link rel='stylesheet' id='main-css-css'  href='css/main5152.css?ver=1.0' type='text/css' media='all' />
    <link rel='stylesheet' id='custom-css-css'  href='css/custom5152.html?ver=1.0' type='text/css' media='all' />
    <link href="css/styles.css" rel="stylesheet">
    <!--[if lt IE 9]>
    <![endif]-->
    <link href="css/jquery-accordion-menu.css" rel="stylesheet" type="text/css" />
    <script src="js/jquery-1.11.2.min.js" type="text/javascript"></script>
    <script src="js/jquery-accordion-menu.js" type="text/javascript"></script>
    <link href="css/font-awesome.css" rel="stylesheet" type="text/css" />

</head>

<body>
<!-- Start of Header -->
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
<!-- End of Header -->

<div class="content">
    <div id="jquery-accordion-menu" class="jquery-accordion-menu red">
        <ul id="demo-list">
            <li class="active"><a href="#basic_info" class="scroll"><i class="fa fa-home"></i>总分 </a></li>
            <li><a href="#finance" class="scroll"><i class="fa fa-suitcase"></i>财政状况 </a>
                <ul class="submenu">
                    <li><a href="#fincome" class="scroll">财务</a></li>
                    <li><a href="#branch" class="scroll">分支机构 </a></li>
                    <li><a href="#branch_dx" class="scroll">分支机构吊销 </a></li>
                    <li><a href="#branch_zx" class="scroll">分支机构注销 </a></li>
                    <li><a href="#web" class="scroll">网站网店 </a></li>
                </ul>
            </li>
            <li><a href="#staffs"class="scroll"><i class="fa fa-user"></i>人员流动 </a>
                <ul class="submenu">
                    <li><a href="#staff_num" class="scroll">从业人数</a></li>
                    <li><a href="#zp" class="scroll">招聘状况 </a></li>
                </ul>
            </li>
            <li><a href="#bad" class="scroll"><i class="fa fa-envelope"></i>负面相关 </a>
                <ul class="submenu">
                    <li><a href="#ts" class="scroll">顾客投诉</a></li>
                    <li><a href="#sa" class="scroll">涉案 </a></li>
                    <li><a href="#fy" class="scroll">法院公告 </a></li>
                    <li><a href="#pj" class="scroll">案件判决 </a></li>
                </ul>
            </li>
            <li><a href="#creation" class="scroll"><i class="fa fa-cog"></i>创新能力 </a>
                <ul class="submenu">
                    <li><a href="#zpzz" class="scroll">作品著作</a></li>
                    <li><a href="#rj" class="scroll">软件著作 </a></li>
                    <li><a href="#zl" class="scroll">专利 </a></li>
                    <li><a href="#sb" class="scroll">商标 </a></li>
                </ul>
            </li>
        </ul>
    </div>
</div>

<script type="text/javascript">
    jQuery("#jquery-accordion-menu").jqueryAccordionMenu();
</script>

<!-- Start of Page Container -->
<div class="page-container" style="position:relative;top: 150px">
    <div class="container">
        <div class="row">
            <!-- start of page content -->
            <div class="span12 page-content">
                <article class="type-page hentry clearfix">
                    <div style="width:100%;height:180px;left: 0px;float: left;clear:both">
                        <h2 class="post-title" style="margin-top: 50px">
                            <s:property value="companyname1"/><s:property value="companyInfo1.getTotal()" />vs
                            <s:property value="companyname2"/><s:property value="companyInfo2.getTotal()" />
                        </h2>
                    </div>
                    <%--<div id="total_score" style="width: 100%;height:300px;float: left;"></div>--%>
                    <%--<input type="hidden" value="<s:property value="companyInfo1.getTotal()" />" id="total"/>--%>
                    <%--<script type="text/javascript">--%>
                        <%--// 基于准备好的dom，初始化echarts实例--%>
                        <%--var myChart_total_score = echarts.init(document.getElementById('total_score2'));--%>
                        <%--// 指定图表的配置项和数据--%>
                        <%--var labelTop = {--%>
                            <%--normal : {--%>
                                <%--label : {--%>
                                    <%--show : true,--%>
                                    <%--position : 'center',--%>
                                    <%--formatter : '{b}',--%>
                                    <%--textStyle: {--%>
                                        <%--baseline : 'bottom',--%>
                                        <%--size: 80--%>
                                    <%--}--%>
                                <%--},--%>
                                <%--labelLine : {--%>
                                    <%--show : true--%>
                                <%--}--%>
                            <%--}--%>
                        <%--};--%>
                        <%--var labelFromatter = {--%>
                            <%--normal : {--%>
                                <%--label : {--%>
                                    <%--formatter : function (params){--%>
                                        <%--return 10 - params.value--%>
                                    <%--},--%>
                                    <%--textStyle: {--%>
                                        <%--baseline : 'top',--%>
                                        <%--color: '#23453c',--%>
                                        <%--size: 60,--%>
                                        <%--fontSize: 18--%>
                                    <%--}--%>
                                <%--}--%>
                            <%--},--%>
                        <%--}--%>
                        <%--var labelBottom = {--%>
                            <%--normal : {--%>
                                <%--color: '#ccc',--%>
                                <%--label : {--%>
                                    <%--show : true,--%>
                                    <%--position : 'center'--%>
                                <%--},--%>
                                <%--labelLine : {--%>
                                    <%--show : false--%>
                                <%--}--%>
                            <%--},--%>
                            <%--emphasis: {--%>
                                <%--color: 'rgba(0,0,0,0)'--%>
                            <%--}--%>
                        <%--};--%>
                        <%--var radius = [40, 60];--%>
                        <%--var test = document.getElementById("total2").getAttribute("value");--%>
                        <%--var option_total_score = {--%>
                            <%--series : [--%>
                                <%--{--%>
                                    <%--type : 'pie',--%>
                                    <%--center : ['50%', '50%'],--%>
                                    <%--radius : radius,--%>
                                    <%--x: '0%', // for funnel--%>
                                    <%--itemStyle : labelFromatter,--%>
                                    <%--data : [--%>
                                        <%--{name:'other', value:10-test, itemStyle : labelBottom},--%>
                                        <%--{name:'总分', value:test,itemStyle : labelTop}--%>
                                    <%--]--%>
                                <%--}--%>
                            <%--]--%>
                        <%--};--%>
                        <%--// 使用刚指定的配置项和数据显示图表。--%>
                        <%--myChart_total_score.setOption(option_total_score);--%>
                    <%--</script>--%>
                    <%--<div id="total_score2" style="width: 50%;height:180px;float: right;">--%>
                    <%--<input type="hidden" value="<s:property value="companyInfo2.getTotal()" />" id="total2"/>--%>
                    <%--<script type="text/javascript">--%>
                        <%--// 基于准备好的dom，初始化echarts实例--%>
                        <%--var myChart_total_score = echarts.init(document.getElementById('total_score2'));--%>
                        <%--// 指定图表的配置项和数据--%>
                        <%--var labelTop = {--%>
                            <%--normal : {--%>
                                <%--label : {--%>
                                    <%--show : true,--%>
                                    <%--position : 'center',--%>
                                    <%--formatter : '{b}',--%>
                                    <%--textStyle: {--%>
                                        <%--baseline : 'bottom',--%>
                                        <%--size: 80--%>
                                    <%--}--%>
                                <%--},--%>
                                <%--labelLine : {--%>
                                    <%--show : true--%>
                                <%--}--%>
                            <%--}--%>
                        <%--};--%>
                        <%--var labelFromatter = {--%>
                            <%--normal : {--%>
                                <%--label : {--%>
                                    <%--formatter : function (params){--%>
                                        <%--return 10 - params.value--%>
                                    <%--},--%>
                                    <%--textStyle: {--%>
                                        <%--baseline : 'top',--%>
                                        <%--color: '#23453c',--%>
                                        <%--size: 60,--%>
                                        <%--fontSize: 18--%>
                                    <%--}--%>
                                <%--}--%>
                            <%--},--%>
                        <%--}--%>
                        <%--var labelBottom = {--%>
                            <%--normal : {--%>
                                <%--color: '#ccc',--%>
                                <%--label : {--%>
                                    <%--show : true,--%>
                                    <%--position : 'center'--%>
                                <%--},--%>
                                <%--labelLine : {--%>
                                    <%--show : false--%>
                                <%--}--%>
                            <%--},--%>
                            <%--emphasis: {--%>
                                <%--color: 'rgba(0,0,0,0)'--%>
                            <%--}--%>
                        <%--};--%>
                        <%--var radius = [40, 60];--%>
                        <%--var test = document.getElementById("total2").getAttribute("value");--%>
                        <%--var option_total_score = {--%>
                            <%--series : [--%>
                                <%--{--%>
                                    <%--type : 'pie',--%>
                                    <%--center : ['50%', '50%'],--%>
                                    <%--radius : radius,--%>
                                    <%--x: '0%', // for funnel--%>
                                    <%--itemStyle : labelFromatter,--%>
                                    <%--data : [--%>
                                        <%--{name:'other', value:10-test, itemStyle : labelBottom},--%>
                                        <%--{name:'总分', value:test,itemStyle : labelTop}--%>
                                    <%--]--%>
                                <%--}--%>
                            <%--]--%>
                        <%--};--%>
                        <%--// 使用刚指定的配置项和数据显示图表。--%>
                        <%--myChart_total_score.setOption(option_total_score);--%>
                    <%--</script>--%>
                    <%--</div>--%>

                    <hr>

                    <div id="basic_info" style="font-size: 17px; height: 350px;margin-left: 200px;width: 100%;clear:both;">
                        <div  id="aggregate_score" style="height: 350px;width: 50%;"></div>
                        <input type="hidden" value="<s:property value="companyInfo1.getSecondScore().getFSituation()" />" id="FSituation"/>
                        <input type="hidden" value="<s:property value="companyInfo1.getSecondScore().getInnovate()" />" id="Innovate"/>
                        <input type="hidden" value="<s:property value="companyInfo1.getSecondScore().getNegative()" />" id="Negative"/>
                        <input type="hidden" value="<s:property value="companyInfo1.getSecondScore().getPersonnel()" />" id="Personnel"/>
                        <input type="hidden" value="<s:property value="companyInfo2.getSecondScore().getFSituation()" />" id="FSituation2"/>
                        <input type="hidden" value="<s:property value="companyInfo2.getSecondScore().getInnovate()" />" id="Innovate2"/>
                        <input type="hidden" value="<s:property value="companyInfo2.getSecondScore().getNegative()" />" id="Negative2"/>
                        <input type="hidden" value="<s:property value="companyInfo2.getSecondScore().getPersonnel()" />" id="Personnel2"/>
                        <input type="hidden" value="<s:property value="companyname1" />" id="name1"/>
                        <input type="hidden" value="<s:property value="companyname2" />" id="name2"/>
                        <script type="text/javascript">
                            var myChart_aggregate_score = echarts.init(document.getElementById('aggregate_score'));
                            var FSituation = document.getElementById("FSituation").getAttribute("value");
                            var Innovate = document.getElementById("Innovate").getAttribute("value");
                            var Negative = document.getElementById("Negative").getAttribute("value");
                            var Personnel = document.getElementById("Personnel").getAttribute("value");
                            var FSituation2 = document.getElementById("FSituation2").getAttribute("value");
                            var Innovate2= document.getElementById("Innovate2").getAttribute("value");
                            var Negative2 = document.getElementById("Negative2").getAttribute("value");
                            var Personnel2 = document.getElementById("Personnel2").getAttribute("value");
                            var name1 = document.getElementById("name1").getAttribute("value");
                            var name2 = document.getElementById("name2").getAttribute("value");
                            var option_aggregate_score = {
                                title: {
                                },
                                tooltip: {},
                                legend: {
                                    data:[name1,name2]
                                },
                                radar: {
                                    // shape: 'circle',
                                    indicator: [
                                        { name: '财政状况', max: 10},
                                        { name: '人员流动', max: 10},
                                        { name: '负面纠纷', max: 10},
                                        { name: '创新能力', max: 10},
                                    ]
                                },
                                series: [{
                                    name: '预算 vs 开销（Budget vs spending）',
                                    type: 'radar',
                                    // areaStyle: {normal: {}},
                                    data : [
                                        {
                                            value : [FSituation, Personnel, Negative, Innovate],
                                            name : name1
                                        },
                                        {
                                            value : [FSituation2, Personnel2, Negative2, Innovate2],
                                            name : name2
                                        }
                                    ]
                                }]
                            };
                            myChart_aggregate_score.setOption(option_aggregate_score);

                        </script>
                    </div><!-- .row -->

                    <%--财政状况--%>
                    <div id="finance" style="width: 100%;clear: both">
                        <h3>财政状况</h3>
                        <div id="finance_score" style="width: 450px;height:300px;margin-left: 200px"></div>
                        <input type="hidden" value="<s:property value="companyInfo1.getThirdScore().getFinance()" />" id="Finances"/>
                        <input type="hidden" value="<s:property value="companyInfo1.getThirdScore().getWebsite()" />" id="Websites"/>
                        <input type="hidden" value="<s:property value="companyInfo1.getThirdScore().getBranch()" />" id="Branchs"/>
                        <input type="hidden" value="<s:property value="companyInfo1.getThirdScore().getCancellation()" />" id="Cancellation"/>
                        <input type="hidden" value="<s:property value="companyInfo1.getThirdScore().getRevoke()" />" id="Revoke"/>
                        <input type="hidden" value="<s:property value="companyInfo2.getThirdScore().getFinance()" />" id="Finances2"/>
                        <input type="hidden" value="<s:property value="companyInfo2.getThirdScore().getWebsite()" />" id="Websites2"/>
                        <input type="hidden" value="<s:property value="companyInfo2.getThirdScore().getBranch()" />" id="Branchs2"/>
                        <input type="hidden" value="<s:property value="companyInfo2.getThirdScore().getCancellation()" />" id="Cancellation2"/>
                        <input type="hidden" value="<s:property value="companyInfo2.getThirdScore().getRevoke()" />" id="Revoke2"/>
                        <script type="text/javascript">
                            var myChart_finance_score = echarts.init(document.getElementById('finance_score'));
                            var Finance = document.getElementById("Finances").getAttribute("value");
                            var Website = document.getElementById("Websites").getAttribute("value");
                            var Branch = document.getElementById("Branchs").getAttribute("value");
                            var Cancellation = document.getElementById("Cancellation").getAttribute("value");
                            var Revoke = document.getElementById("Revoke").getAttribute("value");
                            var Finance2 = document.getElementById("Finances2").getAttribute("value");
                            var Website2 = document.getElementById("Websites2").getAttribute("value");
                            var Branch2 = document.getElementById("Branchs2").getAttribute("value");
                            var Cancellation2 = document.getElementById("Cancellation2").getAttribute("value");
                            var Revoke2 = document.getElementById("Revoke2").getAttribute("value");
                            var option_finance_score = {
                                title: {
                                },
                                tooltip: {},
                                legend: {
                                    data:[name1,name2]
                                },
                                radar: {
                                    // shape: 'circle',
                                    indicator: [
                                        { name: '财务收益', max: 10},
                                        { name: '网站建设', max: 10},
                                        { name: '分支机构', max: 10},
                                        { name: '吊销', max: 10},
                                        { name: '注销', max: 10},
                                    ]
                                },
                                series: [{
                                    name: '预算 vs 开销（Budget vs spending）',
                                    type: 'radar',
                                    // areaStyle: {normal: {}},
                                    data : [
                                        {
                                            value : [Finance, Website, Branch, Cancellation,Revoke],
                                            name : name1
                                        },
                                        {
                                            value : [Finance2, Website2, Branch2, Cancellation2,Revoke2],
                                            name : name2
                                        }
                                    ]
                                }]
                            };
                            myChart_finance_score.setOption(option_finance_score);

                        </script>
                    </div>

                    <dl class="toggle clearfix">
                        <dt><span></span>财务</dt>
                        <dd>
                        </dd> <div id="fincome"></div>
                        <dt><span></span>分支机构</dt>
                        <dd>
                            <s:iterator value="#third.getBranchName()" id="third11">
                                <p><s:property value="#third11"/></p>
                            </s:iterator>
                        </dd>
                        <div id="branch"></div>
                        <dt><span></span>分支机构吊销</dt>
                        <dd>
                            <s:iterator value="#third.getRevokeName()" id="third12">
                                <p><s:property value="#third12"/></p>
                            </s:iterator>
                        </dd><div id="branch_dx"></div>

                        <dt><span></span>分支机构注销</dt>
                        <dd>
                            <s:iterator value="#third.getCancellationName()" id="third13">
                                <p><s:property value="#third13"/></p>
                            </s:iterator>
                        </dd> <div id="branch_zx"></div>
                        <dt><span></span>网站网店</dt>
                        <dd>
                            <s:iterator value="#third.getWebsiteInfo()" id="third14">
                                <p><s:property value="#third14.getWebsiteName()"/> <s:property value="#third14.getWebsitrAddress()"/></p>
                            </s:iterator>
                        </dd>  <div id="web"></div>
                    </dl>
                    <%--人员流动--%>
                    <div id="staffs" style="width: 100%;">
                        <h3>人员流动</h3>
                        <div id="staff_score" style="width: 450px;height:300px;margin-left: 200px"></div>
                        <input type="hidden" value="<s:property value="companyInfo1.getThirdScore().getPractitioner()" />" id="Practitioner"/>
                        <input type="hidden" value="<s:property value="companyInfo1.getThirdScore().getRecruit()" />" id="Recruit"/>
                        <input type="hidden" value="<s:property value="companyInfo2.getThirdScore().getPractitioner()" />" id="Practitioner2"/>
                        <input type="hidden" value="<s:property value="companyInfo2.getThirdScore().getRecruit()" />" id="Recruit2"/>
                            <script type="text/javascript">
                            var myChart_staff_score = echarts.init(document.getElementById('staff_score'));
                            var Practitioner = document.getElementById("Practitioner").getAttribute("value");
                            var Recruit = document.getElementById("Recruit").getAttribute("value");
                            var Practitioner2 = document.getElementById("Practitioner2").getAttribute("value");
                            var Recruit2 = document.getElementById("Recruit2").getAttribute("value");
                            var option_staff_score = {
                                title: {
                                },
                                tooltip: {
                                    trigger: 'axis',
                                    axisPointer: {
                                        type: 'shadow'
                                    }
                                },
                                legend: {
                                    data:[name1,name2]
                                },
                                grid: {
                                    left: '3%',
                                    right: '4%',
                                    bottom: '3%',
                                    containLabel: true
                                },
                                xAxis: {
                                    type: 'value',
                                    boundaryGap: [0, 0.01]
                                },
                                yAxis: {
                                    type: 'category',
                                    data: ['从业人数','招聘状况']
                                },
                                series: [
                                    {
                                        type: 'bar',
                                        value : [Practitioner, Recruit],
                                        name : name1
                                    },
                                    {
                                        type: 'bar',
                                        value : [Practitioner2, Recruit2],
                                        name : name1                                    }
                                ]
                            };
                            myChart_staff_score.setOption(option_staff_score);
                        </script>
                        <dl class="toggle clearfix">
                            <dt><span></span>从业人数</dt>
                            <dd>

                                <div id="staff" style="width: 700px;height:300px;"></div>
                                <input type="hidden" value="<s:property value="companyInfo.getThirdScore().getPractitionerChange().get(0)" />" id="pyear13"/>
                                <input type="hidden" value="<s:property value="companyInfo.getThirdScore().getPractitionerChange().get(1)" />" id="pyear14"/>
                                <input type="hidden" value="<s:property value="companyInfo.getThirdScore().getPractitionerChange().get(2)" />" id="pyear15"/>
                                <input type="hidden" value="<s:property value="companyInfo.getThirdScore().getPractitionerChange().get(3)" />" id="pyear16"/>
                                <input type="hidden" value="<s:property value="companyInfo.getThirdScore().getPractitionerChange().get(4)" />" id="pyear17"/>
                                <script type="text/javascript">
                                    var myChart_staff = echarts.init(document.getElementById('staff'));
                                    var pyear13 = document.getElementById("pyear13").getAttribute("value");
                                    var pyear14 = document.getElementById("pyear14").getAttribute("value");
                                    var pyear15 = document.getElementById("pyear15").getAttribute("value");
                                    var pyear16 = document.getElementById("pyear16").getAttribute("value");
                                    var pyear17 = document.getElementById("pyear17").getAttribute("value");
                                    var option_staff = {
                                        title: {
                                            //text: '20013-2017年度从业人数变化'
                                        },
                                        tooltip : {
                                            trigger: 'axis'
                                        },
                                        legend: {
                                            data:['在职员工数（单位：人）']
                                        },
                                        toolbox: {
                                            feature: {
                                                saveAsImage: {}
                                            }
                                        },
                                        grid: {
                                            left: '3%',
                                            right: '4%',
                                            bottom: '3%',
                                            containLabel: true
                                        },
                                        xAxis : [
                                            {
                                                type : 'category',
                                                boundaryGap : false,
                                                data : ['2013','2014','2015','2016','2017']
                                            }
                                        ],
                                        yAxis : [
                                            {
                                                type : 'value'
                                            }
                                        ],
                                        series : [
                                            {
                                                name:'在职员工数（单位：人）',
                                                type:'line',
                                                stack: '总量',
                                                areaStyle: {normal: {}},
                                                data:[pyear13,pyear14,pyear15,pyear16,pyear17]
                                            }


                                        ]
                                    };
                                    myChart_staff.setOption(option_staff);
                                </script>

                            </dd><div id="staff_num"> </div>
                            <dt><span></span>招聘情况</dt>
                            <dd>

                                <table border="1">
                                    <tr>
                                        <th class="text-upper">职位类型</th>
                                        <th class="text-upper">职位名称</th>
                                        <th class="text-upper">职位薪水</th>
                                    </tr>
                                    <s:iterator value="#third.getRecruitInfo()" id="third21">
                                        <tr>
                                            <td><s:property value="#third21.getPostType()"/></td>
                                            <td><s:property value="#third21.getPostName()"/></td>
                                            <td><s:property value="#third21.getPostSalary()"/></td>
                                        </tr>
                                    </s:iterator>
                                </table>

                            </dd><div id="zp"></div>
                        </dl>
                    </div>

                    <%--负面纠纷--%>
                    <div id="bad" style="width: 100%; ">
                        <h3>负面纠纷</h3>
                        <div id="bad_score" style="width: 450px;height:300px;margin-left: 200px"></div>
                        <input type="hidden" value="<s:property value="#companyInfo1.getThirdScore().getCourt()" />" id="Court"/>
                        <input type="hidden" value="<s:property value="#companyInfo1.getThirdScore().getInvolved()" />" id="Involved"/>
                        <input type="hidden" value="<s:property value="#companyInfo1.getThirdScore().getSentence()" />" id="Sentence"/>
                        <input type="hidden" value="<s:property value="#companyInfo1.getThirdScore().getComplaint()" />" id="Complaint"/>
                        <input type="hidden" value="<s:property value="#companyInfo2.getThirdScore().getCourt()" />" id="Court2"/>
                        <input type="hidden" value="<s:property value="#companyInfo2.getThirdScore().getInvolved()" />" id="Involved2"/>
                        <input type="hidden" value="<s:property value="#companyInfo2.getThirdScore().getSentence()" />" id="Sentence2"/>
                        <input type="hidden" value="<s:property value="#companyInfo2.getThirdScore().getComplaint()" />" id="Complaint2"/>
                        <script type="text/javascript">
                            var myChart_bad_score = echarts.init(document.getElementById('bad_score'));
                            var Court = document.getElementById("Court").getAttribute("value");
                            var Involved = document.getElementById("Involved").getAttribute("value");
                            var Sentence = document.getElementById("Sentence").getAttribute("value");
                            var Complaint = document.getElementById("Complaint").getAttribute("value");
                            var Court2 = document.getElementById("Court2").getAttribute("value");
                            var Involved2 = document.getElementById("Involved2").getAttribute("value");
                            var Sentence2 = document.getElementById("Sentence2").getAttribute("value");
                            var Complaint2 = document.getElementById("Complaint2").getAttribute("value");
                            var option_bad_score = {
                                title: {
                                },
                                tooltip: {},
                                legend: {
                                    data:[name1,name2]
                                },
                                radar: {
                                    indicator: [
                                        { name: '顾客投诉', max: 10},
                                        { name: '涉案', max: 10},
                                        { name: '法院公告', max: 10},
                                        { name: '案件判决', max: 10},
                                    ]
                                },
                                series: [{
                                    name: '预算 vs 开销（Budget vs spending）',
                                    type: 'radar',
                                    data : [
                                        {
                                            value : [Court, Involved, Sentence, Complaint],
                                            name : name1
                                        },
                                        {
                                            value : [Court2, Involved2, Sentence2, Complaint2],
                                            name : name2
                                        }
                                    ]
                                }]
                            };
                            myChart_bad_score.setOption(option_bad_score);
                        </script>

                        <dl class="toggle clearfix">
                            <dt><span></span>顾客投诉</dt>
                            <dd style="width: 80%">
                                <s:iterator value="#third.getComplaintInfo()" id="third31">
                                    <s:property value="#third31"/>
                                </s:iterator>
                            </dd>
                            <div id="ts"></div>

                            <dt><span></span>涉案</dt>
                            <dd style="width: 80%">
                                <s:iterator value="#third.getInvolvedInfo()" id="third32">
                                    <s:property value="#third32"/>
                                </s:iterator>
                            </dd>
                            <div id="sa"></div>

                            <dt><span></span>法院公告</dt>
                            <dd>暂无此信息</dd>
                            <dt><span></span>案件判决</dt>
                            <dd>
                                暂无此信息
                            </dd>  <div id="pj"> </div>
                            <div id="fy"></div>
                        </dl>
                    </div>

                    <%--创新能力--%>
                    <div id="creation" style="width:100%">
                        <h3>创新能力</h3>
                        <div id="innovation_score" style="width: 450px;height:300px;margin-left: 200px"></div>
                        <input type="hidden" value="<s:property value="#companyInfo1.getThirdScore().getPatent()" />" id="Patent"/>
                        <input type="hidden" value="<s:property value="#companyInfo1.getThirdScore().getSoftware()" />" id="Software"/>
                        <input type="hidden" value="<s:property value="#companyInfo1.getThirdScore().getBook()" />" id="Book"/>
                        <input type="hidden" value="<s:property value="#companyInfo1.getThirdScore().getTrademark()" />" id="Trademark"/>
                        <input type="hidden" value="<s:property value="#companyInfo2.getThirdScore().getPatent()" />" id="Patent2"/>
                        <input type="hidden" value="<s:property value="#companyInfo2.getThirdScore().getSoftware()" />" id="Software2"/>
                        <input type="hidden" value="<s:property value="#companyInfo2.getThirdScore().getBook()" />" id="Book2"/>
                        <input type="hidden" value="<s:property value="#companyInfo2.getThirdScore().getTrademark()" />" id="Trademark2"/>
                        <script type="text/javascript">
                            var myChart_innovation_score = echarts.init(document.getElementById('innovation_score'));
                            var Patent = document.getElementById("Patent").getAttribute("value");
                            var Software = document.getElementById("Software").getAttribute("value");
                            var Book = document.getElementById("Book").getAttribute("value");
                            var Trademark = document.getElementById("Trademark").getAttribute("value");
                            var Patent2 = document.getElementById("Patent2").getAttribute("value");
                            var Software2 = document.getElementById("Software2").getAttribute("value");
                            var Book2 = document.getElementById("Book2").getAttribute("value");
                            var Trademark2 = document.getElementById("Trademark2").getAttribute("value");
                            var option_innovation_score = {
                                title: {
                                },
                                tooltip: {},
                                legend: {
                                    data:[name1,name2]
                                },
                                radar: {
                                    indicator: [
                                        { name: '作品著作', max: 10},
                                        { name: '软件著作', max: 10},
                                        { name: '专利', max: 10},
                                        { name: '商标', max: 10},
                                    ]
                                },
                                series: [{
                                    name: '预算 vs 开销（Budget vs spending）',
                                    type: 'radar',
                                    data : [
                                        {
                                            value : [Patent, Software, Book, Trademark],
                                            name : name1
                                        },
                                        {
                                            value : [Patent2, Software2, Book2, Trademark2],
                                            name : name2
                                        }
                                    ]
                                }]
                            };
                            myChart_innovation_score.setOption(option_innovation_score);
                        </script>
                        <dl class="toggle clearfix">
                            <dt><span></span>作品著作</dt>
                            <dd>
                                <table>
                                    <tr>
                                        <th>作品名称</th>
                                        <th>发表日期</th>
                                    </tr>
                                    <s:iterator value="#third.getBookInfo()" id="third41">
                                        <tr>
                                            <td><s:property value="#third41.getBookName()"/></td>
                                            <td><s:property value="#third41.getBookDate()"/></td>
                                        </tr>
                                    </s:iterator>
                                </table>
                            </dd><div id="zpzz"> </div>

                            <dt><span></span>软件著作</dt>
                            <dd>
                                <table>
                                    <tr>
                                        <th>软件名称</th>
                                        <th>软件类型</th>
                                        <th>行业类型</th>
                                        <th>注册日期</th>
                                    </tr>
                                    <s:iterator value="#third.getSoftwareInfo()" id="third42">
                                        <tr>
                                            <td><s:property value="#third42.getSoftwareName()"/></td>
                                            <td><s:property value="#third42.getSoftwareType()"/></td>
                                            <td><s:property value="#third42.getIndustryType()"/></td>
                                            <td><s:property value="#third42.getRegistration()"/></td>
                                        </tr>
                                    </s:iterator>
                                </table>
                            </dd><div id="rj"></div>
                            <dt><span></span>专利</dt>
                            <dd>

                                <table>
                                    <tr>
                                        <th>专利编号</th>
                                        <th>专利名称</th>
                                    </tr>
                                    <s:iterator value="#third.getPatentInfo()" id="third43">
                                        <tr>
                                            <td><s:property value="#third43.getPatentNo()"/></td>
                                            <td><s:property value="#third43.getPatentName()"/></td>
                                        </tr>
                                    </s:iterator>
                                </table>

                            </dd><div id="zl"></div>
                            <dt><span></span>商标</dt>
                            <dd>

                                <table>
                                    <tr>
                                        <th>商标名称</th>
                                        <th>注册日期</th>
                                    </tr>
                                    <s:iterator value="#third.getTrademarkInfo()" id="third44">
                                        <tr>
                                            <td><s:property value="#third44.getTrademarkName()"/></td>
                                            <td><s:property value="#third44.getTrademarkDate()"/></td>
                                        </tr>
                                    </s:iterator>
                                </table>

                            </dd><div id="sb"></div>
                        </dl>
                    </div>
                </article>
            </div>
            <!-- end of page content -->
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
<script type='text/javascript' src='js/jquery.easing.1.3.js'></script>
<script type='text/javascript' src='js/prettyphoto/jquery.prettyPhoto.js'></script>
<script type='text/javascript' src='js/jflickrfeed.js'></script>
<script type='text/javascript' src='js/jquery.liveSearch.js'></script>
<script type='text/javascript' src='js/jquery.form.js'></script>
<script type='text/javascript' src='js/jquery.validate.min.js'></script>
<script type='text/javascript' src='js/custom.js'></script>

<script defer src="js/jquery.flexslider.js"></script>
<script type="text/javascript" src="js/easing.js"></script>
<script type="text/javascript" src="js/move-top.js"></script>
<script type="text/javascript">
    jQuery(document).ready(function($) {
        $(".scroll").click(function(event){
            event.preventDefault();

            $('html,body').animate({scrollTop:$(this.hash).offset().top},1000);
        });
    });
</script>
<script type="text/javascript">
    $(document).ready(function() {
        $().UItoTop({ easingType: 'easeOutQuart' });
    });
</script>
<div style="display:none"><script src='http://v7.cnzz.com/stat.php?id=155540&web_id=155540' language='JavaScript' charset='gb2312'></script></div>
</body>
</html>
