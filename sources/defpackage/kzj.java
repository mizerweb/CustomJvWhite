package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class kzj {
    public String a;
    public kyj b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kzj)) {
            return false;
        }
        kzj kzjVar = (kzj) obj;
        return cqk.d(this.a, kzjVar.a) && this.b == kzjVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "IdAndState(id=" + this.a + ", state=" + this.b + ')';
    }
}
