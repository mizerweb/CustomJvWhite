package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class lsb {
    public final Object a;

    public lsb(Object obj) {
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lsb) && cqk.d(this.a, ((lsb) obj).a);
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "OkApiResponse(response=" + this.a + ")";
    }
}
