package pgossa.pro.tomtom.controllers.duck;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pgossa.pro.tomtom.services.duck.DuckService;
import pgossa.pro.tomtom.services.duck.DuckSuperClass;

// Controller to return ducks

@RestController("TamerSpring")
@RequestMapping(value = "duck")
public class DuckController {
   DuckService duckService = new DuckService(); 
   DuckSuperClass actualDuck;

  @RequestMapping(value = "{duck}/{action}")
   public String Duck(@PathVariable String duck, @PathVariable String action) {

      switch(duck){
         case "decoy":
            setDuck(duckService.decoyDuck);
            break;
         case "redhead":
            setDuck(duckService.redHeadDuck);
            break;
         case "rubber":
            setDuck(duckService.rubberDuck);
            break;
         case "steamer":
            setDuck(duckService.steamerDuck);
            break;
         default:
            return("Duck not found");
      }

      switch(action){
         case "swim":
            return actualDuck.Swim();
         case "fly":
            return actualDuck.PerformFly();
         case "quack":
            return actualDuck.PerformQuack();
         default:
            return("A duck can't do this");
      }
   }
   @RequestMapping(value = "")
   public String ListDucks(){
      return("decoy, redhead, rubber, steamer");
   }

   @RequestMapping(value = "action")
   public String ListActions(){
      return("swim, fly, quack");
   }

   private void setDuck(DuckSuperClass duck){
      this.actualDuck = duck;
   }

}