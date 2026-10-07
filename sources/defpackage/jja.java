package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class jja {
    public final z5e a;
    public final int b;

    public jja(z5e z5eVar, int i) {
        this.a = z5eVar;
        this.b = i;
    }

    public final int a() {
        return this.b;
    }

    public final z5e b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jja)) {
            return false;
        }
        jja jjaVar = (jja) obj;
        return cqk.d(this.a, jjaVar.a) && this.b == jjaVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "MessageReactionWithCount(reaction=" + this.a + ", count=" + this.b + ")";
    }
}
