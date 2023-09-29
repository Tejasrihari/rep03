package group4;

import org.junit.runner.RunWith;
import org.mozilla.javascript.Scriptable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import com.vilt.minium.DefaultWebElementsDriver;
import com.vilt.minium.script.jasmine.JasmineSuite;
import com.vilt.minium.script.jasmine.MiniumJasmine;
import com.vilt.minium.script.test.JsVariable;

@RunWith(MiniumJasmine.class)
@JasmineSuite(specs = "group4/kingmaker_spec.js", envJs = false)
@ContextConfiguration(classes = TestConfig.class)
public class rotta {

    @Autowired
    @JsVariable("wd")
    private DefaultWebElementsDriver wd;

    @JsVariable(value = "config", resourceBean = "configFile")
    private Scriptable config;

}