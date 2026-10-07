package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.graphics.drawable.GradientDrawable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import android.view.animation.Interpolator;
import java.text.DecimalFormat;

/* JADX INFO: loaded from: classes.dex */
public final class v0c extends View implements eph, pu4, b77 {
    public static final /* synthetic */ zv8[] J = {new z8b(v0c.class, "textFont", "getTextFont()Lone/me/sdk/design/dynamicfont/DynamicFont;"), zo5.e(zfe.a, v0c.class, "typography", "getTypography()Lone/me/sdk/design/TextStyle;"), new z8b(v0c.class, "customTheme", "getCustomTheme()Lone/me/sdk/design/theme/OneMeTheme;"), new z8b(v0c.class, "appearance", "getAppearance()Lone/me/common/counter/OneMeCounter$Appearance;"), new z8b(v0c.class, "appearanceMode", "getAppearanceMode()Lone/me/common/counter/OneMeCounter$AppearanceMode;"), new z8b(v0c.class, "isMute", "isMute()Z"), new z8b(v0c.class, "hasBackgroundStroke", "getHasBackgroundStroke()Z"), new z8b(v0c.class, "backgroundStrokeWidth", "getBackgroundStrokeWidth()I"), new z8b(v0c.class, "hasBackground", "getHasBackground()Z")};
    public cf7 A;
    public long B;
    public Interpolator C;
    public int D;
    public final ny8 E;
    public final ny8 F;
    public final Matrix G;
    public int H;
    public int I;
    public boolean a;
    public Number b;
    public String c;
    public ValueAnimator d;
    public float e;
    public StaticLayout f;
    public StaticLayout g;
    public StaticLayout h;
    public StaticLayout i;
    public int j;
    public int k;
    public final int l;
    public final int m;
    public final int n;
    public final GradientDrawable o;
    public boolean p;
    public final u0c q;
    public final u0c r;
    public final TextPaint s;
    public final u0c t;
    public final u0c u;
    public final u0c v;
    public final u0c w;
    public final u0c x;
    public final u0c y;
    public final u0c z;

    public v0c(Context context) {
        super(context, null);
        this.c = "";
        this.H = 4;
        this.e = 1.0f;
        this.l = gm0.K(yl5.d().getDisplayMetrics().density * 20.0f);
        this.m = gm0.K(yl5.d().getDisplayMetrics().density * 20.0f);
        this.n = gm0.K(6.0f * yl5.d().getDisplayMetrics().density);
        float f = yl5.d().getDisplayMetrics().density * 20.0f;
        final int i = 0;
        final int i2 = 1;
        GradientDrawable gradientDrawableU = qyj.U(null, null, null, new float[]{f, f, f, f, f, f, f, f});
        this.o = gradientDrawableU;
        this.q = new u0c(this, 0);
        this.r = new u0c(q9i.i, this, 1);
        TextPaint textPaint = new TextPaint(1);
        p90.Q(this, textPaint, getTypography());
        textPaint.setFontFeatureSettings("'tnum'");
        this.s = textPaint;
        this.t = new u0c(this, 2);
        this.u = new u0c(this, 3);
        this.v = new u0c(this, 4);
        this.w = new u0c(this, 5);
        this.x = new u0c(this, 6);
        this.y = new u0c(Integer.valueOf(gm0.J(((double) yl5.d().getDisplayMetrics().density) * 1.5d)), this, 7);
        this.z = new u0c(this, 8);
        this.B = 400L;
        this.D = 255;
        this.I = 2;
        this.E = rx8.P(3, new af7(this) { // from class: o0c
            public final /* synthetic */ v0c b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i3 = i;
                v0c v0cVar = this.b;
                switch (i3) {
                    case 0:
                        return new LinearGradient(0.0f, 0.0f, 0.0f, v0cVar.getHeight() * 0.15f, new int[]{-16777216, 0}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                    default:
                        return v0c.e(v0cVar);
                }
            }
        });
        this.F = rx8.P(3, new af7(this) { // from class: o0c
            public final /* synthetic */ v0c b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i3 = i2;
                v0c v0cVar = this.b;
                switch (i3) {
                    case 0:
                        return new LinearGradient(0.0f, 0.0f, 0.0f, v0cVar.getHeight() * 0.15f, new int[]{-16777216, 0}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                    default:
                        return v0c.e(v0cVar);
                }
            }
        });
        this.G = new Matrix();
        setBackground(gradientDrawableU);
        m(getTheme());
    }

