package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes3.dex */
public final class sbf extends tee implements eph {
    public final qbf a;
    public final int b;
    public final cf7 c;
    public final cf7 d;
    public final kbc e;
    public final Paint f;
    public final Paint g;
    public final RectF h;
    public final Rect i;
    public final f8b j;
    public final f8b k;
    public final f8b l;
    public final float[] m;
    public final Path n;
    public final v56 o;

    public sbf(kbc kbcVar, qbf qbfVar, cf7 cf7Var, bad badVar, kbc kbcVar2, int i) {
        int i2 = (i & 4) != 0 ? 4 : 0;
        cf7Var = (i & 8) != 0 ? new skd(28) : cf7Var;
        cf7 skdVar = (i & 16) != 0 ? new skd(29) : badVar;
        kbcVar2 = (i & 32) != 0 ? null : kbcVar2;
        this.a = qbfVar;
        this.b = i2;
        this.c = cf7Var;
        this.d = skdVar;
        this.e = kbcVar2;
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        this.f = paint;
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(yl5.d().getDisplayMetrics().density * 2.0f);
        this.g = paint2;
        this.h = new RectF();
        this.i = new Rect();
        f8b f8bVar = jj8.a;
        this.j = new f8b();
        this.k = new f8b();
        this.l = new f8b();
        this.m = new float[8];
        this.n = new Path();
        this.o = new v56(9, (byte) 0);
        onThemeChanged(kbcVar);
    }

