package tech.eats.art.namebot;

import com.google.auto.service.AutoService;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.ProcessingEnvironment;
import javax.annotation.processing.Processor;
import javax.annotation.processing.RoundEnvironment;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.TypeElement;
import javax.tools.Diagnostic;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created by John on 10/9/16.
 */

@AutoService(Processor.class)
public class NameProcessor extends AbstractProcessor {


    @Override
    public SourceVersion getSupportedSourceVersion() {
        return super.getSupportedSourceVersion();
    }

    @Override
    public Set<String> getSupportedAnnotationTypes() {
        return Collections.singleton(tech.eats.art.namebot.NameCheck.class.getName());
    }

    @Override
    public synchronized void init(ProcessingEnvironment processingEnv) {
        processingEnv.getMessager().printMessage(Diagnostic.Kind.WARNING,"Hello from the processor!");
        super.init(processingEnv);
    }

    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {

        try {

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
