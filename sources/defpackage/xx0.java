package defpackage;

import android.net.Uri;

/* JADX INFO: loaded from: classes4.dex */
public interface xx0 {
    boolean c(String str);

    e89 n(Uri uri);

    default e89 o(b0a b0aVar) {
        byte[] bArr = b0aVar.k;
        if (bArr != null) {
            return p(bArr);
        }
        Uri uri = b0aVar.m;
        if (uri != null) {
            return n(uri);
        }
        return null;
    }

    e89 p(byte[] bArr);
}
