package defpackage;

import android.net.Uri;
import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public final class p50 extends hb9 {
    public static final /* synthetic */ int m = 0;
    public e70 j;
    public File k;
    public Uri l;

    @Override // defpackage.hb9, defpackage.t2
    public final String a() {
        Uri uri = this.l;
        if (uri != null) {
            return String.valueOf(uri);
        }
        File file = this.k;
        if (file == null) {
            return super.a();
        }
        String path = file.getPath();
        if (path != null) {
            return path;
        }
        Uri uriD = d();
        if (uriD != null) {
            return uriD.getPath();
        }
        return null;
    }

    @Override // defpackage.hb9
    public final Uri d() {
        Uri uri = this.l;
        if (uri != null) {
            return uri;
        }
        Uri uriK = sb8.K(this.j.u);
        return uriK != null ? uriK : super.d();
    }
}
