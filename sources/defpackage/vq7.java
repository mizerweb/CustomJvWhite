package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.ArrayList;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes4.dex */
public final class vq7 extends View {
    public static final /* synthetic */ int e = 0;
    public final Paint a;
    public sq7 b;
    public tq7 c;
    public boolean d;

    public vq7(Context context) {
        super(context, null, 0);
        Paint paint = new Paint(1);
        this.a = paint;
        this.c = l6m.g();
        paint.setStyle(Paint.Style.FILL);
        this.b = getDrawConfiguration();
    }

    public static void a(int i, int i2) {
        if (i < 0) {
            ore.p("Pages number is negative");
        } else if (i2 >= i) {
            ore.p("Selected page index is equal or bigger than pages number");
        } else {
            if (i2 >= 0) {
                return;
            }
            ore.p("Selected page index is negative");
        }
    }

    private final int getBigDotsNumber() {
        return Math.min(1, this.c.a);
    }

    private static final tq7 getDefaultPageState() {
        return l6m.g();
    }

    private final float getDotsAnimationShift() {
        int i = uq7.$EnumSwitchMapping$0[qt4.D(this.c.f)];
        if (i == 1) {
            return (1.0f - this.c.c) * this.b.d;
        }
        if (i == 2 || i == 3) {
            return 0.0f;
        }
        if (i == 4) {
            return (-this.c.c) * this.b.d;
        }
        ore.o();
        return 0.0f;
    }

    private final sq7 getDrawConfiguration() {
        float f = yl5.d().getDisplayMetrics().density * 3.0f;
        float f2 = yl5.d().getDisplayMetrics().density * 2.0f;
        float f3 = yl5.d().getDisplayMetrics().density * 1.0f;
        int iK = gm0.K(12.0f * yl5.d().getDisplayMetrics().density);
        a8g a8gVar = pq3.j;
        int i = a8gVar.l(this).b.getIcon().e;
        a8gVar.l(this);
        return new sq7(f, f2, f3, iK, i, -1, getContext().getDrawable(R.drawable.icon_grid_speaker).mutate(), gm0.K(8.0f * yl5.d().getDisplayMetrics().density));
    }

    private final float getSelectedBigDotAnimationShift() {
        int i = uq7.$EnumSwitchMapping$0[qt4.D(this.c.f)];
        if (i == 1 || i == 2) {
            return 0.0f;
        }
        if (i == 3) {
            return this.c.c * this.b.d;
        }
        if (i == 4) {
            return 0.0f;
        }
        ore.o();
        return 0.0f;
    }

