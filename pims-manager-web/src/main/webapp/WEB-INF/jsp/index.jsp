<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
"http://www.w3.org/TR/html4/loose.dtd">
<html lang="zh-CN">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
<title>PIMS首页</title>
<link rel="icon" href="/images/short_logo.ico" type="image/x-icon" />
<link rel="shortcut icon" href="/images/short_logo.ico" type="image/x-icon" />
<link rel="bookmark" href="/images/short_logo.ico" type="image/x-icon" />

<link rel="stylesheet" type="text/css" href="/css/bootstrap.css"/>
<link rel="stylesheet" type="text/css" href="/css/myLogin.css"/>

<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
      <script src="https://cdn.bootcss.com/html5shiv/3.7.3/html5shiv.min.js"></script>
      <script src="https://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
    
    
<style type="text/css">
body{
   padding-top:50px;
   font-size:19px;	
}
.carousel {

	height: 550px;
	background-color:#CCC;

}

.carousel .item {

	height: 550px;

}

.carousel .item img {
      
	min-height: 550px;
	width:100%;

}

.bc-social {
    padding: 15px 0;
    text-align: center;
    background-color: #f5f5f5;
    border-top: 1px solid #fff;
    border-bottom: 1px solid #ddd;
}
.footer {
    color: #777;
    padding: 30px 0;
    border-top: 1px solid #e5e5e5;
    
}
@media (max-width: 768px) {
body{
   font-size:14px;	
}

.bc-social {
	
	padding: 5px 5px;
	height:25px;
}
.carousel {

		height: 300px;

	}

.carousel .item {

		height: 300px;

	}

.carousel .item img {

		min-height: 300px;

	}

}
    
    </style>
</head>
<body>
<nav class="navbar navbar-inverse navbar-fixed-top">
      <div class="container">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
           <button type="button" class="btn btn-primary navbar-toggle" data-toggle="modal" data-target="#login_modal" style="background-color:#0000CC;">
                   登&nbsp;录
          </button>
          <a class="navbar-brand" href="#">PIMS</a>
          
        </div>
        <div id="navbar" class="navbar-collapse collapse" aria-expanded="false" style="height: 1px;" aria-controls="navbar">
          <ul class="nav navbar-nav">
            <li class="active"><a href="#news_index">新闻</a></li>
            <li><a href="#interesting_index">趣事</a></li>
            <li><a href="#information">信息</a></li>
            <li class="dropdown">
              <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">其他<span class="caret"></span></a>
              <ul class="dropdown-menu">
                <li><a href="#about_index">关于</a></li>
                <li><a href="#recruit_index">英才</a></li>
                <li><a href="#contact_index">联系我们</a></li>
                <li role="separator" class="divider"></li>
                <li class="dropdown-header"><small>新产品</small></li>
                <li><a href="#">发展</a></li>
                <li><a href="#">设置</a></li>
              </ul>
            </li>
          </ul>
          <!--导航右边-->
          <ul class="nav navbar-nav navbar-right">
           <li>
          <button type="button" id="login_index" class="nav navbar-btn btn btn-default btn-primary" data-toggle="modal" data-target="#login_modal" style="margin-right:10px">&nbsp;&nbsp;&nbsp;&nbsp;登&nbsp;录</button> 
          </li>
          <li>
          <button type="button" id="register_index" class="nav navbar-btn navbar-right btn btn-primary" data-toggle="modal" data-target="#userProtocol_modal">&nbsp;&nbsp;&nbsp;&nbsp;注&nbsp;册</button>
          </li>
          </ul>
          
        </div><!--/.nav-collapse -->
      </div>
    </nav>
<!--首页的图片轮播图-->
<div id="carousel_index_01" class="carousel  slide" data-ride="carousel">
  <ol class="carousel-indicators">
    <li data-target="#carousel_index_01" data-slide-to="0" class="active"></li>
    <li data-target="#carousel_index_01" data-slide-to="1"></li>
    <li data-target="#carousel_index_01" data-slide-to="2"></li>
