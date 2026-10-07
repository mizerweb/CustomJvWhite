package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes.dex */
public final class de4 implements wd4 {
    public final Context a;
    public final ExecutorService b;
    public final iz8 c;
    public final ny8 d;
    public final ifh e;
    public final AtomicBoolean f;
    public final AtomicBoolean g;
    public final AtomicBoolean h;
    public final ifh i;
    public final ifh j;
    public volatile we4 k;
    public volatile long l;
    public final CopyOnWriteArraySet m;
    public final be4 n;
    public final AtomicReference o;
    public final String p;

    public de4(Context context, ExecutorService executorService, iz8 iz8Var, ifh ifhVar, ny8 ny8Var) {
        this.a = context;
        this.b = executorService;
        this.c = iz8Var;
        this.d = ny8Var;
        this.e = ifhVar;
        final int i = 0;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.f = atomicBoolean;
        this.g = new AtomicBoolean(false);
        this.h = new AtomicBoolean(false);
        this.i = new ifh(new af7(this) { // from class: zd4
            public final /* synthetic */ de4 b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i2 = i;
                de4 de4Var = this.b;
                switch (i2) {
                    case 0:
                        return (ConnectivityManager) de4Var.a.getSystemService("connectivity");
                    default:
                        return (TelephonyManager) de4Var.a.getSystemService("phone");
                }
            }
        });
        final int i2 = 1;
        this.j = new ifh(new af7(this) { // from class: zd4
            public final /* synthetic */ de4 b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i3 = i2;
                de4 de4Var = this.b;
                switch (i3) {
                    case 0:
                        return (ConnectivityManager) de4Var.a.getSystemService("connectivity");
                    default:
                        return (TelephonyManager) de4Var.a.getSystemService("phone");
                }
            }
        });
        this.k = we4.TYPE_UNKNOWN;
        this.m = new CopyOnWriteArraySet();
        this.n = new be4(this);
        this.o = new AtomicReference(ae4.f);
        this.p = de4.class.getName();
        atomicBoolean.set(o(false));
        n();
    }

    public static NetworkCapabilities j(de4 de4Var) {
        try {
            NetworkCapabilities networkCapabilities = de4Var.l().getNetworkCapabilities(de4Var.i());
            if (networkCapabilities != null) {
                return networkCapabilities;
            }
            String str = de4Var.p;
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.f;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str, "Unable to get network capabilities (background/blocked?)", null);
                    return null;
                }
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public static we4 k(NetworkCapabilities networkCapabilities, NetworkInfo networkInfo) {
        int subtype;
        if (networkCapabilities != null) {
            if (!networkCapabilities.hasTransport(1) && !networkCapabilities.hasTransport(3)) {
                if (!(Build.VERSION.SDK_INT >= 31 ? networkCapabilities.hasTransport(8) : false)) {
                    boolean zHasTransport = networkCapabilities.hasTransport(0);
                    we4 we4Var = we4.TYPE_MOBILE_SLOW;
                    if (zHasTransport && networkInfo != null && ((subtype = networkInfo.getSubtype()) == 1 || subtype == 2 || subtype == 4 || subtype == 7 || subtype == 11 || subtype == 16)) {
                        return we4Var;
                    }
                    boolean zHasTransport2 = networkCapabilities.hasTransport(0);
                    we4 we4Var2 = we4.TYPE_MOBILE_FAST;
                    we4 we4Var3 = we4.TYPE_MOBILE_NORMAL;
                    if (zHasTransport2) {
                        int linkDownstreamBandwidthKbps = networkCapabilities.getLinkDownstreamBandwidthKbps();
                        if (linkDownstreamBandwidthKbps <= 1000) {
                            return we4Var;
                        }
                        return linkDownstreamBandwidthKbps <= 23000 ? we4Var3 : we4Var2;
                    }
                    if (networkCapabilities.hasTransport(2)) {
                        int linkDownstreamBandwidthKbps2 = networkCapabilities.getLinkDownstreamBandwidthKbps();
                        if (linkDownstreamBandwidthKbps2 <= 1000) {
                            return we4Var;
                        }
                        return linkDownstreamBandwidthKbps2 <= 23000 ? we4Var3 : we4Var2;
                    }
                }
            }
            return we4.TYPE_WIFI;
        }
        return we4.TYPE_UNKNOWN;
    }

    @Override // defpackage.wd4
    public final we4 a() {
        we4 we4Var = this.k;
        we4 we4VarK = we4.TYPE_UNKNOWN;
        if (we4Var != we4VarK) {
            return this.k;
        }
        Network activeNetwork = l().getActiveNetwork();
        if (activeNetwork != null) {
            try {
                we4VarK = k(l().getNetworkCapabilities(activeNetwork), m(null));
            } catch (SecurityException e) {
                iz8 iz8Var = this.c;
                gm0.V("ConnectionInfo", "failed getNetworkCapabilities", e);
                ((hgh) iz8Var.a.c(74)).g().a(null, e);
            }
        }
        this.k = we4VarK;
        return we4VarK;
    }

    @Override // defpackage.wd4
    public final long b() {
        return this.l;
    }

    @Override // defpackage.wd4
    public final boolean c() {
        return false;
    }

    @Override // defpackage.wd4
    public final boolean d() {
        return ((TelephonyManager) this.j.getValue()).isNetworkRoaming();
    }

    @Override // defpackage.wd4
    public final boolean e() {
        return l().getRestrictBackgroundStatus() != 3;
    }

    @Override // defpackage.wd4
    public final void f(vd4 vd4Var) {
        if (vd4Var != null) {
            this.m.add(vd4Var);
        }
    }

    @Override // defpackage.wd4
    public final void g(vd4 vd4Var) {
        if (vd4Var != null) {
            this.m.remove(vd4Var);
        }
    }

    @Override // defpackage.wd4
    public final boolean h() {
        if (this.f.get()) {
            return ((ae4) this.o.get()).a;
        }
        RuntimeException runtimeException = new RuntimeException() { // from class: one.me.net.connection.impl.internal.ConnectionInfoNougatImpl$RegisterDefaultNetworkCallbackException
        };
        gm0.V(this.p, "default network callback is not registered yet", runtimeException);
        ((jz8) this.e.getValue()).a(runtimeException);
        NetworkInfo activeNetworkInfo = l().getActiveNetworkInfo();
        boolean z = activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting();
        String str = this.p;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, zo5.s("fallbackOnDeprecatedCheckOfConnection: isConnected = ", z), null);
            }
        }
        return z;
    }

    public final Network i() {
        try {
            Network activeNetwork = l().getActiveNetwork();
            if (activeNetwork != null) {
                return activeNetwork;
            }
            String str = this.p;
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.f;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str, "Unable to get active network (background/blocked?)", null);
                    return null;
                }
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    @Override // defpackage.wd4
    public final void invalidate() {
        ae4 ae4VarP;
        String str = this.p;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "invalidate", null);
            }
        }
        n();
        this.f.set(o(true));
        if (this.f.get() || (ae4VarP = p(null)) == null) {
            return;
        }
        q(ae4VarP);
    }

    public final ConnectivityManager l() {
        return (ConnectivityManager) this.i.getValue();
    }

    public final NetworkInfo m(Network network) {
        try {
            NetworkInfo networkInfo = network != null ? l().getNetworkInfo(network) : l().getActiveNetworkInfo();
            if (networkInfo == null) {
                String str = this.p;
                a4c a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9 je9Var = je9.f;
                    if (a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, str, "unable to get " + (network != null ? "" : "active ") + "network info", null);
                    }
                }
            }
            return networkInfo;
        } catch (Exception unused) {
            return null;
        }
    }

    public final void n() {
        boolean z = false;
        if (this.g.compareAndSet(false, true)) {
            String str = this.p;
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.d;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str, "maybeRegisterBackRestrictionsChangesReceiver", null);
                }
            }
            AtomicBoolean atomicBoolean = this.g;
            try {
                Context context = this.a;
                gu0 gu0Var = new gu0(2, this);
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.net.conn.RESTRICT_BACKGROUND_CHANGED");
                np4.z(context, gu0Var, intentFilter, null, null, 4);
                String str2 = this.p;
                a4c a4cVar2 = gm0.f;
                if (a4cVar2 != null) {
                    je9 je9Var2 = je9.e;
                    if (a4cVar2.b(je9Var2)) {
                        a4cVar2.c(je9Var2, str2, "maybeRegisterBackRestrictionsChangesReceiver, receiver successfully registered", null);
                    }
                }
                z = true;
            } catch (Throwable th) {
                gm0.V(this.p, "maybeRegisterBackRestrictionsChangesReceiver, failed to register receiver for background restrictions changes", th);
                if (this.h.compareAndSet(false, true)) {
                    ((jz8) this.e.getValue()).a(new RuntimeException(th) { // from class: one.me.net.connection.impl.internal.ConnectionInfoNougatImpl$RegisterBackRestrictionsChangesReceiverException
                    });
                }
            }
            atomicBoolean.set(z);
        }
    }

    public final boolean o(boolean z) {
        String str = this.p;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "registerNetworkCallback", null);
            }
        }
        if (z) {
            try {
                l().unregisterNetworkCallback(this.n);
            } catch (Throwable th) {
                gm0.V(this.p, "registerNetworkCallback, unable to unregister default network callback", th);
                ((jz8) this.e.getValue()).a(th);
            }
        }
        try {
            l().registerDefaultNetworkCallback(this.n);
            String str2 = this.p;
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 != null) {
                je9 je9Var2 = je9.e;
                if (a4cVar2.b(je9Var2)) {
                    a4cVar2.c(je9Var2, str2, "registerNetworkCallback, default network callback successfully registered", null);
                }
            }
            return true;
        } catch (Throwable th2) {
            iz8 iz8Var = this.c;
            gm0.V("ConnectionInfo", "Unable to register default network callback", th2);
            ((hgh) iz8Var.a.c(74)).g().a(null, th2);
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0078  */
    public final ae4 p(ylc ylcVar) {
        Network networkI;
        NetworkCapabilities networkCapabilitiesJ;
        boolean z;
        NetworkInfo networkInfoM;
        je9 je9Var = je9.f;
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (ylcVar == null || (networkI = (Network) ylcVar.a) == null) {
            networkI = i();
        }
        if (networkI == null) {
            String str = this.p;
            a4c a4cVar = gm0.f;
            if (a4cVar != null && a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "Early return in retrieveActiveInet cuz has no network", null);
                return null;
            }
        } else {
            if (ylcVar == null || (networkCapabilitiesJ = (NetworkCapabilities) ylcVar.b) == null) {
                networkCapabilitiesJ = j(this);
            }
            if (networkCapabilitiesJ != null) {
                if (networkCapabilitiesJ.hasTransport(0) || networkCapabilitiesJ.hasTransport(1) || networkCapabilitiesJ.hasTransport(3) || networkCapabilitiesJ.hasTransport(2)) {
                    z = true;
                } else {
                    if (Build.VERSION.SDK_INT >= 31 ? networkCapabilitiesJ.hasTransport(8) : false) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
                boolean z2 = z && networkCapabilitiesJ.hasCapability(12);
                int i = Build.VERSION.SDK_INT;
                ae4 ae4Var = new ae4(z2, i < 30 ? !networkCapabilitiesJ.hasCapability(11) : !(networkCapabilitiesJ.hasCapability(11) || networkCapabilitiesJ.hasCapability(25)), i < 28 ? !((networkInfoM = m(networkI)) == null || !networkInfoM.isRoaming()) : !networkCapabilitiesJ.hasCapability(18), z, networkCapabilitiesJ.hasTransport(4));
                long jUptimeMillis2 = SystemClock.uptimeMillis() - jUptimeMillis;
                String str2 = z2 ? "" : " NO";
                String str3 = c() ? "(VPN detected)" : "";
                StringBuilder sbT = qt4.t(jUptimeMillis2, "\n                retrieveInet(", "ms), has", str2);
                sbT.append(" inet");
                sbT.append(str3);
                sbT.append("\n                  net=");
                sbT.append(networkI);
                sbT.append("\n                  cap=");
                sbT.append(networkCapabilitiesJ);
                sbT.append("\n            ");
                String strX0 = s5h.x0(sbT.toString());
                String str4 = this.p;
                if (z2) {
                    a4c a4cVar2 = gm0.f;
                    if (a4cVar2 != null) {
                        je9 je9Var2 = je9.e;
                        if (a4cVar2.b(je9Var2)) {
                            a4cVar2.c(je9Var2, str4, strX0, null);
                            return ae4Var;
                        }
                    }
                } else {
                    a4c a4cVar3 = gm0.f;
                    if (a4cVar3 != null && a4cVar3.b(je9Var)) {
                        a4cVar3.c(je9Var, str4, strX0, null);
                    }
                }
                return ae4Var;
            }
            String str5 = this.p;
            a4c a4cVar4 = gm0.f;
            if (a4cVar4 != null && a4cVar4.b(je9Var)) {
                a4cVar4.c(je9Var, str5, "Early return in retrieveActiveInet cuz has no network caps", null);
            }
        }
        return null;
    }

    public final void q(ae4 ae4Var) {
        je9 je9Var = je9.c;
        ae4 ae4Var2 = (ae4) this.o.get();
        if (cqk.d(ae4Var2, ae4Var)) {
            String str = this.p;
            a4c a4cVar = gm0.f;
            if (a4cVar != null && a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "inet equals!", null);
                return;
            }
            return;
        }
        this.o.set(ae4Var);
        if (ae4Var2.e != ae4Var.e) {
            String str2 = this.p;
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                a4cVar2.c(je9Var, str2, qv1.m("updateInet, vpn changed to ", ", reset dns ...", ae4Var.e), null);
            }
            vo5 vo5Var = (vo5) this.d.getValue();
            String str3 = vo5Var.e;
            a4c a4cVar3 = gm0.f;
            if (a4cVar3 != null && a4cVar3.b(je9Var)) {
                a4cVar3.c(je9Var, str3, "reset", null);
            }
            ReentrantReadWriteLock.WriteLock writeLock = vo5Var.f.writeLock();
            writeLock.lock();
            try {
                vo5.c(vo5Var, null, 1);
                writeLock.unlock();
            } catch (Throwable th) {
                writeLock.unlock();
                throw th;
            }
        }
        boolean z = ((ae4) this.o.get()).a;
        String str4 = this.p;
        if (z) {
            a4c a4cVar4 = gm0.f;
            if (a4cVar4 != null) {
                je9 je9Var2 = je9.e;
                if (a4cVar4.b(je9Var2)) {
                    a4cVar4.c(je9Var2, str4, "updateInet, " + ae4Var + " has working connection", null);
                }
            }
        } else {
            a4c a4cVar5 = gm0.f;
            if (a4cVar5 != null) {
                je9 je9Var3 = je9.f;
                if (a4cVar5.b(je9Var3)) {
                    a4cVar5.c(je9Var3, str4, "updateInet, " + ae4Var + " has no working connection", null);
                }
            }
        }
        this.b.execute(new e6(10, this));
    }
}
