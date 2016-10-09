package tech.eats.art.namebot;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by John on 9/26/16.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.CLASS)
public @interface NameCheck {
}
