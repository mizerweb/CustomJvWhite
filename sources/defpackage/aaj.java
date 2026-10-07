package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class aaj extends wq4 {
    public final /* synthetic */ v30 a;
    public final /* synthetic */ ViewTreeObserver b;
    public final /* synthetic */ baj c;
    public final /* synthetic */ View d;

    public aaj(v30 v30Var, ViewTreeObserver viewTreeObserver, baj bajVar, View view) {
        this.a = v30Var;
        this.b = viewTreeObserver;
        this.c = bajVar;
        this.d = view;
    }

    @Override // defpackage.wq4
    public final void s(br4 br4Var, View view) {
        Iterator it = ((ArrayList) this.a.f).iterator();
        while (it.hasNext()) {
            ((y9j) it.next()).c();
        }
        br4Var.removeLifecycleListener(this);
        v30.b(this.c, this.d, this.b);
    }
}
