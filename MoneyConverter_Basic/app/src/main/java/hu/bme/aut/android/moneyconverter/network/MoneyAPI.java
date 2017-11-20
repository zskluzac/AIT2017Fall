package hu.bme.aut.android.moneyconverter.network;


import hu.bme.aut.android.moneyconverter.data.MoneyResult;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Peter on 2017. 11. 13..
 */

public interface MoneyAPI {
    @GET("latest")
    Call<MoneyResult> getRatesToUSD(@Query("base") String base);
}