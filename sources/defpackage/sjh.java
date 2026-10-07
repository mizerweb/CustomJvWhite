package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class sjh {
    public final ctc a;
    public final int b;

    public sjh(ctc ctcVar, int i) {
        this.a = ctcVar;
        this.b = i;
    }

    public final int a() {
        return this.b;
    }

    public final ctc b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sjh)) {
            return false;
        }
        sjh sjhVar = (sjh) obj;
        return this.a == sjhVar.a && this.b == sjhVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TaskCountByType(type=" + this.a + ", count=" + this.b + ")";
    }
}
