package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class sr3 implements rv8, qr3 {
    public static final Map b;
    public final Class a;

    static {
        List listP0 = xw3.P0(af7.class, cf7.class, qf7.class, tf7.class, vf7.class, wf7.class, xf7.class, yf7.class, zf7.class, ag7.class, bf7.class, df7.class, ef7.class, ff7.class, gf7.class, hf7.class, if7.class, jf7.class, kf7.class, lf7.class, nf7.class, of7.class, pf7.class);
        ArrayList arrayList = new ArrayList(yw3.W0(listP0, 10));
        int i = 0;
        for (Object obj : listP0) {
            int i2 = i + 1;
            if (i < 0) {
                xw3.V0();
                throw null;
            }
            arrayList.add(new ylc((Class) obj, Integer.valueOf(i)));
            i = i2;
        }
        b = wm9.W0(arrayList);
    }

    public sr3(Class cls) {
        this.a = cls;
    }

    @Override // defpackage.qr3
    public final Class d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof sr3) && wk8.q(this).equals(wk8.q((rv8) obj));
    }

    public final String g() {
        String strI;
        Class cls = this.a;
        String strConcat = null;
        if (cls.isAnonymousClass() || cls.isLocalClass()) {
            return null;
        }
        if (!cls.isArray()) {
            String strI2 = wk8.i(cls.getName());
            return strI2 == null ? cls.getCanonicalName() : strI2;
        }
        Class<?> componentType = cls.getComponentType();
        if (componentType.isPrimitive() && (strI = wk8.i(componentType.getName())) != null) {
            strConcat = strI.concat("Array");
        }
        return strConcat == null ? "kotlin.Array" : strConcat;
    }

    public final String h() {
        String strE;
        Class cls = this.a;
        String strConcat = null;
        if (cls.isAnonymousClass()) {
            return null;
        }
        if (!cls.isLocalClass()) {
            if (!cls.isArray()) {
                String strE2 = wk8.E(cls.getName());
                return strE2 == null ? cls.getSimpleName() : strE2;
            }
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (strE = wk8.E(componentType.getName())) != null) {
                strConcat = strE.concat("Array");
            }
            return strConcat == null ? "Array" : strConcat;
        }
        String simpleName = cls.getSimpleName();
        Method enclosingMethod = cls.getEnclosingMethod();
        if (enclosingMethod != null) {
            return r5h.q1(simpleName, enclosingMethod.getName() + '$', simpleName);
        }
        Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
        if (enclosingConstructor == null) {
            return r5h.p1('$', simpleName, simpleName);
        }
        return r5h.q1(simpleName, enclosingConstructor.getName() + '$', simpleName);
    }

    public final int hashCode() {
        return wk8.q(this).hashCode();
    }

    public final boolean i(Object obj) {
        Map map = b;
        Class clsQ = this.a;
        Integer num = (Integer) map.get(clsQ);
        if (num != null) {
            return e9i.g0(num.intValue(), obj);
        }
        if (clsQ.isPrimitive()) {
            clsQ = wk8.q(zfe.a(clsQ));
        }
        return clsQ.isInstance(obj);
    }

    public final String toString() {
        return this.a.toString() + " (Kotlin reflection is not available)";
    }
}