    public static Paint e(v0c v0cVar) {
        Paint paint = new Paint(1);
        paint.setShader(v0cVar.getMaskGradient());
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        return paint;
    }

    private final LinearGradient getMaskGradient() {
        return (LinearGradient) this.E.getValue();
    }

    private final Paint getMaskPaint() {
        return (Paint) this.F.getValue();
    }

    public final bx5 getTextFont() {
        zv8 zv8Var = J[0];
        return (bx5) this.q.b;
    }

    public final kbc getTheme() {
        kbc customTheme = getCustomTheme();
        return customTheme == null ? pq3.j.e(getContext()).m() : customTheme;
    }

    private final noh getTypography() {
        zv8 zv8Var = J[1];
        return (noh) this.r.b;
    }

    public static final void setCounter$lambda$1(v0c v0cVar) {
        ValueAnimator valueAnimator = v0cVar.d;
        if (valueAnimator != null) {
            valueAnimator.start();
        }
    }

    private final void setCounterWithoutAnimation(Number number) {
        this.b = number;
        this.k = this.j;
        String strL = l(number);
        int iMeasureText = (int) this.s.measureText(strL);
        this.j = iMeasureText;
        this.f = o(iMeasureText, strL);
        if (this.j != this.k) {
            requestLayout();
        }
        invalidate();
    }

    private final void setTextFont(bx5 bx5Var) {
        this.q.B(this, J[0], bx5Var);
    }

    private final void setTypographyInternal(noh nohVar) {
        this.r.B(this, J[1], nohVar);
    }

    @Override // defpackage.b77
    public final void a(bx5 bx5Var) {
        this.p = true;
        setTextFont(bx5Var);
        getTypography().a(getContext(), this.s, getResources().getDisplayMetrics(), bx5Var);
        int iD = qt4.D(this.I);
        if (iD == 0) {
            Number number = this.b;
            this.b = null;
            if (number instanceof Integer) {
                ValueAnimator valueAnimator = this.d;
                pu4.c(this, number, valueAnimator != null && valueAnimator.isStarted(), 4);
            } else if (number instanceof Float) {
                ValueAnimator valueAnimator2 = this.d;
                pu4.c(this, number, valueAnimator2 != null && valueAnimator2.isStarted(), 4);
            }
        } else if (iD == 1) {
            this.I = 2;
            ValueAnimator valueAnimator3 = this.d;
            if (valueAnimator3 != null) {
                valueAnimator3.end();
            }
            this.b = 0;
            this.f = null;
            requestLayout();
        } else if (iD == 2) {
            n();
        } else {
            if (iD != 3) {
                ore.o();
                return;
            }
            setText(this.c);
        }
        this.p = false;
        requestLayout();
        invalidate();
    }

