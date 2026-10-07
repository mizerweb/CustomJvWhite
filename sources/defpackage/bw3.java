package defpackage;

import android.graphics.drawable.Drawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class bw3 implements Runnable {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final long e;

    public bw3(FirebaseMessaging firebaseMessaging, long j) {
        this.a = 2;
        this.d = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new aid("firebase-iid-executor", 2));
        this.c = firebaseMessaging;
        this.e = j;
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) firebaseMessaging.b.getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.b = wakeLockNewWakeLock;
        wakeLockNewWakeLock.setReferenceCounted(false);
    }

    public boolean a() {
        ConnectivityManager connectivityManager = (ConnectivityManager) ((FirebaseMessaging) this.c).b.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public boolean b() throws IOException {
        try {
            if (((FirebaseMessaging) this.c).a() == null) {
                Log.e("FirebaseMessaging", "Token retrieval failed: null");
                return false;
            }
            if (!Log.isLoggable("FirebaseMessaging", 3)) {
                return true;
            }
            Log.d("FirebaseMessaging", "Token successfully retrieved");
            return true;
        } catch (IOException e) {
            String message = e.getMessage();
            if (!"SERVICE_NOT_AVAILABLE".equals(message) && !"INTERNAL_SERVER_ERROR".equals(message) && !"InternalServerError".equals(message)) {
                if (e.getMessage() != null) {
                    throw e;
                }
                Log.w("FirebaseMessaging", "Token retrieval failed without exception message. Will retry token retrieval");
                return false;
            }
            Log.w("FirebaseMessaging", "Token retrieval failed: " + e.getMessage() + ". Will retry token retrieval");
            return false;
        } catch (SecurityException unused) {
            Log.w("FirebaseMessaging", "Token retrieval failed with SecurityException. Will retry token retrieval");
            return false;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                super/*android.view.View*/.scheduleDrawable((Drawable) this.c, (Runnable) this.d, this.e);
                return;
            case 1:
                super/*android.view.View*/.scheduleDrawable((Drawable) this.c, (Runnable) this.d, this.e);
                return;
            default:
                PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) this.b;
                ljf ljfVarD = ljf.D();
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.c;
                if (ljfVarD.L(firebaseMessaging.b)) {
                    wakeLock.acquire();
                }
                try {
                    try {
                        synchronized (firebaseMessaging) {
                            firebaseMessaging.i = true;
                        }
                        if (!firebaseMessaging.h.i()) {
                            synchronized (firebaseMessaging) {
                                firebaseMessaging.i = false;
                            }
                            if (!ljf.D().L(firebaseMessaging.b)) {
                                return;
                            }
                        } else if (!ljf.D().K(firebaseMessaging.b) || a()) {
                            if (b()) {
                                synchronized (firebaseMessaging) {
                                    firebaseMessaging.i = false;
                                }
                            } else {
                                firebaseMessaging.k(this.e);
                            }
                            if (!ljf.D().L(firebaseMessaging.b)) {
                                return;
                            }
                        } else {
                            cg cgVar = new cg();
                            cgVar.b = this;
                            cgVar.a();
                            if (!ljf.D().L(firebaseMessaging.b)) {
                                return;
                            }
                        }
                    } catch (IOException e) {
                        Log.e("FirebaseMessaging", "Topic sync or token retrieval failed on hard failure exceptions: " + e.getMessage() + ". Won't retry the operation.");
                        synchronized (firebaseMessaging) {
                            firebaseMessaging.i = false;
                            if (!ljf.D().L(firebaseMessaging.b)) {
                                return;
                            }
                        }
                    }
                    wakeLock.release();
                    return;
                } catch (Throwable th) {
                    if (ljf.D().L(firebaseMessaging.b)) {
                        wakeLock.release();
                    }
                    throw th;
                }
        }
    }

    public /* synthetic */ bw3(dw3 dw3Var, Drawable drawable, Runnable runnable, long j, int i) {
        this.a = i;
        this.b = dw3Var;
        this.c = drawable;
        this.d = runnable;
        this.e = j;
    }
}
