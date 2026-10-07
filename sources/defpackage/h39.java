package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class h39 extends qbb {
    public static final h39 b = new h39();

    public static i65 j(h39 h39Var, long j, String str, Boolean bool, Long l, int i) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            bool = Boolean.FALSE;
        }
        if ((i & 8) != 0) {
            l = null;
        }
        h39Var.getClass();
        return qbb.g(new g39(j, str, bool, l));
    }
}
