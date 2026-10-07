package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class c9a implements Parcelable {
    public static final Parcelable.Creator<c9a> CREATOR = new v39(24);
    public final long a;
    public final p63 b;
    public final boolean c;
    public final Integer d;

    public /* synthetic */ c9a(long j, p63 p63Var, int i) {
        this(j, p63Var, true, (i & 8) != 0 ? null : 10);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c9a)) {
            return false;
        }
        c9a c9aVar = (c9a) obj;
        return this.a == c9aVar.a && this.b == c9aVar.b && this.c == c9aVar.c && cqk.d(this.d, c9aVar.d);
    }

    public final int hashCode() {
        int iN = nbh.n((this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31, 31, this.c);
        Integer num = this.d;
        return iN + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "MembersListArgs(chatId=" + this.a + ", chatMemberType=" + this.b + ", isLongClickEnabled=" + this.c + ", memberLimit=" + this.d + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeString(this.b.name());
        parcel.writeInt(this.c ? 1 : 0);
        Integer num = this.d;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
    }

    public c9a(long j, p63 p63Var, boolean z, Integer num) {
        this.a = j;
        this.b = p63Var;
        this.c = z;
        this.d = num;
    }
}
