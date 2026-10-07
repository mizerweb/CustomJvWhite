package defpackage;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes4.dex */
@Retention(RetentionPolicy.RUNTIME)
public @interface z45 {
    String c() default "";

    String f() default "";

    int[] l() default {};

    String m() default "";

    int v() default 2;
}
