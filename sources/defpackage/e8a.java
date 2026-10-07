package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class e8a implements Parcelable {
    public static final Parcelable.Creator<e8a> CREATOR = new v39(23);
    public final int a;
    public final ynh b;
    public final osf c;
    public final Integer d;
    public final msf e;

    public e8a(int i, ynh ynhVar, osf osfVar, Integer num, msf msfVar) {
        this.a = i;
        this.b = ynhVar;
        this.c = osfVar;
        this.d = num;
        this.e = msfVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e8a)) {
            return false;
        }
        e8a e8aVar = (e8a) obj;
        return this.a == e8aVar.a && cqk.d(this.b, e8aVar.b) && this.c == e8aVar.c && cqk.d(this.d, e8aVar.d) && cqk.d(this.e, e8aVar.e);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + bc1.h(Integer.hashCode(this.a) * 31, 31, this.b)) * 31;
        Integer num = this.d;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        msf msfVar = this.e;
        return iHashCode2 + (msfVar != null ? msfVar.hashCode() : 0);
    }

    public final String toString() {
        return "MemberListAction(id=" + this.a + ", text=" + this.b + ", type=" + this.c + ", startIconRes=" + this.d + ", endViewType=" + this.e + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iIntValue;
        parcel.writeInt(this.a);
        parcel.writeParcelable(this.b, i);
        parcel.writeString(this.c.name());
        Integer num = this.d;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
        parcel.writeParcelable(this.e, i);
    }

    public /* synthetic */ e8a(int i, tnh tnhVar, Integer num) {
        this(i, tnhVar, osf.a, num, null);
    }
}
