package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import androidx.core.content.FileProvider;
import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public final class rz8 implements v3f {
    public final Context b;
    public final poc c;
    public final lz8 d;

    public rz8(Context context, poc pocVar, lz8 lz8Var) {
        this.b = context;
        this.c = pocVar;
        this.d = lz8Var;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    @Override // defpackage.v3f
    public final Uri b(w3f w3fVar, String str) {
        File file;
        File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES);
        if (externalStoragePublicDirectory != null) {
            file = new File(externalStoragePublicDirectory.getAbsolutePath(), "MAX");
            if (!file.exists() && !file.mkdirs()) {
                file = null;
            }
        } else {
            file = null;
        }
        File file2 = new File(file, str);
        w3fVar.l(file2);
        Uri uriFromFile = Uri.fromFile(file2);
        v3f.a(this.b, uriFromFile);
        return uriFromFile;
    }

    @Override // defpackage.v3f
    public final Uri c(w3f w3fVar, String str) {
        poc pocVar = this.c;
        File file = new File(pocVar.a(), str);
        w3fVar.l(file);
        Context context = pocVar.a;
        return FileProvider.c(0, context, context.getPackageName() + ".provider").c(file);
    }

    @Override // defpackage.v3f
    public final lz8 e() {
        return this.d;
    }
}
