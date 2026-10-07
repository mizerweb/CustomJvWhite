package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class tzf extends ConnectivityManager.NetworkCallback {
    public static final tzf a = new tzf();
    public static final Object b = new Object();
    public static final LinkedHashMap c = new LinkedHashMap();
    public static NetworkCapabilities d;
    public static boolean e;
    public static Boolean f;

    public static void a() {
        ArrayList<ylc> arrayList = new ArrayList();
        synchronized (b) {
            try {
                if (e && f != null) {
                    for (Map.Entry entry : c.entrySet()) {
                        cf7 cf7Var = (cf7) entry.getKey();
                        NetworkRequest networkRequest = (NetworkRequest) entry.getValue();
                        tzf tzfVar = a;
                        NetworkCapabilities networkCapabilities = d;
                        tzfVar.getClass();
                        arrayList.add(new ylc(cf7Var, !f.booleanValue() && networkRequest.canBeSatisfiedBy(networkCapabilities) ? mg4.a : new ng4(7)));
                    }
                    for (ylc ylcVar : arrayList) {
                        ((cf7) ylcVar.a).invoke((og4) ylcVar.b);
                    }
                    return;
                }
                n1g.x().p(byj.a, "Not dispatching constraint state yet: isBlocked=" + f + ", capabilitiesInitialized=" + e);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onBlockedStatusChanged(Network network, boolean z) {
        n1g.x().p(byj.a, "NetworkRequestConstraintController onBlockedStatusChanged callback " + z);
        synchronized (b) {
            if (cqk.d(f, Boolean.valueOf(z))) {
                return;
            }
            f = Boolean.valueOf(z);
            a();
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        n1g.x().p(byj.a, "NetworkRequestConstraintController onCapabilitiesChanged callback");
        synchronized (b) {
            d = networkCapabilities;
            e = true;
        }
        a();
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        n1g.x().p(byj.a, "NetworkRequestConstraintController onLost callback");
        synchronized (b) {
            d = null;
            Iterator it = c.keySet().iterator();
            while (it.hasNext()) {
                ((cf7) it.next()).invoke(new ng4(7));
            }
        }
    }
}
