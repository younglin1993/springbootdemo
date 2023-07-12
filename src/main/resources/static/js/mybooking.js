$(function() {
	$(".change").click(function() {
		let bookingID = $(this).closest(".booking-content").find(".booking-info").attr("name");
		console.log(bookingID);
		window.location.href = "http://localhost:8080/project/booking?bookingID=" + bookingID;
	});
	$(".cancel").click(function() {
		Swal.fire({
			title: '確定要取消預約?',
			showDenyButton: true,
			showCancelButton: false,
			confirmButtonText: '是',
			denyButtonText: `否，再考慮一下`,
		}).then((result) => {
			/* Read more about isConfirmed, isDenied below */
			if (result.isConfirmed) {
				let booking = $(this);
				let bookingID = $(".booking-info").attr('name');
				console.log(bookingID);
				$.ajax({
					type: "POST",
					url: "deleteBooking",
					data: { bookingID: bookingID },
					success: function(response) {
						// 刪除成功時執行的代碼
						booking.closest(".booking").remove();
						if ($(".container-booking").find($(".booking")).length == 0) {
							var html = '<div class="no-booking">' +
								'<div id="no-booking">' +
								'<image src="images\\jigsaw-icon.png"></image>' +
								'<div>你還沒有預約</div>' +
								'</div>' +
								'<div class="go-booking">' +
								'<div class="go-booking-btns">' +
								'<div class="go-booking-btn">前往遊戲選單</div>' +
								'</div>' +
								'</div>' +
								'</div>';
							$(".container-booking").append(html);
						console.log(123);
						}

					},
					error: function(xhr, status, error) {
						// 刪除失敗時執行的代碼
						console.log(456);
					}
				});
				Swal.fire('取消預約成功', '', 'success')
			} else if (result.isDenied) {

			}
		})
	});

	$(".go-booking-btn").click(function() {
		console.log("123");
		window.location.href = "http://localhost:8080/Project2/main.jsp";
	});
})