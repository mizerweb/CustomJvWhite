package defpackage;

import java.io.File;
import java.io.FilenameFilter;

/* JADX INFO: loaded from: classes2.dex */
public final class rab implements FilenameFilter {
    public final /* synthetic */ int a;

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        switch (this.a) {
            case 0:
                return str.startsWith("liblz4-java-") && !str.endsWith(".lck");
            default:
                return (str.equals("dso_state") || str.equals("dso_lock") || str.equals("dso_deps")) ? false : true;
        }
    }
}
