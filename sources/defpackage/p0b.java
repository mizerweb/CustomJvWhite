package defpackage;

import com.google.mlkit.common.MlKitException;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public class p0b {
    public static final int b = -1;
    private static final bo7 c = new bo7("ModelFileHelper", "");
    public static final String d = "com.google.mlkit.translate.models";
    public static final String e = "com.google.mlkit.custom.models";
    static final String f = "com.google.mlkit.base.models";
    private final j0b a;

    public p0b(j0b j0bVar) {
        this.a = j0bVar;
    }

    private final File l(String str, u0b u0bVar, boolean z) throws MlKitException {
        File fileF = f(str, u0bVar, z);
        if (!fileF.exists()) {
            c.a("ModelFileHelper", "model folder does not exist, creating one: ".concat(String.valueOf(fileF.getAbsolutePath())));
            if (!fileF.mkdirs()) {
                throw new MlKitException("Failed to create model folder: ".concat(String.valueOf(fileF)), 13);
            }
        } else if (!fileF.isDirectory()) {
            throw new MlKitException("Can not create model folder, since an existing file has the same name: ".concat(String.valueOf(fileF)), 6);
        }
        return fileF;
    }

    public synchronized void a(u0b u0bVar, String str) {
        b(f(str, u0bVar, false));
        b(f(str, u0bVar, true));
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0029  */
    /* JADX WARN: Code duplicated, block: B:19:0x002f A[RETURN] */
    public boolean b(File file) {
        if (file != null) {
            if (file.isDirectory()) {
                File[] fileArrListFiles = file.listFiles();
                yab.s(fileArrListFiles);
                boolean z = true;
                for (File file2 : fileArrListFiles) {
                    z = z && b(file2);
                }
                if (z) {
                    if (file.delete()) {
                        return true;
                    }
                }
            } else if (file.delete()) {
                return true;
            }
        }
        return false;
    }

    public void c(String str, u0b u0bVar) throws MlKitException {
        File fileL = l(str, u0bVar, true);
        if (b(fileL)) {
            return;
        }
        c.b("ModelFileHelper", "Failed to delete the temp labels file directory: ".concat(String.valueOf(fileL != null ? fileL.getAbsolutePath() : null)));
    }

    public int d(File file) {
        File[] fileArrListFiles = file.listFiles();
        int iMax = -1;
        if (fileArrListFiles != null && (fileArrListFiles.length) != 0) {
            for (File file2 : fileArrListFiles) {
                try {
                    iMax = Math.max(iMax, Integer.parseInt(file2.getName()));
                } catch (NumberFormatException unused) {
                    c.a("ModelFileHelper", "Contains non-integer file name ".concat(String.valueOf(file2.getName())));
                }
            }
        }
        return iMax;
    }

    public File e(String str, u0b u0bVar) throws MlKitException {
        return l(str, u0bVar, false);
    }

    public File f(String str, u0b u0bVar, boolean z) {
        String str2;
        u0b u0bVar2 = u0b.UNKNOWN;
        int iOrdinal = u0bVar.ordinal();
        if (iOrdinal == 1) {
            str2 = f;
        } else if (iOrdinal == 2) {
            str2 = d;
        } else {
            if (iOrdinal != 4) {
                ore.p(c0a.o("Unknown model type ", u0bVar.name(), ". Cannot find a dir to store the downloaded model."));
                return null;
            }
            str2 = e;
        }
        File file = new File(this.a.b().getNoBackupFilesDir(), str2);
        if (z) {
            file = new File(file, "temp");
        }
        return new File(file, str);
    }

    public File g(String str, u0b u0bVar) throws MlKitException {
        return l(str, u0bVar, true);
    }

    public File h(String str, u0b u0bVar, String str2) throws MlKitException {
        File fileL = l(str, u0bVar, true);
        if (fileL.exists() && fileL.isFile() && !fileL.delete()) {
            throw new MlKitException("Failed to delete the temp labels file: ".concat(String.valueOf(fileL.getAbsolutePath())), 13);
        }
        if (!fileL.exists()) {
            c.a("ModelFileHelper", "Temp labels folder does not exist, creating one: ".concat(String.valueOf(fileL.getAbsolutePath())));
            if (!fileL.mkdirs()) {
                throw new MlKitException("Failed to create a directory to hold the AutoML model's labels file.", 13);
            }
        }
        return new File(fileL, str2);
    }

    public boolean i(String str, u0b u0bVar) throws MlKitException {
        String strK;
        if (u0bVar == u0b.UNKNOWN || (strK = k(str, u0bVar)) == null) {
            return false;
        }
        File file = new File(strK);
        if (!file.exists()) {
            return false;
        }
        File file2 = new File(file, mf4.a);
        c.d("ModelFileHelper", "Model file path: ".concat(String.valueOf(file2.getAbsolutePath())));
        return file2.exists();
    }

    public final File j(String str, u0b u0bVar) throws MlKitException {
        return l(str, u0bVar, true);
    }

    public final String k(String str, u0b u0bVar) throws MlKitException {
        File fileE = e(str, u0bVar);
        int iD = d(fileE);
        if (iD == -1) {
            return null;
        }
        return qt4.j(iD, fileE.getAbsolutePath(), "/");
    }
}
