package defpackage;

import android.net.Uri;
import android.util.Base64;
import androidx.media3.common.ParserException;
import androidx.media3.datasource.DataSourceException;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes2.dex */
public final class r25 extends pq0 {
    public a35 e;
    public byte[] f;
    public int g;
    public int h;

    @Override // defpackage.u25
    public final void close() {
        if (this.f != null) {
            this.f = null;
            b();
        }
        this.e = null;
    }

    @Override // defpackage.u25
    public final long f(a35 a35Var) throws ParserException, DataSourceException {
        c(a35Var);
        this.e = a35Var;
        Uri uri = a35Var.a;
        long j = a35Var.g;
        Uri uriNormalizeScheme = uri.normalizeScheme();
        String scheme = uriNormalizeScheme.getScheme();
        lvb.S("data".equals(scheme), "Unsupported scheme: %s", scheme);
        String schemeSpecificPart = uriNormalizeScheme.getSchemeSpecificPart();
        String str = vqi.a;
        String[] strArrSplit = schemeSpecificPart.split(",", -1);
        if (strArrSplit.length != 2) {
            throw new ParserException(zo5.l(uriNormalizeScheme, "Unexpected URI format: "), null, true, 0);
        }
        String str2 = strArrSplit[1];
        if (strArrSplit[0].contains(";base64")) {
            try {
                this.f = Base64.decode(str2, 0);
            } catch (IllegalArgumentException e) {
                throw new ParserException(qv1.k("Error while parsing Base64 encoded string: ", str2), e, true, 0);
            }
        } else {
            this.f = URLDecoder.decode(str2, StandardCharsets.US_ASCII.name()).getBytes(StandardCharsets.UTF_8);
        }
        long j2 = a35Var.f;
        byte[] bArr = this.f;
        if (j2 > bArr.length) {
            this.f = null;
            throw new DataSourceException(2008);
        }
        int i = (int) j2;
        this.g = i;
        int length = bArr.length - i;
        this.h = length;
        if (j != -1) {
            this.h = (int) Math.min(length, j);
        }
        d(a35Var);
        return j != -1 ? j : this.h;
    }

    @Override // defpackage.u25
    public final Uri getUri() {
        a35 a35Var = this.e;
        if (a35Var != null) {
            return a35Var.a;
        }
        return null;
    }

    @Override // defpackage.q25
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.h;
        if (i3 == 0) {
            return -1;
        }
        int iMin = Math.min(i2, i3);
        byte[] bArr2 = this.f;
        String str = vqi.a;
        System.arraycopy(bArr2, this.g, bArr, i, iMin);
        this.g += iMin;
        this.h -= iMin;
        a(iMin);
        return iMin;
    }
}
