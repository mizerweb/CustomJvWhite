package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class ujh {
    public final long a;
    public final ctc b;
    public final rkh c;
    public final int d;
    public final long e;
    public final int f;
    public final byte[] g;
    public final long h;

    public ujh(long j, ctc ctcVar, rkh rkhVar, int i, long j2, int i2, byte[] bArr, long j3) {
        this.a = j;
        this.b = ctcVar;
        this.c = rkhVar;
        this.d = i;
        this.e = j2;
        this.f = i2;
        this.g = bArr;
        this.h = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ujh)) {
            return false;
        }
        ujh ujhVar = (ujh) obj;
        return this.a == ujhVar.a && this.b == ujhVar.b && this.c == ujhVar.c && this.d == ujhVar.d && this.e == ujhVar.e && this.f == ujhVar.f && cqk.d(this.g, ujhVar.g) && this.h == ujhVar.h;
    }

    public final int hashCode() {
        return Long.hashCode(this.h) + ((Arrays.hashCode(this.g) + zo5.c(this.f, qt4.g(zo5.c(this.d, (this.c.hashCode() + ((this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31)) * 31, 31), 31, this.e), 31)) * 31);
    }

    public final String toString() {
        String string = Arrays.toString(this.g);
        StringBuilder sb = new StringBuilder("TaskEntity(id=");
        sb.append(this.a);
        sb.append(", type=");
        sb.append(this.b);
        sb.append(", status=");
        sb.append(this.c);
        sb.append(", failsCount=");
        sb.append(this.d);
        qt4.z(this.e, ", dependsRequestId=", ", dependencyType=", sb);
        sb.append(this.f);
        sb.append(", data=");
        sb.append(string);
        sb.append(", createdTime=");
        return c0a.m(this.h, ")", sb);
    }
}
