package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class pkc implements k79, Parcelable {
    public static final Parcelable.Creator<pkc> CREATOR = new p8c(13);
    public final long a;
    public final czg b;
    public final Long c;
    public final azg d;

    public pkc(long j, czg czgVar, Long l) {
        this.a = j;
        this.b = czgVar;
        this.c = l;
        this.d = czgVar.a();
    }

    @Override // defpackage.k79
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public final boolean m(k79 k79Var) {
        if (!(k79Var instanceof pkc)) {
            return false;
        }
        pkc pkcVar = (pkc) k79Var;
        return cqk.d(this.b, pkcVar.b) && cqk.d(this.c, pkcVar.c);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pkc)) {
            return false;
        }
        pkc pkcVar = (pkc) obj;
        return this.a == pkcVar.a && cqk.d(this.b, pkcVar.b) && cqk.d(this.c, pkcVar.c);
    }

    @Override // defpackage.k79
    public final long getItemId() {
        return this.a;
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31;
        Long l = this.c;
        return iHashCode + (l == null ? 0 : l.hashCode());
    }

    @Override // defpackage.k79
    /* JADX INFO: renamed from: j */
    public final int getF() {
        return R.id.oneme_stories_viewer_item_view_type;
    }

    public final String toString() {
        return "OwnerStoriesItem(itemId=" + this.a + ", ownerParcel=" + this.b + ", storyIdFilter=" + this.c + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        this.b.writeToParcel(parcel, i);
        Long l = this.c;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
    }
}
