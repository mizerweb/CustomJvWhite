package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class oil implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ azl b;

    public /* synthetic */ oil(azl azlVar, int i) {
        this.a = i;
        this.b = azlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                azl azlVar = this.b;
                synchronized (azlVar) {
                    if (azlVar.a == 1) {
                        azlVar.a("Timed out while binding");
                    }
                    break;
                }
                return;
            default:
                this.b.a("Service disconnected");
                return;
        }
        while (true) {
            azl azlVar2 = this.b;
            synchronized (azlVar2) {
                try {
                    if (azlVar2.a != 2) {
                        return;
                    }
                    if (azlVar2.d.isEmpty()) {
                        azlVar2.c();
                        return;
                    }
                    g3m g3mVar = (g3m) azlVar2.d.poll();
                    azlVar2.e.put(g3mVar.a, g3mVar);
                    ((ScheduledExecutorService) azlVar2.f.d).schedule(new txj(azlVar2, 5, g3mVar), 30L, TimeUnit.SECONDS);
                    if (Log.isLoggable("MessengerIpcClient", 3)) {
                        Log.d("MessengerIpcClient", "Sending ".concat(String.valueOf(g3mVar)));
                    }
                    a9m a9mVar = azlVar2.f;
                    Messenger messenger = azlVar2.b;
                    int i = g3mVar.c;
                    Context context = (Context) a9mVar.c;
                    Message messageObtain = Message.obtain();
                    messageObtain.what = i;
                    messageObtain.arg1 = g3mVar.a;
                    messageObtain.replyTo = messenger;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("oneWay", g3mVar.a());
                    bundle.putString("pkg", context.getPackageName());
                    bundle.putBundle("data", g3mVar.d);
                    messageObtain.setData(bundle);
                    try {
                        ewe eweVar = azlVar2.c;
                        Messenger messenger2 = (Messenger) eweVar.b;
                        if (messenger2 != null) {
                            messenger2.send(messageObtain);
                        } else {
                            sxk sxkVar = (sxk) eweVar.c;
                            if (sxkVar == null) {
                                throw new IllegalStateException("Both messengers are null");
                            }
                            Messenger messenger3 = sxkVar.a;
                            messenger3.getClass();
                            messenger3.send(messageObtain);
                        }
                    } catch (RemoteException e) {
                        azlVar2.a(e.getMessage());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
