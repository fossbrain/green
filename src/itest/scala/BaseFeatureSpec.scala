import org.scalatest.{GivenWhenThen, FeatureSpec}

class BaseFeatureSpec extends FeatureSpec with GivenWhenThen {

    info("As a TV set owner")
    info("I want to be able to turn the TV on and off")
    info("So I can watch TV when I want")
    info("And save energy when I'm not watching TV")

    feature("Some cool feature") {
        scenario("lala") {
            Given("some precondition")
            println("given")
            When("I do something")
            println("lalaaaa")
            Then("Some final condition")
            println("adfasdf")
        }

        scenario("lulu") {
            println("before given")
            Given("some precondition")
            println("before when")
            When("I do something")
            println("pre then")
            Then("Some final condition")
            println("finished")
        }
    }

}
