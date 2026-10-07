package defpackage;

import java.util.function.LongConsumer;
import one.me.chats.list.ChatsListWidget;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xh3 implements LongConsumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ v56 b;

    public /* synthetic */ xh3(v56 v56Var, int i) {
        this.a = i;
        this.b = v56Var;
    }

    @Override // java.util.function.LongConsumer
    public final void accept(long j) {
        int i = this.a;
        v56 v56Var = this.b;
        switch (i) {
            case 0:
                ChatsListWidget chatsListWidget = (ChatsListWidget) v56Var.b;
                zv8[] zv8VarArr = ChatsListWidget.X;
                rl3 rl3VarT1 = chatsListWidget.t1();
                tm3 tm3Var = rl3VarT1.B1;
                if (tm3Var == null || !tm3Var.b()) {
                    a8j.x(rl3VarT1.K1, zm3.k(zm3.b, j, d93.CHAT_LIST, rl3VarT1.d, 2));
                } else {
                    tm3Var.d(j);
                    gm0.Y(rl3VarT1.U1, "early return cuz of multiselect enabled");
                }
                break;
            case 1:
                ((iug) ((ChatsListWidget) v56Var.b).l.getValue()).C(j, null, gvg.OWNER);
                break;
            default:
                ChatsListWidget chatsListWidget2 = (ChatsListWidget) v56Var.b;
                zv8[] zv8VarArr2 = ChatsListWidget.X;
                rl3 rl3VarT2 = chatsListWidget2.t1();
                tm3 tm3Var2 = rl3VarT2.B1;
                if (tm3Var2 != null && tm3Var2.b()) {
                    tm3Var2.d(j);
                    gm0.Y(rl3VarT2.U1, "early return cuz of multiselect enabled");
                } else if (!((wd4) rl3VarT2.u1.getValue()).h()) {
                    rl3VarT2.Q();
                } else {
                    rl3VarT2.V1.B(rl3VarT2, rl3.Z1[2], a8j.t(rl3VarT2, ((n0c) rl3VarT2.h).a(), new f1j(rl3VarT2, j, (lq4) null, 6), 2));
                }
                break;
        }
    }
}
