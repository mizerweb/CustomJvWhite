package defpackage;

import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public final class p5j implements fli {
    public final g40 a = gvk.b(0);

    @Override // defpackage.fli
    public final void b(kli kliVar) {
    }

    @Override // defpackage.fli
    public final void reset() {
        this.a.a = 0;
        if (tvj.f(3, "CXCP")) {
            Log.d("CXCP", "reset: videoUsage = 0");
        }
    }
}
