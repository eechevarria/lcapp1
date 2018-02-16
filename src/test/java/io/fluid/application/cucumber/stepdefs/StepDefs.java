package io.fluid.application.cucumber.stepdefs;

import io.fluid.application.Lcapp1App;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = Lcapp1App.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
