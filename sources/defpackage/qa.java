package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class qa {
    public final long a;
    public final long b;

    public qa(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qa)) {
            return false;
        }
        qa qaVar = (qa) obj;
        return this.a == qaVar.a && this.b == qaVar.b;
    }

    public final int hashCode() {
        return (((int) this.a) * 31) + ((int) this.b);
    }
}
