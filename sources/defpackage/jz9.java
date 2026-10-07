package defpackage;

import android.view.View;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class jz9 extends tu3 {
    public final /* synthetic */ View c;
    public final /* synthetic */ kz9 d;
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jz9(View view, kz9 kz9Var, int i) {
        super(1);
        this.c = view;
        this.d = kz9Var;
        this.e = i;
    }

    @Override // defpackage.tu3
    public final void f(swj swjVar) {
        if ((swjVar.a.c() & 8) != 0) {
            kz9 kz9Var = this.d;
            View view = kz9Var.c;
            view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), this.e);
            kz9Var.b.setTranslationY(0.0f);
            WeakHashMap weakHashMap = i7j.a;
            swj.a(this.c, null);
        }
    }

    @Override // defpackage.tu3
    public final ixj g(ixj ixjVar, List list) {
        return ixjVar;
    }
}
