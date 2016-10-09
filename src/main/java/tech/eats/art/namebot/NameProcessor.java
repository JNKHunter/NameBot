package tech.eats.art.namebot;

import com.google.auto.service.AutoService;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.ProcessingEnvironment;
import javax.annotation.processing.Processor;
import javax.annotation.processing.RoundEnvironment;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.TypeElement;
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
    public synchronized void init(ProcessingEnvironment processingEnv) {
        System.out.println("INIT name processor");
        super.init(processingEnv);
    }

    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {

        try {
            System.out.println("Calling process");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
