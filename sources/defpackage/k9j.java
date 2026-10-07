package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes2.dex */
public final class k9j implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;
    public final /* synthetic */ m9j c;
    public final /* synthetic */ ViewTreeObserver d;
    public final /* synthetic */ View e;

    public /* synthetic */ k9j(View view, m9j m9jVar, ViewTreeObserver viewTreeObserver, View view2, int i) {
        this.a = i;
        this.b = view;
        this.c = m9jVar;
        this.d = viewTreeObserver;
        this.e = view2;
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }

    private final void c(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.a) {
            case 0:
                this.b.removeOnAttachStateChangeListener(this);
                boolean zIsAttachedToWindow = view.isAttachedToWindow();
                View view2 = this.e;
                ViewTreeObserver viewTreeObserver = this.d;
                m9j m9jVar = this.c;
                if (!zIsAttachedToWindow) {
                    n9j.a(m9jVar, viewTreeObserver, view2);
                } else {
                    view.addOnAttachStateChangeListener(new k9j(view, m9jVar, viewTreeObserver, view2, 2));
                }
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        int i = this.a;
        View view2 = this.e;
        ViewTreeObserver viewTreeObserver = this.d;
        m9j m9jVar = this.c;
        View view3 = this.b;
        switch (i) {
            case 0:
                break;
            case 1:
                view3.removeOnAttachStateChangeListener(this);
                n9j.a(m9jVar, viewTreeObserver, view2);
                break;
            default:
                view3.removeOnAttachStateChangeListener(this);
                n9j.a(m9jVar, viewTreeObserver, view2);
                break;
        }
    }
}
