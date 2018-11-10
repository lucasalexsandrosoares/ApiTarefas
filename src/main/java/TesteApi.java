import retrofit2.Call;
import retrofit2.http.*;


import java.util.List;

public interface TesteApi {

    @Headers("Student:1144002290")
    @GET("tasks")
    Call<List<Tarefas>> getTarefas();

    @Headers("Student:1144002290")
    @POST("tasks")
    Call<Tarefas> postTarefas(@Body Tarefas tarefas);

    @Headers("Student:1144002290")
    @GET("tasks/{id}")
    Call<Tarefas> getTarefaId(@Path("id") int id);

    @Headers("Student:1144002290")
    @PUT("tasks/{id}")
    Call<Void> update(@Path("id") int id, @Body Tarefas description);

    @Headers("Student:1144002290")
    @DELETE("tasks/{id}")
    Call<Void> delete(@Path("id") int id);



}
