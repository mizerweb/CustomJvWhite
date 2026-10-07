package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class rw7 extends xw7 {
    public final long a;
    public final CharSequence b;
    public final String c;
    public final boolean d;

    public rw7(long j, CharSequence charSequence, String str, boolean z) {
        this.a = j;
        this.b = charSequence;
        this.c = str;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rw7)) {
            return false;
        }
        rw7 rw7Var = (rw7) obj;
        return this.a == rw7Var.a && this.b.equals(rw7Var.b) && cqk.d(this.c, rw7Var.c) && this.d == rw7Var.d;
    }

    public final int hashCode() {
        int iF = mw7.f(Long.hashCode(this.a) * 31, 31, this.b);
        String str = this.c;
        return Boolean.hashCode(this.d) + ((iF + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "Avatar(avatarColorId=" + this.a + ", abbreviation=" + ((Object) this.b) + ", avatar=" + this.c + ", isCallLink=" + this.d + ")";
    }
}
