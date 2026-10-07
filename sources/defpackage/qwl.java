package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.os.StrictMode;
import com.google.android.gms.common.internal.zzaf;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class qwl implements ServiceConnection {
    public final HashMap a = new HashMap();
    public int b = 2;
    public boolean c;
    public IBinder d;
    public final nul e;
    public ComponentName f;
    public final /* synthetic */ c1m g;

    public qwl(c1m c1mVar, nul nulVar) {
        this.g = c1mVar;
        this.e = nulVar;
    }

    public final void a() {
        nul nulVar = this.e;
        c1m c1mVar = this.g;
        c1mVar.c.removeMessages(1, nulVar);
        c1mVar.d.b(c1mVar.b, this);
        this.c = false;
        this.b = 2;
    }

    public final void b(q1l q1lVar, q1l q1lVar2) {
        this.a.put(q1lVar, q1lVar2);
    }

    public final void c(ServiceConnection serviceConnection) {
        this.a.remove(serviceConnection);
    }

    public final boolean d() {
        return this.c;
    }

    public final int e() {
        return this.b;
    }

    public final boolean f(ServiceConnection serviceConnection) {
        return this.a.containsKey(serviceConnection);
    }

    public final boolean g() {
        return this.a.isEmpty();
    }

    public final IBinder h() {
        return this.d;
    }

    public final ComponentName i() {
        return this.f;
    }

    public final le4 j(String str, Executor executor) {
        try {
            Intent intentA = wnk.a(this.g.b, this.e);
            this.b = 3;
            StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
            if (Build.VERSION.SDK_INT >= 31) {
                StrictMode.setVmPolicy(ytk.a(new StrictMode.VmPolicy.Builder(vmPolicy)).build());
            }
            try {
                c1m c1mVar = this.g;
                ue4 ue4Var = c1mVar.d;
                Context context = c1mVar.b;
                nul nulVar = this.e;
                boolean zC = ue4Var.c(context, str, intentA, this, 4225, executor);
                this.c = zC;
                if (zC) {
                    c1mVar.c.sendMessageDelayed(c1mVar.c.obtainMessage(1, nulVar), c1mVar.f);
                    return le4.f;
                }
                this.b = 2;
                try {
                    c1mVar.d.b(c1mVar.b, this);
                } catch (IllegalArgumentException unused) {
                }
                return new le4(16, null, null);
            } finally {
                StrictMode.setVmPolicy(vmPolicy);
            }
        } catch (zzaf e) {
            return e.a;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        c1m c1mVar = this.g;
        synchronized (c1mVar.a) {
            try {
                c1mVar.c.removeMessages(1, this.e);
                this.d = iBinder;
                this.f = componentName;
                Iterator it = this.a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
                }
                this.b = 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        c1m c1mVar = this.g;
        synchronized (c1mVar.a) {
            try {
                c1mVar.c.removeMessages(1, this.e);
                this.d = null;
                this.f = componentName;
                Iterator it = this.a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
                }
                this.b = 2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
