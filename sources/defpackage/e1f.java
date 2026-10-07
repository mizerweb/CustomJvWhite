package defpackage;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class e1f {
    public static final List a = xw3.P0(Application.class, v0f.class);
    public static final List b = Collections.singletonList(v0f.class);

    public static final Constructor a(Class cls, List list) {
        for (Constructor<?> constructor : cls.getConstructors()) {
            List listN1 = a.n1(constructor.getParameterTypes());
            if (list.equals(listN1)) {
                return constructor;
            }
            if (list.size() == listN1.size() && listN1.containsAll(list)) {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
            }
        }
        return null;
    }

    public static final b8j b(Class cls, Constructor constructor, Object... objArr) {
        try {
            return (b8j) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e) {
            ahc.j("Failed to access ", cls, e);
            return null;
        } catch (InstantiationException e2) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e2);
        } catch (InvocationTargetException e3) {
            ore.h("An exception happened in constructor of " + cls, e3.getCause());
            return null;
        }
    }
}
