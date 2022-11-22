package com.example.Dayeza;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
public class RegisterTest {
    Register register;
    @Before
    public void setUp(){
        register = new Register();
    }
    @Test
    public void resgistro(){
        String result = register.registro("Daniel", "Rodriguez","daniel@gmail.com","102024L");
        assertEquals("Registrado con Exito", result);
    }
    @Test
    public void registroNombreVacio(){
        String result = register.registro("","Condori","camila@gail.com","102024L");
        assertEquals("Nombre No Valido", result);
    }
    @Test
    public void registroApellidoVacio(){
        String result = register.registro("Camila","","camila@gail.com","5678102L");
        assertEquals("Apellido No Valido", result);
    }
    @Test
    public void registroEmailVacio(){
        String result = register.registro("Camila","Condori","","5678102L");
        assertEquals("Email No Valido", result);
    }
    @Test
    public void registroContraseñaVacio(){
        String result = register.registro("Camila","Condori","camila@gail.com","");
        assertEquals("Contraseña No Valida", result);
    }
    @Test
    public void esSeguroValido(){
        Register register = new Register();
        boolean result = register.esSeguro("19DF023L");
        assertEquals(true, result);
    }
    @Test
    public void esSeguroNoValido(){
        Register register = new Register();
        boolean result = register.esSeguro("HAPLLIS");
        assertEquals(false, result);
    }
}