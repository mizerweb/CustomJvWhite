package defpackage;

import android.os.Bundle;
import android.os.Messenger;
import android.service.media.MediaBrowserService;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class ns9 extends MediaBrowserService {
    public final /* synthetic */ g85 a;
    public final /* synthetic */ g85 b;

    public ns9(g85 g85Var, y3a y3aVar) {
        this.b = g85Var;
        this.a = g85Var;
        attachBaseContext(y3aVar);
    }

    @Override // android.service.media.MediaBrowserService
    public final MediaBrowserService.BrowserRoot onGetRoot(String str, int i, Bundle bundle) {
        Bundle bundle2;
        p3c p3cVar;
        p3c p3cVar2;
        Bundle bundleN = vqi.n(bundle);
        Bundle bundle3 = bundleN == null ? null : new Bundle(bundleN);
        g85 g85Var = this.a;
        y3a y3aVar = (y3a) g85Var.d;
        int i2 = -1;
        if (bundle3 == null || bundle3.getInt("extra_client_version", 0) == 0) {
            bundle2 = null;
        } else {
            bundle3.remove("extra_client_version");
            g85Var.c = new Messenger(y3aVar.g);
            Bundle bundle4 = new Bundle();
            bundle4.putInt("extra_service_version", 2);
            bundle4.putBinder("extra_messenger", ((Messenger) g85Var.c).getBinder());
            u2a u2aVar = y3aVar.h;
            if (u2aVar != null) {
                d38 d38VarA = u2aVar.a();
                bundle4.putBinder("extra_session_binder", d38VarA == null ? null : d38VarA.asBinder());
            } else {
                ((ArrayList) g85Var.a).add(bundle4);
            }
            i2 = bundle3.getInt("extra_calling_pid", -1);
            bundle3.remove("extra_calling_pid");
            bundle2 = bundle4;
        }
        ms9 ms9Var = new ms9((y3a) g85Var.d, str, i2, i, null);
        y3aVar.f = ms9Var;
        g85 g85Var2 = y3aVar.a;
        g85Var2.getClass();
        p3a p3aVarF = g85Var2.F();
        if (bundle3 == null) {
            bundle3 = Bundle.EMPTY;
        }
        boolean zN = y3aVar.i.n(p3aVarF);
        u98 u98Var = mz8.a;
        Math.max(0, bundle3.getInt("androidx.media.utils.MediaBrowserCompat.extras.CUSTOM_BROWSER_ACTION_LIMIT", 0));
        i2a i2aVar = new i2a(p3aVarF, 0, 0, zN, null, bundle3);
        AtomicReference atomicReference = new AtomicReference();
        r94 r94Var = new r94();
        vqi.d0(y3aVar.j.l, new sc2(y3aVar, atomicReference, i2aVar, r94Var, 5));
        try {
            r94Var.a();
            g2a g2aVar = (g2a) atomicReference.get();
            g2aVar.getClass();
            y3aVar.k.a(p3aVarF, i2aVar, g2aVar.a, g2aVar.b);
            p3cVar = gm0.d;
        } catch (InterruptedException e) {
            lvb.l0("MSSLegacyStub", "Couldn't get a result from onConnect", e);
            p3cVar = null;
        }
        y3aVar.f = null;
        if (p3cVar == null) {
            p3cVar2 = null;
        } else {
            if (((Messenger) g85Var.c) != null) {
                y3aVar.d.add(ms9Var);
            }
            Bundle bundle5 = (Bundle) p3cVar.b;
            if (bundle2 == null) {
                bundle2 = bundle5;
            } else if (bundle5 != null) {
                bundle2.putAll(bundle5);
            }
            p3cVar2 = new p3c(12, bundle2);
        }
        if (p3cVar2 == null) {
            return null;
        }
        return new MediaBrowserService.BrowserRoot("androidx.media3.session.MediaLibraryService", (Bundle) p3cVar2.b);
    }

    @Override // android.service.media.MediaBrowserService
    public final void onLoadChildren(String str, MediaBrowserService.Result result, Bundle bundle) {
        vqi.n(bundle);
        g85 g85Var = this.b;
        y3a y3aVar = (y3a) g85Var.e;
        ms9 ms9Var = y3aVar.c;
        uik uikVar = new uik(17, result);
        y3aVar.f = ms9Var;
        uikVar.x(null);
        y3aVar.f = null;
        ((y3a) g85Var.e).f = null;
    }

    @Override // android.service.media.MediaBrowserService
    public final void onLoadItem(String str, MediaBrowserService.Result result) {
        uik uikVar = new uik(17, result);
        y3a y3aVar = (y3a) this.a.d;
        y3aVar.f = y3aVar.c;
        uikVar.x(null);
        y3aVar.f = null;
    }

    @Override // android.service.media.MediaBrowserService
    public final void onLoadChildren(String str, MediaBrowserService.Result result) {
        uik uikVar = new uik(17, result);
        g85 g85Var = this.a;
        g85Var.getClass();
        y3a y3aVar = (y3a) g85Var.d;
        y3aVar.f = y3aVar.c;
        uikVar.x(null);
        y3aVar.f = null;
    }
}
