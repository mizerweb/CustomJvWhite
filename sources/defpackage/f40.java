package defpackage;

import android.system.ErrnoException;
import android.system.Os;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.http.HttpStatus;

/* JADX INFO: loaded from: classes.dex */
public final class f40 {
    public final String a;
    public final e40 b;
    public final File c;
    public final File d;
    public final File e;

    public f40(File file, gve gveVar) {
        this.b = gveVar == null ? e40.N : gveVar;
        this.c = file;
        this.d = new File(file.getPath() + ".new");
        this.e = new File(file.getPath() + ".bak");
        StringBuilder sb = new StringBuilder("AtomicFile-");
        sb.append(file.getName());
        this.a = sb.toString();
    }

    public final void a(FileOutputStream fileOutputStream) {
        String str = this.a;
        e40 e40Var = this.b;
        try {
            fileOutputStream.getFD().sync();
        } catch (IOException unused) {
            e40Var.error(str + ": Failed to sync file output stream", null);
        }
        try {
            fileOutputStream.close();
        } catch (IOException e) {
            e40Var.error(str + ": Failed to close file output stream", e);
        }
        File file = this.d;
        if (file.delete()) {
            return;
        }
        e40Var.error(str + ": Failed to delete new file " + file, null);
    }

    public final boolean b(FileOutputStream fileOutputStream) {
        boolean z;
        String str = this.a;
        e40 e40Var = this.b;
        boolean z2 = true;
        try {
            fileOutputStream.getFD().sync();
            z = true;
        } catch (IOException unused) {
            z = false;
        }
        try {
            fileOutputStream.close();
        } catch (IOException e) {
            e40Var.error(str + ": Failed to close file output stream", e);
            z2 = false;
        }
        File file = this.d;
        if (z && z2) {
            return e(file, this.c);
        }
        if (file.exists() && !file.delete()) {
            e40Var.error(str + ": Failed to delete incomplete new file " + file, null);
        }
        return false;
    }

    public final FileInputStream c() {
        File file = this.e;
        boolean zExists = file.exists();
        File file2 = this.c;
        if (zExists) {
            e(file, file2);
        }
        File file3 = this.d;
        boolean zExists2 = file3.exists();
        String str = this.a;
        e40 e40Var = this.b;
        if (zExists2 && file2.exists() && !file3.delete()) {
            e40Var.error(str + ": Failed to delete outdated new file " + file3, null);
        }
        try {
            if (file2.canRead()) {
                return new FileInputStream(file2);
            }
        } catch (Throwable th) {
            e40Var.error(str + ": Fail to create FileInputStream for file " + file2, th);
        }
        return null;
    }

    public final byte[] d() throws IOException {
        FileInputStream fileInputStreamC = c();
        if (fileInputStreamC == null) {
            return new byte[0];
        }
        try {
            byte[] bArr = new byte[fileInputStreamC.available()];
            int i = 0;
            while (true) {
                int i2 = fileInputStreamC.read(bArr, i, bArr.length - i);
                if (i2 <= 0) {
                    fileInputStreamC.close();
                    return bArr;
                }
                i += i2;
                int iAvailable = fileInputStreamC.available();
                if (iAvailable > bArr.length - i) {
                    byte[] bArr2 = new byte[iAvailable + i];
                    System.arraycopy(bArr, 0, bArr2, 0, i);
                    bArr = bArr2;
                }
            }
        } catch (Throwable th) {
            fileInputStreamC.close();
            throw th;
        }
    }

    public final boolean e(File file, File file2) {
        boolean z;
        boolean z2;
        boolean zIsDirectory = file2.isDirectory();
        String str = this.a;
        e40 e40Var = this.b;
        if (!zIsDirectory || file2.delete()) {
            z = true;
        } else {
            e40Var.error(str + ": Failed to delete file which is a directory " + file2, null);
            z = false;
        }
        if (file.renameTo(file2)) {
            z2 = true;
        } else {
            e40Var.error(str + ": Failed to rename " + file + " to " + file2, null);
            z2 = false;
        }
        return z && z2;
    }

    public final FileOutputStream f() {
        File file = this.e;
        if (file.exists()) {
            e(file, this.c);
        }
        File file2 = this.d;
        try {
            return new FileOutputStream(file2);
        } catch (FileNotFoundException unused) {
            File parentFile = file2.getParentFile();
            String str = this.a;
            e40 e40Var = this.b;
            if (parentFile == null) {
                e40Var.error(str + ": No parent directory for AtomicFile " + file2, null);
                return null;
            }
            if (!parentFile.mkdir()) {
                e40Var.error(str + "Couldn't create directory for AtomicFile " + file2, null);
                return null;
            }
            try {
                Os.chmod(parentFile.getAbsolutePath(), HttpStatus.SC_HTTP_VERSION_NOT_SUPPORTED);
            } catch (ErrnoException unused2) {
            }
            try {
                return new FileOutputStream(file2);
            } catch (FileNotFoundException e) {
                e40Var.error(str + ": Couldn't create AtomicFile " + file2, e);
                return null;
            }
        }
    }
}
