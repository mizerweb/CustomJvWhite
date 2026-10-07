package defpackage;

import java.util.Collections;

/* JADX INFO: loaded from: classes3.dex */
public final class hz3 extends u7e {
    public final ny8 e;
    public final ny8 f;

    public hz3(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5) {
        super(ny8Var3, ny8Var4, ny8Var5);
        this.e = ny8Var;
        this.f = ny8Var2;
    }

    public final Object D(q24 q24Var, long j, hja hjaVar, nq4 nq4Var) {
        Object objW;
        s04 s04Var = (s04) ((r8e) ((xn3) this.e.getValue()).c.i(q24Var)).a.getValue();
        return (s04Var != null && (objW = w(s04Var, j, hjaVar, nq4Var)) == hu4.a) ? objW : sbi.a;
    }

    @Override // defpackage.u7e
    public final String g() {
        return "CommentReactionsUpdateLogic";
    }

    @Override // defpackage.u7e
    public final void h(sfa sfaVar) {
        if (!(sfaVar instanceof ky3)) {
            ore.e(sfaVar, "unexpected regular message in comments context: ");
            return;
        }
        long j = sfaVar.a;
        rt2 rt2Var = (rt2) ((r8e) ((xn3) this.e.getValue()).c.i(((ky3) sfaVar).K)).a.getValue();
        if (rt2Var instanceof s04) {
            ((p24) this.f.getValue()).a(new az3(((s04) rt2Var).r, Collections.singletonList(Long.valueOf(j)), true));
            return;
        }
        throw new IllegalArgumentException(("unexpected regular chat in comments context: " + rt2Var + " " + j).toString());
    }
}
