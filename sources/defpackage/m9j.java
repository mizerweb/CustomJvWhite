package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes2.dex */
public final class m9j implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ af7 a;
    public final /* synthetic */ ViewTreeObserver b;
    public final /* synthetic */ View c;

    public m9j(af7 af7Var, ViewTreeObserver viewTreeObserver, View view) {
        this.a = af7Var;
        this.b = viewTreeObserver;
        this.c = view;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        if (((Boolean) this.a.invoke()).booleanValue()) {
            n9j.a(this, this.b, this.c);
        }
    }
}
