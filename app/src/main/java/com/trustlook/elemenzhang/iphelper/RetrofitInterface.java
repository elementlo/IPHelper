package com.trustlook.elemenzhang.iphelper;

import java.util.List;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * Created by elemenzhang on 2017/6/7.
 */

public class RetrofitInterface {
    public interface IPWebService{
        @POST("v3/ip")
        Call<String> getString(@Query("key")String key);
    }
}
