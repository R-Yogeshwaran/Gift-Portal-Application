package com.backend.yogesh.Service;

import com.backend.yogesh.dto.response.BasicResponse;
import com.backend.yogesh.dto.response.CustomerResponse;

public interface CustomerService {
    BasicResponse<CustomerResponse> getAllCustomer();
    
}
