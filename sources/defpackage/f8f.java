package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class f8f extends h8f {
    public final String a;
    public final String b;

    public f8f(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f8f)) {
            return false;
        }
        f8f f8fVar = (f8f) obj;
        return cqk.d(this.a, f8fVar.a) && cqk.d(this.b, f8fVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return nbh.w("GetContactByPhone(code=", this.a, ", phone=", this.b, ")");
    }
}
