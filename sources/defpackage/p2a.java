package defpackage;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.SystemClock;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.IMediaSession;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class p2a extends Binder implements d38 {
    public static final /* synthetic */ int d = 0;
    public final WeakReference c;

    public p2a(q2a q2aVar) {
        attachInterface(this, IMediaSession.DESCRIPTOR);
        this.c = new WeakReference(q2aVar);
    }

    @Override // defpackage.d38
    public final void Y(a38 a38Var) {
        q2a q2aVar = (q2a) this.c.get();
        if (q2aVar == null || a38Var == null) {
            return;
        }
        q2aVar.f.unregister(a38Var);
        Binder.getCallingPid();
        Binder.getCallingUid();
        synchronized (q2aVar.d) {
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // defpackage.d38
    public final void d0(a38 a38Var) {
        q2a q2aVar = (q2a) this.c.get();
        if (q2aVar == null || a38Var == null) {
            return;
        }
        q2aVar.f.register(a38Var, new p3a("android.media.session.MediaController", Binder.getCallingPid(), Binder.getCallingUid()));
        synchronized (q2aVar.d) {
        }
    }

    @Override // defpackage.d38
    public final x2d getPlaybackState() {
        long j;
        q2a q2aVar = (q2a) this.c.get();
        if (q2aVar == null) {
            return null;
        }
        x2d x2dVar = q2aVar.g;
        d0a d0aVar = q2aVar.i;
        if (x2dVar != null) {
            float f = x2dVar.d;
            long j2 = x2dVar.h;
            int i = x2dVar.a;
            long j3 = x2dVar.b;
            long jD = -1;
            if (j3 != -1 && ((i == 3 || i == 4 || i == 5) && j2 > 0)) {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                long j4 = ((long) (f * (jElapsedRealtime - j2))) + j3;
                if (d0aVar != null && d0aVar.a(MediaMetadataCompat.METADATA_KEY_DURATION)) {
                    jD = d0aVar.d(MediaMetadataCompat.METADATA_KEY_DURATION);
                }
                if (jD < 0 || j4 <= jD) {
                    j = j4 < 0 ? 0L : j4;
                } else {
                    j = jD;
                }
                ArrayList arrayList = new ArrayList();
                long j5 = x2dVar.c;
                long j6 = x2dVar.e;
                int i2 = x2dVar.f;
                CharSequence charSequence = x2dVar.g;
                List list = x2dVar.i;
                if (list != null) {
                    arrayList.addAll(list);
                }
                return new x2d(x2dVar.a, j, j5, x2dVar.d, j6, i2, charSequence, jElapsedRealtime, arrayList, x2dVar.j, x2dVar.k);
            }
        }
        return x2dVar;
    }

    @Override // defpackage.d38
    public final int getRepeatMode() {
        q2a q2aVar = (q2a) this.c.get();
        if (q2aVar != null) {
            return q2aVar.j;
        }
        return -1;
    }

    @Override // defpackage.d38
    public final int getShuffleMode() {
        q2a q2aVar = (q2a) this.c.get();
        if (q2aVar != null) {
            return q2aVar.k;
        }
        return -1;
    }

    @Override // defpackage.d38
    public final boolean isCaptioningEnabled() {
        return false;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        Bundle bundle;
        if (i == 3) {
            parcel.enforceInterface(IMediaSession.DESCRIPTOR);
            d0(ju9.G(parcel.readStrongBinder()));
            parcel2.getClass();
            parcel2.writeNoException();
            return true;
        }
        if (i == 4) {
            parcel.enforceInterface(IMediaSession.DESCRIPTOR);
            Y(ju9.G(parcel.readStrongBinder()));
            parcel2.getClass();
            parcel2.writeNoException();
            return true;
        }
        if (i == 28) {
            parcel.enforceInterface(IMediaSession.DESCRIPTOR);
            x2d playbackState = getPlaybackState();
            parcel2.getClass();
            parcel2.writeNoException();
            if (playbackState != null) {
                parcel2.writeInt(1);
                playbackState.writeToParcel(parcel2, 1);
            } else {
                parcel2.writeInt(0);
            }
            return true;
        }
        if (i == 37) {
            parcel.enforceInterface(IMediaSession.DESCRIPTOR);
            int repeatMode = getRepeatMode();
            parcel2.getClass();
            parcel2.writeNoException();
            parcel2.writeInt(repeatMode);
            return true;
        }
        if (i == 45) {
            parcel.enforceInterface(IMediaSession.DESCRIPTOR);
            isCaptioningEnabled();
            parcel2.getClass();
            parcel2.writeNoException();
            parcel2.writeInt(0);
            return true;
        }
        if (i == 47) {
            parcel.enforceInterface(IMediaSession.DESCRIPTOR);
            int shuffleMode = getShuffleMode();
            parcel2.getClass();
            parcel2.writeNoException();
            parcel2.writeInt(shuffleMode);
            return true;
        }
        if (i != 50) {
            if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel2.getClass();
            parcel2.writeString(IMediaSession.DESCRIPTOR);
            return true;
        }
        parcel.enforceInterface(IMediaSession.DESCRIPTOR);
        q2a q2aVar = (q2a) this.c.get();
        Bundle bundle2 = (q2aVar == null || (bundle = q2aVar.e) == null) ? null : new Bundle(bundle);
        parcel2.getClass();
        parcel2.writeNoException();
        if (bundle2 != null) {
            parcel2.writeInt(1);
            bundle2.writeToParcel(parcel2, 1);
        } else {
            parcel2.writeInt(0);
        }
        return true;
    }
}
