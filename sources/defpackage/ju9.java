package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.support.v4.media.session.IMediaControllerCallback;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public final class ju9 extends Binder implements a38 {
    public static final /* synthetic */ int d = 0;
    public final WeakReference c;

    public ju9(nv9 nv9Var) {
        attachInterface(this, IMediaControllerCallback.DESCRIPTOR);
        this.c = new WeakReference(nv9Var);
    }

    public static a38 G(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IMediaControllerCallback.DESCRIPTOR);
        if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof a38)) {
            return (a38) iInterfaceQueryLocalInterface;
        }
        z28 z28Var = new z28();
        z28Var.c = iBinder;
        return z28Var;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // defpackage.a38
    public final void e(x2d x2dVar) {
        nv9 nv9Var = (nv9) this.c.get();
        if (nv9Var != null) {
            nv9Var.c(2, x2dVar);
        }
    }

    @Override // defpackage.a38
    public final void onRepeatModeChanged(int i) {
        nv9 nv9Var = (nv9) this.c.get();
        if (nv9Var != null) {
            nv9Var.c(9, Integer.valueOf(i));
        }
    }

    @Override // defpackage.a38
    public final void onShuffleModeChanged(int i) {
        nv9 nv9Var = (nv9) this.c.get();
        if (nv9Var != null) {
            nv9Var.c(12, Integer.valueOf(i));
        }
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 3) {
            parcel.enforceInterface(IMediaControllerCallback.DESCRIPTOR);
            e(parcel.readInt() != 0 ? x2d.CREATOR.createFromParcel(parcel) : null);
            return true;
        }
        if (i == 9) {
            parcel.enforceInterface(IMediaControllerCallback.DESCRIPTOR);
            onRepeatModeChanged(parcel.readInt());
            return true;
        }
        if (i == 1598968902) {
            parcel2.getClass();
            parcel2.writeString(IMediaControllerCallback.DESCRIPTOR);
            return true;
        }
        WeakReference weakReference = this.c;
        switch (i) {
            case 11:
                parcel.enforceInterface(IMediaControllerCallback.DESCRIPTOR);
                boolean z = parcel.readInt() != 0;
                nv9 nv9Var = (nv9) weakReference.get();
                if (nv9Var != null) {
                    nv9Var.c(11, Boolean.valueOf(z));
                }
                return true;
            case 12:
                parcel.enforceInterface(IMediaControllerCallback.DESCRIPTOR);
                onShuffleModeChanged(parcel.readInt());
                return true;
            case 13:
                parcel.enforceInterface(IMediaControllerCallback.DESCRIPTOR);
                nv9 nv9Var2 = (nv9) weakReference.get();
                if (nv9Var2 != null) {
                    nv9Var2.c(13, null);
                    return true;
                }
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
