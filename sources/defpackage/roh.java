package defpackage;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes3.dex */
public final class roh {
    public final float a;
    public final CharSequence b;
    public final boolean c;
    public final boolean d;
    public final int e;
    public final TextUtils.TruncateAt f;
    public final fda g;
    public final int h;
    public final int i;
    public final boolean j;

    public roh(float f, CharSequence charSequence, boolean z, boolean z2, int i, TextUtils.TruncateAt truncateAt, fda fdaVar, int i2, int i3) {
        this.a = f;
        this.b = charSequence;
        this.c = z;
        this.d = z2;
        this.e = i;
        this.f = truncateAt;
        this.g = fdaVar;
        this.h = i2;
        this.i = i3;
        this.j = i != Integer.MAX_VALUE;
    }

    public static roh a(roh rohVar, CharSequence charSequence, int i) {
        float f = rohVar.a;
        if ((i & 2) != 0) {
            charSequence = rohVar.b;
        }
        return new roh(f, charSequence, rohVar.c, (i & 8) != 0 ? rohVar.d : false, (i & 16) != 0 ? rohVar.e : 1, rohVar.f, rohVar.g, rohVar.h, rohVar.i);
    }

    public final int b() {
        return this.i;
    }

    public final boolean c() {
        return this.j;
    }

    public final boolean d() {
        return this.c;
    }

    public final int e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof roh)) {
            return false;
        }
        roh rohVar = (roh) obj;
        return Float.compare(this.a, rohVar.a) == 0 && cqk.d(this.b, rohVar.b) && this.c == rohVar.c && this.d == rohVar.d && this.e == rohVar.e && this.f == rohVar.f && cqk.d(this.g, rohVar.g) && this.h == rohVar.h && this.i == rohVar.i;
    }

    public final boolean f() {
        return this.d;
    }

    public final int g() {
        return this.h;
    }

    public final CharSequence h() {
        return this.b;
    }

    public final int hashCode() {
        int iC = zo5.c(this.e, nbh.n(nbh.n(mw7.f(Float.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31);
        TextUtils.TruncateAt truncateAt = this.f;
        int iHashCode = (iC + (truncateAt == null ? 0 : truncateAt.hashCode())) * 31;
        fda fdaVar = this.g;
        return Integer.hashCode(this.i) + zo5.c(this.h, (iHashCode + (fdaVar != null ? fdaVar.hashCode() : 0)) * 31, 31);
    }

    public final float i() {
        return this.a;
    }

    public final TextUtils.TruncateAt j() {
        return this.f;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PreprocessTextResult(textSize=");
        sb.append(this.a);
        sb.append(", text=");
        sb.append((Object) this.b);
        sb.append(", includeFontPadding=");
        qt4.B(", postProcessing=", ", maxLines=", sb, this.c, this.d);
        sb.append(this.e);
        sb.append(", truncateAt=");
        sb.append(this.f);
        sb.append(", replied=");
        sb.append(this.g);
        sb.append(", startPadding=");
        sb.append(this.h);
        sb.append(", endPadding=");
        return zo5.t(sb, this.i, ")");
    }

    public /* synthetic */ roh(float f, CharSequence charSequence, boolean z, int i) {
        this(f, charSequence, z, false, Integer.MAX_VALUE, null, null, 0, 0);
    }
}
