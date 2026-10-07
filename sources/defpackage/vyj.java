package defpackage;

import android.content.Context;
import android.content.ContextWrapper;

/* JADX INFO: loaded from: classes.dex */
public final class vyj extends ContextWrapper implements ha4 {
    public final uyj a;
    public final /* synthetic */ xyj b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vyj(xyj xyjVar, Context context) {
        super(context);
        this.b = xyjVar;
        this.a = new uyj(xyjVar, xyjVar.a.getApplicationContext());
    }

    @Override // defpackage.ha4
    public final ja4 a() {
        return ((ha4) this.b.a.getApplicationContext()).a();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Context getApplicationContext() {
        return this.a;
    }
}
