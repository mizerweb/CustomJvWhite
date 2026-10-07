package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class bx7 extends rr0 {
    public final List d;
    public final long e;

    public bx7(long j, List list) {
        super(0L, list.size() - 1);
        this.e = j;
        this.d = list;
    }

    @Override // defpackage.gt9
    public final long a() {
        c();
        return this.e + ((qx7) this.d.get((int) this.c)).e;
    }

    @Override // defpackage.gt9
    public final long b() {
        c();
        qx7 qx7Var = (qx7) this.d.get((int) this.c);
        return this.e + qx7Var.e + qx7Var.c;
    }
}
