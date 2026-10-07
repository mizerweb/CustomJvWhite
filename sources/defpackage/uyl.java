package defpackage;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class uyl implements Handler.Callback {
    public final /* synthetic */ c1m a;

    public /* synthetic */ uyl(c1m c1mVar) {
        this.a = c1mVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            c1m c1mVar = this.a;
            synchronized (c1mVar.a) {
                try {
                    nul nulVar = (nul) message.obj;
                    qwl qwlVar = (qwl) c1mVar.a.get(nulVar);
                    if (qwlVar != null && qwlVar.g()) {
                        if (qwlVar.d()) {
                            qwlVar.a();
                        }
                        c1mVar.a.remove(nulVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return true;
        }
        if (i != 1) {
            return false;
        }
        c1m c1mVar2 = this.a;
        synchronized (c1mVar2.a) {
            try {
                nul nulVar2 = (nul) message.obj;
                qwl qwlVar2 = (qwl) c1mVar2.a.get(nulVar2);
                if (qwlVar2 != null && qwlVar2.e() == 3) {
                    String strValueOf = String.valueOf(nulVar2);
                    StringBuilder sb = new StringBuilder(strValueOf.length() + 47);
                    sb.append("Timeout waiting for ServiceConnection callback ");
                    sb.append(strValueOf);
                    Log.e("GmsClientSupervisor", sb.toString(), new Exception());
                    ComponentName componentNameI = qwlVar2.i();
                    if (componentNameI == null) {
                        nulVar2.getClass();
                        componentNameI = null;
                    }
                    if (componentNameI == null) {
                        String strA = nulVar2.a();
                        yab.s(strA);
                        componentNameI = new ComponentName(strA, "unknown");
                    }
                    qwlVar2.onServiceDisconnected(componentNameI);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return true;
    }
}
