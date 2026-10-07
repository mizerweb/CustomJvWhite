package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.CameraPosition;
import java.util.HashMap;
import one.me.location.map.pick.PickLocationScreen;

/* JADX INFO: loaded from: classes2.dex */
public final class po7 {
    public final y8l a;
    public rai b;

    public po7(y8l y8lVar) {
        new HashMap();
        new HashMap();
        yab.s(y8lVar);
        this.a = y8lVar;
    }

    public final urh a(vrh vrhVar) {
        opk hpkVar;
        try {
            y8l y8lVar = this.a;
            Parcel parcelL0 = y8lVar.l0();
            duk.c(parcelL0, vrhVar);
            Parcel parcelK0 = y8lVar.k0(13, parcelL0);
            IBinder strongBinder = parcelK0.readStrongBinder();
            int i = lpk.d;
            if (strongBinder == null) {
                hpkVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
                hpkVar = iInterfaceQueryLocalInterface instanceof opk ? (opk) iInterfaceQueryLocalInterface : new hpk(strongBinder, "com.google.android.gms.maps.model.internal.ITileOverlayDelegate", 2);
            }
            parcelK0.recycle();
            if (hpkVar != null) {
                return new urh(hpkVar);
            }
            return null;
        } catch (RemoteException e) {
            f4a.d(e);
            return null;
        }
    }

    public final void b(ex8 ex8Var) {
        try {
            y8l y8lVar = this.a;
            m38 m38Var = (m38) ex8Var.b;
            Parcel parcelL0 = y8lVar.l0();
            duk.d(parcelL0, m38Var);
            y8lVar.m0(5, parcelL0);
        } catch (RemoteException e) {
            f4a.d(e);
        }
    }

    public final CameraPosition c() {
        try {
            y8l y8lVar = this.a;
            Parcel parcelK0 = y8lVar.k0(1, y8lVar.l0());
            CameraPosition cameraPosition = (CameraPosition) duk.a(parcelK0, CameraPosition.CREATOR);
            parcelK0.recycle();
            return cameraPosition;
        } catch (RemoteException e) {
            f4a.d(e);
            return null;
        }
    }

    public final rai d() {
        guk gukVar;
        try {
            if (this.b == null) {
                y8l y8lVar = this.a;
                Parcel parcelK0 = y8lVar.k0(25, y8lVar.l0());
                IBinder strongBinder = parcelK0.readStrongBinder();
                if (strongBinder == null) {
                    gukVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                    gukVar = iInterfaceQueryLocalInterface instanceof guk ? (guk) iInterfaceQueryLocalInterface : new guk(strongBinder, "com.google.android.gms.maps.internal.IUiSettingsDelegate", 2);
                }
                parcelK0.recycle();
                this.b = new rai(gukVar);
            }
            return this.b;
        } catch (RemoteException e) {
            f4a.d(e);
            return null;
        }
    }

    public final void e(jm9 jm9Var) {
        try {
            y8l y8lVar = this.a;
            Parcel parcelL0 = y8lVar.l0();
            duk.c(parcelL0, jm9Var);
            Parcel parcelK0 = y8lVar.k0(91, parcelL0);
            parcelK0.readInt();
            parcelK0.recycle();
        } catch (RemoteException e) {
            f4a.d(e);
        }
    }

    public final void f(int i) {
        try {
            y8l y8lVar = this.a;
            Parcel parcelL0 = y8lVar.l0();
            parcelL0.writeInt(i);
            y8lVar.m0(16, parcelL0);
        } catch (RemoteException e) {
            f4a.d(e);
        }
    }

    public final void g(oo7 oo7Var) {
        y8l y8lVar = this.a;
        try {
            if (oo7Var == null) {
                Parcel parcelL0 = y8lVar.l0();
                duk.d(parcelL0, null);
                y8lVar.m0(99, parcelL0);
            } else {
                rnk rnkVar = new rnk(oo7Var);
                Parcel parcelL1 = y8lVar.l0();
                duk.d(parcelL1, rnkVar);
                y8lVar.m0(99, parcelL1);
            }
        } catch (RemoteException e) {
            f4a.d(e);
        }
    }

    public final void h(PickLocationScreen pickLocationScreen) {
        y8l y8lVar = this.a;
        try {
            if (pickLocationScreen == null) {
                Parcel parcelL0 = y8lVar.l0();
                duk.d(parcelL0, null);
                y8lVar.m0(96, parcelL0);
            } else {
                rnk rnkVar = new rnk(pickLocationScreen);
                Parcel parcelL1 = y8lVar.l0();
                duk.d(parcelL1, rnkVar);
                y8lVar.m0(96, parcelL1);
            }
        } catch (RemoteException e) {
            f4a.d(e);
        }
    }

    public final void i(d4c d4cVar) {
        y8l y8lVar = this.a;
        try {
            rnk rnkVar = new rnk(d4cVar);
            Parcel parcelL0 = y8lVar.l0();
            duk.d(parcelL0, rnkVar);
            y8lVar.m0(42, parcelL0);
        } catch (RemoteException e) {
            f4a.d(e);
        }
    }
}
