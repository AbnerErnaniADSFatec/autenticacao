package model;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
public class UsuarioTeste {
    private static Usuario user = new Usuario();

    @RepeatedTest(3)
    public void autenticarTesteBloqueio(RepetitionInfo repetitionInfo){
        assertNull(user.autenticar("abner","123"));
        if( repetitionInfo.getCurrentRepetition() >= 3 ){
            assertTrue(user.block());
        }
    }
}