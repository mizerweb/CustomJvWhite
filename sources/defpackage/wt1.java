package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class wt1 {
    public final long a;

    public wt1(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wt1) && this.a == ((wt1) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(12000L) + qt4.g(qt4.g(qt4.g(spc.a(30000, spc.a(5, Integer.hashCode(30000) * 31)), 31, 20000L), 31, 10000L), 31, this.a);
    }

    public final String toString() {
        return nbh.s(this.a, "Timeouts(timeoutIceReconnectMillis=30000, signalingMaxRetryCount=5, signalingMaxRetryTimeout=30000, signalingPingTimeout=20000, noPeerConnectionTimeoutMs=10000, mediaReceivingTimeoutMs=", ", noDataTimeout=12000)");
    }
}
