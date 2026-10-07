package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class bz4 {
    public final c98 a;
    public final long b;
    public final long c;
    public final long d;

    public bz4(long j, long j2, List list) {
        this.a = c98.n(list);
        this.b = j;
        this.c = j2;
        long j3 = -9223372036854775807L;
        if (j != -9223372036854775807L && j2 != -9223372036854775807L) {
            j3 = j + j2;
        }
        this.d = j3;
    }
}
