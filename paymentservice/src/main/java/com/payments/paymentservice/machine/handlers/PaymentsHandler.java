package com.payments.paymentservice.machine.handlers;

import com.payments.paymentservice.machine.config.PaymentEvents;
import com.payments.paymentservice.machine.config.PaymentStates;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.statemachine.action.Action;

@Slf4j
@Configuration
public class PaymentsHandler {
    @Bean
    public Action<PaymentStates, PaymentEvents> enterState(){
        return ctx -> log.info("Changing state :{}", ctx.getTarget().getId());
    }
}
