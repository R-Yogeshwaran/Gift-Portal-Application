package com.backend.yogesh.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backend.yogesh.Service.CustomerService;
import com.backend.yogesh.dto.response.BasicResponse;
import com.backend.yogesh.dto.response.CustomerResponse;
import com.backend.yogesh.Utils.myconstant;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/customer")
@RequiredArgsConstructor
public class CustomerController {
    private final CustomerService giftService;
    @GetMapping("/get")
    public ResponseEntity<BasicResponse<CustomerResponse>> create(){
        BasicResponse<CustomerResponse> response=new BasicResponse<>();
        try{
            response=giftService.getAllCustomer();
            return new ResponseEntity<>(response,HttpStatus.OK);
        }
        catch(Exception e){
            response.setMessage("Something went wrong!");
            return new ResponseEntity<>(response,HttpStatus.EXPECTATION_FAILED);
        }
    }
}