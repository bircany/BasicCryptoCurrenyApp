package com.bircanyilmaz.cryptocurrencyapp.service;

import com.bircanyilmaz.cryptocurrencyapp.model.CryptoModel;
import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;


//GET,POST,UPDATE,DELETE
//URL BASE --> www.website.com
//GET -->price?key=xxx
//https://raw.githubusercontent.com/atilsamancioglu/K21-JSONDataSet/master/crypto.json
public interface CryptoAPI {
    @GET("atilsamancioglu/K21-JSONDataSet/master/crypto.json")
    Call<List<CryptoModel>> getData();
}
