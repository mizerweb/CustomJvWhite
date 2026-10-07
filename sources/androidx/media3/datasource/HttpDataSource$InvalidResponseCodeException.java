package androidx.media3.datasource;

import defpackage.zo5;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class HttpDataSource$InvalidResponseCodeException extends HttpDataSource$HttpDataSourceException {
    public final int c;
    public final Map d;
    public final byte[] e;

    public HttpDataSource$InvalidResponseCodeException(int i, String str, DataSourceException dataSourceException, Map map, byte[] bArr) {
        super(zo5.h(i, "Response code: "), dataSourceException, 2004);
        this.c = i;
        this.d = map;
        this.e = bArr;
    }
}
