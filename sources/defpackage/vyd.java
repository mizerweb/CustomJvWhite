package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class vyd implements Parcelable {
    public static final Parcelable.Creator<vyd> CREATOR = new p8c(28);
    public final long a;
    public final String b;
    public final long c;
    public final Long d;
    public final long e;
    public final String f;
    public final long g;
    public final e83 h;
    public final String i;

    public vyd(long j, String str, long j2, Long l, long j3, String str2, long j4, e83 e83Var, String str3) {
        this.a = j;
        this.b = str;
        this.c = j2;
        this.d = l;
        this.e = j3;
        this.f = str2;
        this.g = j4;
        this.h = e83Var;
        this.i = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vyd)) {
            return false;
        }
        vyd vydVar = (vyd) obj;
        return this.a == vydVar.a && cqk.d(this.b, vydVar.b) && this.c == vydVar.c && cqk.d(this.d, vydVar.d) && this.e == vydVar.e && cqk.d(this.f, vydVar.f) && this.g == vydVar.g && this.h == vydVar.h && cqk.d(this.i, vydVar.i);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.a) * 31;
        String str = this.b;
        int iG = qt4.g((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
        Long l = this.d;
        int iG2 = qt4.g((iG + (l == null ? 0 : l.hashCode())) * 31, 31, this.e);
        String str2 = this.f;
        int iHashCode2 = (this.h.hashCode() + qt4.g((iG2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.g)) * 31;
        String str3 = this.i;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbT = qt4.t(this.a, "PushInfo(pushId=", ", eventKey=", this.b);
        qt4.z(this.c, ", chatServerId=", ", chatId=", sbT);
        sbT.append(this.d);
        sbT.append(", messageServerId=");
        sbT.append(this.e);
        p.j(sbT, ", pushType=", this.f, ", createdTime=");
        sbT.append(this.g);
        sbT.append(", chatType=");
        sbT.append(this.h);
        return qt4.q(sbT, ", url=", this.i, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeString(this.b);
        parcel.writeLong(this.c);
        Long l = this.d;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeLong(this.e);
        parcel.writeString(this.f);
        parcel.writeLong(this.g);
        this.h.writeToParcel(parcel, i);
        parcel.writeString(this.i);
    }
}
