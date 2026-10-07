package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes3.dex */
public final class lw3 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ yfj a;
    public final /* synthetic */ gjg b;
    public final /* synthetic */ ViewGroup c;

    public lw3(yfj yfjVar, gjg gjgVar, ViewGroup viewGroup) {
        this.a = yfjVar;
        this.b = gjgVar;
        this.c = viewGroup;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        yfj yfjVar = this.a;
        sgg sggVar = (sgg) yfjVar.f;
        if (sggVar == null || !sggVar.isActive()) {
            yfjVar.f = e9i.j0(new fz6(e9i.M0(new jz(this.b, 13), new sh1(3, null, 8)), new fze(yfjVar, this.c, (lq4) null, 19), 3), v7j.b(view));
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
