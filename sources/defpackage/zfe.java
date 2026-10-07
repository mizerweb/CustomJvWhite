package defpackage;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class zfe {
    public static final age a;

    static {
        age ageVar = null;
        try {
            ageVar = (age) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (ageVar == null) {
            ageVar = new age();
        }
        a = ageVar;
    }

    public static sr3 a(Class cls) {
        a.getClass();
        return new sr3(cls);
    }

    public static void b(dwd dwdVar) {
        a.getClass();
    }

    public static f9i c(Class cls) {
        sr3 sr3VarA = a(cls);
        List list = Collections.EMPTY_LIST;
        a.getClass();
        return new f9i(sr3VarA, list, 0);
    }
}
