package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class snl {
    public static final String a(Long l, Long l2) {
        int iCompareTo = l2.compareTo(l);
        if (iCompareTo > 0) {
            return "<";
        }
        return iCompareTo < 0 ? ">" : "=";
    }

    public static final void b(mw mwVar, cf7 cf7Var) {
        mw mwVar2 = new mw(999);
        int i = mwVar.c;
        int i2 = 0;
        int i3 = 0;
        while (i2 < i) {
            mwVar2.put(mwVar.f(i2), mwVar.i(i2));
            i2++;
            i3++;
            if (i3 == 999) {
                cf7Var.invoke(mwVar2);
                mwVar2.clear();
                i3 = 0;
            }
        }
        if (i3 > 0) {
            cf7Var.invoke(mwVar2);
        }
    }

    public static final void c(vi9 vi9Var, boolean z, cf7 cf7Var) {
        vi9 vi9Var2 = new vi9(999);
        int i = vi9Var.i();
        int i2 = 0;
        int i3 = 0;
        while (i2 < i) {
            if (z) {
                vi9Var2.f(vi9Var.e(i2), vi9Var.j(i2));
            } else {
                vi9Var2.f(vi9Var.e(i2), null);
            }
            i2++;
            i3++;
            if (i3 == 999) {
                cf7Var.invoke(vi9Var2);
                if (!z) {
                    vi9Var.g(vi9Var2);
                }
                vi9Var2.a();
                i3 = 0;
            }
        }
        if (i3 > 0) {
            cf7Var.invoke(vi9Var2);
            if (z) {
                return;
            }
            vi9Var.g(vi9Var2);
        }
    }
}
