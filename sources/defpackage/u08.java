package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class u08 extends kjh {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u08(int i, Object obj, String str) {
        super(str, true);
        this.e = i;
        this.f = obj;
    }

    @Override // defpackage.kjh
    public final long a() {
        int i = this.e;
        Object obj = this.f;
        switch (i) {
            case 0:
                w08 w08Var = (w08) obj;
                w08Var.getClass();
                try {
                    w08Var.w.E(2, 0, false);
                } catch (IOException e) {
                    w08Var.b(2, 2, e);
                }
                break;
            default:
                ((af7) obj).invoke();
                break;
        }
        return -1L;
        return -1L;
    }
}
