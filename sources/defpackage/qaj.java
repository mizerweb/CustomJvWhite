package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class qaj extends z3 {
    public static final Parcelable.Creator<qaj> CREATOR = new pkk(17);
    public final LatLng a;
    public final LatLng b;
    public final LatLng c;
    public final LatLng d;
    public final LatLngBounds e;

    public qaj(LatLng latLng, LatLng latLng2, LatLng latLng3, LatLng latLng4, LatLngBounds latLngBounds) {
        this.a = latLng;
        this.b = latLng2;
        this.c = latLng3;
        this.d = latLng4;
        this.e = latLngBounds;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qaj)) {
            return false;
        }
        qaj qajVar = (qaj) obj;
        return this.a.equals(qajVar.a) && this.b.equals(qajVar.b) && this.c.equals(qajVar.c) && this.d.equals(qajVar.d) && this.e.equals(qajVar.e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e});
    }

    public final String toString() {
        qg7 qg7Var = new qg7(this);
        qg7Var.e(this.a, "nearLeft");
        qg7Var.e(this.b, "nearRight");
        qg7Var.e(this.c, "farLeft");
        qg7Var.e(this.d, "farRight");
        qg7Var.e(this.e, "latLngBounds");
        return qg7Var.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iT = jol.t(20293, parcel);
        jol.n(parcel, 2, this.a, i);
        jol.n(parcel, 3, this.b, i);
        jol.n(parcel, 4, this.c, i);
        jol.n(parcel, 5, this.d, i);
        jol.n(parcel, 6, this.e, i);
        jol.u(iT, parcel);
    }
}
