package defpackage;

import one.me.messages.list.loader.MessageModel;
import one.me.messages.list.ui.MessagesListWidget;

/* JADX INFO: loaded from: classes4.dex */
public final class vsa extends iub {
    public final /* synthetic */ MessagesListWidget c;

    public vsa(MessagesListWidget messagesListWidget) {
        this.c = messagesListWidget;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0090  */
    @Override // defpackage.iub
    public final void c(int i, int i2) {
        MessageModel messageModelQ;
        i6f i6fVar;
        MessagesListWidget messagesListWidget = this.c;
        zv8[] zv8VarArr = MessagesListWidget.T1;
        jsa jsaVarF1 = messagesListWidget.F1();
        MessagesListWidget messagesListWidget2 = this.c;
        k79 k79Var = (k79) ww3.u1(i, messagesListWidget2.H.d.f);
        lq4 lq4Var = null;
        if (k79Var instanceof MessageModel) {
            messageModelQ = (MessageModel) k79Var;
        } else {
            messageModelQ = k79Var instanceof yx2 ? messagesListWidget2.H.Q(i + 1) : null;
        }
        MessageModel messageModelQ2 = this.c.H.Q(i2);
        if (jsaVarF1.d.a() || ((Boolean) jsaVarF1.I2.getValue()).booleanValue()) {
            String str = jsaVarF1.v;
            a4c a4cVar = gm0.f;
            if (a4cVar == null) {
                return;
            }
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "reactions read mark not supported for comments or in chat preview", null);
                return;
            }
            return;
        }
        if (messageModelQ == null || messageModelQ2 == null) {
            return;
        }
        fva fvaVarG0 = jsaVarF1.g0();
        long j = messageModelQ.c;
        long j2 = messageModelQ2.c;
        mjg mjgVar = fvaVarG0.s;
        i6f i6fVar2 = ((j6f) mjgVar.getValue()).d;
        if (i6fVar2 == null) {
            i6fVar = null;
        } else {
            long j3 = i6fVar2.b;
            if (j > j3 || j3 > j2) {
                i6fVar = null;
            } else {
                i6fVar = ((j6f) mjgVar.getValue()).d;
                if (i6fVar != null) {
                    mjgVar.j(null, j6f.a((j6f) mjgVar.getValue(), 0, false, false, null, false, 23));
                }
            }
        }
        if (i6fVar == null) {
            return;
        }
        yab.i0(jsaVarF1.b, ((n0c) jsaVarF1.j).b(), 0, new wz6(jsaVarF1, i6fVar, lq4Var, 14), 2);
    }
}
