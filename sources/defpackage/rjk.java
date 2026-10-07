package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class rjk {
    public final String a;
    public final int b;
    public final String c;
    public final char d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;

    public rjk(String str, int i, String str2, char c, long j, long j2, long j3, long j4) {
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = c;
        this.e = j;
        this.f = j2;
        this.g = j3;
        this.h = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rjk)) {
            return false;
        }
        rjk rjkVar = (rjk) obj;
        return this.a.equals(rjkVar.a) && this.b == rjkVar.b && this.c.equals(rjkVar.c) && this.d == rjkVar.d && this.e == rjkVar.e && this.f == rjkVar.f && this.g == rjkVar.g && this.h == rjkVar.h;
    }

    public final int hashCode() {
        return Long.hashCode(0L) + ml9.a(ml9.a(ml9.a(ml9.a(ml9.a(ml9.a(ml9.a(ml9.a(ml9.a(ml9.a(ml9.a(ml9.a(ml9.a(ml9.a(ml9.a(ml9.a(ml9.a(ml9.a(ml9.a(ml9.a(ml9.a(ml9.a(ml9.a(ml9.a(ml9.a(ml9.a(ml9.a(ml9.a(ml9.a(ml9.a(ml9.a(ml9.a(ml9.a(ml9.a(ml9.a(ml9.a(ml9.a(ml9.a(ml9.a(ml9.a(ml9.a(ml9.a(ml9.a(ml9.a(ml9.a(ml9.a(ml9.a(ml9.a((Character.hashCode(this.d) + zo5.d(zo5.c(this.b, this.a.hashCode() * 31, 31), 31, this.c)) * 31, 0L), 0L), 0L), 0L), 0L), 0L), 0L), 0L), 0L), 0L), this.e), this.f), this.g), this.h), 0L), 0L), 0L), 0L), 0L), 0L), 0L), 0L), 0L), 0L), 0L), 0L), 0L), 0L), 0L), 0L), 0L), 0L), 0L), 0L), 0L), 0L), 0L), 0L), 0L), 0L), 0L), 0L), 0L), 0L), 0L), 0L), 0L), 0L);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Snapshot(raw=");
        sb.append(this.a);
        sb.append(", pid=");
        sb.append(this.b);
        sb.append(", comm=");
        sb.append(this.c);
        sb.append(", state=");
        sb.append(this.d);
        sb.append(", ppid=0, pgrp=0, session=0, ttyNr=0, tpgid=0, flags=0, minflt=0, cminflt=0, majflt=0, cmajflt=0, utimeTicks=");
        sb.append(this.e);
        sb.append(", stimeTicks=");
        sb.append(this.f);
        sb.append(", cutimeTicks=");
        sb.append(this.g);
        sb.append(", cstimeTicks=");
        return c0a.m(this.h, ", priority=0, nice=0, numThreads=0, itrealvalue=0, starttimeTicks=0, vsizeBytes=0, rssPages=0, rsslimBytes=0, startcode=0, endcode=0, startstack=0, kstkesp=0, kstkeip=0, signal=0, blocked=0, sigignore=0, sigcatch=0, wchan=0, nswap=0, cnswap=0, exitSignal=0, processor=0, rtPriority=0, policy=0, delayacctBlkioTicks=0, guestTimeTicks=0, cguestTimeTicks=0, startData=0, endData=0, startBrk=0, argStart=0, argEnd=0, envStart=0, envEnd=0, exitCode=0)", sb);
    }
}
