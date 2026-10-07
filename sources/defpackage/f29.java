package defpackage;

import android.content.Context;
import android.graphics.Canvas;

/* JADX INFO: loaded from: classes2.dex */
public final class f29 extends a2i {
    public g59 g;
    public final agf h;
    public final float i;
    public final f59 j;
    public float k = -1.0f;

    public f29(g59 g59Var, Context context, agf agfVar, float f) {
        this.g = g59Var;
        this.h = agfVar;
        this.i = f;
        this.j = new f59(context, context.getResources().getDisplayMetrics().density);
        g59 g59Var2 = this.g;
        float f2 = g59Var2.f;
        va2 va2Var = this.a;
        va2Var.c = f2;
        va2Var.d = g59Var2.g;
        o(g59Var2.h);
        this.a.e = this.g.i;
        s();
    }

    @Override // defpackage.a2i
    public final long a() {
        return this.g.a;
    }

    @Override // defpackage.a2i
    public final float b() {
        return this.g.j;
    }

    @Override // defpackage.a2i
    public final float c() {
        return this.g.k;
    }

    @Override // defpackage.a2i
    public final void l(Canvas canvas, float f) {
        if (f != this.k) {
            this.k = f;
            r(this.g.l, f, this.h.a.a, this.i);
        }
        this.j.a(canvas);
    }

    @Override // defpackage.a2i
    public final void m(Canvas canvas, float f) {
        this.h.a(canvas, this.c, f);
    }

    public final void s() {
        g59 g59Var = this.g;
        this.j.b(g59Var, g59Var.l);
        g59 g59Var2 = this.g;
        g59Var2.j = g59Var2.l.centerX();
        g59 g59Var3 = this.g;
        g59Var3.k = g59Var3.l.centerY();
        this.k = -1.0f;
    }
}
