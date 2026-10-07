package defpackage;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* JADX INFO: loaded from: classes2.dex */
public final class amk extends z3 {
    public static final Parcelable.Creator<amk> CREATOR = new pkk(9);
    public final int a;
    public final Account b;
    public final int c;
    public final GoogleSignInAccount d;

    public amk(int i, Account account, int i2, GoogleSignInAccount googleSignInAccount) {
        this.a = i;
        this.b = account;
        this.c = i2;
        this.d = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iT = jol.t(20293, parcel);
        jol.s(parcel, 1, 4);
        parcel.writeInt(this.a);
        jol.n(parcel, 2, this.b, i);
        jol.s(parcel, 3, 4);
        parcel.writeInt(this.c);
        jol.n(parcel, 4, this.d, i);
        jol.u(iT, parcel);
    }
}
