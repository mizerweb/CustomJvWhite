package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class agg extends cgg {
    public final int o;

    public agg(int i, long j, dc9 dc9Var, Boolean bool, Long l, String str, String str2, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, BigInteger bigInteger5) {
        super(1, j, dc9Var, bool, l, str, str2, bigInteger, bigInteger2, bigInteger3, bigInteger4, bigInteger5);
        this.o = i;
    }

    public final String toString() {
        return "AudioSend{ssrc=" + this.c + ", transportId='" + this.d + "', trackId='" + this.e + "', packetsSent=" + this.h + ", packetsLost=" + this.i + ", bytesSent=" + this.j + ", isMediaShare=" + this.n + ", targetBitrate=" + this.m + ", audioLevel=" + this.o + ", unknown=" + this.g + '}';
    }
}
