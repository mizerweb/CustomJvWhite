package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.Log;
import java.util.BitSet;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class jo9 extends Drawable implements kxf {
    public static final Paint x;
    public io9 a;
    public final hxf[] b;
    public final hxf[] c;
    public final BitSet d;
    public boolean e;
    public final Matrix f;
    public final Path g;
    public final Path h;
    public final RectF i;
    public final RectF j;
    public final Region k;
    public final Region l;
    public ywf m;
    public final Paint n;
    public final Paint o;
    public final swf p;
    public final t3a q;
    public final n5a r;
    public PorterDuffColorFilter s;
    public PorterDuffColorFilter t;
    public int u;
    public final RectF v;
    public final boolean w;

    static {
        Paint paint = new Paint(1);
        x = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public jo9(io9 io9Var) {
        this.b = new hxf[4];
        this.c = new hxf[4];
        this.d = new BitSet(8);
        this.f = new Matrix();
        this.g = new Path();
        this.h = new Path();
        this.i = new RectF();
        this.j = new RectF();
        this.k = new Region();
        this.l = new Region();
        Paint paint = new Paint(1);
        this.n = paint;
        Paint paint2 = new Paint(1);
        this.o = paint2;
        this.p = new swf();
        this.r = Looper.getMainLooper().getThread() == Thread.currentThread() ? zwf.a : new n5a();
        this.v = new RectF();
        this.w = true;
        this.a = io9Var;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        l();
        k(getState());
        this.q = new t3a(this);
    }

    public final void b(RectF rectF, Path path) {
        io9 io9Var = this.a;
        this.r.b(io9Var.a, io9Var.i, rectF, this.q, path);
        if (this.a.h != 1.0f) {
            Matrix matrix = this.f;
            matrix.reset();
            float f = this.a.h;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.v, true);
    }

    public final int c(int i) {
        io9 io9Var = this.a;
        float f = io9Var.m + 0.0f + io9Var.l;
        s36 s36Var = io9Var.b;
        return s36Var != null ? s36Var.a(i, f) : i;
    }

    public final void d(Canvas canvas) {
        if (this.d.cardinality() > 0) {
            Log.w("jo9", "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        int i = this.a.o;
        Path path = this.g;
        swf swfVar = this.p;
        if (i != 0) {
            canvas.drawPath(path, swfVar.a);
        }
        for (int i2 = 0; i2 < 4; i2++) {
            hxf hxfVar = this.b[i2];
            int i3 = this.a.n;
            Matrix matrix = hxf.b;
            hxfVar.a(matrix, swfVar, i3, canvas);
            this.c[i2].a(matrix, swfVar, this.a.n, canvas);
        }
        if (this.w) {
            int iSin = (int) (Math.sin(Math.toRadians(0.0d)) * ((double) this.a.o));
            int iCos = (int) (Math.cos(Math.toRadians(0.0d)) * ((double) this.a.o));
            canvas.translate(-iSin, -iCos);
            canvas.drawPath(path, x);
            canvas.translate(iSin, iCos);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        RectF rectF;
        Paint paint;
        PorterDuffColorFilter porterDuffColorFilter = this.s;
        Paint paint2 = this.n;
        paint2.setColorFilter(porterDuffColorFilter);
        int alpha = paint2.getAlpha();
        int i = this.a.k;
        paint2.setAlpha(((i + (i >>> 7)) * alpha) >>> 8);
        PorterDuffColorFilter porterDuffColorFilter2 = this.t;
        Paint paint3 = this.o;
        paint3.setColorFilter(porterDuffColorFilter2);
        paint3.setStrokeWidth(this.a.j);
        int alpha2 = paint3.getAlpha();
        int i2 = this.a.k;
        paint3.setAlpha(((i2 + (i2 >>> 7)) * alpha2) >>> 8);
        boolean z = this.e;
        RectF rectF2 = this.j;
        Path path = this.h;
        Path path2 = this.g;
        if (z) {
            float strokeWidth = g() ? paint3.getStrokeWidth() / 2.0f : 0.0f;
            ywf ywfVar = this.a.a;
            ux6 ux6Var = new ux6(-strokeWidth);
            ywfVar.getClass();
            r00 r00Var = new r00(ywfVar);
            r00Var.t(ux6Var.a(ywfVar.e));
            r00Var.v(ux6Var.a(ywfVar.f));
            r00Var.n(ux6Var.a(ywfVar.h));
            r00Var.p(ux6Var.a(ywfVar.g));
            ywf ywfVarD = r00Var.d();
            this.m = ywfVarD;
            float f = this.a.i;
            rectF2.set(f());
            float strokeWidth2 = g() ? paint3.getStrokeWidth() / 2.0f : 0.0f;
            rectF2.inset(strokeWidth2, strokeWidth2);
            rectF = rectF2;
            this.r.b(ywfVarD, f, rectF, null, path);
            b(f(), path2);
            this.e = false;
        } else {
            rectF = rectF2;
        }
        io9 io9Var = this.a;
        io9Var.getClass();
        if (io9Var.n > 0 && !this.a.a.d(f()) && !path2.isConvex() && Build.VERSION.SDK_INT < 29) {
            canvas.save();
            canvas.translate((int) (((double) this.a.o) * Math.sin(Math.toRadians(0.0d))), (int) (((double) this.a.o) * Math.cos(Math.toRadians(0.0d))));
            if (this.w) {
                RectF rectF3 = this.v;
                int iWidth = (int) (rectF3.width() - getBounds().width());
                int iHeight = (int) (rectF3.height() - getBounds().height());
                if (iWidth < 0 || iHeight < 0) {
                    ore.k("Invalid shadow bounds. Check that the treatments result in a valid path.");
                    return;
                }
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap((this.a.n * 2) + ((int) rectF3.width()) + iWidth, (this.a.n * 2) + ((int) rectF3.height()) + iHeight, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(bitmapCreateBitmap);
                float f2 = (getBounds().left - this.a.n) - iWidth;
                float f3 = (getBounds().top - this.a.n) - iHeight;
                canvas2.translate(-f2, -f3);
                d(canvas2);
                canvas.drawBitmap(bitmapCreateBitmap, f2, f3, (Paint) null);
                bitmapCreateBitmap.recycle();
                canvas.restore();
            } else {
                d(canvas);
                canvas.restore();
            }
        }
        io9 io9Var2 = this.a;
        Paint.Style style = io9Var2.p;
        if (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL) {
            e(canvas, paint2, path2, io9Var2.a, f());
        }
        if (g()) {
            ywf ywfVar2 = this.m;
            rectF.set(f());
            float strokeWidth3 = g() ? paint3.getStrokeWidth() / 2.0f : 0.0f;
            rectF.inset(strokeWidth3, strokeWidth3);
            paint = paint3;
            e(canvas, paint, path, ywfVar2, rectF);
        } else {
            paint = paint3;
        }
        paint2.setAlpha(alpha);
        paint.setAlpha(alpha2);
    }

    public final void e(Canvas canvas, Paint paint, Path path, ywf ywfVar, RectF rectF) {
        if (!ywfVar.d(rectF)) {
            canvas.drawPath(path, paint);
        } else {
            float fA = ywfVar.f.a(rectF) * this.a.i;
            canvas.drawRoundRect(rectF, fA, fA, paint);
        }
    }

    public final RectF f() {
        Rect bounds = getBounds();
        RectF rectF = this.i;
        rectF.set(bounds);
        return rectF;
    }

    public final boolean g() {
        Paint.Style style = this.a.p;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.o.getStrokeWidth() > 0.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.a.k;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        this.a.getClass();
        if (this.a.a.d(f())) {
            outline.setRoundRect(getBounds(), this.a.a.e.a(f()) * this.a.i);
            return;
        }
        RectF rectFF = f();
        Path path = this.g;
        b(rectFF, path);
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            ut5.a(outline, path);
            return;
        }
        if (i >= 29) {
            try {
                tt5.a(outline, path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            tt5.a(outline, path);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.a.g;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.k;
        region.set(bounds);
        RectF rectFF = f();
        Path path = this.g;
        b(rectFF, path);
        Region region2 = this.l;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    public final void h(Context context) {
        this.a.b = new s36(context);
        m();
    }

    public final void i(float f) {
        io9 io9Var = this.a;
        if (io9Var.m != f) {
            io9Var.m = f;
            m();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.e = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (super.isStateful()) {
            return true;
        }
        ColorStateList colorStateList = this.a.e;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        this.a.getClass();
        ColorStateList colorStateList2 = this.a.d;
        if (colorStateList2 != null && colorStateList2.isStateful()) {
            return true;
        }
        ColorStateList colorStateList3 = this.a.c;
        return colorStateList3 != null && colorStateList3.isStateful();
    }

    public final void j(ColorStateList colorStateList) {
        io9 io9Var = this.a;
        if (io9Var.c != colorStateList) {
            io9Var.c = colorStateList;
            onStateChange(getState());
        }
    }

    public final boolean k(int[] iArr) {
        boolean z;
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        if (this.a.c == null || color2 == (colorForState2 = this.a.c.getColorForState(iArr, (color2 = (paint2 = this.n).getColor())))) {
            z = false;
        } else {
            paint2.setColor(colorForState2);
            z = true;
        }
        if (this.a.d == null || color == (colorForState = this.a.d.getColorForState(iArr, (color = (paint = this.o).getColor())))) {
            return z;
        }
        paint.setColor(colorForState);
        return true;
    }

    public final boolean l() {
        PorterDuffColorFilter porterDuffColorFilter;
        PorterDuffColorFilter porterDuffColorFilter2 = this.s;
        PorterDuffColorFilter porterDuffColorFilter3 = this.t;
        io9 io9Var = this.a;
        ColorStateList colorStateList = io9Var.e;
        PorterDuff.Mode mode = io9Var.f;
        if (colorStateList == null || mode == null) {
            int color = this.n.getColor();
            int iC = c(color);
            this.u = iC;
            porterDuffColorFilter = iC != color ? new PorterDuffColorFilter(iC, PorterDuff.Mode.SRC_IN) : null;
        } else {
            int iC2 = c(colorStateList.getColorForState(getState(), 0));
            this.u = iC2;
            porterDuffColorFilter = new PorterDuffColorFilter(iC2, mode);
        }
        this.s = porterDuffColorFilter;
        this.a.getClass();
        this.t = null;
        this.a.getClass();
        return (Objects.equals(porterDuffColorFilter2, this.s) && Objects.equals(porterDuffColorFilter3, this.t)) ? false : true;
    }

    public final void m() {
        io9 io9Var = this.a;
        float f = io9Var.m + 0.0f;
        io9Var.n = (int) Math.ceil(0.75f * f);
        this.a.o = (int) Math.ceil(f * 0.25f);
        l();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        io9 io9Var = this.a;
        io9 io9Var2 = new io9();
        io9Var2.c = null;
        io9Var2.d = null;
        io9Var2.e = null;
        io9Var2.f = PorterDuff.Mode.SRC_IN;
        io9Var2.g = null;
        io9Var2.h = 1.0f;
        io9Var2.i = 1.0f;
        io9Var2.k = 255;
        io9Var2.l = 0.0f;
        io9Var2.m = 0.0f;
        io9Var2.n = 0;
        io9Var2.o = 0;
        io9Var2.p = Paint.Style.FILL_AND_STROKE;
        io9Var2.a = io9Var.a;
        io9Var2.b = io9Var.b;
        io9Var2.j = io9Var.j;
        io9Var2.c = io9Var.c;
        io9Var2.d = io9Var.d;
        io9Var2.f = io9Var.f;
        io9Var2.e = io9Var.e;
        io9Var2.k = io9Var.k;
        io9Var2.h = io9Var.h;
        io9Var2.o = io9Var.o;
        io9Var2.i = io9Var.i;
        io9Var2.l = io9Var.l;
        io9Var2.m = io9Var.m;
        io9Var2.n = io9Var.n;
        io9Var2.p = io9Var.p;
        Rect rect = io9Var.g;
        if (rect != null) {
            io9Var2.g = new Rect(rect);
        }
        this.a = io9Var2;
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.e = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable, defpackage.fmh
    public boolean onStateChange(int[] iArr) {
        boolean z = k(iArr) || l();
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        io9 io9Var = this.a;
        if (io9Var.k != i) {
            io9Var.k = i;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.a.getClass();
        super.invalidateSelf();
    }

    @Override // defpackage.kxf
    public final void setShapeAppearanceModel(ywf ywfVar) {
        this.a.a = ywfVar;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.a.e = colorStateList;
        l();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        io9 io9Var = this.a;
        if (io9Var.f != mode) {
            io9Var.f = mode;
            l();
            super.invalidateSelf();
        }
    }

    public jo9(ywf ywfVar) {
        io9 io9Var = new io9();
        io9Var.c = null;
        io9Var.d = null;
        io9Var.e = null;
        io9Var.f = PorterDuff.Mode.SRC_IN;
        io9Var.g = null;
        io9Var.h = 1.0f;
        io9Var.i = 1.0f;
        io9Var.k = 255;
        io9Var.l = 0.0f;
        io9Var.m = 0.0f;
        io9Var.n = 0;
        io9Var.o = 0;
        io9Var.p = Paint.Style.FILL_AND_STROKE;
        io9Var.a = ywfVar;
        io9Var.b = null;
        this(io9Var);
    }

    public jo9() {
        ywf ywfVar = new ywf();
        ywfVar.a = new ave();
        ywfVar.b = new ave();
        ywfVar.c = new ave();
        ywfVar.d = new ave();
        ywfVar.e = new f0(0.0f);
        ywfVar.f = new f0(0.0f);
        ywfVar.g = new f0(0.0f);
        ywfVar.h = new f0(0.0f);
        ywfVar.i = new cy5(0);
        ywfVar.j = new cy5(0);
        ywfVar.k = new cy5(0);
        ywfVar.l = new cy5(0);
        this(ywfVar);
    }
}
