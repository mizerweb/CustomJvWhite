package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class e5f {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final long i;
    public final long j;
    public final long k;
    public final double l;
    public final double m;
    public final double n;
    public final double o;
    public final td7 p;

    public e5f(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, double d, double d2, double d3, double d4, td7 td7Var) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
        this.g = j7;
        this.h = j8;
        this.i = j9;
        this.j = j10;
        this.k = j11;
        this.l = d;
        this.m = d2;
        this.n = d3;
        this.o = d4;
        this.p = td7Var;
    }

    public final String toString() {
        return "ScreenshareRecvStat{packetsRecvStat=" + this.a + ", frameStartsRecvStat=" + this.b + ", recvOdditiesStat=" + this.c + ", completeFramesStat=" + this.d + ", keyFramesEnqStat=" + this.e + ", deltaFramesEnqStat=" + this.f + ", framesDroppedOnEnqStat=" + this.g + ", framesDecodedStat=" + this.h + ", decodeErrors=" + this.i + ", allocatedBuffersStat=" + this.j + ", allocatedMemStat=" + this.k + ", packetReceivedEventRateMs=" + this.l + ", frameReceivedEventRateMs=" + this.m + ", frameDecodedEventRateMs=" + this.n + ", frameDecodeErrorEventRateMs=" + this.o + '}';
    }
}
