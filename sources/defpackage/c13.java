package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class c13 extends mj9 {
    public final /* synthetic */ e13 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c13(e13 e13Var) {
        super(500);
        this.g = e13Var;
    }

    @Override // defpackage.mj9
    public final Object a(Object obj) {
        rt2 rt2Var = ((y03) obj).a;
        fda fdaVar = rt2Var.c;
        if (fdaVar != null) {
            return this.g.f(rt2Var, fdaVar, 2, false);
        }
        gm0.Y(c13.class.getName(), "Early return in create cuz of key.chat.lastMessage is null");
        return null;
    }
}
