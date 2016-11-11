package com.fk.javacore.annotation;
import javax.annotation.processing.*;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Element;
import javax.lang.model.element.TypeElement;
import javax.tools.Diagnostic;

import com.google.auto.service.AutoService;

import java.util.Set;

/**
 * Desc:
 * Author:sunguoli@meituan.com
 * Date:15/12/11 下午9:33
 */

@SupportedAnnotationTypes("*")
@SupportedSourceVersion(SourceVersion.RELEASE_8)
@AutoService(Processor.class)
public class NameScannerProcessor extends AbstractProcessor{
    @Override
    public void init(ProcessingEnvironment processingEnv){
        super.init(processingEnv);
    }
    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv){
        if(!roundEnv.processingOver()){
            for(Element element : roundEnv.getElementsAnnotatedWith(NameScanner.class)){
                String name = element.getSimpleName().toString();
                processingEnv.getMessager().printMessage(Diagnostic.Kind.NOTE, "----element name: " + name);
            }
        }
        return false;
    }
}