</ol>
  <div class="carousel-inner" role="listbox">
   <div class="item active">
    <img src="../images/aa.jpg" alt="初日朝阳">
       <div class="carousel-caption">
      
    
       </div>
    </div>
    <div class="item">
    <img src="../images/bb.jpg" alt="知道你">  
       <div class="carousel-caption">
      
    
       </div>
    </div>
     <div class="item">
    <img src="../images/index2.jpg" alt="">
        <div class="carousel-caption">
          
        
        </div>
   </div>
   
  </div>
  <a class="left carousel-control" href="#carousel_index_01" role="button" data-slide="prev">
    <span class="glyphicon glyphicon-chevron-left"></span>
    <span class="sr-only">Previous</span>
    </a>
   <a class="right carousel-control" href="#carousel_index_01" role="button" data-slide="next">                             
    <span class="glyphicon glyphicon-chevron-right"></span>
    <span class="sr-only">Next</span>
    </a>
  
</div><!--  轮播图结束 -->

<!-- 第一页的下部内容 -->

<div class="bc-social"> 
    <div class="container">
      <ul class="list-unstyled list-inline">
        <li>
           <span class="glyphicon glyphicon-signal"></span>
           <a href="#" title="data center" style="color:#000;">信息中心</a>
        </li>
        <li role="separator" class="divider">&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;</li>
        <li>
          <span class="glyphicon glyphicon-off"></span>
          <a href="#" title="future center" style="color:#000;">未来中心</a>
        </li>
      </ul>
    </div>
  </div><!-- 展示页的下部结束 -->
  
  <!--信息内容 下面的 面板集合-->
  
  
  
  <div class="container">
      <div class="row">
         <div class="col-sm-6 col-md-4 col-lg-3 ">
             <div class="panel panel-default">
                <div class="panel-heading">
                     <a href="#" >dianwo</a>
                 </div>
                 <div class="panel-body">
                     <h3>huayinei</h3>
                 </div>
             
             </div>
           </div>
           <div class="col-sm-6 col-md-4 col-lg-3 ">
             <div class="panel panel-default">
                <div class="panel-heading">
                     <a href="#" >dianwo</a>
                 </div>
                 <div class="panel-body">
                     <h3>huayinei</h3>
                 </div>
             
             </div>
           </div>
           <div class="col-sm-6 col-md-4 col-lg-3 ">
             <div class="panel panel-default">
                <div class="panel-heading">
                     <a href="#" >dianwo</a>
                 </div>
                 <div class="panel-body">
                     <h3>huayinei</h3>
                 </div>
             
             </div>
           </div>
            <div class="col-sm-6 col-md-4 col-lg-3 ">
             <div class="panel panel-default">
                <div class="panel-heading">
                     <a href="#" >dianwo</a>
                 </div>
                 <div class="panel-body">
                     <h3>huayinei</h3>
                 </div>
             
             </div>
           </div>
           
      </div>
  </div>
  
  <div class="container">
  

    <div class="row">

      <div class="col-sm-6 col-md-4 col-lg-3 ">
        <div class="thumbnail" style="height: 360px;">
          <a href="http://codeguide.bootcss.com" title="Bootstrap 编码规范" target="_blank" onclick="_hmt.push(['_trackEvent', 'tile', 'click', 'codeguide'])">
            <img class="" src="https://static.bootcss.com/www/assets/img/codeguide.png?1505127079951" width="300" height="150" data-src="https://static.bootcss.com/www/assets/img/codeguide.png?1505127079951" alt="Bootstrap 编码规范">
          </a>
          <div class="caption">
            <h3>
                <a href="http://codeguide.bootcss.com" title="Bootstrap 编码规范" target="_blank" onclick="_hmt.push(['_trackEvent', 'tile', 'click', 'codeguide'])">Bootstrap 编码规范<br><small>by @mdo</small></a>
            </h3>
            <p>Bootstrap 编码规范：编写灵活、稳定、高质量的 HTML 和 CSS 代码的规范。</p>
          </div>
        </div>
      </div>
      
      <div class="col-sm-6 col-md-4 col-lg-3 ">
        <div class="thumbnail" style="height: 360px;">
          <a href="https://yarn.bootcss.com/" title="Yarn 中文文档" target="_blank" onclick="_hmt.push(['_trackEvent', 'tile', 'click', 'Yarn'])">
            <img class="lazy" src="https://static.bootcss.com/www/assets/img/yarn.png?1505127079951" width="300" height="150" data-src="https://static.bootcss.com/www/assets/img/yarn.png?1505127079951" alt="Yarn 中文文档">
          </a>
          <div class="caption">
            <h3>
                <a href="https://yarn.bootcss.com/" title="Yarn 中文文档" target="_blank" onclick="_hmt.push(['_trackEvent', 'tile', 'click', 'Yarn'])">Yarn <br><small>中文手册</small></a>
            </h3>
            <p>Yarn 是一个快速、可靠、安全的依赖管理工具。是 NPM 的替代品。</p>
          </div>
        </div>
      </div>
      <div class="col-sm-6 col-md-4 col-lg-3 ">
        <div class="thumbnail" style="height: 360px;">
          <a href="https://react.bootcss.com/" title="React - 用于构建用户界面的 JavaScript 框架" target="_blank" onclick="_hmt.push(['_trackEvent', 'tile', 'click', 'react'])">
            <img class="lazy" src="https://static.bootcss.com/www/assets/img/react.png?1505127079951" width="300" height="150" data-src="https://static.bootcss.com/www/assets/img/react.png?1505127079951" alt="React - 用于构建用户界面的 JavaScript 框架">
          </a>
          <div class="caption">
            <h3>
                <a href="https://react.bootcss.com/" title="React - 用于构建用户界面的 JavaScript 框架" target="_blank" onclick="_hmt.push(['_trackEvent', 'tile', 'click', 'react'])">React<br><small>用于构建用户界面的 JavaScript 框架</small></a>
            </h3>
            <p>React 起源于 Facebook 的内部项目，是一个用于构建用户界面的 JavaScript 库。</p>
          </div>
        </div>
      </div>
      <div class="col-sm-6 col-md-4 col-lg-3 ">
        <div class="thumbnail" style="height: 360px;">
          <a href="https://webpack.bootcss.com/" title="Webpack 是前端资源模块化管理和打包工具" target="_blank" onclick="_hmt.push(['_trackEvent', 'tile', 'click', 'webpack'])">
            <img class="lazy" src="https://static.bootcss.com/www/assets/img/webpack.png?1505127079951" width="300" height="150" data-src="https://static.bootcss.com/www/assets/img/webpack.png?1505127079951" alt="Webpack 是前端资源模块化管理和打包工具">
          </a>
          <div class="caption">
            <h3>
                <a href="https://webpack.bootcss.com/" title="Webpack 是前端资源模块化管理和打包工具" target="_blank" onclick="_hmt.push(['_trackEvent', 'tile', 'click', 'webpack'])">Webpack<br><small>是前端资源模块化管理和打包工具</small></a>
            </h3>
            <p>Webpack 是当下最热门的前端资源模块化管理和打包工具。它可以将许多松散的模块按照依赖和规则打包成符合生产环境部署的前端资源。</p>
          </div>
        </div>
      </div>
      <div class="col-sm-6 col-md-4 col-lg-3 ">
        <div class="thumbnail" style="height: 360px;">
          <a href="http://www.jquery123.com/" title="jQuery API 中文文档/手册" target="_blank" onclick="_hmt.push(['_trackEvent', 'tile', 'click', 'jQueryAPI中文手册'])">
            <img class="lazy" src="https://static.bootcss.com/www/assets/img/jqueryapi.png?1505127079951" width="300" height="150" data-src="https://static.bootcss.com/www/assets/img/jqueryapi.png?1505127079951" alt="jQuery API 中文文档/手册">
          </a>
          <div class="caption">
            <h3>
                <a href="http://www.jquery123.com/" title="jQuery API 中文文档/手册" target="_blank" onclick="_hmt.push(['_trackEvent', 'tile', 'click', 'jQueryAPI中文手册'])">jQuery API <br><small>中文手册</small></a>
            </h3>
            <p>根据最新的 jQuery 1.11.x 和 2.1.x 版本翻译的 jQuery API 中文文档/手册。</p>
          </div>
        </div>
      </div>
      <div class="col-sm-6 col-md-4 col-lg-3 ">
        <div class="thumbnail" style="height: 360px;">
          <a href="http://www.jquery123.com/" title="jQuery API 中文文档/手册" target="_blank" onclick="_hmt.push(['_trackEvent', 'tile', 'click', 'jQueryAPI中文手册'])">
            <img class="lazy" src="https://static.bootcss.com/www/assets/img/jqueryapi.png?1505127079951" width="300" height="150" data-src="https://static.bootcss.com/www/assets/img/jqueryapi.png?1505127079951" alt="jQuery API 中文文档/手册">
          </a>
          <div class="caption">
            <h3>
                <a href="http://www.jquery123.com/" title="jQuery API 中文文档/手册" target="_blank" onclick="_hmt.push(['_trackEvent', 'tile', 'click', 'jQueryAPI中文手册'])">jQuery API <br><small>中文手册</small></a>
            </h3>
            <p>根据最新的 jQuery 1.11.x 和 2.1.x 版本翻译的 jQuery API 中文文档/手册。</p>
          </div>
        </div>
      </div>
      <div class="col-sm-6 col-md-4 col-lg-3 ">
        <div class="thumbnail" style="height: 360px;">
          <a href="http://www.jquery123.com/" title="jQuery API 中文文档/手册" target="_blank" onclick="_hmt.push(['_trackEvent', 'tile', 'click', 'jQueryAPI中文手册'])">
            <img class="lazy" src="https://static.bootcss.com/www/assets/img/jqueryapi.png?1505127079951" width="300" height="150" data-src="https://static.bootcss.com/www/assets/img/jqueryapi.png?1505127079951" alt="jQuery API 中文文档/手册">
          </a>
          <div class="caption">
            <h3>
                <a href="http://www.jquery123.com/" title="jQuery API 中文文档/手册" target="_blank" onclick="_hmt.push(['_trackEvent', 'tile', 'click', 'jQueryAPI中文手册'])">jQuery API <br><small>中文手册</small></a>
            </h3>
            <p>根据最新的 jQuery 1.11.x 和 2.1.x 版本翻译的 jQuery API 中文文档/手册。</p>
          </div>
        </div>
      </div>
      <div class="col-sm-6 col-md-4 col-lg-3 ">
        <div class="thumbnail" style="height: 360px;">
          <a href="http://www.jquery123.com/" title="jQuery API 中文文档/手册" target="_blank" onclick="_hmt.push(['_trackEvent', 'tile', 'click', 'jQueryAPI中文手册'])">
            <img class="lazy" src="https://static.bootcss.com/www/assets/img/jqueryapi.png?1505127079951" width="300" height="150" data-src="https://static.bootcss.com/www/assets/img/jqueryapi.png?1505127079951" alt="jQuery API 中文文档/手册">
          </a>
          <div class="caption">
            <h3>
                <a href="http://www.jquery123.com/" title="jQuery API 中文文档/手册" target="_blank" onclick="_hmt.push(['_trackEvent', 'tile', 'click', 'jQueryAPI中文手册'])">jQuery API <br><small>中文手册</small></a>
            </h3>
            <p>根据最新的 jQuery 1.11.x 和 2.1.x 版本翻译的 jQuery API 中文文档/手册。</p>
          </div>
        </div>
      </div>


  </div><!-- 信息内容结束 -->
  <!--footer 开始 -->
  
  <footer class="footer ">
    <div class="container">
      <div class="row footer">
        <div class="col-sm-6 col-lg-6">
          <h4>
            <img src="https://static.bootcss.com/www/assets/img/logo.png?1505127079951">
          </h4>
          <p>本网站所列开源项目的中文版文档全部由<a href="http://www.bootcss.com/">Bootstrap中文网</a>成员翻译整理，并全部遵循 <a href="http://creativecommons.org/licenses/by/3.0/" target="_blank">CC BY 3.0</a>协议发布。</p>
        </div>
        <div class="col-sm-6  col-lg-5 col-lg-offset-1">
          <div class="row about">
            <div class="col-xs-3">
              <h4>关于</h4>
              <ul class="list-unstyled">
                <li><a href="/about/">关于我们</a></li>
                <li><a href="/ad/">广告合作</a></li>
                <li><a href="/links/">友情链接</a></li>
                <li><a href="/hr/">招聘</a></li>
              </ul>
            </div>
            <div class="col-xs-3">
              <h4>联系方式</h4>
              <ul class="list-unstyled">
                <li><a href="http://weibo.com/bootcss" title="Bootstrap中文网官方微博" target="_blank">新浪微博</a></li>
                <li><a href="mailto:admin@bootcss.com">电子邮件</a></li>
              </ul>
            </div>
            <div class="col-xs-3">
              <h4>旗下网站</h4>
              <ul class="list-unstyled">
                <li><a href="http://www.golaravel.com/" target="_blank">Laravel中文网</a></li>
                <li><a href="http://www.ghostchina.com/" target="_blank">Ghost中国</a></li>
              </ul>
            </div>
            <div class="col-xs-3">
              <h4>赞助商</h4>
              <ul class="list-unstyled">
                <li><a href="https://www.upyun.com" target="_blank">又拍云</a></li>
              </ul>
            </div>
          </div>
  
        </div>
      </div>
      <hr>
      <div class="row footer-bottom">
        <ul class="list-inline text-center">
          <li><a href="http://www.miibeian.gov.cn/" target="_blank">京ICP备11008151号</a></li><li>京公网安备11010802014853</li>
        </ul>
      </div>
    </div>
  </footer>   <!-- footer 结束 -->
  
  
  
  
  
  
  
  
  

