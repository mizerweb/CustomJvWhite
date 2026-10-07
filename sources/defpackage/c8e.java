package defpackage;

import java.util.List;
import one.me.messages.list.loader.MessageModel;

/* JADX INFO: loaded from: classes2.dex */
public final class c8e extends a8j {
    public final long c;
    public final q24 d;
    public final String e = c8e.class.getName();
    public final ifh f;
    public final ifh g;

    public c8e(long j, q24 q24Var, ny8 ny8Var, xn3 xn3Var, lua luaVar, v24 v24Var) {
        this.c = j;
        this.d = q24Var;
        this.f = new ifh(new ja1(this, v24Var, luaVar, ny8Var));
        this.g = new ifh(new wre(luaVar, this, ny8Var, 28));
        jz jzVar = new jz(xn3Var.k(j), 13);
        ghb ghbVar = ew5.b;
        e9i.j0(e9i.T(new fz6(e9i.H(tre.G0(jzVar, qe7.O(1, lw5.SECONDS)), new wf0(20)), new dtd(this, (lq4) null, 6), 3), ((n0c) ((xhh) ny8Var.getValue())).a().R0(1, "reactions:lastReactedMessageId")), this.b);
    }

    public static List C(c8e c8eVar, MessageModel messageModel, int i) {
        boolean z = (i & 2) != 0;
        if (messageModel != null) {
            return (messageModel.r() ? (a8e) c8eVar.g.getValue() : c8eVar.B()).K(messageModel.w, z, false);
        }
        String str = c8eVar.e;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "message is null", null);
            }
        }
        return r66.a;
    }

    public final a8e B() {
        return (a8e) this.f.getValue();
    }

    public final void D(MessageModel messageModel, x7e x7eVar) {
        if (messageModel != null) {
            (messageModel.r() ? (a8e) this.g.getValue() : B()).T(x7eVar);
            return;
        }
        String str = this.e;
        a4c a4cVar = gm0.f;
        if (a4cVar == null) {
            return;
        }
        je9 je9Var = je9.d;
        if (a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, str, "message is null for " + x7eVar, null);
        }
    }

    @Override // defpackage.a8j
    public final void y() {
        a8e a8eVarB = B();
        cqk.g(a8eVarB.b);
        a8eVarB.y();
        ifh ifhVar = this.g;
        if (ifhVar.d()) {
            a8e a8eVar = (a8e) ifhVar.getValue();
            cqk.g(a8eVar.b);
            a8eVar.y();
        }
    }
}
