package defpackage;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class j0a implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ j0a(d3a d3aVar, boolean z, i2a i2aVar, Runnable runnable) {
        this.a = 1;
        this.c = d3aVar;
        this.b = z;
        this.d = i2aVar;
        this.e = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int i2 = this.a;
        boolean z = this.b;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i2) {
            case 0:
                ((m0a) obj3).e((k2a) obj2, (ex8) obj, z);
                break;
            case 1:
                d3a d3aVar = (d3a) obj3;
                i2a i2aVar = (i2a) obj2;
                Runnable runnable = (Runnable) obj;
                t4a t4aVar = d3aVar.g;
                if (z) {
                    emf emfVar = new emf("androidx.media3.session.NOTIFICATION_DISMISSED_EVENT_KEY", Bundle.EMPTY);
                    try {
                        xhf xhfVarI = t4aVar.d.I(i2aVar);
                        if (xhfVarI != null) {
                            i = xhfVarI.a(d3a.E).h;
                        } else if (d3aVar.h(i2aVar)) {
                            rx8.J(new wmf(0));
                            i = 0;
                        } else {
                            rx8.J(new wmf(-100));
                        }
                        h2a h2aVar = i2aVar.d;
                        if (h2aVar != null) {
                            h2aVar.d(i, emfVar);
                        }
                    } catch (DeadObjectException unused) {
                        t4aVar.d.S(i2aVar);
                        rx8.J(new wmf(-100));
                    } catch (RemoteException e) {
                        lvb.H0("MediaSessionImpl", "Exception in " + i2aVar, e);
                        rx8.J(new wmf(-1));
                    }
                }
                runnable.run();
                t4aVar.d.u(i2aVar);
                break;
            default:
                dee deeVar = (dee) obj3;
                ich ichVar = (ich) obj2;
                msh mshVar = (msh) obj;
                ich ichVar2 = deeVar.A;
                if (ichVar2 != null && !ichVar2.h.b.isDone()) {
                    deeVar.A.d();
                }
                deeVar.l0 = z;
                deeVar.A = ichVar;
                deeVar.B = mshVar;
                deeVar.j(ichVar, mshVar, true);
                break;
        }
    }

    public /* synthetic */ j0a(int i, Object obj, Object obj2, Object obj3, boolean z) {
        this.a = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = z;
    }
}
