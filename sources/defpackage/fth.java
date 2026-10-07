package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class fth implements vm7 {
    public final vuf a;
    public final l6m b;

    public fth(vuf vufVar, l6m l6mVar) {
        this.a = vufVar;
        this.b = l6mVar;
    }

    @Override // defpackage.vm7
    public final cn7 a(Context context, boolean z) {
        return new hth(this.a);
    }

    @Override // defpackage.i36
    public final long e(long j) {
        return erl.a(this.b, j);
    }
}
