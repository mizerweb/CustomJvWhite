package defpackage;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class xr3 {
    public static final xr3 c = new xr3();
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();

    public static void c(HashMap map, wr3 wr3Var, m09 m09Var, Class cls) {
        m09 m09Var2 = (m09) map.get(wr3Var);
        if (m09Var2 == null || m09Var == m09Var2) {
            if (m09Var2 == null) {
                map.put(wr3Var, m09Var);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + wr3Var.b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + m09Var2 + ", new value " + m09Var);
    }

    public final vr3 a(Class cls, Method[] methodArr) {
        int i;
        Class superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        HashMap map2 = this.a;
        if (superclass != null) {
            vr3 vr3VarA = (vr3) map2.get(superclass);
            if (vr3VarA == null) {
                vr3VarA = a(superclass, null);
            }
            map.putAll(vr3VarA.b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            vr3 vr3VarA2 = (vr3) map2.get(cls2);
            if (vr3VarA2 == null) {
                vr3VarA2 = a(cls2, null);
            }
            for (Map.Entry entry : vr3VarA2.b.entrySet()) {
                c(map, (wr3) entry.getKey(), (m09) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
            }
        }
        boolean z = false;
        for (Method method : methodArr) {
            utb utbVar = (utb) method.getAnnotation(utb.class);
            if (utbVar != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else {
                    if (!g19.class.isAssignableFrom(parameterTypes[0])) {
                        ore.p("invalid parameter type. Must be one and instanceof LifecycleOwner");
                        return null;
                    }
                    i = 1;
                }
                m09 m09VarValue = utbVar.value();
                if (parameterTypes.length > 1) {
                    if (!m09.class.isAssignableFrom(parameterTypes[1])) {
                        ore.p("invalid parameter type. second arg must be an event");
                        return null;
                    }
                    if (m09VarValue != m09.ON_ANY) {
                        ore.p("Second arg is supported only for ON_ANY value");
                        return null;
                    }
                    i = 2;
                }
                if (parameterTypes.length > 2) {
                    ore.p("cannot have more than 2 params");
                    return null;
                }
                c(map, new wr3(i, method), m09VarValue, cls);
                z = true;
            }
        }
        vr3 vr3Var = new vr3(map);
        map2.put(cls, vr3Var);
        this.b.put(cls, Boolean.valueOf(z));
        return vr3Var;
    }

    public final boolean b(Class cls) {
        HashMap map = this.b;
        Boolean bool = (Boolean) map.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            Method[] declaredMethods = cls.getDeclaredMethods();
            for (Method method : declaredMethods) {
                if (((utb) method.getAnnotation(utb.class)) != null) {
                    a(cls, declaredMethods);
                    return true;
                }
            }
            map.put(cls, Boolean.FALSE);
            return false;
        } catch (NoClassDefFoundError e) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
        }
    }
}
