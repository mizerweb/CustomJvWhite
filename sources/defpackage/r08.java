package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class r08 extends kjh {
    public final /* synthetic */ int e;
    public final /* synthetic */ w08 f;
    public final /* synthetic */ int g;
    public final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r08(String str, w08 w08Var, int i, int i2, int i3) {
        super(str, true);
        this.e = i3;
        this.f = w08Var;
        this.g = i;
        this.h = i2;
    }

    @Override // defpackage.kjh
    public final long a() {
        int i = this.e;
        int i2 = this.h;
        int i3 = this.g;
        w08 w08Var = this.f;
        switch (i) {
            case 0:
                try {
                    w08Var.w.E(i3, i2, true);
                } catch (IOException e) {
                    w08Var.b(2, 2, e);
                }
                break;
            default:
                try {
                    w08Var.w.I(i3, i2);
                } catch (IOException e2) {
                    w08Var.b(2, 2, e2);
                }
                break;
        }
        return -1L;
        return -1L;
    }
}
