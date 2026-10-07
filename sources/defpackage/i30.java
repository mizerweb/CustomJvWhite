package defpackage;

import android.database.ContentObserver;
import android.os.Handler;

/* JADX INFO: loaded from: classes2.dex */
public final class i30 extends ContentObserver {
    public final /* synthetic */ n30 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i30(n30 n30Var, Handler handler) {
        super(handler);
        this.a = n30Var;
    }

    @Override // android.database.ContentObserver
    public final boolean deliverSelfNotifications() {
        return false;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        n30 n30Var = this.a;
        gm0.n(n30Var.e, "contact observer onChange");
        n30Var.i.a(sbi.a);
    }
}
