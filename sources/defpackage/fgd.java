package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class fgd implements Parcelable {
    public static final Parcelable.Creator<fgd> CREATOR = new p8c(23);
    public final LinkedHashMap a;
    public final ArrayList b;
    public final udb c;

    public fgd(LinkedHashMap linkedHashMap, ArrayList arrayList, udb udbVar) {
        this.a = linkedHashMap;
        this.b = arrayList;
        this.c = udbVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fgd)) {
            return false;
        }
        fgd fgdVar = (fgd) obj;
        return this.a.equals(fgdVar.a) && this.b.equals(fgdVar.b) && cqk.d(this.c, fgdVar.c);
    }

    public final int hashCode() {
        int iB = x05.b(this.b, this.a.hashCode() * 31, 31);
        udb udbVar = this.c;
        return iB + (udbVar == null ? 0 : udbVar.hashCode());
    }

    public final String toString() {
        return "PresetAvatarsModel(categories=" + this.a + ", avatars=" + this.b + ", selectedAvatar=" + this.c + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        LinkedHashMap linkedHashMap = this.a;
        parcel.writeInt(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            parcel.writeInt(((Number) entry.getKey()).intValue());
            parcel.writeString((String) entry.getValue());
        }
        ArrayList arrayList = this.b;
        parcel.writeInt(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((udb) it.next()).writeToParcel(parcel, i);
        }
        udb udbVar = this.c;
        if (udbVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            udbVar.writeToParcel(parcel, i);
        }
    }
}
