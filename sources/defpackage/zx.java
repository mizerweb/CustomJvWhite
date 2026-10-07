package defpackage;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import androidx.media3.datasource.AssetDataSource$AssetDataSourceException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
public final class zx extends pq0 {
    public final AssetManager e;
    public Uri f;
    public InputStream g;
    public long h;
    public boolean i;

    public zx(Context context) {
        super(false);
        this.e = context.getAssets();
    }

    @Override // defpackage.u25
    public final void close() {
        this.f = null;
        try {
            try {
                InputStream inputStream = this.g;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.g = null;
                if (this.i) {
                    this.i = false;
                    b();
                }
            } catch (IOException e) {
                throw new AssetDataSource$AssetDataSourceException(e, 2000);
            }
        } catch (Throwable th) {
            this.g = null;
            if (this.i) {
                this.i = false;
                b();
            }
            throw th;
        }
    }

    @Override // defpackage.u25
    public final long f(a35 a35Var) throws AssetDataSource$AssetDataSourceException {
        try {
            Uri uri = a35Var.a;
            long j = a35Var.f;
            this.f = uri;
            String path = uri.getPath();
            path.getClass();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            c(a35Var);
            InputStream inputStreamOpen = this.e.open(path, 1);
            this.g = inputStreamOpen;
            if (inputStreamOpen.skip(j) < j) {
                throw new AssetDataSource$AssetDataSourceException(null, 2008);
            }
            long j2 = a35Var.g;
            if (j2 != -1) {
                this.h = j2;
            } else {
                long jAvailable = this.g.available();
                this.h = jAvailable;
                if (jAvailable == 2147483647L) {
                    this.h = -1L;
                }
            }
            this.i = true;
            d(a35Var);
            return this.h;
        } catch (AssetDataSource$AssetDataSourceException e) {
            throw e;
        } catch (IOException e2) {
            throw new AssetDataSource$AssetDataSourceException(e2, e2 instanceof FileNotFoundException ? 2005 : 2000);
        }
    }

    @Override // defpackage.u25
    public final Uri getUri() {
        return this.f;
    }

    @Override // defpackage.q25
    public final int read(byte[] bArr, int i, int i2) throws AssetDataSource$AssetDataSourceException {
        if (i2 == 0) {
            return 0;
        }
        long j = this.h;
        if (j != 0) {
            if (j != -1) {
                try {
                    i2 = (int) Math.min(j, i2);
                } catch (IOException e) {
                    throw new AssetDataSource$AssetDataSourceException(e, 2000);
                }
            }
            InputStream inputStream = this.g;
            String str = vqi.a;
            int i3 = inputStream.read(bArr, i, i2);
            if (i3 != -1) {
                long j2 = this.h;
                if (j2 != -1) {
                    this.h = j2 - ((long) i3);
                }
                a(i3);
                return i3;
            }
        }
        return -1;
    }
}
