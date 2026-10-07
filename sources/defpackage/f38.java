package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public final class f38 implements g38 {
    public final IBinder c;

    public f38(IBinder iBinder) {
        this.c = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.c;
    }

    @Override // defpackage.g38
    public final void c0(y28 y28Var, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSessionService");
            parcelObtain.writeStrongInterface(y28Var);
            parcelObtain.writeInt(1);
            bundle.writeToParcel(parcelObtain, 0);
            this.c.transact(3001, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }
}
