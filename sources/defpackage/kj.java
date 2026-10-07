package defpackage;

import android.view.View;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class kj extends vjg {
    public final int j;

    public kj(View view, oi8 oi8Var, cf7 cf7Var) {
        super(view, oi8Var, cf7Var);
        this.j = 8;
    }

    @Override // defpackage.vjg
    public final void b(ixj ixjVar, j11 j11Var) {
        exj exjVar = ixjVar.a;
        a(mi8.a(exjVar.f(this.d), exjVar.f(this.j)), j11Var);
    }

    @Override // defpackage.vjg
    public final void e() {
        this.g = false;
        View view = this.a;
        if (!view.isAttachedToWindow()) {
            view.addOnAttachStateChangeListener(new hj(view, 1));
        } else {
            WeakHashMap weakHashMap = i7j.a;
            w6j.c(view);
        }
    }
}
