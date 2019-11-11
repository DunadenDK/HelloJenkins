

import org.junit.Test;
import pages.authorization.HomePage;
import pages.templates.DraftLetterTemplatePage;


public class test extends CommonConditions{



    @Test()

        public void loginToMailbox() throws InterruptedException {

            new HomePage()
                    .userEnterCredentials()
                    .openTemplateForWritingNewLetter()
                    .fillInLetterFields()
                    .closeLetterWithoutSaving()
                    .goToDraftsPage()
                    .openDraftLetter()
                    .sendLetter()
                    .goToSentMailFolder()
                    .openSentLetter()
                    .getLetterSubject();

 
        }

    }





