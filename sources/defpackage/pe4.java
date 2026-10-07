package defpackage;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pe4 implements mf7, r89 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public /* synthetic */ pe4(int i, int i2) {
        this.a = i2;
        this.b = i;
    }

    @Override // defpackage.mf7
    /* JADX INFO: renamed from: apply */
    public Object mo41apply(Object obj) {
        int i = this.a;
        int i2 = this.b;
        Bundle bundle = (Bundle) obj;
        switch (i) {
            case 0:
                break;
            case 1:
                break;
        }
        return by3.i(i2, bundle);
    }

    @Override // defpackage.r89
    public void invoke(Object obj) {
        ((j3d) obj).f(this.b);
    }
}
