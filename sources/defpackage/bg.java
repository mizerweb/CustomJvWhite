package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Build;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class bg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ dg b;

    public /* synthetic */ bg(dg dgVar, int i) {
        this.a = i;
        this.b = dgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        dg dgVar = this.b;
        switch (i) {
            case 0:
                dgVar.a.unregisterReceiver(dgVar.d);
                break;
            case 1:
                cg cgVar = dgVar.d;
                IntentFilter intentFilter = new IntentFilter("androidx.car.app.connection.action.CAR_CONNECTION_UPDATED");
                int i2 = Build.VERSION.SDK_INT;
                Context context = dgVar.a;
                if (i2 >= 33) {
                    context.registerReceiver(cgVar, intentFilter, 2);
                } else {
                    context.registerReceiver(cgVar, intentFilter);
                }
                dgVar.c();
                break;
            default:
                Uri uri = dg.g;
                dgVar.c();
                break;
        }
    }
}
