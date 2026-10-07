package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class tcm extends z3 {
    public static final Parcelable.Creator<tcm> CREATOR = new odm();
    private final String a;
    private final String b;

    public tcm(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final String b() {
        return this.a;
    }

    public final String c() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iT = jol.t(20293, parcel);
        jol.o(parcel, 1, str);
        jol.o(parcel, 2, this.b);
        jol.u(iT, parcel);
    }
}
