<%@ include file="/views/web/layout/header.jsp"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<link href="static/css/new-home.css" rel="stylesheet">
<link href="static/css/responsive.css" rel="stylesheet">

<!-- Main Container  -->
<div class="main-container">
	<div id="content">
		<div class="slider-container">
			<div class="module sohomepage-slider ">
				<div class="yt-content-slider" data-rtl="no" data-autoplay="no"
					data-autoheight="no" data-delay="4" data-speed="0.6"
					data-margin="0" data-items_column00="1" data-items_column0="1"
					data-items_column1="1" data-items_column2="1"
					data-items_column3="1" data-items_column4="1" data-arrows="yes"
					data-pagination="no" data-lazyload="yes" data-loop="no"
					data-hoverpause="yes">
					<div class="yt-content-slide">
						<a href="#"><img src="static/image/slider/slider-1.jpg"
							alt="slider1" class="img-responsive"></a>
					</div>
					<div class="yt-content-slide">
						<a href="#"><img src="static/image/slider/slider-2.jpg"
							alt="slider2" class="img-responsive"></a>
					</div>
					<div class="yt-content-slide">
						<a href="#"><img src="static/image/slider/slider-3.jpg"
							alt="slider3" class="img-responsive"></a>
					</div>
				</div>

				<div class="loadeding"></div>
			</div>
		</div>
		<div class="content-main-w">



			<!-- Deals -->
			<div class="row-image deals-w">
				<div class="container row row-deals">
					<div class="col-lg-9 col-md-8 col-sm-12 col-xs-12">
						<div class="module deals-layout1">
							<h3 class="modtitle2">
								<span>Khuyến mãi hôm nay</span>
							</h3>
							<div class="modcontent">
								<div id="so_deal_11" class="so-deal">
									<div class="products-list yt-content-slider extraslider-inner"
										data-rtl="yes" data-pagination="no" data-arrows="no"
										data-autoplay="no" data-delay="4" data-speed="0.6"
										data-margin="30" data-items_column00="1"
										data-items_column0="1" data-items_column1="1"
										data-items_column2="1" data-items_column3="1"
										data-items_column4="1" data-lazyload="yes" data-loop="no"
										data-buttonpage="top">
										<div class="item product-layout">
											<div class="product-thumb transition product-item-container">
												<div class="col-lg-6 col-md-5 col-sm-6 col-xs-12 col-left">
													<div class="left-block">
														<div class="product-image-container second_img">
															<a href="product.html" target="_self"
																title="Sunt in culpa"> <img
																src="static/image/product/p1.jpg"
																class="img-1 img-responsive" alt="image1"> <img
																src="static/image/product/p1.jpg"
																class="img-2 img-responsive" alt="image2">
															</a>
														</div>
														<div class="so-quickview">
															<a
																class="iframe-link btn-button quickview quickview_handler visible-lg"
																href="quickview.html" title="Quick view"
																data-fancybox-type="iframe"><i class="fa fa-search"></i><span>Quick
																	view</span></a>
														</div>
													</div>
												</div>
												<div class="col-lg-6 col-md-7 col-sm-6 col-xs-12 col-right">
													<div class="right-block">
														<h4>
															<a href="product.html" title="Sunt in culpa"
																target="_self">Sunt in culpa back wheel</a>
														</h4>
														<div class="rating">
															<span class="fa fa-stack"><i
																class="fa fa-star fa-stack-2x"></i></span> <span
																class="fa fa-stack"><i
																class="fa fa-star fa-stack-2x"></i></span> <span
																class="fa fa-stack"><i
																class="fa fa-star fa-stack-2x"></i></span> <span
																class="fa fa-stack"><i
																class="fa fa-star fa-stack-2x"></i></span> <span
																class="fa fa-stack"><i
																class="fa fa-star-o fa-stack-2x"></i></span>
														</div>
														<div class="price">
															<span class="price-new">$50.00</span> <span
																class="price-old">$59.00</span>
														</div>
														<p>Lorem ipsum dolor sit amet, consectetur adipisicing
															elit, sed do eiusmod tempor incididunt ut labore et
															dolore magna aliqua. Ut enim ad minim veniam, ..</p>
														<div class="item-time">
															<div class="item-timer">
																<div class="defaultCountdown-30"></div>
															</div>
														</div>
														<div class="button-group">
															<button type="button" class="addToCart"
																title="Add to cart" onclick="cart.add('60 ');">
																<span>Add to cart </span>
															</button>
															<button type="button" class="wishlist btn-button"
																title="Add to Wish List" onclick="wishlist.add('60');">
																<i class="fa fa-heart"></i>
															</button>
															<button type="button" class="compare btn-button"
																title="Compare this Product "
																onclick="compare.add('60');">
																<i class="fa fa-refresh"></i>
															</button>
														</div>
													</div>
												</div>

											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
					<div
						class="col-lg-3 col-md-4 col-sm-6 col-xs-12 col-style hidden-xs hidden-sm">
						<div class="banners banners1">
							<div>
								<a href="#"><img src="static/image/product/p1.jpg"
									alt="banner"></a>
							</div>
						</div>
					</div>
				</div>
			</div>
			<!-- end Deals -->

			<div class="container">

				<c:forEach var="category" items="${listCates}" varStatus="loop">
					<!-- Extra new arrivals -->

					<div class="module extra-layout1">
						<h3 class="modtitle">
							<span>${category.name}</span>
						</h3>
						<div class="modcontent">
							<div id="so_extra_slider_12" class="so-extraslider button-type1">
								<div class="products-list yt-content-slider extraslider-inner"
									data-rtl="yes" data-pagination="no" data-arrows="no"
									data-autoplay="no" data-delay="4" data-speed="0.6"
									data-margin="30" data-items_column00="4" data-items_column0="4"
									data-items_column1="3" data-items_column2="3"
									data-items_column3="2" data-items_column4="1"
									data-lazyload="yes" data-loop="no" data-buttonpage="top">

									<c:forEach var="product" items="${category.products}"
										varStatus="loop">

										<div class="item">
											<div class="product-layout product-grid">
												<div
													class="item-inner product-layout transition product-grid">
													<div class="product-item-container item--static">
														<div class="left-block">
															<div class="product-image-container second_img">
																<a href="product.html" target="_self"
																	title="Stickrum bresao"> <img
																	src="static/image/product/p1.jpg"
																	class="img-1 img-responsive" alt="image1"> <img
																	src="static/image/product/p1.jpg"
																	class="img-2 img-responsive" alt="image2">
																</a>
															</div>
															<c:if test="${product.discount > 0}">
																<span class="label-product label-sale">-${product.discount}%</span>
															</c:if>

															<!--quickview-->
															<div class="so-quickview">
																<a
																	class="iframe-link btn-button quickview quickview_handler visible-lg"
																	href="views/web/quickview.jsp" title="Xem nhanh"
																	data-fancybox-type="iframe"><i class="fa fa-search"></i><span>Xem
																		nhanh</span></a>
															</div>
															<!--end quickview-->
														</div>
														<div class="right-block">
															<div class="button-group cartinfo--static">

																<button type="button" class="wishlist btn-button"
																	title="Add to Wish List" onclick="wishlist.add('60');">
																	<i class="fa fa-heart"></i>
																</button>
																<button type="button" class="addToCart"
																	title="Add to cart" onclick="addToCart(${product.id});">
																	<span>Thêm giỏ hàng</span>
																</button>
																<button type="button" class="compare btn-button"
																	title="Compare this Product "
																	onclick="compare.add('60');">
																	<i class="fa fa-refresh"></i>
																</button>
															</div>
															<h4 style="height: 36px;">
																<a href="product.html" title="Stickrum bresao"
																	target="_self">${product.name}</a>
															</h4>
															<div class="rating">
																<span class="fa fa-stack"><i
																	class="fa fa-star fa-stack-2x"></i></span> <span
																	class="fa fa-stack"><i
																	class="fa fa-star fa-stack-2x"></i></span> <span
																	class="fa fa-stack"><i
																	class="fa fa-star fa-stack-2x"></i></span> <span
																	class="fa fa-stack"><i
																	class="fa fa-star fa-stack-2x"></i></span> <span
																	class="fa fa-stack"><i
																	class="fa fa-star-o fa-stack-2x"></i></span>
															</div>
															<div class="price">
																<c:choose>
																	<c:when test="${product.discount > 0}">
																		<span class="price-new"> <fmt:setLocale
																				value="vi_VN" /> <fmt:formatNumber
																				value="${product.price *(100-product.discount)/100}"
																				type="currency" />
																		</span>
																		<span class="price-old"><fmt:setLocale
																				value="vi_VN" /> <fmt:formatNumber
																				value="${product.price}" type="currency" /></span>
																	</c:when>
																	<c:otherwise>
																		<span class="price-new"> <fmt:setLocale
																				value="vi_VN" /> <fmt:formatNumber
																				value="${product.price}" type="currency" />
																		</span>

																	</c:otherwise>
																</c:choose>

															</div>


														</div>
													</div>
												</div>
											</div>
										</div>

									</c:forEach>

								</div>
							</div>
						</div>

						<div class="row text-center">
							<div class="btn btn-more">
								<a href="#">Xem thêm</a>
							</div>
						</div>
					</div>
					<!-- end Extra new arrivals -->
				</c:forEach>

				<div class="banners banners2 mt-3">
					<div class="row">
						<div class="item col-lg-6 col-md-6 col-sm-6 col-xs-12">
							<a href="#"><img src="static/image/slider/slider-1.jpg"
								alt="banner"></a>
						</div>
						<div class="item col-lg-6 col-md-6 col-sm-6 col-xs-12">
							<a href="#"><img src="static/image/slider/slider-3.jpg"
								alt="banner"></a>
						</div>
					</div>
				</div>
			</div>





		</div>

	</div>
</div>
<!-- //Main Container -->

<%@ include file="/views/web/layout/footer.jsp"%>
<script type="text/javascript">
	$(document).ready(function() {

		$(".tab").click(function() {
			$(".tab").removeClass("active");
			$(this).addClass("active");
			
		});

		
	})
	
	function addToCart(id) {
		$.ajax({
	        url: 'client/addtocard',
	        type: 'GET',
	        data: { p_id: id} ,
	        contentType: 'application/json; charset=utf-8',
	        success: function (response) {
	            console.log(response)
	            addProductNotice('Thêm giỏ hàng thành công', '<img src="static/image/product/p1.jpg" alt="">', '<h3><a href="#">bàn gỗ</a> đã thêm vào <a href="#">giỏ hàng</a>!</h3>', 'toast');
	        },
	        error: function () {
	            
	        }
	    });
			
		}
		
	function addProductNotice(title, thumb, text, type) {
			$.jGrowl.defaults.closer = false;
			//Stop jGrowl
			//$.jGrowl.defaults.sticky = true;
			var tpl = thumb + '<h3>'+text+'</h3>';
			$.jGrowl(tpl, {		
				life: 3000,
				header: title,
				speed: 'slow',
				theme: type
			});
		}
</script>
</body>
</html>