package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public final class h5b implements ServiceConnection {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h5b(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        k38 k38Var;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                i5b i5bVar = (i5b) obj;
                int i2 = j5b.d;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(k38.b);
                if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof k38)) {
                    j38 j38Var = new j38();
                    j38Var.c = iBinder;
                    k38Var = j38Var;
                } else {
                    k38Var = (k38) iInterfaceQueryLocalInterface;
                }
                i5bVar.h = k38Var;
                try {
                    i5bVar.b = k38Var.h((f5b) i5bVar.k, (String) i5bVar.c);
                } catch (RemoteException e) {
                    Log.w("ROOM", "Cannot register multi-instance invalidation callback", e);
                    return;
                }
                break;
            case 1:
                t6m t6mVar = (t6m) obj;
                t6mVar.b.a("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
                t6mVar.a().post(new f5l(this, iBinder));
                break;
            default:
                sbm sbmVar = (sbm) obj;
                sbmVar.b.c("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
                sbmVar.a().post(new s6m(this, iBinder));
                break;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((i5b) obj).h = null;
                break;
            case 1:
                t6m t6mVar = (t6m) obj;
                t6mVar.b.a("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
                t6mVar.a().post(new jul(1, this));
                break;
            default:
                sbm sbmVar = (sbm) obj;
                sbmVar.b.c("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
                sbmVar.a().post(new j3m(1, this));
                break;
        }
    }
}
