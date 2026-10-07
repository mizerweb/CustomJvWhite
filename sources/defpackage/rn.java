package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import one.me.sdk.uikit.common.span.FitFontImageSpan;

/* JADX INFO: loaded from: classes3.dex */
public final class rn extends FitFontImageSpan implements geg, yy7, hi {
    public final long a;
    public final qn b;
    public final String c;
    public int d;

    public rn(long j, qn qnVar) {
        super(qnVar, kw6.a, true, false, 8, null);
        this.a = j;
        this.b = qnVar;
        this.c = rn.class.getName();
    }

    @Override // defpackage.geg
    public final Drawable b() {
        return this.b;
    }

    @Override // defpackage.yy7
    public final void c(int i) {
        this.d = i;
    }

    @Override // one.me.sdk.uikit.common.span.FitFontImageSpan, android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        Number numberValueOf;
        int iSave = canvas.save();
        try {
            qn qnVar = this.b;
            canvas.translate((this.d / 2.0f) + f, i3);
            canvas.clipRect(getFontRect());
            if (qnVar.getBounds().height() > 0) {
                numberValueOf = Integer.valueOf(qnVar.getBounds().height());
            } else if (qnVar.getIntrinsicHeight() > 0) {
                numberValueOf = Integer.valueOf(qnVar.getIntrinsicHeight());
            } else {
                String str = this.c;
                a4c a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9 je9Var = je9.f;
                    if (a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, str, "AnimojiStateSpan.draw bad drawable " + qnVar.a + " height.Bounds height: " + qnVar.getBounds().height() + ";Intrisic: " + qnVar.getIntrinsicHeight(), null);
                    }
                }
                numberValueOf = Float.valueOf(getFontRect().height());
            }
            float fHeight = getFontRect().height() / numberValueOf.floatValue();
            if (fHeight - 1.0f > 0.001f && getNeedCustomScale()) {
                canvas.scale(fHeight, fHeight);
            }
            qnVar.e(canvas, qnVar.g().getBounds().height(), paint);
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    public final long e() {
        return this.a;
    }

    @Override // one.me.sdk.uikit.common.span.FitFontImageSpan
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rn)) {
            return false;
        }
        rn rnVar = (rn) obj;
        return this.a == rnVar.a && cqk.d(this.b, rnVar.b);
    }

    @Override // android.text.style.ImageSpan, android.text.style.DynamicDrawableSpan
    public final Drawable getDrawable() {
        return this.b;
    }

    @Override // one.me.sdk.uikit.common.span.FitFontImageSpan, android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        int size = super.getSize(paint, charSequence, i, i2, fontMetricsInt);
        qn qnVar = this.b;
        if (size <= 0) {
            gm0.n(rn.class.getName(), "Empty size when try get size from span");
            size = qnVar.getBounds().right;
        }
        if (nn.$EnumSwitchMapping$0[qnVar.k().ordinal()] == 1 && !(qnVar.d instanceof em)) {
            size = 0;
        }
        return size + this.d;
    }

    @Override // one.me.sdk.uikit.common.span.FitFontImageSpan
    public final int hashCode() {
        return (Long.hashCode(this.a) * 31) + (this.b.hashCode() * 31) + rn.class.hashCode();
    }
}
