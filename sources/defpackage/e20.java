package defpackage;

import one.me.messages.list.loader.MessageModel;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class e20 implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ p20 b;

    public /* synthetic */ e20(p20 p20Var, int i) {
        this.a = i;
        this.b = p20Var;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        boolean zL;
        int i = this.a;
        p20 p20Var = this.b;
        MessageModel messageModel = (MessageModel) obj;
        switch (i) {
            case 0:
                zL = p20Var.l(messageModel);
                break;
            default:
                zL = p20Var.l(messageModel);
                break;
        }
        return Boolean.valueOf(zL);
    }
}
