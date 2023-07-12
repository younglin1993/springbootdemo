package com.younglin.springbootdemo.controller;

import java.util.List;
import com.younglin.springbootdemo.entity.Booking;
import com.younglin.springbootdemo.entity.GameBean;
import com.younglin.springbootdemo.entity.MemberBean;
import com.younglin.springbootdemo.service.BookingService;
import com.younglin.springbootdemo.service.GameService;
import com.younglin.springbootdemo.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class BookingController {

	@Autowired
	private BookingService bookingService;

	@Autowired
	private GameService gameService;

	@Autowired
	private MemberService memberService;

	@GetMapping("/manager.bookingmanager")
	public String showBookingManager(Model model) {

		List<Booking> bookings = bookingService.findAll();
		List<GameBean> games = gameService.findAll();
		model.addAttribute("bookings", bookings);
		model.addAttribute("games", games);

		return "booking/bookingmanager";
	}

	@RequestMapping("/mybooking")
	public String myBooking(Model model) {

		List<Booking> bookings = bookingService.findAll();
		model.addAttribute("bookings", bookings);

		return "booking/mybooking";
	}

	@RequestMapping("/booking")
	public String booking(Model model) {

		List<GameBean> games = gameService.findAll();
//		GameBean curGame = gameService.findById(gameID);

		model.addAttribute("games", games);
//		model.addAttribute("curGame", curGame);
		return "booking/booking";
	}

	@PostMapping("/updateBooking")
	@ResponseBody
	public String updateBooking(@RequestParam("bookingID") int bookingId, @RequestParam("gameName") String gameName,
			@RequestParam("email") String email, @RequestParam("date") String bookingDate,
			@RequestParam("time") String bookingTime) {

		Booking booking = new Booking();
		MemberBean member = memberService.findByEmail(email);
		GameBean game = gameService.findByGname(gameName);

		booking.setBookingId(bookingId);
		booking.setMemberBean(member);
		booking.setGameBean(game);
		booking.setBookingDate(bookingDate);
		booking.setBookingTime(bookingTime);
		bookingService.update(booking);

		String gameImg = game.getGameimg();
		return gameImg;
	}

	@PostMapping("/deleteBooking")
	@ResponseBody
	public void deleteBooking(@RequestParam("bookingID") int bookingID) {
			bookingService.deleteById(bookingID);
	}
}
