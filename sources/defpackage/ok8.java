package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class ok8 implements Parcelable {
    public static final Parcelable.Creator<ok8> CREATOR = new uu5(14);
    public final String a;
    public final String b;
    public final int c;
    public final long d;

    public /* synthetic */ ok8(int i, int i2, long j, String str, String str2) {
        this((i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? 0L : j, (i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : str2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ok8)) {
            return false;
        }
        ok8 ok8Var = (ok8) obj;
        return cqk.d(this.a, ok8Var.a) && cqk.d(this.b, ok8Var.b) && this.c == ok8Var.c && this.d == ok8Var.d;
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return Long.hashCode(this.d) + zo5.c(this.c, (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sbQ = qv1.q("EmailData(email=", this.a, ", prevEmail=", this.b, ", emailCodeLength=");
        c0a.v(sbQ, this.c, ", durationTimerForResend=", this.d);
        sbQ.append(")");
        return sbQ.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeInt(this.c);
        parcel.writeLong(this.d);
    }

    public ok8(int i, long j, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = j;
    }
}
