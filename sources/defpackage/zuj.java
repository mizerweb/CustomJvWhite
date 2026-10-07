package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.Log;
import android.util.SparseArray;
import java.lang.reflect.Field;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zuj {
    public static final Field a;
    public static final vi9 b;
    public static final Object c;

    static {
        Field declaredField;
        try {
            declaredField = Typeface.class.getDeclaredField("native_instance");
            declaredField.setAccessible(true);
        } catch (Exception e) {
            Log.e("WeightTypeface", e.getClass().getName(), e);
            declaredField = null;
        }
        a = declaredField;
        b = new vi9(3);
        c = new Object();
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
    public static Typeface a(i9i i9iVar, Context context, Typeface typeface, int i) {
        Field field = a;
        if (field == null) {
            return null;
        }
        int i2 = i << 1;
        synchronized (c) {
            try {
                try {
                    long jLongValue = ((Number) field.get(typeface)).longValue();
                    vi9 vi9Var = b;
                    SparseArray sparseArray = (SparseArray) vi9Var.b(jLongValue);
                    if (sparseArray == null) {
                        sparseArray = new SparseArray(4);
                        vi9Var.f(jLongValue, sparseArray);
                    } else {
                        Typeface typeface2 = (Typeface) sparseArray.get(i2);
                        if (typeface2 != null) {
                            return typeface2;
                        }
                    }
                    Typeface typefaceB = b(i9iVar, context, typeface, i);
                    if (typefaceB == null) {
                        int i3 = 1;
                        boolean z = i >= 600;
                        if (!z) {
                            i3 = 0;
                        } else if (!z) {
                            i3 = 2;
                        }
                        typefaceB = Typeface.create(typeface, i3);
                    }
                    sparseArray.put(i2, typefaceB);
                    return typefaceB;
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static Typeface b(i9i i9iVar, Context context, Typeface typeface, int i) {
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) i9iVar.b;
        long jL = f83.l(typeface);
        j77 j77Var = jL == 0 ? null : (j77) concurrentHashMap.get(Long.valueOf(jL));
        if (j77Var != null) {
            Resources resources = context.getResources();
            int i2 = Integer.MAX_VALUE;
            k77 k77Var = null;
            for (k77 k77Var2 : j77Var.a) {
                int iAbs = (Math.abs(k77Var2.b - i) * 2) + (k77Var2.c ? 1 : 0);
                if (k77Var == null || i2 > iAbs) {
                    k77Var = k77Var2;
                    i2 = iAbs;
                }
            }
            if (k77Var != null) {
                int i3 = k77Var.f;
                String str = k77Var.a;
                Typeface typefaceI = h9i.a.i(context, resources, i3, str);
                if (typefaceI != null) {
                    h9i.b.d(h9i.c(resources, i3, str, 0, 0), typefaceI);
                }
                long jL2 = f83.l(typefaceI);
                if (jL2 != 0) {
                    concurrentHashMap.put(Long.valueOf(jL2), j77Var);
                }
                return typefaceI;
            }
        }
        return null;
    }
}
