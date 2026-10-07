package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.jol;
import defpackage.pkk;
import defpackage.z3;

/* JADX INFO: loaded from: classes2.dex */
public class SignInAccount extends z3 implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInAccount> CREATOR = new pkk(20);
    public String a;
    public GoogleSignInAccount b;
    public String c;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iT = jol.t(20293, parcel);
        jol.o(parcel, 4, this.a);
        jol.n(parcel, 7, this.b, i);
        jol.o(parcel, 8, this.c);
        jol.u(iT, parcel);
    }
}
