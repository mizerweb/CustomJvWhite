package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public final class i1l extends kkk {
    public final aqk n0() {
        aqk aqkVar;
        Parcel parcelK0 = k0(4, l0());
        IBinder strongBinder = parcelK0.readStrongBinder();
        if (strongBinder == null) {
            aqkVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            aqkVar = iInterfaceQueryLocalInterface instanceof aqk ? (aqk) iInterfaceQueryLocalInterface : new aqk(strongBinder, "com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate", 2);
        }
        parcelK0.recycle();
        return aqkVar;
    }

    public final bpl o0(dqb dqbVar) {
        bpl bplVar;
        Parcel parcelL0 = l0();
        duk.d(parcelL0, dqbVar);
        parcelL0.writeInt(0);
        Parcel parcelK0 = k0(3, parcelL0);
        IBinder strongBinder = parcelK0.readStrongBinder();
        if (strongBinder == null) {
            bplVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IMapViewDelegate");
            bplVar = iInterfaceQueryLocalInterface instanceof bpl ? (bpl) iInterfaceQueryLocalInterface : new bpl(strongBinder, "com.google.android.gms.maps.internal.IMapViewDelegate", 2);
        }
        parcelK0.recycle();
        return bplVar;
    }

    public final yll p0() {
        yll kflVar;
        Parcel parcelK0 = k0(5, l0());
        IBinder strongBinder = parcelK0.readStrongBinder();
        int i = ril.d;
        if (strongBinder == null) {
            kflVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
            kflVar = iInterfaceQueryLocalInterface instanceof yll ? (yll) iInterfaceQueryLocalInterface : new kfl(strongBinder, "com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate", 2);
        }
        parcelK0.recycle();
        return kflVar;
    }
}