    public static final void i(sbf sbfVar, Canvas canvas, ufe ufeVar) {
        Path path = sbfVar.n;
        Paint paint = sbfVar.g;
        RectF rectF = sbfVar.h;
        float[] fArr = sbfVar.m;
        path.addRoundRect(rectF, fArr, Path.Direction.CCW);
        canvas.drawPath(path, sbfVar.f);
        int i = ufeVar.a;
        if (i != Integer.MIN_VALUE) {
            paint.setColor(i);
            canvas.drawPath(path, paint);
        }
        path.reset();
        rectF.set(Float.MAX_VALUE, Float.MAX_VALUE, Float.MIN_VALUE, Float.MIN_VALUE);
        a.V0(fArr, 0.0f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.tee
    public final void f(Rect rect, View view, RecyclerView recyclerView, hfe hfeVar) {
        int iP = RecyclerView.P(view);
        if (iP == -1) {
            return;
        }
        int iE = this.a.e(iP);
        f8b f8bVar = this.j;
        f8bVar.i(iP);
        f8b f8bVar2 = this.k;
        f8bVar2.i(iP);
        f8b f8bVar3 = this.l;
        f8bVar3.i(iP);
        int i = iE == 0 ? -1 : rbf.$EnumSwitchMapping$0[qt4.D(iE)];
        if (i != -1) {
            int i2 = this.b;
            if (i == 1) {
                rect.top = zo5.b(i2, yl5.d().getDisplayMetrics().density, rect.top);
                f8bVar.a(iP);
                oqe oqeVar = view instanceof oqe ? (oqe) view : null;
                if (oqeVar != null) {
                    oqeVar.setRippleMask(new RoundRectShape(new float[]{yl5.d().getDisplayMetrics().density * 16.0f, yl5.d().getDisplayMetrics().density * 16.0f, yl5.d().getDisplayMetrics().density * 16.0f, yl5.d().getDisplayMetrics().density * 16.0f, 0.0f, 0.0f, 0.0f, 0.0f}, null, null));
                }
            } else if (i == 2) {
                rect.bottom = zo5.b(i2, yl5.d().getDisplayMetrics().density, rect.bottom);
                f8bVar3.a(iP);
                oqe oqeVar2 = view instanceof oqe ? (oqe) view : null;
                if (oqeVar2 != null) {
                    oqeVar2.setRippleMask(new RoundRectShape(new float[]{0.0f, 0.0f, 0.0f, 0.0f, yl5.d().getDisplayMetrics().density * 16.0f, yl5.d().getDisplayMetrics().density * 16.0f, yl5.d().getDisplayMetrics().density * 16.0f, yl5.d().getDisplayMetrics().density * 16.0f}, null, null));
                }
            } else if (i == 3) {
                float f = i2;
                rect.top = zo5.b(f, yl5.d().getDisplayMetrics().density, rect.top);
                rect.bottom = zo5.b(f, yl5.d().getDisplayMetrics().density, rect.bottom);
                f8bVar.a(iP);
                f8bVar3.a(iP);
                oqe oqeVar3 = view instanceof oqe ? (oqe) view : null;
                if (oqeVar3 != null) {
                    oqeVar3.setRippleMask(new RoundRectShape(new float[]{yl5.d().getDisplayMetrics().density * 16.0f, yl5.d().getDisplayMetrics().density * 16.0f, yl5.d().getDisplayMetrics().density * 16.0f, yl5.d().getDisplayMetrics().density * 16.0f, yl5.d().getDisplayMetrics().density * 16.0f, yl5.d().getDisplayMetrics().density * 16.0f, yl5.d().getDisplayMetrics().density * 16.0f, yl5.d().getDisplayMetrics().density * 16.0f}, null, null));
                }
            } else {
                if (i != 4) {
                    ore.o();
                    return;
                }
                f8bVar2.a(iP);
                oqe oqeVar4 = view instanceof oqe ? (oqe) view : null;
                if (oqeVar4 != null) {
                    oqeVar4.setRippleMask(null);
                }
            }
        }
        this.o.J(rect, view, recyclerView);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:41:0x0179  */
    @Override // defpackage.tee
    public final void g(Canvas canvas, RecyclerView recyclerView, hfe hfeVar) {
        int i;
        int i2;
        char c;
        int iHeight;
        RectF rectF = this.h;
        rectF.set(Float.MAX_VALUE, Float.MAX_VALUE, Float.MIN_VALUE, Float.MIN_VALUE);
        ufe ufeVar = new ufe();
        ufeVar.a = Integer.MIN_VALUE;
        int childCount = recyclerView.getChildCount();
        char c2 = 0;
        int i3 = 0;
        boolean z = false;
        while (i3 < childCount) {
            View childAt = recyclerView.getChildAt(i3);
            int iP = RecyclerView.P(childAt);
            v56 v56Var = this.o;
            Rect rect = this.i;
            v56Var.C(rect, childAt, iP);
            rect.left = gm0.K(childAt.getTranslationX()) + rect.left;
            rect.right = gm0.K(childAt.getTranslationX()) + rect.right;
            rect.top = gm0.K(childAt.getTranslationY()) + rect.top;
            rect.bottom = gm0.K(childAt.getTranslationY()) + rect.bottom;
            f8b f8bVar = this.j;
            boolean zD = f8bVar.d(iP);
            int i4 = this.b;
            float[] fArr = this.m;
            boolean z2 = true;
            if (zD) {
                float f = yl5.d().getDisplayMetrics().density * 16.0f;
                fArr[c2] = f;
                fArr[1] = f;
                fArr[2] = f;
                fArr[3] = f;
                i = childCount;
                i2 = i3;
                rectF.set(rect.left, rect.top, rect.right, rect.bottom);
                if (!(childAt instanceof cyb)) {
                    int i5 = -gm0.K(i4 * yl5.d().getDisplayMetrics().density);
                    Drawable background = childAt.getBackground();
                    RippleDrawable rippleDrawable = background instanceof RippleDrawable ? (RippleDrawable) background : null;
                    if (rippleDrawable != null && rippleDrawable.getBounds().top != i5) {
                        ch3.g0(rippleDrawable, 0, i5, 0, 13);
                        z = true;
                    }
                }
            } else {
                i = childCount;
                i2 = i3;
            }
            boolean zD2 = this.k.d(iP);
            f8b f8bVar2 = this.l;
            if (zD2 || f8bVar2.d(iP)) {
                rectF.left = Math.min(rectF.left, rect.left);
                rectF.top = Math.min(rectF.top, rect.top);
                rectF.right = Math.max(rectF.right, rect.right);
                rectF.bottom = Math.max(rectF.bottom, rect.bottom);
                if (f8bVar2.d(iP)) {
                    float f2 = yl5.d().getDisplayMetrics().density * 16.0f;
                    fArr[4] = f2;
                    fArr[5] = f2;
                    fArr[6] = f2;
                    fArr[7] = f2;
                    if (childAt instanceof cyb) {
                        c = 0;
                    } else {
                        if (f8bVar.d(iP)) {
                            iHeight = zo5.D(i4, yl5.d().getDisplayMetrics().density, rect.height());
                        } else {
                            iHeight = rect.height();
                        }
                        Drawable background2 = childAt.getBackground();
                        RippleDrawable rippleDrawable2 = background2 instanceof RippleDrawable ? (RippleDrawable) background2 : null;
                        if (rippleDrawable2 != null) {
                            if (rippleDrawable2.getBounds().bottom != iHeight) {
                                c = 0;
                                ch3.g0(rippleDrawable2, 0, 0, iHeight, 7);
                            } else {
                                c = 0;
                                z2 = z;
                            }
                            z = z2;
                        } else {
                            c = 0;
                        }
                    }
                    ufeVar.a = ((Number) this.d.invoke(Integer.valueOf(iP))).intValue();
                    i(this, canvas, ufeVar);
                } else {
                    c = 0;
                }
            } else {
                c = 0;
            }
            c2 = c;
            i3 = i2 + 1;
            childCount = i;
        }
        if (rectF.height() > 0.0f) {
            i(this, canvas, ufeVar);
        }
        if (z) {
            recyclerView.requestLayout();
        }
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        kbc kbcVar2 = this.e;
        if (kbcVar2 != null) {
            kbcVar = kbcVar2;
        }
        this.f.setColor(((Number) this.c.invoke(kbcVar)).intValue());
        this.g.setColor(kbcVar.h().d);
    }
}
