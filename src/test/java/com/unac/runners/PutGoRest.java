package com.unac.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        glue = "com.unac.stepsdefinitions",
        features = "src/test/resources/com/unac/features/put_go_rest.feature",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class PutGoRest {
}
