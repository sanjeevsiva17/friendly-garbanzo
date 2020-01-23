package com.payments.paymentservice.services;

import com.payments.paymentservice.ApiInterface.EscrowApi;
import com.payments.paymentservice.models.Escrow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import retrofit2.Call;
import retrofit2.GsonConverterFactory;
import retrofit2.Response;
import retrofit2.Retrofit;

import java.io.IOException;

import static com.payments.paymentservice.ApiConfigurations.ApiConfigurations.ESCROW;

@Service
public class SenderService {
    private EscrowApi es;

    @Autowired
    public SenderService() {
        Retrofit retrofit = new Retrofit.Builder().
                baseUrl(ESCROW)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        this.es = retrofit.create(EscrowApi.class);

    }

    public Escrow postAmount(Escrow escrow) throws IOException {
        if (escrow != null) {
            Call<Escrow> retrofitCall = es.createEscrow(ESCROW + "/create", escrow);
            Response<Escrow> response = retrofitCall.execute();
            return response.body();
        } else {
            return null;
        }
    }
}
