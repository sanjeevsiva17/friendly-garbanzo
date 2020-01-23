package com.escrow.escrowservice.services;

import com.escrow.escrowservice.entities.EscrowEntity;
import com.escrow.escrowservice.models.Escrow;
import com.escrow.escrowservice.repositories.EscrowRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Slf4j
@Service
public class EscrowService {
    private EscrowRepository escrowRepository;
    private ObjectMapper jsonMapper;

    public Escrow create(Escrow obj) {
        EscrowEntity escrowEntity = new EscrowEntity();
        escrowEntity.setGstReciever(obj.getGstReciever());
        escrowEntity.setGstSender(obj.getGstSender());
        escrowEntity.setAmount(obj.getAmount());
        escrowEntity.setFullFillmentStage(obj.getFullFillmentStage());

        Escrow escrow = jsonMapper.convertValue(escrowEntity, Escrow.class);

//        EscrowRepository escrowRepository = new EscrowRepository(){}
        return escrow;
    }

}
