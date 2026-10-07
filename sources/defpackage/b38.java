package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.support.v4.media.session.IMediaSession;

/* JADX INFO: loaded from: classes2.dex */
public final class b38 implements d38 {
    public final IBinder c;

    public b38(IBinder iBinder) {
        this.c = iBinder;
    }

    @Override // defpackage.d38
    public final void Y(a38 a38Var) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
            parcelObtain.writeStrongBinder((ju9) a38Var);
            if (!this.c.transact(4, parcelObtain, parcelObtain2, 0)) {
                int i = p2a.d;
            }
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.c;
    }

    @Override // defpackage.d38
    public final void d0(a38 a38Var) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
            parcelObtain.writeStrongBinder((ju9) a38Var);
            if (!this.c.transact(3, parcelObtain, parcelObtain2, 0)) {
                int i = p2a.d;
            }
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.d38
    public final x2d getPlaybackState() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
            if (!this.c.transact(28, parcelObtain, parcelObtain2, 0)) {
                int i = p2a.d;
            }
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0 ? x2d.CREATOR.createFromParcel(parcelObtain2) : null;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.d38
    public final int getRepeatMode() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
            if (!this.c.transact(37, parcelObtain, parcelObtain2, 0)) {
                int i = p2a.d;
            }
            parcelObtain2.readException();
            return parcelObtain2.readInt();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.d38
    public final int getShuffleMode() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
            if (!this.c.transact(47, parcelObtain, parcelObtain2, 0)) {
                int i = p2a.d;
            }
            parcelObtain2.readException();
            return parcelObtain2.readInt();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.d38
    public final boolean isCaptioningEnabled() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
            if (!this.c.transact(45, parcelObtain, parcelObtain2, 0)) {
                int i = p2a.d;
            }
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }
}
