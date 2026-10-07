package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.eu1;
import defpackage.f55;
import defpackage.jnl;
import defpackage.jol;
import defpackage.le4;
import defpackage.qg7;
import defpackage.voe;
import defpackage.z3;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class Status extends z3 implements voe, ReflectedParcelable {
    public final int a;
    public final String b;
    public final PendingIntent c;
    public final le4 d;
    public static final Status e = new Status(0, null, null, null);
    public static final Status f = new Status(14, null, null, null);
    public static final Status g = new Status(8, null, null, null);
    public static final Status h = new Status(15, null, null, null);
    public static final Status i = new Status(16, null, null, null);
    public static final Parcelable.Creator<Status> CREATOR = new eu1(10);

    public Status(int i2, String str, PendingIntent pendingIntent, le4 le4Var) {
        this.a = i2;
        this.b = str;
        this.c = pendingIntent;
        this.d = le4Var;
    }

    @Override // defpackage.voe
    public final Status a() {
        return this;
    }

    public final boolean b() {
        return this.a <= 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.a == status.a && f55.h(this.b, status.b) && f55.h(this.c, status.c) && f55.h(this.d, status.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.b, this.c, this.d});
    }

    public final String toString() {
        qg7 qg7Var = new qg7(this);
        String strA = this.b;
        if (strA == null) {
            strA = jnl.a(this.a);
        }
        qg7Var.e(strA, "statusCode");
        qg7Var.e(this.c, "resolution");
        return qg7Var.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iB = jol.b(parcel);
        jol.k(parcel, 1, this.a);
        jol.o(parcel, 2, this.b);
        jol.n(parcel, 3, this.c, i2);
        jol.n(parcel, 4, this.d, i2);
        jol.c(iB, parcel);
    }
}