    @Override // defpackage.pu4
    public final void b(Number number, boolean z, boolean z2) {
        int i;
        Number number2 = this.b;
        String strL = l(number);
        String strL2 = number2 != null ? l(number2) : null;
        boolean z3 = true;
        if (!cqk.d(this.b, number) || this.I != 1 || this.f == null || (!z2 && number.doubleValue() == 0.0d)) {
            if (number2 == null || (Math.abs(number2.doubleValue() - number.doubleValue()) >= 0.001d && !strL.equals(strL2))) {
                this.I = 1;
                ValueAnimator valueAnimator = this.d;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                if (z && this.I != 2) {
                    Double dValueOf = number2 != null ? Double.valueOf(number2.doubleValue()) : null;
                    if ((dValueOf == null || dValueOf.doubleValue() != 0.0d || number.doubleValue() <= 0.0d) && (number.doubleValue() != 0.0d || !z2)) {
                        if (this.b == null) {
                            this.s.setAlpha(0);
                            this.o.setAlpha(0);
                            i = 1;
                        } else {
                            i = 3;
                        }
                        this.H = i;
                        this.e = 0.0f;
                        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        int i2 = this.H;
                        int[] iArr = t0c.$EnumSwitchMapping$0;
                        valueAnimatorOfFloat.setInterpolator(iArr[qt4.D(i2)] == 1 ? this.C : null);
                        valueAnimatorOfFloat.setDuration(iArr[qt4.D(this.H)] == 1 ? this.B : 150L);
                        valueAnimatorOfFloat.addUpdateListener(new ak(21, this));
                        lsk.e(valueAnimatorOfFloat, new iua(12, this));
                        this.d = valueAnimatorOfFloat;
                        if (this.f != null && strL2 != null) {
                            if (strL2.length() == strL.length()) {
                                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strL2);
                                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(strL);
                                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(strL);
                                int length = strL2.length();
                                for (int i3 = 0; i3 < length; i3++) {
                                    if (strL2.charAt(i3) == strL.charAt(i3)) {
                                        int i4 = i3 + 1;
                                        spannableStringBuilder.setSpan(new r0c(), i3, i4, 0);
                                        spannableStringBuilder2.setSpan(new r0c(), i3, i4, 0);
                                        h(spannableStringBuilder3, strL2.charAt(i3), i3);
                                    } else {
                                        h(spannableStringBuilder, strL2.charAt(i3), i3);
                                        h(spannableStringBuilder2, strL.charAt(i3), i3);
                                        spannableStringBuilder3.setSpan(new r0c(), i3, i3 + 1, 0);
                                    }
                                }
                                int i5 = i(strL2);
                                this.g = o(i5, spannableStringBuilder);
                                this.i = o(i5, spannableStringBuilder3);
                                this.h = o(i5, spannableStringBuilder2);
                            } else {
                                this.g = this.f;
                            }
                        }
                        this.k = this.j;
                        if (number2 != null && number.doubleValue() <= number2.doubleValue()) {
                            z3 = false;
                        }
                        this.a = z3;
                        if (number.doubleValue() >= 0.0d) {
                            SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(strL);
                            int length2 = strL.length();
                            for (int i6 = 0; i6 < length2; i6++) {
                                h(spannableStringBuilder4, strL.charAt(i6), i6);
                            }
                            int i7 = i(strL);
                            this.j = i7;
                            this.f = o(i7, spannableStringBuilder4);
                        }
                        this.b = number;
                        if (this.j != this.k) {
                            requestLayout();
                        }
                        post(new e6(26, this));
                        return;
                    }
                }
                setCounterWithoutAnimation(number);
            }
        }
    }

    public final p0c getAppearance() {
        zv8 zv8Var = J[3];
        return (p0c) this.u.b;
    }

    public final q0c getAppearanceMode() {
        zv8 zv8Var = J[4];
        return (q0c) this.v.b;
    }

    public final int getBackgroundStrokeWidth() {
        zv8 zv8Var = J[7];
        return ((Number) this.y.b).intValue();
    }

    public final kbc getCustomTheme() {
        zv8 zv8Var = J[2];
        return (kbc) this.t.b;
    }

    public final boolean getHasBackground() {
        zv8 zv8Var = J[8];
        return ((Boolean) this.z.b).booleanValue();
    }

    public final boolean getHasBackgroundStroke() {
        zv8 zv8Var = J[6];
        return ((Boolean) this.x.b).booleanValue();
    }

    public final cf7 getNumberFormatter() {
        return this.A;
    }

    public final long getReplaceDuration() {
        return this.B;
    }

    public final Interpolator getReplaceInterpolator() {
        return this.C;
    }

    public final void h(SpannableStringBuilder spannableStringBuilder, char c, int i) {
        spannableStringBuilder.setSpan(new s0c((int) this.s.measureText(String.valueOf(c))), i, i + 1, 0);
    }

    public final int i(String str) {
        int length = str.length();
        int i = 0;
        int iMeasureText = 0;
        while (i < length) {
            int i2 = i + 1;
            iMeasureText += (int) this.s.measureText(str, i, i2);
            i = i2;
        }
        return iMeasureText;
    }

    public final void j(Canvas canvas) {
        int i;
        float f = this.e;
        boolean z = f == 1.0f;
        TextPaint textPaint = this.s;
        if (!z && ((i = this.H) == 1 || i == 2)) {
            k(canvas);
            this.o.setAlpha((int) (this.e * 255.0f));
            textPaint.setAlpha((int) (this.e * this.D));
            return;
        }
        if ((f == 1.0f) || this.H != 3) {
            k(canvas);
            return;
        }
        float f2 = f * 2.0f;
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        canvas.save();
        StaticLayout staticLayout = this.h;
        if (staticLayout != null) {
            int height = staticLayout.getHeight();
            float height2 = (getHeight() - height) / 2.0f;
            float f3 = height * 0.7f;
            if (!this.a) {
                f3 = -f3;
            }
            float f4 = (1.0f - f2) * f3;
            float width = (canvas.getWidth() - this.j) / 2.0f;
            float f5 = height2 + f4;
            int iSave = canvas.save();
            canvas.translate(width, f5);
            try {
                textPaint.setAlpha((int) (this.D * f2));
                staticLayout.draw(canvas);
                canvas.restoreToCount(iSave);
            } catch (Throwable th) {
                canvas.restoreToCount(iSave);
                throw th;
            }
        } else {
            StaticLayout staticLayout2 = this.f;
            if (staticLayout2 != null) {
                int height3 = staticLayout2.getHeight();
                float height4 = (getHeight() - height3) / 2.0f;
                float f6 = height3 * 0.7f;
                if (!this.a) {
                    f6 = -f6;
                }
                float f7 = (1.0f - f2) * f6;
                float width2 = (canvas.getWidth() - this.j) / 2.0f;
                float f8 = height4 + f7;
                int iSave2 = canvas.save();
                canvas.translate(width2, f8);
                try {
                    textPaint.setAlpha((int) (this.D * f2));
                    staticLayout2.draw(canvas);
                    canvas.restoreToCount(iSave2);
                } catch (Throwable th2) {
                    canvas.restoreToCount(iSave2);
                    throw th2;
                }
            }
        }
        StaticLayout staticLayout3 = this.g;
        if (staticLayout3 != null) {
            int height5 = staticLayout3.getHeight();
            float height6 = (getHeight() - height5) / 2.0f;
            float f9 = height5 * 0.7f;
            if (this.a) {
                f9 = -f9;
            }
            float width3 = (canvas.getWidth() - this.j) / 2.0f;
            float f10 = height6 + (f9 * f2);
            int iSave3 = canvas.save();
            canvas.translate(width3, f10);
            try {
                textPaint.setAlpha((int) ((1.0f - f2) * this.D));
                staticLayout3.draw(canvas);
                canvas.restoreToCount(iSave3);
            } catch (Throwable th3) {
                canvas.restoreToCount(iSave3);
                throw th3;
            }
        }
        StaticLayout staticLayout4 = this.i;
        if (staticLayout4 != null) {
            float width4 = (canvas.getWidth() - this.j) / 2.0f;
            float height7 = (getHeight() - this.i.getHeight()) / 2.0f;
            int iSave4 = canvas.save();
            canvas.translate(width4, height7);
            try {
                textPaint.setAlpha(this.D);
                staticLayout4.draw(canvas);
                canvas.restoreToCount(iSave4);
            } catch (Throwable th4) {
                canvas.restoreToCount(iSave4);
                throw th4;
            }
        }
        textPaint.setAlpha(this.D);
        canvas.restore();
    }

    public final void k(Canvas canvas) {
        StaticLayout staticLayout = this.f;
        if (staticLayout != null) {
            float width = (canvas.getWidth() - this.j) / 2.0f;
            float height = (getHeight() - staticLayout.getHeight()) / 2.0f;
            int iSave = canvas.save();
            canvas.translate(width, height);
            try {
                staticLayout.draw(canvas);
            } finally {
                canvas.restoreToCount(iSave);
            }
        }
    }

    public final String l(Number number) {
        String str;
        cf7 cf7Var = this.A;
        if (cf7Var != null && (str = (String) cf7Var.invoke(number)) != null) {
            return str;
        }
        DecimalFormat decimalFormat = l5h.a;
        if (number instanceof Integer) {
            return l5h.a(number.intValue());
        }
        if (number instanceof Long) {
            return l5h.a(number.longValue());
        }
        if (number instanceof Float) {
            double dFloatValue = number.floatValue();
            return dFloatValue < 1000.0d ? l5h.d.format(dFloatValue) : l5h.a((long) dFloatValue);
        }
        if (!(number instanceof Double)) {
            return "";
        }
        double dDoubleValue = number.doubleValue();
        return dDoubleValue < 1000.0d ? l5h.d.format(dDoubleValue) : l5h.a((long) dDoubleValue);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x009d  */
    public final void m(kbc kbcVar) {
        int i;
        int i2;
        zv8 zv8Var = J[5];
        if (((Boolean) this.w.b).booleanValue()) {
            i = 2;
        } else {
            i = isEnabled() ? 1 : 3;
        }
        p0c appearance = getAppearance();
        q0c appearanceMode = getAppearanceMode();
        int iOrdinal = appearance.ordinal();
        int i3 = -1;
        if (iOrdinal == 0) {
            int iD = qt4.D(i);
            if (iD == 0) {
                int iOrdinal2 = appearanceMode.ordinal();
                if (iOrdinal2 == 0) {
                    i2 = -1;
                } else {
                    if (iOrdinal2 != 1) {
                        ore.o();
                        return;
                    }
                    i2 = kbcVar.getText().h;
                }
            } else if (iD == 1) {
                int iOrdinal3 = appearanceMode.ordinal();
                if (iOrdinal3 != 0 && iOrdinal3 != 1) {
                    ore.o();
                    return;
                }
                i2 = kbcVar.getText().c;
            } else {
                if (iD != 2) {
                    ore.o();
                    return;
                }
                int iOrdinal4 = appearanceMode.ordinal();
                if (iOrdinal4 == 0) {
                    i2 = ((bs0) kbcVar.u().d.g).c;
                } else {
                    if (iOrdinal4 != 1) {
                        ore.o();
                        return;
                    }
                    i2 = ((fn8) kbcVar.u().d.h).d;
                }
            }
        } else if (iOrdinal == 1) {
            int iD2 = qt4.D(i);
            if (iD2 == 0) {
                int iOrdinal5 = appearanceMode.ordinal();
                if (iOrdinal5 == 0) {
                    i2 = kbcVar.getText().g;
                } else {
                    if (iOrdinal5 != 1) {
                        ore.o();
                        return;
                    }
                    i2 = kbcVar.getText().h;
                }
            } else if (iD2 == 1) {
                int iOrdinal6 = appearanceMode.ordinal();
                if (iOrdinal6 != 0 && iOrdinal6 != 1) {
                    ore.o();
                    return;
                }
                i2 = kbcVar.getText().c;
            } else {
                if (iD2 != 2) {
                    ore.o();
                    return;
                }
                int iOrdinal7 = appearanceMode.ordinal();
                if (iOrdinal7 == 0) {
                    i2 = ((ix2) kbcVar.u().d.f).b;
                } else {
                    if (iOrdinal7 != 1) {
                        ore.o();
                        return;
                    }
                    i2 = ((fn8) kbcVar.u().d.b).d;
                }
            }
        } else if (iOrdinal == 2) {
            int iD3 = qt4.D(i);
            if (iD3 == 0) {
                int iOrdinal8 = appearanceMode.ordinal();
                if (iOrdinal8 == 0) {
                    i2 = kbcVar.getText().g;
                } else {
                    if (iOrdinal8 != 1) {
                        ore.o();
                        return;
                    }
                    i2 = kbcVar.getText().h;
                }
            } else if (iD3 == 1) {
                int iOrdinal9 = appearanceMode.ordinal();
                if (iOrdinal9 != 0 && iOrdinal9 != 1) {
                    ore.o();
                    return;
                }
                i2 = kbcVar.getText().c;
            } else {
                if (iD3 != 2) {
                    ore.o();
                    return;
                }
                int iOrdinal10 = appearanceMode.ordinal();
                if (iOrdinal10 == 0) {
                    i2 = ((bs0) kbcVar.u().d.g).c;
                } else {
                    if (iOrdinal10 != 1) {
                        ore.o();
                        return;
                    }
                    i2 = ((fn8) kbcVar.u().d.b).d;
                }
            }
        } else if (iOrdinal == 3) {
            int iD4 = qt4.D(i);
            if (iD4 == 0) {
                int iOrdinal11 = appearanceMode.ordinal();
                if (iOrdinal11 == 0) {
                    i2 = -1;
                } else {
                    if (iOrdinal11 != 1) {
                        ore.o();
                        return;
                    }
                    i2 = kbcVar.getText().f;
                }
            } else if (iD4 == 1) {
                int iOrdinal12 = appearanceMode.ordinal();
                if (iOrdinal12 != 0 && iOrdinal12 != 1) {
                    ore.o();
                    return;
                }
                i2 = kbcVar.getText().c;
            } else {
                if (iD4 != 2) {
                    ore.o();
                    return;
                }
                int iOrdinal13 = appearanceMode.ordinal();
                if (iOrdinal13 == 0) {
                    i2 = ((bs0) kbcVar.u().d.g).c;
                } else {
                    if (iOrdinal13 != 1) {
                        ore.o();
                        return;
                    }
                    i2 = ((ix2) kbcVar.u().d.e).b;
                }
            }
        } else {
            if (iOrdinal != 4) {
                ore.o();
                return;
            }
            int iD5 = qt4.D(i);
            if (iD5 == 0) {
                int iOrdinal14 = appearanceMode.ordinal();
                if (iOrdinal14 == 0) {
                    i2 = -1;
                } else {
                    if (iOrdinal14 != 1) {
                        ore.o();
                        return;
                    }
                    i2 = kbcVar.getText().j;
                }
            } else if (iD5 == 1) {
                int iOrdinal15 = appearanceMode.ordinal();
                if (iOrdinal15 != 0 && iOrdinal15 != 1) {
                    ore.o();
                    return;
                }
                i2 = kbcVar.getText().c;
            } else {
                if (iD5 != 2) {
                    ore.o();
                    return;
                }
                int iOrdinal16 = appearanceMode.ordinal();
                if (iOrdinal16 == 0) {
                    i2 = ((bs0) kbcVar.u().d.g).c;
                } else {
                    if (iOrdinal16 != 1) {
                        ore.o();
                        return;
                    }
                    i2 = ((fn8) kbcVar.u().d.i).d;
                }
            }
        }
        TextPaint textPaint = this.s;
        textPaint.setColor(i2);
        p0c appearance2 = getAppearance();
        q0c appearanceMode2 = getAppearanceMode();
        int iOrdinal17 = appearance2.ordinal();
        if (iOrdinal17 == 0) {
            int iD6 = qt4.D(i);
            if (iD6 == 0) {
                int iOrdinal18 = appearanceMode2.ordinal();
                if (iOrdinal18 == 0) {
                    i3 = kbcVar.y().c;
                } else if (iOrdinal18 != 1) {
                    ore.o();
                    return;
                }
            } else if (iD6 == 1) {
                int iOrdinal19 = appearanceMode2.ordinal();
                if (iOrdinal19 != 0 && iOrdinal19 != 1) {
                    ore.o();
                    return;
                }
                i3 = kbcVar.y().b;
            } else {
                if (iD6 != 2) {
                    ore.o();
                    return;
                }
                int iOrdinal20 = appearanceMode2.ordinal();
                if (iOrdinal20 == 0) {
                    i3 = ((ix2) kbcVar.u().j.b).b;
                } else if (iOrdinal20 != 1) {
                    ore.o();
                    return;
                }
            }
        } else if (iOrdinal17 == 1) {
            int iD7 = qt4.D(i);
            if (iD7 == 0) {
                int iOrdinal21 = appearanceMode2.ordinal();
                if (iOrdinal21 == 0) {
                    i3 = kbcVar.y().c;
                } else if (iOrdinal21 != 1) {
                    ore.o();
                    return;
                }
            } else if (iD7 == 1) {
                int iOrdinal22 = appearanceMode2.ordinal();
                if (iOrdinal22 != 0 && iOrdinal22 != 1) {
                    ore.o();
                    return;
                }
                i3 = kbcVar.y().b;
            } else {
                if (iD7 != 2) {
                    ore.o();
                    return;
                }
                int iOrdinal23 = appearanceMode2.ordinal();
                if (iOrdinal23 == 0) {
                    i3 = ((ix2) kbcVar.u().j.b).b;
                } else {
                    if (iOrdinal23 != 1) {
                        ore.o();
                        return;
                    }
                    i3 = ((ix2) kbcVar.u().j.d).b;
                }
            }
        } else if (iOrdinal17 == 2) {
            int iD8 = qt4.D(i);
            if (iD8 == 0) {
                int iOrdinal24 = appearanceMode2.ordinal();
                if (iOrdinal24 == 0) {
                    i3 = kbcVar.y().c;
                } else if (iOrdinal24 != 1) {
                    ore.o();
                    return;
                }
            } else if (iD8 == 1) {
                int iOrdinal25 = appearanceMode2.ordinal();
                if (iOrdinal25 != 0 && iOrdinal25 != 1) {
                    ore.o();
                    return;
                }
                i3 = kbcVar.y().b;
            } else {
                if (iD8 != 2) {
                    ore.o();
                    return;
                }
                int iOrdinal26 = appearanceMode2.ordinal();
                if (iOrdinal26 == 0) {
                    i3 = ((ix2) kbcVar.u().j.b).b;
                } else {
                    if (iOrdinal26 != 1) {
                        ore.o();
                        return;
                    }
                    i3 = ((ix2) kbcVar.u().j.d).b;
                }
            }
        } else if (iOrdinal17 == 3) {
            int iD9 = qt4.D(i);
            if (iD9 == 0) {
                int iOrdinal27 = appearanceMode2.ordinal();
                if (iOrdinal27 == 0) {
                    i3 = kbcVar.y().e;
                } else if (iOrdinal27 != 1) {
                    ore.o();
                    return;
                }
            } else if (iD9 == 1) {
                int iOrdinal28 = appearanceMode2.ordinal();
                if (iOrdinal28 != 0 && iOrdinal28 != 1) {
                    ore.o();
                    return;
                }
                i3 = kbcVar.y().b;
            } else {
                if (iD9 != 2) {
                    ore.o();
                    return;
                }
                int iOrdinal29 = appearanceMode2.ordinal();
                if (iOrdinal29 == 0) {
                    i3 = ((ix2) kbcVar.u().j.a).b;
                } else {
                    if (iOrdinal29 != 1) {
                        ore.o();
                        return;
                    }
                    i3 = ((ix2) kbcVar.u().j.d).b;
                }
            }
        } else {
            if (iOrdinal17 != 4) {
                ore.o();
                return;
            }
            int iD10 = qt4.D(i);
            if (iD10 == 0) {
                int iOrdinal30 = appearanceMode2.ordinal();
                if (iOrdinal30 == 0) {
                    i3 = kbcVar.y().a;
                } else if (iOrdinal30 != 1) {
                    ore.o();
                    return;
                }
            } else if (iD10 == 1) {
                int iOrdinal31 = appearanceMode2.ordinal();
                if (iOrdinal31 != 0 && iOrdinal31 != 1) {
                    ore.o();
                    return;
                }
                i3 = kbcVar.y().b;
            } else {
                if (iD10 != 2) {
                    ore.o();
                    return;
                }
                int iOrdinal32 = appearanceMode2.ordinal();
                if (iOrdinal32 == 0) {
                    i3 = ((ix2) kbcVar.u().j.c).b;
                } else {
                    if (iOrdinal32 != 1) {
                        ore.o();
                        return;
                    }
                    i3 = ((ix2) kbcVar.u().j.d).b;
                }
            }
        }
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(i3);
        GradientDrawable gradientDrawable = this.o;
        gradientDrawable.setColor(colorStateListValueOf);
        if (getHasBackgroundStroke()) {
            gradientDrawable.setStroke(getBackgroundStrokeWidth(), ColorStateList.valueOf(kbcVar.k().k));
        }
        this.D = (textPaint.getColor() >> 24) & 255;
        invalidate();
    }

    public final void n() {
        this.I = 3;
        ValueAnimator valueAnimator = this.d;
        if (valueAnimator != null) {
            valueAnimator.end();
        }
        this.b = 0;
        int iMeasureText = (int) this.s.measureText("!");
        this.j = iMeasureText;
        this.f = o(iMeasureText, "!");
        if (this.j != this.k) {
            requestLayout();
        }
        invalidate();
    }

    public final StaticLayout o(int i, CharSequence charSequence) {
        return StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.s, i).setAlignment(Layout.Alignment.ALIGN_CENTER).setIncludePad(false).setMaxLines(1).build();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if ((this.e == 1.0f) || this.H != 3) {
            j(canvas);
            return;
        }
        int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null);
        j(canvas);
        float height = getHeight() * 0.15f;
        Matrix matrix = this.G;
        matrix.reset();
        LinearGradient maskGradient = getMaskGradient();
        if (maskGradient != null) {
            maskGradient.setLocalMatrix(matrix);
        }
        canvas.drawRect(0.0f, 0.0f, getWidth(), height, getMaskPaint());
        matrix.reset();
        matrix.setScale(1.0f, -1.0f);
        matrix.postTranslate(0.0f, getHeight());
        LinearGradient maskGradient2 = getMaskGradient();
        if (maskGradient2 != null) {
            maskGradient2.setLocalMatrix(matrix);
        }
        canvas.drawRect(0.0f, getHeight() - height, getWidth(), getHeight(), getMaskPaint());
        canvas.restoreToCount(iSaveLayer);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int iMeasureText;
        super.onMeasure(i, i2);
        Number number = this.b;
        int i3 = this.I;
        TextPaint textPaint = this.s;
        if (i3 == 4 || number == null) {
            iMeasureText = ((int) textPaint.measureText(this.c)) + 8;
            this.j = iMeasureText;
        } else {
            iMeasureText = i(l(number));
        }
        if (getHasBackground()) {
            int i4 = this.l;
            iMeasureText = iMeasureText > i4 / 2 ? iMeasureText + (this.n * 2) : i4;
        }
        Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
        setMeasuredDimension(iMeasureText, Math.max((int) Math.ceil(fontMetrics.descent - fontMetrics.ascent), this.m));
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        m(getTheme());
    }

    public final void setAppearance(p0c p0cVar) {
        this.u.B(this, J[3], p0cVar);
    }

    public final void setAppearanceMode(q0c q0cVar) {
        this.v.B(this, J[4], q0cVar);
    }

    public final void setBackgroundStrokeWidth(int i) {
        this.y.B(this, J[7], Integer.valueOf(i));
    }

    public final void setCircleColor(int i) {
        this.o.setColor(ColorStateList.valueOf(lvb.I0(i, 1.0f)));
        invalidate();
    }

    public final void setCustomTheme(kbc kbcVar) {
        this.t.B(this, J[2], kbcVar);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        m(getTheme());
    }

    public final void setHasBackground(boolean z) {
        this.z.B(this, J[8], Boolean.valueOf(z));
    }

    public final void setHasBackgroundStroke(boolean z) {
        this.x.B(this, J[6], Boolean.valueOf(z));
    }

    public final void setMute(boolean z) {
        this.w.B(this, J[5], Boolean.valueOf(z));
    }

    public final void setNumberFormatter(cf7 cf7Var) {
        this.A = cf7Var;
    }

    public final void setReplaceDuration(long j) {
        this.B = j;
    }

    public final void setReplaceInterpolator(Interpolator interpolator) {
        this.C = interpolator;
    }

    public final void setText(String str) {
        if (r5h.X0(str)) {
            this.c = "";
            this.I = 2;
            ValueAnimator valueAnimator = this.d;
            if (valueAnimator != null) {
                valueAnimator.end();
            }
            this.b = 0;
            this.f = null;
            requestLayout();
            return;
        }
        this.I = 4;
        ValueAnimator valueAnimator2 = this.d;
        if (valueAnimator2 != null) {
            valueAnimator2.end();
        }
        this.b = 0;
        this.c = str;
        int iMeasureText = ((int) this.s.measureText(str)) + 8;
        this.j = iMeasureText;
        this.f = o(iMeasureText, str);
        if (this.j != this.k) {
            requestLayout();
        }
        invalidate();
    }

    public final void setTextColor(int i) {
        int iI0 = lvb.I0(i, 1.0f);
        TextPaint textPaint = this.s;
        textPaint.setColor(iI0);
        this.D = textPaint.getAlpha();
        invalidate();
    }

    public final void setTypography(noh nohVar) {
        setTypographyInternal(nohVar);
    }
}
