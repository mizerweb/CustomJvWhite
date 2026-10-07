package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class d19 implements g19, View.OnAttachStateChangeListener {
    public i19 a;

    public d19(View view) {
        i19 i19Var = new i19(this);
        this.a = i19Var;
        i19Var.d(m09.ON_CREATE);
        view.addOnAttachStateChangeListener(this);
        if (view.isAttachedToWindow()) {
            onViewAttachedToWindow(view);
        }
    }

    @Override // defpackage.g19
    public final i19 f() {
        return this.a;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        if (this.a.d == n09.a) {
            this.a = new i19(this);
        }
        this.a.d(m09.ON_START);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        if (this.a.d.a(n09.c)) {
            this.a.d(m09.ON_DESTROY);
        }
    }
}
