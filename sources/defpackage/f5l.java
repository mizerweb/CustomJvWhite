package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class f5l extends lil {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public f5l(h5b h5bVar, IBinder iBinder) {
        this.c = iBinder;
        this.d = h5bVar;
    }

    @Override // defpackage.lil
    public final void a() {
        HashMap map;
        g5l lxkVar = null;
        switch (this.b) {
            case 0:
                try {
                    gfl gflVar = (gfl) this.d;
                    g5l g5lVar = gflVar.a.m;
                    String str = gflVar.b;
                    Bundle bundle = new Bundle();
                    HashMap map2 = kil.a;
                    synchronized (kil.class) {
                        map = kil.a;
                        map.put("java", 20002);
                    }
                    bundle.putInt("playcore_version_code", ((Integer) map.get("java")).intValue());
                    if (map.containsKey("native")) {
                        bundle.putInt("playcore_native_version", ((Integer) map.get("native")).intValue());
                    }
                    if (map.containsKey("unity")) {
                        bundle.putInt("playcore_unity_version", ((Integer) map.get("unity")).intValue());
                    }
                    gfl gflVar2 = (gfl) this.d;
                    qjh qjhVar = (qjh) this.c;
                    String str2 = gflVar2.b;
                    fcl fclVar = new fcl(gflVar2, qjhVar);
                    lxk lxkVar2 = (lxk) g5lVar;
                    lxkVar2.getClass();
                    Parcel parcelObtain = Parcel.obtain();
                    parcelObtain.writeInterfaceToken("com.google.android.play.core.inappreview.protocol.IInAppReviewService");
                    parcelObtain.writeString(str);
                    int i = ptk.a;
                    parcelObtain.writeInt(1);
                    bundle.writeToParcel(parcelObtain, 0);
                    parcelObtain.writeStrongBinder(fclVar);
                    try {
                        lxkVar2.c.transact(2, parcelObtain, null, 1);
                        return;
                    } finally {
                        parcelObtain.recycle();
                    }
                } catch (RemoteException e) {
                    gfl gflVar3 = (gfl) this.d;
                    qd2 qd2Var = gfl.c;
                    Object[] objArr = {gflVar3.b};
                    qd2Var.getClass();
                    if (Log.isLoggable("PlayCore", 6)) {
                        Log.e("PlayCore", qd2.c(qd2Var.a, "error requesting in-app review for %s", objArr), e);
                    }
                    ((qjh) this.c).c(new RuntimeException(e));
                    return;
                }
            default:
                t6m t6mVar = (t6m) ((h5b) this.d).b;
                IBinder iBinder = (IBinder) this.c;
                int i2 = k1l.d;
                if (iBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.inappreview.protocol.IInAppReviewService");
                    lxkVar = iInterfaceQueryLocalInterface instanceof g5l ? (g5l) iInterfaceQueryLocalInterface : new lxk(iBinder);
                }
                t6mVar.m = lxkVar;
                qd2 qd2Var2 = t6mVar.b;
                qd2Var2.a("linkToDeath", new Object[0]);
                try {
                    t6mVar.m.asBinder().linkToDeath(t6mVar.j, 0);
                    break;
                } catch (RemoteException e2) {
                    Object[] objArr2 = new Object[0];
                    qd2Var2.getClass();
                    if (Log.isLoggable("PlayCore", 6)) {
                        Log.e("PlayCore", qd2.c(qd2Var2.a, "linkToDeath failed", objArr2), e2);
                    }
                }
                t6mVar.g = false;
                Iterator it = t6mVar.d.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
                t6mVar.d.clear();
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f5l(gfl gflVar, qjh qjhVar, qjh qjhVar2) {
        super(qjhVar);
        this.c = qjhVar2;
        this.d = gflVar;
    }
}
