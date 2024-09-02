package com.backend.yogesh.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backend.yogesh.Service.ThemeService;
import com.backend.yogesh.dto.response.BasicResponse;
import com.backend.yogesh.dto.response.ThemeResponse;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/theme")
@RequiredArgsConstructor
public class ThemeController {
    private final ThemeService giftService;
    @GetMapping("/get")
    public ResponseEntity<BasicResponse<ThemeResponse>> create(){
        BasicResponse<ThemeResponse> response=new BasicResponse<>();
        try{
            response=giftService.getAllTheme();
            return new ResponseEntity<>(response,HttpStatus.OK);
        }
        catch(Exception e){
            response.setMessage("Something went wrong!");
            return new ResponseEntity<>(response,HttpStatus.EXPECTATION_FAILED);
        }
    }
}