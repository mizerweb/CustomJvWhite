package defpackage;

import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public class in9 {
    public final cok a;

    public in9(cok cokVar) {
        this.a = cokVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof in9)) {
            return false;
        }
        try {
            cok cokVar = this.a;
            cok cokVar2 = ((in9) obj).a;
            tnk tnkVar = (tnk) cokVar;
            Parcel parcelL0 = tnkVar.l0();
            duk.d(parcelL0, cokVar2);
            Parcel parcelK0 = tnkVar.k0(16, parcelL0);
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
            tnk tnkVar = (tnk) this.a;
            Parcel parcelK0 = tnkVar.k0(17, tnkVar.l0());
            int i = parcelK0.readInt();
            parcelK0.recycle();
            return i;
        } catch (RemoteException e) {
            f4a.d(e);
            return 0;
        }
    }
}
