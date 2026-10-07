package defpackage;

import android.widget.TextView;
import one.me.startconversation.chattitleicon.ChatTitleIconScreen;

/* JADX INFO: loaded from: classes3.dex */
public final class pf3 implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatTitleIconScreen b;

    public /* synthetic */ pf3(ChatTitleIconScreen chatTitleIconScreen, int i) {
        this.a = i;
        this.b = chatTitleIconScreen;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        int i = this.a;
        sbi sbiVar = sbi.a;
        ChatTitleIconScreen chatTitleIconScreen = this.b;
        switch (i) {
            case 0:
                zv8[] zv8VarArr = ChatTitleIconScreen.q;
                chatTitleIconScreen.s1().z = r5h.y1((String) obj).toString();
                break;
            default:
                wf4 wf4Var = (wf4) obj;
                ow0 ow0Var = chatTitleIconScreen.n;
                ow0 ow0Var2 = chatTitleIconScreen.k;
                zv8[] zv8VarArr2 = ChatTitleIconScreen.q;
                zv8 zv8Var = zv8VarArr2[3];
                wf4Var.addView((TextView) ow0Var2.getValue());
                wf4Var.addView(ChatTitleIconScreen.o1(chatTitleIconScreen));
                wf4Var.addView(chatTitleIconScreen.p1());
                int i2 = 0;
                if (chatTitleIconScreen.r1() == jhg.CHANNEL) {
                    zv8 zv8Var2 = zv8VarArr2[6];
                    ei5 ei5Var = (ei5) ow0Var.getValue();
                    pf3 pf3Var = new pf3(chatTitleIconScreen, i2);
                    p1c p1cVar = ei5Var.j;
                    rt1 rt1Var = new rt1(pf3Var, 1, ei5Var);
                    p1cVar.addTextChangedListener(rt1Var);
                    chatTitleIconScreen.o = new bi5(ei5Var, rt1Var);
                    zv8 zv8Var3 = zv8VarArr2[6];
                    wf4Var.addView((ei5) ow0Var.getValue());
                }
                eg4 eg4VarH = ch3.h(wf4Var);
                zv8 zv8Var4 = zv8VarArr2[3];
                int id = ((TextView) ow0Var2.getValue()).getId();
                ow0 ow0Var3 = chatTitleIconScreen.j;
                zv8 zv8Var5 = zv8VarArr2[2];
                eg4VarH.d(id, 3, ((rcc) ow0Var3.getValue()).getId(), 4);
                qt4.w(16.0f, yl5.d().getDisplayMetrics().density, new bsb(3, eg4VarH, id));
                eg4VarH.d(id, 6, 0, 6);
                eg4VarH.d(id, 7, 0, 7);
                int id2 = ChatTitleIconScreen.o1(chatTitleIconScreen).getId();
                zv8 zv8Var6 = zv8VarArr2[3];
                eg4VarH.d(id2, 3, ((TextView) ow0Var2.getValue()).getId(), 4);
                qt4.w(24.0f, yl5.d().getDisplayMetrics().density, new bsb(3, eg4VarH, id2));
                eg4VarH.d(id2, 6, 0, 6);
                eg4VarH.d(id2, 7, 0, 7);
                int id3 = chatTitleIconScreen.p1().getId();
                eg4VarH.d(id3, 3, ChatTitleIconScreen.o1(chatTitleIconScreen).getId(), 4);
                qt4.w(24.0f, yl5.d().getDisplayMetrics().density, new bsb(3, eg4VarH, id3));
                eg4VarH.d(id3, 6, 0, 6);
                eg4VarH.d(id3, 7, 0, 7);
                zv8 zv8Var7 = zv8VarArr2[6];
                int id4 = ((ei5) ow0Var.getValue()).getId();
                eg4VarH.d(id4, 3, chatTitleIconScreen.p1().getId(), 4);
                qt4.w(8.0f, yl5.d().getDisplayMetrics().density, new bsb(3, eg4VarH, id4));
                eg4VarH.d(id4, 6, 0, 6);
                eg4VarH.d(id4, 7, 0, 7);
                eg4VarH.a(wf4Var);
                break;
        }
        return sbiVar;
    }
}
