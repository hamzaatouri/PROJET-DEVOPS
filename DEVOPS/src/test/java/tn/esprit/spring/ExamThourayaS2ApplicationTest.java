package tn.esprit.spring;
import static org.mockito.Mockito.when;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;
import org.junit.Test;



import lombok.extern.slf4j.Slf4j;



@SpringBootTest
@Slf4j
public class ExamThourayaS2ApplicationTest {

@Test
public void testAddTrain()

     {
  
  TrainRepository TR = Mockito.mock(TrainRepository.class);
  Train t = new Train(5L,etat.en_gare,70);
  Mockito.when(TR.save(t)).thenReturn(t);
  assertNotNull(t);
		

      }

}







	
	


