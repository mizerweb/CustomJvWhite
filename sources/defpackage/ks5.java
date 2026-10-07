package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class ks5 {
    public static final tme h = new tme(1);
    public final is5 a;
    public final CopyOnWriteArraySet b;
    public int c;
    public final boolean d;
    public int e;
    public boolean f;
    public List g;

    public ks5(Context context, m35 m35Var, j6g j6gVar, s25 s25Var, ExecutorService executorService) {
        y95 y95Var = new y95(m35Var);
        j71 j71Var = new j71();
        j71Var.a = j6gVar;
        j71Var.f = s25Var;
        xtj xtjVar = new xtj(j71Var, executorService);
        context.getApplicationContext();
        this.d = true;
        this.g = Collections.EMPTY_LIST;
        this.b = new CopyOnWriteArraySet();
        Handler handlerQ = vqi.q(new w84(3, this));
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:DownloadManager");
        handlerThread.start();
        is5 is5Var = new is5(handlerThread, y95Var, xtjVar, handlerQ);
        this.a = is5Var;
        ake akeVar = new ake(context, new s63(18, this));
        tme tmeVar = (tme) akeVar.d;
        Context context2 = (Context) akeVar.b;
        akeVar.a = tmeVar.a(context2);
        IntentFilter intentFilter = new IntentFilter();
        int i = tmeVar.a;
        if ((i & 1) != 0) {
            ConnectivityManager connectivityManager = (ConnectivityManager) context2.getSystemService("connectivity");
            connectivityManager.getClass();
            vme vmeVar = new vme(akeVar);
            akeVar.f = vmeVar;
            connectivityManager.registerDefaultNetworkCallback(vmeVar);
        }
        if ((i & 8) != 0) {
            intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
            intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
        }
        if ((i & 4) != 0) {
            intentFilter.addAction("android.os.action.DEVICE_IDLE_MODE_CHANGED");
        }
        if ((i & 16) != 0) {
            intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
            intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        }
        context2.registerReceiver(new cg(6, akeVar), intentFilter, null, (Handler) akeVar.e);
        int i2 = akeVar.a;
        this.e = i2;
        this.c = 1;
        is5Var.obtainMessage(1, i2, 0).sendToTarget();
    }

    public final void a() {
        Iterator it = this.b.iterator();
        if (it.hasNext()) {
            throw qt4.h(it);
        }
    }

    public final boolean b() {
        boolean z;
        if (!this.d && this.e != 0) {
            int i = 0;
            while (true) {
                if (i >= this.g.size()) {
                    z = false;
                    break;
                }
                if (((rp5) this.g.get(i)).b == 0) {
                    z = true;
                    break;
                }
                i++;
            }
        } else {
            z = false;
            break;
        }
        boolean z2 = this.f != z;
        this.f = z;
        return z2;
    }
}
