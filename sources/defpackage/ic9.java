package defpackage;

import java.io.File;
import java.io.FileFilter;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ic9 implements FileFilter {
    public final /* synthetic */ int a;

    @Override // java.io.FileFilter
    public final boolean accept(File file) {
        switch (this.a) {
            case 0:
                return z5h.K0(file.getName(), "locale_", false);
            case 1:
                return lu6.m0(file).equals("zip");
            default:
                return lu6.m0(file).equals("log");
        }
    }
}
