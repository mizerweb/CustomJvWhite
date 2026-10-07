package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes4.dex */
public final class wvh {
    public final Context a;
    public final q1j b;
    public final yfj c;
    public final FirebaseMessaging d;
    public final ScheduledThreadPoolExecutor f;
    public final uvh h;
    public final mw e = new mw(0);
    public boolean g = false;

    public wvh(FirebaseMessaging firebaseMessaging, q1j q1jVar, uvh uvhVar, yfj yfjVar, Context context, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.d = firebaseMessaging;
        this.b = q1jVar;
        this.h = uvhVar;
        this.c = yfjVar;
        this.a = context;
        this.f = scheduledThreadPoolExecutor;
    }

    public static void a(kam kamVar) throws IOException {
        try {
            gwl.b(kamVar, 30L);
        } catch (InterruptedException | TimeoutException e) {
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            }
            if (!(cause instanceof RuntimeException)) {
                throw new IOException(e2);
            }
            throw ((RuntimeException) cause);
        }
    }

    public final void b(String str) throws IOException {
        String strA = this.d.a();
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        yfj yfjVar = this.c;
        a(yfjVar.k(yfjVar.q(strA, "/topics/" + str, bundle)));
    }

    public final void c(String str) throws IOException {
        String strA = this.d.a();
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        bundle.putString("delete", "1");
        yfj yfjVar = this.c;
        a(yfjVar.k(yfjVar.q(strA, "/topics/" + str, bundle)));
    }

    public final synchronized void d(boolean z) {
        this.g = z;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x008b A[Catch: IOException -> 0x0062, TryCatch #2 {IOException -> 0x0062, blocks: (B:15:0x002b, B:32:0x008b, B:34:0x0093, B:20:0x003c, B:22:0x0044, B:24:0x004f, B:27:0x0065, B:29:0x006d, B:31:0x0078), top: B:88:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0093 A[Catch: IOException -> 0x0062, TRY_LEAVE, TryCatch #2 {IOException -> 0x0062, blocks: (B:15:0x002b, B:32:0x008b, B:34:0x0093, B:20:0x003c, B:22:0x0044, B:24:0x004f, B:27:0x0065, B:29:0x006d, B:31:0x0078), top: B:88:0x002b }] */
    /* JADX WARN: Instruction removed from duplicated block: B:34:0x0093, please report this as an issue */
    public final boolean e() throws IOException {
        tvh tvhVarA;
        while (true) {
            synchronized (this) {
                try {
                    tvhVarA = this.h.a();
                    if (tvhVarA == null) {
                        break;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            try {
                String str = tvhVarA.b;
                String str2 = tvhVarA.a;
                int iHashCode = str.hashCode();
                if (iHashCode != 83) {
                    if (iHashCode == 85 && str.equals("U")) {
                        c(str2);
                        if (Log.isLoggable("FirebaseMessaging", 3)) {
                            Log.d("FirebaseMessaging", "Unsubscribe from topic: " + str2 + " succeeded.");
                        }
                    } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Unknown topic operation" + tvhVarA + ".");
                    }
                } else if (str.equals("S")) {
                    b(str2);
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Subscribe to topic: " + str2 + " succeeded.");
                    }
                } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Unknown topic operation" + tvhVarA + ".");
                }
                uvh uvhVar = this.h;
                synchronized (uvhVar) {
                    try {
                        g85 g85Var = uvhVar.a;
                        String str3 = tvhVarA.c;
                        synchronized (((ArrayDeque) g85Var.d)) {
                            try {
                                if (((ArrayDeque) g85Var.d).remove(str3)) {
                                    ((ScheduledThreadPoolExecutor) g85Var.e).execute(new h7b(29, g85Var));
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                synchronized (this.e) {
                    try {
                        String str4 = tvhVarA.c;
                        if (this.e.containsKey(str4)) {
                            ArrayDeque arrayDeque = (ArrayDeque) this.e.get(str4);
                            qjh qjhVar = (qjh) arrayDeque.poll();
                            if (qjhVar != null) {
                                qjhVar.b(null);
                            }
                            if (arrayDeque.isEmpty()) {
                                this.e.remove(str4);
                            }
                        }
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
            } catch (IOException e) {
                if (!"SERVICE_NOT_AVAILABLE".equals(e.getMessage()) && !"INTERNAL_SERVER_ERROR".equals(e.getMessage()) && !"TOO_MANY_SUBSCRIBERS".equals(e.getMessage())) {
                    if (e.getMessage() != null) {
                        throw e;
                    }
                    Log.e("FirebaseMessaging", "Topic operation failed without exception message. Will retry Topic operation.");
                    return false;
                }
                Log.e("FirebaseMessaging", "Topic operation failed: " + e.getMessage() + ". Will retry Topic operation.");
                return false;
            }
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "topic sync succeeded");
        }
        return true;
    }

    public final void f(long j) {
        this.f.schedule(new yvh(this, this.a, this.b, Math.min(Math.max(30L, 2 * j), 28800L)), j, TimeUnit.SECONDS);
        d(true);
    }
}
