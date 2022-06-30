/* -------------------------------------------------------------------------------- /

/ -------------------------------------------------------------------------------- */


	// Cart add remove functions
	var cart = {
		'add': function(p_id) {
			
			addProductNotice('Thêm giỏ hàng thành công', '<img src="static/image/product/p1.jpg" alt="">', '<h3><a href="#">bàn gỗ</a> đã thêm vào <a href="#">giỏ hàng</a>!</h3>', 'suscess');
		}
	}

var wishlist = {
		'add': function(product_id) {
			addProductNotice('Product added to Wishlist', '<img src="image/demo/shop/product/e11.jpg" alt="">', '<h3>You must <a href="#">login</a>  to save <a href="#">Apple Cinema 30"</a> to your <a href="#">wish list</a>!</h3>', 'success');
		}
	}
	

	/* ---------------------------------------------------
		jGrowl – jQuery alerts and message box
	-------------------------------------------------- */
	function addProductNotice(title, thumb, text, type) {
		$.jGrowl.defaults.closer = false;
		//Stop jGrowl
		//$.jGrowl.defaults.sticky = true;
		var tpl = thumb + '<h3>'+text+'</h3>';
		$.jGrowl(tpl, {		
			life: 4000,
			header: title,
			speed: 'slow',
			theme: type
		});
	}

