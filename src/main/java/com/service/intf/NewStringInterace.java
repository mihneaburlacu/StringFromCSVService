package com.service.intf;

import com.service.DTO.NewStringRequest;
import com.service.DTO.NewStringResponse;

public interface NewStringInterace {
    public NewStringResponse service(NewStringRequest input);
}
