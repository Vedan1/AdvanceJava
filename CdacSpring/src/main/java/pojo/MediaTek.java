package pojo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary  //when 2 methods implement same superI/f annotation get confused so this is get

public class MediaTek implements Processor{

	public void getProcessor() {
		System.out.println("MediaTek in Action Jackson");	
		
	}
	

}
