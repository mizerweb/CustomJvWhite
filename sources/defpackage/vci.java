package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.util.Log;
import com.google.firebase.iid.FirebaseInstanceIdReceiver;
import java.io.File;
import java.io.IOException;
import java.lang.ref.SoftReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class vci implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ vci(FirebaseInstanceIdReceiver firebaseInstanceIdReceiver, Intent intent, Context context, boolean z, BroadcastReceiver.PendingResult pendingResult) {
        this.c = intent;
        this.d = context;
        this.b = z;
        this.e = pendingResult;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Executor executorUnconfigurableExecutorService;
        int iA;
        switch (this.a) {
            case 0:
                pr6 pr6Var = (pr6) this.d;
                boolean z = this.b;
                File file = ((wci) this.e).a;
                o7j.j("fb-UnpackingSoSource", "starting syncer worker");
                if (z) {
                    try {
                        try {
                            kfh.c(file);
                        } catch (IOException e) {
                            qr7.o(e);
                            return;
                        }
                    } finally {
                        o7j.j("fb-UnpackingSoSource", "releasing dso store lock for " + file + " (from syncer thread)");
                        pr6Var.close();
                    }
                }
                wci.i((File) this.c, (byte) 1, z);
                return;
            default:
                Intent intent = (Intent) this.c;
                Context context = (Context) this.d;
                boolean z2 = this.b;
                BroadcastReceiver.PendingResult pendingResult = (BroadcastReceiver.PendingResult) this.e;
                try {
                    Parcelable parcelableExtra = intent.getParcelableExtra("wrapped_intent");
                    Intent intent2 = parcelableExtra instanceof Intent ? (Intent) parcelableExtra : null;
                    if (intent2 == null) {
                        int iIntValue = 500;
                        if (intent.getExtras() != null) {
                            eu3 eu3Var = new eu3(intent);
                            CountDownLatch countDownLatch = new CountDownLatch(1);
                            synchronized (FirebaseInstanceIdReceiver.class) {
                                try {
                                    SoftReference softReference = FirebaseInstanceIdReceiver.b;
                                    executorUnconfigurableExecutorService = softReference != null ? (Executor) softReference.get() : null;
                                    if (executorUnconfigurableExecutorService == null) {
                                        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new aid("pscm-ack-executor", 2));
                                        threadPoolExecutor.allowCoreThreadTimeOut(true);
                                        executorUnconfigurableExecutorService = Executors.unconfigurableExecutorService(threadPoolExecutor);
                                        FirebaseInstanceIdReceiver.b = new SoftReference(executorUnconfigurableExecutorService);
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                                break;
                            }
                            executorUnconfigurableExecutorService.execute(new b1j(context, eu3Var, countDownLatch, 5));
                            try {
                                iIntValue = ((Integer) gwl.a(new kzi(context, 1).z(intent))).intValue();
                            } catch (InterruptedException | ExecutionException e2) {
                                Log.e("FirebaseMessaging", "Failed to send message to service.", e2);
                            }
                            try {
                                if (!countDownLatch.await(1000L, TimeUnit.MILLISECONDS)) {
                                    Log.w("CloudMessagingReceiver", "Message ack timed out");
                                }
                            } catch (InterruptedException e3) {
                                Log.w("CloudMessagingReceiver", "Message ack failed: ".concat(e3.toString()));
                            }
                        }
                        iA = iIntValue;
                        break;
                    } else {
                        iA = FirebaseInstanceIdReceiver.a(intent2);
                    }
                    if (z2 && pendingResult != null) {
                        pendingResult.setResultCode(iA);
                    }
                    if (pendingResult != null) {
                        pendingResult.finish();
                        return;
                    }
                    return;
                } catch (Throwable th2) {
                    if (pendingResult != null) {
                        pendingResult.finish();
                    }
                    throw th2;
                }
        }
    }

    public vci(wci wciVar, boolean z, File file, pr6 pr6Var) {
        this.e = wciVar;
        this.b = z;
        this.c = file;
        this.d = pr6Var;
    }
}
