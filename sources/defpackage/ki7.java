package defpackage;

import android.net.Uri;

/* JADX INFO: loaded from: classes3.dex */
public final class ki7 extends ni7 {
    public final boolean b;
    public final kb9 c;
    public final bne d;
    public final rvc e;
    public final fvi f;
    public final Uri g;
    public int h;
    public final boolean i;
    public final long j;
    public final int k;
    public final Uri l;
    public final boolean m;
    public final long n;

    public ki7(boolean z, kb9 kb9Var, bne bneVar, rvc rvcVar, fvi fviVar, Uri uri, int i, boolean z2, long j, int i2, Uri uri2, boolean z3) {
        super(10);
        this.b = z;
        this.c = kb9Var;
        this.d = bneVar;
        this.e = rvcVar;
        this.f = fviVar;
        this.g = uri;
        this.h = i;
        this.i = z2;
        this.j = j;
        this.k = i2;
        this.l = uri2;
        this.m = z3;
        Long l = kb9Var.g;
        this.n = l != null ? l.longValue() : 0L;
    }

    public static ki7 b(ki7 ki7Var, rvc rvcVar, fvi fviVar, Uri uri, int i, boolean z, int i2, Uri uri2, int i3) {
        boolean z2 = ki7Var.b;
        kb9 kb9Var = ki7Var.c;
        bne bneVar = ki7Var.d;
        rvc rvcVar2 = (i3 & 8) != 0 ? ki7Var.e : rvcVar;
        fvi fviVar2 = (i3 & 16) != 0 ? ki7Var.f : fviVar;
        Uri uri3 = (i3 & 32) != 0 ? ki7Var.g : uri;
        int i4 = (i3 & 64) != 0 ? ki7Var.h : i;
        boolean z3 = (i3 & np0.m) != 0 ? ki7Var.i : z;
        long j = ki7Var.j;
        int i5 = (i3 & np0.o) != 0 ? ki7Var.k : i2;
        Uri uri4 = (i3 & 1024) != 0 ? ki7Var.l : uri2;
        boolean z4 = ki7Var.m;
        ki7Var.getClass();
        return new ki7(z2, kb9Var, bneVar, rvcVar2, fviVar2, uri3, i4, z3, j, i5, uri4, z4);
    }

    @Override // defpackage.ni7
    public final Long a() {
        return Long.valueOf(this.j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ki7)) {
            return false;
        }
        ki7 ki7Var = (ki7) obj;
        return this.b == ki7Var.b && cqk.d(this.c, ki7Var.c) && cqk.d(this.d, ki7Var.d) && cqk.d(this.e, ki7Var.e) && cqk.d(this.f, ki7Var.f) && cqk.d(this.g, ki7Var.g) && this.h == ki7Var.h && this.i == ki7Var.i && this.j == ki7Var.j && this.k == ki7Var.k && cqk.d(this.l, ki7Var.l) && this.m == ki7Var.m;
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + ((this.c.hashCode() + (Boolean.hashCode(this.b) * 31)) * 31)) * 31;
        rvc rvcVar = this.e;
        int iHashCode2 = (iHashCode + (rvcVar == null ? 0 : rvcVar.hashCode())) * 31;
        fvi fviVar = this.f;
        int iHashCode3 = (iHashCode2 + (fviVar == null ? 0 : fviVar.hashCode())) * 31;
        Uri uri = this.g;
        return Boolean.hashCode(this.m) + ((this.l.hashCode() + zo5.c(this.k, qt4.g(nbh.n(zo5.c(this.h, (iHashCode3 + (uri != null ? uri.hashCode() : 0)) * 31, 31), 31, this.i), 31, this.j), 31)) * 31);
    }

    public final String toString() {
        int i = this.h;
        StringBuilder sb = new StringBuilder("Media(multiSelect=");
        sb.append(this.b);
        sb.append(", origin=");
        sb.append(this.c);
        sb.append(", resizeOptions=");
        sb.append(this.d);
        sb.append(", photoEditorOptions=");
        sb.append(this.e);
        sb.append(", videoConvertOptions=");
        sb.append(this.f);
        sb.append(", overlay=");
        sb.append(this.g);
        sb.append(", selectionNumber=");
        sb.append(i);
        sb.append(", enabled=");
        sb.append(this.i);
        sb.append(", id=");
        c0a.w(sb, this.j, ", rotation=", this.k);
        sb.append(", thumbnailUri=");
        sb.append(this.l);
        sb.append(", useExifThumbnail=");
        sb.append(this.m);
        sb.append(")");
        return sb.toString();
    }
}
