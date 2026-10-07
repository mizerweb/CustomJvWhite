package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class dq3 extends jo9 implements Drawable.Callback, fmh {
    public static final int[] f2 = {R.attr.state_enabled};
    public static final ShapeDrawable g2 = new ShapeDrawable(new OvalShape());
    public float A;
    public float A1;
    public float B;
    public float B1;
    public ColorStateList C;
    public float C1;
    public float D;
    public float D1;
    public ColorStateList E;
    public final Context E1;
    public CharSequence F;
    public final Paint F1;
    public boolean G;
    public final Paint.FontMetrics G1;
    public Drawable H;
    public final RectF H1;
    public ColorStateList I;
    public final PointF I1;
    public float J;
    public final Path J1;
    public boolean K;
    public final gmh K1;
    public int L1;
    public int M1;
    public int N1;
    public int O1;
    public int P1;
    public int Q1;
    public boolean R1;
    public int S1;
    public int T1;
    public ColorFilter U1;
    public PorterDuffColorFilter V1;
    public ColorStateList W1;
    public boolean X;
    public PorterDuff.Mode X1;
    public Drawable Y;
    public int[] Y1;
    public RippleDrawable Z;
    public ColorStateList Z1;
    public WeakReference a2;
    public TextUtils.TruncateAt b2;
    public boolean c2;
    public int d2;
    public boolean e2;
    public ColorStateList n1;
    public float o1;
    public SpannableStringBuilder p1;
    public boolean q1;
    public boolean r1;
    public Drawable s1;
    public ColorStateList t1;
    public o1b u1;
    public o1b v1;
    public float w1;
    public float x1;
    public ColorStateList y;
    public float y1;
    public ColorStateList z;
    public float z1;

    public dq3(Context context) {
        super(ywf.b(context, null, ru.oneme.app.R.attr.chipStyle, ru.oneme.app.R.style.Widget_MaterialComponents_Chip_Action).d());
        this.B = -1.0f;
        this.F1 = new Paint(1);
        this.G1 = new Paint.FontMetrics();
        this.H1 = new RectF();
        this.I1 = new PointF();
        this.J1 = new Path();
        this.T1 = 255;
        this.X1 = PorterDuff.Mode.SRC_IN;
        this.a2 = new WeakReference(null);
        h(context);
        this.E1 = context;
        gmh gmhVar = new gmh(this);
        this.K1 = gmhVar;
        this.F = "";
        gmhVar.a.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = f2;
        setState(iArr);
        if (!Arrays.equals(this.Y1, iArr)) {
            this.Y1 = iArr;
            if (S()) {
                v(getState(), iArr);
            }
        }
        this.c2 = true;
        int[] iArr2 = pqe.a;
        g2.setTint(-1);
    }

    public static void T(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public static boolean s(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    public static boolean t(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    public final void A(float f) {
        if (this.B != f) {
            this.B = f;
            ywf ywfVar = this.a.a;
            ywfVar.getClass();
            yab yabVar = ywfVar.a;
            yab yabVar2 = ywfVar.b;
            yab yabVar3 = ywfVar.c;
            yab yabVar4 = ywfVar.d;
            cy5 cy5Var = ywfVar.i;
            cy5 cy5Var2 = ywfVar.j;
            cy5 cy5Var3 = ywfVar.k;
            cy5 cy5Var4 = ywfVar.l;
            f0 f0Var = new f0(f);
            f0 f0Var2 = new f0(f);
            f0 f0Var3 = new f0(f);
            f0 f0Var4 = new f0(f);
            ywf ywfVar2 = new ywf();
            ywfVar2.a = yabVar;
            ywfVar2.b = yabVar2;
            ywfVar2.c = yabVar3;
            ywfVar2.d = yabVar4;
            ywfVar2.e = f0Var;
            ywfVar2.f = f0Var2;
            ywfVar2.g = f0Var3;
            ywfVar2.h = f0Var4;
            ywfVar2.i = cy5Var;
            ywfVar2.j = cy5Var2;
            ywfVar2.k = cy5Var3;
            ywfVar2.l = cy5Var4;
            setShapeAppearanceModel(ywfVar2);
        }
    }

    public final void B(Drawable drawable) {
        Drawable drawable2 = this.H;
        if (drawable2 == null) {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float fP = p();
            this.H = drawable != null ? drawable.mutate() : null;
            float fP2 = p();
            T(drawable2);
            if (R()) {
                n(this.H);
            }
            invalidateSelf();
            if (fP != fP2) {
                u();
            }
        }
    }

    public final void C(float f) {
        if (this.J != f) {
            float fP = p();
            this.J = f;
            float fP2 = p();
            invalidateSelf();
            if (fP != fP2) {
                u();
            }
        }
    }

    public final void D(ColorStateList colorStateList) {
        this.K = true;
        if (this.I != colorStateList) {
            this.I = colorStateList;
            if (R()) {
                this.H.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void E(boolean z) {
        if (this.G != z) {
            boolean zR = R();
            this.G = z;
            boolean zR2 = R();
            if (zR != zR2) {
                Drawable drawable = this.H;
                if (zR2) {
                    n(drawable);
                } else {
                    T(drawable);
                }
                invalidateSelf();
                u();
            }
        }
    }

    public final void F(ColorStateList colorStateList) {
        if (this.C != colorStateList) {
            this.C = colorStateList;
            if (this.e2) {
                io9 io9Var = this.a;
                if (io9Var.d != colorStateList) {
                    io9Var.d = colorStateList;
                    onStateChange(getState());
                }
            }
            onStateChange(getState());
        }
    }

    public final void G(float f) {
        if (this.D != f) {
            this.D = f;
            this.F1.setStrokeWidth(f);
            if (this.e2) {
                this.a.j = f;
                invalidateSelf();
            }
            invalidateSelf();
        }
    }

    public final void H(Drawable drawable) {
        Drawable drawable2 = this.Y;
        if (drawable2 == null) {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float fQ = q();
            this.Y = drawable != null ? drawable.mutate() : null;
            int[] iArr = pqe.a;
            this.Z = new RippleDrawable(pqe.c(this.E), this.Y, g2);
            float fQ2 = q();
            T(drawable2);
            if (S()) {
                n(this.Y);
            }
            invalidateSelf();
            if (fQ != fQ2) {
                u();
            }
        }
    }

    public final void I(float f) {
        if (this.C1 != f) {
            this.C1 = f;
            invalidateSelf();
            if (S()) {
                u();
            }
        }
    }

    public final void J(float f) {
        if (this.o1 != f) {
            this.o1 = f;
            invalidateSelf();
            if (S()) {
                u();
            }
        }
    }

    public final void K(float f) {
        if (this.B1 != f) {
            this.B1 = f;
            invalidateSelf();
            if (S()) {
                u();
            }
        }
    }

    public final void L(ColorStateList colorStateList) {
        if (this.n1 != colorStateList) {
            this.n1 = colorStateList;
            if (S()) {
                this.Y.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void M(boolean z) {
        if (this.X != z) {
            boolean zS = S();
            this.X = z;
            boolean zS2 = S();
            if (zS != zS2) {
                Drawable drawable = this.Y;
                if (zS2) {
                    n(drawable);
                } else {
                    T(drawable);
                }
                invalidateSelf();
                u();
            }
        }
    }

    public final void N(float f) {
        if (this.y1 != f) {
            float fP = p();
            this.y1 = f;
            float fP2 = p();
            invalidateSelf();
            if (fP != fP2) {
                u();
            }
        }
    }

    public final void O(float f) {
        if (this.x1 != f) {
            float fP = p();
            this.x1 = f;
            float fP2 = p();
            invalidateSelf();
            if (fP != fP2) {
                u();
            }
        }
    }

    public final void P(ColorStateList colorStateList) {
        if (this.E != colorStateList) {
            this.E = colorStateList;
            this.Z1 = null;
            onStateChange(getState());
        }
    }

    public final boolean Q() {
        return this.r1 && this.s1 != null && this.R1;
    }

    public final boolean R() {
        return this.G && this.H != null;
    }

    public final boolean S() {
        return this.X && this.Y != null;
    }

    @Override // defpackage.fmh
    public final void a() {
        u();
        invalidateSelf();
    }

    @Override // defpackage.jo9, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i;
        Canvas canvas2;
        int iSaveLayerAlpha;
        float f;
        int i2;
        Rect bounds = getBounds();
        if (bounds.isEmpty() || (i = this.T1) == 0) {
            return;
        }
        if (i < 255) {
            canvas2 = canvas;
            iSaveLayerAlpha = canvas2.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, i);
        } else {
            canvas2 = canvas;
            iSaveLayerAlpha = 0;
        }
        boolean z = this.e2;
        Paint paint = this.F1;
        RectF rectF = this.H1;
        if (!z) {
            paint.setColor(this.L1);
            paint.setStyle(Paint.Style.FILL);
            rectF.set(bounds);
            canvas2.drawRoundRect(rectF, r(), r(), paint);
        }
        if (!this.e2) {
            paint.setColor(this.M1);
            paint.setStyle(Paint.Style.FILL);
            ColorFilter colorFilter = this.U1;
            if (colorFilter == null) {
                colorFilter = this.V1;
            }
            paint.setColorFilter(colorFilter);
            rectF.set(bounds);
            canvas2.drawRoundRect(rectF, r(), r(), paint);
        }
        if (this.e2) {
            super.draw(canvas);
        }
        if (this.D > 0.0f && !this.e2) {
            paint.setColor(this.O1);
            paint.setStyle(Paint.Style.STROKE);
            if (!this.e2) {
                ColorFilter colorFilter2 = this.U1;
                if (colorFilter2 == null) {
                    colorFilter2 = this.V1;
                }
                paint.setColorFilter(colorFilter2);
            }
            float f3 = bounds.left;
            float f4 = this.D / 2.0f;
            rectF.set(f3 + f4, bounds.top + f4, bounds.right - f4, bounds.bottom - f4);
            float f5 = this.B - (this.D / 2.0f);
            canvas2.drawRoundRect(rectF, f5, f5, paint);
        }
        paint.setColor(this.P1);
        paint.setStyle(Paint.Style.FILL);
        rectF.set(bounds);
        if (this.e2) {
            RectF rectF2 = new RectF(bounds);
            io9 io9Var = this.a;
            ywf ywfVar = io9Var.a;
            float f6 = io9Var.i;
            t3a t3aVar = this.q;
            n5a n5aVar = this.r;
            Path path = this.J1;
            n5aVar.b(ywfVar, f6, rectF2, t3aVar, path);
            e(canvas2, paint, path, this.a.a, f());
        } else {
            canvas2.drawRoundRect(rectF, r(), r(), paint);
        }
        if (R()) {
            o(bounds, rectF);
            float f7 = rectF.left;
            float f8 = rectF.top;
            canvas2.translate(f7, f8);
            this.H.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.H.draw(canvas2);
            canvas2.translate(-f7, -f8);
        }
        if (Q()) {
            o(bounds, rectF);
            float f9 = rectF.left;
            float f10 = rectF.top;
            canvas2.translate(f9, f10);
            this.s1.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.s1.draw(canvas2);
            canvas2.translate(-f9, -f10);
        }
        if (this.c2 && this.F != null) {
            PointF pointF = this.I1;
            pointF.set(0.0f, 0.0f);
            Paint.Align align = Paint.Align.LEFT;
            CharSequence charSequence = this.F;
            gmh gmhVar = this.K1;
            if (charSequence != null) {
                float fP = p() + this.w1 + this.z1;
                if (getLayoutDirection() == 0) {
                    pointF.x = bounds.left + fP;
                } else {
                    pointF.x = bounds.right - fP;
                    align = Paint.Align.RIGHT;
                }
                float fCenterY = bounds.centerY();
                TextPaint textPaint = gmhVar.a;
                Paint.FontMetrics fontMetrics = this.G1;
                textPaint.getFontMetrics(fontMetrics);
                pointF.y = fCenterY - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f);
            }
            rectF.setEmpty();
            if (this.F != null) {
                float fP2 = p() + this.w1 + this.z1;
                float fQ = q() + this.D1 + this.A1;
                int layoutDirection = getLayoutDirection();
                int i3 = bounds.left;
                if (layoutDirection == 0) {
                    rectF.left = i3 + fP2;
                    rectF.right = bounds.right - fQ;
                } else {
                    rectF.left = i3 + fQ;
                    rectF.right = bounds.right - fP2;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
            zlh zlhVar = gmhVar.g;
            TextPaint textPaint2 = gmhVar.a;
            if (zlhVar != null) {
                textPaint2.drawableState = getState();
                gmhVar.g.e(this.E1, textPaint2, gmhVar.b);
            }
            textPaint2.setTextAlign(align);
            String string = this.F.toString();
            if (gmhVar.e) {
                gmhVar.a(string);
                f = gmhVar.c;
            } else {
                f = gmhVar.c;
            }
            boolean z2 = Math.round(f) > Math.round(rectF.width());
            if (z2) {
                int iSave = canvas2.save();
                canvas2.clipRect(rectF);
                i2 = iSave;
            } else {
                i2 = 0;
            }
            CharSequence charSequenceEllipsize = this.F;
            if (z2 && this.b2 != null) {
                charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, textPaint2, rectF.width(), this.b2);
            }
            canvas.drawText(charSequenceEllipsize, 0, charSequenceEllipsize.length(), pointF.x, pointF.y, textPaint2);
            canvas2 = canvas;
            if (z2) {
                canvas2.restoreToCount(i2);
            }
        }
        if (S()) {
            rectF.setEmpty();
            if (S()) {
                float f11 = this.D1 + this.C1;
                if (getLayoutDirection() == 0) {
                    float f12 = bounds.right - f11;
                    rectF.right = f12;
                    rectF.left = f12 - this.o1;
                } else {
                    float f13 = bounds.left + f11;
                    rectF.left = f13;
                    rectF.right = f13 + this.o1;
                }
                float fExactCenterY = bounds.exactCenterY();
                float f14 = this.o1;
                float f15 = fExactCenterY - (f14 / 2.0f);
                rectF.top = f15;
                rectF.bottom = f15 + f14;
            }
            float f16 = rectF.left;
            float f17 = rectF.top;
            canvas2.translate(f16, f17);
            this.Y.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            int[] iArr = pqe.a;
            this.Z.setBounds(this.Y.getBounds());
            this.Z.jumpToCurrentState();
            this.Z.draw(canvas2);
            canvas2.translate(-f16, -f17);
        }
        if (this.T1 < 255) {
            canvas2.restoreToCount(iSaveLayerAlpha);
        }
    }

    @Override // defpackage.jo9, android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.T1;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.U1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.A;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        float fP = p() + this.w1 + this.z1;
        String string = this.F.toString();
        gmh gmhVar = this.K1;
        if (gmhVar.e) {
            gmhVar.a(string);
        }
        return Math.min(Math.round(q() + gmhVar.c + fP + this.A1 + this.D1), this.d2);
    }

    @Override // defpackage.jo9, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // defpackage.jo9, android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        Outline outline2;
        if (this.e2) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline2 = outline;
            outline2.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.A, this.B);
        } else {
            outline.setRoundRect(bounds, this.B);
            outline2 = outline;
        }
        outline2.setAlpha(this.T1 / 255.0f);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // defpackage.jo9, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        if (s(this.y) || s(this.z) || s(this.C)) {
            return true;
        }
        zlh zlhVar = this.K1.g;
        if (zlhVar == null || (colorStateList = zlhVar.j) == null || !colorStateList.isStateful()) {
            return (this.r1 && this.s1 != null && this.q1) || t(this.H) || t(this.s1) || s(this.W1);
        }
        return true;
    }

    public final void n(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        drawable.setLayoutDirection(getLayoutDirection());
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.Y) {
            if (drawable.isStateful()) {
                drawable.setState(this.Y1);
            }
            drawable.setTintList(this.n1);
            return;
        }
        Drawable drawable2 = this.H;
        if (drawable == drawable2 && this.K) {
            drawable2.setTintList(this.I);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    public final void o(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (R() || Q()) {
            float f = this.w1 + this.x1;
            Drawable drawable = this.R1 ? this.s1 : this.H;
            float intrinsicWidth = this.J;
            if (intrinsicWidth <= 0.0f && drawable != null) {
                intrinsicWidth = drawable.getIntrinsicWidth();
            }
            if (getLayoutDirection() == 0) {
                float f3 = rect.left + f;
                rectF.left = f3;
                rectF.right = f3 + intrinsicWidth;
            } else {
                float f4 = rect.right - f;
                rectF.right = f4;
                rectF.left = f4 - intrinsicWidth;
            }
            Drawable drawable2 = this.R1 ? this.s1 : this.H;
            float fCeil = this.J;
            if (fCeil <= 0.0f && drawable2 != null) {
                fCeil = (float) Math.ceil(e9i.J(this.E1, 24));
                if (drawable2.getIntrinsicHeight() <= fCeil) {
                    fCeil = drawable2.getIntrinsicHeight();
                }
            }
            float fExactCenterY = rect.exactCenterY() - (fCeil / 2.0f);
            rectF.top = fExactCenterY;
            rectF.bottom = fExactCenterY + fCeil;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i) {
        boolean zOnLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (R()) {
            zOnLayoutDirectionChanged |= tsl.c(i, this.H);
        }
        if (Q()) {
            zOnLayoutDirectionChanged |= tsl.c(i, this.s1);
        }
        if (S()) {
            zOnLayoutDirectionChanged |= tsl.c(i, this.Y);
        }
        if (!zOnLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        boolean zOnLevelChange = super.onLevelChange(i);
        if (R()) {
            zOnLevelChange |= this.H.setLevel(i);
        }
        if (Q()) {
            zOnLevelChange |= this.s1.setLevel(i);
        }
        if (S()) {
            zOnLevelChange |= this.Y.setLevel(i);
        }
        if (zOnLevelChange) {
            invalidateSelf();
        }
        return zOnLevelChange;
    }

    @Override // defpackage.jo9, android.graphics.drawable.Drawable, defpackage.fmh
    public final boolean onStateChange(int[] iArr) {
        if (this.e2) {
            super.onStateChange(iArr);
        }
        return v(iArr, this.Y1);
    }

    public final float p() {
        if (!R() && !Q()) {
            return 0.0f;
        }
        float f = this.x1;
        Drawable drawable = this.R1 ? this.s1 : this.H;
        float intrinsicWidth = this.J;
        if (intrinsicWidth <= 0.0f && drawable != null) {
            intrinsicWidth = drawable.getIntrinsicWidth();
        }
        return intrinsicWidth + f + this.y1;
    }

    public final float q() {
        if (S()) {
            return this.B1 + this.o1 + this.C1;
        }
        return 0.0f;
    }

    public final float r() {
        return this.e2 ? this.a.a.e.a(f()) : this.B;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    @Override // defpackage.jo9, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.T1 != i) {
            this.T1 = i;
            invalidateSelf();
        }
    }

    @Override // defpackage.jo9, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.U1 != colorFilter) {
            this.U1 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // defpackage.jo9, android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (this.W1 != colorStateList) {
            this.W1 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // defpackage.jo9, android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        if (this.X1 != mode) {
            this.X1 = mode;
            ColorStateList colorStateList = this.W1;
            this.V1 = (colorStateList == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (R()) {
            visible |= this.H.setVisible(z, z2);
        }
        if (Q()) {
            visible |= this.s1.setVisible(z, z2);
        }
        if (S()) {
            visible |= this.Y.setVisible(z, z2);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public final void u() {
        cq3 cq3Var = (cq3) this.a2.get();
        if (cq3Var != null) {
            cq3Var.b(cq3Var.q);
            cq3Var.requestLayout();
            cq3Var.invalidateOutline();
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public final boolean v(int[] iArr, int[] iArr2) {
        boolean z;
        boolean z2;
        ColorStateList colorStateList;
        boolean zOnStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList2 = this.y;
        int iC = c(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.L1) : 0);
        boolean state = true;
        if (this.L1 != iC) {
            this.L1 = iC;
            zOnStateChange = true;
        }
        ColorStateList colorStateList3 = this.z;
        int iC2 = c(colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.M1) : 0);
        if (this.M1 != iC2) {
            this.M1 = iC2;
            zOnStateChange = true;
        }
        int iC3 = mx3.c(iC2, iC);
        if ((this.N1 != iC3) | (this.a.c == null)) {
            this.N1 = iC3;
            j(ColorStateList.valueOf(iC3));
            zOnStateChange = true;
        }
        ColorStateList colorStateList4 = this.C;
        int colorForState = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.O1) : 0;
        if (this.O1 != colorForState) {
            this.O1 = colorForState;
            zOnStateChange = true;
        }
        int colorForState2 = (this.Z1 == null || !pqe.d(iArr)) ? 0 : this.Z1.getColorForState(iArr, this.P1);
        if (this.P1 != colorForState2) {
            this.P1 = colorForState2;
        }
        zlh zlhVar = this.K1.g;
        int colorForState3 = (zlhVar == null || (colorStateList = zlhVar.j) == null) ? 0 : colorStateList.getColorForState(iArr, this.Q1);
        if (this.Q1 != colorForState3) {
            this.Q1 = colorForState3;
            zOnStateChange = true;
        }
        int[] state2 = getState();
        if (state2 != null) {
            int length = state2.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    if (state2[i] != 16842912) {
                        i++;
                    } else if (this.q1) {
                        z = true;
                        break;
                    }
                }
                z = false;
                break;
            }
        } else {
            z = false;
            break;
        }
        if (this.R1 == z || this.s1 == null) {
            z2 = false;
        } else {
            float fP = p();
            this.R1 = z;
            if (fP != p()) {
                zOnStateChange = true;
                z2 = true;
            } else {
                z2 = false;
                zOnStateChange = true;
            }
        }
        ColorStateList colorStateList5 = this.W1;
        int colorForState4 = colorStateList5 != null ? colorStateList5.getColorForState(iArr, this.S1) : 0;
        if (this.S1 != colorForState4) {
            this.S1 = colorForState4;
            ColorStateList colorStateList6 = this.W1;
            PorterDuff.Mode mode = this.X1;
            this.V1 = (colorStateList6 == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList6.getColorForState(getState(), 0), mode);
        } else {
            state = zOnStateChange;
        }
        if (t(this.H)) {
            state |= this.H.setState(iArr);
        }
        if (t(this.s1)) {
            state |= this.s1.setState(iArr);
        }
        if (t(this.Y)) {
            int[] iArr3 = new int[iArr.length + iArr2.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
            state |= this.Y.setState(iArr3);
        }
        int[] iArr4 = pqe.a;
        if (t(this.Z)) {
            state |= this.Z.setState(iArr2);
        }
        if (state) {
            invalidateSelf();
        }
        if (z2) {
            u();
        }
        return state;
    }

    public final void w(boolean z) {
        if (this.q1 != z) {
            this.q1 = z;
            float fP = p();
            if (!z && this.R1) {
                this.R1 = false;
            }
            float fP2 = p();
            invalidateSelf();
            if (fP != fP2) {
                u();
            }
        }
    }

    public final void x(Drawable drawable) {
        if (this.s1 != drawable) {
            float fP = p();
            this.s1 = drawable;
            float fP2 = p();
            T(this.s1);
            n(this.s1);
            invalidateSelf();
            if (fP != fP2) {
                u();
            }
        }
    }

    public final void y(ColorStateList colorStateList) {
        Drawable drawable;
        if (this.t1 != colorStateList) {
            this.t1 = colorStateList;
            if (this.r1 && (drawable = this.s1) != null && this.q1) {
                drawable.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void z(boolean z) {
        if (this.r1 != z) {
            boolean zQ = Q();
            this.r1 = z;
            boolean zQ2 = Q();
            if (zQ != zQ2) {
                Drawable drawable = this.s1;
                if (zQ2) {
                    n(drawable);
                } else {
                    T(drawable);
                }
                invalidateSelf();
                u();
            }
        }
    }
}
