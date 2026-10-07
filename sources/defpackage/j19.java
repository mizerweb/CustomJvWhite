package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class j19 {
    public static final HashMap a = new HashMap();
    public static final HashMap b = new HashMap();

    public static void a(Constructor constructor, c19 c19Var) {
        try {
            mw7.h(constructor.newInstance(c19Var));
            throw null;
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:60:0x00e5  */
    public static int b(Class cls) {
        Constructor<?> declaredConstructor;
        HashMap map = a;
        Integer num = (Integer) map.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int i = 1;
        if (cls.getCanonicalName() != null) {
            ArrayList arrayList = null;
            try {
                Package r4 = cls.getPackage();
                String canonicalName = cls.getCanonicalName();
                String name = r4 != null ? r4.getName() : "";
                if (name.length() != 0) {
                    canonicalName = canonicalName.substring(name.length() + 1);
                }
                String strConcat = z5h.J0(canonicalName, ".", "_").concat("_LifecycleAdapter");
                if (name.length() != 0) {
                    strConcat = name + '.' + strConcat;
                }
                declaredConstructor = Class.forName(strConcat).getDeclaredConstructor(cls);
                if (!declaredConstructor.isAccessible()) {
                    declaredConstructor.setAccessible(true);
                }
            } catch (ClassNotFoundException unused) {
                declaredConstructor = null;
            } catch (NoSuchMethodException e) {
                qr7.o(e);
                return 0;
            }
            HashMap map2 = b;
            if (declaredConstructor != null) {
                map2.put(cls, Collections.singletonList(declaredConstructor));
            } else if (!xr3.c.b(cls)) {
                Class superclass = cls.getSuperclass();
                if (superclass == null || !c19.class.isAssignableFrom(superclass)) {
                    for (Class<?> cls2 : cls.getInterfaces()) {
                        if (cls2 == null && c19.class.isAssignableFrom(cls2)) {
                            if (b(cls2) != 1) {
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                arrayList.addAll((Collection) map2.get(cls2));
                            }
                        }
                    }
                    if (arrayList != null) {
                        map2.put(cls, arrayList);
                    }
                } else if (b(superclass) != 1) {
                    arrayList = new ArrayList((Collection) map2.get(superclass));
                    while (i < r8) {
                        if (cls2 == null) {
                        }
                    }
                    if (arrayList != null) {
                        map2.put(cls, arrayList);
                    }
                }
            }
            i = 2;
        }
        map.put(cls, Integer.valueOf(i));
        return i;
    }
}
