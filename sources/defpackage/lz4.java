package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class lz4 implements Parcelable {
    public static final Parcelable.Creator<lz4> CREATOR = new s9(22);
    public final ArrayList a;
    public final ArrayList b;
    public final List c;
    public final int d;

    public lz4(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, int i) {
        this.a = arrayList;
        this.b = arrayList2;
        this.c = arrayList3;
        this.d = i;
    }

    public final int a() {
        return this.d;
    }

    public final List b() {
        return this.c;
    }

    public final List c() {
        return this.a;
    }

    public final List d() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lz4)) {
            return false;
        }
        lz4 lz4Var = (lz4) obj;
        return this.a.equals(lz4Var.a) && this.b.equals(lz4Var.b) && cqk.d(this.c, lz4Var.c) && this.d == lz4Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + qv1.c(x05.b(this.b, this.a.hashCode() * 31, 31), 31, this.c);
    }

    public final String toString() {
        return "SavedState(savedPagesKeys=" + this.a + ", savedPagesValues=" + this.b + ", savedPageHistory=" + this.c + ", maxPagesToStateSave=" + this.d + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ArrayList arrayList = this.a;
        parcel.writeInt(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            parcel.writeLong(((Number) it.next()).longValue());
        }
        ArrayList arrayList2 = this.b;
        parcel.writeInt(arrayList2.size());
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            parcel.writeBundle((Bundle) it2.next());
        }
        List list = this.c;
        parcel.writeInt(list.size());
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            parcel.writeLong(((Number) it3.next()).longValue());
        }
        parcel.writeInt(this.d);
    }
}
