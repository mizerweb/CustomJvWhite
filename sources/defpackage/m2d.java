package defpackage;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public abstract class m2d {
    public static final Method a;
    public static final Method b;

    static {
        Method method;
        Method method2;
        Method[] methods = Throwable.class.getMethods();
        int length = methods.length;
        int i = 0;
        while (true) {
            method = null;
            if (i >= length) {
                method2 = null;
                break;
            }
            method2 = methods[i];
            if (cqk.d(method2.getName(), "addSuppressed")) {
                Class<?>[] parameterTypes = method2.getParameterTypes();
                if (cqk.d(parameterTypes.length == 1 ? parameterTypes[0] : null, Throwable.class)) {
                    break;
                }
            }
            i++;
        }
        a = method2;
        for (Method method3 : methods) {
            if (cqk.d(method3.getName(), "getSuppressed")) {
                method = method3;
                break;
            }
        }
        b = method;
    }
}
