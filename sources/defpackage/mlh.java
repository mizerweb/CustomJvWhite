package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class mlh extends z3 {
    public static final Parcelable.Creator<mlh> CREATOR = new eu1(6);
    public final int a;
    public List b;

    public mlh(int i, List list) {
        this.a = i;
        this.b = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iB = jol.b(parcel);
        jol.k(parcel, 1, this.a);
        jol.r(parcel, this.b, 2);
        jol.c(iB, parcel);
    }
}
