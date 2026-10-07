package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class lkf extends hlf {
    public final long h;
    public final String i;
    public final List j;

    public lkf(long j, String str, List list, long j2) {
        super(j2);
        this.h = j;
        this.i = str;
        this.j = list;
    }

    @Override // defpackage.hlf
    public final ilf a() {
        return new mkf(this);
    }
}
