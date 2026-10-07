package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ksb {
    public final zo a;
    public final uo b;

    public ksb(zo zoVar, uo uoVar) {
        this.a = zoVar;
        this.b = uoVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ksb)) {
            return false;
        }
        ksb ksbVar = (ksb) obj;
        return cqk.d(this.a, ksbVar.a) && this.b.equals(ksbVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "OkApiRequest(request=" + this.a + ", config=" + this.b + ")";
    }
}
