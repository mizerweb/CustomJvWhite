package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class qwb extends kpe {
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;

    public /* synthetic */ qwb(String str, String str2, int i) {
        this.b = i;
        this.c = str;
        this.d = str2;
    }

    @Override // defpackage.kpe
    public final Object b(h5 h5Var) {
        switch (this.b) {
            case 0:
                return new i4c(this.c, this.d);
            default:
                return new g5c(this.c, this.d, (Context) h5Var.c(7), h5Var.d(678), h5Var.d(101), h5Var.d(69), h5Var.d(544), h5Var.d(205), h5Var.d(144), (ha9) h5Var.c(30));
        }
    }
}
