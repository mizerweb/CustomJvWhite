package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.util.Size;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class o61 extends View {
    public final Path A;
    public final RectF B;
    public final float[] C;
    public final Size D;
    public boolean E;
    public boolean F;
    public final GestureDetector G;
    public final int a;
    public final int b;
    public final int c;
    public final float d;
    public final int e;
    public final int f;
    public int g;
    public ArrayList h;
    public kw8 i;
    public final Paint j;
    public final Paint k;
    public final Paint l;
    public final Paint m;
    public final TextPaint n;
    public final TextPaint o;
    public l61 p;
    public c61 q;
    public g61 r;
    public final Drawable s;
    public final Drawable t;
    public final Drawable u;
    public final Drawable v;
    public final Drawable w;
    public ColorStateList x;
    public ColorStateList y;
    public xc8 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o61(Context context) {
        super(context, null);
        lq4 lq4Var = null;
        this.a = gm0.K(40.0f * yl5.d().getDisplayMetrics().density);
        this.b = gm0.K(2.0f * yl5.d().getDisplayMetrics().density);
        this.c = gm0.K(8.0f * yl5.d().getDisplayMetrics().density);
        this.d = yl5.d().getDisplayMetrics().density * 6.0f;
        this.e = gm0.K(20.0f * yl5.d().getDisplayMetrics().density);
        this.f = gm0.K(16.0f * yl5.d().getDisplayMetrics().density);
        this.h = new ArrayList();
        a8g a8gVar = pq3.j;
        a8gVar.h(this);
        this.x = ColorStateList.valueOf(-1);
        this.y = ColorStateList.valueOf(a8gVar.h(this).getIcon().b);
        this.A = new Path();
        this.B = new RectF();
        this.C = new float[8];
        this.G = new GestureDetector(context, new pi9(1, this));
        this.D = new Size(p90.w(context).getWidth(), p90.w(context).getHeight());
        a8gVar.h(this);
        this.s = sb8.D(R.drawable.icon_services, -1, context);
        a8gVar.h(this);
        this.t = sb8.D(R.drawable.icon_external_link, -1, context);
        a8gVar.h(this);
        this.v = sb8.D(R.drawable.icon_geolocation, -1, context);
        a8gVar.h(this);
        this.w = sb8.D(R.drawable.icon_copy, -1, context);
        a8gVar.h(this);
        this.u = sb8.D(R.drawable.icon_profile, -1, context);
        a8gVar.h(this);
        this.n = b(-1);
        this.o = b(a8gVar.h(this).getText().b);
        this.j = a(((xac) a8gVar.h(this).f().a).a.p.b);
        this.k = a(a8gVar.h(this).h().c);
        if (this.F) {
            this.l = a(((fn8) a8gVar.h(this).u().c.a).c);
            this.m = a(((fn8) a8gVar.h(this).u().c.d).c);
        } else {
            this.l = a(((xac) a8gVar.h(this).f().a).a.p.d);
            this.m = a(((xac) a8gVar.h(this).f().a).a.p.d);
        }
        n1g.N(new zu(3, lq4Var, 2), this);
    }

    public static Paint a(int i) {
        Paint paint = new Paint();
        paint.setColor(i);
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setAntiAlias(true);
        return paint;
    }

    public final TextPaint b(int i) {
        TextPaint textPaint = new TextPaint();
        textPaint.setColor(i);
        p90.Q(this, textPaint, q9i.q);
        textPaint.setTextSize(yl5.d().getDisplayMetrics().density * 16.0f);
        textPaint.setTextAlign(Paint.Align.CENTER);
        return textPaint;
    }

    public final boolean c(s01 s01Var) {
        return !s01Var.e && this.F;
    }

    public final kw8 getKeyboard() {
        return this.i;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Paint paint;
        Drawable drawable;
        int i;
        if (this.h.isEmpty()) {
            return;
        }
        for (s01 s01Var : this.h) {
            r60 r60Var = s01Var.b;
            c61 c61Var = s01Var.a;
            float[] fArr = s01Var.h;
            float f = r60Var.b;
            float f2 = r60Var.c;
            float f3 = r60Var.d;
            float f4 = r60Var.e;
            RectF rectF = this.B;
            rectF.set(f, f2, f3, f4);
            if (c61Var == this.q) {
                if (c(s01Var)) {
                    paint = this.m;
                } else {
                    int i2 = c61Var.c;
                    if (i2 != 0) {
                        int i3 = m61.$EnumSwitchMapping$1[qt4.D(i2)];
                    }
                    paint = this.l;
                }
            } else if (c(s01Var)) {
                paint = this.k;
            } else {
                int i4 = m61.$EnumSwitchMapping$1[qt4.D(c61Var.c)];
                paint = this.j;
            }
            if (fArr != null) {
                Path path = this.A;
                path.reset();
                float f5 = fArr[0];
                float[] fArr2 = this.C;
                fArr2[0] = f5;
                fArr2[1] = fArr[0];
                float f6 = fArr[1];
                fArr2[2] = f6;
                fArr2[3] = f6;
                float f7 = fArr[2];
                fArr2[4] = f7;
                fArr2[5] = f7;
                float f8 = fArr[3];
                fArr2[6] = f8;
                fArr2[7] = f8;
                path.addRoundRect(rectF, fArr2, Path.Direction.CCW);
                canvas.drawPath(path, paint);
            } else {
                rectF.set(r60Var.b, r60Var.c, r60Var.d, r60Var.e);
                float f9 = this.d;
                canvas.drawRoundRect(rectF, f9, f9, paint);
            }
            if (c61Var.h) {
                xc8 xc8Var = this.z;
                if (xc8Var != null) {
                    boolean zC = c(s01Var);
                    a8g a8gVar = pq3.j;
                    if (zC) {
                        i = a8gVar.h(this).getIcon().b;
                    } else {
                        if (!s01Var.e || this.F) {
                            a8gVar.h(this);
                        } else {
                            a8gVar.h(this);
                        }
                        i = -1;
                    }
                    xc8Var.setTint(i);
                    float f10 = r60Var.b;
                    float f11 = r60Var.d;
                    int i5 = this.e / 2;
                    float f12 = r60Var.c;
                    float f13 = r60Var.e;
                    xc8Var.setBounds(((int) ((f10 + f11) * 0.5f)) - i5, ((int) ((f12 + f13) * 0.5f)) - i5, ((int) ((f10 + f11) * 0.5f)) + i5, i5 + ((int) ((f12 + f13) * 0.5f)));
                }
                xc8 xc8Var2 = this.z;
                if (xc8Var2 != null) {
                    xc8Var2.draw(canvas);
                }
            } else {
                String str = s01Var.i;
                float f14 = (r60Var.b + r60Var.d) * 0.5f;
                float f15 = (r60Var.c + r60Var.e) * 0.5f;
                TextPaint textPaint = this.n;
                float fAscent = f15 - ((textPaint.ascent() + textPaint.descent()) / 2.0f);
                if (c(s01Var)) {
                    textPaint = this.o;
                }
                canvas.drawText(str, f14, fAscent, textPaint);
            }
            if (!this.F) {
                int i6 = (int) r60Var.d;
                int i7 = this.b;
                int i8 = i6 - i7;
                int i9 = this.f;
                int i10 = i8 - i9;
                int i11 = ((int) r60Var.c) + i7;
                int i12 = i9 + i11;
                int iOrdinal = c61Var.b.ordinal();
                if (iOrdinal == 1) {
                    drawable = this.t;
                } else if (iOrdinal == 2) {
                    drawable = this.u;
                } else if (iOrdinal == 3) {
                    drawable = this.v;
                } else if (iOrdinal != 5) {
                    drawable = iOrdinal != 7 ? null : this.w;
                } else {
                    drawable = this.s;
                }
                if (drawable != null) {
                    drawable.setTintList(c(s01Var) ? this.y : this.x);
                    drawable.setBounds(i10, i11, i8, i12);
                    drawable.draw(canvas);
                }
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        kw8 kw8Var = this.i;
        if (this.h.isEmpty() || kw8Var == null) {
            super.onMeasure(i, i2);
            return;
        }
        int size = ((kg8) kw8Var).a.size();
        int size2 = View.MeasureSpec.getSize(i);
        if (!this.E) {
            double d = size2;
            Size size3 = this.D;
            if (d > Math.min(size3.getWidth(), size3.getHeight())) {
                size2 = (int) ((size3.getWidth() * size2) / size3.getHeight());
            }
        }
        boolean z = this.F;
        int i3 = this.b;
        int i4 = this.c;
        int i5 = z ? i4 : i3;
        int i6 = this.a;
        setMeasuredDimension(size2, ((i6 + i5) * size) - i5);
        int i7 = 0;
        r60 r60Var = ((s01) this.h.get(0)).b;
        if ((r60Var.b == 0.0f && r60Var.c == 0.0f && r60Var.d == 0.0f && r60Var.e == 0.0f) || this.g != getMeasuredWidth()) {
            int measuredWidth = getMeasuredWidth();
            ArrayList arrayList = this.h;
            if (!this.F) {
                i4 = i3;
            }
            m mVar = new m(19, this);
            Iterator it = arrayList.iterator();
            int i8 = 0;
            int i9 = 0;
            int i10 = 0;
            while (it.hasNext()) {
                s01 s01Var = (s01) it.next();
                int i11 = s01Var.c;
                boolean z2 = s01Var.g;
                if (i11 != -1) {
                    i10 = (measuredWidth - (i11 * i3)) / i11;
                    i8 = i7;
                }
                if (z2) {
                    i10 += i3;
                }
                r60 r60Var2 = s01Var.b;
                float f = i8;
                float f2 = i9;
                int i12 = s01Var.d ? i8 + measuredWidth : i8 + i10;
                int i13 = measuredWidth;
                int i14 = i9 + i6;
                Iterator it2 = it;
                r60Var2.b = f;
                r60Var2.c = f2;
                r60Var2.d = i12;
                r60Var2.e = i14;
                mVar.invoke(s01Var);
                i8 = i8 + i10 + i3;
                if (z2) {
                    i9 = i14 + i4;
                }
                measuredWidth = i13;
                it = it2;
                i7 = 0;
            }
        }
        this.g = getMeasuredWidth();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (isEnabled()) {
            this.G.onTouchEvent(motionEvent);
            int action = motionEvent.getAction();
            amc amcVar = null;
            if (action == 0) {
                ArrayList arrayList = this.h;
                kw8 kw8Var = this.i;
                List list = kw8Var != null ? ((kg8) kw8Var).a : null;
                if (list == null) {
                    list = r66.a;
                }
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                je9 je9Var = je9.g;
                if (!arrayList.isEmpty() && !list.isEmpty()) {
                    int y = (int) (motionEvent.getY() / (measuredHeight / list.size()));
                    int size = list.size() - 1;
                    if (y > size) {
                        String name = t01.class.getName();
                        a4c a4cVar = gm0.f;
                        if (a4cVar != null && a4cVar.b(je9Var)) {
                            a4cVar.c(je9Var, name, qt4.l("Calculated wrong row index=", y, size, ", correct index="), null);
                        }
                        y = size;
                    }
                    h61 h61Var = (h61) list.get(y);
                    if (!h61Var.isEmpty()) {
                        int x = (int) (motionEvent.getX() / (measuredWidth / h61Var.size()));
                        int size2 = h61Var.size() - 1;
                        if (x > size2) {
                            String name2 = t01.class.getName();
                            a4c a4cVar2 = gm0.f;
                            if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                                a4cVar2.c(je9Var, name2, qt4.l("Calculated wrong column index=", x, size2, ", correct index="), null);
                            }
                            x = size2;
                        }
                        amcVar = new amc(new g61(y, x), h61Var.get(x));
                    }
                }
                if (amcVar == null) {
                    return true;
                }
                this.r = (g61) amcVar.a;
                this.q = (c61) amcVar.b;
                invalidate();
                return true;
            }
            if (action == 1 || action == 3) {
                this.q = null;
                this.r = null;
                invalidate();
                return false;
            }
        }
        return false;
    }

    public final void setClickListener(l61 l61Var) {
        this.p = l61Var;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return (drawable instanceof xc8) || super.verifyDrawable(drawable);
    }
}
