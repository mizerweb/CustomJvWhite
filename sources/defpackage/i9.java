package defpackage;

import android.service.notification.StatusBarNotification;
import android.telecom.CallEndpoint;
import java.util.Iterator;
import one.me.android.initialization.AccountInitializer;
import org.apache.http.conn.params.ConnManagerParams;

/* JADX INFO: loaded from: classes2.dex */
public final class i9 implements cf7 {
    public final /* synthetic */ int a;
    public static final i9 b = new i9(0);
    public static final i9 c = new i9(1);
    public static final i9 d = new i9(2);
    public static final i9 e = new i9(3);
    public static final i9 f = new i9(4);
    public static final i9 g = new i9(5);
    public static final i9 h = new i9(6);
    public static final i9 i = new i9(7);
    public static final i9 j = new i9(8);
    public static final i9 k = new i9(9);
    public static final i9 l = new i9(10);
    public static final i9 m = new i9(11);
    public static final i9 n = new i9(12);
    public static final i9 o = new i9(13);
    public static final i9 p = new i9(14);
    public static final i9 q = new i9(15);
    public static final i9 r = new i9(16);
    public static final i9 s = new i9(17);
    public static final i9 t = new i9(18);
    public static final i9 u = new i9(19);
    public static final i9 v = new i9(20);
    public static final i9 w = new i9(21);
    public static final i9 x = new i9(22);
    public static final i9 y = new i9(23);
    public static final i9 z = new i9(24);
    public static final i9 A = new i9(25);
    public static final i9 B = new i9(26);
    public static final i9 C = new i9(27);
    public static final i9 D = new i9(28);
    public static final i9 E = new i9(29);

    public /* synthetic */ i9(int i2) {
        this.a = i2;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        int i2 = this.a;
        long jT = 0;
        sbi sbiVar = sbi.a;
        switch (i2) {
            case 0:
                return String.valueOf(((StatusBarNotification) obj).getId());
            case 1:
                return sbiVar;
            case 2:
                try {
                    return ch3.X((fka) obj, null);
                } catch (Throwable th) {
                    gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th);
                    Iterator it = fjf.a.iterator();
                    while (it.hasNext()) {
                        AccountInitializer accountInitializer = ((n6) it.next()).a;
                        try {
                            gm0.V("Payload", "error while parse payload", th);
                            accountInitializer.d().i().g().a(null, th);
                        } catch (Throwable th2) {
                            gm0.V("Payload", "failed to collect exception", th2);
                        }
                    }
                    int iD = qt4.D(pye.a);
                    if (iD == 0) {
                        return null;
                    }
                    if (iD == 1) {
                        throw th;
                    }
                    ore.o();
                    return null;
                }
            case 3:
                return Boolean.valueOf(obj instanceof yf0);
            case 4:
                return w3m.c((fka) obj);
            case 5:
                a80 a80Var = (a80) obj;
                String str = a80Var.b;
                int i3 = a80Var.a;
                StringBuilder sbZ = zo5.z(str, "(type=");
                sbZ.append(p.p(i3));
                sbZ.append(")");
                return sbZ.toString();
            case 6:
                return sbiVar;
            case 7:
                return Boolean.valueOf(obj instanceof uy1);
            case 8:
                return Boolean.valueOf(obj instanceof uy1);
            case 9:
                return Boolean.valueOf(obj instanceof wy1);
            case 10:
                return Boolean.valueOf(obj instanceof wy1);
            case 11:
                return Boolean.valueOf(obj instanceof uy1);
            case 12:
                return Boolean.valueOf(obj instanceof wy1);
            case 13:
                return Boolean.valueOf(obj instanceof uy1);
            case 14:
                return Boolean.valueOf(obj instanceof uy1);
            case 15:
                return Boolean.valueOf(obj instanceof vgc);
            case 16:
                return Boolean.valueOf(obj instanceof xw7);
            case 17:
                return Boolean.valueOf(obj instanceof fp1);
            case 18:
                return Boolean.valueOf(obj instanceof xs1);
            case 19:
                try {
                    jT = ch3.T((fka) obj, 0L);
                    break;
                } catch (Throwable th3) {
                    gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th3);
                    Iterator it2 = fjf.a.iterator();
                    while (it2.hasNext()) {
                        AccountInitializer accountInitializer2 = ((n6) it2.next()).a;
                        try {
                            gm0.V("Payload", "error while parse payload", th3);
                            accountInitializer2.d().i().g().a(null, th3);
                        } catch (Throwable th4) {
                            gm0.V("Payload", "failed to collect exception", th4);
                        }
                    }
                    int iD2 = qt4.D(pye.a);
                    if (iD2 != 0) {
                        if (iD2 == 1) {
                            throw th3;
                        }
                        ore.o();
                        return null;
                    }
                }
                return Long.valueOf(jT);
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                return o63.a((fka) obj);
            case 21:
                CallEndpoint callEndpointJ = rh.j(obj);
                CharSequence endpointName = callEndpointJ.getEndpointName();
                return ((Object) endpointName) + "(type=" + callEndpointJ.getEndpointType() + ")";
            case 22:
                CallEndpoint callEndpointJ2 = rh.j(obj);
                CharSequence endpointName2 = callEndpointJ2.getEndpointName();
                return ((Object) endpointName2) + "(type=" + callEndpointJ2.getEndpointType() + ")";
            case 23:
                a80 a80Var2 = (a80) obj;
                String str2 = a80Var2.b;
                int i4 = a80Var2.a;
                String str3 = a80Var2.c;
                StringBuilder sbZ2 = zo5.z(str2, "(type=");
                sbZ2.append(p.p(i4));
                sbZ2.append(", id=");
                sbZ2.append(str3);
                sbZ2.append(")");
                return sbZ2.toString();
            case 24:
                ((di4) obj).q = 0L;
                return sbiVar;
            default:
                pj6.a.i(((Boolean) obj).booleanValue() ? 2 : 6);
            case 25:
            case 26:
            case 27:
            case 28:
                return sbiVar;
        }
    }
}
