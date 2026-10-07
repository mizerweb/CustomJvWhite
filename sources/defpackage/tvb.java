package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes3.dex */
public final class tvb extends Drawable {
    public final Context a;
    public final dwb b;
    public final String c;
    public final eu5 d;
    public int e;
    public final dpe f;
    public final ex4 g;
    public String h;
    public v78 i;
    public final int j;

    public tvb(Context context, dwb dwbVar) {
        this.a = context;
        this.b = dwbVar;
        this.c = tvb.class.getName();
        xj7 xj7Var = new xj7(context.getResources());
        xj7Var.b = 0;
        eu5 eu5Var = new eu5(xj7Var.a());
        ote oteVarD = eu5Var.d();
        if (oteVarD != null) {
            oteVarD.setCallback(new pj(4, this));
        }
        this.d = eu5Var;
        this.e = 1;
        dpe dpeVar = new dpe();
        this.f = dpeVar;
        ex4 ex4Var = new ex4(1, this);
        this.g = ex4Var;
        this.j = gm0.K(32.0f * yl5.d().getDisplayMetrics().density);
        t1d t1dVar = vd7.a.get();
        t1dVar.e = dpeVar;
        t1dVar.f = ex4Var;
        t1dVar.j = eu5Var.e;
        t1dVar.i = true;
        eu5Var.i(t1dVar.a());
    }

    public static void d(tvb tvbVar, int i) {
    }

    public final void a(v78 v78Var) {
        int iK;
        oah z68Var;
        eu5 eu5Var = this.d;
        if (v78Var == null) {
            eu5Var.i(null);
        } else {
            boolean zIsEmpty = getBounds().isEmpty();
            int iK2 = this.j;
            if (zIsEmpty) {
                iK = iK2;
            } else if (getBounds().width() < getBounds().height()) {
                int iWidth = getBounds().width();
                if (iWidth >= iK2) {
                    iK2 = iWidth;
                }
                iK = gm0.K((iK2 / getBounds().width()) * getBounds().height());
            } else {
                int iHeight = getBounds().height();
                if (iHeight >= iK2) {
                    iK2 = iHeight;
                }
                int i = iK2;
                iK2 = gm0.K((iK2 / getBounds().height()) * getBounds().width());
                iK = i;
            }
            long jA = (iK2 <= 0 || iK <= 0) ? bj8.a(0, 0) : bj8.a(iK2, iK);
            dwb dwbVar = this.b;
            w78 w78VarH = ghb.h(v78Var.b, dwbVar, (int) (jA >> 32), (int) (jA & 4294967295L));
            w78VarH.j = whd.c;
            v78 v78VarA = w78VarH.a();
            String string = v78VarA.b.toString();
            if (((Boolean) dk0.e.invoke()).booleanValue()) {
                z68Var = new dk0(string, v78VarA, !dwbVar.equals(cwb.a), null);
            } else {
                b78 b78VarA = vd7.A();
                b78VarA.getClass();
                z68Var = new z68(b78VarA, v78VarA, null, u78.FULL_FETCH);
            }
            dpe dpeVar = this.f;
            dpeVar.a(z68Var);
            if (eu5Var.e == null) {
                t1d t1dVar = vd7.a.get();
                t1dVar.e = dpeVar;
                t1dVar.f = this.g;
                t1dVar.j = eu5Var.e;
                t1dVar.i = true;
                eu5Var.i(t1dVar.a());
            }
        }
        invalidateSelf();
    }

    public final void b(tj0 tj0Var, String str) {
        boolean zD = cqk.d(this.h, str);
        dwb dwbVar = this.b;
        eu5 eu5Var = this.d;
        if (!zD) {
            this.h = str;
            v78 v78VarK = (str == null || str.length() == 0) ? null : ghb.k(str, dwbVar);
            this.i = v78VarK;
            if (v78VarK != null) {
                eu5Var.f();
            } else {
                eu5Var.g();
            }
            a(this.i);
            invalidateSelf();
        }
        if (tj0Var != null && tj0Var != tj0.c && (tj0Var.a != 0 || tj0Var.b.length() != 0)) {
            a8g a8gVar = pq3.j;
            Context context = this.a;
            sj0 sj0Var = new sj0(context, dwbVar, tj0Var, a8gVar.e(context).m());
            du5 du5Var = eu5Var.d;
            du5Var.getClass();
            ((wj7) du5Var).i(1, sj0Var);
            this.e = 3;
        } else if (this.e == 3) {
            du5 du5Var2 = eu5Var.d;
            du5Var2.getClass();
            ((wj7) du5Var2).i(1, null);
            this.e = 1;
        }
        invalidateSelf();
    }

    public final void c(CharSequence charSequence, Long l, String str) {
        b(gm0.a(charSequence, l), str);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        ote oteVarD = this.d.d();
        if (oteVarD != null) {
            Drawable.Callback callback = oteVarD.getCallback();
            oteVarD.setCallback(null);
            oteVarD.draw(canvas);
            oteVarD.setCallback(callback);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tvb)) {
            return false;
        }
        tvb tvbVar = (tvb) obj;
        return cqk.d(this.b, tvbVar.b) && cqk.d(this.h, tvbVar.h);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        ote oteVarD = this.d.d();
        return oteVarD != null ? oteVarD.getAlpha() : super.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        this.d.getClass();
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        this.d.getClass();
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode() * 31;
        String str = this.h;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        ote oteVarD = this.d.d();
        if (oteVarD != null) {
            Drawable.Callback callback = oteVarD.getCallback();
            oteVarD.setCallback(null);
            oteVarD.setBounds(0, 0, rect.width(), rect.height());
            oteVarD.setCallback(callback);
        }
        a(this.i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        ote oteVarD = this.d.d();
        if (oteVarD != null) {
            oteVarD.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        ote oteVarD = this.d.d();
        if (oteVarD != null) {
            oteVarD.setColorFilter(colorFilter);
        }
    }

    public /* synthetic */ tvb(Context context) {
        this(context, awb.a);
    }
}
