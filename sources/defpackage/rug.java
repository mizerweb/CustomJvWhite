package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class rug implements tug {
    public static final Parcelable.Creator<rug> CREATOR = new c5e(20);
    public final long a;
    public final avg b;
    public final long c;

    public rug(long j, avg avgVar, long j2) {
        this.a = j;
        this.b = avgVar;
        this.c = j2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rug)) {
            return false;
        }
        rug rugVar = (rug) obj;
        return this.a == rugVar.a && this.b == rugVar.b && this.c == rugVar.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + ((this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31);
    }

    @Override // defpackage.tug
    public final avg r() {
        return this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SingleStory(ownerId=");
        sb.append(this.a);
        sb.append(", ownerType=");
        sb.append(this.b);
        return zo5.k(this.c, ", storyId=", ")", sb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeString(this.b.name());
        parcel.writeLong(this.c);
    }

    @Override // defpackage.tug
    public final long x() {
        return this.a;
    }
}
