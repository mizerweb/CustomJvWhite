package defpackage;

import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes3.dex */
public final class wq7 {
    public final obm a;

    public wq7(obm obmVar) {
        this.a = obmVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof wq7)) {
            return false;
        }
        try {
            obm obmVar = this.a;
            obm obmVar2 = ((wq7) obj).a;
            b9m b9mVar = (b9m) obmVar;
            Parcel parcelL0 = b9mVar.l0();
            duk.d(parcelL0, obmVar2);
            Parcel parcelK0 = b9mVar.k0(19, parcelL0);
            boolean z = parcelK0.readInt() != 0;
            parcelK0.recycle();
            return z;
        } catch (RemoteException e) {
            f4a.d(e);
            return false;
        }
    }

    public final int hashCode() {
        try {
            b9m b9mVar = (b9m) this.a;
            Parcel parcelK0 = b9mVar.k0(20, b9mVar.l0());
            int i = parcelK0.readInt();
            parcelK0.recycle();
            return i;
        } catch (RemoteException e) {
            f4a.d(e);
            return 0;
        }
    }
}
