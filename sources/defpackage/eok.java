package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public final class eok extends fmk implements IInterface {
    public eok(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetector");
    }

    public final void l0() throws RemoteException {
        k0(3, G());
    }

    public final x7m[] m0(m38 m38Var, ook ookVar) throws RemoteException {
        Parcel parcelG = G();
        ltk.b(parcelG, m38Var);
        ltk.a(parcelG, ookVar);
        Parcel parcelV = V(1, parcelG);
        x7m[] x7mVarArr = (x7m[]) parcelV.createTypedArray(x7m.CREATOR);
        parcelV.recycle();
        return x7mVarArr;
    }

    public final x7m[] n0(m38 m38Var, ook ookVar) throws RemoteException {
        Parcel parcelG = G();
        ltk.b(parcelG, m38Var);
        ltk.a(parcelG, ookVar);
        Parcel parcelV = V(2, parcelG);
        x7m[] x7mVarArr = (x7m[]) parcelV.createTypedArray(x7m.CREATOR);
        parcelV.recycle();
        return x7mVarArr;
    }
}
