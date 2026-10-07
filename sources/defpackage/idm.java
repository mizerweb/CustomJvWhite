package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public final class idm extends fmk implements kdm {
    public idm(IBinder iBinder) {
        super(iBinder, "com.google.mlkit.vision.barcode.aidls.IBarcodeScannerCreator");
    }

    @Override // defpackage.kdm
    public final hdm U(m38 m38Var, zcm zcmVar) throws RemoteException {
        hdm hdmVar;
        Parcel parcelG = G();
        ltk.b(parcelG, m38Var);
        ltk.a(parcelG, zcmVar);
        Parcel parcelV = V(1, parcelG);
        IBinder strongBinder = parcelV.readStrongBinder();
        if (strongBinder == null) {
            hdmVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.mlkit.vision.barcode.aidls.IBarcodeScanner");
            hdmVar = iInterfaceQueryLocalInterface instanceof hdm ? (hdm) iInterfaceQueryLocalInterface : new hdm(strongBinder);
        }
        parcelV.recycle();
        return hdmVar;
    }
}
