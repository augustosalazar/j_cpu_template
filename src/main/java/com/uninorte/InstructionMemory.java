package com.uninorte;

import java.util.ArrayList;

import com.uninorte.Instruction.Instruction;

public class InstructionMemory {
    private ArrayList<Instruction> instructions;

    public InstructionMemory() {
        this.instructions = new ArrayList<Instruction>();
    }

    public void loadInstruction(Instruction instruction) {
        instructions.add(instruction);
    }

    public Instruction fetch(int position) {
        return instructions.get(position);
    }

    public int getNumberInstructions() {
        return instructions.size();
    }
}
