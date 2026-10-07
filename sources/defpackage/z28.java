package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.support.v4.media.session.IMediaControllerCallback;

/* JADX INFO: loaded from: classes4.dex */
public final class z28 implements a38 {
    public IBinder c;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.c;
    }

    @Override // defpackage.a38
    public final void e(x2d x2dVar) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(IMediaControllerCallback.DESCRIPTOR);
            parcelObtain.writeInt(1);
            x2dVar.writeToParcel(parcelObtain, 0);
            if (!this.c.transact(3, parcelObtain, null, 1)) {
                int i = ju9.d;
            }
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.a38
    public final void onRepeatModeChanged(int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(IMediaControllerCallback.DESCRIPTOR);
            parcelObtain.writeInt(i);
            if (!this.c.transact(9, parcelObtain, null, 1)) {
                int i2 = ju9.d;
            }
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.a38
    public final void onShuffleModeChanged(int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(IMediaControllerCallback.DESCRIPTOR);
            parcelObtain.writeInt(i);
            if (!this.c.transact(12, parcelObtain, null, 1)) {
                int i2 = ju9.d;
            }
        } finally {
            parcelObtain.recycle();
        }
    }
}
