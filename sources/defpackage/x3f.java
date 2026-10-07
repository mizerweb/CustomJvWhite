package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class x3f {
    public int a;

    public static final void a(x3f x3fVar, String str) {
        je9 je9Var;
        x3fVar.getClass();
        int iD = qt4.D(2);
        if (iD == 0) {
            je9Var = je9.d;
        } else if (iD == 1) {
            je9Var = je9.e;
        } else if (iD == 2) {
            je9Var = je9.f;
        } else {
            if (iD != 3) {
                if (iD == 4) {
                    return;
                }
                ore.o();
                return;
            }
            je9Var = je9.g;
        }
        gm0.D(je9Var, "Scout", str, new Object[0]);
    }
}
