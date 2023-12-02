package pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component

public class OnePlus {
	@Autowired
	@Qualifier("MediaTek")
	Processor cpu;
	
	public void config() {
		System.out.println("12Gb Ram, SnapDragon 865");
		cpu.getProcessor();
	}
	
}
