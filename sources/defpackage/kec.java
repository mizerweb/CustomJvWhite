package defpackage;

import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public final class kec implements iii {
    public final String a;
    public final String b;
    public final String c;
    public final ny8 d;
    public final wze e;

    public kec(String str, String str2, String str3, ny8 ny8Var, wze wzeVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = ny8Var;
        this.e = wzeVar;
    }

    @Override // defpackage.iii
    public final xx6 a() {
        wec wecVar = (wec) this.d.getValue();
        return e9i.r(new hki(4, (lq4) null, this.a, wecVar, new File(this.b), new uhi(wecVar.a, wecVar.b, wecVar.c, wecVar.d, oji.VIDEO, this.c), this.e));
    }
}
