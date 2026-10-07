package defpackage;

import one.me.chats.list.ChatsListWidget;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class we3 implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ xe3 b;
    public final /* synthetic */ h9h c;
    public final /* synthetic */ int d;

    public /* synthetic */ we3(xe3 xe3Var, h9h h9hVar, int i, int i2) {
        this.a = i2;
        this.b = xe3Var;
        this.c = h9hVar;
        this.d = i;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        int i = this.a;
        sbi sbiVar = sbi.a;
        int i2 = this.d;
        h9h h9hVar = this.c;
        xe3 xe3Var = this.b;
        switch (i) {
            case 0:
                ((Long) obj).getClass();
                ChatsListWidget chatsListWidget = xe3Var.f;
                long j = h9hVar.a;
                rl3 rl3VarT1 = chatsListWidget.t1();
                ((ss2) rl3VarT1.X.getValue()).a(i2, j);
                a8j.t(rl3VarT1, ((n0c) rl3VarT1.h).a(), new tk3(rl3VarT1, j, null, 1), 2);
                break;
            default:
                ChatsListWidget chatsListWidget2 = xe3Var.f;
                long j2 = h9hVar.a;
                String str = h9hVar.i;
                rl3 rl3VarT2 = chatsListWidget2.t1();
                ((ss2) rl3VarT2.X.getValue()).c(i2, j2);
                a8j.t(rl3VarT2, ((n0c) rl3VarT2.h).a(), new f1j(rl3VarT2, str, j2, (lq4) null, 5), 2);
                break;
        }
        return sbiVar;
    }
}
