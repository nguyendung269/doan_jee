/**
 * 
 */
$(document).ready(function() {
	var cuonLen = window.pageYOffset;
	window.onscroll = function() {
		var cuonXuong = window.pageYOffset;
		if (cuonXuong < 46) {

			$(".header-fixed").css("position", "relative");
			$(".header-fixed").css("background-color", "white");
			$(".header-fixed").css("transition", "all 0.2s linear");


		} else if (cuonXuong > 130) {
			if (cuonLen > cuonXuong) {

				$(".header-fixed").css("position", "fixed");
				$(".header-fixed").css("top", "0");
				$(".header-fixed").css("left", "0");
				$(".header-fixed").css("right", "0");
				$(".header-fixed").css("background-color", "#edb67f");
				$(".header-fixed").css("opacity", "1");
				$(".header-fixed").css("transition", "all 0.5s linear");

			} else {

				$(".header-fixed").css("top", "-140px");
				$(".header-fixed").css("opacity", "0");
			}
			cuonLen = cuonXuong;
		}
	}

})
