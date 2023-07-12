package com.younglin.springbootdemo;

import com.younglin.springbootdemo.dao.GameRepository;
import com.younglin.springbootdemo.entity.Booking;
import com.younglin.springbootdemo.dao.BookingRepository;
import com.younglin.springbootdemo.entity.GameBean;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class SpringbootdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootdemoApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(BookingRepository bookingRepository, GameRepository gameRepository) {

        return runner -> {
            findGame(gameRepository);
            printStar();
        };
    }

    private void printStar() {
        int level = 15;
        int count = 2 * level - 1;
        int mid = count / 2;
        int left = mid, right = mid;

        char[] charArr = new char[count];
        Arrays.fill(charArr, ' ');
        charArr[mid] = '*';

        for(int i = 0; i < level; i++) {
            charArr[left] = '*';
            charArr[right] = '*';
            System.out.println(charArr);
            left--;
            right++;
        }


    }

    private void findGame(GameRepository gameRepository) {

        GameBean games = gameRepository.findByGname("奪命記憶");

        System.out.println(games);
    }
}
