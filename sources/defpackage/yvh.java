package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import android.view.View;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class yvh implements Runnable {
    public static final Object g = new Object();
    public static Boolean h;
    public static Boolean i;
    public final /* synthetic */ int a = 1;
    public final long b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;

    public yvh(wvh wvhVar, Context context, q1j q1jVar, long j) {
        this.f = wvhVar;
        this.c = context;
        this.b = j;
        this.d = q1jVar;
        this.e = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    public static boolean a(Context context) {
        boolean zBooleanValue;
        synchronized (g) {
            try {
                Boolean bool = i;
                Boolean boolValueOf = Boolean.valueOf(bool == null ? b(context, "android.permission.ACCESS_NETWORK_STATE", bool) : bool.booleanValue());
                i = boolValueOf;
                zBooleanValue = boolValueOf.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return zBooleanValue;
    }

    public static boolean b(Context context, String str, Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z = context.checkCallingOrSelfPermission(str) == 0;
        if (!z && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: " + str + ". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return z;
    }

    public static boolean c(Context context) {
        boolean zBooleanValue;
        synchronized (g) {
            try {
                Boolean bool = h;
                Boolean boolValueOf = Boolean.valueOf(bool == null ? b(context, "android.permission.WAKE_LOCK", bool) : bool.booleanValue());
                h = boolValueOf;
                zBooleanValue = boolValueOf.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return zBooleanValue;
    }

    public synchronized boolean d() {
        NetworkInfo activeNetworkInfo;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) ((Context) this.c).getSystemService("connectivity");
            activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        } catch (Throwable th) {
            throw th;
        }
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zC;
        switch (this.a) {
            case 0:
                wvh wvhVar = (wvh) this.f;
                PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) this.e;
                Context context = (Context) this.c;
                if (c(context)) {
                    wakeLock.acquire(180000L);
                }
                try {
                    wvhVar.d(true);
                    if (!((q1j) this.d).i()) {
                        wvhVar.d(false);
                        if (!zC) {
                            return;
                        }
                    } else if (!a(context) || d()) {
                        if (wvhVar.e()) {
                            wvhVar.d(false);
                        } else {
                            wvhVar.f(this.b);
                        }
                        if (!zC) {
                            return;
                        }
                    } else {
                        new xvh(this, this).a();
                        if (!zC) {
                            return;
                        }
                    }
                } catch (IOException e) {
                    Log.e("FirebaseMessaging", "Failed to sync topics. Won't retry sync. " + e.getMessage());
                    wvhVar.d(false);
                    if (!zC) {
                        return;
                    }
                } finally {
                    if (c(context)) {
                        try {
                            wakeLock.release();
                        } catch (RuntimeException unused) {
                            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                        }
                        break;
                    }
                }
                try {
                    return;
                } catch (RuntimeException unused2) {
                    return;
                }
            default:
                b7e b7eVar = (b7e) this.c;
                View view = (View) this.d;
                Rect rectD = view == null ? null : n9j.d(view, (View) b7eVar.c.b);
                if (rectD == null) {
                    return;
                }
                String str = ((b7e) this.c).d;
                a4c a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9 je9Var = je9.d;
                    if (a4cVar.b(je9Var)) {
                        s5e s5eVar = (s5e) this.f;
                        a4cVar.c(je9Var, str, "Play reaction effect without pending, reaction:" + ((Object) s5eVar) + ", l:" + this.b, null);
                    }
                }
                b7e b7eVar2 = (b7e) this.c;
                y6e y6eVar = (y6e) this.e;
                b7e.c(b7eVar2, y6eVar.b, y6eVar.a, rectD);
                return;
        }
    }

    public yvh(View view, b7e b7eVar, View view2, y6e y6eVar, s5e s5eVar, long j) {
        this.c = b7eVar;
        this.d = view2;
        this.e = y6eVar;
        this.f = s5eVar;
        this.b = j;
    }
}
