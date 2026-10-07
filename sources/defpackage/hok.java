package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public final class hok extends fmk implements mok {
    public hok(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetectorCreator");
    }

    @Override // defpackage.mok
    public final eok S(m38 m38Var, unk unkVar) throws RemoteException {
        eok eokVar;
        Parcel parcelG = G();
        ltk.b(parcelG, m38Var);
        ltk.a(parcelG, unkVar);
        Parcel parcelV = V(1, parcelG);
        IBinder strongBinder = parcelV.readStrongBinder();
        if (strongBinder == null) {
            eokVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetector");
            eokVar = iInterfaceQueryLocalInterface instanceof eok ? (eok) iInterfaceQueryLocalInterface : new eok(strongBinder);
        }
        parcelV.recycle();
        return eokVar;
    }
}
