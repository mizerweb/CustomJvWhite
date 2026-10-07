package defpackage;

import kotlin.collections.a;
import one.me.messages.list.ui.MessagesListWidget;

/* JADX INFO: loaded from: classes2.dex */
public final class cta implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesListWidget b;

    public /* synthetic */ cta(MessagesListWidget messagesListWidget, int i) {
        this.a = i;
        this.b = messagesListWidget;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        MessagesListWidget messagesListWidget = this.b;
        switch (i) {
            case 0:
                return pq3.j.k(messagesListWidget.getContext()).b;
            default:
                zv8[] zv8VarArr = MessagesListWidget.T1;
                g4b g4bVarJ = ((h4b) messagesListWidget.s.getValue()).J(2);
                jsa jsaVarF1 = messagesListWidget.F1();
                tlg tlgVar = (tlg) jsaVarF1.N2.getValue();
                Long lValueOf = tlgVar != null ? Long.valueOf(tlgVar.a) : null;
                if (lValueOf == null) {
                    jsaVarF1.b0().B(f4b.EMPTY_STICKER_ID, g4bVarJ);
                } else {
                    long j = jsaVarF1.c.a;
                    long jLongValue = lValueOf.longValue();
                    ae9.k((ae9) jsaVarF1.I1.getValue(), "sticker", "send_sticker", ouk.a(new ylc("screen", "first_message")), 8);
                    vkf vkfVar = new vkf(1, j, jLongValue);
                    vkfVar.g = g4bVarJ;
                    ((wzj) jsaVarF1.q1.getValue()).c(new wkf(vkfVar, (byte) 0));
                }
                ia8 ia8Var = (ia8) messagesListWidget.d.getAccessor().g().getValue();
                if (ia8Var != null) {
                    ia8Var.f(a.p1(new ha8[]{new ha8(fa8.SEND_5_MESSAGES, 1), new ha8(fa8.SEND_3_STICKERS, 1)}), y3f.CHAT);
                }
                return sbi.a;
        }
    }
}
