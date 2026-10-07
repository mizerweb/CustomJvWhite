package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class s08 extends kjh {
    public final /* synthetic */ w08 e;
    public final /* synthetic */ int f;
    public final /* synthetic */ l31 g;
    public final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s08(String str, w08 w08Var, int i, l31 l31Var, int i2, boolean z) {
        super(str, true);
        this.e = w08Var;
        this.f = i;
        this.g = l31Var;
        this.h = i2;
    }

    @Override // defpackage.kjh
    public final long a() {
        try {
            zpe zpeVar = this.e.k;
            l31 l31Var = this.g;
            int i = this.h;
            zpeVar.getClass();
            l31Var.skip(i);
            this.e.w.I(this.f, 9);
            synchronized (this.e) {
                this.e.y.remove(Integer.valueOf(this.f));
            }
            return -1L;
        } catch (IOException unused) {
            return -1L;
        }
    }
}
