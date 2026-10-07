package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class u63 {
    public final int a;
    public final ynh b;
    public final boolean c;

    public u63(int i, ynh ynhVar, boolean z) {
        this.a = i;
        this.b = ynhVar;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u63)) {
            return false;
        }
        u63 u63Var = (u63) obj;
        return this.a == u63Var.a && this.b.equals(u63Var.b) && this.c == u63Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + bc1.h(Integer.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChatMembersInfo(titleRes=");
        sb.append(this.a);
        sb.append(", subtitle=");
        sb.append(this.b);
        sb.append(", shouldShowSelector=");
        return qt4.r(sb, this.c, ")");
    }
}
