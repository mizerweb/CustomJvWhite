package defpackage;

import com.google.mlkit.common.MlKitException;
import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public final class kmk implements iie {
    private static final bo7 c = new bo7("CustomModelFileMover", "");
    private final String a;
    private final p0b b;

    public kmk(j0b j0bVar, String str) {
        this.a = str;
        this.b = new p0b(j0bVar);
    }

    private static boolean c(File file, File file2) {
        String absolutePath = file.getAbsolutePath();
        String absolutePath2 = file2.getAbsolutePath();
        if (file.renameTo(file2)) {
            c.a("CustomModelFileMover", nbh.w("Moved file from ", absolutePath, " to ", absolutePath2, " successfully"));
            file2.setExecutable(false);
            file2.setWritable(false);
            return true;
        }
        bo7 bo7Var = c;
        bo7Var.a("CustomModelFileMover", nbh.w("Move file to ", absolutePath2, " failed, remove the temp file ", absolutePath, "."));
        if (!file.delete()) {
            bo7Var.a("CustomModelFileMover", "Failed to delete the temp file: ".concat(String.valueOf(absolutePath)));
        }
        return false;
    }

    @Override // defpackage.iie
    public final File a(File file) throws MlKitException {
        File file2;
        p0b p0bVar = this.b;
        String str = this.a;
        u0b u0bVar = u0b.CUSTOM;
        File fileE = p0bVar.e(str, u0bVar);
        File file3 = new File(new File(fileE, String.valueOf(this.b.d(fileE) + 1)), mf4.a);
        File parentFile = file3.getParentFile();
        if (parentFile != null && !parentFile.exists()) {
            parentFile.mkdirs();
        }
        File file4 = null;
        if (!c(file, file3)) {
            return null;
        }
        File fileH = this.b.h(this.a, u0bVar, mf4.b);
        if (fileH.exists()) {
            file2 = new File(parentFile, mf4.b);
            if (!c(fileH, file2)) {
                return null;
            }
        } else {
            file2 = null;
        }
        File fileH2 = this.b.h(this.a, u0bVar, mf4.c);
        if (fileH2.exists()) {
            File file5 = new File(parentFile, mf4.c);
            if (!c(fileH2, file5)) {
                return null;
            }
            file4 = file5;
        }
        return (file2 == null && file4 == null) ? file3 : parentFile;
    }

    @Override // defpackage.iie
    public final File b() throws MlKitException {
        File fileE = this.b.e(this.a, u0b.CUSTOM);
        return new File(new File(fileE, String.valueOf(this.b.d(fileE) + 1)), mf4.a);
    }
}
