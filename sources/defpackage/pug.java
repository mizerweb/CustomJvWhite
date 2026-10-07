package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class pug implements tug {
    public static final Parcelable.Creator<pug> CREATOR = new eu1(5);
    public final long a;
    public final avg b;

    public pug(long j, avg avgVar) {
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
        if (!(obj instanceof pug)) {
            return false;
        }
        pug pugVar = (pug) obj;
        return this.a == pugVar.a && this.b == pugVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    @Override // defpackage.tug
    public final avg r() {
        return this.b;
    }

    public final String toString() {
        return "All(ownerId=" + this.a + ", ownerType=" + this.b + ")";
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

    public /* synthetic */ pug() {
        this(-1L, avg.UNKNOWN);
    }
}