<div class="container">
     <!-- index的栅格布局 -->
     <!--导航的模块-->
     <div class="row">
         <div>
            
         </div>
     </div>
     <!-- 中间内容的模块-->
     <div class="row"></div>
      <!-- 中间内容的模块-->
     <div class="row"></div>
     
     
      <!--登录的按钮-->
           <button type="button" id="login_index" class="btn btn-primary pull-right"                    data-toggle="modal"  data-target="#login_modal">登&nbsp;录</button> 
           <button type="button" id="register_index" class="btn btn-primary pull-right" 
                   data-toggle="modal" data-target="#userProtocol_modal">注&nbsp;册</button>
     
     
       
       
      
</div><!--主要的div结束--> 
<!--弹出登录模态框-->
<div class="modal fade" id="login_modal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header text-center">
        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
        <h3 class="modal-title ">欢迎登录PIMS</h3>
      </div>
      <div class="modal-body"> 
        <!--登录模块 用form表单提交验证-->
        <div class="container"><!--要用container包裹-->
          <form role="form" id="login_form" class="col-lg-8 col-sm-8 col-md-8">
            <div class="form-group col-lg-8 col-sm-8 col-md-8">
              <input class="form-control" id="username_1" name="username" type="text"              placeholder="手机号/邮箱/用户名"/>
            </div>
            <div class="form-group col-lg-8 col-sm-8 col-md-8">
              <input class="form-control" id="password_1" name="password" type="text"              placeholder="密码"/></div>
            <div class="form-group col-lg-8 col-sm-8 col-md-8">
              <div class="checkbox">
                <label>
                  <input type="checkbox" value="" id="rememberMe">
                  记住密码 </label>
              </div>
            </div>
            <div class="form-group col-lg-8 col-sm-8 col-md-8">
              <button type="submit" id="sub_login" class="btn btn-primary btn-block">
              登 &nbsp;&nbsp; 录
              </button>
              </div>
            <div class="form-group col-lg-8 col-sm-8 col-md-8"> <a href="" data-toggle="modal" data-dismiss="modal" data-target="#forgetPassword_modal">忘记密码</a> </div>
            <div class="form-group col-lg-8 col-sm-8 col-md-8"> <a href="" data-toggle="modal" data-dismiss="modal" data-target="#userProtocol_modal">注册</a> </div>
          </form>
        </div>
      </div>
      <!-- /.modal-body --> 
      <!--<div class="modal-footer">
        <button type="button" class="btn btn-primary">提交更改</button>
      </div>-->  
    </div><!-- /.modal-footer -->  
  </div><!-- /.modal-content -->   
