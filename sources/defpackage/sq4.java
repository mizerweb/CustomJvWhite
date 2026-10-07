package defpackage;

import android.content.Intent;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class sq4 implements ive {
    public final /* synthetic */ int a;
    public final /* synthetic */ br4 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Cloneable d;

    public /* synthetic */ sq4(br4 br4Var, Cloneable cloneable, int i, int i2) {
        this.a = i2;
        this.b = br4Var;
        this.d = cloneable;
        this.c = i;
    }

    @Override // defpackage.ive
    public final void a() {
        int i = this.a;
        int i2 = this.c;
        Object obj = this.d;
        br4 br4Var = this.b;
        switch (i) {
            case 0:
                br4Var.router.W(br4Var.instanceId, (Intent) obj, i2);
                break;
            default:
                br4Var.router.O(br4Var.instanceId, (String[]) obj, i2);
                break;
        }
    }
}
