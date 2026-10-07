package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.RemoteException;
import com.google.android.play.core.appupdate.internal.zzy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class sbm {
    public static final HashMap n = new HashMap();
    public final Context a;
    public final ste b;
    public boolean g;
    public final Intent h;
    public h5b l;
    public e5l m;
    public final ArrayList d = new ArrayList();
    public final HashSet e = new HashSet();
    public final Object f = new Object();
    public final aml j = new aml(1, this);
    public final AtomicInteger k = new AtomicInteger(0);
    public final String c = "AppUpdateService";
    public final WeakReference i = new WeakReference(null);

    public sbm(Context context, ste steVar, Intent intent) {
        this.a = context;
        this.b = steVar;
        this.h = intent;
    }

    public static void b(sbm sbmVar, asl aslVar) {
        e5l e5lVar = sbmVar.m;
        ste steVar = sbmVar.b;
        ArrayList<iul> arrayList = sbmVar.d;
        if (e5lVar != null || sbmVar.g) {
            if (!sbmVar.g) {
                aslVar.run();
                return;
            } else {
                steVar.c("Waiting to bind to the service.", new Object[0]);
                arrayList.add(aslVar);
                return;
            }
        }
        steVar.c("Initiate binding to the service.", new Object[0]);
        arrayList.add(aslVar);
        h5b h5bVar = new h5b(2, sbmVar);
        sbmVar.l = h5bVar;
        sbmVar.g = true;
        if (sbmVar.a.bindService(sbmVar.h, h5bVar, 1)) {
            return;
        }
        steVar.c("Failed to bind to the service.", new Object[0]);
        sbmVar.g = false;
        for (iul iulVar : arrayList) {
            zzy zzyVar = new zzy("Failed to bind to the service.");
            qjh qjhVar = iulVar.a;
            if (qjhVar != null) {
                qjhVar.c(zzyVar);
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

    public final void c(asl aslVar, qjh qjhVar) {
        a().post(new asl(this, aslVar.a, qjhVar, aslVar));
    }

    public final void d(qjh qjhVar) {
        synchronized (this.f) {
            this.e.remove(qjhVar);
        }
        a().post(new j3m(0, this));
    }

    public final void e() {
        HashSet hashSet = this.e;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((qjh) it.next()).c(new RemoteException(String.valueOf(this.c).concat(" : Binder has died.")));
        }
        hashSet.clear();
    }
}
