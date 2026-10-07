package defpackage;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public final class jlk implements plk {
    public final /* synthetic */ d0c a;

    public jlk(d0c d0cVar) {
        this.a = d0cVar;
    }

    @Override // defpackage.plk
    public final int a() {
        return 4;
    }

    @Override // defpackage.plk
    public final void b() {
        r6a r6aVar = (r6a) this.a.a;
        r6aVar.getClass();
        try {
            bpl bplVar = (bpl) r6aVar.b;
            bplVar.m0(12, bplVar.l0());
        } catch (RemoteException e) {
            f4a.d(e);
        }
    }
}
