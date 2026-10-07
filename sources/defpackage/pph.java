package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class pph implements aoh {
    public final String a;
    public final int[] b;
    public final String c;
    public final long d;

    public pph(String str, int[] iArr, String str2) {
        this.a = str;
        this.b = iArr;
        this.c = str2;
        this.d = str.hashCode();
    }

    @Override // defpackage.aoh
    public final int[] a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!pph.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        pph pphVar = (pph) obj;
        return this.d == pphVar.d && cqk.d(this.a, pphVar.a) && Arrays.equals(this.b, pphVar.b) && this.c.equals(pphVar.c);
    }

    @Override // defpackage.aoh
    public final String getName() {
        return this.a;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((Arrays.hashCode(this.b) + zo5.d(Long.hashCode(this.d) * 31, 31, this.a)) * 31);
    }

    public final String toString() {
        return zo5.w(qv1.q("ThemeBackgroundItem(name=", this.a, ", gradientColors=", Arrays.toString(this.b), ", themeName="), this.c, ")");
    }
}
