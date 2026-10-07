package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes2.dex */
public abstract class r1l extends Binder implements n5l, IInterface {
    public static n5l G(IBinder iBinder) {
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        return iInterfaceQueryLocalInterface instanceof n5l ? (n5l) iInterfaceQueryLocalInterface : new wxk(iBinder);
    }
}
