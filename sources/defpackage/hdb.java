package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;

/* JADX INFO: loaded from: classes2.dex */
public final class hdb extends fg4 {
    public final ConnectivityManager f;
    public final Object g;
    public volatile boolean h;
    public final gd8 i;

    public hdb(Context context, azj azjVar) {
        super(context, azjVar);
        this.f = (ConnectivityManager) this.b.getSystemService("connectivity");
        this.g = new Object();
        this.i = new gd8(2, this);
    }

    @Override // defpackage.fg4
    public final Object a() {
        return gdb.b(this.f, this.h);
    }

    @Override // defpackage.fg4
    public final void c() {
        try {
            n1g.x().p(gdb.a, "Registering network callback");
            this.f.registerDefaultNetworkCallback(this.i);
        } catch (IllegalArgumentException e) {
            n1g.x().t(gdb.a, "Received exception while registering network callback", e);
        } catch (SecurityException e2) {
            n1g.x().t(gdb.a, "Received exception while registering network callback", e2);
        }
    }

    @Override // defpackage.fg4
    public final void d() {
        try {
            n1g.x().p(gdb.a, "Unregistering network callback");
            this.f.unregisterNetworkCallback(this.i);
        } catch (IllegalArgumentException e) {
            n1g.x().t(gdb.a, "Received exception while unregistering network callback", e);
        } catch (SecurityException e2) {
            n1g.x().t(gdb.a, "Received exception while unregistering network callback", e2);
        }
    }
}
