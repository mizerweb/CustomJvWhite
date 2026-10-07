package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class hdm extends fmk implements IInterface {
    public hdm(IBinder iBinder) {
        super(iBinder, "com.google.mlkit.vision.barcode.aidls.IBarcodeScanner");
    }

    public final List l0(m38 m38Var, qdm qdmVar) throws RemoteException {
        Parcel parcelG = G();
        ltk.b(parcelG, m38Var);
        ltk.a(parcelG, qdmVar);
        Parcel parcelV = V(3, parcelG);
        ArrayList arrayListCreateTypedArrayList = parcelV.createTypedArrayList(xcm.CREATOR);
        parcelV.recycle();
        return arrayListCreateTypedArrayList;
    }

    public final void m0() throws RemoteException {
        k0(1, G());
    }

    public final void n0() throws RemoteException {
        k0(2, G());
    }
}
