package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ndd {
    public final String a;
    public final Long b;

    public ndd(String str, Long l) {
        this.a = str;
        this.b = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ndd)) {
            return false;
        }
        ndd nddVar = (ndd) obj;
        return this.a.equals(nddVar.a) && this.b.equals(nddVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Preference(key=" + this.a + ", value=" + this.b + ')';
    }
}
