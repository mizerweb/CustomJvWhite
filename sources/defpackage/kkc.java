package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.EdgeEffect;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes3.dex */
public final class kkc extends EdgeEffect {
    public ifg a;
    public final /* synthetic */ int b;
    public final /* synthetic */ lkc c;
    public final /* synthetic */ RecyclerView d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kkc(int i, lkc lkcVar, RecyclerView recyclerView, Context context) {
        super(context);
        this.b = i;
        this.c = lkcVar;
        this.d = recyclerView;
    }

    public final ifg a() {
        ifg ifgVar = new ifg(this.d, ifg.q);
        jfg jfgVar = new jfg();
        jfgVar.i = 0.0d;
        jfgVar.a(1.0f);
        jfgVar.b(200.0f);
        ifgVar.m = jfgVar;
        return ifgVar;
    }

    public final void b(float f) {
        int i = this.b == 3 ? -1 : 1;
        lkc lkcVar = this.c;
        float f2 = i * lkcVar.a * f * lkcVar.b;
        RecyclerView recyclerView = this.d;
        recyclerView.setTranslationY(recyclerView.getTranslationY() + f2);
        ifg ifgVar = this.a;
        if (ifgVar != null) {
            ifgVar.b();
        }
    }

    @Override // android.widget.EdgeEffect
    public final boolean draw(Canvas canvas) {
        return false;
    }

    @Override // android.widget.EdgeEffect
    public final boolean isFinished() {
        ifg ifgVar = this.a;
        return ifgVar == null || !ifgVar.f;
    }

    @Override // android.widget.EdgeEffect
    public final void onAbsorb(int i) {
        super.onAbsorb(i);
        float f = (this.b == 3 ? -1 : 1) * i * this.c.c;
        ifg ifgVar = this.a;
        if (ifgVar != null) {
            ifgVar.b();
        }
        ifg ifgVarA = a();
        ifgVarA.a = f;
        ifgVarA.g();
        this.a = ifgVarA;
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float f) {
        super.onPull(f);
        b(f);
    }

    @Override // android.widget.EdgeEffect
    public final void onRelease() {
        super.onRelease();
        if (this.d.getTranslationY() == 0.0f) {
            return;
        }
        ifg ifgVarA = a();
        ifgVarA.g();
        this.a = ifgVarA;
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float f, float f2) {
        super.onPull(f, f2);
        b(f);
    }
}
