package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class pk8 implements Parcelable {
    public static final Parcelable.Creator<pk8> CREATOR = new uu5(13);
    public final String a;
    public final String b;
    public final ok8 c;
    public final String d;
    public final m6i e;

    public /* synthetic */ pk8(String str, String str2, ok8 ok8Var, String str3, m6i m6iVar, int i) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : ok8Var, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : m6iVar);
    }

    public static pk8 a(pk8 pk8Var, String str, String str2, ok8 ok8Var, int i) {
        if ((i & 1) != 0) {
            str = pk8Var.a;
        }
        String str3 = str;
        if ((i & 2) != 0) {
            str2 = pk8Var.b;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            ok8Var = pk8Var.c;
        }
        String str5 = pk8Var.d;
        m6i m6iVar = pk8Var.e;
        pk8Var.getClass();
        return new pk8(str3, str4, ok8Var, str5, m6iVar);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pk8)) {
            return false;
        }
        pk8 pk8Var = (pk8) obj;
        return cqk.d(this.a, pk8Var.a) && cqk.d(this.b, pk8Var.b) && cqk.d(this.c, pk8Var.c) && cqk.d(this.d, pk8Var.d) && cqk.d(this.e, pk8Var.e);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        ok8 ok8Var = this.c;
        int iHashCode3 = (iHashCode2 + (ok8Var == null ? 0 : ok8Var.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        m6i m6iVar = this.e;
        return iHashCode4 + (m6iVar != null ? m6iVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbQ = qv1.q("InternalTwoFANavData(password=", this.a, ", hint=", this.b, ", emailData=");
        sbQ.append(this.c);
        sbQ.append(", phoneForLogin=");
        sbQ.append(this.d);
        sbQ.append(", twoFAConfig=");
        sbQ.append(this.e);
        sbQ.append(")");
        return sbQ.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        ok8 ok8Var = this.c;
        if (ok8Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            ok8Var.writeToParcel(parcel, i);
        }
        parcel.writeString(this.d);
        m6i m6iVar = this.e;
        if (m6iVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            m6iVar.writeToParcel(parcel, i);
        }
    }

    public pk8(String str, String str2, ok8 ok8Var, String str3, m6i m6iVar) {
        this.a = str;
        this.b = str2;
        this.c = ok8Var;
        this.d = str3;
        this.e = m6iVar;
    }
}
