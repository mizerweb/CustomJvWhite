package defpackage;

import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public final class a3a extends Handler {
    public boolean a;
    public boolean b;
    public final /* synthetic */ d3a c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3a(d3a d3aVar, Looper looper) {
        super(looper);
        this.c = d3aVar;
        this.a = true;
        this.b = true;
    }

    public final void a(boolean z, boolean z2) {
        boolean z3 = false;
        this.a = this.a && z;
        if (this.b && z2) {
            z3 = true;
        }
        this.b = z3;
        if (hasMessages(1)) {
            return;
        }
        sendEmptyMessage(1);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        i2a i2aVar;
        int iB;
        d3a d3aVar = this.c;
        t4a t4aVar = d3aVar.g;
        if (message.what != 1) {
            qr7.g(message.what, "Invalid message what=");
            return;
        }
        c4d c4dVarL = d3aVar.s.l(d3aVar.t.W(), d3aVar.t.N(), d3aVar.s.k);
        d3aVar.s = c4dVarL;
        boolean z = this.a;
        boolean z2 = this.b;
        c4d c4dVarK0 = t4aVar.k0(c4dVarL);
        gvb gvbVar = t4aVar.d;
        c98 c98VarX = gvbVar.x();
        for (int i = 0; i < c98VarX.size(); i++) {
            i2a i2aVar2 = (i2a) c98VarX.get(i);
            try {
                xhf xhfVarI = gvbVar.I(i2aVar2);
                if (xhfVarI != null) {
                    iB = xhfVarI.b();
                } else if (!d3aVar.h(i2aVar2)) {
                    break;
                } else {
                    iB = 0;
                }
                c4d c4dVarH = gvbVar.H(i2aVar2);
                if (c4dVarH == null) {
                    gvbVar.G(i2aVar2);
                    h3d h3dVarB = gm0.B(gvbVar.w(i2aVar2), d3aVar.t.R());
                    i2aVar = i2aVar2;
                    try {
                        h2a h2aVar = i2aVar.d;
                        h2aVar.getClass();
                        try {
                            h2aVar.i(iB, c4dVarH == null ? c4dVarK0 : c4dVarH, h3dVarB, z, z2);
                        } catch (DeadObjectException unused) {
                            t4aVar.d.S(i2aVar);
                        } catch (RemoteException e) {
                            e = e;
                            lvb.H0("MediaSessionImpl", "Exception in " + i2aVar, e);
                        }
                    } catch (DeadObjectException unused2) {
                        i2aVar = i2aVar;
                    } catch (RemoteException e2) {
                        e = e2;
                        i2aVar = i2aVar;
                    }
                }
            } catch (DeadObjectException unused3) {
                i2aVar = i2aVar2;
            } catch (RemoteException e3) {
                e = e3;
                i2aVar = i2aVar2;
            }
        }
        this.a = true;
        this.b = true;
    }
}
