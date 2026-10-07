package defpackage;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class yb9 extends ya9 {
    public final Resources c;

    public yb9(Executor executor, qg7 qg7Var, Resources resources) {
        super(executor, qg7Var);
        this.c = resources;
    }

    @Override // defpackage.ya9
    public final p76 d(v78 v78Var) {
        int length;
        Uri uri = v78Var.b;
        String path = uri.getPath();
        AssetFileDescriptor assetFileDescriptor = null;
        if (path == null) {
            ore.k("Required value was null.");
            return null;
        }
        int i = Integer.parseInt(path.substring(1));
        Resources resources = this.c;
        InputStream inputStreamOpenRawResource = resources.openRawResource(i);
        try {
            String path2 = uri.getPath();
            if (path2 == null) {
                throw new IllegalStateException("Required value was null.");
            }
            AssetFileDescriptor assetFileDescriptorOpenRawResourceFd = resources.openRawResourceFd(Integer.parseInt(path2.substring(1)));
            length = (int) assetFileDescriptorOpenRawResourceFd.getLength();
            try {
                assetFileDescriptorOpenRawResourceFd.close();
            } catch (IOException unused) {
            }
            return c(inputStreamOpenRawResource, length);
        } catch (Resources.NotFoundException unused2) {
            if (0 != 0) {
                try {
                    assetFileDescriptor.close();
                } catch (IOException unused3) {
                }
            }
            length = -1;
        } catch (Throwable th) {
            if (0 != 0) {
                try {
                    assetFileDescriptor.close();
                } catch (IOException unused4) {
                }
            }
            throw th;
        }
    }

    @Override // defpackage.ya9
    public final String e() {
        return "LocalResourceFetchProducer";
    }
}
