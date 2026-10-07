package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class zf3 {
    public final long a;
    public final int b;
    public final CharSequence c;

    public zf3(long j, int i, CharSequence charSequence) {
        this.a = j;
        this.b = i;
        this.c = charSequence;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zf3)) {
            return false;
        }
        zf3 zf3Var = (zf3) obj;
        return this.a == zf3Var.a && this.b == zf3Var.b && this.c.equals(zf3Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + c0a.f(this.b, Long.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sbS = qt4.s(this.a, "ChatTyping(chatId=", ", type=");
        sbS.append(v0h.u(this.b));
        sbS.append(", typingText=");
        sbS.append((Object) this.c);
        sbS.append(")");
        return sbS.toString();
    }
}
