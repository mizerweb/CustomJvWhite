package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.MultiInstanceInvalidationService;

/* JADX INFO: loaded from: classes2.dex */
public final class j5b extends Binder implements k38 {
    public static final /* synthetic */ int d = 0;
    public final /* synthetic */ MultiInstanceInvalidationService c;

    public j5b(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.c = multiInstanceInvalidationService;
        attachInterface(this, k38.b);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // defpackage.k38
    public final void e0(i38 i38Var, int i) {
        MultiInstanceInvalidationService multiInstanceInvalidationService = this.c;
        synchronized (multiInstanceInvalidationService.c) {
            multiInstanceInvalidationService.c.unregister(i38Var);
        }
    }

    @Override // defpackage.k38
    public final int h(i38 i38Var, String str) {
        int i = 0;
        if (str == null) {
            return 0;
        }
        MultiInstanceInvalidationService multiInstanceInvalidationService = this.c;
        synchronized (multiInstanceInvalidationService.c) {
            try {
                int i2 = multiInstanceInvalidationService.a + 1;
                multiInstanceInvalidationService.a = i2;
                if (multiInstanceInvalidationService.c.register(i38Var, Integer.valueOf(i2))) {
                    multiInstanceInvalidationService.b.put(Integer.valueOf(i2), str);
                    i = i2;
                } else {
                    multiInstanceInvalidationService.a--;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return i;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        String str = k38.b;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        i38 i38Var = null;
        i38 i38Var2 = null;
        if (i == 1) {
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface(i38.a);
                if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof i38)) {
                    h38 h38Var = new h38();
                    h38Var.c = strongBinder;
                    i38Var = h38Var;
                } else {
                    i38Var = (i38) iInterfaceQueryLocalInterface;
                }
            }
            int iH = h(i38Var, parcel.readString());
            parcel2.writeNoException();
            parcel2.writeInt(iH);
            return true;
        }
        if (i != 2) {
            if (i != 3) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            y(parcel.readInt(), parcel.createStringArray());
            return true;
        }
        IBinder strongBinder2 = parcel.readStrongBinder();
        if (strongBinder2 != null) {
            IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface(i38.a);
            if (iInterfaceQueryLocalInterface2 == null || !(iInterfaceQueryLocalInterface2 instanceof i38)) {
                h38 h38Var2 = new h38();
                h38Var2.c = strongBinder2;
                i38Var2 = h38Var2;
            } else {
                i38Var2 = (i38) iInterfaceQueryLocalInterface2;
            }
        }
        e0(i38Var2, parcel.readInt());
        parcel2.writeNoException();
        return true;
    }

    @Override // defpackage.k38
    public final void y(int i, String[] strArr) {
        MultiInstanceInvalidationService multiInstanceInvalidationService = this.c;
        synchronized (multiInstanceInvalidationService.c) {
            String str = (String) multiInstanceInvalidationService.b.get(Integer.valueOf(i));
            if (str == null) {
                Log.w("ROOM", "Remote invalidation client ID not registered");
                return;
            }
            int iBeginBroadcast = multiInstanceInvalidationService.c.beginBroadcast();
            int i2 = 0;
            while (true) {
                k5b k5bVar = multiInstanceInvalidationService.c;
                if (i2 >= iBeginBroadcast) {
                    k5bVar.finishBroadcast();
                    return;
                }
                try {
                    Integer num = (Integer) k5bVar.getBroadcastCookie(i2);
                    int iIntValue = num.intValue();
                    String str2 = (String) multiInstanceInvalidationService.b.get(num);
                    if (i != iIntValue && str.equals(str2)) {
                        try {
                            ((i38) multiInstanceInvalidationService.c.getBroadcastItem(i2)).g(strArr);
                        } catch (RemoteException e) {
                            Log.w("ROOM", "Error invoking a remote callback", e);
                        }
                    }
                    i2++;
                } catch (Throwable th) {
                    multiInstanceInvalidationService.c.finishBroadcast();
                    throw th;
                }
            }
        }
    }
}
