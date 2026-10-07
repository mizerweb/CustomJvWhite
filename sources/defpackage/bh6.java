package defpackage;

import android.content.Context;
import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public final class bh6 implements ch6 {
    public final String a;
    public final String b;

    public bh6(Context context) {
        context.getClass();
        String absolutePath = new File(context.getFilesDir(), zo5.j(System.currentTimeMillis(), "target_bitrate_dump_")).getAbsolutePath();
        absolutePath.getClass();
        this.a = absolutePath;
        this.b = absolutePath.concat(".log.json");
    }
}
