package ru.ok.android.externcalls.sdk.net.internal;

import defpackage.dwh;
import defpackage.o91;
import defpackage.ucb;
import defpackage.yn0;
import defpackage.zvh;
import kotlin.Metadata;
import org.webrtc.NetworkMonitor;
import ru.ok.android.externcalls.sdk.net.NetworkConnectionManager;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000b\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u0018\u0010\u0012\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u0011H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0014\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u0011H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lru/ok/android/externcalls/sdk/net/internal/NetworkConnectionManagerImpl;", "Lru/ok/android/externcalls/sdk/net/NetworkConnectionManager;", "Lo91;", "call", "<init>", "(Lo91;)V", "Lyn0;", "callback", "Lsbi;", "registerBadConnectionCallback", "(Lyn0;)V", "unregisterBadConnectionCallback", "Lucb;", "listener", "addNetworkConnectivityListener", "(Lucb;)V", "removeNetworkConnectivityListener", "Ldwh;", "plusAssign", "(Ldwh;)V", "minusAssign", "Lo91;", "Lzvh;", "getTopology", "()Lzvh;", "topology", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class NetworkConnectionManagerImpl implements NetworkConnectionManager {
    private final o91 call;

    public NetworkConnectionManagerImpl(o91 o91Var) {
        this.call = o91Var;
    }

    @Override // ru.ok.android.externcalls.sdk.net.NetworkConnectionManager
    public void addNetworkConnectivityListener(ucb listener) {
        if (this.call.k0.add(listener)) {
            NetworkMonitor.isOnline();
            listener.a();
        }
    }

    @Override // ru.ok.android.externcalls.sdk.net.NetworkConnectionManager
    public zvh getTopology() {
        return this.call.n0.w();
    }

    @Override // ru.ok.android.externcalls.sdk.net.NetworkConnectionManager
    public void minusAssign(dwh listener) {
        this.call.l0.remove(listener);
    }

    @Override // ru.ok.android.externcalls.sdk.net.NetworkConnectionManager
    public void plusAssign(dwh listener) {
        this.call.l0.add(listener);
    }

    @Override // ru.ok.android.externcalls.sdk.net.NetworkConnectionManager
    public void registerBadConnectionCallback(yn0 callback) {
        o91 o91Var = this.call;
        if (o91Var.P) {
            o91Var.O.k.add(callback);
        } else {
            o91Var.N.log("OKRTCCall", "Using registerBadConnectionCallback w/ enableLossRttBadConnectionHandling disabled, ignoring");
        }
    }

    @Override // ru.ok.android.externcalls.sdk.net.NetworkConnectionManager
    public void removeNetworkConnectivityListener(ucb listener) {
        this.call.k0.remove(listener);
    }

    @Override // ru.ok.android.externcalls.sdk.net.NetworkConnectionManager
    public void unregisterBadConnectionCallback(yn0 callback) {
        o91 o91Var = this.call;
        if (o91Var.P) {
            o91Var.O.k.remove(callback);
        } else {
            o91Var.N.log("OKRTCCall", "Using unregisterBadConnectionCallback w/ enableLossRttBadConnectionHandling disabled, ignoring");
        }
    }
}
