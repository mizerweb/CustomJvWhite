package defpackage;

import java.util.function.LongSupplier;

/* JADX INFO: loaded from: classes.dex */
public final class p7f implements LongSupplier {
    public final /* synthetic */ ny8 a;

    public p7f(ny8 ny8Var) {
        this.a = ny8Var;
    }

    @Override // java.util.function.LongSupplier
    public final long getAsLong() {
        return ((s7f) ((et3) this.a.getValue())).f();
    }
}
