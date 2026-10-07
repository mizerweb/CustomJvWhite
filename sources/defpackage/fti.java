package defpackage;

import android.net.Uri;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class fti implements yu3 {
    public static final fti n;
    public final long a;
    public final Uri b;
    public final int c;
    public final int d;
    public final int e;
    public final long f;
    public final long g;
    public final String h;
    public final Uri i;
    public final bne j;
    public final boolean k;
    public final boolean l;
    public final byte[] m;

    static {
        Uri uri = Uri.EMPTY;
        ghb ghbVar = ew5.b;
        n = new fti(0L, uri, -1, -1, -1, 0L, -1L, (String) null, (Uri) null, (bne) null, false, new byte[0], 3712);
    }

    public /* synthetic */ fti(long j, Uri uri, int i, int i2, int i3, long j2, long j3, String str, Uri uri2, bne bneVar, boolean z, byte[] bArr, int i4) {
        this(j, uri, i, i2, i3, j2, j3, (i4 & np0.m) != 0 ? null : str, uri2, (i4 & np0.o) != 0 ? null : bneVar, false, (i4 & np0.q) != 0 ? false : z, bArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fti)) {
            return false;
        }
        fti ftiVar = (fti) obj;
        return this.a == ftiVar.a && cqk.d(this.b, ftiVar.b) && this.c == ftiVar.c && this.d == ftiVar.d && this.e == ftiVar.e && ew5.f(this.f, ftiVar.f) && this.g == ftiVar.g && cqk.d(this.h, ftiVar.h) && cqk.d(this.i, ftiVar.i) && cqk.d(this.j, ftiVar.j) && this.k == ftiVar.k && this.l == ftiVar.l && cqk.d(this.m, ftiVar.m);
    }

    public final int hashCode() {
        int iC = zo5.c(this.e, zo5.c(this.d, zo5.c(this.c, (this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31, 31), 31), 31);
        ghb ghbVar = ew5.b;
        int iG = qt4.g(qt4.g(iC, 31, this.f), 31, this.g);
        String str = this.h;
        int iHashCode = (iG + (str == null ? 0 : str.hashCode())) * 31;
        Uri uri = this.i;
        int iHashCode2 = (iHashCode + (uri == null ? 0 : uri.hashCode())) * 31;
        bne bneVar = this.j;
        return Arrays.hashCode(this.m) + nbh.n(nbh.n((iHashCode2 + (bneVar != null ? bneVar.hashCode() : 0)) * 31, 31, this.k), 31, this.l);
    }

    @Override // defpackage.yu3
    public final String k() {
        return this.h;
    }

    @Override // defpackage.yu3
    public final boolean l() {
        return this.k;
    }

    public final String toString() {
        String strT = ew5.t(this.f);
        String string = Arrays.toString(this.m);
        StringBuilder sb = new StringBuilder("VideoAttachConfig(videoId=");
        sb.append(this.a);
        sb.append(", previewUri=");
        sb.append(this.b);
        zo5.C(this.c, this.d, ", width=", ", height=", sb);
        sb.append(", maxImageViewHeight=");
        sb.append(this.e);
        sb.append(", duration=");
        sb.append(strT);
        qt4.z(this.g, ", fileSize=", ", attachId=", sb);
        sb.append(this.h);
        sb.append(", lowResUri=");
        sb.append(this.i);
        sb.append(", previewResizeOptions=");
        sb.append(this.j);
        sb.append(", isAutoLoadImageDisabled=");
        sb.append(this.k);
        sb.append(", prefetchAvailable=");
        sb.append(this.l);
        sb.append(", audioData=");
        sb.append(string);
        sb.append(")");
        return sb.toString();
    }

    public fti(long j, Uri uri, int i, int i2, int i3, long j2, long j3, String str, Uri uri2, bne bneVar, boolean z, boolean z2, byte[] bArr) {
        this.a = j;
        this.b = uri;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = j2;
        this.g = j3;
        this.h = str;
        this.i = uri2;
        this.j = bneVar;
        this.k = z;
        this.l = z2;
        this.m = bArr;
    }
}
