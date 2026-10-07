package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class n40 {
    public final CharSequence a;
    public final String b;
    public final String c;
    public final Integer d;
    public final Integer e;
    public final boolean f;
    public final boolean g;

    public n40(CharSequence charSequence, String str, String str2, Integer num, Integer num2, boolean z, boolean z2) {
        this.a = charSequence;
        this.b = str;
        this.c = str2;
        this.d = num;
        this.e = num2;
        this.f = z;
        this.g = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n40)) {
            return false;
        }
        n40 n40Var = (n40) obj;
        return cqk.d(this.a, n40Var.a) && cqk.d(this.b, n40Var.b) && cqk.d(this.c, n40Var.c) && cqk.d(this.d, n40Var.d) && cqk.d(this.e, n40Var.e) && this.f == n40Var.f && this.g == n40Var.g;
    }

    public final int hashCode() {
        CharSequence charSequence = this.a;
        int iHashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.d;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.e;
        return Boolean.hashCode(this.g) + nbh.n((iHashCode4 + (num2 != null ? num2.hashCode() : 0)) * 31, 31, this.f);
    }

    public final String toString() {
        Object objT1;
        if (gm0.c()) {
            CharSequence charSequence = this.a;
            objT1 = charSequence != null ? r5h.t1(50, charSequence) : null;
        } else {
            objT1 = "****";
        }
        return s5h.x0("\n            AttachDescription(\n                desc: " + objT1 + "\n                name: " + this.b + "\n                count: " + this.e + "\n                isRoundPreview: " + this.f + "\n                isContentLevel: " + this.g + "\n            )\n        ");
    }
}
