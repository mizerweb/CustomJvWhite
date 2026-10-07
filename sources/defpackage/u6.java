package defpackage;

import java.net.DatagramPacket;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;
import org.apache.http.conn.params.ConnManagerParams;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class u6 implements Predicate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ u6(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                return ((Boolean) ((m) obj2).invoke(obj)).booleanValue();
            case 1:
                ((n94) obj2).invoke(obj);
                return Boolean.TRUE.booleanValue();
            case 2:
                ((i05) obj2).getClass();
                return !(((gab) obj) instanceof z0k);
            case 3:
                return ((Boolean) ((sl6) obj2).invoke(obj)).booleanValue();
            case 4:
                return ((Boolean) ((aa2) obj2).invoke(obj)).booleanValue();
            case 5:
                return ((Boolean) ((us5) obj2).invoke(obj)).booleanValue();
            case 6:
                return ((Boolean) ((x27) obj2).invoke(obj)).booleanValue();
            case 7:
                return ((Boolean) ((nv4) obj2).invoke(obj)).booleanValue();
            case 8:
                return ((Boolean) ((nv4) obj2).invoke(obj)).booleanValue();
            case 9:
                ((mu6) obj2).invoke(obj);
                return Boolean.TRUE.booleanValue();
            case 10:
                return ((Boolean) ((lh9) obj2).invoke(obj)).booleanValue();
            case 11:
                return ((Boolean) ((ez) obj2).invoke(obj)).booleanValue();
            case 12:
                return ((Boolean) ((pyb) obj2).invoke(obj)).booleanValue();
            case 13:
                return ((Boolean) ((r8d) obj2).invoke(obj)).booleanValue();
            case 14:
                return ((Boolean) ((v14) obj2).invoke(obj)).booleanValue();
            case 15:
                return ((Boolean) ((aa2) obj2).invoke(obj)).booleanValue();
            case 16:
                return ((Boolean) ((p7d) obj2).invoke(obj)).booleanValue();
            case 17:
                return ((Boolean) ((ez) obj2).invoke(obj)).booleanValue();
            case 18:
                return ((Boolean) ((aa2) obj2).invoke(obj)).booleanValue();
            case 19:
                return ((Boolean) ((u8h) obj2).invoke(obj)).booleanValue();
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                p4k p4kVar = (p4k) obj2;
                p4kVar.getClass();
                return Arrays.equals(((z5k) ((Map.Entry) obj).getValue()).b, p4kVar.b);
            case 21:
                return ((jfk) obj).a == ((jfk) obj2).a;
            case 22:
                return ((HashMap) ((l5b) obj2).h).containsKey((Long) obj);
            case 23:
                return ((Long) obj).longValue() <= ((Long) ((Optional) obj2).get()).longValue();
            case 24:
                return ((zbk) obj).a.isAfter(((y5k) obj2).e);
            case 25:
                z7k z7kVar = (z7k) obj2;
                DatagramPacket datagramPacket = (DatagramPacket) obj;
                return datagramPacket.getAddress().equals(z7kVar.A) && datagramPacket.getPort() == z7kVar.x;
            case 26:
                return ((u8k) obj).a == (((t8k) obj2).b & 3);
            default:
                return ((zbk) obj).b.p().longValue() == ((e5k) obj2).b;
        }
    }
}
