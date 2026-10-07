package defpackage;

import java.util.List;
import one.me.chats.list.ChatsListWidget;
import one.me.pinbars.PinBarsWidget;
import one.me.sdk.arch.Widget;

/* JADX INFO: loaded from: classes.dex */
public final class vl3 extends mdh implements xf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public /* synthetic */ Object g;
    public /* synthetic */ Object h;
    public /* synthetic */ Object i;
    public /* synthetic */ Object j;
    public final /* synthetic */ Widget k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vl3(int i, lq4 lq4Var, Widget widget) {
        super(6, lq4Var);
        this.e = i;
        this.k = widget;
    }

    @Override // defpackage.xf7
    public final Object d(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        Widget widget = this.k;
        switch (i) {
            case 0:
                vl3 vl3Var = new vl3(0, (lq4) obj6, (ChatsListWidget) widget);
                vl3Var.f = (wh3) obj;
                vl3Var.g = (List) obj2;
                vl3Var.h = (List) obj3;
                vl3Var.i = (List) obj4;
                vl3Var.j = (List) obj5;
                vl3Var.invokeSuspend(sbiVar);
                return sbiVar;
            default:
                vl3 vl3Var2 = new vl3(1, (lq4) obj6, (PinBarsWidget) widget);
                vl3Var2.f = (lza) obj;
                vl3Var2.g = (x0d) obj2;
                vl3Var2.h = (bci) obj3;
                vl3Var2.i = (fr7) obj4;
                vl3Var2.j = (dqc) obj5;
                return vl3Var2.invokeSuspend(sbiVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0063  */
    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        switch (this.e) {
            case 0:
                wh3 wh3Var = (wh3) this.f;
                List list = (List) this.g;
                List list2 = (List) this.h;
                List list3 = (List) this.i;
                List list4 = (List) this.j;
                ch3.d0(obj);
                ChatsListWidget chatsListWidget = (ChatsListWidget) this.k;
                String str = chatsListWidget.d;
                a4c a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9 je9Var = je9.d;
                    if (a4cVar.b(je9Var)) {
                        String str2 = chatsListWidget.e;
                        int size = wh3Var.a.size();
                        w73 w73Var = (w73) ww3.t1(wh3Var.a);
                        Long l = w73Var != null ? new Long(w73Var.n) : null;
                        w73 w73Var2 = (w73) ww3.D1(wh3Var.a);
                        Long l2 = w73Var2 != null ? new Long(w73Var2.n) : null;
                        Integer num = list4 != null ? new Integer(list4.size()) : null;
                        StringBuilder sbR = c0a.r(size, "Got new chats on UI for folder:", str2, ", size=", ", first=");
                        sbR.append(l);
                        sbR.append(", last=");
                        sbR.append(l2);
                        sbR.append(", suggestsSize=");
                        sbR.append(num);
                        a4cVar.c(je9Var, str, sbR.toString(), null);
                    }
                }
                ChatsListWidget chatsListWidget2 = (ChatsListWidget) this.k;
                zh3 zh3Var = chatsListWidget2.u;
                if (chatsListWidget2.getView() != null) {
                    n1g.Q(chatsListWidget2.s1(), new s41(chatsListWidget2, zh3Var, wh3Var, 1), new e6(9, chatsListWidget2), 1);
                } else {
                    gm0.x(chatsListWidget2.d, "Chats list, submit chats without view", null);
                    zh3Var.H(wh3Var.a);
                }
                ((ChatsListWidget) this.k).x.H(list);
                boolean z = wh3Var.b;
                ChatsListWidget chatsListWidget3 = (ChatsListWidget) this.k;
                if (z) {
                    chatsListWidget3.z.H(r66.a);
                } else if (cqk.d(chatsListWidget3.e, "all.chat.folder")) {
                    ((ChatsListWidget) this.k).z.H(list3);
                }
                ((ChatsListWidget) this.k).y.H(list2);
                ((ChatsListWidget) this.k).B.H(list4);
                ((ChatsListWidget) this.k).x1();
                return sbi.a;
            default:
                lza lzaVar = (lza) this.f;
                x0d x0dVar = (x0d) this.g;
                bci bciVar = (bci) this.h;
                fr7 fr7Var = (fr7) this.i;
                dqc dqcVar = (dqc) this.j;
                ch3.d0(obj);
                zv8[] zv8VarArr = PinBarsWidget.z;
                return Boolean.valueOf((x0dVar instanceof v0d) && (lzaVar instanceof jza) && bciVar != null && (fr7Var instanceof er7) && (dqcVar instanceof cqc));
        }
    }
}
