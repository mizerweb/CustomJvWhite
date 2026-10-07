package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.ResultReceiver;
import android.support.v4.media.session.IMediaSession;
import android.support.v4.media.session.MediaSessionCompat;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public final class lu9 extends ResultReceiver {
    public final /* synthetic */ int a = 1;
    public final Object b;

    public lu9(mu9 mu9Var) {
        super(null);
        this.b = new WeakReference(mu9Var);
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        d38 b38Var = null;
        switch (this.a) {
            case 0:
                mu9 mu9Var = (mu9) ((WeakReference) this.b).get();
                if (mu9Var == null || bundle == null) {
                    return;
                }
                synchronized (mu9Var.b) {
                    u2a u2aVar = mu9Var.e;
                    IBinder binder = bundle.getBinder(MediaSessionCompat.KEY_EXTRA_BINDER);
                    int i2 = p2a.d;
                    if (binder != null) {
                        IInterface iInterfaceQueryLocalInterface = binder.queryLocalInterface(IMediaSession.DESCRIPTOR);
                        b38Var = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof d38)) ? new b38(binder) : (d38) iInterfaceQueryLocalInterface;
                    }
                    synchronized (u2aVar.a) {
                        u2aVar.c = b38Var;
                        break;
                    }
                    u2a u2aVar2 = mu9Var.e;
                    ysi ysiVarC = mmc.c(bundle);
                    synchronized (u2aVar2.a) {
                        u2aVar2.d = ysiVarC;
                        break;
                    }
                    mu9Var.a();
                }
                return;
            default:
                ((qjh) this.b).d(null);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lu9(Handler handler, qjh qjhVar) {
        super(handler);
        this.b = qjhVar;
    }
}
