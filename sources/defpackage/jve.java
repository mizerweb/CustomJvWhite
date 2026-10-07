package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class jve implements Parcelable {
    public static final Parcelable.Creator<jve> CREATOR = new c5e(4);
    public final ArrayList a;
    public final ArrayList b;
    public final List c;
    public final int d;

    public jve(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, int i) {
        this.a = arrayList;
        this.b = arrayList2;
        this.c = arrayList3;
        this.d = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jve)) {
            return false;
        }
        jve jveVar = (jve) obj;
        return this.a.equals(jveVar.a) && this.b.equals(jveVar.b) && cqk.d(this.c, jveVar.c) && this.d == jveVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + qv1.c(x05.b(this.b, this.a.hashCode() * 31, 31), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SavedState(savedPagesKeys=");
        sb.append(this.a);
        sb.append(", savedPagesValues=");
        sb.append(this.b);
        sb.append(", savedPageHistory=");
        sb.append(this.c);
        sb.append(", maxPagesToStateSave=");
        return qt4.p(sb, this.d, ')');
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
