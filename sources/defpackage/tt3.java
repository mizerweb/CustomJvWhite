package defpackage;

import android.util.CloseGuard;

/* JADX INFO: loaded from: classes2.dex */
public final class tt3 implements ut3 {
    public final CloseGuard a = new CloseGuard();

    @Override // defpackage.ut3
    public final void a(String str) {
        this.a.open(str);
    }

    @Override // defpackage.ut3
    public final void close() {
        this.a.close();
    }

    @Override // defpackage.ut3
    public final void q() {
        this.a.warnIfOpen();
    }
}