</div><!-- 登录.modal --> 


<!--弹出注册模态框-->
<div class="modal fade" id="register_modal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header text-center">
        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
        <h3 class="modal-title">注册PIMS</h3>
      </div>
      <div class="modal-body"> 
        <!--注册模块 用form表单提交验证-->
        <div class="container"><!--要用container包裹-->
          <form role="form-horizontal" id="register_form" class="col-lg-8 col-sm-8 col-md-8">
            <div class="form-group col-lg-8 col-sm-8 col-md-8">
              <input type="text" class="form-control" id="userTelphone_1" name="phone"               placeholder="手机号"/>
            </div>
            <div class="form-group col-lg-8 col-sm-8 col-md-8">
                  <button type="button" class="btn btn-primary btn-block" id="WP_slideValidate_1">滑动验证(更新中）</button>
            </div>
            <div class="form-group col-lg-8 col-sm-8 col-md-8">
              <input type="text" class="form-control" id="loginPassword_1" name="password"               placeholder="密码"/></div>
              <div class="form-group col-lg-8 col-sm-8 col-md-8">
              <input type="text" class="form-control" id="loginPassword_2" placeholder="确认密码"/>
              </div>
            <!--<div class="form-group col-lg-8 col-sm-8 col-md-8">
              <div class="checkbox">
                <label>
                  <input type="checkbox" value="">
                  记住密码 </label>
              </div>
            </div>-->
            <div class="form-group col-lg-8 col-sm-8 col-md-8">
              <button type="submit" id="sub_register" class="btn btn-primary btn-block">注册</button></div>
            <div class="form-group col-lg-8 col-sm-8 col-md-8"> <a href="" data-toggle="modal" data-dismiss="modal" data-target="#login_modal">已有账号&gt;&gt;去登录</a> </div>
          </form>
        </div>
      </div> <!-- /.modal-body --> 
      <!--<div class="modal-footer">
        <button type="button" class="btn btn-primary">提交更改</button>
      </div>-->  
    </div><!-- /.modal-footer -->  
  </div><!-- /.modal-content -->   
</div><!-- 注册.modal --> 

<!--弹出协议模态框-->
<div class="modal fade" id="userProtocol_modal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header text-center">
        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
        <h3 class="modal-title ">PIMS用户协议</h3>
      </div>
      <div class="modal-body text-center"> 
         
        <!--用户协议模块 文本区域-->
               <p>  为有效利用QQ号码资源，维护用户合法权益，特制订《QQ号码规则》（以下简称“本规则”）。请您务必审慎阅读、充分理解各条款内容，特别是免除或者限制责任的条款，以及开通或使用某项服务的单独协议，并选择接受或不接受。限制、免责条款可能以加粗形式提示您注意
               </p>
                </div><!-- /.modal-body --> 
               <div class="modal-footer">
                   
                    <button type="button" class="btn btn-primary btn-block" data-toggle="modal" data-dismiss="modal" data-target="#register_modal">同意协议</button>
                     <br />
                     <a href="" data-toggle="modal" data-dismiss="modal" data-target="#">了解更多的协议信息&gt;&gt;查看</a>
              
          </div><!-- /.modal-footer -->  
    
  </div><!-- /.modal-content -->  
  </div><!-- /.modal-dialog -->   
</div><!-- 用户协议.modal --> 

<!--弹出找回密码模态框-->
<div class="modal fade" id="forgetPassword_modal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header text-center">
        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
        <h3 class="modal-title">找回密码</h3>
      </div>
      <div class="modal-body"> 
        <!--找回密码模块 用form表单提交验证-->
        <div class="container"><!--要用container包裹-->
          <form role="form" id="forgetPassword_form" class="col-lg-8 col-sm-8 col-md-8">
            <div class="form-group col-lg-8 col-sm-8 col-md-8">
              <input type="text" class="form-control" id="userTelphone_2" name="phone"               placeholder="手机号"/>
            </div>
            <div class="form-group col-lg-8 col-sm-8 col-md-8">
                  <button type="button" class="btn btn-primary btn-block" id="slideValidate_2">滑动发送手机验证码(更新中）</button>
            </div>
            <div class="form-group col-lg-8 col-sm-8 col-md-8">
                <input type="text" class="form-control" id="phoneValidate_2" 
                 placeholder="输入手机验证码"/>
              </div>
               <div class="form-group col-lg-8 col-sm-8 col-md-8">
                    <input type="text" class="form-control" id="loginNewPassword_1" 
                    placeholder="输入新密码"/>
              </div>
              <div class="form-group col-lg-8 col-sm-8 col-md-8">
                    <input type="text" class="form-control" id="loginNewPassword_2" 
                    placeholder="确认新密码"/>
              </div>
            <div class="form-group col-lg-8 col-sm-8 col-md-8">
              <button type="submit" id="sub_forgetPassword" class="btn btn-primary btn-block">下一步</button></div>
           
          </form>
        </div>
      </div> <!-- /.modal-body --> 
      
    </div><!-- /.modal-footer -->  
  </div><!-- /.modal-content -->   
</div><!-- 注册.modal --> 

<!--测试的样式-->




<script type="text/javascript" src="/js/jquery-3.1.1.js"></script> 
<script type="text/javascript" src="/js/bootstrap.js"></script>
</body>
</html>
