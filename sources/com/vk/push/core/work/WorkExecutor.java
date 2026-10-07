package com.vk.push.core.work;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.vk.push.core.base.AsyncCallback;

/* JADX INFO: loaded from: classes2.dex */
public interface WorkExecutor extends IInterface {
    public static final String DESCRIPTOR = "com.vk.push.core.work.WorkExecutor";

    public static class Default implements WorkExecutor {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.vk.push.core.work.WorkExecutor
        public void executeWork(WorkModel workModel, AsyncCallback asyncCallback) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements WorkExecutor {
        public Stub() {
            attachInterface(this, WorkExecutor.DESCRIPTOR);
        }

        public static WorkExecutor asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(WorkExecutor.DESCRIPTOR);
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof WorkExecutor)) {
                return (WorkExecutor) iInterfaceQueryLocalInterface;
            }
            a aVar = new a();
            aVar.c = iBinder;
            return aVar;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(WorkExecutor.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(WorkExecutor.DESCRIPTOR);
                return true;
            }
            if (i != 2) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            executeWork(parcel.readInt() != 0 ? WorkModel.INSTANCE.createFromParcel(parcel) : null, AsyncCallback.Stub.asInterface(parcel.readStrongBinder()));
            return true;
        }
    }

    public static class _Parcel {
    }

    void executeWork(WorkModel workModel, AsyncCallback asyncCallback) throws RemoteException;
}
