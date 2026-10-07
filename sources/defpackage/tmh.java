package defpackage;

import android.graphics.RectF;

/* JADX INFO: loaded from: classes3.dex */
public final class tmh {
    public final long a;
    public final int b;
    public final int c;
    public final int d;
    public final String e;
    public final int f;
    public final int g;
    public final float h;
    public final float i;
    public final float j;
    public final float k;
    public final RectF l;

    public tmh(long j, int i, int i2, int i3, String str, int i4, int i5, float f, float f2, float f3, float f4, RectF rectF) {
        this.a = j;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = str;
        this.f = i4;
        this.g = i5;
        this.h = f;
        this.i = f2;
        this.j = f3;
        this.k = f4;
        this.l = rectF;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tmh)) {
            return false;
        }
        tmh tmhVar = (tmh) obj;
        return this.a == tmhVar.a && this.b == tmhVar.b && this.c == tmhVar.c && this.d == tmhVar.d && cqk.d(this.e, tmhVar.e) && this.f == tmhVar.f && this.g == tmhVar.g && Float.compare(this.h, tmhVar.h) == 0 && Float.compare(this.i, tmhVar.i) == 0 && Float.compare(this.j, tmhVar.j) == 0 && Float.compare(this.k, tmhVar.k) == 0 && cqk.d(this.l, tmhVar.l);
    }

    public final int hashCode() {
        int iM = nbh.m(nbh.m(nbh.m(nbh.m(zo5.c(this.g, c0a.f(this.f, zo5.d(zo5.c(this.d, zo5.c(this.c, c0a.f(this.b, Long.hashCode(this.a) * 31, 31), 31), 31), 31, this.e), 31), 31), this.h, 31), this.i, 31), this.j, 31), this.k, 31);
        RectF rectF = this.l;
        return iM + (rectF == null ? 0 : rectF.hashCode());
    }

    public final String toString() {
        String str;
        StringBuilder sbS = qt4.s(this.a, "TextLayerModel(id=", ", alignMode=");
        String str2 = "null";
        int i = this.b;
        if (i == 1) {
            str = "LEFT";
        } else if (i != 2) {
            str = i != 3 ? "null" : "RIGHT";
        } else {
            str = "CENTER";
        }
        sbS.append(str);
        sbS.append(", textColor=");
        sbS.append(this.c);
        sbS.append(", textBackgroundColor=");
        sbS.append(this.d);
        sbS.append(", text=");
        sbS.append(this.e);
        sbS.append(", textStyle=");
        int i2 = this.f;
        if (i2 == 1) {
            str2 = "THIN";
        } else if (i2 == 2) {
            str2 = "SEMIBOLD";
        } else if (i2 == 3) {
            str2 = "BOLD";
        }
        sbS.append(str2);
        sbS.append(", layoutWidth=");
        sbS.append(this.g);
        sbS.append(", translationX=");
        c0a.u(sbS, this.h, ", translationY=", this.i, ", scale=");
        c0a.u(sbS, this.j, ", rotation=", this.k, ", textBounds=");
        sbS.append(this.l);
        sbS.append(")");
        return sbS.toString();
    }
}
