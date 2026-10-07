package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class p95 implements s25 {
    public final Context a;
    public final eb5 b;

    public p95(Context context) {
        eb5 eb5Var = new eb5();
        this.a = context.getApplicationContext();
        this.b = eb5Var;
    }

    @Override // defpackage.s25
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final q95 a() {
        return new q95(this.a, this.b.a());
    }
}
