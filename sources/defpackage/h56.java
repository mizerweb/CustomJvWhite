package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.style.ReplacementSpan;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class h56 extends ReplacementSpan implements geg, yy7 {
    public int a;
    public int b;
    public Rect c;
    public final Paint.FontMetricsInt d = new Paint.FontMetricsInt();
    public final int e = 2;
    public final Drawable f;
    public int g;

    public h56(Drawable drawable) {
        this.f = drawable;
        Rect bounds = drawable.getBounds();
        this.c = bounds;
        this.a = bounds.width();
        this.b = this.c.height();
    }

    public final void a(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        int i6;
        Paint.FontMetricsInt fontMetricsInt = this.d;
        paint.getFontMetricsInt(fontMetricsInt);
        int i7 = this.b;
        int i8 = this.e;
        if (i8 == 0) {
            i6 = fontMetricsInt.descent - i7;
        } else if (i8 != 2) {
            i6 = -i7;
        } else {
            int i9 = fontMetricsInt.descent;
            int i10 = fontMetricsInt.ascent;
            i6 = i10 + (((i9 - i10) - i7) / 2);
        }
        int i11 = i4 + i6;
        canvas.translate(f, i11);
        this.f.draw(canvas);
        canvas.translate(-f, -i11);
    }

    @Override // defpackage.geg
    public final Drawable b() {
        return this.f;
    }

    @Override // defpackage.yy7
    public final void c(int i) {
        this.g = i;
    }

    public final int d(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        Rect bounds = this.f.getBounds();
        this.c = bounds;
        this.a = bounds.width();
        int iHeight = this.c.height();
        this.b = iHeight;
        if (fontMetricsInt == null) {
            return this.a;
        }
        Paint.FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
        int i3 = fontMetricsInt2.ascent;
        fontMetricsInt.ascent = i3;
        int i4 = fontMetricsInt2.descent;
        fontMetricsInt.descent = i4;
        fontMetricsInt.leading = fontMetricsInt2.leading;
        int i5 = this.e;
        if (i5 == 0) {
            int i6 = i4 - iHeight;
            if (i3 > i6) {
                fontMetricsInt.ascent = i6;
            }
        } else if (i5 != 2) {
            int i7 = -iHeight;
            if (i3 > i7) {
                fontMetricsInt.ascent = i7;
            }
        } else {
            int i8 = i4 - i3;
            if (i8 < iHeight) {
                int i9 = i3 - ((iHeight - i8) / 2);
                fontMetricsInt.ascent = i9;
                fontMetricsInt.descent = i9 + iHeight;
            }
        }
        fontMetricsInt.top = Math.min(fontMetricsInt2.top, fontMetricsInt.ascent);
        fontMetricsInt.bottom = Math.max(fontMetricsInt2.bottom, fontMetricsInt.descent);
        return this.a;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        a(canvas, charSequence, i, i2, f + (this.g / 2.0f), i3, i4, i5, paint);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h56)) {
            return false;
        }
        h56 h56Var = (h56) obj;
        return this.e == h56Var.e && Objects.equals(this.c, h56Var.c) && Objects.equals(this.f, h56Var.f);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        Drawable drawable = this.f;
        if (drawable instanceof kfg) {
            kfg kfgVar = (kfg) drawable;
            lfg lfgVar = kfgVar.a;
            Paint.FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
            if (fontMetricsInt2 == null) {
                fontMetricsInt2 = fontMetricsInt;
            }
            Paint paint2 = kfg.d;
            if (fontMetricsInt2 != null) {
                int iAbs = Math.abs(fontMetricsInt2.ascent) + Math.abs(fontMetricsInt2.descent);
                if (iAbs > 0 && lfgVar.b != iAbs) {
                    lfgVar.b = iAbs;
                    int i3 = lfgVar.b;
                    kfgVar.setBounds(0, 0, i3, i3);
                    kfgVar.a();
                    kfgVar.invalidateSelf();
                }
            }
        }
        return d(paint, charSequence, i, i2, fontMetricsInt) + this.g;
    }

    public final int hashCode() {
        return Objects.hash(this.c, Integer.valueOf(this.e), this.f);
    }
}
