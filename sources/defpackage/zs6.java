package defpackage;

import java.io.File;

/* JADX INFO: loaded from: classes4.dex */
public final class zs6 extends ws6 {
    public boolean b;
    public File[] c;
    public int d;

    public zs6(at6 at6Var, File file) {
        super(file);
    }

    @Override // defpackage.bt6
    public final File a() {
        boolean z = this.b;
        File file = this.a;
        if (!z) {
            this.b = true;
            return file;
        }
        File[] fileArr = this.c;
        if (fileArr != null && this.d >= fileArr.length) {
            return null;
        }
        if (fileArr == null) {
            File[] fileArrListFiles = file.listFiles();
            this.c = fileArrListFiles;
            if (fileArrListFiles == null || fileArrListFiles.length == 0) {
                return null;
            }
        }
        File[] fileArr2 = this.c;
        int i = this.d;
        this.d = i + 1;
        return fileArr2[i];
    }
}
