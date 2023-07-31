// 1 -PACOTE
package apitest;
// 2- BIBLIOTECA
import com.google.gson.Gson;
import entities.AccountEntity;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.core.Is.is;


// 3-CLASSE
public class Account {

    // 3.1- ATRIBUTOS
     String userId;
    // 3.1.2 INSTANCIAR CLASSES EXTERNAS

    Gson gson = new Gson(); // Instancia o objeto de conversão classe para json

    // 3.2- MÉTODOS E FUNÇÕES
    //método #1 - Criar Usuário

    @Test
    public  void testeCreaterUser(){
        //Arrange- Configura
        AccountEntity account = new AccountEntity(); //Instancia a entidade usuario
        account.userName =  "Charlie458"; // entrada e saída (resultado esperado)
        account.password =  "P@ssw0rd1"; // entrada

        String jsonBody = gson.toJson(account); // Converte a entidade  usuario no formato Json


         //Act - Executa

        //Dado - Quando - Então
        //Given - When - Then
         Response  resposta = (Response) given ()  //dado
                .contentType("application/json") //tipo do conteúdo
                .log() .all()                   // registre tudo na ida
                .body(jsonBody)               // corpo da mensagem que será enviada
          .when()  //quando
                .post("https://bookstore.toolsqa.com/Account/v1/User")

        //Assert- Valida
          .then() // Então
                .log() .all()  // registre tudo na volta
                .statusCode (201) // valide a comunicação
                .body("username", is (account.userName))  // valida o usuário
                 .extract()
         ;// fim da linha do REST-assured

        // extrair o userId(identificação do usuario)
        userId = resposta.jsonPath().getString("userID");
        System.out.println("userID extraído: " + userId);


    }  // fim do método de criação de usuário

    public void testGenerateToken(){
        //Configura

        // Executa

        //Valida

    }  //fim do método de geração de token de identificação do Usuário
}

