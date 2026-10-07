package defpackage;

import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes4.dex */
public final class urh {
    public final opk a;

    public urh(opk opkVar) {
        this.a = opkVar;
    }

    public final void a() {
        try {
            hpk hpkVar = (hpk) this.a;
            hpkVar.m0(1, hpkVar.l0());
        } catch (RemoteException e) {
            f4a.d(e);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof urh)) {
            return false;
        }
        try {
            opk opkVar = this.a;
            opk opkVar2 = ((urh) obj).a;
            hpk hpkVar = (hpk) opkVar;
            Parcel parcelL0 = hpkVar.l0();
            duk.d(parcelL0, opkVar2);
            Parcel parcelK0 = hpkVar.k0(8, parcelL0);
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
            hpk hpkVar = (hpk) this.a;
            Parcel parcelK0 = hpkVar.k0(9, hpkVar.l0());
            int i = parcelK0.readInt();
            parcelK0.recycle();
            return i;
        } catch (RemoteException e) {
            f4a.d(e);
            return 0;
        }
    }
}
