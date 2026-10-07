package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class znk implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iU = iol.u(parcel);
        int iO = 0;
        boolean zJ = false;
        while (parcel.dataPosition() < iU) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 2) {
                iO = iol.o(i, parcel);
            } else if (c != 3) {
                iol.t(i, parcel);
            } else {
                zJ = iol.j(i, parcel);
            }
        }
        iol.h(iU, parcel);
        return new unk(iO, zJ);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new unk[i];
    }
}
