package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class kz5 implements c06 {
    public final String a;
    public final long b;
    public final CharSequence c;
    public final String d;
    public final sx3 e;
    public final String f;
    public final int g;
    public final String h;

    public kz5(String str, long j, CharSequence charSequence, String str2, sx3 sx3Var, String str3, int i, String str4) {
        this.a = str;
        this.b = j;
        this.c = charSequence;
        this.d = str2;
        this.e = sx3Var;
        this.f = str3;
        this.g = i;
        this.h = str4;
    }

    public static kz5 c(kz5 kz5Var, String str, sx3 sx3Var, String str2, String str3, int i) {
        String str4 = kz5Var.a;
        long j = kz5Var.b;
        CharSequence charSequence = kz5Var.c;
        if ((i & 8) != 0) {
            str = kz5Var.d;
        }
        String str5 = str;
        if ((i & 16) != 0) {
            sx3Var = kz5Var.e;
        }
        sx3 sx3Var2 = sx3Var;
        if ((i & 32) != 0) {
            str2 = kz5Var.f;
        }
        String str6 = str2;
        int i2 = kz5Var.g;
        if ((i & np0.m) != 0) {
            str3 = kz5Var.h;
        }
        return new kz5(str4, j, charSequence, str5, sx3Var2, str6, i2, str3);
    }

    @Override // defpackage.c06
    public final boolean a(c06 c06Var) {
        if (c06Var == null || !(c06Var instanceof kz5)) {
            return false;
        }
        return this.g != ((kz5) c06Var).g;
    }

    @Override // defpackage.c06
    public final boolean b(c06 c06Var) {
        if (c06Var == null || !(c06Var instanceof kz5)) {
            return false;
        }
        kz5 kz5Var = (kz5) c06Var;
        return (cqk.d(this.d, kz5Var.d) && cqk.d(this.f, kz5Var.f) && this.g == kz5Var.g) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kz5)) {
            return false;
        }
        kz5 kz5Var = (kz5) obj;
        return cqk.d(this.a, kz5Var.a) && this.b == kz5Var.b && cqk.d(this.c, kz5Var.c) && cqk.d(this.d, kz5Var.d) && cqk.d(this.e, kz5Var.e) && cqk.d(this.f, kz5Var.f) && this.g == kz5Var.g && cqk.d(this.h, kz5Var.h);
    }

    public final int hashCode() {
        String str = this.a;
        int iF = mw7.f(qt4.g((str == null ? 0 : str.hashCode()) * 31, 31, this.b), 31, this.c);
        String str2 = this.d;
        int iHashCode = (iF + (str2 == null ? 0 : str2.hashCode())) * 31;
        sx3 sx3Var = this.e;
        int iHashCode2 = (iHashCode + (sx3Var == null ? 0 : sx3Var.a.hashCode())) * 31;
        String str3 = this.f;
        return this.h.hashCode() + c0a.f(this.g, (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sbB = nbh.B(this.b, "EditChatProfileUiModel(avatarUrl=", this.a, ", avatarSourceId=");
        sbB.append(", abbreviation=");
        sbB.append((Object) this.c);
        sbB.append(", title=");
        sbB.append(this.d);
        sbB.append(", titleError=");
        sbB.append(this.e);
        sbB.append(", description=");
        sbB.append(this.f);
        sbB.append(", chatType=");
        sbB.append(tt2.j(this.g));
        sbB.append(", reactionSettings=");
        sbB.append(this.h);
        sbB.append(")");
        return sbB.toString();
    }
}
