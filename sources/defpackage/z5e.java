package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class z5e {
    public final a6e a;
    public final s5e b;

    public z5e(a6e a6eVar, s5e s5eVar) {
        this.a = a6eVar;
        this.b = s5eVar;
    }

    public final s5e a() {
        return this.b;
    }

    public final a6e b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z5e)) {
            return false;
        }
        z5e z5eVar = (z5e) obj;
        return this.a == z5eVar.a && cqk.d(this.b, z5eVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ReactionData(type=" + this.a + ", id=" + ((Object) this.b) + ")";
    }
}
