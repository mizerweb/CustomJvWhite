package defpackage;

import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.session.MediaSessionService;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class x3a extends Binder implements g38 {
    public static final /* synthetic */ int f = 0;
    public final WeakReference c;
    public final Handler d;
    public final Set e;

    public x3a(MediaSessionService mediaSessionService) {
        attachInterface(this, "androidx.media3.session.IMediaSessionService");
        this.c = new WeakReference(mediaSessionService);
        this.d = new Handler(mediaSessionService.getApplicationContext().getMainLooper());
        this.e = Collections.synchronizedSet(new HashSet());
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // defpackage.g38
    public final void c0(final y28 y28Var, Bundle bundle) {
        if (y28Var == null || bundle == null) {
            cqk.l(y28Var);
            return;
        }
        try {
            final ke4 ke4VarA = ke4.a(bundle);
            String str = ke4VarA.c;
            MediaSessionService mediaSessionService = (MediaSessionService) this.c.get();
            if (mediaSessionService == null) {
                cqk.l(y28Var);
                return;
            }
            int callingPid = Binder.getCallingPid();
            int callingUid = Binder.getCallingUid();
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            if (callingPid == 0) {
                callingPid = ke4VarA.d;
            }
            if (cqk.h(callingUid, mediaSessionService, str) != 0) {
                lvb.G0("MSessionService", c0a.l(callingUid, "Ignoring connection from invalid package name ", str, " (uid=", ")"));
                cqk.l(y28Var);
                return;
            }
            final p3a p3aVar = new p3a(str, callingPid, callingUid);
            final boolean zN = t3a.m(mediaSessionService.getApplicationContext()).n(p3aVar);
            this.e.add(y28Var);
            try {
                this.d.post(new Runnable() { // from class: w3a
                    @Override // java.lang.Runnable
                    public final void run() {
                        p3a p3aVar2 = p3aVar;
                        ke4 ke4Var = ke4VarA;
                        boolean z = zN;
                        x3a x3aVar = this.a;
                        Set set = x3aVar.e;
                        y28 y28Var2 = y28Var;
                        set.remove(y28Var2);
                        try {
                            try {
                                MediaSessionService mediaSessionService2 = (MediaSessionService) x3aVar.c.get();
                                if (mediaSessionService2 == null) {
                                    cqk.l(y28Var2);
                                    return;
                                }
                                int i = ke4Var.a;
                                int i2 = ke4Var.b;
                                i2a i2aVar = new i2a(p3aVar2, i, i2, z, new o4a(y28Var2, i2), ke4Var.e);
                                k2a k2aVarE = mediaSessionService2.e(i2aVar);
                                if (k2aVarE == null) {
                                    cqk.l(y28Var2);
                                    return;
                                } else {
                                    mediaSessionService2.a(k2aVarE);
                                    k2aVarE.a.g.G(y28Var2, i2aVar);
                                    return;
                                }
                            } catch (Exception e) {
                                lvb.H0("MSessionService", "Failed to add a session to session service", e);
                                cqk.l(y28Var2);
                                return;
                            }
                        } catch (Throwable th) {
                            cqk.l(y28Var2);
                            throw th;
                        }
                        cqk.l(y28Var2);
                        throw th;
                    }
                });
            } finally {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
            }
        } catch (RuntimeException e) {
            lvb.H0("MSessionService", "Ignoring malformed Bundle for ConnectionRequest", e);
            cqk.l(y28Var);
        }
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface("androidx.media3.session.IMediaSessionService");
        }
        if (i == 1598968902) {
            parcel2.writeString("androidx.media3.session.IMediaSessionService");
            return true;
        }
        if (i != 3001) {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        y28 y28VarG = sv9.G(parcel.readStrongBinder());
        Parcelable.Creator creator = Bundle.CREATOR;
        c0(y28VarG, (Bundle) l2m.a(parcel));
        return true;
    }
}
