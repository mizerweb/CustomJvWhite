package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class gtk {
    public static int a(int i, String str) {
        if (i >= 0) {
            return i;
        }
        ore.p(qt4.j(i, str, " cannot be negative but was: "));
        return 0;
    }

    public static void b(Object obj, Object obj2) {
        if (obj == null) {
            ore.n("null key in entry: null=".concat(String.valueOf(obj2)));
        } else {
            if (obj2 != null) {
                return;
            }
            ore.n(c0a.o("null value in entry: ", obj.toString(), "=null"));
        }
    }
}
