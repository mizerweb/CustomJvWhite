package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public final class kxk implements e5l, IInterface {
    public final IBinder c;

    public kxk(IBinder iBinder) {
        this.c = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.c;
    }

    @Override // defpackage.e5l
    public final void x(String str, Bundle bundle, h1m h1mVar) {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken("com.google.android.play.core.appupdate.protocol.IAppUpdateService");
        parcelObtain.writeString(str);
        int i = otk.a;
        parcelObtain.writeInt(1);
        bundle.writeToParcel(parcelObtain, 0);
        parcelObtain.writeStrongBinder(h1mVar);
        try {
            this.c.transact(2, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }
}
