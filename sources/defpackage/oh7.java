package defpackage;

import android.net.Uri;

/* JADX INFO: loaded from: classes3.dex */
public final class oh7 implements k79 {
    public final nh7 a;
    public final Uri b;
    public final boolean c;
    public final long d;

    public oh7(nh7 nh7Var, Uri uri, boolean z) {
        this.a = nh7Var;
        this.b = uri;
        this.c = z;
        this.d = nh7Var.a.b().hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oh7)) {
            return false;
        }
        oh7 oh7Var = (oh7) obj;
        return this.a.equals(oh7Var.a) && cqk.d(this.b, oh7Var.b) && this.c == oh7Var.c;
    }

    @Override // defpackage.k79
    public final long getItemId() {
        return this.d;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Uri uri = this.b;
        return Boolean.hashCode(this.c) + ((iHashCode + (uri == null ? 0 : uri.hashCode())) * 31);
    }

    @Override // defpackage.k79
    /* JADX INFO: renamed from: j */
    public final int getF() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GalleryAlbumUiItem(album=");
        sb.append(this.a);
        sb.append(", cover=");
        sb.append(this.b);
        sb.append(", isSelected=");
        return qt4.r(sb, this.c, ")");
    }
}
