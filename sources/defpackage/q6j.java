package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class q6j implements View.OnAttachStateChangeListener {
    public boolean a = false;
    public final /* synthetic */ t3a b;
    public final /* synthetic */ r6j c;

    public q6j(r6j r6jVar, t3a t3aVar) {
        this.c = r6jVar;
        this.b = t3aVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        if (this.a) {
            return;
        }
        r6j r6jVar = this.c;
        if (r6jVar.f != null) {
            this.a = true;
            r6j r6jVar2 = (r6j) this.b.a;
            r6jVar2.b = true;
            r6jVar2.b();
            view.removeOnAttachStateChangeListener(this);
            r6jVar.f = null;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
