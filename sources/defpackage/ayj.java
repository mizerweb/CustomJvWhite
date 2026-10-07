package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class ayj implements ServiceConnection {
    public final Context a;
    public final Intent b;
    public final ScheduledThreadPoolExecutor c;
    public final ArrayDeque d;
    public yxj e;
    public boolean f;

    public ayj(Context context) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(0, new aid("Firebase-FirebaseInstanceIdServiceConnection", 2));
        this.d = new ArrayDeque();
        this.f = false;
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.b = new Intent("com.google.firebase.MESSAGING_EVENT").setPackage(applicationContext.getPackageName());
        this.c = scheduledThreadPoolExecutor;
    }

    public final synchronized void a() {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "flush queue called");
            }
            while (!this.d.isEmpty()) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "found intent to be delivered");
                }
                yxj yxjVar = this.e;
                if (yxjVar == null || !yxjVar.isBinderAlive()) {
                    c();
                    return;
                }
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "binder is alive, sending the intent.");
                }
                this.e.a((zxj) this.d.poll());
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized kam b(Intent intent) {
        zxj zxjVar;
        try {
            int i = 3;
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "new intent queued in the bind-strategy delivery");
            }
            zxjVar = new zxj(intent);
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.c;
            zxjVar.b.a.c(scheduledThreadPoolExecutor, new atj(i, scheduledThreadPoolExecutor.schedule(new f4g(29, zxjVar), 20L, TimeUnit.SECONDS)));
            this.d.add(zxjVar);
            a();
        } catch (Throwable th) {
            throw th;
        }
        return zxjVar.b.a;
    }

    public final void c() {
        ayj ayjVar;
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            StringBuilder sb = new StringBuilder("binder is dead. start connection? ");
            sb.append(!this.f);
            Log.d("FirebaseMessaging", sb.toString());
        }
        if (this.f) {
            return;
        }
        this.f = true;
        try {
            ue4 ue4VarA = ue4.a();
            Context context = this.a;
            ayjVar = this;
            try {
                if (ue4VarA.c(context, context.getClass().getName(), this.b, ayjVar, 65, null)) {
                    return;
                } else {
                    Log.e("FirebaseMessaging", "binding to the service failed");
                }
                while (true) {
                    ArrayDeque arrayDeque = ayjVar.d;
                    if (arrayDeque.isEmpty()) {
                        return;
                    } else {
                        ((zxj) arrayDeque.poll()).b.d(null);
                    }
                }
            } catch (SecurityException e) {
                e = e;
                Log.e("FirebaseMessaging", "Exception while binding the service", e);
            }
        } catch (SecurityException e2) {
            e = e2;
            ayjVar = this;
        }
        ayjVar.f = false;
    }

    @Override // android.content.ServiceConnection
    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "onServiceConnected: " + componentName);
            }
            this.f = false;
            if (iBinder instanceof yxj) {
                this.e = (yxj) iBinder;
                a();
                return;
            }
            Log.e("FirebaseMessaging", "Invalid service connection: " + iBinder);
            ArrayDeque arrayDeque = this.d;
            while (!arrayDeque.isEmpty()) {
                ((zxj) arrayDeque.poll()).b.d(null);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "onServiceDisconnected: " + componentName);
        }
        a();
    }
}
