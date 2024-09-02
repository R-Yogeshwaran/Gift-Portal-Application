package com.backend.yogesh.dto.request;

import com.backend.yogesh.model.User;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class CustomerRequest
{
    private String customerId;
    private String customerName;
    private String address;
    private User user;
}

    
