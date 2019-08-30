package br.eti.urbano.mobile.exemploretrofit2.resource;

import java.util.List;

import br.eti.urbano.mobile.exemploretrofit2.model.Users;
import retrofit2.Call;
import retrofit2.http.GET;

public interface PostResource {

    @GET("/users")
    Call<List<Users>> get();

    @GET("/users/{id}")
    Call<Users> get(Integer id);
}