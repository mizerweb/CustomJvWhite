package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class y7h implements Comparable {
    public final long a;
    public final byte[] b;

    public y7h(long j, byte[] bArr) {
        this.a = j;
        this.b = bArr;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(this.a, ((y7h) obj).a);
    }
}
