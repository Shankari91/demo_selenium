package frames;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FramesTest extends BaseTests {
    @Test
    public void testWisywigEditor(){
        var editorPage = homePage.clickWisywigEditorPage();
        editorPage.clearTextArea();

        String text1 = "hello ";
        String text2 = "world";
        editorPage.setTextArea(text1);
        editorPage.decreaseIndention();
        editorPage.setTextArea(text2);

        assertEquals(editorPage.getTextFromEditor(), text1+text2, "Incorrect display page");
    }
}
