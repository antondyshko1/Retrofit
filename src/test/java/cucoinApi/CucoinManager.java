package cucoinApi;

import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

public class CucoinManager {
    public static final String BASE_URL = "https://api.kucoin.com";
    private static Retrofit retrofit = null;
    static Retrofit getManager(){
        retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(JacksonConverterFactory.create())
                .build();
        return retrofit;
    }
}
