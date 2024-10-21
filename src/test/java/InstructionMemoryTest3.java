import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.uninorte.InstructionMemory;
import com.uninorte.Instruction.AddI;
import com.uninorte.Instruction.Instruction;

// NO EDITAR ESTA CLASE

public class InstructionMemoryTest3 {
    
    @Test
    public void testLoadInstruction() {
        InstructionMemory instructionMemory = new InstructionMemory();
        AddI instruction = new AddI(1, 2, 3);
        instructionMemory.loadInstruction(instruction);
        assertEquals(1, instructionMemory.getNumberInstructions());
    }

    @Test
    public void testFetch() {
        InstructionMemory instructionMemory = new InstructionMemory();
        AddI instruction = new AddI(1, 2, 3);
        instructionMemory.loadInstruction(instruction);
        assertEquals(instruction, instructionMemory.fetch(0));
    }

    @Test
    public void testGetNumberInstructions() {
        InstructionMemory instructionMemory = new InstructionMemory();
        assertEquals(0, instructionMemory.getNumberInstructions());
    }
}
