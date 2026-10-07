package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class h15 extends pcf {
    public h15(j71 j71Var) {
        super(j71Var, new p15());
    }

    @Override // defpackage.pcf
    public final tcf a(ry9 ry9Var) {
        return new i15(ry9Var, this.b, this.a, this.c, this.d, this.e);
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
