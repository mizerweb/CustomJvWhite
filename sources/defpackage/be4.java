package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

/* JADX INFO: loaded from: classes.dex */
public final class be4 extends ConnectivityManager.NetworkCallback {
    public final /* synthetic */ de4 a;

    public be4(de4 de4Var) {
        this.a = de4Var;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        de4 de4Var = this.a;
        gm0.n(de4Var.p, "onAvailable");
        de4Var.q(ae4.a((ae4) de4Var.o.get(), true));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        de4 de4Var = this.a;
        de4Var.k = de4.k(networkCapabilities, de4Var.m(network));
        this.a.l = (((long) networkCapabilities.getLinkDownstreamBandwidthKbps()) << 32) | (((long) networkCapabilities.getLinkUpstreamBandwidthKbps()) & 4294967295L);
        de4 de4Var2 = this.a;
        String str = de4Var2.p;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "onCapabilitiesChanged, current connection is " + de4Var2.k + ", capabilities=" + networkCapabilities + ", net=" + network, null);
            }
        }
        ae4 ae4VarP = this.a.p(new ylc(network, networkCapabilities));
        if (ae4VarP != null) {
            this.a.q(ae4VarP);
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        String str = this.a.p;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "onLost", null);
            }
        }
        this.a.l = 0L;
        de4 de4Var = this.a;
        de4Var.q(ae4.a((ae4) de4Var.o.get(), false));
    }
}
