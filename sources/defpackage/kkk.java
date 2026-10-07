package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public abstract class kkk implements IInterface {
    public final /* synthetic */ int c;
    public final IBinder d;
    public final String e;

    public /* synthetic */ kkk(IBinder iBinder, String str, int i) {
        this.c = i;
        this.d = iBinder;
        this.e = str;
    }

    public void G(int i, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.d.transact(i, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }

    public Parcel V(int i, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.d.transact(i, parcel, parcelObtain, 0);
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

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        switch (this.c) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return this.d;
    }

    public Parcel k0(int i, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.d.transact(i, parcel, parcelObtain, 0);
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

    public Parcel l0() {
        int i = this.c;
        String str = this.e;
        switch (i) {
            case 1:
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.writeInterfaceToken(str);
                return parcelObtain;
            default:
                Parcel parcelObtain2 = Parcel.obtain();
                parcelObtain2.writeInterfaceToken(str);
                return parcelObtain2;
        }
    }

    public void m0(int i, Parcel parcel) {
        int i2 = this.c;
        IBinder iBinder = this.d;
        switch (i2) {
            case 2:
                Parcel parcelObtain = Parcel.obtain();
                try {
                    iBinder.transact(i, parcel, parcelObtain, 0);
                    parcelObtain.readException();
                    return;
                } finally {
                    parcel.recycle();
                    parcelObtain.recycle();
                }
            default:
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    iBinder.transact(i, parcel, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return;
                } finally {
                    parcel.recycle();
                    parcelObtain2.recycle();
                }
        }
    }
}
