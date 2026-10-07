package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class k5d {
    public final String a;
    public final int b;

    public k5d(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final int a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k5d)) {
            return false;
        }
        k5d k5dVar = (k5d) obj;
        return cqk.d(this.a, k5dVar.a) && this.b == k5dVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return c0a.l(this.b, "Answer(text=", this.a, ", answerId=", ")");
    }
}
