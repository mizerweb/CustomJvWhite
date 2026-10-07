package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class wcm extends z3 {
    public static final Parcelable.Creator<wcm> CREATOR = new pdm();
    private final String a;
    private final String b;
    private final int c;

    public wcm(String str, String str2, int i) {
        this.a = str;
        this.b = str2;
        this.c = i;
    }

    public final int b() {
        return this.c;
    }

    public final String c() {
        return this.b;
    }

    public final String d() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iT = jol.t(20293, parcel);
        jol.o(parcel, 1, str);
        jol.o(parcel, 2, this.b);
        int i2 = this.c;
        jol.s(parcel, 3, 4);
        parcel.writeInt(i2);
        jol.u(iT, parcel);
    }
}
