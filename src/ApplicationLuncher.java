import com.domain.*;

public class ApplicationLuncher {
	public static void main(String[] args) {
		
		// We are going to use facade to encapsulate this functionality.
		// start - shutdown
		CPU cpu = new CPU();
	    Memory memory = new Memory();
	    HardDrive hardDrive = new HardDrive();
	    cpu.freeze();
        memory.load(0, hardDrive.read(0, 1024));
        cpu.jump(0);
        cpu.execute();
	
	}
}
