package defpackage;

import android.location.Location;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes3.dex */
public final class ik7 extends Binder implements IInterface {
    public final /* synthetic */ int c = 0;
    public final /* synthetic */ Object d;

    public ik7(xll xllVar) {
        this.d = xllVar;
        attachInterface(this, "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverResultCallback");
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        int i = this.c;
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        boolean zOnTransact;
        switch (this.c) {
            case 0:
                if (i >= 1 && i <= 16777215) {
                    parcel.enforceInterface("ru.vk.store.provider.appupdate.GetAppUpdateInfoCallback");
                }
                if (i == 1598968902) {
                    parcel2.writeString("ru.vk.store.provider.appupdate.GetAppUpdateInfoCallback");
                    return true;
                }
                if (i == 1) {
                    Bundle bundle = (Bundle) (parcel.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcel) : null);
                    String name = ik7.class.getName();
                    a4c a4cVar = gm0.f;
                    if (a4cVar != null) {
                        je9 je9Var = je9.d;
                        if (a4cVar.b(je9Var)) {
                            a4cVar.c(je9Var, name, "onSuccess: " + bundle, null);
                        }
                    }
                    ((jk7) this.d).c.invoke(bundle);
                    parcel2.writeNoException();
                    return true;
                }
                if (i != 2) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                int i3 = parcel.readInt();
                String string = parcel.readString();
                String name2 = ik7.class.getName();
                a4c a4cVar2 = gm0.f;
                if (a4cVar2 != null) {
                    je9 je9Var2 = je9.f;
                    if (a4cVar2.b(je9Var2)) {
                        a4cVar2.c(je9Var2, name2, zo5.i(i3, "onError: code=", " message=", string), null);
                    }
                }
                ((jk7) this.d).d.invoke(Integer.valueOf(i3), string);
                parcel2.writeNoException();
                return true;
            case 1:
                if (i > 16777215) {
                    if (!super.onTransact(i, parcel, parcel2, i2)) {
                    }
                    return true;
                }
                parcel.enforceInterface(getInterfaceDescriptor());
                if (i != 1) {
                    return false;
                }
                Parcelable.Creator<Status> creator = Status.CREATOR;
                int i4 = cuk.a;
                Status statusCreateFromParcel = parcel.readInt() == 0 ? null : creator.createFromParcel(parcel);
                Location location = (Location) (parcel.readInt() != 0 ? (Parcelable) Location.CREATOR.createFromParcel(parcel) : null);
                int iDataAvail = parcel.dataAvail();
                if (iDataAvail > 0) {
                    throw new BadParcelableException(zo5.v(new StringBuilder(String.valueOf(iDataAvail).length() + 45), "Parcel data not fully consumed, unread size: ", iDataAvail));
                }
                qjh qjhVar = (qjh) this.d;
                if (statusCreateFromParcel.b()) {
                    qjhVar.b(location);
                } else {
                    qjhVar.a(vd7.x(statusCreateFromParcel));
                }
                return true;
            default:
                if (i > 16777215) {
                    zOnTransact = super.onTransact(i, parcel, parcel2, i2);
                } else {
                    parcel.enforceInterface(getInterfaceDescriptor());
                    zOnTransact = false;
                }
                if (!zOnTransact) {
                    if (i != 1) {
                        return false;
                    }
                    Parcelable.Creator<Status> creator2 = Status.CREATOR;
                    int i5 = auk.a;
                    Status statusCreateFromParcel2 = parcel.readInt() == 0 ? null : creator2.createFromParcel(parcel);
                    qjh qjhVar2 = ((xll) this.d).d;
                    if (statusCreateFromParcel2.b()) {
                        qjhVar2.b(null);
                    } else {
                        qjhVar2.a(vd7.x(statusCreateFromParcel2));
                    }
                }
                return true;
        }
    }

    public ik7(qjh qjhVar) {
        this.d = qjhVar;
        attachInterface(this, "com.google.android.gms.location.internal.ILocationStatusCallback");
    }

    public ik7(jk7 jk7Var) {
        this.d = jk7Var;
        attachInterface(this, "ru.vk.store.provider.appupdate.GetAppUpdateInfoCallback");
    }
}
