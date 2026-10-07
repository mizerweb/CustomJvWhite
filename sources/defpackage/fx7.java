package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class fx7 extends pcf {
    public fx7(j71 j71Var) {
        super(j71Var, new yx7());
    }

    @Override // defpackage.pcf
    public final tcf a(ry9 ry9Var) {
        return new gx7(ry9Var, this.b, this.a, this.c, this.d, this.e);
    }

    @Override // defpackage.pcf
    public final pcf b(long j) {
        this.e = j;
        return this;
    }

    @Override // defpackage.pcf
    public final pcf c(Executor executor) {
        this.c = executor;
        return this;
    }

    @Override // defpackage.pcf
    public final pcf d(long j) {
        this.d = j;
        return this;
    }
}
