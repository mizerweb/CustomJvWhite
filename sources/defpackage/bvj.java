package defpackage;

import android.graphics.Typeface;
import android.util.Log;
import android.util.SparseArray;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public abstract class bvj {
    public static final Field a;
    public static final Method b;
    public static final Constructor c;
    public static final vi9 d;
    public static final Object e;

    static {
        Field declaredField;
        Constructor declaredConstructor;
        Method declaredMethod;
        try {
            declaredField = Typeface.class.getDeclaredField("native_instance");
            Class cls = Long.TYPE;
            declaredMethod = Typeface.class.getDeclaredMethod("nativeCreateFromTypefaceWithExactStyle", cls, Integer.TYPE, Boolean.TYPE);
            declaredMethod.setAccessible(true);
            declaredConstructor = Typeface.class.getDeclaredConstructor(cls);
            declaredConstructor.setAccessible(true);
        } catch (NoSuchFieldException | NoSuchMethodException e2) {
            Log.e("WeightTypeface", e2.getClass().getName(), e2);
            declaredField = null;
            declaredConstructor = null;
            declaredMethod = null;
        }
        a = declaredField;
        b = declaredMethod;
        c = declaredConstructor;
        d = new vi9(3);
        e = new Object();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static Typeface a(Typeface typeface, int i) {
        Field field = a;
        Typeface typeface2 = null;
        if (field == null) {
            return null;
        }
        int i2 = i << 1;
        synchronized (e) {
            try {
                try {
                    long j = field.getLong(typeface);
                    vi9 vi9Var = d;
                    SparseArray sparseArray = (SparseArray) vi9Var.b(j);
                    if (sparseArray == null) {
                        sparseArray = new SparseArray(4);
                        vi9Var.f(j, sparseArray);
                    } else {
                        Typeface typeface3 = (Typeface) sparseArray.get(i2);
                        if (typeface3 != null) {
                            return typeface3;
                        }
                    }
                    try {
                        try {
                            Long l = (Long) b.invoke(null, Long.valueOf(j), Integer.valueOf(i), Boolean.FALSE);
                            l.getClass();
                            try {
                                typeface2 = (Typeface) c.newInstance(l);
                            } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                            }
                            sparseArray.put(i2, typeface2);
                            return typeface2;
                        } catch (InvocationTargetException e2) {
                            throw new RuntimeException(e2);
                        }
                    } catch (IllegalAccessException e3) {
                        throw new RuntimeException(e3);
                    }
                } catch (IllegalAccessException e4) {
                    throw new RuntimeException(e4);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
