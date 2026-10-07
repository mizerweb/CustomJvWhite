package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes2.dex */
public final class hp extends z3 {
    public static final Parcelable.Creator<hp> CREATOR = new pkk(3);
    public final List a;
    public final boolean b;
    public final String c;
    public final String d;

    public hp(ArrayList arrayList, boolean z, String str, String str2) {
        yab.s(arrayList);
        this.a = arrayList;
        this.b = z;
        this.c = str;
        this.d = str2;
    }

    public static hp b(List list, boolean z) {
        TreeSet treeSet = new TreeSet(lv5.e);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Collections.addAll(treeSet, ((ygc) it.next()).s());
        }
        return new hp(new ArrayList(treeSet), z, null, null);
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof hp)) {
            return false;
        }
        hp hpVar = (hp) obj;
        return this.b == hpVar.b && f55.h(this.a, hpVar.a) && f55.h(this.c, hpVar.c) && f55.h(this.d, hpVar.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.b), this.a, this.c, this.d});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iT = jol.t(20293, parcel);
        jol.r(parcel, this.a, 1);
        jol.s(parcel, 2, 4);
        parcel.writeInt(this.b ? 1 : 0);
        jol.o(parcel, 3, this.c);
        jol.o(parcel, 4, this.d);
        jol.u(iT, parcel);
    }
}
