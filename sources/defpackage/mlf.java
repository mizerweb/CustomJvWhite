package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class mlf extends hlf {
    public final /* synthetic */ int h = 0;
    public final String i;
    public boolean j;
    public final Object k;

    public mlf(long j, String str, boolean z, List list) {
        super(j);
        this.i = str;
        this.j = z;
        this.k = list;
    }

    @Override // defpackage.hlf
    public final ilf a() {
        switch (this.h) {
            case 0:
                return new nlf(this);
            default:
                return new slf(this);
        }
    }

    public mlf(long j, String str, e70 e70Var) {
        super(j);
        this.i = str;
        this.k = e70Var;
    }
}
