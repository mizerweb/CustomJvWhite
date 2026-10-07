package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b8f implements qf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ d8f b;

    public /* synthetic */ b8f(d8f d8fVar, int i) {
        this.a = i;
        this.b = d8fVar;
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        sbi sbiVar = sbi.a;
        d8f d8fVar = this.b;
        y8f y8fVar = (y8f) obj;
        View view = (View) obj2;
        switch (i) {
            case 0:
                d8fVar.g.t1(y8fVar, view);
                break;
            default:
                d8fVar.g.t1(y8fVar, view);
                break;
        }
        return sbiVar;
    }
}
