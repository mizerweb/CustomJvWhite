package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class bc8 {
    public final yt1 a;
    public final String b;
    public final boolean c;

    public bc8(yt1 yt1Var, String str, boolean z) {
        this.a = yt1Var;
        this.b = str;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bc8)) {
            return false;
        }
        bc8 bc8Var = (bc8) obj;
        return this.a.equals(bc8Var.a) && this.b.equals(bc8Var.b) && this.c == bc8Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + zo5.d(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InboundMessage(senderId=");
        sb.append(this.a);
        sb.append(", text=");
        sb.append(this.b);
        sb.append(", isDirect=");
        return qt4.r(sb, this.c, ")");
    }
}
