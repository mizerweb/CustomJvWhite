package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class dh4 {
    public final String a;
    public final CharSequence b;
    public final String c;
    public final ynh d;
    public final String e;
    public final ynh f;

    public dh4(String str, CharSequence charSequence, String str2, ynh ynhVar, String str3, ynh ynhVar2) {
        this.a = str;
        this.b = charSequence;
        this.c = str2;
        this.d = ynhVar;
        this.e = str3;
        this.f = ynhVar2;
    }

    public static dh4 a(dh4 dh4Var, String str, ynh ynhVar, String str2, ynh ynhVar2, int i) {
        String str3 = dh4Var.a;
        CharSequence charSequence = dh4Var.b;
        if ((i & 4) != 0) {
            str = dh4Var.c;
        }
        String str4 = str;
        if ((i & 8) != 0) {
            ynhVar = dh4Var.d;
        }
        ynh ynhVar3 = ynhVar;
        if ((i & 16) != 0) {
            str2 = dh4Var.e;
        }
        String str5 = str2;
        if ((i & 32) != 0) {
            ynhVar2 = dh4Var.f;
        }
        return new dh4(str3, charSequence, str4, ynhVar3, str5, ynhVar2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dh4)) {
            return false;
        }
        dh4 dh4Var = (dh4) obj;
        return cqk.d(this.a, dh4Var.a) && cqk.d(this.b, dh4Var.b) && cqk.d(this.c, dh4Var.c) && cqk.d(this.d, dh4Var.d) && cqk.d(this.e, dh4Var.e) && cqk.d(this.f, dh4Var.f);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        CharSequence charSequence = this.b;
        int iHashCode2 = (iHashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        ynh ynhVar = this.d;
        int iHashCode4 = (iHashCode3 + (ynhVar == null ? 0 : ynhVar.hashCode())) * 31;
        String str3 = this.e;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        ynh ynhVar2 = this.f;
        return iHashCode5 + (ynhVar2 != null ? ynhVar2.hashCode() : 0);
    }

    public final String toString() {
        return "ContactAddState(avatarUrl=" + this.a + ", abbreviation=" + ((Object) this.b) + ", firstName=" + this.c + ", firstNameError=" + this.d + ", lastName=" + this.e + ", lastNameError=" + this.f + ")";
    }
}
