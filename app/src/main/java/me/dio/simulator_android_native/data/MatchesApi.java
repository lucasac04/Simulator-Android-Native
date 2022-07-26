package me.dio.simulator_android_native.data;

import java.util.List;

import me.dio.simulator_android_native.domain.Match;
import retrofit2.Call;
import retrofit2.http.GET;

public interface MatchesApi {

    @GET("matches.json")
    Call<List<Match>> getMatches();
}
