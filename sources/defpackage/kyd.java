package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class kyd implements yx6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ yx6 b;
    public final /* synthetic */ sfe c;
    public final /* synthetic */ q8e d;

    public /* synthetic */ kyd(sfe sfeVar, q8e q8eVar, yx6 yx6Var, int i) {
        this.a = i;
        this.c = sfeVar;
        this.d = q8eVar;
        this.b = yx6Var;
    }

    @Override // defpackage.yx6
    public final Object emit(Object obj, lq4 lq4Var) {
        int i = this.a;
        hu4 hu4Var = hu4.a;
        yx6 yx6Var = this.b;
        q8e q8eVar = this.d;
        sfe sfeVar = this.c;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                if (sfeVar.a) {
                    sfeVar.a = false;
                    if (q8eVar.a.d().contains(obj)) {
                    }
                }
                Object objEmit = yx6Var.emit(obj, lq4Var);
                return objEmit == hu4Var ? objEmit : sbiVar;
            default:
                if (sfeVar.a) {
                    sfeVar.a = false;
                    if (q8eVar.a.d().contains(obj) && !(((ynj) obj) instanceof unj)) {
                        return sbiVar;
                    }
                }
                Object objEmit2 = yx6Var.emit(obj, lq4Var);
                return objEmit2 == hu4Var ? objEmit2 : sbiVar;
        }
    }
}
