package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ob implements vpa {
    public final s5e a;
    public final String b;
    public final long c;

    public ob(long j, s5e s5eVar, String str) {
        this.a = s5eVar;
        this.b = str;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ob)) {
            return false;
        }
        ob obVar = (ob) obj;
        return this.a.equals(obVar.a) && this.b.equals(obVar.b) && this.c == obVar.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + zo5.d(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AddReactionEffect(reaction=");
        sb.append((Object) this.a);
        sb.append(", effectUrl=");
        sb.append(this.b);
        sb.append(", msgId=");
        return c0a.m(this.c, ")", sb);
    }
}
