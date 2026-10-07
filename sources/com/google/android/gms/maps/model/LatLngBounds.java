package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.jol;
import defpackage.pkk;
import defpackage.qg7;
import defpackage.yab;
import defpackage.z3;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class LatLngBounds extends z3 implements ReflectedParcelable {
    public static final Parcelable.Creator<LatLngBounds> CREATOR = new pkk(27);
    public final LatLng a;
    public final LatLng b;

    public LatLngBounds(LatLng latLng, LatLng latLng2) {
        yab.t(latLng, "southwest must not be null.");
        yab.t(latLng2, "northeast must not be null.");
        double d = latLng2.a;
        double d2 = latLng.a;
        if (d >= d2) {
            this.a = latLng;
            this.b = latLng2;
            return;
        }
        throw new IllegalArgumentException("southern latitude exceeds northern latitude (" + d2 + " > " + d + ")");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatLngBounds)) {
            return false;
        }
        LatLngBounds latLngBounds = (LatLngBounds) obj;
        return this.a.equals(latLngBounds.a) && this.b.equals(latLngBounds.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        qg7 qg7Var = new qg7(this);
        qg7Var.e(this.a, "southwest");
        qg7Var.e(this.b, "northeast");
        return qg7Var.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iT = jol.t(20293, parcel);
        jol.n(parcel, 2, this.a, i);
        jol.n(parcel, 3, this.b, i);
        jol.u(iT, parcel);
    }
}
