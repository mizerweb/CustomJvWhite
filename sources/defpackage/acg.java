package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.cloudmessaging.zzt;

/* JADX INFO: loaded from: classes2.dex */
public final class acg implements Handler.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ acg(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (this.a) {
            case 0:
                if (message.what == 0) {
                    vn7 vn7Var = (vn7) this.b;
                    if (message.obj == null) {
                        synchronized (vn7Var.b) {
                            try {
                                throw null;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    ore.m();
                }
                return false;
            default:
                int i = message.arg1;
                if (Log.isLoggable("MessengerIpcClient", 3)) {
                    Log.d("MessengerIpcClient", "Received response to request: " + i);
                }
                azl azlVar = (azl) this.b;
                synchronized (azlVar) {
                    try {
                        g3m g3mVar = (g3m) azlVar.e.get(i);
                        if (g3mVar == null) {
                            Log.w("MessengerIpcClient", "Received response for unknown request: " + i);
                            return true;
                        }
                        azlVar.e.remove(i);
                        azlVar.c();
                        Bundle data = message.getData();
                        if (data.getBoolean("unsupported", false)) {
                            g3mVar.b(new zzt("Not supported by GmsCore", null));
                            return true;
                        }
                        switch (g3mVar.e) {
                            case 0:
                                if (data.getBoolean("ack", false)) {
                                    g3mVar.c(null);
                                    return true;
                                }
                                g3mVar.b(new zzt("Invalid response to one way request", null));
                                return true;
                            default:
                                Bundle bundle = data.getBundle("data");
                                if (bundle == null) {
                                    bundle = Bundle.EMPTY;
                                }
                                g3mVar.c(bundle);
                                return true;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
        }
    }
}
