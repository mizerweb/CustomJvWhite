package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class d76 implements h76 {
    public final String a;
    public final CharSequence b;
    public final long c;
    public final g58 d;
    public final ynh e;
    public final ynh f;
    public final boolean g;
    public final hi4 h;

    public d76(String str, CharSequence charSequence, long j, g58 g58Var, ynh ynhVar, ynh ynhVar2, boolean z, hi4 hi4Var) {
        this.a = str;
        this.b = charSequence;
        this.c = j;
        this.d = g58Var;
        this.e = ynhVar;
        this.f = ynhVar2;
        this.g = z;
        this.h = hi4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d76)) {
            return false;
        }
        d76 d76Var = (d76) obj;
        return cqk.d(this.a, d76Var.a) && cqk.d(this.b, d76Var.b) && this.c == d76Var.c && cqk.d(this.d, d76Var.d) && this.e.equals(d76Var.e) && this.f.equals(d76Var.f) && this.g == d76Var.g && cqk.d(this.h, d76Var.h);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        CharSequence charSequence = this.b;
        int iG = qt4.g((iHashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31, 31, this.c);
        g58 g58Var = this.d;
        int iN = nbh.n(bc1.h(bc1.h((iG + (g58Var == null ? 0 : g58Var.hashCode())) * 31, 31, this.e), 31, this.f), 31, this.g);
        hi4 hi4Var = this.h;
        return iN + (hi4Var != null ? hi4Var.hashCode() : 0);
    }

    public final String toString() {
        return "EmptyBot(avatar=" + this.a + ", avatarPlaceholder=" + ((Object) this.b) + ", avatarPlaceholderId=" + this.c + ", imageAttachConfig=" + this.d + ", title=" + this.e + ", subtitle=" + this.f + ", isCustom=" + this.g + ", startMessage=" + this.h + ")";
    }
}
