package defpackage;

import android.content.Context;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import java.io.File;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public abstract class oz8 {
    protected final p0b a;
    private final Context c;
    private final qjh b = new qjh();
    private final Executor d = zj9.g();

    public oz8(Context context, p0b p0bVar) {
        this.c = context;
        this.a = p0bVar;
    }

    public static void a(File file) {
        File[] fileArrListFiles = file.listFiles();
        if ((fileArrListFiles == null || fileArrListFiles.length == 0) && !file.delete()) {
            Log.e("MlKitLegacyMigration", "Error deleting model directory ".concat(String.valueOf(file)));
        }
    }

    public static boolean e(String str) {
        String[] strArrSplit = str.split("\\+", -1);
        if (strArrSplit.length == 2) {
            try {
                String str2 = strArrSplit[0];
                if (str2 != null) {
                    Base64.decode(str2, 11);
                }
                String str3 = strArrSplit[1];
                if (str3 == null) {
                    return true;
                }
                Base64.decode(str3, 11);
                return true;
            } catch (IllegalArgumentException unused) {
            }
        }
        return false;
    }

    public static void g(File file, File file2) {
        if (file.exists()) {
            if (!file2.exists() && !file.renameTo(file2)) {
                Log.e("MlKitLegacyMigration", "Error moving model file " + String.valueOf(file) + " to " + String.valueOf(file2));
            }
            if (!file.exists() || file.delete()) {
                return;
            }
            Log.e("MlKitLegacyMigration", "Error deleting model file ".concat(String.valueOf(file)));
        }
    }

    public abstract String b();

    public File c() {
        Context context = this.c;
        return new File(context.getNoBackupFilesDir(), b());
    }

    public Task d() {
        return this.b.a;
    }

    public abstract void f(File file);

    public void h() {
        this.d.execute(new Runnable() { // from class: nmk
            @Override // java.lang.Runnable
            public final void run() {
                this.a.i();
            }
        });
    }

    public final /* synthetic */ void i() {
        File fileC = c();
        File[] fileArrListFiles = fileC.listFiles();
        if (fileArrListFiles != null) {
            for (File file : fileArrListFiles) {
                f(file);
            }
            a(fileC);
        }
        this.b.b(null);
    }
}
