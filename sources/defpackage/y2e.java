package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.LeadingMarginSpan;
import android.text.style.LineHeightSpan;
import android.text.style.MetricAffectingSpan;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public final class y2e extends MetricAffectingSpan implements LeadingMarginSpan, eph, gn9, LineHeightSpan.WithDensity {
    public final x2e a;
    public final String b = y2e.class.getName();
    public final Paint c = new Paint();
    public WeakReference d = new WeakReference(null);
    public float e;
    public int f;
    public int g;
    public final int h;

    public y2e(x2e x2eVar) {
        this.a = x2eVar;
        x2eVar.e.setBounds(0, 0, x2eVar.g, x2eVar.h);
        d(x2eVar.c);
        this.h = 10;
    }

    @Override // defpackage.gn9
    public final byte b() {
        return (byte) -1;
    }

    public final void c(Paint paint, Canvas canvas, int i, float f, int i2, float f2, float f3) {
        paint.setColor(this.f);
        float f4 = i;
        x2e x2eVar = this.a;
        canvas.drawRect(f4, f, (i2 * x2eVar.k) + i, f2, paint);
        paint.setColor(this.g);
        canvas.drawRect(f4 + x2eVar.k, f, f3, f2, paint);
    }

    @Override // android.text.style.LineHeightSpan.WithDensity
    public final void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt, TextPaint textPaint) {
        Spanned spanned = charSequence instanceof Spanned ? (Spanned) charSequence : null;
        if (fontMetricsInt == null || spanned == null) {
            return;
        }
        int iAscent = textPaint != null ? (int) textPaint.ascent() : fontMetricsInt.ascent;
        int iDescent = textPaint != null ? (int) textPaint.descent() : fontMetricsInt.descent;
        fontMetricsInt.ascent = iAscent;
        fontMetricsInt.descent = iDescent;
        int spanStart = spanned.getSpanStart(this);
        x2e x2eVar = this.a;
        if (i == spanStart) {
            int i5 = fontMetricsInt.ascent - x2eVar.n;
            fontMetricsInt.ascent = i5;
            fontMetricsInt.top = i5;
        }
        if (i2 == spanned.getSpanEnd(this) + 1 || i2 >= ((Spanned) charSequence).length()) {
            int i6 = x2eVar.p + x2eVar.o + fontMetricsInt.descent;
            fontMetricsInt.descent = i6;
            fontMetricsInt.bottom = i6;
        }
    }

    @Override // defpackage.ft4
    public final ft4 copy() {
        return new y2e(this.a);
    }

    public final void d(xac xacVar) {
        x2e x2eVar = this.a;
        x2eVar.c = xacVar;
        tac tacVar = xacVar.a;
        int i = tacVar.b;
        this.f = i;
        this.g = tacVar.d;
        x2eVar.e.setTint(i);
    }

    /* JADX WARN: Code duplicated, block: B:103:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:106:0x01db A[Catch: all -> 0x01e4, TryCatch #1 {all -> 0x01e4, blocks: (B:104:0x01cf, B:106:0x01db, B:109:0x01e7, B:111:0x01ec), top: B:146:0x01cf }] */
    /* JADX WARN: Code duplicated, block: B:109:0x01e7 A[Catch: all -> 0x01e4, TryCatch #1 {all -> 0x01e4, blocks: (B:104:0x01cf, B:106:0x01db, B:109:0x01e7, B:111:0x01ec), top: B:146:0x01cf }] */
    /* JADX WARN: Code duplicated, block: B:111:0x01ec A[Catch: all -> 0x01e4, TRY_LEAVE, TryCatch #1 {all -> 0x01e4, blocks: (B:104:0x01cf, B:106:0x01db, B:109:0x01e7, B:111:0x01ec), top: B:146:0x01cf }] */
    /* JADX WARN: Code duplicated, block: B:122:0x0241  */
    /* JADX WARN: Code duplicated, block: B:30:0x0098 A[Catch: all -> 0x009b, TryCatch #8 {all -> 0x009b, blocks: (B:28:0x0093, B:30:0x0098, B:35:0x00a2), top: B:158:0x0093 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x009f  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a2 A[Catch: all -> 0x009b, TRY_LEAVE, TryCatch #8 {all -> 0x009b, blocks: (B:28:0x0093, B:30:0x0098, B:35:0x00a2), top: B:158:0x0093 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:55:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:60:0x00e7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:61:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ec A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:63:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:64:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:80:0x0135  */
    /* JADX WARN: Code duplicated, block: B:83:0x0148 A[Catch: all -> 0x0155, TryCatch #3 {all -> 0x0155, blocks: (B:81:0x013c, B:83:0x0148, B:87:0x0158, B:89:0x015d), top: B:149:0x013c }] */
    /* JADX WARN: Code duplicated, block: B:87:0x0158 A[Catch: all -> 0x0155, TryCatch #3 {all -> 0x0155, blocks: (B:81:0x013c, B:83:0x0148, B:87:0x0158, B:89:0x015d), top: B:149:0x013c }] */
    /* JADX WARN: Code duplicated, block: B:89:0x015d A[Catch: all -> 0x0155, TRY_LEAVE, TryCatch #3 {all -> 0x0155, blocks: (B:81:0x013c, B:83:0x0148, B:87:0x0158, B:89:0x015d), top: B:149:0x013c }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) throws Throwable {
        boolean z2;
        Path path;
        float f;
        boolean z3;
        boolean z4;
        Object poeVar;
        boolean z5;
        Throwable thA;
        ?? r0;
        Paint paint2;
        float f2;
        float fMax;
        float f3;
        Canvas canvas2;
        float f4;
        float f5;
        int iSave;
        int iSave2;
        float f6;
        Path path2;
        int iSave3;
        float f7;
        Paint paint3;
        int iSave4;
        int iSave5;
        Spanned spanned;
        boolean z6;
        boolean z7;
        if (!(charSequence instanceof Spanned)) {
            return;
        }
        Spanned spanned2 = (Spanned) charSequence;
        x2e x2eVar = this.a;
        w2e w2eVar = x2eVar.f;
        Path path3 = x2eVar.t;
        int i8 = x2eVar.j;
        int i9 = x2eVar.g;
        int i10 = x2eVar.k;
        float f8 = x2eVar.q;
        int asInt = w2eVar != null ? w2eVar.getAsInt() : 0;
        try {
            try {
                if (asInt <= 0) {
                    if (this.d.get() == layout) {
                        f = this.e;
                    } else {
                        int spanStart = spanned2.getSpanStart(this);
                        int spanEnd = spanned2.getSpanEnd(this);
                        int lineCount = layout.getLineCount();
                        float fMax2 = 0.0f;
                        int i11 = 0;
                        z2 = true;
                        while (i11 < lineCount) {
                            int i12 = spanEnd;
                            int lineStart = layout.getLineStart(i11);
                            int i13 = lineCount;
                            int lineEnd = layout.getLineEnd(i11);
                            Path path4 = path3;
                            if (spanStart <= lineStart && lineEnd <= i12 + 1) {
                                float lineRight = layout.getLineRight(i11) + x2eVar.m;
                                fMax2 = lineStart == spanStart ? Math.max(fMax2, lineRight + i9 + i8) : Math.max(fMax2, lineRight);
                            }
                            i11++;
                            spanEnd = i12;
                            lineCount = i13;
                            path3 = path4;
                        }
                        path = path3;
                        this.d = new WeakReference(layout);
                        this.e = fMax2;
                        f = fMax2;
                    }
                    poeVar = null;
                    if (charSequence instanceof Spanned) {
                        spanned = (Spanned) charSequence;
                    } else {
                        spanned = null;
                    }
                    if (spanned != null) {
                        if (spanned.getSpanStart(this) >= i6) {
                            z6 = z2;
                        } else {
                            z6 = false;
                        }
                        try {
                            if (spanned.getSpanEnd(this) <= i7) {
                                z7 = z2;
                            } else {
                                z7 = false;
                            }
                            try {
                                poeVar = sbi.a;
                                z5 = z7;
                                z4 = z6;
                            } catch (Throwable th) {
                                th = th;
                                boolean z8 = z7;
                                z4 = z6;
                                z3 = z8;
                                poeVar = new poe(th);
                                z5 = z3;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            z4 = z6;
                            z3 = false;
                        }
                    } else {
                        z5 = false;
                        z4 = false;
                    }
                    thA = roe.a(poeVar);
                    if (thA != null) {
                        gm0.V(this.b, "getSegment start&end failed", thA);
                    }
                    if (!z4 && z5) {
                        r0 = 4;
                    } else if (z4) {
                        r0 = z2;
                    } else if (z5) {
                        r0 = 2;
                    } else {
                        r0 = 3;
                    }
                    Paint.Style style = Paint.Style.FILL;
                    paint2 = this.c;
                    paint2.setStyle(style);
                    f2 = i;
                    fMax = Math.max(i10, f8) + f2;
                    if (r0 == z2 && r0 != 4 && r0 != 2 && r0 != 4) {
                        c(paint2, canvas, i, i3, i2, i5, f);
                        return;
                    }
                    f3 = f;
                    canvas2 = canvas;
                    f4 = i3;
                    f5 = i5;
                    if (r0 != 1 || r0 == 4) {
                        iSave = canvas2.save();
                        canvas2.translate(f2, f4);
                        try {
                            paint2.setColor(this.f);
                            canvas2.drawPath(x2eVar.s, paint2);
                            try {
                                if (path != null) {
                                    paint2.setColor(this.g);
                                    canvas2.drawPath(path, paint2);
                                } else {
                                    if (i10 > f8) {
                                        paint2.setColor(this.f);
                                        float f9 = x2eVar.q;
                                        try {
                                            canvas2.drawRect(f9, 0.0f, i10, f9, paint2);
                                        } catch (Throwable th3) {
                                            th = th3;
                                            canvas2 = canvas2;
                                            canvas2.restoreToCount(iSave);
                                            throw th;
                                        }
                                    }
                                    canvas2.restoreToCount(iSave);
                                    paint2.setColor(this.g);
                                    canvas2.drawRect(fMax, f4, f3 - f8, f4 + f8, paint2);
                                    f4 = f4;
                                    iSave2 = canvas2.save();
                                    canvas2.translate(f3 - f8, f4);
                                    canvas2.drawPath(x2eVar.w, paint2);
                                    canvas2.restoreToCount(iSave2);
                                    f6 = f4 + f8;
                                }
                                canvas2.drawPath(x2eVar.w, paint2);
                                canvas2.restoreToCount(iSave2);
                                f6 = f4 + f8;
                            } catch (Throwable th4) {
                                canvas2.restoreToCount(iSave2);
                                throw th4;
                            }
                            canvas2.restoreToCount(iSave);
                            paint2.setColor(this.g);
                            canvas2.drawRect(fMax, f4, f3 - f8, f4 + f8, paint2);
                            f4 = f4;
                            iSave2 = canvas2.save();
                            canvas2.translate(f3 - f8, f4);
                        } catch (Throwable th5) {
                            th = th5;
                        }
                    } else {
                        f6 = f4;
                    }
                    if (r0 != 2 || r0 == 4) {
                        float f10 = f5 - x2eVar.p;
                        path2 = x2eVar.v;
                        float f11 = f10 - f8;
                        iSave3 = canvas2.save();
                        canvas2.translate(f2, f11);
                        try {
                            paint2.setColor(this.f);
                            canvas2.drawPath(x2eVar.u, paint2);
                            if (path2 != null) {
                                paint2.setColor(this.g);
                                canvas2.drawPath(path2, paint2);
                            } else {
                                f7 = i10;
                                if (f7 > f8) {
                                    paint2.setColor(this.f);
                                    float f12 = x2eVar.q;
                                    try {
                                        canvas2.drawRect(f12, 0.0f, f7, f12, paint2);
                                    } catch (Throwable th6) {
                                        th = th6;
                                        canvas2 = canvas2;
                                        canvas2.restoreToCount(iSave3);
                                        throw th;
                                    }
                                }
                            }
                            canvas2.restoreToCount(iSave3);
                            paint2.setColor(this.g);
                            float f13 = f10 - f8;
                            float f14 = f3 - f8;
                            canvas2.drawRect(fMax, f13, f14, f10, paint2);
                            paint3 = paint2;
                            iSave4 = canvas2.save();
                            canvas2.translate(f14, f13);
                            try {
                                canvas2.drawPath(x2eVar.x, paint3);
                                canvas2.restoreToCount(iSave4);
                                f5 = f10 - f8;
                            } catch (Throwable th7) {
                                canvas2.restoreToCount(iSave4);
                                throw th7;
                            }
                        } catch (Throwable th8) {
                            th = th8;
                        }
                    } else {
                        paint3 = paint2;
                    }
                    if (f6 < f5) {
                        c(paint3, canvas2, i, f6, i2, f5, f3);
                    }
                    if (r0 != 1 || r0 == 4) {
                        Drawable drawable = x2eVar.e;
                        float f15 = f4 + x2eVar.i;
                        iSave5 = canvas2.save();
                        canvas2.translate((f3 - i9) - i8, f15);
                        drawable.draw(canvas2);
                        return;
                    }
                    return;
                }
                f = asInt;
                drawable.draw(canvas2);
                return;
            } finally {
                canvas2.restoreToCount(iSave5);
            }
            poeVar = null;
            if (charSequence instanceof Spanned) {
                spanned = (Spanned) charSequence;
            } else {
                spanned = null;
            }
            if (spanned != null) {
                if (spanned.getSpanStart(this) >= i6) {
                    z6 = z2;
                } else {
                    z6 = false;
                }
                if (spanned.getSpanEnd(this) <= i7) {
                    z7 = z2;
                } else {
                    z7 = false;
                }
                poeVar = sbi.a;
                z5 = z7;
                z4 = z6;
            } else {
                z5 = false;
                z4 = false;
            }
        } catch (Throwable th9) {
            th = th9;
            z3 = false;
            z4 = false;
        }
        path = path3;
        z2 = true;
        thA = roe.a(poeVar);
        if (thA != null) {
            gm0.V(this.b, "getSegment start&end failed", thA);
        }
        if (!z4) {
            if (z4) {
                r0 = z2;
            } else if (z5) {
                r0 = 2;
            } else {
                r0 = 3;
            }
        } else if (z4) {
            r0 = z2;
        } else if (z5) {
            r0 = 2;
        } else {
            r0 = 3;
        }
        Paint.Style style2 = Paint.Style.FILL;
        paint2 = this.c;
        paint2.setStyle(style2);
        f2 = i;
        fMax = Math.max(i10, f8) + f2;
        if (r0 == z2) {
        }
        f3 = f;
        canvas2 = canvas;
        f4 = i3;
        f5 = i5;
        if (r0 != 1) {
            iSave = canvas2.save();
            canvas2.translate(f2, f4);
            paint2.setColor(this.f);
            canvas2.drawPath(x2eVar.s, paint2);
            if (path != null) {
                paint2.setColor(this.g);
                canvas2.drawPath(path, paint2);
            } else {
                if (i10 > f8) {
                    paint2.setColor(this.f);
                    float f16 = x2eVar.q;
                    canvas2.drawRect(f16, 0.0f, i10, f16, paint2);
                }
                canvas2.restoreToCount(iSave);
                paint2.setColor(this.g);
                canvas2.drawRect(fMax, f4, f3 - f8, f4 + f8, paint2);
                f4 = f4;
                iSave2 = canvas2.save();
                canvas2.translate(f3 - f8, f4);
                canvas2.drawPath(x2eVar.w, paint2);
                canvas2.restoreToCount(iSave2);
                f6 = f4 + f8;
            }
            canvas2.restoreToCount(iSave);
            paint2.setColor(this.g);
            canvas2.drawRect(fMax, f4, f3 - f8, f4 + f8, paint2);
            f4 = f4;
            iSave2 = canvas2.save();
            canvas2.translate(f3 - f8, f4);
            canvas2.drawPath(x2eVar.w, paint2);
            canvas2.restoreToCount(iSave2);
            f6 = f4 + f8;
        } else {
            iSave = canvas2.save();
            canvas2.translate(f2, f4);
            paint2.setColor(this.f);
            canvas2.drawPath(x2eVar.s, paint2);
            if (path != null) {
                paint2.setColor(this.g);
                canvas2.drawPath(path, paint2);
            } else {
                if (i10 > f8) {
                    paint2.setColor(this.f);
                    float f17 = x2eVar.q;
                    canvas2.drawRect(f17, 0.0f, i10, f17, paint2);
                }
                canvas2.restoreToCount(iSave);
                paint2.setColor(this.g);
                canvas2.drawRect(fMax, f4, f3 - f8, f4 + f8, paint2);
                f4 = f4;
                iSave2 = canvas2.save();
                canvas2.translate(f3 - f8, f4);
                canvas2.drawPath(x2eVar.w, paint2);
                canvas2.restoreToCount(iSave2);
                f6 = f4 + f8;
            }
            canvas2.restoreToCount(iSave);
            paint2.setColor(this.g);
            canvas2.drawRect(fMax, f4, f3 - f8, f4 + f8, paint2);
            f4 = f4;
            iSave2 = canvas2.save();
            canvas2.translate(f3 - f8, f4);
            canvas2.drawPath(x2eVar.w, paint2);
            canvas2.restoreToCount(iSave2);
            f6 = f4 + f8;
        }
        if (r0 != 2) {
            float f18 = f5 - x2eVar.p;
            path2 = x2eVar.v;
            float f19 = f18 - f8;
            iSave3 = canvas2.save();
            canvas2.translate(f2, f19);
            paint2.setColor(this.f);
            canvas2.drawPath(x2eVar.u, paint2);
            if (path2 != null) {
                paint2.setColor(this.g);
                canvas2.drawPath(path2, paint2);
            } else {
                f7 = i10;
                if (f7 > f8) {
                    paint2.setColor(this.f);
                    float f110 = x2eVar.q;
                    canvas2.drawRect(f110, 0.0f, f7, f110, paint2);
                }
            }
            canvas2.restoreToCount(iSave3);
            paint2.setColor(this.g);
            float f111 = f18 - f8;
            float f112 = f3 - f8;
            canvas2.drawRect(fMax, f111, f112, f18, paint2);
            paint3 = paint2;
            iSave4 = canvas2.save();
            canvas2.translate(f112, f111);
            canvas2.drawPath(x2eVar.x, paint3);
            canvas2.restoreToCount(iSave4);
            f5 = f18 - f8;
        } else {
            float f113 = f5 - x2eVar.p;
            path2 = x2eVar.v;
            float f114 = f113 - f8;
            iSave3 = canvas2.save();
            canvas2.translate(f2, f114);
            paint2.setColor(this.f);
            canvas2.drawPath(x2eVar.u, paint2);
            if (path2 != null) {
                paint2.setColor(this.g);
                canvas2.drawPath(path2, paint2);
            } else {
                f7 = i10;
                if (f7 > f8) {
                    paint2.setColor(this.f);
                    float f115 = x2eVar.q;
                    canvas2.drawRect(f115, 0.0f, f7, f115, paint2);
                }
            }
            canvas2.restoreToCount(iSave3);
            paint2.setColor(this.g);
            float f116 = f113 - f8;
            float f117 = f3 - f8;
            canvas2.drawRect(fMax, f116, f117, f113, paint2);
            paint3 = paint2;
            iSave4 = canvas2.save();
            canvas2.translate(f117, f116);
            canvas2.drawPath(x2eVar.x, paint3);
            canvas2.restoreToCount(iSave4);
            f5 = f113 - f8;
        }
        if (f6 < f5) {
            c(paint3, canvas2, i, f6, i2, f5, f3);
        }
        if (r0 != 1) {
        }
        Drawable drawable2 = x2eVar.e;
        float f118 = f4 + x2eVar.i;
        iSave5 = canvas2.save();
        canvas2.translate((f3 - i9) - i8, f118);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y2e) && cqk.d(this.a, ((y2e) obj).a);
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z) {
        x2e x2eVar = this.a;
        return x2eVar.k + x2eVar.l;
    }

    @Override // defpackage.gn9
    public final int getType() {
        return this.h;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        d((xac) kbcVar.f().b);
    }

    public final String toString() {
        return "QuoteSpan(param=" + this.a + ")";
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        if (textPaint != null) {
            x2e x2eVar = this.a;
            noh.d(x2eVar.d, x2eVar.a, textPaint, null, (bx5) x2eVar.b.getValue(), 4);
        }
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        x2e x2eVar = this.a;
        noh.d(x2eVar.d, x2eVar.a, textPaint, null, (bx5) x2eVar.b.getValue(), 4);
        w2e w2eVar = x2eVar.f;
        int asInt = w2eVar != null ? w2eVar.getAsInt() : 0;
        if (asInt > 0) {
            textPaint.setTextScaleX(asInt / (((asInt - x2eVar.g) - x2eVar.j) - x2eVar.m));
        } else if (x2eVar.f == null && x2eVar.r) {
            textPaint.setTextScaleX(1.1f);
        }
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        chooseHeight(charSequence, i, i2, i3, i4, fontMetricsInt, null);
    }
}
