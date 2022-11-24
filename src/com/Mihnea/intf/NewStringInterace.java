package com.Mihnea.intf;

import com.Mihnea.DTO.NewStringRequest;
import com.Mihnea.DTO.NewStringResponse;

public interface NewStringInterace {
    public NewStringResponse service(NewStringRequest input);
}
