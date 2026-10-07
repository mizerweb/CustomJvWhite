package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class a0i implements e0i {
    public final wzh a;
    public final long b;

    public a0i(wzh wzhVar, long j) {
        this.a = wzhVar;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0i)) {
            return false;
        }
        a0i a0iVar = (a0i) obj;
        return this.a.equals(a0iVar.a) && this.b == a0iVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Completed(result=" + this.a + ", fileSize=" + this.b + ")";
    }
}
