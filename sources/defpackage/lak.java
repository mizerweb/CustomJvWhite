package defpackage;

import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.time.Instant;
import java.util.Map;
import java.util.Objects;
import java.util.function.Predicate;
import org.apache.http.conn.params.ConnManagerParams;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class lak implements Predicate {
    public final /* synthetic */ int a;

    public /* synthetic */ lak(int i) {
        this.a = i;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.a) {
            case 0:
                return ((Integer) ((Map.Entry) obj).getKey()).intValue() % 4 == 0;
            case 1:
                return ((Integer) ((Map.Entry) obj).getKey()).intValue() % 4 == 2;
            case 2:
                return ((InetAddress) obj) instanceof Inet4Address;
            case 3:
                return ((InetAddress) obj) instanceof Inet6Address;
            case 4:
                return ((o8k) obj).h();
            case 5:
                o8k o8kVar = (o8k) obj;
                return o8kVar.h() || (o8kVar instanceof k8k);
            case 6:
                return ((o8k) obj) instanceof e5k;
            case 7:
                return ((zbk) obj).b();
            case 8:
                return ((zbk) obj).b();
            case 9:
                return ((zbk) obj) != null;
            case 10:
                zbk zbkVar = (zbk) obj;
                synchronized (zbkVar) {
                    if (zbkVar.e || zbkVar.d) {
                        return false;
                    }
                    zbkVar.e = true;
                    return true;
                }
            case 11:
                return ((zbk) obj).b.s();
            case 12:
                return ((zbk) obj).a();
            case 13:
                return !((zbk) obj).b.t();
            case 14:
                return ((zbk) obj).b.s();
            case 15:
                return ((zbk) obj).a();
            case 16:
                return !((zbk) obj).b.t();
            case 17:
                return ((zbk) obj).b.u();
            case 18:
                return ((zbk) obj).a();
            case 19:
                return !((zbk) obj).b.t();
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                return ((zbk) obj).a();
            case 21:
                return ((zbk) obj).b();
            case 22:
                return ((zbk) obj).a();
            case 23:
                return !((pbk) obj).c.stream().allMatch(new lak(25));
            case 24:
                return !(((o8k) obj) instanceof e5k);
            case 25:
                o8k o8kVar2 = (o8k) obj;
                return (o8kVar2 instanceof n8k) || (o8kVar2 instanceof k8k) || (o8kVar2 instanceof e5k);
            case 26:
                return ((ybk) obj).g.get() != 0;
            case 27:
                return ((pbk) obj).s();
            case 28:
                return ((zbk) obj).b.s();
            default:
                return Objects.nonNull((Instant) obj);
        }
    }
}
