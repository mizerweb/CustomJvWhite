package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class czg implements Parcelable {
    public static final Parcelable.Creator<czg> CREATOR = new c5e(21);
    public final long a;
    public final int b;

    public czg(long j, int i) {
        this.a = j;
        this.b = i;
    }

    public final azg a() {
        int i = bzg.$EnumSwitchMapping$0[qt4.D(this.b)];
        long j = this.a;
        if (i == 1) {
            return new zyg(j);
        }
        if (i == 2) {
            return new yyg(j);
        }
        if (i == 3) {
            return new xyg(j);
        }
        ore.o();
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof czg)) {
            return false;
        }
        czg czgVar = (czg) obj;
        return this.a == czgVar.a && this.b == czgVar.b;
    }

    public final int hashCode() {
        return qt4.D(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sbS = qt4.s(this.a, "StoryOwnerParcel(id=", ", type=");
        int i = this.b;
        if (i == 1) {
            str = "USER";
        } else if (i != 2) {
            str = i != 3 ? "null" : "CHANNEL";
        } else {
            str = "CHAT";
        }
        sbS.append(str);
        sbS.append(")");
        return sbS.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        parcel.writeLong(this.a);
        int i2 = this.b;
        if (i2 == 1) {
            str = "USER";
        } else if (i2 == 2) {
            str = "CHAT";
        } else {
            if (i2 != 3) {
                throw null;
            }
            str = "CHANNEL";
        }
        parcel.writeString(str);
    }
}
