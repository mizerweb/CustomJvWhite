package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes4.dex */
public final class wxk implements n5l, IInterface {
    public final IBinder c;

    public wxk(IBinder iBinder) {
        this.c = iBinder;
    }

    public final Parcel G(int i, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.c.transact(i, parcel, parcelObtain, 0);
                parcelObtain.readException();
                parcel.recycle();
                return parcelObtain;
            } catch (RuntimeException e) {
                parcelObtain.recycle();
                throw e;
            }
        } catch (Throwable th) {
            parcel.recycle();
            throw th;
        }
    }

    public final String V() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        Parcel parcelG = G(1, parcelObtain);
        String string = parcelG.readString();
        parcelG.recycle();
        return string;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.c;
    }

    public final boolean k0() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        Parcel parcelG = G(6, parcelObtain);
        int i = ztk.a;
        boolean z = parcelG.readInt() != 0;
        parcelG.recycle();
        return z;
    }

    public final boolean l0() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        int i = ztk.a;
        parcelObtain.writeInt(1);
        Parcel parcelG = G(2, parcelObtain);
        boolean z = parcelG.readInt() != 0;
        parcelG.recycle();
        return z;
    }
}
