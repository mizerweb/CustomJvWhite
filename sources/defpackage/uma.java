package defpackage;

import one.me.sdk.messagewrite.MessageWriteWidget;

/* JADX INFO: loaded from: classes3.dex */
public final class uma implements yx6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ yx6 b;
    public final /* synthetic */ MessageWriteWidget c;

    public /* synthetic */ uma(yx6 yx6Var, MessageWriteWidget messageWriteWidget, int i) {
        this.a = i;
        this.b = yx6Var;
        this.c = messageWriteWidget;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:86:0x014a  */
    /* JADX WARN: Code duplicated, block: B:9:0x0024  */
    @Override // defpackage.yx6
    public final Object emit(Object obj, lq4 lq4Var) {
        tma tmaVar;
        wma wmaVar;
        xma xmaVar;
        switch (this.a) {
            case 0:
                je9 je9Var = je9.d;
                if (lq4Var instanceof tma) {
                    tmaVar = (tma) lq4Var;
                    int i = tmaVar.e;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        tmaVar.e = i - Integer.MIN_VALUE;
                    } else {
                        tmaVar = new tma(this, lq4Var);
                    }
                } else {
                    tmaVar = new tma(this, lq4Var);
                }
                Object obj2 = tmaVar.d;
                hu4 hu4Var = hu4.a;
                int i2 = tmaVar.e;
                if (i2 == 0) {
                    ch3.d0(obj2);
                    yx6 yx6Var = this.b;
                    boolean z = ((lla) obj) == null;
                    MessageWriteWidget messageWriteWidget = this.c;
                    zv8[] zv8VarArr = MessageWriteWidget.I;
                    boolean z2 = messageWriteWidget.A1().K.a.getValue() != null;
                    boolean z3 = this.c.A1().p1.a.getValue() != null;
                    String str = this.c.a;
                    a4c a4cVar = gm0.f;
                    if (a4cVar != null && a4cVar.b(je9Var)) {
                        StringBuilder sbB = zo5.B("repliedQuoteFlow.filter: replyDataIsEmpty=", z, ", editDataIsNotEmpty=", z2, ", forwardDataIsNotEmpty=");
                        sbB.append(z3);
                        a4cVar.c(je9Var, str, sbB.toString(), null);
                    }
                    if (z && !z2 && z3) {
                        String str2 = this.c.a;
                        a4c a4cVar2 = gm0.f;
                        if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                            a4cVar2.c(je9Var, str2, "repliedQuoteFlow.filter: switch to forward quote because reply is empty", null);
                        }
                        MessageWriteWidget messageWriteWidget2 = this.c;
                        MessageWriteWidget.p1(messageWriteWidget2, messageWriteWidget2.A1().G());
                    }
                    boolean z4 = (z && (z2 || z3)) ? false : true;
                    String str3 = this.c.a;
                    a4c a4cVar3 = gm0.f;
                    if (a4cVar3 != null && a4cVar3.b(je9Var)) {
                        a4cVar3.c(je9Var, str3, zo5.s("repliedQuoteFlow.filter: shouldPass=", z4), null);
                    }
                    if (z4) {
                        tmaVar.e = 1;
                        if (yx6Var.emit(obj, tmaVar) == hu4Var) {
                            return hu4Var;
                        }
                    }
                } else {
                    if (i2 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj2);
                }
                return sbi.a;
            case 1:
                MessageWriteWidget messageWriteWidget3 = this.c;
                if (lq4Var instanceof wma) {
                    wmaVar = (wma) lq4Var;
                    int i3 = wmaVar.e;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        wmaVar.e = i3 - Integer.MIN_VALUE;
                    } else {
                        wmaVar = new wma(this, lq4Var);
                    }
                } else {
                    wmaVar = new wma(this, lq4Var);
                }
                Object obj3 = wmaVar.d;
                hu4 hu4Var2 = hu4.a;
                int i4 = wmaVar.e;
                if (i4 == 0) {
                    ch3.d0(obj3);
                    yx6 yx6Var2 = this.b;
                    boolean z5 = ((fla) obj) == null;
                    zv8[] zv8VarArr2 = MessageWriteWidget.I;
                    boolean z6 = messageWriteWidget3.A1().I.a.getValue() != null;
                    boolean z7 = messageWriteWidget3.A1().p1.a.getValue() != null;
                    if (z5 && !z6 && z7) {
                        MessageWriteWidget.p1(messageWriteWidget3, messageWriteWidget3.A1().G());
                    }
                    if (!z5 || (!z6 && !z7)) {
                        wmaVar.e = 1;
                        if (yx6Var2.emit(obj, wmaVar) == hu4Var2) {
                            return hu4Var2;
                        }
                    }
                } else {
                    if (i4 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj3);
                }
                return sbi.a;
            default:
                MessageWriteWidget messageWriteWidget4 = this.c;
                if (lq4Var instanceof xma) {
                    xmaVar = (xma) lq4Var;
                    int i5 = xmaVar.e;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        xmaVar.e = i5 - Integer.MIN_VALUE;
                    } else {
                        xmaVar = new xma(this, lq4Var);
                    }
                } else {
                    xmaVar = new xma(this, lq4Var);
                }
                Object obj4 = xmaVar.d;
                hu4 hu4Var3 = hu4.a;
                int i6 = xmaVar.e;
                if (i6 == 0) {
                    ch3.d0(obj4);
                    yx6 yx6Var3 = this.b;
                    boolean z8 = ((hla) obj) == null;
                    zv8[] zv8VarArr3 = MessageWriteWidget.I;
                    boolean z9 = messageWriteWidget4.A1().I.a.getValue() != null;
                    boolean z10 = messageWriteWidget4.A1().K.a.getValue() != null;
                    if (z8 && z9) {
                        MessageWriteWidget.q1(messageWriteWidget4, (lla) messageWriteWidget4.A1().I.a.getValue());
                    } else if (z8 && z10) {
                        MessageWriteWidget.o1(messageWriteWidget4, (fla) messageWriteWidget4.A1().K.a.getValue());
                    } else if (z8) {
                        mvh mvhVar = messageWriteWidget4.A;
                        if (mvhVar != null) {
                            mvhVar.dismiss();
                        }
                        messageWriteWidget4.A = null;
                    }
                    if (!z8 || (!z9 && !z10)) {
                        xmaVar.e = 1;
                        if (yx6Var3.emit(obj, xmaVar) == hu4Var3) {
                            return hu4Var3;
                        }
                    }
                } else {
                    if (i6 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj4);
                }
                return sbi.a;
        }
    }
}
