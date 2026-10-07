package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.net.InetAddress;
import java.util.Iterator;
import one.me.android.initialization.AccountInitializer;

/* JADX INFO: loaded from: classes.dex */
public final class ba implements cf7 {
    public static final ba b = new ba(0);
    public static final ba c = new ba(1);
    public static final ba d = new ba(2);
    public static final ba e = new ba(3);
    public static final ba f = new ba(4);
    public static final ba g = new ba(5);
    public static final ba h = new ba(6);
    public static final ba i = new ba(7);
    public final /* synthetic */ int a;

    public /* synthetic */ ba(int i2) {
        this.a = i2;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                return String.valueOf(((WeakReference) obj).get());
            case 1:
                ha9 ha9Var = (ha9) obj;
                r7 r7Var = r7.a;
                r3f r3fVarB = r7.b(ha9Var);
                if (r3fVarB == null) {
                    a4c a4cVar = gm0.f;
                    if (a4cVar != null) {
                        je9 je9Var = je9.f;
                        if (a4cVar.b(je9Var)) {
                            a4cVar.c(je9Var, "multiaccount", qv1.i("Missing required scope ", ha9Var), null);
                        }
                    }
                    r3fVarB = r7.d(ha9.b);
                }
                return (x65) new ca2(r3fVarB).getAccessor().c(182);
            case 2:
                return "- " + ((InetAddress) obj);
            case 3:
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
            case 4:
                return "  " + ((InetAddress) obj);
            case 5:
                return "  " + ((clh) obj);
            case 6:
                return Boolean.valueOf(obj instanceof RecyclerView);
            default:
                ((ys8) obj).b = true;
                return sbi.a;
        }
    }
}
