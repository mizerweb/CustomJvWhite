package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class qm5 implements oah {
    public final /* synthetic */ sm5 a;

    public qm5(sm5 sm5Var) {
        this.a = sm5Var;
    }

    @Override // defpackage.oah
    public final Object get() {
        Context context = this.a.j;
        context.getClass();
        return context.getApplicationContext().getCacheDir();
    }
}
