package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class z9j implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;
    public final /* synthetic */ ViewTreeObserver c;
    public final /* synthetic */ baj d;
    public final /* synthetic */ View e;

    public /* synthetic */ z9j(View view, ViewTreeObserver viewTreeObserver, baj bajVar, View view2, int i) {
        this.a = i;
        this.b = view;
        this.c = viewTreeObserver;
        this.d = bajVar;
        this.e = view2;
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.a) {
            case 0:
                this.b.removeOnAttachStateChangeListener(this);
                WeakHashMap weakHashMap = i7j.a;
                boolean zIsAttachedToWindow = view.isAttachedToWindow();
                View view2 = this.e;
                baj bajVar = this.d;
                ViewTreeObserver viewTreeObserver = this.c;
                if (!zIsAttachedToWindow) {
                    v30.b(bajVar, view2, viewTreeObserver);
                } else {
                    view.addOnAttachStateChangeListener(new z9j(view, viewTreeObserver, bajVar, view2, 1));
                }
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.a) {
            case 0:
                break;
            default:
                this.b.removeOnAttachStateChangeListener(this);
                v30.b(this.d, this.e, this.c);
                break;
        }
    }
}
