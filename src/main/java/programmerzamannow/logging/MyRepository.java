package programmerzamannow.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
// belajar mdc
public class MyRepository {

  private static final Logger log = LoggerFactory.getLogger(MyRepository.class);

  public void save(){
    log.info("Repository Save");
  }

}
