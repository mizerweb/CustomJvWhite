package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class vag implements Comparable {
    public final long a;
    public final double b;

    public vag(long j, double d) {
        this.a = j;
        this.b = d;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(this.a, ((vag) obj).a);
    }
}
