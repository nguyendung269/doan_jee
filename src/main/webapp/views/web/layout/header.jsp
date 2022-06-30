<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/common/taglib.jsp"%>


<!DOCTYPE html>
<html lang="en">
<head>

<!-- Basic page needs
    ============================================ -->
<title>Nội thất Tiến Pháp</title>
<meta charset="utf-8">
<meta name="keywords"
	content="html5 template, best html5 template, best html template, html5 basic template, multipurpose html5 template, multipurpose html template, creative html templates, creative html5 templates" />
<meta name="description"
	content="SuperMarket is a powerful Multi-purpose HTML5 Template with clean and user friendly design. It is definite a great starter for any eCommerce web project." />
<meta name="author" content="Magentech">
<meta name="robots" content="index, follow" />

<!-- Mobile specific metas
    ============================================ -->
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">

<!-- Favicon
    ============================================ -->
<link rel="shortcut icon" type="image/png"
	href="static/ico/favicon-16x16.png" />


<!-- Libs CSS
    ============================================ -->
<link rel="stylesheet" href="static/css/bootstrap/css/bootstrap.min.css">
<link href="static/css/font-awesome/css/font-awesome.min.css"
	rel="stylesheet">
<link href="static/js/datetimepicker/bootstrap-datetimepicker.min.css"
	rel="stylesheet">
<link href="static/js/owl-carousel/owl.carousel.css" rel="stylesheet">
<link href="static/css/themecss/lib.css" rel="stylesheet">
<link href="static/js/jquery-ui/jquery-ui.min.css" rel="stylesheet">
<link href="static/js/minicolors/miniColors.css" rel="stylesheet">

<link href="static/js/pe-icon-7-stroke/css/pe-icon-7-stroke.css"
	rel="stylesheet">
<link href="static/js/pe-icon-7-stroke/css/helper.css" rel="stylesheet">

<!-- Theme CSS
    ============================================ -->
<link href="static/css/themecss/so_searchpro.css" rel="stylesheet">
<link href="static/css/themecss/so_megamenu.css" rel="stylesheet">
<link href="static/css/themecss/so_advanced_search.css" rel="stylesheet">
<link href="static/css/themecss/so-listing-tabs.css" rel="stylesheet">
<link href="static/css/themecss/so-categories.css" rel="stylesheet">
<link href="static/css/themecss/so-newletter-popup.css" rel="stylesheet">
<link href="static/css/themecss/so-latest-blog.css" rel="stylesheet">

<link href="static/css/footer/footer4.css" rel="stylesheet">
<link href="static/css/header/header4.css" rel="stylesheet">
<link id="color_scheme" href="static/css/home4.css" rel="stylesheet">
<link href="static/css/new-header.css" rel="stylesheet">
<link href="static/css/responsive.css" rel="stylesheet">



<!-- Google web fonts
    ============================================ -->
<link
	href='https://fonts.googleapis.com/css?family=Rubik:300,400,400i,500,600,700'
	rel='stylesheet' type='text/css'>
<style type="text/css">
body {
	font-family: 'Rubik', sans-serif;
}
</style>

</head>

