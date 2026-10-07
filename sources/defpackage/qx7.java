package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class qx7 implements Comparable {
    public final String a;
    public final px7 b;
    public final long c;
    public final int d;
    public final long e;
    public final wu5 f;
    public final String g;
    public final String h;
    public final long i;
    public final long j;
    public final boolean k;

    public qx7(String str, px7 px7Var, long j, int i, long j2, wu5 wu5Var, String str2, String str3, long j3, long j4, boolean z) {
        this.a = str;
        this.b = px7Var;
        this.c = j;
        this.d = i;
        this.e = j2;
        this.f = wu5Var;
        this.g = str2;
        this.h = str3;
        this.i = j3;
        this.j = j4;
        this.k = z;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        Long l = (Long) obj;
        long jLongValue = l.longValue();
        long j = this.e;
        if (j > jLongValue) {
            return 1;
        }
        return j < l.longValue() ? -1 : 0;
    }
}
