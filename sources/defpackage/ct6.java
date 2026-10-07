package defpackage;

import java.io.File;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class ct6 implements ohf {
    public final File a;
    public final int b = 2;

    public ct6(File file) {
        this.a = file;
    }

    @Override // defpackage.ohf
    public final Iterator iterator() {
        return new at6(this);
    }
}
