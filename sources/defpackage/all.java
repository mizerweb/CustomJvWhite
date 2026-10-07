package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class all {
    public static mnd a(String str) {
        y1 y1Var = new y1(0, mnd.e);
        while (y1Var.hasNext()) {
            mnd mndVar = (mnd) y1Var.next();
            if (mndVar.a.equals(str)) {
                return mndVar;
            }
        }
        ore.f("Collection contains no element matching the predicate.");
        return null;
    }

    public static final Object b(kgf kgfVar, Object obj) {
        Object objC = kgfVar.c(obj);
        if (!(objC instanceof cs2)) {
            return sbi.a;
        }
        return ((ds2) yab.A0(k66.a, new dn0(kgfVar, obj, (lq4) null, 15))).a;
    }
}
