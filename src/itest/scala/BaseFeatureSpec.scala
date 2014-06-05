import org.scalatest.{GivenWhenThen, FeatureSpec}

class BaseFeatureSpec extends FeatureSpec with GivenWhenThen {

    info("As an owner of a bank account I can download csv files with")

    feature("Read account data from csv files and export those as reports") {

        info("blub")

        scenario("read an illegal csv file") {
            Given("plain system")

            When("loading csv file with illegal content")

            Then("some exception should be thrown")

        }

        info("blub")

        scenario("read an legal csv") {
            Given("some precondition")

            When("I do something")

            Then("Some final condition")

        }

    }

}
