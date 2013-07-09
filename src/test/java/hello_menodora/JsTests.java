package hello_menodora;

import org.junit.runner.RunWith;
import org.netmelody.menodora.JasmineJavascriptContext;
import org.netmelody.menodora.JasmineSuite;

@RunWith(JasmineSuite.class)
@JasmineJavascriptContext(
        source="src/main/js/*.js",
        jasmineHelpers="src/test/js/*.js",
        jasmineSpecs="src/test/js/*-spec.js",
        withSimulatedDom=false)
public class JsTests { }
