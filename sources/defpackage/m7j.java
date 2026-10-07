package defpackage;

import android.os.Handler;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class m7j implements View.OnAttachStateChangeListener {
    public final /* synthetic */ View a;
    public final /* synthetic */ Handler b;
    public final /* synthetic */ View c;
    public final /* synthetic */ k7j d;

    public m7j(View view, Handler handler, View view2, k7j k7jVar) {
        this.a = view;
        this.b = handler;
        this.c = view2;
        this.d = k7jVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.a.removeOnAttachStateChangeListener(this);
        this.b.removeCallbacksAndMessages(null);
        this.c.removeOnLayoutChangeListener(this.d);
    }
}
