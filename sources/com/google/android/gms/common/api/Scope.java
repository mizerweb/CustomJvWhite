package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.jol;
import defpackage.pkk;
import defpackage.yab;
import defpackage.z3;

/* JADX INFO: loaded from: classes2.dex */
public final class Scope extends z3 implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new pkk(21);
    public final int a;
    public final String b;

    public Scope(int i, String str) {
        yab.q(str, "scopeUri must not be null or empty");
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.b.equals(((Scope) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iT = jol.t(20293, parcel);
        jol.s(parcel, 1, 4);
        parcel.writeInt(this.a);
        jol.o(parcel, 2, this.b);
        jol.u(iT, parcel);
    }
}
