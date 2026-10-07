package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class yrd extends mk0 {
    public final long b;
    public final p63 c;

    public yrd(long j, p63 p63Var) {
        super(14);
        this.b = j;
        this.c = p63Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yrd)) {
            return false;
        }
        yrd yrdVar = (yrd) obj;
        return this.b == yrdVar.b && this.c == yrdVar.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + (Long.hashCode(this.b) * 31);
    }

    public final String toString() {
        return "ChatMembers(chatId=" + this.b + ", type=" + this.c + ")";
    }
}
