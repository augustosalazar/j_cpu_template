package com.uninorte.Instruction;

abstract public class Instruction {
    private int opcode;

    public Instruction(int opcode) {
        this.opcode = opcode;
    }

    public int getOpcode() {
        return opcode;
    }

}
