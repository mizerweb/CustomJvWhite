package com.vk.push.core.work;

import android.os.IBinder;
import android.os.Parcel;
import com.vk.push.core.base.AsyncCallback;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements WorkRegistrator {
    public IBinder c;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.c;
    }

    @Override // com.vk.push.core.work.WorkRegistrator
    public final void cancelWork(String str, AsyncCallback asyncCallback) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(WorkRegistrator.DESCRIPTOR);
            parcelObtain.writeString(str);
            parcelObtain.writeStrongInterface(asyncCallback);
            this.c.transact(3, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // com.vk.push.core.work.WorkRegistrator
    public final void registerWork(WorkModel workModel, AsyncCallback asyncCallback) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(WorkRegistrator.DESCRIPTOR);
            if (workModel != null) {
                parcelObtain.writeInt(1);
                workModel.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            parcelObtain.writeStrongInterface(asyncCallback);
            this.c.transact(2, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }
}
