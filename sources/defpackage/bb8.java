package defpackage;

import android.database.ContentObserver;

/* JADX INFO: loaded from: classes.dex */
public final class bb8 extends ContentObserver {
    public final /* synthetic */ rb8 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bb8(rb8 rb8Var) {
        super(null);
        this.a = rb8Var;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        gm0.n(rb8.u, "ContentObserver: on content changed");
        this.a.d();
    }
}
