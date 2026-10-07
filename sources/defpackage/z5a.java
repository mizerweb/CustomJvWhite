package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final class z5a implements View.OnLayoutChangeListener {
    public final /* synthetic */ a6a a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;

    public z5a(a6a a6aVar, float f, float f2, float f3, float f4) {
        this.a = a6aVar;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(this);
        a6a a6aVar = this.a;
        a6aVar.n = true;
        a6aVar.j = this.b;
        a6aVar.k = this.c;
        a6aVar.l = this.d;
        a6aVar.m = this.e;
        a6aVar.s();
    }
}
