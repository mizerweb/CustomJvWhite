package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class gid {
    public final String a;
    public final int b;
    public final String c;
    public final char d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;

    public gid(String str, int i, String str2, char c, long j, long j2, long j3, long j4) {
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
        if (!(obj instanceof gid)) {
            return false;
        }
        gid gidVar = (gid) obj;
        return this.a.equals(gidVar.a) && this.b == gidVar.b && this.c.equals(gidVar.c) && this.d == gidVar.d && this.e == gidVar.e && this.f == gidVar.f && this.g == gidVar.g && this.h == gidVar.h;
    }

    public final int hashCode() {
        return Long.hashCode(0L) + qt4.g(qt4.g(qt4.g(qt4.g(qt4.g(qt4.g(qt4.g(qt4.g(qt4.g(qt4.g(qt4.g(qt4.g(qt4.g(qt4.g(qt4.g(qt4.g(qt4.g(qt4.g(qt4.g(qt4.g(qt4.g(qt4.g(qt4.g(qt4.g(qt4.g(qt4.g(qt4.g(qt4.g(qt4.g(qt4.g(qt4.g(qt4.g(qt4.g(qt4.g(qt4.g(qt4.g(qt4.g(qt4.g(qt4.g(qt4.g(qt4.g(qt4.g(qt4.g(qt4.g(qt4.g(qt4.g(qt4.g(qt4.g((Character.hashCode(this.d) + zo5.d(zo5.c(this.b, this.a.hashCode() * 31, 31), 31, this.c)) * 31, 31, 0L), 31, 0L), 31, 0L), 31, 0L), 31, 0L), 31, 0L), 31, 0L), 31, 0L), 31, 0L), 31, 0L), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, 0L), 31, 0L), 31, 0L), 31, 0L), 31, 0L), 31, 0L), 31, 0L), 31, 0L), 31, 0L), 31, 0L), 31, 0L), 31, 0L), 31, 0L), 31, 0L), 31, 0L), 31, 0L), 31, 0L), 31, 0L), 31, 0L), 31, 0L), 31, 0L), 31, 0L), 31, 0L), 31, 0L), 31, 0L), 31, 0L), 31, 0L), 31, 0L), 31, 0L), 31, 0L), 31, 0L), 31, 0L), 31, 0L), 31, 0L);
    }

    public final String toString() {
        StringBuilder sbR = c0a.r(this.b, "Snapshot(raw=", this.a, ", pid=", ", comm=");
        sbR.append(this.c);
        sbR.append(", state=");
        sbR.append(this.d);
        sbR.append(", ppid=0, pgrp=0, session=0, ttyNr=0, tpgid=0, flags=0, minflt=0, cminflt=0, majflt=0, cmajflt=0, utimeTicks=");
        sbR.append(this.e);
        qt4.z(this.f, ", stimeTicks=", ", cutimeTicks=", sbR);
        sbR.append(this.g);
        return zo5.k(this.h, ", cstimeTicks=", ", priority=0, nice=0, numThreads=0, itrealvalue=0, starttimeTicks=0, vsizeBytes=0, rssPages=0, rsslimBytes=0, startcode=0, endcode=0, startstack=0, kstkesp=0, kstkeip=0, signal=0, blocked=0, sigignore=0, sigcatch=0, wchan=0, nswap=0, cnswap=0, exitSignal=0, processor=0, rtPriority=0, policy=0, delayacctBlkioTicks=0, guestTimeTicks=0, cguestTimeTicks=0, startData=0, endData=0, startBrk=0, argStart=0, argEnd=0, envStart=0, envEnd=0, exitCode=0)", sbR);
    }
}
