package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class ex2 implements Serializable, tq3 {
    public final long a;
    public final long b;

    public ex2(long j, long j2) {
        this.a = j;
        this.b = j2;
        if (j == -1) {
            qv1.u("start time is -1", "Chunk", "");
        }
        if (j2 == -1) {
            qv1.u("end time is -1", "Chunk", "");
        }
    }

    @Override // defpackage.tq3
    public final long a() {
        return this.a;
    }

    @Override // defpackage.tq3
    public final long c() {
        return this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Chunk(startTime=");
        sb.append(this.a);
        sb.append(", endTime=");
        return zo5.u(sb, this.b, ')');
    }
}
