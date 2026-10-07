package defpackage;

import java.util.Map;
import one.me.chatscreen.ChatScreen;

/* JADX INFO: loaded from: classes4.dex */
public final class za3 extends mdh implements xf7 {
    public /* synthetic */ q9f e;
    public /* synthetic */ ie3 f;
    public /* synthetic */ y5b g;
    public /* synthetic */ boolean h;
    public /* synthetic */ boolean i;
    public final /* synthetic */ ChatScreen j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public za3(lq4 lq4Var, ChatScreen chatScreen) {
        super(6, lq4Var);
        this.j = chatScreen;
    }

    @Override // defpackage.xf7
    public final Object d(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        boolean zBooleanValue = ((Boolean) obj4).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj5).booleanValue();
        za3 za3Var = new za3((lq4) obj6, this.j);
        za3Var.e = (q9f) obj;
        za3Var.f = (ie3) obj2;
        za3Var.g = (y5b) obj3;
        za3Var.h = zBooleanValue;
        za3Var.i = zBooleanValue2;
        return za3Var.invokeSuspend(sbi.a);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        q9f q9fVar = this.e;
        ie3 ie3Var = this.f;
        y5b y5bVar = this.g;
        boolean z = this.h;
        boolean z2 = this.i;
        ch3.d0(obj);
        ChatScreen chatScreen = this.j;
        t3f t3fVar = chatScreen.d;
        ny8 ny8Var = chatScreen.K;
        ou7 ou7Var = ChatScreen.L1;
        Long lF = chatScreen.U1().F();
        Map map = y5bVar.c;
        int i = y5bVar.a;
        k61 k61Var = new k61(map.get(hda.e) != null, y5bVar.c.get(hda.a) != null);
        m5b m5bVar = (m5b) ny8Var.getValue();
        boolean z3 = i > 0;
        mjg mjgVar = m5bVar.e;
        Boolean boolValueOf = Boolean.valueOf(z3);
        mjgVar.getClass();
        mjgVar.j(null, boolValueOf);
        mjg mjgVar2 = ((m5b) ny8Var.getValue()).c;
        mjgVar2.getClass();
        mjgVar2.j(null, k61Var);
        if (sol.d(t3fVar) && z) {
            return e21.f;
        }
        if (sol.d(t3fVar) && z2) {
            return e21.e;
        }
        if (!(q9fVar instanceof n9f)) {
            return e21.b;
        }
        if (ie3Var == null || !(lF == null || lF.longValue() == 0)) {
            return e21.a;
        }
        return i > 0 ? e21.d : e21.c;
    }
}
