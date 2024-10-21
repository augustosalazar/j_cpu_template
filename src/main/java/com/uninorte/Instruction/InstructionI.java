package com.uninorte.Instruction;

 public class InstructionI extends Instruction{
    protected  int idOp1;
    protected  int constant;
    protected  int idRta;

    public InstructionI(int opcode) {
        super(opcode);

    }    

    public int getIdOp1() {
        return idOp1;
    }

    public int getConstant() {
        return constant;
    }

    public int getIdRta() {
        return idRta;
    }
}
