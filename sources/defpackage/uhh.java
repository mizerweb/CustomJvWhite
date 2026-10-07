package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class uhh {
    public final long a;
    public final long b;
    public final long c;

    public uhh(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RawContact{tamtamContactId=");
        sb.append(this.a);
        sb.append(", rawContactId=");
        sb.append(this.b);
        sb.append(", contactId=");
        return zo5.u(sb, this.c, '}');
    }
}
