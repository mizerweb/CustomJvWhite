package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class xxf implements eyf {
    public final Long a;
    public final int b;
    public final int c;

    public xxf(int i, int i2, Long l) {
        this.a = l;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xxf)) {
            return false;
        }
        xxf xxfVar = (xxf) obj;
        return cqk.d(this.a, xxfVar.a) && this.b == xxfVar.b && this.c == xxfVar.c;
    }

    public final int hashCode() {
        Long l = this.a;
        return Integer.hashCode(this.c) + zo5.c(this.b, (l == null ? 0 : l.hashCode()) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Close(destination=");
        sb.append(this.a);
        sb.append(", chatsCount=");
        sb.append(this.b);
        sb.append(", shareType=");
        return zo5.t(sb, this.c, ")");
    }
}
