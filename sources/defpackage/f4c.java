package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class f4c implements b6a, hvd {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f4c(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.b6a, defpackage.hvd
    public final void a(float f) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((gvi) obj).a(f);
                break;
            default:
                hvd hvdVar = (hvd) ((AtomicReference) obj).get();
                if (hvdVar != null) {
                    hvdVar.a(f);
                }
                break;
        }
    }
}
