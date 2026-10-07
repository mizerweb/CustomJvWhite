package defpackage;

import android.content.Context;
import android.content.ContextWrapper;

/* JADX INFO: loaded from: classes.dex */
public final class uyj extends ContextWrapper implements ha4 {
    public final /* synthetic */ xyj a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uyj(xyj xyjVar, Context context) {
        super(context);
        this.a = xyjVar;
    }

    @Override // defpackage.ha4
    public final ja4 a() {
        return ((ha4) this.a.a.getApplicationContext()).a();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final boolean isDeviceProtectedStorage() {
        return false;
    }
}
