package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class kb9 implements Parcelable {
    public static final Parcelable.Creator<kb9> CREATOR = new v39(16);
    public final long a;
    public final Uri b;
    public final String c;
    public final int d;
    public final long e;
    public final Integer f;
    public final Long g;
    public final int h;
    public final int i;
    public final long j;
    public final Uri k;
    public final jb9 l;

    public kb9(long j, Uri uri, String str, int i, long j2, Integer num, Long l, int i2, int i3, long j3, Uri uri2) {
        Object next;
        jb9 jb9Var;
        this.a = j;
        this.b = uri;
        this.c = str;
        this.d = i;
        this.e = j2;
        this.f = num;
        this.g = l;
        this.h = i2;
        this.i = i3;
        this.j = j3;
        this.k = uri2;
        y1 y1Var = new y1(0, sya.m);
        do {
            if (!y1Var.hasNext()) {
                next = null;
                break;
            }
            next = y1Var.next();
        } while (!((sya) next).a.equalsIgnoreCase(str));
        sya syaVar = (sya) next;
        switch ((syaVar == null ? sya.UNKNOWN : syaVar).ordinal()) {
            case 1:
            case 2:
            case 5:
            case 6:
            case 7:
            case 8:
                jb9Var = jb9.b;
                break;
            case 3:
            default:
                jb9Var = jb9.a;
                break;
            case 4:
                jb9Var = jb9.c;
                break;
            case 9:
            case 10:
                jb9Var = jb9.d;
                break;
        }
        this.l = jb9Var;
    }

    public static kb9 a(kb9 kb9Var, Uri uri, Long l, int i, int i2, int i3) {
        long j = kb9Var.a;
        Uri uri2 = (i3 & 2) != 0 ? kb9Var.b : uri;
        return new kb9(j, uri2, kb9Var.c, kb9Var.d, kb9Var.e, kb9Var.f, (i3 & 64) != 0 ? kb9Var.g : l, (i3 & np0.m) != 0 ? kb9Var.h : i, (i3 & np0.n) != 0 ? kb9Var.i : i2, kb9Var.j, kb9Var.k);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kb9)) {
            return false;
        }
        kb9 kb9Var = (kb9) obj;
        return this.a == kb9Var.a && cqk.d(this.b, kb9Var.b) && cqk.d(this.c, kb9Var.c) && this.d == kb9Var.d && this.e == kb9Var.e && cqk.d(this.f, kb9Var.f) && cqk.d(this.g, kb9Var.g) && this.h == kb9Var.h && this.i == kb9Var.i && this.j == kb9Var.j && cqk.d(this.k, kb9Var.k);
    }

    public final int hashCode() {
        int iG = qt4.g(zo5.c(this.d, zo5.d((this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31, 31, this.c), 31), 31, this.e);
        Integer num = this.f;
        int iHashCode = (iG + (num == null ? 0 : num.hashCode())) * 31;
        Long l = this.g;
        return this.k.hashCode() + qt4.g(zo5.c(this.i, zo5.c(this.h, (iHashCode + (l != null ? l.hashCode() : 0)) * 31, 31), 31), 31, this.j);
    }

    public final String toString() {
        Object obj = gm0.c() ? this.b : "*****";
        Object obj2 = gm0.c() ? this.k : "*****";
        StringBuilder sb = new StringBuilder("LocalMediaItem(id=");
        sb.append(this.a);
        sb.append(", uri=");
        sb.append(obj);
        sb.append(", mimeType='");
        sb.append(this.c);
        sb.append("', albumId=");
        sb.append(this.d);
        qt4.z(this.e, ", dateTaken=", ", orientation=", sb);
        sb.append(this.f);
        sb.append(", duration=");
        sb.append(this.g);
        sb.append(", width=");
        qt4.x(this.h, this.i, ", height=", ", size=", sb);
        sb.append(this.j);
        sb.append(", thumbnailUri=");
        sb.append(obj2);
        sb.append(", type=");
        sb.append(this.l);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeParcelable(this.b, i);
        parcel.writeString(this.c);
        parcel.writeInt(this.d);
        parcel.writeLong(this.e);
        Integer num = this.f;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Long l = this.g;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeInt(this.h);
        parcel.writeInt(this.i);
        parcel.writeLong(this.j);
        parcel.writeParcelable(this.k, i);
    }

    public /* synthetic */ kb9(long j, Uri uri, String str, int i, long j2, Integer num, Long l, Uri uri2, int i2) {
        this(j, uri, str, i, j2, num, (i2 & 64) != 0 ? null : l, 0, 0, 0L, uri2);
    }
}
