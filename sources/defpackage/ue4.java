package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class ue4 {
    public static final Object b = new Object();
    public static volatile ue4 c;
    public final ConcurrentHashMap a;

    public ue4(int i) {
        switch (i) {
            case 1:
                this.a = new ConcurrentHashMap(16);
                break;
            default:
                this.a = new ConcurrentHashMap();
                break;
        }
    }

    public static ue4 a() {
        if (c == null) {
            synchronized (b) {
                try {
                    if (c == null) {
                        c = new ue4(0);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        ue4 ue4Var = c;
        yab.s(ue4Var);
        return ue4Var;
    }

    public void b(Context context, ServiceConnection serviceConnection) {
        if (!(serviceConnection instanceof qwl)) {
            ConcurrentHashMap concurrentHashMap = this.a;
            if (concurrentHashMap.containsKey(serviceConnection)) {
                try {
                    try {
                        context.unbindService((ServiceConnection) concurrentHashMap.get(serviceConnection));
                    } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused) {
                    }
                    return;
                } finally {
                    concurrentHashMap.remove(serviceConnection);
                }
            }
        }
        try {
            context.unbindService(serviceConnection);
        } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused2) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    public boolean c(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i, Executor executor) {
        boolean z;
        ComponentName component = intent.getComponent();
        if (component == null) {
            z = false;
        } else {
            try {
                if ((q0k.a(context).a.getPackageManager().getApplicationInfo(component.getPackageName(), 0).flags & 2097152) != 0) {
                    z = true;
                } else {
                    z = false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        if (z) {
            Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
            return false;
        }
        if (serviceConnection instanceof qwl) {
            if (executor == null) {
                executor = null;
            }
            return (Build.VERSION.SDK_INT < 29 || executor == null) ? context.bindService(intent, serviceConnection, i) : context.bindService(intent, i, executor, serviceConnection);
        }
        ConcurrentHashMap concurrentHashMap = this.a;
        ServiceConnection serviceConnection2 = (ServiceConnection) concurrentHashMap.putIfAbsent(serviceConnection, serviceConnection);
        if (serviceConnection2 != null && serviceConnection != serviceConnection2) {
            Log.w("ConnectionTracker", String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", serviceConnection, str, intent.getAction()));
        }
        if (executor == null) {
            executor = null;
        }
        try {
            boolean zBindService = (Build.VERSION.SDK_INT < 29 || executor == null) ? context.bindService(intent, serviceConnection, i) : context.bindService(intent, i, executor, serviceConnection);
            if (zBindService) {
                return zBindService;
            }
            concurrentHashMap.remove(serviceConnection, serviceConnection);
            return false;
        } catch (Throwable th) {
            concurrentHashMap.remove(serviceConnection, serviceConnection);
            throw th;
        }
    }
}
