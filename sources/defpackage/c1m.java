package defpackage;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class c1m {
    public static final Object g = new Object();
    public static c1m h;
    public static HandlerThread i;
    public static boolean j;
    public final HashMap a = new HashMap();
    public final Context b;
    public volatile bmk c;
    public final ue4 d;
    public final long e;
    public final long f;

    public c1m(Context context, Looper looper) {
        uyl uylVar = new uyl(this);
        this.b = context.getApplicationContext();
        bmk bmkVar = new bmk(looper, uylVar);
        Looper.getMainLooper();
        this.c = bmkVar;
        this.d = ue4.a();
        this.e = 5000L;
        this.f = 300000L;
    }

    public static HandlerThread a() {
        synchronized (g) {
            try {
                HandlerThread handlerThread = i;
                if (handlerThread != null && handlerThread.isAlive()) {
                    return i;
                }
                HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                i = handlerThread2;
                handlerThread2.start();
                return i;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final le4 b(nul nulVar, q1l q1lVar, String str) {
        le4 le4VarJ;
        HashMap map = this.a;
        synchronized (map) {
            try {
                qwl qwlVar = (qwl) map.get(nulVar);
                if (qwlVar == null) {
                    qwlVar = new qwl(this, nulVar);
                    qwlVar.b(q1lVar, q1lVar);
                    le4VarJ = qwlVar.j(str, null);
                    map.put(nulVar, qwlVar);
                } else {
                    this.c.removeMessages(0, nulVar);
                    if (qwlVar.f(q1lVar)) {
                        String string = nulVar.toString();
                        StringBuilder sb = new StringBuilder(string.length() + 81);
                        sb.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                        sb.append(string);
                        throw new IllegalStateException(sb.toString());
                    }
                    qwlVar.b(q1lVar, q1lVar);
                    int iE = qwlVar.e();
                    if (iE == 1) {
                        q1lVar.onServiceConnected(qwlVar.i(), qwlVar.h());
                    } else if (iE == 2) {
                        le4VarJ = qwlVar.j(str, null);
                    }
                    le4VarJ = null;
                }
                if (qwlVar.d()) {
                    return le4.f;
                }
                if (le4VarJ == null) {
                    le4VarJ = new le4(-1, null, null);
                }
                return le4VarJ;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(nul nulVar, ServiceConnection serviceConnection) {
        yab.t(serviceConnection, "ServiceConnection must not be null");
        HashMap map = this.a;
        synchronized (map) {
            try {
                qwl qwlVar = (qwl) map.get(nulVar);
                if (qwlVar == null) {
                    String string = nulVar.toString();
                    StringBuilder sb = new StringBuilder(string.length() + 50);
                    sb.append("Nonexistent connection status for service config: ");
                    sb.append(string);
                    throw new IllegalStateException(sb.toString());
                }
                if (!qwlVar.f(serviceConnection)) {
                    String string2 = nulVar.toString();
                    StringBuilder sb2 = new StringBuilder(string2.length() + 76);
                    sb2.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                    sb2.append(string2);
                    throw new IllegalStateException(sb2.toString());
                }
                qwlVar.c(serviceConnection);
                if (qwlVar.g()) {
                    this.c.sendMessageDelayed(this.c.obtainMessage(0, nulVar), this.e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
