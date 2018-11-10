import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.util.List;

public class Metodos {
    //RETORNA LISTA
    public void getAll() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://ec2-35-166-113-35.us-west-2.compute.amazonaws.com/api/")

                .addConverterFactory(GsonConverterFactory.create())
                .build();

        TesteApi api = retrofit.create(TesteApi.class);


        try {
            Call<List<Tarefas>> call = api.getTarefas();

            Response<List<Tarefas>> r = call.execute();

            List<Tarefas> t = r.body();

            System.out.println(t);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //CADASTRAR
    public void cadastrarTarefa() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://ec2-35-166-113-35.us-west-2.compute.amazonaws.com/api/")

                .addConverterFactory(GsonConverterFactory.create())
                .build();

        TesteApi api = retrofit.create(TesteApi.class);


        try {

            Tarefas tarefas = new Tarefas();
            tarefas.setDescription("estudar");
            tarefas.setDone(false);

            Call<Tarefas> call = api.postTarefas(tarefas);

            Response<Tarefas> r = call.execute();

            Tarefas t = r.body();

            System.out.println(t);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //GET PELO ID
    public void getTarefaId() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://ec2-35-166-113-35.us-west-2.compute.amazonaws.com/api/")

                .addConverterFactory(GsonConverterFactory.create())
                .build();

        TesteApi api = retrofit.create(TesteApi.class);
        try {
            Call<Tarefas> call = api.getTarefaId(1306);

            Response<Tarefas> r = call.execute();

            Tarefas t = r.body();

            System.out.println(t);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //DELETE
    public void delete() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://ec2-35-166-113-35.us-west-2.compute.amazonaws.com/api/")

                .addConverterFactory(GsonConverterFactory.create())
                .build();
        TesteApi api = retrofit.create(TesteApi.class);

        try {
            int id2 = 1415;

            Call<Void> call = api.delete(id2);
            Response<Void> r = call.execute();
            r.isSuccessful();
            if (r.isSuccessful()) {
                System.out.println("Tarefa " + id2 + " excluida");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    //UPDATE
    public void update() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://ec2-35-166-113-35.us-west-2.compute.amazonaws.com/api/")

                .addConverterFactory(GsonConverterFactory.create())
                .build();

        TesteApi api = retrofit.create(TesteApi.class);
        try {

            Tarefas tarefas = new Tarefas();
            tarefas.setId(1348);
            tarefas.setDescription("Update");
            tarefas.setDone(true);

            Call<Void> call = api.update(tarefas.getId(), tarefas);

            Response<Void> r = call.execute();
            r.isSuccessful();
            if (r.isSuccessful()) {
                System.out.println("Tarefa atualizada");
            } else {
                System.out.println("Tarefa não localizada");
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}



