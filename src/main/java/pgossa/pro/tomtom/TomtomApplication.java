package pgossa.pro.tomtom;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// Controller to return basic info
@RestController
public class TomtomApplication {
   @Value("${app.version}")
   private String version;

  @RequestMapping(value = "version")
   public String version() {
      return version;
   }

}
