package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Handler;

/* JADX INFO: loaded from: classes4.dex */
public final class vme extends ConnectivityManager.NetworkCallback {
    public boolean a;
    public boolean b;
    public final /* synthetic */ ake c;

    public vme(ake akeVar) {
        this.c = akeVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        ((Handler) this.c.e).post(new ume(this, 0));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onBlockedStatusChanged(Network network, boolean z) {
        if (z) {
            return;
        }
        ((Handler) this.c.e).post(new ume(this, 1));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        boolean zHasCapability = networkCapabilities.hasCapability(16);
        boolean z = this.a;
        ake akeVar = this.c;
        if (z && this.b == zHasCapability) {
            if (zHasCapability) {
                ((Handler) akeVar.e).post(new ume(this, 1));
            }
        } else {
            this.a = true;
            this.b = zHasCapability;
            ((Handler) akeVar.e).post(new ume(this, 0));
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        ((Handler) this.c.e).post(new ume(this, 0));
    }
}
