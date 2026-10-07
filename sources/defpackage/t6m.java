package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.RemoteException;
import com.google.android.play.core.review.internal.zzu;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class t6m {
    public static final HashMap n = new HashMap();
    public final Context a;
    public final qd2 b;
    public boolean g;
    public final Intent h;
    public h5b l;
    public g5l m;
    public final ArrayList d = new ArrayList();
    public final HashSet e = new HashSet();
    public final Object f = new Object();
    public final aml j = new aml(0, this);
    public final AtomicInteger k = new AtomicInteger(0);
    public final String c = "com.google.android.finsky.inappreviewservice.InAppReviewService";
    public final WeakReference i = new WeakReference(null);

    public t6m(Context context, qd2 qd2Var, Intent intent) {
        this.a = context;
        this.b = qd2Var;
        this.h = intent;
    }

    public static void b(t6m t6mVar, f5l f5lVar) {
        g5l g5lVar = t6mVar.m;
        qd2 qd2Var = t6mVar.b;
        ArrayList<lil> arrayList = t6mVar.d;
        if (g5lVar != null || t6mVar.g) {
            if (!t6mVar.g) {
                f5lVar.run();
                return;
            } else {
                qd2Var.a("Waiting to bind to the service.", new Object[0]);
                arrayList.add(f5lVar);
                return;
            }
        }
        qd2Var.a("Initiate binding to the service.", new Object[0]);
        arrayList.add(f5lVar);
        h5b h5bVar = new h5b(1, t6mVar);
        t6mVar.l = h5bVar;
        t6mVar.g = true;
        if (t6mVar.a.bindService(t6mVar.h, h5bVar, 1)) {
            return;
        }
        qd2Var.a("Failed to bind to the service.", new Object[0]);
        t6mVar.g = false;
        for (lil lilVar : arrayList) {
            zzu zzuVar = new zzu("Failed to bind to the service.");
            qjh qjhVar = lilVar.a;
            if (qjhVar != null) {
                qjhVar.c(zzuVar);
            }
        }
        arrayList.clear();
    }

    public final Handler a() {
        Handler handler;
        HashMap map = n;
        synchronized (map) {
            try {
                if (!map.containsKey(this.c)) {
                    HandlerThread handlerThread = new HandlerThread(this.c, 10);
                    handlerThread.start();
                    map.put(this.c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) map.get(this.c);
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    public final void c() {
        HashSet hashSet = this.e;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((qjh) it.next()).c(new RemoteException(String.valueOf(this.c).concat(" : Binder has died.")));
        }
        hashSet.clear();
    }
}
