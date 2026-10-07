package defpackage;

import android.os.StrictMode;
import com.facebook.soloader.SoLoader;
import com.facebook.soloader.d;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class mm5 extends rcg {
    public final File a;
    public final int b;
    public final List c = Arrays.asList(new String[0]);

    public mm5(File file, int i) {
        this.a = file;
        this.b = i;
    }

    @Override // defpackage.rcg
    public String b() {
        return "DirectorySoSource";
    }

    @Override // defpackage.rcg
    public final int c(String str, int i, StrictMode.ThreadPolicy threadPolicy) throws IOException {
        if (SoLoader.b == null) {
            ore.k("SoLoader.init() not yet called");
            return 0;
        }
        boolean zContains = this.c.contains(str);
        File file = this.a;
        if (zContains) {
            StringBuilder sbZ = zo5.z(str, " is on the denyList, skip loading from ");
            sbZ.append(file.getCanonicalPath());
            o7j.b("SoLoader", sbZ.toString());
            return 0;
        }
        File file2 = new File(file, str);
        if (!file2.exists()) {
            file2 = null;
        }
        if (file2 == null) {
            StringBuilder sbZ2 = zo5.z(str, " file not found on ");
            sbZ2.append(file.getCanonicalPath());
            o7j.j("SoLoader", sbZ2.toString());
            return 0;
        }
        String canonicalPath = file2.getCanonicalPath();
        o7j.b("SoLoader", str + " file found at " + canonicalPath);
        int i2 = i & 1;
        int i3 = this.b;
        if (i2 != 0 && (i3 & 2) != 0) {
            o7j.b("SoLoader", str + " loaded implicitly");
            return 2;
        }
        if ((i3 & 1) != 0) {
            u36 u36Var = new u36();
            u36Var.a = file2;
            FileInputStream fileInputStream = new FileInputStream(file2);
            u36Var.b = fileInputStream;
            u36Var.c = fileInputStream.getChannel();
            try {
                d.b(str, u36Var, i, threadPolicy);
                u36Var.close();
            } catch (Throwable th) {
                try {
                    u36Var.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } else {
            o7j.b("SoLoader", "Not resolving dependencies for " + str);
        }
        try {
            SoLoader.b.C(i, canonicalPath);
            return 1;
        } catch (UnsatisfiedLinkError e) {
            throw vql.b(str, e);
        }
    }

    @Override // defpackage.rcg
    public final String toString() {
        String name;
        File file = this.a;
        try {
            name = String.valueOf(file.getCanonicalPath());
        } catch (IOException unused) {
            name = file.getName();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(b());
        sb.append("[root = ");
        sb.append(name);
        sb.append(" flags = ");
        return qt4.p(sb, this.b, ']');
    }
}
