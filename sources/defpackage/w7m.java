package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes3.dex */
public final class w7m implements IInterface {
    public final IBinder c;

    public w7m(IBinder iBinder) {
        this.c = iBinder;
    }

    public final void G(int i, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.c.transact(i, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.c;
    }
}
