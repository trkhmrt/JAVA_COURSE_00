package com.ael._0_spring_rest_api.controller;


import com.ael._0_spring_rest_api.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import static org.yaml.snakeyaml.nodes.Tag.STR;

@RestController
@RequestMapping("/api")
public class FirstEndpoint {
    /*
    * GetMapping(Veri okuma) , PostMapping(Data iletmek için) , PUT(Tüm kaydı güncellemek için kullanır) , PATCH (Belirli bir alan güncellenecekse) , Delete(Silmek için)
    *
    * HTTP RESPONSE STATUS CODES
    * 200 ok -> istek başarılı
    * 405 method not allowed -> Endpoint metoduyla istek atılan metod aynı değilse bu hata verir.
    * 500 internal server error -> endpoint'e istek atıldığında handle edilmeyen bir hata varsa bu başarısızlıkla sonuçlanır ve
    *
    *
    * @RequestBody -> Bodyde Gönderilen nesneyi yakalamak için kullanılır.
    * @PathVariable -> Kimi/neyi istediğini belirtirsin  Path üzerinde bir data varsa Pathdeki değişken ismi ve metottaki parametre ismi aynı isimle olamak şartıyla yakalanır.
    * @REquestParam -> Kimi/neyi nasıl istediğini belirtrisin path üzerinden filtreleme yapmak için kullanılır.
    *
    * ÖDEV
    *
    * GET VE POST MAPPİNG
    *
    * 3 adet endpoint oluşturmanızı istiyorum
    * 2 GET 1 POST
    *
    * 1.GET
    * path'e istek atıldığında string return yapılacak.(Mesaj içeriği size kalmış)
    * 2.GET
    *   - Path variable + RequestParam kullanılacak.
    *   - Path variable'la gelen id değeri ve request paramla gönderilen filtre değeri varsa ekrana yazdırılacak.(Hikayeye göre kurgularsınız.)
    * 3.POST
    *   - Postmanden Gönderilen nesneyi kabul edip.En azından 1/2 fieldını(isim soyisim gibi) returnleyin.
    *
    * */
    @GetMapping("/firstRequest")
    public String firstRequestMethod(){
        return "Merhaba Bu bizim ilk endpointimiz :)";
    }

    @GetMapping("/student/{id}/{isim}")
    public String studentInfo(@PathVariable Integer id,@PathVariable String isim){
        return String.format("Öğrenci adı:%s id:%d",isim,id);
        //return STR."Öğrenci adı:\{isim} id:\{id}";
    }

    @GetMapping("/studentFilter/{id}")
    public String studentFilter(@PathVariable Integer id, @RequestParam(required = false,defaultValue = "0") Integer yas,@RequestParam(required = false) boolean status){
        return String.format("Öğrenci id:%d",id);
        //return STR."Öğrenci adı:\{isim} id:\{id}";
    }

    @PostMapping("/firstPostRequest")
    public String firstPostRequest(){
        //int sayi = 10/0;
        return "Post Mapping Tetiklendi";
    }

    @PostMapping("/sendStudent")
    public String sendStudent(@RequestBody Student student){
        return "Öğrenci başarıyla kaydedildi";
    }










}
