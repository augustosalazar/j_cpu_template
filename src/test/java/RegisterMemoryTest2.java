import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import com.uninorte.RegisterMemory;

// NO EDITAR ESTA CLASE

public class RegisterMemoryTest2 {
    @Test
    public void testGetRegister() {
        RegisterMemory registerMemory = new RegisterMemory();
        assertEquals(0, registerMemory.getRegister(0));
    }

    @Test
    public void testSetRegister() {
        RegisterMemory registerMemory = new RegisterMemory();
        registerMemory.setRegister(0, 1);
        assertEquals(1, registerMemory.getRegister(0));
    }
}