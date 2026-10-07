package defpackage;

import android.graphics.drawable.Animatable;

/* JADX INFO: loaded from: classes3.dex */
public final class k1c implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ l1c b;
    public final /* synthetic */ l68 c;
    public final /* synthetic */ Animatable d;

    public /* synthetic */ k1c(l1c l1cVar, String str, l68 l68Var, Animatable animatable, int i) {
        this.a = i;
        this.b = l1cVar;
        this.c = l68Var;
        this.d = animatable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Animatable animatable = this.d;
        l68 l68Var = this.c;
        l1c l1cVar = this.b;
        switch (i) {
            case 0:
                l1cVar.k(l68Var, animatable);
                l1cVar.requestLayout();
                l1cVar.invalidate();
                break;
            default:
                l1cVar.k(l68Var, animatable);
                l1cVar.requestLayout();
                l1cVar.invalidate();
                break;
        }
    }
}
