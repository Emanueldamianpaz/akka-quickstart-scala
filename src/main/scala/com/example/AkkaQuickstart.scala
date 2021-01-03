//#full-example
package com.example


import akka.actor.typed.ActorSystem
import com.example.GreeterMain.SayHello


object AkkaQuickstart extends App {

  //#actor-system
  val greeterMain: ActorSystem[GreeterMain.SayHello] = ActorSystem(GreeterMain(), "AkkaQuickStart")
  //#actor-system

  //#main-send-messages
  greeterMain ! SayHello("Charles")
  //#main-send-message s

}
