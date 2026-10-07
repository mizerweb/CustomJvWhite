package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class rcf implements Comparable {
    public final long a;
    public final a35 b;

    public rcf(long j, a35 a35Var) {
        this.a = j;
        this.b = a35Var;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(this.a, ((rcf) obj).a);
    }
}
