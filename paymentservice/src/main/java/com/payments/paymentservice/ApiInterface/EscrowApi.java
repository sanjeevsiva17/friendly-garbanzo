package com.payments.paymentservice.ApiInterface;

import com.payments.paymentservice.models.Escrow;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.Url;

public interface EscrowApi {
    @POST()
    Call<Escrow> createEscrow(@Url String url, @Body Escrow escrow);

}
