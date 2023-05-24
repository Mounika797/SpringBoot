package com.in28minutes.spring.learnspringframework.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SuperContraGame implements GamingConsole
{
  public void up()
  {
	  System.out.println("Explode the bomb");
  }
  public void down()
  {
	  System.out.println("Fire the Bullets");
  }
  public void left()
  {
	  System.out.println("go back");
  }
  public void right()
  {
	  System.out.println("accelarate");
  }
}
