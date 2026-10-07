package defpackage;

import android.content.Intent;

/* JADX INFO: loaded from: classes4.dex */
public final class zo8 implements ap8 {
    public final Intent a;
    public final int b;
    public final /* synthetic */ fp8 c;

    public zo8(fp8 fp8Var, Intent intent, int i) {
        this.c = fp8Var;
        this.a = intent;
        this.b = i;
    }

    @Override // defpackage.ap8
    public final void f() {
        this.c.stopSelf(this.b);
    }

    @Override // defpackage.ap8
    public final Intent getIntent() {
        return this.a;
    }
}
