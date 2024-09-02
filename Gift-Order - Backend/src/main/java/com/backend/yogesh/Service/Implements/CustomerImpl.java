package com.backend.yogesh.Service.Implements;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;

import com.backend.yogesh.model.Customer;
import com.backend.yogesh.model.Gift;
import com.backend.yogesh.repository.CustomerRepository;
import com.backend.yogesh.Service.CustomerService;
import com.backend.yogesh.Service.GiftService;
// import com.backend.yogesh.dto.request.GiftRequest;
import com.backend.yogesh.dto.response.BasicResponse;
import com.backend.yogesh.dto.response.CustomerResponse;
// import com.backend.yogesh.dto.response.GiftResponse;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CustomerImpl implements CustomerService {
    private final CustomerRepository giftRepo;

    @Override
    public BasicResponse<CustomerResponse> getAllCustomer() 
    {
        List<Customer> gifts = giftRepo.findAll();
        List<CustomerResponse> giftResponses = gifts.stream()
            .map(gift -> CustomerResponse.builder()
                .customerId(gift.getCustomerId())
                .customerName(gift.getCustomerName())
                .address(gift.getAddress())
                .build())
            .collect(Collectors.toList());
        return BasicResponse.<CustomerResponse>builder()
            .message("success!")
            .data(giftResponses)
            .build();
    }
}