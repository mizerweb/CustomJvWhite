package defpackage;

import android.view.View;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class hj implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ hj(View view, int i) {
        this.a = i;
        this.b = view;
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        int i = this.a;
        View view2 = this.b;
        switch (i) {
            case 0:
                view2.removeOnAttachStateChangeListener(this);
                WeakHashMap weakHashMap = i7j.a;
                w6j.c(view);
                break;
            default:
                view2.removeOnAttachStateChangeListener(this);
                WeakHashMap weakHashMap2 = i7j.a;
                w6j.c(view);
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        int i = this.a;
    }
}
