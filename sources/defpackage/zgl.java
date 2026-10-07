package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zgl {
    public static Object[] a(Object[] objArr, int i, int i2, Object[] objArr2) {
        return Arrays.copyOfRange(objArr, i, i2, objArr2.getClass());
    }

    public static Object[] b(Object[] objArr, int i) {
        if (objArr.length != 0) {
            objArr = Arrays.copyOf(objArr, 0);
        }
        return Arrays.copyOf(objArr, i);
    }

    public static final xmf c(a12 a12Var) {
        cnf cnfVar = a12Var.a;
        String str = a12Var.b;
        boolean z = a12Var.c;
        return new xmf(a12Var.e, a12Var.f, cnfVar, a12Var.g, str, a12Var.d, z);
    }
}
