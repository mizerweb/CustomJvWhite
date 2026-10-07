package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.internal.a;

/* JADX INFO: loaded from: classes2.dex */
public final class q1l implements ServiceConnection {
    public final int a;
    public final /* synthetic */ a b;

    public q1l(a aVar, int i) {
        this.b = aVar;
        this.a = i;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        int i;
        int i2;
        a aVar = this.b;
        if (iBinder == null) {
            synchronized (aVar.f) {
                i = aVar.m;
            }
            if (i == 3) {
                aVar.t = true;
                i2 = 5;
            } else {
                i2 = 4;
            }
            mqk mqkVar = aVar.e;
            mqkVar.sendMessage(mqkVar.obtainMessage(i2, aVar.v.get(), 16));
            return;
        }
        synchronized (aVar.g) {
            try {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                aVar.h = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof umk)) ? new umk(iBinder) : (umk) iInterfaceQueryLocalInterface;
            } catch (Throwable th) {
                throw th;
            }
        }
        a aVar2 = this.b;
        int i3 = this.a;
        aVar2.getClass();
        w8l w8lVar = new w8l(aVar2, 0, null);
        mqk mqkVar2 = aVar2.e;
        mqkVar2.sendMessage(mqkVar2.obtainMessage(7, i3, -1, w8lVar));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        a aVar = this.b;
        synchronized (aVar.g) {
            aVar.h = null;
        }
        a aVar2 = this.b;
        int i = this.a;
        mqk mqkVar = aVar2.e;
        mqkVar.sendMessage(mqkVar.obtainMessage(6, i, 1));
    }
}
