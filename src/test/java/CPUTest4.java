import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.uninorte.CPU;
import com.uninorte.Instruction.Add;
import com.uninorte.Instruction.AddI;

public class CPUTest4 {
    
    @Test
    public void testLoadInstruction() {
        CPU cpu = new CPU();
        // this loads an instruction that adds 20 to register 0 and stores the result in register 0
        // the instruction should be loaded in the instruction memory with position 0        
        cpu.loadInstruction(new AddI(0, 20, 0));
        cpu.loadInstruction(new AddI(1, 30, 1));
        cpu.loadInstruction(new Add(0, 1, 2));
        assertEquals(3, cpu.getNumberOfInstructions());
    }

    @Test
    public void testExecuteSingleInstruction() {
        CPU cpu = new CPU();
        cpu.loadInstruction(new AddI(0, 20, 0));
        // this executes the instruction with position 0
        cpu.executeInstuction(0);
        assertEquals(20, cpu.getValueOfRegister(0));
    }

    @Test
    public void testExecuteAllInstructions() {
        CPU cpu = new CPU();
        cpu.loadInstruction(new AddI(0, 20, 0));
        // this executes all the instructions in the instruction memory
        cpu.executeAllInstructions();
        assertEquals(20, cpu.getValueOfRegister(0));
    }    

    @Test
    public void testExecuteMultipleAddi() {
        CPU cpu = new CPU();
        // this loads an instruction that adds 20 to register 0 and stores the result in register 0
        // the instruction should be loaded in the instruction memory with position 0
        cpu.loadInstruction(new AddI(0, 20, 0));
        // this executes the instruction with position 0
        cpu.executeInstuction(0);
        assertEquals(20, cpu.getValueOfRegister(0));
        cpu.loadInstruction(new AddI(0, 20, 1));
        cpu.executeInstuction(1);
        assertEquals(40, cpu.getValueOfRegister(1));
    }

    @Test
    public void testCompleteLogic() {
        CPU cpu = new CPU();
        cpu.loadInstruction(new AddI(0, 20, 0));
        cpu.loadInstruction(new AddI(1, 30, 1));
        cpu.loadInstruction(new Add(0, 1, 2));
        cpu.executeAllInstructions();
        assertEquals(20, cpu.getValueOfRegister(0));
        assertEquals(30, cpu.getValueOfRegister(1));
        assertEquals(50, cpu.getValueOfRegister(2));
    }



}
