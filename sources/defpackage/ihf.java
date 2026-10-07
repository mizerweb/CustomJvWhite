package defpackage;

import android.content.Context;
import android.text.Layout;
import android.text.TextPaint;

/* JADX INFO: loaded from: classes2.dex */
public final class ihf {
    public final Context a;
    public final ny8 b;
    public final ny8 c;
    public final ifh d;
    public final ny8 e;
    public final wme f;
    public final wme g;

    public ihf(Context context, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, noh nohVar, int i) {
        this.a = context;
        this.b = ny8Var;
        this.c = ny8Var2;
        this.d = new ifh(new dt0(i, 1));
        this.e = ny8Var3;
        int i2 = 5;
        this.f = new wme(new ize(i2, this));
        this.g = new wme(new xre(nohVar, i2, this));
    }

    public static /* synthetic */ Layout b(ihf ihfVar, String str, int i, boolean z, int i2) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        return ihfVar.a(str, i, z, 0, null);
    }

    public final Layout a(CharSequence charSequence, int i, boolean z, int i2, Long l) {
        int iE = ((vxb) ((a31) this.c.getValue())).e(i) - i2;
        ghf ghfVar = new ghf(charSequence.toString(), iE, z ? new hhf(l) : null);
        ifh ifhVar = this.d;
        Layout layout = (Layout) ((mj9) ifhVar.getValue()).c(ghfVar);
        if (layout != null) {
            return layout;
        }
        ny8 ny8Var = this.b;
        wme wmeVar = this.g;
        if (z) {
            Layout layoutH = oc9.h(this.a, (ky8) ny8Var.getValue(), charSequence, iE, (TextPaint) wmeVar.getValue(), new c7k(23, l));
            ((mj9) ifhVar.getValue()).d(ghfVar, layoutH);
            return layoutH;
        }
        Layout layoutA = ky8.a((ky8) ny8Var.getValue(), charSequence, (TextPaint) wmeVar.getValue(), iE, 1, false, null, 0.0f, false, 496);
        ((mj9) ifhVar.getValue()).d(ghfVar, layoutA);
        return layoutA;
    }

    public final void c() {
        ifh ifhVar = this.d;
        if (ifhVar.d()) {
            ((mj9) ifhVar.getValue()).i(-1);
            this.f.a();
            this.g.a();
        }
    }

    public ihf(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, Context context) {
        this(context, ny8Var, ny8Var2, ny8Var3, q9i.u.h(), 200);
    }
}
