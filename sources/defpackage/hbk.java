package defpackage;

import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.time.Instant;
import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class hbk implements Comparator {
    public final /* synthetic */ int a;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                InetAddress inetAddress = (InetAddress) obj;
                if (inetAddress instanceof Inet4Address) {
                    return -1;
                }
                return inetAddress instanceof Inet6Address ? 1 : 0;
            case 1:
                InetAddress inetAddress2 = (InetAddress) obj;
                if (inetAddress2 instanceof Inet6Address) {
                    return -1;
                }
                return inetAddress2 instanceof Inet4Address ? 1 : 0;
            default:
                return ((Instant) obj).compareTo((Instant) obj2);
        }
    }
}
