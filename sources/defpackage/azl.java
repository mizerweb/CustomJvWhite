package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.cloudmessaging.zzt;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class azl implements ServiceConnection {
    public int a = 0;
    public final Messenger b;
    public ewe c;
    public final ArrayDeque d;
    public final SparseArray e;
    public final /* synthetic */ a9m f;

    public azl(a9m a9mVar) {
        this.f = a9mVar;
        z0b z0bVar = new z0b(Looper.getMainLooper(), new acg(1, this));
        Looper.getMainLooper();
        this.b = new Messenger(z0bVar);
        this.d = new ArrayDeque();
        this.e = new SparseArray();
    }

    public final synchronized void a(String str) {
        b(str, null);
    }

    public final synchronized void b(String str, SecurityException securityException) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Disconnected: ".concat(String.valueOf(str)));
            }
            int i = this.a;
            if (i == 0) {
                throw new IllegalStateException();
            }
            if (i != 1 && i != 2) {
                if (i != 3) {
                    return;
                }
                this.a = 4;
                return;
            }
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Unbinding service");
            }
            this.a = 4;
            ue4.a().b((Context) this.f.c, this);
            zzt zztVar = new zzt(str, securityException);
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                ((g3m) it.next()).b(zztVar);
            }
            this.d.clear();
            int i2 = 0;
            while (true) {
                int size = this.e.size();
                SparseArray sparseArray = this.e;
                if (i2 >= size) {
                    sparseArray.clear();
                    return;
                } else {
                    ((g3m) sparseArray.valueAt(i2)).b(zztVar);
                    i2++;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void c() {
        try {
            if (this.a == 2 && this.d.isEmpty() && this.e.size() == 0) {
                if (Log.isLoggable("MessengerIpcClient", 2)) {
                    Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
                }
                this.a = 3;
                ue4.a().b((Context) this.f.c, this);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean d(g3m g3mVar) throws Throwable {
        Throwable th;
        azl azlVar;
        try {
            try {
                int i = this.a;
                try {
                    if (i != 0) {
                        if (i == 1) {
                            this.d.add(g3mVar);
                            return true;
                        }
                        if (i != 2) {
                            return false;
                        }
                        this.d.add(g3mVar);
                        ((ScheduledExecutorService) this.f.d).execute(new oil(this, 0));
                        return true;
                    }
                    this.d.add(g3mVar);
                    yab.v(this.a == 0);
                    if (Log.isLoggable("MessengerIpcClient", 2)) {
                        Log.v("MessengerIpcClient", "Starting bind to GmsCore");
                    }
                    this.a = 1;
                    Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
                    intent.setPackage("com.google.android.gms");
                    try {
                        ue4 ue4VarA = ue4.a();
                        try {
                            Context context = (Context) this.f.c;
                            try {
                                azlVar = this;
                                try {
                                    try {
                                        if (ue4VarA.c(context, context.getClass().getName(), intent, azlVar, 1, null)) {
                                            try {
                                                ((ScheduledExecutorService) azlVar.f.d).schedule(new oil(azlVar, 1), 30L, TimeUnit.SECONDS);
                                            } catch (Throwable th2) {
                                                th = th2;
                                                th = th;
                                                throw th;
                                            }
                                        } else {
                                            azlVar.a("Unable to bind to service");
                                        }
                                    } catch (SecurityException e) {
                                        e = e;
                                        azlVar.b("Unable to bind to service", e);
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                azlVar = this;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            azlVar = this;
                        }
                    } catch (SecurityException e2) {
                        e = e2;
                        azlVar = this;
                    }
                    return true;
                } catch (Throwable th6) {
                    th = th6;
                    azlVar = this;
                }
            } catch (Throwable th7) {
                th = th7;
                azlVar = this;
                th = th;
            }
        } catch (Throwable th8) {
            th = th8;
        }
        throw th;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        ((ScheduledExecutorService) this.f.d).execute(new ruh(this, 6, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        ((ScheduledExecutorService) this.f.d).execute(new oil(this, 2));
    }
}
