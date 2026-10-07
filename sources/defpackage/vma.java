package defpackage;

import one.me.sdk.messagewrite.MessageWriteWidget;

/* JADX INFO: loaded from: classes3.dex */
public final class vma implements xx6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ xx6 b;
    public final /* synthetic */ MessageWriteWidget c;

    public /* synthetic */ vma(r8e r8eVar, MessageWriteWidget messageWriteWidget, int i) {
        this.a = i;
        this.b = r8eVar;
        this.c = messageWriteWidget;
    }

    @Override // defpackage.xx6
    public final Object collect(yx6 yx6Var, lq4 lq4Var) {
        int i = this.a;
        sbi sbiVar = sbi.a;
        hu4 hu4Var = hu4.a;
        MessageWriteWidget messageWriteWidget = this.c;
        xx6 xx6Var = this.b;
        switch (i) {
            case 0:
                Object objCollect = xx6Var.collect(new uma(yx6Var, messageWriteWidget, 0), lq4Var);
                return objCollect == hu4Var ? objCollect : sbiVar;
            case 1:
                Object objCollect2 = xx6Var.collect(new uma(yx6Var, messageWriteWidget, 1), lq4Var);
                return objCollect2 == hu4Var ? objCollect2 : sbiVar;
            default:
                Object objCollect3 = xx6Var.collect(new uma(yx6Var, messageWriteWidget, 2), lq4Var);
                return objCollect3 == hu4Var ? objCollect3 : sbiVar;
        }
    }
}
