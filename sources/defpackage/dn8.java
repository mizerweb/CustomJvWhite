package defpackage;

import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final class dn8 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        fn8 fn8Var = ((cn8) obj).b;
        fn8 fn8Var2 = ((cn8) obj2).b;
        int i = fn8Var.d;
        if (i == 0 && fn8Var2.d >= 2) {
            return -1;
        }
        if (fn8Var2.d == 0 && i >= 2) {
            return 1;
        }
        int i2 = fn8Var.b;
        int i3 = fn8Var2.b;
        return i2 == i3 ? cqk.i(fn8Var2.c, fn8Var.c) : cqk.i(i2, i3);
    }
}
