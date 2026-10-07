package defpackage;

import android.os.ParcelFileDescriptor;
import com.google.mlkit.common.MlKitException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class hie {
    private static final bo7 h = new bo7("RemoteModelFileManager", "");
    private final j0b a;
    private final String b;
    private final u0b c;
    private final w0b d;
    private final iie e;
    private final a0g f;
    private final p0b g;

    public hie(j0b j0bVar, fie fieVar, w0b w0bVar, p0b p0bVar, iie iieVar) {
        this.a = j0bVar;
        u0b u0bVarE = fieVar.e();
        this.c = u0bVarE;
        this.b = u0bVarE == u0b.TRANSLATE ? fieVar.d() : fieVar.f();
        this.d = w0bVar;
        this.f = a0g.g(j0bVar);
        this.g = p0bVar;
        this.e = iieVar;
    }

    public File a(boolean z) {
        return this.g.f(this.b, this.c, z);
    }

    public synchronized File b(ParcelFileDescriptor parcelFileDescriptor, String str, fie fieVar) throws MlKitException {
        File file;
        MlKitException mlKitException;
        w0b w0bVar;
        try {
            file = new File(this.g.j(this.b, this.c), "to_be_validated_model.tmp");
            w0b.a aVarA = null;
            try {
                ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    try {
                        byte[] bArr = new byte[np0.r];
                        while (true) {
                            int i = autoCloseInputStream.read(bArr);
                            if (i == -1) {
                                break;
                            }
                            fileOutputStream.write(bArr, 0, i);
                            try {
                                autoCloseInputStream.close();
                                throw th;
                            } catch (Throwable th) {
                                th.addSuppressed(th);
                                throw th;
                            }
                        }
                        fileOutputStream.getFD().sync();
                        fileOutputStream.close();
                        autoCloseInputStream.close();
                        boolean zD = v0b.d(file, str);
                        if (zD && (w0bVar = this.d) != null) {
                            aVarA = w0bVar.a(file, fieVar);
                            if (aVarA.a().equals(w0b.a.EnumC0006a.TFLITE_VERSION_INCOMPATIBLE)) {
                                String strA = p44.a(this.a.b());
                                this.f.n(fieVar, str, strA);
                                String strValueOf = String.valueOf(str);
                                bo7 bo7Var = h;
                                bo7Var.a("RemoteModelFileManager", "Model is not compatible. Model hash: ".concat(strValueOf));
                                bo7Var.a("RemoteModelFileManager", "The current app version is: ".concat(String.valueOf(strA)));
                            }
                        }
                        if (zD && (aVarA == null || aVarA.c())) {
                        }
                        if (zD) {
                            mlKitException = new MlKitException("Model is not compatible with TFLite run time", 100);
                        } else {
                            h.a("RemoteModelFileManager", "Hash does not match with expected: ".concat(String.valueOf(str)));
                            f6m.f().c(wze.l(), fieVar, ytl.MODEL_HASH_MISMATCH, true, this.c, tul.SUCCEEDED);
                            mlKitException = new MlKitException("Hash does not match with expected", 102);
                        }
                        if (file.delete()) {
                            throw mlKitException;
                        }
                        h.a("RemoteModelFileManager", "Failed to delete the temp file: ".concat(String.valueOf(file.getAbsolutePath())));
                        throw mlKitException;
                    } catch (Throwable th2) {
                        try {
                            fileOutputStream.close();
                            throw th2;
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                            throw th2;
                        }
                    }
                } catch (Throwable th4) {
                    autoCloseInputStream.close();
                    throw th4;
                }
            } catch (IOException e) {
                h.b("RemoteModelFileManager", "Failed to copy downloaded model file to private folder: ".concat(e.toString()));
                return null;
            }
        } catch (Throwable th5) {
            throw th5;
        }
        return this.e.a(file);
    }

    public final synchronized File c(File file) throws MlKitException {
        File file2 = new File(String.valueOf(this.g.e(this.b, this.c).getAbsolutePath()).concat("/0"));
        if (file2.exists()) {
            return file;
        }
        return file.renameTo(file2) ? file2 : file;
    }

    public final synchronized String d() throws MlKitException {
        return this.g.k(this.b, this.c);
    }

    public final synchronized void e(File file) {
        File[] fileArrListFiles;
        File fileA = a(false);
        if (fileA.exists() && (fileArrListFiles = fileA.listFiles()) != null) {
            for (File file2 : fileArrListFiles) {
                if (file2.equals(file)) {
                    this.g.b(file);
                    return;
                }
            }
        }
    }

    public final synchronized boolean f(File file) throws MlKitException {
        File fileE = this.g.e(this.b, this.c);
        if (!fileE.exists()) {
            return false;
        }
        File[] fileArrListFiles = fileE.listFiles();
        boolean z = true;
        if (fileArrListFiles == null) {
            return true;
        }
        for (File file2 : fileArrListFiles) {
            if (!file2.equals(file) && !this.g.b(file2)) {
                z = false;
            }
        }
        return z;
    }
}