    public final void b(Canvas canvas, float f, float f2, Drawable drawable, int i) {
        int i2 = this.b.h;
        float f3 = i2 / 2;
        float f4 = f - f3;
        float f5 = f2 - f3;
        int iSave = canvas.save();
        canvas.translate(f4, f5);
        try {
            drawable.setBounds(0, 0, i2, i2);
            drawable.setTint(i);
            drawable.draw(canvas);
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    public final float c(rq7 rq7Var, rq7 rq7Var2, rq7 rq7Var3) {
        float f = rq7Var2.a;
        tq7 tq7Var = this.c;
        int i = tq7Var.f;
        if (i == 3 && rq7Var != null) {
            float f2 = rq7Var.a;
            float f3 = tq7Var.c;
            return c0a.c(1.0f, f3, f, f2 * f3);
        }
        if (i == 4 && rq7Var3 != null) {
            float f4 = rq7Var3.a;
            float f5 = tq7Var.c;
            return c0a.c(1.0f, f5, f4, f * f5);
        }
        if (rq7Var == null || rq7Var3 == null) {
            return 0.0f;
        }
        return f;
    }

    public final void d(int i, int i2) {
        if (i == 0) {
            this.c = l6m.g();
            invalidate();
            return;
        }
        a(i, i2);
        tq7 tq7Var = this.c;
        if (i == tq7Var.a) {
            e(i2, 0.0f);
            return;
        }
        tq7Var.a = i;
        tq7Var.b = i2;
        tq7Var.c = 0.0f;
        if (tq7Var.d >= i) {
            tq7Var.d = Math.min(i - 1, 0);
        } else if (i <= 1) {
            tq7Var.d = i2;
        }
        tq7 tq7Var2 = this.c;
        tq7Var2.f = 1;
        tq7Var2.e = false;
        invalidate();
    }

    public final void e(int i, float f) {
        tq7 tq7Var = this.c;
        int i2 = tq7Var.b;
        tq7Var.b = i;
        int i3 = i - i2;
        int i4 = tq7Var.d;
        int i5 = i4 + i3;
        int i6 = 1;
        if (tq7Var.e && i3 == 1) {
            tq7Var.e = false;
            i3 = 0;
            i5 = 0;
        }
        if (i3 != 0) {
            tq7Var.e = i5 < 0;
        }
        tq7Var.d = oc9.v(i5, 0, 0);
        tq7 tq7Var2 = this.c;
        int i7 = tq7Var2.f;
        int i8 = tq7Var2.b;
        int i9 = tq7Var2.d;
        if (f != 0.0f) {
            if (i7 == 1 || i8 != i2) {
                i6 = 2;
                if (i8 < i2) {
                    if (i4 == 0 && i9 == 0) {
                        i6 = 4;
                    }
                } else if (i9 == 0) {
                    i6 = 3;
                }
            } else {
                i6 = i7;
            }
        }
        tq7Var2.f = i6;
        tq7Var2.c = f;
        invalidate();
    }

    public final boolean getDrawZeroIcon() {
        return this.d;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x008a  */
    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        tq7 tq7Var;
        int i;
        Canvas canvas2;
        boolean z;
        boolean z2 = true;
        if (this.c.a <= 1) {
            return;
        }
        int bigDotsNumber = getBigDotsNumber();
        ArrayList arrayList = new ArrayList();
        tq7 tq7Var2 = this.c;
        int i2 = tq7Var2.b - tq7Var2.d;
        if (i2 >= 2) {
            arrayList.add(new rq7(-3, 0.0f, i2 - 3));
        }
        if (i2 >= 1) {
            float f = this.b.c;
            tq7 tq7Var3 = this.c;
            arrayList.add(new rq7(-2, f, (tq7Var3.b - tq7Var3.d) - 2));
        }
        if (i2 >= 0) {
            float f2 = this.b.b;
            tq7 tq7Var4 = this.c;
            arrayList.add(new rq7(-1, f2, (tq7Var4.b - tq7Var4.d) - 1));
        }
        int iMin = Math.min(1, this.c.a);
        int i3 = 0;
        int i4 = 0;
        while (true) {
            tq7Var = this.c;
            if (i4 >= iMin) {
                break;
            }
            arrayList.add(new rq7(i4, this.b.a, (tq7Var.b - tq7Var.d) + i4));
            i4++;
        }
        int i5 = tq7Var.f;
        boolean z3 = i5 == 3 || i5 == 4;
        int i6 = tq7Var.a;
        if (i6 <= 1) {
            i = 0;
        } else {
            int i7 = i6 - 1;
            int i8 = tq7Var.b;
            if (i7 > i8 + 1 || !z3) {
                i = ((i6 - i8) - 1) - (0 - tq7Var.d);
            } else {
                i = 0;
            }
        }
        if (i >= 0) {
            arrayList.add(new rq7(1, this.b.b, (tq7Var.b - tq7Var.d) + 1));
        }
        if (i >= 1) {
            float f3 = this.b.c;
            tq7 tq7Var5 = this.c;
            arrayList.add(new rq7(2, f3, (tq7Var5.b - tq7Var5.d) + 2));
        }
        if (i >= 2) {
            tq7 tq7Var6 = this.c;
            arrayList.add(new rq7(3, 0.0f, (tq7Var6.b - tq7Var6.d) + 3));
        }
        PointF pointF = new PointF(canvas.getWidth() / 2.0f, canvas.getHeight() / 2.0f);
        float dotsAnimationShift = getDotsAnimationShift();
        float f4 = (bigDotsNumber - 1) / 2.0f;
        Drawable drawable = this.b.g;
        Float fValueOf = null;
        if (drawable != null) {
            int size = arrayList.size();
            int i9 = 0;
            while (true) {
                if (i9 < size) {
                    rq7 rq7Var = (rq7) arrayList.get(i9);
                    if (rq7Var.c == 0) {
                        rq7 rq7Var2 = uq7.$EnumSwitchMapping$0[qt4.D(this.c.f)] == 1 ? (rq7) ww3.u1(i9 - 1, arrayList) : rq7Var;
                        float fC = c((rq7) ww3.u1(i9 - 1, arrayList), rq7Var, (rq7) ww3.u1(i9 + 1, arrayList));
                        if (rq7Var2 != null) {
                            rq7Var = rq7Var2;
                        }
                        float f5 = rq7Var.b - f4;
                        sq7 sq7Var = this.b;
                        float f6 = pointF.x + (f5 * sq7Var.d) + dotsAnimationShift;
                        if ((rq7Var2 != null || this.c.b == 0) && fC != 0.0f) {
                            b(canvas, f6, pointF.y, drawable, sq7Var.e);
                            canvas2 = canvas;
                            fValueOf = Float.valueOf(f6);
                            break;
                        }
                    } else {
                        i9++;
                        drawable = drawable;
                    }
                }
                canvas2 = canvas;
                break;
            }
        } else {
            canvas2 = canvas;
            break;
        }
        int i10 = this.b.e;
        Paint paint = this.a;
        paint.setColor(i10);
        int size2 = arrayList.size();
        while (i3 < size2) {
            rq7 rq7Var3 = (rq7) arrayList.get(i3);
            float f7 = pointF.x + ((rq7Var3.b - f4) * this.b.d) + dotsAnimationShift;
            if (fValueOf == null || f7 != fValueOf.floatValue()) {
                z = z2;
                float fC2 = c((rq7) ww3.u1(i3 - 1, arrayList), rq7Var3, (rq7) ww3.u1(i3 + 1, arrayList));
                if (fC2 != 0.0f) {
                    canvas2.drawCircle(f7, pointF.y, fC2, paint);
                }
            } else {
                z = z2;
            }
            i3++;
            z2 = z;
        }
        int bigDotsNumber2 = getBigDotsNumber();
        PointF pointF2 = new PointF(canvas2.getWidth() / 2.0f, canvas2.getHeight() / 2.0f);
        float selectedBigDotAnimationShift = getSelectedBigDotAnimationShift();
        float f8 = (bigDotsNumber2 - 1) / 2.0f;
        tq7 tq7Var7 = this.c;
        if (tq7Var7.b == 0) {
            sq7 sq7Var2 = this.b;
            Drawable drawable2 = sq7Var2.g;
            if (drawable2 != null && this.d) {
                b(canvas, pointF2.x + ((tq7Var7.d - f8) * sq7Var2.d) + selectedBigDotAnimationShift, pointF2.y, drawable2, sq7Var2.f);
                return;
            }
            canvas2 = canvas;
        }
        paint.setColor(this.b.f);
        float f9 = this.c.d - f8;
        sq7 sq7Var3 = this.b;
        canvas2.drawCircle(pointF2.x + (f9 * sq7Var3.d) + selectedBigDotAnimationShift, pointF2.y, sq7Var3.a, paint);
    }

    public final void setDrawZeroIcon(boolean z) {
        this.d = z;
    }

    public final void setSelectedPageIndex(int i) {
        a(this.c.a, i);
        e(i, 0.0f);
    }

    public final void setZeroPageIcon(Drawable drawable) {
        sq7 sq7Var = this.b;
        float f = sq7Var.a;
        float f2 = sq7Var.b;
        float f3 = sq7Var.c;
        int i = sq7Var.d;
        int i2 = sq7Var.e;
        int i3 = sq7Var.f;
        int i4 = sq7Var.h;
        sq7Var.getClass();
        this.b = new sq7(f, f2, f3, i, i2, i3, drawable, i4);
        invalidate();
    }
}
