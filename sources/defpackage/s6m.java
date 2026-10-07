package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class s6m extends iul {
    public final /* synthetic */ IBinder b;
    public final /* synthetic */ h5b c;

    public s6m(h5b h5bVar, IBinder iBinder) {
        this.c = h5bVar;
        this.b = iBinder;
    }

    @Override // defpackage.iul
    public final void a() {
        e5l kxkVar;
        sbm sbmVar = (sbm) this.c.b;
        int i = j1l.d;
        IBinder iBinder = this.b;
        if (iBinder == null) {
            kxkVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.appupdate.protocol.IAppUpdateService");
            kxkVar = iInterfaceQueryLocalInterface instanceof e5l ? (e5l) iInterfaceQueryLocalInterface : new kxk(iBinder);
        }
        sbmVar.m = kxkVar;
        ste steVar = sbmVar.b;
        steVar.c("linkToDeath", new Object[0]);
        try {
            sbmVar.m.asBinder().linkToDeath(sbmVar.j, 0);
        } catch (RemoteException e) {
            Object[] objArr = new Object[0];
            steVar.getClass();
            if (Log.isLoggable("PlayCore", 6)) {
                Log.e("PlayCore", ste.d(steVar.b, "linkToDeath failed", objArr), e);
            }
        }
        sbmVar.g = false;
        Iterator it = sbmVar.d.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        sbmVar.d.clear();
    }
}
