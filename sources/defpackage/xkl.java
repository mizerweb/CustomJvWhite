package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class xkl {
    public static final yx6 a(yx6 yx6Var, vt4 vt4Var) {
        return ((yx6Var instanceof mhf) || (yx6Var instanceof fib)) ? yx6Var : new f90(yx6Var, vt4Var);
    }

    public static kmd b(String str) {
        y1 y1Var = new y1(0, kmd.f);
        while (y1Var.hasNext()) {
            kmd kmdVar = (kmd) y1Var.next();
            if (kmdVar.a.equals(str)) {
                return kmdVar;
            }
        }
        ore.f("Collection contains no element matching the predicate.");
        return null;
    }

    public static final Object c(vt4 vt4Var, Object obj, Object obj2, qf7 qf7Var, lq4 lq4Var) {
        Object objInvoke;
        Object objI = np4.I(vt4Var, obj2);
        try {
            jgg jggVar = new jgg(lq4Var, vt4Var);
            if (qf7Var == null) {
                objInvoke = p90.V(qf7Var, obj, jggVar);
            } else {
                e9i.l(2, qf7Var);
                objInvoke = qf7Var.invoke(obj, jggVar);
            }
            return objInvoke;
        } finally {
            np4.A(vt4Var, objI);
        }
    }

    public static Object d(vt4 vt4Var, yx6 yx6Var, qt1 qt1Var, lq4 lq4Var) {
        return c(vt4Var, yx6Var, vt4Var.E(0, np4.e), qt1Var, lq4Var);
    }
}
