package defpackage;

import android.util.Log;
import java.net.InetAddress;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import one.me.android.initialization.AccountInitializer;
import one.me.messages.list.loader.MessageModel;
import one.me.rlottie.RLottieImageView;

/* JADX INFO: loaded from: classes3.dex */
public final class dz7 implements cf7 {
    public static final dz7 b = new dz7(0);
    public static final dz7 c = new dz7(1);
    public static final dz7 d = new dz7(2);
    public static final dz7 e = new dz7(3);
    public static final dz7 f = new dz7(4);
    public static final dz7 g = new dz7(5);
    public static final dz7 h = new dz7(6);
    public static final dz7 i = new dz7(7);
    public static final dz7 j = new dz7(8);
    public static final dz7 k = new dz7(9);
    public static final dz7 l = new dz7(10);
    public static final dz7 m = new dz7(11);
    public static final dz7 n = new dz7(12);
    public static final dz7 o = new dz7(13);
    public static final dz7 p = new dz7(14);
    public static final dz7 q = new dz7(15);
    public static final dz7 r = new dz7(16);
    public static final dz7 s = new dz7(17);
    public final /* synthetic */ int a;

    public /* synthetic */ dz7(int i2) {
        this.a = i2;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        int i2 = this.a;
        sbi sbiVar = sbi.a;
        switch (i2) {
            case 0:
                return "- " + ((InetAddress) obj);
            case 1:
                lve lveVar = (lve) obj;
                return lveVar.b + "|" + lveVar.a;
            case 2:
                return ww3.z1(((hve) obj).e(), ",", "[", "]", c, 24);
            case 3:
                lve lveVar2 = (lve) obj;
                return lveVar2.b + "|" + lveVar2.a;
            case 4:
                return ww3.z1(((hve) obj).e(), ",", "[", "]", e, 24);
            case 5:
                return Boolean.valueOf(obj instanceof MessageModel);
            case 6:
                return String.valueOf(((tia) obj).e);
            case 7:
                return ((g6e) obj).b;
            case 8:
                return w3m.c((fka) obj);
            case 9:
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
            case 10:
            case 11:
                return sbiVar;
            case 12:
                long jT = 0;
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
            case 13:
                return Boolean.valueOf(obj instanceof RLottieImageView);
            case 14:
                return ((g6e) obj).b;
            case 15:
                return ((osg) obj).c;
            case 16:
                Throwable th5 = (Throwable) obj;
                if (th5 != null && !(th5 instanceof CancellationException) && tvj.f(6, "CXCP")) {
                    Log.e("CXCP", "Surface setup error!", th5);
                }
                return sbiVar;
            default:
                ys8 ys8Var = (ys8) obj;
                ys8Var.b = true;
                ys8Var.c = true;
                return sbiVar;
        }
    }
}
