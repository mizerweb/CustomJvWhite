package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import ru.ok.android.externcalls.sdk.factory.internal.CidLogger;

/* JADX INFO: loaded from: classes3.dex */
public final class lcb {
    public final Context a;
    public final y3e b;
    public volatile vuf c;
    public final gd8 d;

    public lcb(Context context, CidLogger cidLogger) {
        context.getClass();
        cidLogger.getClass();
        this.a = context;
        this.b = cidLogger;
        gd8 gd8Var = null;
        try {
            Object systemService = context.getSystemService("connectivity");
            ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
            if (connectivityManager != null) {
                gd8 gd8Var2 = new gd8(1, this);
                connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().build(), gd8Var2);
                gd8Var = gd8Var2;
            }
        } catch (Throwable th) {
            this.b.logException("OVC_ST_Helper_1", "Can't set up callback", th);
        }
        this.d = gd8Var;
    }
}
