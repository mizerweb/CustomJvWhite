package defpackage;

import java.util.function.IntPredicate;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class e46 implements IntPredicate {
    public final /* synthetic */ int a;

    @Override // java.util.function.IntPredicate
    public final boolean test(int i) {
        switch (this.a) {
            case 0:
                return !g46.c(i);
            default:
                return g46.a(i) || i == 8205 || i == 8419;
        }
    }
}
