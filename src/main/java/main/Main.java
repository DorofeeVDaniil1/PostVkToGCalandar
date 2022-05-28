package main;

import regexText.GetValue;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import services.VkService;

import java.util.*;


public class Main extends Configuration{

//    public static final String TOKEN_ACCES = "c68103b8c68103b8c68103b813c6fd5d56cc681c68103b8a4e9e5919b0323ddaffd35e2";//API ключ
//    public static final String API_VK = "https://api.vk.com/";//Ссылка API
//    public static final String OWNER_ID = "-46864386";//ID паблика
//    public static final String COUT = "5";//Количетсво объявлений
//    public static final String API_VERSION = "5.131";//Версия API
//
//    //Какое слово должно быть
//    public static final String QUERY = "Этапы";
//
//
//    //Regex с обработкой специальных постов
//    //public static final String REGEX_STRING = "\\*\\d{2}\\.\\d{2}\\.\\d{4}\\*";
//    public static final String REGEX_STRING = "\\*\\d{2}\\.\\d{2}\\.\\d{4}\\*";

    //Массив строк для постов
    public static  ArrayList<String> RESPONSE = new ArrayList<>();
    public static String[] StringResponse;


    public static void main(String[] args) {
        //Объявляем retrofit создаем его
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(getApiVk())
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        //Объявление класса обертки
        VkService vkService = retrofit.create(VkService.class);
        Call<VkInfo> call = vkService.getresponse(getOwnerId(),getQUERY(),"0", getCOUT(),"0","0",getApiVersion(),getTokenAcces());
        //Подключение к API и вывод
        call.enqueue(new VkCallBack());


    }

    public static class VkCallBack implements Callback<VkInfo> {

        @Override
        public void onResponse(Call<VkInfo> call, Response<VkInfo> response) {
            if (response.isSuccessful()){
                if (response.body() !=null){
                    for (int i = 0; i <Integer.parseInt(getCOUT()) ; i++) {
                        if (response.body().response.items[i].text==null){
                            break;
                        }else {
                            String jsonresponse = response.body().response.items[i].text;
                            //Добавляем посты в массив
                            RESPONSE.add(jsonresponse);
                        }
                        String[] stringArray = RESPONSE.toArray(new String[RESPONSE.size()]);
                        StringResponse=stringArray;
                        //Вывод массива постов
                        System.out.println(Arrays.toString(stringArray));
//                    GetValue.sblitArray(stringArray);
                        GetValue.getData(StringResponse);
                        System.out.println(GetValue.DATE_RESULT);
                        System.out.println(GetValue.TIME_RESULT);
                        System.out.println(GetValue.TITLE_RESULT);
                        System.out.println(GetValue.DESC_RESULT);
                        System.out.println(GetValue.PLACE_RESULT);

                    }
                    //приводим массив стрингов



                } else {
                    System.out.println("not Success");
                }
            }


        }

        @Override
        public void onFailure(Call<VkInfo> call, Throwable throwable) {
            System.out.println("Ошибка!!");
        }
    }


}
