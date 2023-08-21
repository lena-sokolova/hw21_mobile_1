package tests;

import io.appium.java_client.AppiumBy;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;

public class IosTests extends TestBase {

    @Test
    @Tag("ios")
    @DisplayName("Sample test")
    public void sampleTest() {
        step("Alert button click", () ->
                $(AppiumBy.accessibilityId("Alert Button")).click()
        );
        step("Verify open alert", () ->
                $(AppiumBy.className("UIAAlert")).shouldHave(text("Alert"))
        );
    }
}