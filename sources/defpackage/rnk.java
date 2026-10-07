package defpackage;

import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLngBounds;
import one.me.location.map.pick.PickLocationScreen;

/* JADX INFO: loaded from: classes2.dex */
public final class rnk extends qkk {
    public final /* synthetic */ int d = 1;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rnk(oo ooVar) {
        super("com.google.android.gms.maps.internal.ISnapshotReadyCallback", 4);
        this.e = ooVar;
    }

    @Override // defpackage.qkk
    public final boolean l0(int i, Parcel parcel, Parcel parcel2) {
        usk uskVar;
        int i2 = this.d;
        y8l y8lVar = null;
        Object obj = this.e;
        switch (i2) {
            case 0:
                if (i != 1) {
                    return false;
                }
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    y8lVar = iInterfaceQueryLocalInterface instanceof y8l ? (y8l) iInterfaceQueryLocalInterface : new y8l(strongBinder, "com.google.android.gms.maps.internal.IGoogleMapDelegate", 2);
                }
                duk.b(parcel);
                ((vtb) obj).O(new po7(y8lVar));
                parcel2.writeNoException();
                return true;
            case 1:
                if (i == 1) {
                    d4c d4cVar = (d4c) obj;
                    po7 po7Var = d4cVar.g;
                    if (po7Var != null) {
                        y8l y8lVar2 = po7Var.a;
                        try {
                            Parcel parcelK0 = y8lVar2.k0(26, y8lVar2.l0());
                            IBinder strongBinder2 = parcelK0.readStrongBinder();
                            if (strongBinder2 == null) {
                                uskVar = null;
                            } else {
                                IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.maps.internal.IProjectionDelegate");
                                uskVar = iInterfaceQueryLocalInterface2 instanceof usk ? (usk) iInterfaceQueryLocalInterface2 : new usk(strongBinder2, "com.google.android.gms.maps.internal.IProjectionDelegate", 2);
                            }
                            parcelK0.recycle();
                            try {
                                Parcel parcelK1 = uskVar.k0(3, uskVar.l0());
                                qaj qajVar = (qaj) duk.a(parcelK1, qaj.CREATOR);
                                parcelK1.recycle();
                                LatLngBounds latLngBounds = qajVar.e;
                                wq7 wq7Var = d4cVar.e;
                                if (wq7Var != null) {
                                    try {
                                        b9m b9mVar = (b9m) wq7Var.a;
                                        b9mVar.m0(1, b9mVar.l0());
                                    } catch (RemoteException e) {
                                        f4a.d(e);
                                    }
                                }
                                try {
                                    rnk rnkVar = new rnk(new oo(d4cVar, po7Var, latLngBounds, 19));
                                    Parcel parcelL0 = y8lVar2.l0();
                                    duk.d(parcelL0, rnkVar);
                                    parcelL0.writeStrongBinder(null);
                                    y8lVar2.m0(38, parcelL0);
                                } catch (RemoteException e2) {
                                    f4a.d(e2);
                                }
                            } catch (RemoteException e3) {
                                f4a.d(e3);
                            }
                        } catch (RemoteException e4) {
                            f4a.d(e4);
                        }
                        break;
                    }
                    parcel2.writeNoException();
                    return true;
                }
                return false;
            case 2:
                oo ooVar = (oo) obj;
                if (i == 1) {
                    Bitmap bitmap = (Bitmap) duk.a(parcel, Bitmap.CREATOR);
                    duk.b(parcel);
                    ooVar.c(bitmap);
                } else {
                    if (i != 2) {
                        return false;
                    }
                    m38 m38VarN0 = dqb.n0(parcel.readStrongBinder());
                    duk.b(parcel);
                    ooVar.c((Bitmap) dqb.o0(m38VarN0));
                }
                parcel2.writeNoException();
                return true;
            case 3:
                if (i != 1) {
                    return false;
                }
                parcel.readInt();
                duk.b(parcel);
                wwc wwcVarQ1 = ((PickLocationScreen) obj).q1();
                yab.i0(wwcVarQ1.b, null, 0, new vwc(wwcVarQ1, null, 0), 3);
                parcel2.writeNoException();
                return true;
            default:
                if (i != 1) {
                    return false;
                }
                ((oo7) obj).f0();
                parcel2.writeNoException();
                return true;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rnk(oo7 oo7Var) {
        super("com.google.android.gms.maps.internal.IOnCameraIdleListener", 4);
        this.e = oo7Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rnk(vtb vtbVar) {
        super("com.google.android.gms.maps.internal.IOnMapReadyCallback", 4);
        this.e = vtbVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rnk(d4c d4cVar) {
        super("com.google.android.gms.maps.internal.IOnMapLoadedCallback", 4);
        this.e = d4cVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rnk(PickLocationScreen pickLocationScreen) {
        super("com.google.android.gms.maps.internal.IOnCameraMoveStartedListener", 4);
        this.e = pickLocationScreen;
    }
}
