package defpackage;

import org.apache.http.HttpStatus;

/* JADX INFO: loaded from: classes.dex */
public final class di3 implements af7 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ h5 b;
    public final /* synthetic */ ifh c;
    public final /* synthetic */ Object d;

    public di3(ki3 ki3Var, h5 h5Var, ifh ifhVar) {
        this.d = ki3Var;
        this.b = h5Var;
        this.c = ifhVar;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        h5 h5Var = this.b;
        Object obj = this.d;
        switch (i) {
            case 0:
                ifh ifhVarD = h5Var.d(992);
                ifh ifhVarD2 = h5Var.d(54);
                wmi wmiVar = (wmi) h5Var.c(139);
                return new a83(this.c, (ifh) obj, ifhVarD, ifhVarD2, wmiVar);
            default:
                return new cn6((ki3) obj, h5Var.d(HttpStatus.SC_HTTP_VERSION_NOT_SUPPORTED), this.c);
        }
    }

    public di3(ifh ifhVar, ifh ifhVar2, h5 h5Var) {
        this.c = ifhVar;
        this.d = ifhVar2;
        this.b = h5Var;
    }
}
