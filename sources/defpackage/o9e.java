package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class o9e extends jnl {
    public final String a;

    public o9e(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o9e) && cqk.d(this.a, ((o9e) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return c0a.o("Avatar(avatarUrl=", this.a, ")");
    }
}
