package defpackage;

import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;

/* JADX INFO: loaded from: classes2.dex */
public final class gd8 extends ConnectivityManager.NetworkCallback {
    public static final /* synthetic */ int c = 0;
    public final /* synthetic */ int a;
    public final Object b;

    public gd8(iaa iaaVar) {
        this.a = 0;
        this.b = iaaVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onAvailable(Network network) {
        switch (this.a) {
            case 1:
                network.getClass();
                ((lcb) this.b).b.log("OVC_ST_Helper_1", "Network available " + network);
                vuf vufVar = ((lcb) this.b).c;
                if (vufVar != null) {
                    ((p4g) vufVar.b).tryReconnectNow();
                }
                break;
            default:
                super.onAvailable(network);
                break;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onBlockedStatusChanged(Network network, boolean z) {
        switch (this.a) {
            case 1:
                network.getClass();
                ((lcb) this.b).b.log("OVC_ST_Helper_1", "NT blocked " + network + " blocked=" + z);
                return;
            case 2:
                if (network.equals(((hdb) this.b).f.getActiveNetwork())) {
                    n1g.x().p(gdb.a, "Network blocked status changed: " + z);
                    hdb hdbVar = (hdb) this.b;
                    Object objA = hdbVar.e;
                    if (objA == null) {
                        objA = hdbVar.a();
                    }
                    fdb fdbVar = (fdb) objA;
                    hdb hdbVar2 = (hdb) this.b;
                    synchronized (hdbVar2.g) {
                        if (hdbVar2.h == z) {
                            return;
                        }
                        hdbVar2.h = z;
                        ((hdb) this.b).b(new fdb(fdbVar.a, fdbVar.b, fdbVar.c, fdbVar.d, z));
                        return;
                    }
                }
                return;
            default:
                super.onBlockedStatusChanged(network, z);
                return;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        switch (this.a) {
            case 0:
                n1g.x().p(byj.a, "NetworkRequestConstraintController onCapabilitiesChanged callback");
                ((iaa) this.b).invoke(mg4.a);
                break;
            case 1:
                network.getClass();
                networkCapabilities.getClass();
                ((lcb) this.b).b.log("OVC_ST_Helper_1", "NT caps update " + network + " caps=" + networkCapabilities);
                break;
            default:
                n1g.x().p(gdb.a, "Network capabilities changed: " + networkCapabilities);
                hdb hdbVar = (hdb) this.b;
                hdbVar.b(gdb.b(hdbVar.f, hdbVar.h));
                break;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
        switch (this.a) {
            case 1:
                network.getClass();
                linkProperties.getClass();
                ((lcb) this.b).b.log("OVC_ST_Helper_1", "NT updated " + network + " props=" + linkProperties);
                break;
            default:
                super.onLinkPropertiesChanged(network, linkProperties);
                break;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onLosing(Network network, int i) {
        switch (this.a) {
            case 1:
                network.getClass();
                ((lcb) this.b).b.log("OVC_ST_Helper_1", "NT losing " + network + ". mttl=" + i);
                break;
            default:
                super.onLosing(network, i);
                break;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                n1g.x().p(byj.a, "NetworkRequestConstraintController onLost callback");
                ((iaa) obj).invoke(new ng4(7));
                break;
            case 1:
                network.getClass();
                ((lcb) obj).b.log("OVC_ST_Helper_1", "NT lost " + network);
                break;
            default:
                n1g.x().p(gdb.a, "Network connection lost");
                ((hdb) obj).b(new fdb(false, false, false, false, false));
                break;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onUnavailable() {
        switch (this.a) {
            case 1:
                ((lcb) this.b).b.log("OVC_ST_Helper_1", "Network unavailable");
                break;
            default:
                super.onUnavailable();
                break;
        }
    }

    public /* synthetic */ gd8(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
