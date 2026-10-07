package defpackage;

import android.view.View;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public final class h9j implements View.OnAttachStateChangeListener {
    public sgg a;
    public final /* synthetic */ tf7 b;
    public final /* synthetic */ View c;

    public h9j(tf7 tf7Var, View view) {
        this.b = tf7Var;
        this.c = view;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        sgg sggVar = this.a;
        if (sggVar == null || !sggVar.isActive()) {
            r8e r8eVar = (r8e) pq3.j.e(view.getContext()).h;
            tf7 tf7Var = this.b;
            View view2 = this.c;
            lq4 lq4Var = null;
            this.a = e9i.j0(new fz6(new fz6(r8eVar, new gz(tf7Var, view2, view, lq4Var, 19)), new gz(tf7Var, view2, lq4Var, 20), 3), v7j.b(view));
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) throws IllegalAccessException, InvocationTargetException {
        sgg sggVar = this.a;
        if (sggVar != null) {
            sggVar.b(null);
        }
        this.a = null;
    }
}
