package defpackage;

import org.apache.http.HttpStatus;

/* JADX INFO: loaded from: classes.dex */
public final class hi3 {
    public final /* synthetic */ h5 a;

    public hi3(h5 h5Var) {
        this.a = h5Var;
    }

    public final b00 a(String str) {
        h5 h5Var = this.a;
        int i = 2;
        ifh ifhVar = new ifh(new ic1(h5Var, i));
        sy4 sy4Var = (sy4) h5Var.c(226);
        ki3 ki3Var = new ki3();
        ki3Var.a = str;
        ki3Var.b = sy4Var;
        ki3Var.c = new jz(sy4Var.j(str), 13);
        ifh ifhVar2 = new ifh(new di3(new ifh(new fi3(h5Var, 0, ki3Var)), ifhVar, h5Var));
        ifh ifhVar3 = new ifh(new di3(ki3Var, h5Var, ifhVar2));
        qg7 qg7Var = new qg7("ChatsListLoader:".concat(str), i, new gi3(h5Var, 0));
        v2a v2aVar = new v2a(ki3Var, 13, h5Var);
        w17 w17Var = new w17((gq0) h5Var.c(169), ki3Var, h5Var.d(144), (xhh) h5Var.c(23));
        ifh ifhVarD = h5Var.d(HttpStatus.SC_HTTP_VERSION_NOT_SUPPORTED);
        u50 u50Var = new u50();
        u50Var.b = ki3Var;
        u50Var.a = ifhVarD;
        u50Var.c = ifhVar2;
        return new b00(str, qg7Var, u50Var, (xhh) h5Var.c(23), (yt4) h5Var.c(48), w17Var, (ij4) h5Var.c(286), (pa4) h5Var.c(738), ifhVar3, v2aVar, new ku6(15), h5Var.d(144), h5Var.d(226), h5Var.d(342), h5Var.d(54));
    }
}
