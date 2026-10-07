package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class wf {
    public final long a;
    public final ush b;
    public final int c;
    public final x4a d;
    public final long e;
    public final ush f;
    public final int g;
    public final x4a h;
    public final long i;
    public final long j;

    public wf(long j, ush ushVar, int i, x4a x4aVar, long j2, ush ushVar2, int i2, x4a x4aVar2, long j3, long j4) {
        this.a = j;
        this.b = ushVar;
        this.c = i;
        this.d = x4aVar;
        this.e = j2;
        this.f = ushVar2;
        this.g = i2;
        this.h = x4aVar2;
        this.i = j3;
        this.j = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || wf.class != obj.getClass()) {
            return false;
        }
        wf wfVar = (wf) obj;
        return this.a == wfVar.a && this.c == wfVar.c && this.e == wfVar.e && this.g == wfVar.g && this.i == wfVar.i && this.j == wfVar.j && this.b.equals(wfVar.b) && Objects.equals(this.d, wfVar.d) && Objects.equals(this.f, wfVar.f) && Objects.equals(this.h, wfVar.h);
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.a), this.b, Integer.valueOf(this.c), this.d, Long.valueOf(this.e), this.f, Integer.valueOf(this.g), this.h, Long.valueOf(this.i), Long.valueOf(this.j));
    }
}
