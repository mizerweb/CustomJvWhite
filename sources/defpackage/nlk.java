package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class nlk extends z3 implements voe {
    public static final Parcelable.Creator<nlk> CREATOR = new pkk(6);
    public final List a;
    public final String b;

    public nlk(String str, ArrayList arrayList) {
        this.a = arrayList;
        this.b = str;
    }

    @Override // defpackage.voe
    public final Status a() {
        return this.b != null ? Status.e : Status.i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iT = jol.t(20293, parcel);
        List<String> list = this.a;
        if (list != null) {
            int iT2 = jol.t(1, parcel);
            parcel.writeStringList(list);
            jol.u(iT2, parcel);
        }
        jol.o(parcel, 2, this.b);
        jol.u(iT, parcel);
    }
}
