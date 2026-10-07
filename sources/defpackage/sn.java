package defpackage;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class sn {
    public static final ConcurrentHashMap a = new ConcurrentHashMap();
    public static final ConcurrentHashMap b = new ConcurrentHashMap();

    public static void a(Class cls, HashMap map, HashMap map2) {
        for (Method method : cls.getDeclaredMethods()) {
            if (!method.isBridge()) {
                if (method.isAnnotationPresent(l7h.class)) {
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    if (parameterTypes.length != 1) {
                        StringBuilder sb = new StringBuilder("Method ");
                        sb.append(method);
                        sb.append(" has @Subscribe annotation but requires ");
                        ore.p(zo5.t(sb, parameterTypes.length, " arguments.  Methods must require a single argument."));
                        return;
                    }
                    Class<?> cls2 = parameterTypes[0];
                    if (cls2.isInterface()) {
                        c.l("Method ", method, " has @Subscribe annotation on ", cls2, " which is an interface.  Subscription must be on a concrete class type.");
                        return;
                    }
                    if ((1 & method.getModifiers()) == 0) {
                        c.l("Method ", method, " has @Subscribe annotation on ", cls2, " but is not 'public'.");
                        return;
                    }
                    Set hashSet = (Set) map2.get(cls2);
                    if (hashSet == null) {
                        hashSet = new HashSet();
                        map2.put(cls2, hashSet);
                    }
                    hashSet.add(method);
                } else if (method.isAnnotationPresent(kjd.class)) {
                    Class<?>[] parameterTypes2 = method.getParameterTypes();
                    if (parameterTypes2.length != 0) {
                        StringBuilder sb2 = new StringBuilder("Method ");
                        sb2.append(method);
                        sb2.append("has @Produce annotation but requires ");
                        ore.p(zo5.t(sb2, parameterTypes2.length, " arguments.  Methods must require zero arguments."));
                        return;
                    }
                    if (method.getReturnType() == Void.class) {
                        qr7.i(method, " has a return type of void.  Must declare a non-void type.", "Method ");
                        return;
                    }
                    Class<?> returnType = method.getReturnType();
                    if (returnType.isInterface()) {
                        c.l("Method ", method, " has @Produce annotation on ", returnType, " which is an interface.  Producers must return a concrete class type.");
                        return;
                    }
                    if (returnType.equals(Void.TYPE)) {
                        qr7.i(method, " has @Produce annotation but has no return type.", "Method ");
                        return;
                    } else if ((1 & method.getModifiers()) == 0) {
                        c.l("Method ", method, " has @Produce annotation on ", returnType, " but is not 'public'.");
                        return;
                    } else {
                        if (map.containsKey(returnType)) {
                            qr7.i(returnType, " has already been registered.", "Producer for type ");
                            return;
                        }
                        map.put(returnType, method);
                    }
                } else {
                    continue;
                }
            }
        }
        a.put(cls, map);
        b.put(cls, map2);
    }
}
