package defpackage;

import android.content.Context;
import android.graphics.Path;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes3.dex */
public final class x2e {
    public final Context a;
    public final gjg b;
    public xac c;
    public final noh d;
    public final Drawable e;
    public w2e f = null;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;
    public final int n;
    public final int o;
    public final int p;
    public final float q;
    public final boolean r;
    public final Path s;
    public final Path t;
    public final Path u;
    public final Path v;
    public final Path w;
    public final Path x;

    public x2e(Context context, gjg gjgVar, xac xacVar, noh nohVar, Drawable drawable, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, float f, boolean z) {
        this.a = context;
        this.b = gjgVar;
        this.c = xacVar;
        this.d = nohVar;
        this.e = drawable;
        this.g = i;
        this.h = i2;
        this.i = i3;
        this.j = i4;
        this.k = i5;
        this.l = i6;
        this.m = i7;
        this.n = i8;
        this.o = i9;
        this.p = i10;
        this.q = f;
        this.r = z;
        this.w = a(this, f, f, 0.0f, f, 0.0f, 0.0f, 52);
        this.x = a(this, f, f, 0.0f, 0.0f, f, 0.0f, 44);
        float f2 = i5;
        if (f2 >= f) {
            this.s = a(this, f, f, f, 0.0f, 0.0f, 0.0f, 56);
            this.t = null;
            this.u = a(this, f, f, 0.0f, 0.0f, 0.0f, f, 28);
            this.v = null;
            return;
        }
        float degrees = (float) Math.toDegrees(Math.acos(1.0d - ((double) (f2 / f))));
        float f3 = 90.0f - degrees;
        Path path = new Path();
        float f4 = 2.0f * f;
        path.arcTo(0.0f, 0.0f, f4, f4, 180.0f, degrees, true);
        path.lineTo(f2, f);
        path.close();
        this.s = path;
        Path path2 = new Path();
        path2.arcTo(0.0f, 0.0f, f4, f4, 270.0f - f3, f3, true);
        path2.lineTo(f, f);
        path2.lineTo(f2, f);
        path2.close();
        this.t = path2;
        Path path3 = new Path();
        float f5 = -f;
        path3.arcTo(0.0f, f5, f4, f, 180.0f, -degrees, true);
        path3.lineTo(f2, 0.0f);
        path3.close();
        this.u = path3;
        Path path4 = new Path();
        path4.arcTo(0.0f, f5, f4, f, 180.0f - degrees, -f3, true);
        path4.lineTo(f, 0.0f);
        path4.lineTo(f2, 0.0f);
        path4.close();
        this.v = path4;
    }

    public static Path a(x2e x2eVar, float f, float f2, float f3, float f4, float f5, float f6, int i) {
        if ((i & 4) != 0) {
            f3 = 0.0f;
        }
        if ((i & 8) != 0) {
            f4 = 0.0f;
        }
        if ((i & 16) != 0) {
            f5 = 0.0f;
        }
        if ((i & 32) != 0) {
            f6 = 0.0f;
        }
        Path path = new Path();
        path.addRoundRect(0.0f, 0.0f, f, f2, new float[]{f3, f3, f4, f4, f5, f5, f6, f6}, Path.Direction.CW);
        return path;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x2e)) {
            return false;
        }
        x2e x2eVar = (x2e) obj;
        return cqk.d(this.a, x2eVar.a) && cqk.d(this.b, x2eVar.b) && cqk.d(this.c, x2eVar.c) && cqk.d(this.d, x2eVar.d) && this.e.equals(x2eVar.e) && cqk.d(this.f, x2eVar.f) && this.g == x2eVar.g && this.h == x2eVar.h && this.i == x2eVar.i && this.j == x2eVar.j && this.k == x2eVar.k && this.l == x2eVar.l && this.m == x2eVar.m && this.n == x2eVar.n && this.o == x2eVar.o && this.p == x2eVar.p && Float.compare(this.q, x2eVar.q) == 0 && this.r == x2eVar.r;
    }

    public final int hashCode() {
        int iHashCode = (this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31;
        w2e w2eVar = this.f;
        return Boolean.hashCode(this.r) + nbh.m(zo5.c(this.p, zo5.c(this.o, zo5.c(this.n, zo5.c(this.m, zo5.c(this.l, zo5.c(this.k, zo5.c(this.j, zo5.c(this.i, zo5.c(this.h, zo5.c(this.g, (iHashCode + (w2eVar == null ? 0 : w2eVar.hashCode())) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), this.q, 31);
    }

    public final String toString() {
        xac xacVar = this.c;
        w2e w2eVar = this.f;
        StringBuilder sb = new StringBuilder("Params(context=");
        sb.append(this.a);
        sb.append(", dynamicFont=");
        sb.append(this.b);
        sb.append(", theme=");
        sb.append(xacVar);
        sb.append(", textStyle=");
        sb.append(this.d);
        sb.append(", iconDrawable=");
        sb.append(this.e);
        sb.append(", fixedWidthProvider=");
        sb.append(w2eVar);
        sb.append(", iconWidth=");
        qt4.x(this.g, this.h, ", iconHeight=", ", iconPaddingTop=", sb);
        qt4.x(this.i, this.j, ", iconPaddingRight=", ", leadingBarWidth=", sb);
        qt4.x(this.k, this.l, ", textLeftMargin=", ", textRightMargin=", sb);
        qt4.x(this.m, this.n, ", bubbleTopPadding=", ", bubbleBottomPadding=", sb);
        qt4.x(this.o, this.p, ", bubbleBottomMargin=", ", cornerRadius=", sb);
        sb.append(this.q);
        sb.append(", staticDrawing=");
        sb.append(this.r);
        sb.append(")");
        return sb.toString();
    }
}
