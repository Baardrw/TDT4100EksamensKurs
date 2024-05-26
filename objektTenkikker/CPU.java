package objektTenkikker;

public class CPU {
    

    public CPU(int coreCount) {
        
    }

    public void addProgram(Program program) {
        
    }

    public void runPrograms(){
    
    }

    public static void main(String[] args) {
        CPU cpu = new CPU(4);

        Program program1 = new Program();
        Program program2 = new Program();
        Program program3 = new Program();

        cpu.addProgram(program1);
        cpu.addProgram(program2);
        cpu.addProgram(program3);

        cpu.runPrograms();
    }

}
