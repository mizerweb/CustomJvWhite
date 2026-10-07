package defpackage;

import java.io.File;

/* JADX INFO: loaded from: classes4.dex */
public final class xs6 extends ws6 {
    public boolean b;
    public File[] c;
    public int d;
    public boolean e;

    public xs6(at6 at6Var, File file) {
        super(file);
    }

    @Override // defpackage.bt6
    public final File a() {
        int i;
        boolean z = this.e;
        File file = this.a;
        if (!z && this.c == null) {
            File[] fileArrListFiles = file.listFiles();
            this.c = fileArrListFiles;
            if (fileArrListFiles == null) {
                this.e = true;
            }
        }
        File[] fileArr = this.c;
        if (fileArr != null && (i = this.d) < fileArr.length) {
            this.d = i + 1;
            return fileArr[i];
        }
        if (this.b) {
            return null;
        }
        this.b = true;
        return file;
    }
}
