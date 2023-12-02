package pojo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Snapdragon implements Processor{

	public void getProcessor() {
		System.out.println("SnapDragon In Action Rawrrr.......");
		
	}
	

}
