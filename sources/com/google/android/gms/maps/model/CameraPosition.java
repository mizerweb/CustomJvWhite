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
public final class CameraPosition extends z3 implements ReflectedParcelable {
    public static final Parcelable.Creator<CameraPosition> CREATOR = new pkk(11);
    public final LatLng a;
    public final float b;
    public final float c;
    public final float d;

    public CameraPosition(LatLng latLng, float f, float f2, float f3) {
        yab.t(latLng, "camera target must not be null.");
        boolean z = false;
        if (f2 >= 0.0f && f2 <= 90.0f) {
            z = true;
        }
        if (!z) {
            throw new IllegalArgumentException("Tilt needs to be between 0 and 90 inclusive: " + f2);
        }
        this.a = latLng;
        this.b = f;
        this.c = f2 + 0.0f;
        this.d = (((double) f3) <= 0.0d ? (f3 % 360.0f) + 360.0f : f3) % 360.0f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CameraPosition)) {
            return false;
        }
        CameraPosition cameraPosition = (CameraPosition) obj;
        return this.a.equals(cameraPosition.a) && Float.floatToIntBits(this.b) == Float.floatToIntBits(cameraPosition.b) && Float.floatToIntBits(this.c) == Float.floatToIntBits(cameraPosition.c) && Float.floatToIntBits(this.d) == Float.floatToIntBits(cameraPosition.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Float.valueOf(this.b), Float.valueOf(this.c), Float.valueOf(this.d)});
    }

    public final String toString() {
        qg7 qg7Var = new qg7(this);
        qg7Var.e(this.a, "target");
        qg7Var.e(Float.valueOf(this.b), "zoom");
        qg7Var.e(Float.valueOf(this.c), "tilt");
        qg7Var.e(Float.valueOf(this.d), "bearing");
        return qg7Var.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iT = jol.t(20293, parcel);
        jol.n(parcel, 2, this.a, i);
        jol.s(parcel, 3, 4);
        parcel.writeFloat(this.b);
        jol.s(parcel, 4, 4);
        parcel.writeFloat(this.c);
        jol.s(parcel, 5, 4);
        parcel.writeFloat(this.d);
        jol.u(iT, parcel);
    }
}
