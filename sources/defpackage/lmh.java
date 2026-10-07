package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;

/* JADX INFO: loaded from: classes2.dex */
public final class lmh extends a2i {
    public umh g;
    public final Context h;
    public final agf i;
    public final float j;
    public final f66 k;
    public final float l = yl5.d().getDisplayMetrics().density * 8.0f;
    public final float m;
    public final int n;
    public final float o;
    public final TextPaint p;
    public final Paint q;
    public float r;
    public final enh s;
    public StaticLayout t;
    public float u;
    public boolean v;
    public CharSequence w;

    public lmh(umh umhVar, Context context, agf agfVar, float f, f66 f66Var) {
        this.g = umhVar;
        this.h = context;
        this.i = agfVar;
        this.j = f;
        this.k = f66Var;
        float f2 = yl5.d().getDisplayMetrics().density * 4.0f;
        this.m = f2;
        this.n = gm0.K(24.0f * yl5.d().getDisplayMetrics().density);
        float f3 = yl5.d().getDisplayMetrics().density * 28.0f;
        this.o = f3;
        TextPaint textPaint = new TextPaint(1);
        textPaint.setLinearText(true);
        textPaint.setSubpixelText(true);
        this.p = textPaint;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        this.q = paint;
        this.s = new enh(f2, f2);
        this.u = -1.0f;
        umh umhVar2 = this.g;
        this.w = umhVar2.e;
        float f4 = umhVar2.h;
        va2 va2Var = this.a;
        va2Var.c = f4;
        va2Var.d = umhVar2.i;
        o(umhVar2.j);
        this.a.e = this.g.k;
        s();
        CharSequence charSequenceF = f66Var.f((int) f3, this.g.e);
        this.w = charSequenceF == null ? this.g.e : charSequenceF;
        this.t = t();
        u(1.0f);
        umh umhVar3 = this.g;
        umhVar3.l = umhVar3.n.centerX();
        umh umhVar4 = this.g;
        umhVar4.m = umhVar4.n.centerY();
    }

    @Override // defpackage.a2i
    public final long a() {
        return this.g.a;
    }

    @Override // defpackage.a2i
    public final float b() {
        return this.g.l;
    }

    @Override // defpackage.a2i
    public final float c() {
        return this.g.m;
    }

    @Override // defpackage.a2i
    public final void l(Canvas canvas, float f) {
        u(f);
        if (Color.alpha(this.g.d) != 0) {
            enh enhVar = this.s;
            if (!enhVar.d.isEmpty()) {
                int i = this.g.d;
                Paint paint = this.q;
                paint.setColor(i);
                canvas.drawPath(enhVar.d, paint);
            }
        }
        this.t.draw(canvas);
    }

    @Override // defpackage.a2i
    public final void m(Canvas canvas, float f) {
        this.i.a(canvas, this.c, f);
    }

    public final void s() {
        int i = this.g.c;
        TextPaint textPaint = this.p;
        textPaint.setColor(i);
        textPaint.setTypeface(h9i.a(this.h, Typeface.create("roboto", 0), v0h.b(this.g.f)));
        textPaint.setTextSize(this.o);
    }

    public final StaticLayout t() {
        Layout.Alignment alignment;
        int i = kmh.$EnumSwitchMapping$0[this.g.b.ordinal()];
        if (i == 1) {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        } else if (i == 2) {
            alignment = Layout.Alignment.ALIGN_CENTER;
        } else {
            if (i != 3) {
                ore.o();
                return null;
            }
            alignment = Layout.Alignment.ALIGN_OPPOSITE;
        }
        int i2 = this.g.g;
        if (i2 <= 0) {
            i2 = this.n;
        }
        CharSequence charSequence = this.w;
        return StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.p, i2).setIncludePad(false).setAlignment(alignment).setBreakStrategy(0).setHyphenationFrequency(0).build();
    }

    public final void u(float f) {
        if (f == this.u) {
            return;
        }
        this.u = f;
        float f2 = f > 0.0f ? 1.0f / f : 1.0f;
        float f3 = this.m * f2;
        enh enhVar = this.s;
        enhVar.a = f3;
        enhVar.b = 0.0f;
        enhVar.b(this.t, this.w);
        enhVar.d.computeBounds(this.g.n, true);
        if (this.v) {
            this.v = false;
            umh umhVar = this.g;
            umhVar.l = umhVar.n.centerX();
            umh umhVar2 = this.g;
            umhVar2.m = umhVar2.n.centerY();
        }
        r(this.g.n, f, this.i.a.a, this.j);
        float f4 = this.l * f2;
        if (f4 == this.r) {
            return;
        }
        this.r = f4;
        this.q.setPathEffect(new CornerPathEffect(f4));
    }
}
