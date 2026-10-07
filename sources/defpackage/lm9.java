package defpackage;

import java.util.List;
import one.me.messages.list.loader.MessageModel;
import ru.ok.tamtam.messages.c;

/* JADX INFO: loaded from: classes2.dex */
public final class lm9 {
    public rt2 a;
    public rt2 b;
    public int c;
    public sfa d;
    public MessageModel e;
    public c f;
    public List g = r66.a;

    public final mm9 a(cf7 cf7Var) {
        cf7Var.invoke(this);
        rt2 rt2Var = this.a;
        if (rt2Var == null) {
            ore.p("Required value was null.");
            return null;
        }
        rt2 rt2Var2 = this.b;
        int i = this.c;
        c cVar = this.f;
        if (cVar == null) {
            ore.p("Required value was null.");
            return null;
        }
        mm9 mm9Var = new mm9(rt2Var, rt2Var2, cVar, i);
        sfa sfaVar = this.d;
        if (sfaVar != null) {
            zv8 zv8Var = mm9.i[0];
            mm9Var.e.b = sfaVar;
        }
        MessageModel messageModel = this.e;
        if (messageModel != null) {
            zv8 zv8Var2 = mm9.i[1];
            mm9Var.f.b = messageModel;
        }
        List list = this.g;
        zv8 zv8Var3 = mm9.i[3];
        mm9Var.h.b = list;
        return mm9Var;
    }
}
