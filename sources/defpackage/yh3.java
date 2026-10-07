package defpackage;

import java.util.function.ObjLongConsumer;
import one.me.chats.list.ChatsListWidget;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yh3 implements ObjLongConsumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ v56 b;

    public /* synthetic */ yh3(v56 v56Var, int i) {
        this.a = i;
        this.b = v56Var;
    }

    @Override // java.util.function.ObjLongConsumer
    public final void accept(Object obj, long j) {
        int i = this.a;
        v56 v56Var = this.b;
        switch (i) {
            case 0:
                ChatsListWidget chatsListWidget = (ChatsListWidget) v56Var.b;
                zv8[] zv8VarArr = ChatsListWidget.X;
                rl3 rl3VarT1 = chatsListWidget.t1();
                tm3 tm3Var = rl3VarT1.B1;
                if (tm3Var == null) {
                    rl3VarT1.N(j);
                    break;
                } else if (!tm3Var.b()) {
                    tm3Var.d(j);
                    break;
                }
                break;
            default:
                ChatsListWidget chatsListWidget2 = (ChatsListWidget) v56Var.b;
                zv8[] zv8VarArr2 = ChatsListWidget.X;
                rl3 rl3VarT2 = chatsListWidget2.t1();
                tm3 tm3Var2 = rl3VarT2.B1;
                if (tm3Var2 == null || !tm3Var2.b()) {
                    if (!((Boolean) ((e5d) rl3VarT2.n.getValue()).Q6.a(e5d.S6[412]).i()).booleanValue()) {
                        rl3VarT2.N(j);
                    } else {
                        a8j.x(rl3VarT2.K1, new dk8(zm3.j(zm3.b, j, "local", null, null, null, null, d93.CHAT_LIST, rl3VarT2.d, 508)));
                    }
                }
                break;
        }
    }
}
