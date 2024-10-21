import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.uninorte.ALU;

// NO EDITAR ESTA CLASE

public class ALUTest1 {
    
    @Test
    public void testAdd() {
        ALU alu = new ALU();
        assertEquals(2, alu.operate(0, 1, 1));
    }

    @Test
    public void testSub() {
        ALU alu = new ALU();
        assertEquals(1, alu.operate(1, 2, 1));
    }

    @Test
    public void testAddi() {
        ALU alu = new ALU();
        assertEquals(2, alu.operate(2, 1, 1));
    }

    @Test
    public void testSubi() {
        ALU alu = new ALU();
        assertEquals(1, alu.operate(3, 2, 1));
    }
    
}
