package stepdefinitions;
import cucumber.api.java.en.Given;
import  cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import model.AcademyChoucairData;
import net.serenitybdd.screenplay.GivenWhenThen;
import  net.serenitybdd.screenplay.actors.OnStage;
import questions.Answer;
import task.Login;
import task.OpenUp;
import task.Search;

import java.util.List;

public class ChoucairAcademyStepDefinitions {
    @Given("^than brandon wants to learn at the academy Choucair$")
    public void thanBrandonWantsToLearnAtTheAcademyChoucair(List<AcademyChoucairData> academyChoucairData) {
        OnStage.theActorCalled( "Brandon").wasAbleTo(OpenUp.thePage(),(Login.onThePage(academyChoucairData.get(0).getStrUser(), academyChoucairData.get(0).getStrPassword())));
    }

    @When("^he search for the course (.*) on the choucair academy platform$")
    public void heSearchForTheCourseRecursosAutomatizacionBancolombiaOnTheChoucairAcademyPlatform(List<AcademyChoucairData> academyChoucairData) {
        OnStage.theActorInTheSpotlight().attemptsTo(Search.the(academyChoucairData.get(0).getStrCourse()));
    }

    @Then("^he finds the course called resources(.*) Automatizacion Bancolombia$")
    public void heFindsTheCourseCalledResourceRecursosAutomatizacionBancolombia(List<AcademyChoucairData> academyChoucairData) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(academyChoucairData.get(0).getStrCourse())));
    }


}
