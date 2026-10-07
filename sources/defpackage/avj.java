package defpackage;

import android.graphics.Typeface;
import android.util.Log;
import android.util.SparseArray;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public abstract class avj {
    public static final Field a;
    public static final Method b;
    public static final Method c;
    public static final Constructor d;
    public static final vi9 e;
    public static final Object f;

    static {
        Field declaredField;
        Constructor declaredConstructor;
        Method declaredMethod;
        Method declaredMethod2;
        try {
            declaredField = Typeface.class.getDeclaredField("native_instance");
            Class cls = Long.TYPE;
            Class cls2 = Integer.TYPE;
            declaredMethod = Typeface.class.getDeclaredMethod("nativeCreateFromTypeface", cls, cls2);
            declaredMethod.setAccessible(true);
            declaredMethod2 = Typeface.class.getDeclaredMethod("nativeCreateWeightAlias", cls, cls2);
            declaredMethod2.setAccessible(true);
            declaredConstructor = Typeface.class.getDeclaredConstructor(cls);
            declaredConstructor.setAccessible(true);
        } catch (NoSuchFieldException | NoSuchMethodException e2) {
            Log.e("WeightTypeface", e2.getClass().getName(), e2);
            declaredField = null;
            declaredConstructor = null;
            declaredMethod = null;
            declaredMethod2 = null;
        }
        a = declaredField;
        b = declaredMethod;
        c = declaredMethod2;
        d = declaredConstructor;
        e = new vi9(3);
        f = new Object();
    }

    public static Typeface a(long j) {
        try {
            return (Typeface) d.newInstance(Long.valueOf(j));
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
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
    public static Typeface b(Typeface typeface, int i) {
        Typeface typefaceA;
        Field field = a;
        if (field == null) {
            return null;
        }
        int i2 = i << 1;
        synchronized (f) {
            try {
                try {
                    long j = field.getLong(typeface);
                    vi9 vi9Var = e;
                    SparseArray sparseArray = (SparseArray) vi9Var.b(j);
                    if (sparseArray == null) {
                        sparseArray = new SparseArray(4);
                        vi9Var.f(j, sparseArray);
                    } else {
                        Typeface typeface2 = (Typeface) sparseArray.get(i2);
                        if (typeface2 != null) {
                            return typeface2;
                        }
                    }
                    if (typeface.isItalic()) {
                        typefaceA = a(c(i, j));
                    } else {
                        try {
                            typefaceA = a(((Long) c.invoke(null, Long.valueOf(j), Integer.valueOf(i))).longValue());
                        } catch (IllegalAccessException e2) {
                            throw new RuntimeException(e2);
                        } catch (InvocationTargetException e3) {
                            throw new RuntimeException(e3);
                        }
                    }
                    sparseArray.put(i2, typefaceA);
                    return typefaceA;
                } catch (IllegalAccessException e4) {
                    throw new RuntimeException(e4);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static long c(int i, long j) {
        try {
            Long l = (Long) b.invoke(null, Long.valueOf(j), 0);
            l.getClass();
            return ((Long) c.invoke(null, l, Integer.valueOf(i))).longValue();
        } catch (IllegalAccessException e2) {
            qr7.o(e2);
            return 0L;
        } catch (InvocationTargetException e3) {
            qr7.o(e3);
            return 0L;
        }
    }
}
