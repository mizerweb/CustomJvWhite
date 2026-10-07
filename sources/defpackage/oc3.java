package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class oc3 implements pc3 {
    public final long a;
    public final long b;
    public final String c;
    public final boolean d;

    public oc3(int i, long j, long j2, String str) {
        j = (i & 1) != 0 ? 0L : j;
        j2 = (i & 2) != 0 ? 0L : j2;
        str = (i & 4) != 0 ? null : str;
        boolean z = (i & 8) == 0;
        this.a = j;
        this.b = j2;
        this.c = str;
        this.d = z;
    }
}
