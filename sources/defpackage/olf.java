package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class olf extends hlf {
    public final String h;
    public final long i;
    public final azg j;
    public final List k;

    public olf(long j, String str, long j2, azg azgVar, List list) {
        super(j);
        this.h = str;
        this.i = j2;
        this.j = azgVar;
        this.k = list;
    }

    @Override // defpackage.hlf
    public final ilf a() {
        return new plf(this);
    }
}
