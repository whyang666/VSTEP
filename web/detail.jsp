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

    <title>详情页</title>

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
            <li><a href="#relation_map" class="scroll"><i class="fa fa-home"></i>关系图 </a></li>
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

                    <div style="width:50%;height:180px;left: 0px;float: left">
                        <h1 class="post-title" style="margin-top: 50px">
                            <s:property value="#companyname"/>
                            <%--总分--%>
                        </h1>
                    </div>
                    <div id="total_score" style="width: 50%;height:180px;float: right"></div>
                    <input type="hidden" value="<s:property value="#companyInfo.getTotal()" />" id="total"/>
                    <script type="text/javascript">
                        // 基于准备好的dom，初始化echarts实例
                        var myChart_total_score = echarts.init(document.getElementById('total_score'));
                        // 指定图表的配置项和数据
                        var labelTop = {
                            normal : {
                                label : {
                                    show : true,
                                    position : 'center',
                                    formatter : '{b}',
                                    textStyle: {
                                        baseline : 'bottom',
                                        size: 80
                                    }
                                },
                                labelLine : {
                                    show : true
                                }
                            }
                        };
                        var labelFromatter = {
                            normal : {
                                label : {
                                    formatter : function (params){
                                        return 10 - params.value
                                    },
                                    textStyle: {
                                        baseline : 'top',
                                        color: '#23453c',
                                        size: 60,
                                        fontSize: 18
                                    }
                                }
                            },
                        }
                        var labelBottom = {
                            normal : {
                                color: '#ccc',
                                label : {
                                    show : true,
                                    position : 'center'
                                },
                                labelLine : {
                                    show : false
                                }
                            },
                            emphasis: {
                                color: 'rgba(0,0,0,0)'
                            }
                        };
                        var radius = [40, 60];
                        var test = document.getElementById("total").getAttribute("value");
                        var option_total_score = {
                            series : [
                                {
                                    type : 'pie',
                                    center : ['50%', '50%'],
                                    radius : radius,
                                    x: '0%', // for funnel
                                    itemStyle : labelFromatter,
                                    data : [
                                        {name:'other', value:10-test, itemStyle : labelBottom},
                                        {name:'总分', value:test,itemStyle : labelTop}
                                    ]
                                }
                            ]
                        };
                        // 使用刚指定的配置项和数据显示图表。
                        myChart_total_score.setOption(option_total_score);
                    </script>
                    <hr>
                    <%--基本信息--%>
                    <div id="basic_info" style="font-size: 17px; height: 150px;margin:0;width: 100%;clear:both;">
                        <div style="width: 50%;height:300px;float: left">
                            <h3>基本信息</h3>
                            <dl class="dl-horizontal" style="padding-top: 50px;border: 0px">
                                <%--<dt class="text-upper">所属总公司</dt>--%>
                                <%--<dd><s:property value="#companyInfo.getLegalperson()"/></dd>--%>
                                <dt class="text-upper">法人</dt>
                                <dd><s:property value="#companyInfo.getLegalperson()"/></dd>
                                <dt class="text-upper">成立时间</dt>
                                <dd><s:property value="#companyInfo.getDate()"/></dd>
                                <dt class="text-upper">行政区划</dt>
                                <dd><s:property value="#companyInfo.getAddnum()"/></dd>
                                <dt class="text-upper">经营范围</dt>
                                <dd>国内旅游、入境、招徕顾客</dd>
                                <dt class="text-upper">企业类型</dt>
                                <dd><s:property value="#companyInfo.getEnterprise_type()"/></dd>

                                <dt class="text-upper">企业状态</dt>
                                <dd><s:property value="#companyInfo.getState()"/></dd>
                            </dl>
                        </div>
                        <div  id="aggregate_score" style="height: 300px;width: 50%;float: right"></div>
                        <input type="hidden" value="<s:property value="#companyInfo.getSecondScore().getFSituation()" />" id="FSituation"/>
                        <input type="hidden" value="<s:property value="#companyInfo.getSecondScore().getInnovate()" />" id="Innovate"/>
                        <input type="hidden" value="<s:property value="#companyInfo.getSecondScore().getNegative()" />" id="Negative"/>
                        <input type="hidden" value="<s:property value="#companyInfo.getSecondScore().getPersonnel()" />" id="Personnel"/>
                        <script type="text/javascript">
                            var myChart_aggregate_score = echarts.init(document.getElementById('aggregate_score'));
                            var FSituation = document.getElementById("FSituation").getAttribute("value");
                            var Innovate = document.getElementById("Innovate").getAttribute("value");
                            var Negative = document.getElementById("Negative").getAttribute("value");
                            var Personnel = document.getElementById("Personnel").getAttribute("value");
                            var option_aggregate_score = {

                                title: {
                                    //text: '企业总分 : 7.6 '
                                },
                                tooltip: {},
                                legend: {
                                    //
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
                                            name : '企业总分'
                                        }
                                    ]
                                }]
                            };
                            myChart_aggregate_score.setOption(option_aggregate_score);

                        </script>
                    </div><!-- .row -->

                    <div id="compare" style="width: 100%;clear:both;">
                        <h3>相似公司</h3>
                        <s:iterator value="#rankinglist" id="companylist">
                            <li>
                                    <a href="compare.action?companyname1=<s:property value="#companyname"/>&companyname2=<s:property value="#companylist.companyName" />">
                                        <s:property value="#companylist.companyName" />
                                    </a>
                            </li>
                        </s:iterator>
                    </div>

                    <%--&lt;%&ndash;关系图&ndash;%&gt;--%>
                    <%--<div id="relation_map" style="width: 100%;height:450px;clear:both;">--%>
                        <%--<h3>关系图（含主要人员与分支机构）</h3>--%>
                        <%--<div id="relationship" style="width: 100%;height:450px;"></div>--%>
                        <%--<script type="text/javascript">--%>
                            <%--var myChart_relationship = echarts.init(document.getElementById('relationship'));--%>
                            <%--var option_relationship = {--%>

                                <%--title: {--%>
                                    <%--//text: '相关 总-分支 企业关系'--%>
                                <%--},--%>
                                <%--tooltip: {},--%>
                                <%--animationDurationUpdate: 1500,--%>
                                <%--animationEasingUpdate: 'quinticInOut',--%>
                                <%--series : [--%>
                                    <%--{--%>
                                        <%--type: 'graph',--%>
                                        <%--layout: 'none',--%>
                                        <%--symbolSize: 80,--%>
                                        <%--roam: true,--%>
                                        <%--label: {--%>
                                            <%--normal: {--%>
                                                <%--show: true--%>
                                            <%--}--%>
                                        <%--},--%>
                                        <%--edgeSymbol: ['circle', 'arrow'],--%>
                                        <%--edgeSymbolSize: [4, 10],--%>
                                        <%--edgeLabel: {--%>
                                            <%--normal: {--%>
                                                <%--textStyle: {--%>
                                                    <%--fontSize: 20--%>

                                                <%--}--%>
                                            <%--}--%>
                                        <%--},--%>
                                        <%--data: [{--%>
                                            <%--name: '北京(总)',--%>
                                            <%--x: 300,--%>
                                            <%--y: 300--%>
                                        <%--}, {--%>
                                            <%--name: '天津(分)',--%>
                                            <%--x: 800,--%>
                                            <%--y: 300--%>
                                        <%--}, {--%>
                                            <%--name: '辽宁(分)',--%>
                                            <%--x: 550,--%>
                                            <%--y: 100--%>
                                        <%--}, {--%>
                                            <%--name: '大连(分)',--%>
                                            <%--x: 550,--%>
                                            <%--y: 400--%>
                                        <%--}],--%>
                                        <%--// links: [],--%>
                                        <%--links: [--%>
                                            <%--{--%>
                                                <%--source: '辽宁(分)',--%>
                                                <%--target: '大连(分)'--%>
                                            <%--},--%>
                                            <%--{--%>
                                                <%--source: '北京(总)',--%>
                                                <%--target: '天津(分)'--%>
                                            <%--}, {--%>
                                                <%--source: '天津(分)',--%>
                                                <%--target: '辽宁(分)'--%>
                                            <%--}, {--%>
                                                <%--source: '北京(总)',--%>
                                                <%--target: '辽宁(分)'--%>
                                            <%--}, {--%>
                                                <%--source: '北京(总)',--%>
                                                <%--target: '大连(分)'--%>
                                            <%--}],--%>
                                        <%--lineStyle: {--%>
                                            <%--normal: {--%>
                                                <%--opacity: 0.9,--%>
                                                <%--width: 2,--%>
                                                <%--curveness: 0--%>
                                            <%--}--%>
                                        <%--}--%>
                                    <%--}--%>
                                <%--]--%>
                            <%--};--%>
                            <%--myChart_relationship.setOption(option_relationship);--%>
                        <%--</script>--%>
                    <%--</div>--%>

                    <%--财政状况--%>
                    <div id="finance" style="width: 100%;">
                        <h3>财政状况</h3>
                        <div id="finance_score" style="width: 450px;height:300px;margin-left: 200px"></div>
                        <input type="hidden" value="<s:property value="#companyInfo.getThirdScore().getFinance()" />" id="Finance1"/>
                        <input type="hidden" value="<s:property value="#companyInfo.getThirdScore().getWebsite()" />" id="Website"/>
                        <input type="hidden" value="<s:property value="#companyInfo.getThirdScore().getBranch()" />" id="Branch1"/>
                        <input type="hidden" value="<s:property value="#companyInfo.getThirdScore().getCancellation()" />" id="Cancellation"/>
                        <input type="hidden" value="<s:property value="#companyInfo.getThirdScore().getRevoke()" />" id="Revoke"/>
                        <script type="text/javascript">
                            var myChart_finance_score = echarts.init(document.getElementById('finance_score'));
                            var Finance = document.getElementById("Finance1").getAttribute("value");
                            var Website = document.getElementById("Website").getAttribute("value");
                            var Branch = document.getElementById("Branch1").getAttribute("value");
                            var Cancellation = document.getElementById("Cancellation").getAttribute("value");
                            var Revoke = document.getElementById("Revoke").getAttribute("value");
                            var option_finance_score = {
                                tooltip:{
                                    trigger:'item',
                                    formatter:"{a}<br/>{b} : {c} ({d}%)"
                                },
                                series : [
                                    {
                                        //name:'访问来源',
                                        type:'pie',
                                        radius : '55%',
                                        center: ['50%', '50%'],
                                        data:[
                                            {value:Finance, name:'财务收益'},
                                            {value:Branch, name:'分支机构'},
                                            {value:Revoke, name:'吊销'},
                                            {value:Cancellation, name:'注销'},
                                            {value:Website, name:'网站建设'}
                                        ].sort(function (a, b) { return a.value - b.value}),
                                        roseType: 'angle',
                                        label: {
                                            normal: {
                                                textStyle: {
                                                    color: '#242424'
                                                }
                                            }
                                        },
                                        labelLine: {
                                            normal: {
                                                lineStyle: {
                                                    color: '#242424'
                                                },
                                                smooth: 0.2,
                                                length: 10,
                                                length2: 20
                                            }
                                        },
                                        itemStyle: {
                                            normal: {
                                                color: '#c23531',
                                                shadowBlur: 200,
                                                shadowColor: 'rgba(0, 0, 0, 0.5)'
                                            }
                                        },

                                        animationType: 'scale',
                                        animationEasing: 'elasticOut',
                                        animationDelay: function (idx) {
                                            return Math.random() * 200;
                                        }
                                    }
                                ]
                            };
                            myChart_finance_score.setOption(option_finance_score);

                        </script>

                    </div>

                    <dl class="toggle clearfix">
                        <dt><span></span>财务</dt>
                        <dd>
                            <h4>近年来上证指数</h4>
                            <div id="stock" style="width: 850px;height:450px;"></div>
                            <script type="text/javascript">
                                var myChart_stock = echarts.init(document.getElementById('stock'));
                                var option_stock = {
                                    title : {
                                        //text: '2013年上半年上证指数'
                                    },
                                    tooltip : {
                                        trigger: 'axis',
                                        formatter: function (params) {
                                            var res = params[0].seriesName + ' ' + params[0].name;
                                            res += '<br/>  开盘 : ' + params[0].value[0] + '  最高 : ' + params[0].value[3];
                                            res += '<br/>  收盘 : ' + params[0].value[1] + '  最低 : ' + params[0].value[2];
                                            return res;
                                        }
                                    },
                                    legend: {
                                        data:['上证指数']
                                    },
                                    toolbox: {
                                        show : true,
                                        feature : {
                                            mark : {show: true},
                                            dataZoom : {show: true},
                                            dataView : {show: true, readOnly: false},
                                            magicType: {show: true, type: ['line', 'bar']},
                                            restore : {show: true},
                                            saveAsImage : {show: true}
                                        }
                                    },
                                    dataZoom : {
                                        show : true,
                                        realtime: true,
                                        start : 50,
                                        end : 100
                                    },
                                    xAxis : [
                                        {
                                            type : 'category',
                                            boundaryGap : true,
                                            axisTick: {onGap:false},
                                            splitLine: {show:false},
                                            data : [
                                                "2013/1/24", "2013/1/25", "2013/1/28", "2013/1/29", "2013/1/30",
                                                "2013/1/31", "2013/2/1", "2013/2/4", "2013/2/5", "2013/2/6",
                                                "2013/2/7", "2013/2/8", "2013/2/18", "2013/2/19", "2013/2/20",
                                                "2013/2/21", "2013/2/22", "2013/2/25", "2013/2/26", "2013/2/27",
                                                "2013/2/28", "2013/3/1", "2013/3/4", "2013/3/5", "2013/3/6",
                                                "2013/3/7", "2013/3/8", "2013/3/11", "2013/3/12", "2013/3/13",
                                                "2013/3/14", "2013/3/15", "2013/3/18", "2013/3/19", "2013/3/20",
                                                "2013/3/21", "2013/3/22", "2013/3/25", "2013/3/26", "2013/3/27",
                                                "2013/3/28", "2013/3/29", "2013/4/1", "2013/4/2", "2013/4/3",
                                                "2013/4/8", "2013/4/9", "2013/4/10", "2013/4/11", "2013/4/12",
                                                "2013/4/15", "2013/4/16", "2013/4/17", "2013/4/18", "2013/4/19",
                                                "2013/4/22", "2013/4/23", "2013/4/24", "2013/4/25", "2013/4/26",
                                                "2013/5/2", "2013/5/3", "2013/5/6", "2013/5/7", "2013/5/8",
                                                "2013/5/9", "2013/5/10", "2013/5/13", "2013/5/14", "2013/5/15",
                                                "2013/5/16", "2013/5/17", "2013/5/20", "2013/5/21", "2013/5/22",
                                                "2013/5/23", "2013/5/24", "2013/5/27", "2013/5/28", "2013/5/29",
                                                "2013/5/30", "2013/5/31", "2013/6/3", "2013/6/4", "2013/6/5",
                                                "2013/6/6", "2013/6/7", "2013/6/13"
                                            ]
                                        }
                                    ],
                                    yAxis : [
                                        {
                                            type : 'value',
                                            scale:true,
                                            boundaryGap: [0.01, 0.01]
                                        }
                                    ],
                                    series : [
                                        {
                                            name:'上证指数',
                                            type:'k',
                                            data:[ // 开盘，收盘，最低，最高
                                                [2320.26,2302.6,2287.3,2362.94],
                                                [2300,2291.3,2288.26,2308.38],
                                                [2295.35,2346.5,2295.35,2346.92],
                                                [2347.22,2358.98,2337.35,2363.8],
                                                [2360.75,2382.48,2347.89,2383.76],
                                                [2383.43,2385.42,2371.23,2391.82],
                                                [2377.41,2419.02,2369.57,2421.15],
                                                [2425.92,2428.15,2417.58,2440.38],
                                                [2411,2433.13,2403.3,2437.42],
                                                [2432.68,2434.48,2427.7,2441.73],
                                                [2430.69,2418.53,2394.22,2433.89],
                                                [2416.62,2432.4,2414.4,2443.03],
                                                [2441.91,2421.56,2415.43,2444.8],
                                                [2420.26,2382.91,2373.53,2427.07],
                                                [2383.49,2397.18,2370.61,2397.94],
                                                [2378.82,2325.95,2309.17,2378.82],
                                                [2322.94,2314.16,2308.76,2330.88],
                                                [2320.62,2325.82,2315.01,2338.78],
                                                [2313.74,2293.34,2289.89,2340.71],
                                                [2297.77,2313.22,2292.03,2324.63],
                                                [2322.32,2365.59,2308.92,2366.16],
                                                [2364.54,2359.51,2330.86,2369.65],
                                                [2332.08,2273.4,2259.25,2333.54],
                                                [2274.81,2326.31,2270.1,2328.14],
                                                [2333.61,2347.18,2321.6,2351.44],
                                                [2340.44,2324.29,2304.27,2352.02],
                                                [2326.42,2318.61,2314.59,2333.67],
                                                [2314.68,2310.59,2296.58,2320.96],
                                                [2309.16,2286.6,2264.83,2333.29],
                                                [2282.17,2263.97,2253.25,2286.33],
                                                [2255.77,2270.28,2253.31,2276.22],
                                                [2269.31,2278.4,2250,2312.08],
                                                [2267.29,2240.02,2239.21,2276.05],
                                                [2244.26,2257.43,2232.02,2261.31],
                                                [2257.74,2317.37,2257.42,2317.86],
                                                [2318.21,2324.24,2311.6,2330.81],
                                                [2321.4,2328.28,2314.97,2332],
                                                [2334.74,2326.72,2319.91,2344.89],
                                                [2318.58,2297.67,2281.12,2319.99],
                                                [2299.38,2301.26,2289,2323.48],
                                                [2273.55,2236.3,2232.91,2273.55],
                                                [2238.49,2236.62,2228.81,2246.87],
                                                [2229.46,2234.4,2227.31,2243.95],
                                                [2234.9,2227.74,2220.44,2253.42],
                                                [2232.69,2225.29,2217.25,2241.34],
                                                [2196.24,2211.59,2180.67,2212.59],
                                                [2215.47,2225.77,2215.47,2234.73],
                                                [2224.93,2226.13,2212.56,2233.04],
                                                [2236.98,2219.55,2217.26,2242.48],
                                                [2218.09,2206.78,2204.44,2226.26],
                                                [2199.91,2181.94,2177.39,2204.99],
                                                [2169.63,2194.85,2165.78,2196.43],
                                                [2195.03,2193.8,2178.47,2197.51],
                                                [2181.82,2197.6,2175.44,2206.03],
                                                [2201.12,2244.64,2200.58,2250.11],
                                                [2236.4,2242.17,2232.26,2245.12],
                                                [2242.62,2184.54,2182.81,2242.62],
                                                [2187.35,2218.32,2184.11,2226.12],
                                                [2213.19,2199.31,2191.85,2224.63],
                                                [2203.89,2177.91,2173.86,2210.58],
                                                [2170.78,2174.12,2161.14,2179.65],
                                                [2179.05,2205.5,2179.05,2222.81],
                                                [2212.5,2231.17,2212.5,2236.07],
                                                [2227.86,2235.57,2219.44,2240.26],
                                                [2242.39,2246.3,2235.42,2255.21],
                                                [2246.96,2232.97,2221.38,2247.86],
                                                [2228.82,2246.83,2225.81,2247.67],
                                                [2247.68,2241.92,2231.36,2250.85],
                                                [2238.9,2217.01,2205.87,2239.93],
                                                [2217.09,2224.8,2213.58,2225.19],
                                                [2221.34,2251.81,2210.77,2252.87],
                                                [2249.81,2282.87,2248.41,2288.09],
                                                [2286.33,2299.99,2281.9,2309.39],
                                                [2297.11,2305.11,2290.12,2305.3],
                                                [2303.75,2302.4,2292.43,2314.18],
                                                [2293.81,2275.67,2274.1,2304.95],
                                                [2281.45,2288.53,2270.25,2292.59],
                                                [2286.66,2293.08,2283.94,2301.7],
                                                [2293.4,2321.32,2281.47,2322.1],
                                                [2323.54,2324.02,2321.17,2334.33],
                                                [2316.25,2317.75,2310.49,2325.72],
                                                [2320.74,2300.59,2299.37,2325.53],
                                                [2300.21,2299.25,2294.11,2313.43],
                                                [2297.1,2272.42,2264.76,2297.1],
                                                [2270.71,2270.93,2260.87,2276.86],
                                                [2264.43,2242.11,2240.07,2266.69],
                                                [2242.26,2210.9,2205.07,2250.63],
                                                [2190.1,2148.35,2126.22,2190.1]
                                            ]
                                        }
                                    ]
                                };
                                myChart_stock.setOption(option_stock);
                            </script>
                            <h4>2009-2016年营业额</h4>
                            <div id="income" style="width: 700px;height:300px;margin-left: 35px"></div>
                            <input type="hidden" value="<s:property value="#companyInfo.getThirdScore().getFinanceChange().get(0)" />" id="fyear13"/>
                            <input type="hidden" value="<s:property value="#companyInfo.getThirdScore().getFinanceChange().get(1)" />" id="fyear14"/>
                            <input type="hidden" value="<s:property value="#companyInfo.getThirdScore().getFinanceChange().get(2)" />" id="fyear15"/>
                            <input type="hidden" value="<s:property value="#companyInfo.getThirdScore().getFinanceChange().get(3)" />" id="fyear16"/>
                            <input type="hidden" value="<s:property value="#companyInfo.getThirdScore().getFinanceChange().get(4)" />" id="fyear17"/>
                            <script type="text/javascript">
                                var myChart_income = echarts.init(document.getElementById('income'));
                                var fyear13 = document.getElementById("fyear13").getAttribute("value");
                                var fyear14 = document.getElementById("fyear14").getAttribute("value");
                                var fyear15 = document.getElementById("fyear15").getAttribute("value");
                                var fyear16 = document.getElementById("fyear16").getAttribute("value");
                                var fyear17 = document.getElementById("fyear17").getAttribute("value");
                                var option_income = {
                                    title: {
                                        //text: '2009-2016年度营业额变化'
                                    },
                                    tooltip : {
                                        trigger: 'axis'
                                    },
                                    legend: {
                                        data:['营业额（单位：万元）']
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
                                            name:'营业额（单位：万元）',
                                            type:'line',
                                            stack: '总量',
                                            areaStyle: {normal: {}},
                                            data:[fyear13,fyear14,fyear15,fyear16,fyear17]
                                        }


                                    ]
                                };
                                myChart_income.setOption(option_income);
                            </script>
                        </dd> <div id="fincome"></div>
                        <dt><span></span>分支机构</dt>
                        <dd style="width: 90%">
                                <s:iterator value="#third.getBranchName()" id="third11">
                                    <p><s:property value="#third11"/></p>
                                </s:iterator>
                        </dd>
                        <div id="branch"></div>
                        <dt><span></span>分支机构吊销</dt>
                        <dd style="width: 90%">
                                <s:iterator value="#third.getRevokeName()" id="third12">
                                    <p><s:property value="#third12"/></p>
                                </s:iterator>
                        </dd><div id="branch_dx"></div>

                        <dt><span></span>分支机构注销</dt>
                        <dd style="width: 90%">
                                <s:iterator value="#third.getCancellationName()" id="third13">
                                    <p><s:property value="#third13"/></p>
                                </s:iterator>
                        </dd> <div id="branch_zx"></div>
                        <dt><span></span>网站网店</dt>
                        <dd style="width: 90%">
                                <s:iterator value="#third.getWebsiteInfo()" id="third14">
                                    <p><s:property value="#third14.getWebsiteName()"/> <s:property value="#third14.getWebsitrAddress()"/></p>
                                </s:iterator>
                        </dd>  <div id="web"></div>
                    </dl>
                    <%--人员流动--%>
                    <div id="staffs" style="width: 100%;">
                        <h3>人员流动</h3>
                        <div id="staff_score" style="width: 450px;height:300px;margin-left: 200px"></div>
                        <input type="hidden" value="<s:property value="#companyInfo.getThirdScore().getPractitioner()" />" id="Practitioner"/>
                        <input type="hidden" value="<s:property value="#companyInfo.getThirdScore().getRecruit()" />" id="Recruit"/>
                        <script type="text/javascript">
                            var myChart_staff_score = echarts.init(document.getElementById('staff_score'));
                            var Practitioner = document.getElementById("Practitioner").getAttribute("value");
                            var Recruit = document.getElementById("Recruit").getAttribute("value");
                            var option_staff_score = {
                                tooltip:{
                                    trigger:'item',
                                    formatter:"{a}<br/>{b} : {c} ({d}%)"
                                },

                                series : [
                                    {
                                        //name:'访问来源',
                                        type:'pie',
                                        radius : '55%',
                                        center: ['50%', '50%'],
                                        data:[
                                            {value:Practitioner, name:'从业人数'},
                                            {value:Recruit, name:'招聘规模'},
                                        ].sort(function (a, b) { return a.value - b.value}),
                                        roseType: 'angle',
                                        label: {
                                            normal: {
                                                textStyle: {
                                                    color: '#242424'
                                                }
                                            }
                                        },
                                        labelLine: {
                                            normal: {
                                                lineStyle: {
                                                    color: '#242424'
                                                },
                                                smooth: 0.2,
                                                length: 10,
                                                length2: 20
                                            }
                                        },
                                        itemStyle: {
                                            normal: {
                                                color: '#c23531',
                                                shadowBlur: 200,
                                                shadowColor: 'rgba(0, 0, 0, 0.5)'
                                            }
                                        },

                                        animationType: 'scale',
                                        animationEasing: 'elasticOut',
                                        animationDelay: function (idx) {
                                            return Math.random() * 200;
                                        }
                                    }
                                ]
                            };
                            myChart_staff_score.setOption(option_staff_score);
                        </script>
                        <dl class="toggle clearfix">
                            <dt><span></span>从业人数</dt>
                            <dd style="width: 90%">

                                    <div id="staff" style="width: 700px;height:300px;"></div>
                                <input type="hidden" value="<s:property value="#companyInfo.getThirdScore().getPractitionerChange().get(0)" />" id="pyear13"/>
                                <input type="hidden" value="<s:property value="#companyInfo.getThirdScore().getPractitionerChange().get(1)" />" id="pyear14"/>
                                <input type="hidden" value="<s:property value="#companyInfo.getThirdScore().getPractitionerChange().get(2)" />" id="pyear15"/>
                                <input type="hidden" value="<s:property value="#companyInfo.getThirdScore().getPractitionerChange().get(3)" />" id="pyear16"/>
                                <input type="hidden" value="<s:property value="#companyInfo.getThirdScore().getPractitionerChange().get(4)" />" id="pyear17"/>
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
                            <dd style="width: 90%">

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
                        <input type="hidden" value="<s:property value="#companyInfo.getThirdScore().getCourt()" />" id="Court"/>
                        <input type="hidden" value="<s:property value="#companyInfo.getThirdScore().getInvolved()" />" id="Involved"/>
                        <input type="hidden" value="<s:property value="#companyInfo.getThirdScore().getSentence()" />" id="Sentence"/>
                        <input type="hidden" value="<s:property value="#companyInfo.getThirdScore().getComplaint()" />" id="Complaint"/>
                        <script type="text/javascript">
                            var myChart_bad_score = echarts.init(document.getElementById('bad_score'));
                            var Court = document.getElementById("Court").getAttribute("value");
                            var Involved = document.getElementById("Involved").getAttribute("value");
                            var Sentence = document.getElementById("Sentence").getAttribute("value");
                            var Complaint = document.getElementById("Complaint").getAttribute("value");
                            var option_bad_score = {
                                tooltip:{
                                    trigger:'item',
                                    formatter:"{a}<br/>{b} : {c} ({d}%)"
                                },

                                series : [
                                    {
                                        //name:'访问来源',
                                        type:'pie',
                                        radius : '55%',
                                        center: ['50%', '50%'],
                                        data:[
                                            {value:Complaint, name:'消费者投诉'},
                                            {value:Involved, name:'涉及重案'},
                                            {value:Court, name:'法院公告'},
                                            {value:Sentence, name:'不诚信判决'}
                                        ].sort(function (a, b) { return a.value - b.value}),
                                        roseType: 'angle',
                                        label: {
                                            normal: {
                                                textStyle: {
                                                    color: '#242424'
                                                }
                                            }
                                        },
                                        labelLine: {
                                            normal: {
                                                lineStyle: {
                                                    color: '#242424'
                                                },
                                                smooth: 0.2,
                                                length: 10,
                                                length2: 20
                                            }
                                        },
                                        itemStyle: {
                                            normal: {
                                                color: '#c23531',
                                                shadowBlur: 200,
                                                shadowColor: 'rgba(0, 0, 0, 0.5)'
                                            }
                                        },

                                        animationType: 'scale',
                                        animationEasing: 'elasticOut',
                                        animationDelay: function (idx) {
                                            return Math.random() * 200;
                                        }
                                    }
                                ]
                            };
                            myChart_bad_score.setOption(option_bad_score);
                        </script>

                        <dl class="toggle clearfix">
                            <dt><span></span>顾客投诉</dt>
                                <dd style="width: 90%">
                                        <s:iterator value="#third.getComplaintInfo()" id="third31">
                                            <s:property value="#third31"/>
                                        </s:iterator>
                                </dd>
                            <div id="ts"></div>

                            <dt><span></span>涉案</dt>
                            <dd style="width: 90%">
                                    <s:iterator value="#third.getInvolvedInfo()" id="third32">
                                        <s:property value="#third32"/>
                                    </s:iterator>
                            </dd>
                            <div id="sa"></div>

                            <dt><span></span>法院公告</dt>
                            <dd style="width: 90%">暂无此信息</dd>
                            <dt><span></span>案件判决</dt>
                            <dd style="width: 90%">
                                    暂无此信息
                            </dd>  <div id="pj"> </div>
                            <div id="fy"></div>
                        </dl>
                    </div>

                    <%--创新能力--%>
                    <div id="creation" style="width:100%">
                        <h3>创新能力</h3>
                        <div id="innovation_score" style="width: 450px;height:300px;margin-left: 200px"></div>
                        <input type="hidden" value="<s:property value="#companyInfo.getThirdScore().getPatent()" />" id="Patent"/>
                        <input type="hidden" value="<s:property value="#companyInfo.getThirdScore().getSoftware()" />" id="Software"/>
                        <input type="hidden" value="<s:property value="#companyInfo.getThirdScore().getBook()" />" id="Book"/>
                        <input type="hidden" value="<s:property value="#companyInfo.getThirdScore().getTrademark()" />" id="Trademark"/>
                        <script type="text/javascript">
                            var myChart_innovation_score = echarts.init(document.getElementById('innovation_score'));
                            var Patent = document.getElementById("Patent").getAttribute("value");
                            var Software = document.getElementById("Software").getAttribute("value");
                            var Book = document.getElementById("Book").getAttribute("value");
                            var Trademark = document.getElementById("Trademark").getAttribute("value");
                            var option_innovation_score = {
                                tooltip:{
                                    trigger:'item',
                                    formatter:"{a}<br/>{b} : {c} ({d}%)"
                                },

                                series : [
                                    {
                                        //name:'访问来源',
                                        type:'pie',
                                        radius : '55%',
                                        center: ['50%', '50%'],
                                        data:[
                                            {value:Book, name:'著作发表'},
                                            {value:Software, name:'软件产品'},
                                            {value:Patent, name:'申请专利'},
                                            {value:Trademark, name:'商标'}
                                        ].sort(function (a, b) { return a.value - b.value}),
                                        roseType: 'angle',
                                        label: {
                                            normal: {
                                                textStyle: {
                                                    color: '#242424'
                                                }
                                            }
                                        },
                                        labelLine: {
                                            normal: {
                                                lineStyle: {
                                                    color: '#242424'
                                                },
                                                smooth: 0.2,
                                                length: 10,
                                                length2: 20
                                            }
                                        },
                                        itemStyle: {
                                            normal: {
                                                color: '#c23531',
                                                shadowBlur: 200,
                                                shadowColor: 'rgba(0, 0, 0, 0.5)'
                                            }
                                        },

                                        animationType: 'scale',
                                        animationEasing: 'elasticOut',
                                        animationDelay: function (idx) {
                                            return Math.random() * 200;
                                        }
                                    }
                                ]
                            };
                            myChart_innovation_score.setOption(option_innovation_score);
                        </script>
                        <dl class="toggle clearfix">
                            <dt><span></span>作品著作</dt>
                            <dd style="width: 90%">
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
                            <dd style="width: 90%">
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
                            <dd style="width: 90%">

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
                            <dd style="width: 90%">
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