<body class="common-home res layout-4">

	<div id="wrapper" class="wrapper-fluid banners-effect-5">


		<!-- Header Container  -->
		<header id="header" class=" typeheader-4">

			<!-- Header Top -->
			<div class="header-top hidden-compact">
				<div class="container">
					<div class="row">
						<div
							class="header-top-left col-lg-6 col-md-6 col-sm-6 col-xs-12 hidden-xs">
							<div class="">Siêu Thị Nội Thất Văn Phòng Giá Tốt | Nội
								Thất Tiến Pháp</div>
						</div>
						<div class="header-top-right col-lg-6 col-md-6 col-sm-6 col-xs-12">

							<ul class="top-log list-inline">
								<li><i class="fa fa-clock-o"></i><a href="login.html">T2-T7
										08:00 - 19:00 CN 08:00-13.00</a> |</li>
								<li><i class="fa fa-volume-control-phone"></i><a
									href="register.html">0936 930 227</a></li>
							</ul>
						</div>
					</div>
				</div>
			</div>
			<div class="header-fixed">
				<div class="header-middle">
					<div class="container">
						<div class="row">
							<div class="logo-wrapper col-lg-3 col-md-4 col-sm-12 col-xs-12">
								<div class="logo">
									<a href="home"><img style="height: 116px;"
										src="static/image/slider/logo.jpg" title="Your Store"
										alt="Your Store" /></a>
								</div>

							</div>
							<div class="col-lg-9 col-md-8 col-sm-12 col-xs-12 middle-right">
								<div class="search-header-w">
									<div class="icon-search hidden-lg hidden-md">
										<i class="fa fa-search"></i>
									</div>

									<div id="sosearchpro" class="sosearchpro-wrapper so-search ">
										<form method="GET" action="index.html">
											<div id="search0" class="search input-group form-group">
												<div
													class="select_category filter_type  icon-select hidden-sm hidden-xs">
													<select id="category-header" class="no-border"
														name="category_id">
														<option value="0">Tất cả danh mục</option>
														<!---->
														<c:forEach var="category" items="${listCates}"
															varStatus="loop">


															<option value="${category.id}">${category.name}</option>
														</c:forEach>
													</select>
												</div>

												<input class="autosearch-input form-control" type="text"
													value="" size="50" autocomplete="off"
													placeholder="Tìm kiếm..." name="search">

												<button type="submit" class="button-search btn btn-primary"
													name="submit_search">
													<i class="fa fa-search"></i>
												</button>

											</div>
											<input type="hidden" name="route" value="product/search" />
										</form>
									</div>
								</div>

								<div class="shopping_cart">
									<div id="cart" class="btn-shopping-cart">
										<a href="javascript:void(0)" data-loading-text="Loading... "
											class="btn-group top_cart dropdown-toggle"
											data-toggle="dropdown" aria-expanded="true">
											<div class="shopcart">
												<span class="icon-c"> <i
													class="fa fa-shopping-basket"></i>
												</span>
												<div class="shopcart-inner">
													<p class="text-shopping-cart">Giỏ hàng</p>

													<span class="total-shopping-cart cart-total-full"> <span
														class="items_cart"></span><span class="items_cart2">
															item(s)</span><span class="items_carts"></span>
													</span>
												</div>
											</div>
										</a>

										<ul class="dropdown-menu pull-right shoppingcart-box"
											role="menu">
											<li>
												<table class="table table-striped">
													<tbody>
														<tr>
															<td class="text-center" style="width: 70px"><a
																href="product.html"> <img
																	src="image/catalog/demo/product/80/1.jpg"
																	style="width: 70px" alt="Yutculpa ullamcon"
																	title="Yutculpa ullamco" class="preview">
															</a></td>
															<td class="text-left"><a class="cart_product_name"
																href="product.html">Yutculpa ullamco</a></td>
															<td class="text-center">x1</td>
															<td class="text-center">$80.00</td>
															<td class="text-right"><a href="product.html"
																class="fa fa-edit"></a></td>
															<td class="text-right"><a
																onclick="cart.remove('2');"
																class="fa fa-times fa-delete"></a></td>
														</tr>
														<tr>
															<td class="text-center" style="width: 70px"><a
																href="product.html"> <img
																	src="image/catalog/demo/product/80/2.jpg"
																	style="width: 70px" alt="Xancetta bresao"
																	title="Xancetta bresao" class="preview">
															</a></td>
															<td class="text-left"><a class="cart_product_name"
																href="product.html">Xancetta bresao</a></td>
															<td class="text-center">x1</td>
															<td class="text-center">$60.00</td>
															<td class="text-right"><a href="product.html"
																class="fa fa-edit"></a></td>
															<td class="text-right"><a
																onclick="cart.remove('1');"
																class="fa fa-times fa-delete"></a></td>
														</tr>
													</tbody>
												</table>
											</li>
											<li>
												<div>
													<table class="table table-bordered">
														<tbody>
															<tr>
																<td class="text-left"><strong>Sub-Total</strong></td>
																<td class="text-right">$140.00</td>
															</tr>
															<tr>
																<td class="text-left"><strong>Eco Tax
																		(-2.00)</strong></td>
																<td class="text-right">$2.00</td>
															</tr>
															<tr>
																<td class="text-left"><strong>VAT (20%)</strong></td>
																<td class="text-right">$20.00</td>
															</tr>
															<tr>
																<td class="text-left"><strong>Total</strong></td>
																<td class="text-right">$162.00</td>
															</tr>
														</tbody>
													</table>
													<p class="text-right">
														<a class="btn view-cart" href="cart.html"><i
															class="fa fa-shopping-cart"></i>View Cart</a>&nbsp;&nbsp;&nbsp;
														<a class="btn btn-mega checkout-cart" href="checkout.html"><i
															class="fa fa-share"></i>Checkout</a>
													</p>
												</div>
											</li>
										</ul>
									</div>
								</div>

								<div class="wishlist hidden-md hidden-sm hidden-xs">
									<a href="#" id="wishlist-total" class="top-link-wishlist"
										title="Wish List (0) "><i class="fa fa-heart"></i></a>
								</div>

							</div>
						</div>
					</div>
				</div>

				<div class="header-bottom hidden-compact">
					<div class="container">
						<div class="row">

							<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
								<div class="main-menu-w">
									<div class="responsive so-megamenu megamenu-style-dev">
										<nav class="navbar-default">
											<div class=" container-megamenu  horizontal open ">
												<div class="navbar-header">
													<button type="button" id="show-megamenu"
														data-toggle="collapse" class="navbar-toggle">
														<span class="icon-bar"></span> <span class="icon-bar"></span>
														<span class="icon-bar"></span>
													</button>
												</div>

												<div class="megamenu-wrapper">
													<span id="remove-megamenu" class="fa fa-times"></span>
													<div class="megamenu-pattern">
														<div class="container-mega">
															<ul class="megamenu" data-transition="slide"
																data-animationtime="250">

																<li class="tab active"><a href="home">Trang chủ</a></li>

																<c:forEach var="category" items="${listCates}"
																	varStatus="loop">
																	<li class="tab">
																		<p class="close-menu"></p> <a
																		href="/category/${category.id}"> <strong>${category.name}</strong>
																	</a>

																	</li>

																</c:forEach>


																<li class="tab">
																	<p class="close-menu"></p> <a href="#" class="clearfix">
																		<strong>Dịch vụ</strong>
																</a>

																</li>

																<li class="tab">
																	<p class="close-menu"></p> <a href="#" class="clearfix">
																		<strong>Thanh toán</strong>
																</a>
																</li>

																<li class="tab">
																	<p class="close-menu"></p> <a href="#" class="clearfix">
																		<strong>Liên hệ</strong>
																</a>
																</li>


															</ul>

														</div>
													</div>
												</div>
											</div>
										</nav>
									</div>
								</div>
							</div>
						</div>
					</div>

				</div>
			</div>
		</header>
		<!-- //Header Container  -->