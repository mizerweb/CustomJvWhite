package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class r7 {
    public static final r7 a = new r7();
    public static final mjg b = p90.a(s66.a);

    public static r3f b(ha9 ha9Var) {
        y6 y6Var = (y6) ((Map) b.getValue()).get(ha9Var);
        if (y6Var != null) {
            return y6Var.a;
        }
        return null;
    }

    public static Map c() {
        return (Map) b.getValue();
    }

    public static r3f d(ha9 ha9Var) {
        r3f r3fVarB = b(ha9Var);
        if (r3fVarB != null) {
            return r3fVarB;
        }
        throw new IllegalStateException(new d2(1, ha9Var).toString());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(ha9 ha9Var, nq4 nq4Var) {
        p7 p7Var;
        if (nq4Var instanceof p7) {
            p7Var = (p7) nq4Var;
            int i = p7Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                p7Var.f = i - Integer.MIN_VALUE;
            } else {
                p7Var = new p7(this, nq4Var);
            }
        } else {
            p7Var = new p7(this, nq4Var);
        }
        Object objN = p7Var.d;
        int i2 = p7Var.f;
        if (i2 == 0) {
            ch3.d0(objN);
            j3 j3Var = new j3(b, 1, ha9Var);
            p7Var.f = 1;
            objN = e9i.N(j3Var, p7Var);
            hu4 hu4Var = hu4.a;
            if (objN == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(objN);
        }
        return ((y6) objN).a;
    }
}
