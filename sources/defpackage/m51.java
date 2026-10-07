package defpackage;

import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class m51 extends Binder {
    public static final int d;
    public final c98 c;

    static {
        d = Build.VERSION.SDK_INT >= 30 ? IBinder.getSuggestedMaxIpcSizeBytes() : 65536;
    }

    public m51(List list) {
        this.c = c98.n(list);
    }

    public static c98 a(IBinder iBinder) {
        int i;
        if (iBinder instanceof m51) {
            return ((m51) iBinder).c;
        }
        z88 z88VarL = c98.l();
        int i2 = 0;
        int i3 = 1;
        while (i3 != 0) {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInt(i2);
                try {
                    iBinder.transact(1, parcelObtain, parcelObtain2, 0);
                    while (true) {
                        i = parcelObtain2.readInt();
                        if (i == 1) {
                            Bundle bundle = parcelObtain2.readBundle();
                            bundle.getClass();
                            z88VarL.c(bundle);
                            i2++;
                        }
                    }
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    i3 = i;
                } catch (RemoteException e) {
                    throw new RuntimeException(e);
                }
            } catch (Throwable th) {
                parcelObtain2.recycle();
                parcelObtain.recycle();
                throw th;
            }
        }
        return z88VarL.h();
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        if (parcel2 == null) {
            return false;
        }
        c98 c98Var = this.c;
        int size = c98Var.size();
        int i3 = parcel.readInt();
        while (i3 < size && parcel2.dataSize() < d) {
            parcel2.writeInt(1);
            parcel2.writeBundle((Bundle) c98Var.get(i3));
            i3++;
        }
        parcel2.writeInt(i3 < size ? 2 : 0);
        return true;
    }
}
