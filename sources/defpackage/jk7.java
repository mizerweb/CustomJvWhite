package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes3.dex */
public final class jk7 implements ServiceConnection {
    public final String a;
    public final long b;
    public final gwe c;
    public final hwe d;
    public final iwe e;
    public final gwe f;

    public jk7(String str, long j, gwe gweVar, hwe hweVar, iwe iweVar, gwe gweVar2) {
        this.a = str;
        this.b = j;
        this.c = gweVar;
        this.d = hweVar;
        this.e = iweVar;
        this.f = gweVar2;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        nu nuVar;
        je9 je9Var = je9.d;
        String name = jk7.class.getName();
        a4c a4cVar = gm0.f;
        if (a4cVar != null && a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, name, "onServiceConnected: " + componentName, null);
        }
        try {
            int i = mu.c;
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("ru.vk.store.provider.appupdate.AppUpdateProvider");
            if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof nu)) {
                lu luVar = new lu();
                luVar.c = iBinder;
                nuVar = luVar;
            } else {
                nuVar = (nu) iInterfaceQueryLocalInterface;
            }
            ik7 ik7Var = new ik7(this);
            Bundle bundle = new Bundle();
            long j = this.b;
            if (j > 2147483647L) {
                j = 2147483647L;
            }
            bundle.putInt("VERSION_CODE", (int) j);
            bundle.putLong("VERSION_CODE_LONG", this.b);
            String name2 = jk7.class.getName();
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                a4cVar2.c(je9Var, name2, "onServiceConnected: calling getAppUpdateInfo(" + this.a + ")", null);
            }
            ((lu) nuVar).G(this.a, bundle, ik7Var);
        } catch (Exception e) {
            gm0.V(jk7.class.getName(), "onServiceConnected: getAppUpdateInfo call failed", e);
            this.f.invoke(e);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        String name = jk7.class.getName();
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.f;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, name, "onServiceDisconnected: " + componentName, null);
            }
        }
        this.e.invoke();
    }
}
