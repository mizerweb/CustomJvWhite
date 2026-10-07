package defpackage;

import android.content.Context;
import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.Messenger;
import android.os.Process;
import android.os.RemoteException;
import android.support.v4.media.session.IMediaSession;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public final class hs9 extends MediaBrowser.ConnectionCallback {
    public final /* synthetic */ kr6 a;

    public hs9(kr6 kr6Var) {
        this.a = kr6Var;
    }

    @Override // android.media.browse.MediaBrowser.ConnectionCallback
    public final void onConnected() {
        d38 b38Var;
        kr6 kr6Var = this.a;
        is9 is9Var = (is9) kr6Var.b;
        if (is9Var != null) {
            gs9 gs9Var = is9Var.d;
            MediaBrowser mediaBrowser = is9Var.b;
            try {
                Bundle bundleN = vqi.n(mediaBrowser.getExtras());
                if (bundleN != null) {
                    bundleN.getInt("extra_service_version", 0);
                    IBinder binder = bundleN.getBinder("extra_messenger");
                    if (binder != null) {
                        Bundle bundle = is9Var.c;
                        ih ihVar = new ih();
                        ihVar.a = new Messenger(binder);
                        ihVar.b = bundle;
                        is9Var.f = ihVar;
                        Messenger messenger = new Messenger(gs9Var);
                        is9Var.g = messenger;
                        gs9Var.getClass();
                        gs9Var.b = new WeakReference(messenger);
                        try {
                            Context context = is9Var.a;
                            Bundle bundle2 = new Bundle();
                            bundle2.putString("data_package_name", context.getPackageName());
                            bundle2.putInt("data_calling_pid", Process.myPid());
                            bundle2.putBundle("data_root_hints", (Bundle) ihVar.b);
                            Message messageObtain = Message.obtain();
                            messageObtain.what = 6;
                            messageObtain.arg1 = 1;
                            messageObtain.setData(bundle2);
                            messageObtain.replyTo = messenger;
                            ((Messenger) ihVar.a).send(messageObtain);
                        } catch (RemoteException unused) {
                            lvb.r0("MediaBrowserCompat", "Remote error registering client messenger.");
                        }
                    }
                    IBinder binder2 = bundleN.getBinder("extra_session_binder");
                    int i = p2a.d;
                    if (binder2 == null) {
                        b38Var = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface = binder2.queryLocalInterface(IMediaSession.DESCRIPTOR);
                        b38Var = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof d38)) ? new b38(binder2) : (d38) iInterfaceQueryLocalInterface;
                    }
                    if (b38Var != null) {
                        is9Var.h = new u2a(mediaBrowser.getSessionToken(), b38Var);
                    }
                }
            } catch (IllegalStateException e) {
                lvb.l0("MediaBrowserCompat", "Unexpected IllegalStateException", e);
            }
        }
        pv9 pv9Var = (pv9) kr6Var.c;
        ks9 ks9Var = pv9Var.j;
        if (ks9Var != null) {
            is9 is9Var2 = (is9) ks9Var.b;
            if (is9Var2.h == null) {
                is9Var2.h = new u2a(is9Var2.b.getSessionToken(), null);
            }
            u2a u2aVar = is9Var2.h;
            iu9 iu9Var = pv9Var.b;
            iu9Var.S(new su6(pv9Var, 16, u2aVar));
            iu9Var.f.postDelayed(new lv9(pv9Var, 0), 500L);
        }
    }

    @Override // android.media.browse.MediaBrowser.ConnectionCallback
    public final void onConnectionFailed() {
        ((pv9) this.a.c).b.Q();
    }

    @Override // android.media.browse.MediaBrowser.ConnectionCallback
    public final void onConnectionSuspended() {
        kr6 kr6Var = this.a;
        is9 is9Var = (is9) kr6Var.b;
        if (is9Var != null) {
            is9Var.f = null;
            is9Var.g = null;
            is9Var.h = null;
            gs9 gs9Var = is9Var.d;
            gs9Var.getClass();
            gs9Var.b = new WeakReference(null);
        }
        ((pv9) kr6Var.c).b.Q();
    }
}
