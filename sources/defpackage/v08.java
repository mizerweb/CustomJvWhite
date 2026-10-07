package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class v08 extends kjh {
    public final /* synthetic */ w08 e;
    public final /* synthetic */ int f;
    public final /* synthetic */ long g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v08(String str, w08 w08Var, int i, long j) {
        super(str, true);
        this.e = w08Var;
        this.f = i;
        this.g = j;
    }

    @Override // defpackage.kjh
    public final long a() {
        w08 w08Var = this.e;
        try {
            w08Var.w.K(this.f, this.g);
            return -1L;
        } catch (IOException e) {
            w08Var.b(2, 2, e);
            return -1L;
        }
    }
}
