package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class qug implements tug {
    public static final Parcelable.Creator<qug> CREATOR = new c5e(19);
    public final long a;
    public final avg b;

    public qug(long j, avg avgVar) {
        this.a = j;
        this.b = avgVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qug)) {
            return false;
        }
        qug qugVar = (qug) obj;
        return this.a == qugVar.a && this.b == qugVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    @Override // defpackage.tug
    public final avg r() {
        return this.b;
    }

    public final String toString() {
        return "SingleOwner(ownerId=" + this.a + ", ownerType=" + this.b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeString(this.b.name());
    }

    @Override // defpackage.tug
    public final long x() {
        return this.a;
    }
}
