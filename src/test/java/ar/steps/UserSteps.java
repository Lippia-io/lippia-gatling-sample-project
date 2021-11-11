package ar.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.*;
import simulations.Ejecutor;


public class UserSteps extends PageSteps {

    @When("envio de {int} usuario a {int} durante {int} segundos")
    public void envioDeUsuarioADuranteSegundos(int arg0, int arg1, int arg2) {

    }

    @And("envio {int} usuarios durante {int} segundos")
    public void envioUsuariosDuranteSegundos(int arg0, int arg1) {
        Ejecutor.test().cargaConstante(arg0,arg1);
    }

    @And("envio de {int} usuarios a {int} durante {int} segundos")
    public void envioDeUsuariosADuranteSegundos(int arg0, int arg1, int arg2) {
        //Ejecutor.test().disminuirCarga(arg0,arg1,arg2);
    }

    @And("se espera la respuesta {int}")
    public void seEsperaLaRespuesta(int arg0) {
    }

    @And("envio {int} usuarios")
    public void envioUsuarios(int arg0) {
    }
}
