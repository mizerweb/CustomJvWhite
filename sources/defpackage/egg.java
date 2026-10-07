package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class egg extends cgg {
    public final long o;
    public final long p;
    public final long q;
    public final long r;
    public final long s;
    public final long t;
    public final long u;
    public final long v;

    public egg(long j, String str, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, BigInteger bigInteger5, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, Long l, String str2, dc9 dc9Var, Boolean bool) {
        super(2, j, dc9Var, bool, l, str, str2, bigInteger, bigInteger2, bigInteger3, bigInteger4, bigInteger5);
        this.o = j2;
        this.p = j3;
        this.q = j4;
        this.r = j5;
        this.s = j6;
        this.t = j7;
        this.u = j8;
        this.v = j9;
    }

    public final String toString() {
        return "VideoSend{ssrc=" + this.c + ", transportId='" + this.d + "', trackId='" + this.e + "', packetsSent=" + this.h + ", packetsLost=" + this.i + ", bytesSent=" + this.j + ", nacksReceived=" + this.o + ", pliReceived=" + this.p + ", firReceived=" + this.q + ", framesEncoded=" + this.r + ", adaptationChanges=" + this.s + ", avgEncodeMs=" + this.t + ", frameWidth=" + this.u + ", frameHeight=" + this.v + ", isMediaShare=" + this.n + ", targetBitrate=" + this.m + ", unknown=" + this.g + '}';
    }
}
