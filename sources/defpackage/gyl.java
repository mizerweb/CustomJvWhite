package defpackage;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public abstract class gyl {
    public static qwh a() {
        if (qwh.k) {
            try {
                Method method = qwh.d;
                if (method == null) {
                    method = null;
                }
                Object objInvoke = method.invoke(null, Arrays.copyOf(new Object[0], 0));
                Method method2 = qwh.e;
                if (method2 == null) {
                    method2 = null;
                }
                Object objInvoke2 = method2.invoke(objInvoke, Arrays.copyOf(new Object[0], 0));
                Method method3 = qwh.f;
                if (method3 == null) {
                    method3 = null;
                }
                if (((Boolean) method3.invoke(objInvoke2, Arrays.copyOf(new Object[0], 0))).booleanValue()) {
                    Method method4 = qwh.g;
                    if (method4 == null) {
                        method4 = null;
                    }
                    String str = (String) method4.invoke(objInvoke2, Arrays.copyOf(new Object[0], 0));
                    Method method5 = qwh.h;
                    if (method5 == null) {
                        method5 = null;
                    }
                    String str2 = (String) method5.invoke(objInvoke2, Arrays.copyOf(new Object[0], 0));
                    Method method6 = qwh.i;
                    if (method6 == null) {
                        method6 = null;
                    }
                    Object objInvoke3 = method6.invoke(objInvoke2, Arrays.copyOf(new Object[0], 0));
                    Method method7 = qwh.j;
                    if (method7 == null) {
                        method7 = null;
                    }
                    return new qwh(str, str2, (String) method7.invoke(objInvoke3, Arrays.copyOf(new Object[0], 0)));
                }
            } catch (Exception unused) {
                qwh.k = false;
                return null;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object b(xx6 xx6Var, ArrayList arrayList, nq4 nq4Var) {
        ty6 ty6Var;
        if (nq4Var instanceof ty6) {
            ty6Var = (ty6) nq4Var;
            int i = ty6Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                ty6Var.f = i - Integer.MIN_VALUE;
            } else {
                ty6Var = new ty6(nq4Var);
            }
        } else {
            ty6Var = new ty6(nq4Var);
        }
        Object obj = ty6Var.e;
        int i2 = ty6Var.f;
        if (i2 != 0) {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ArrayList arrayList2 = ty6Var.d;
            ch3.d0(obj);
            return arrayList2;
        }
        ch3.d0(obj);
        yx6 d90Var = new d90(8, arrayList);
        ty6Var.d = arrayList;
        ty6Var.f = 1;
        Object objCollect = xx6Var.collect(d90Var, ty6Var);
        Object obj2 = hu4.a;
        return objCollect == obj2 ? obj2 : arrayList;
    }

    public static Object c(xx6 xx6Var, f30 f30Var) {
        return b(xx6Var, new ArrayList(), f30Var);
    }
}
