package defpackage;

import java.net.InetAddress;

/* JADX INFO: loaded from: classes3.dex */
public final class dd4 extends ed4 {
    public final InetAddress a;

    public dd4(InetAddress inetAddress) {
        this.a = inetAddress;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dd4) && cqk.d(this.a, ((dd4) obj).a);
    }

    public final int hashCode() {
        InetAddress inetAddress = this.a;
        if (inetAddress == null) {
            return 0;
        }
        return inetAddress.hashCode();
    }

    public final String toString() {
        return "Connected(address=" + this.a + ")";
    }
}
