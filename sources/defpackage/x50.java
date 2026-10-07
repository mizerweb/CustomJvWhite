package defpackage;

import android.os.Handler;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class x50 implements tg4, r89, qg4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;

    public /* synthetic */ x50(long j, int i) {
        this.a = i;
        this.b = j;
    }

    @Override // defpackage.tg4
    public void accept(Object obj) {
        int i = this.a;
        long j = this.b;
        switch (i) {
            case 0:
                vvk.f((c60) obj, u60.d, j);
                break;
            case 1:
            default:
                ((j4d) obj).seekTo(j);
                break;
            case 2:
                tw2 tw2Var = (tw2) obj;
                gm0.m("qw2", "reactions, clearLastReaction for chat #%d", Long.valueOf(j));
                tw2Var.l0 = 0L;
                tw2Var.m0 = null;
                break;
            case 3:
                tw2 tw2Var2 = (tw2) obj;
                cx2 cx2Var = tw2Var2.o;
                if (cx2Var == null) {
                    cx2Var = cx2.h;
                }
                bx2 bx2VarA = cx2Var.a();
                bx2VarA.a = j;
                tw2Var2.o = new cx2(bx2VarA);
                break;
            case 4:
                tw2 tw2Var3 = (tw2) obj;
                fx2 fx2Var = tw2Var3.n;
                mg5 mg5Var = mg5.REGULAR;
                ArrayList arrayListJ = sb8.j(fx2Var, j, mg5Var);
                tw2Var3.n.b(mg5Var);
                tw2Var3.n.e(mg5Var).addAll(arrayListJ);
                fx2.f(mg5Var);
                tw2Var3.b0 = 0L;
                ww2 ww2Var = ww2.f;
                tw2Var3.q = ww2Var;
                tw2Var3.r = ww2Var;
                tw2Var3.s = ww2Var;
                tw2Var3.t = ww2Var;
                tw2Var3.u = ww2Var;
                tw2Var3.v = ww2Var;
                tw2Var3.w = ww2Var;
                tw2Var3.x = ww2Var;
                lx2 lx2Var = tw2Var3.b;
                if (lx2Var == lx2.b || (lx2Var == lx2.a && j == tw2Var3.k)) {
                    tw2Var3.j = 0L;
                    tw2Var3.m = 0;
                    tw2Var3.q = null;
                    tw2Var3.r = null;
                    tw2Var3.u = null;
                    tw2Var3.v = null;
                    tw2Var3.t = null;
                    tw2Var3.s = null;
                    tw2Var3.w = null;
                    tw2Var3.x = null;
                }
                break;
            case 5:
                ((tw2) obj).y = j;
                break;
            case 6:
                tw2 tw2Var4 = (tw2) obj;
                tw2Var4.M = j;
                tw2Var4.N = false;
                break;
            case 7:
                ((tw2) obj).f = j;
                break;
            case 8:
                tw2 tw2Var5 = (tw2) obj;
                cx2 cx2Var2 = tw2Var5.o;
                if (cx2Var2 == null) {
                    cx2Var2 = cx2.h;
                }
                bx2 bx2VarA2 = cx2Var2.a();
                bx2VarA2.e = j;
                tw2Var5.o = new cx2(bx2VarA2);
                break;
            case 9:
                tw2 tw2Var6 = (tw2) obj;
                if (tw2Var6.b0 < j) {
                    tw2Var6.b0 = j;
                    break;
                }
                break;
            case 10:
                tw2 tw2Var7 = (tw2) obj;
                cx2 cx2Var3 = tw2Var7.o;
                if (cx2Var3 == null) {
                    cx2Var3 = cx2.h;
                }
                bx2 bx2VarA3 = cx2Var3.a();
                bx2VarA3.d = j;
                tw2Var7.o = new cx2(bx2VarA3);
                break;
        }
    }

    @Override // defpackage.r89
    public void invoke(Object obj) {
        v56 v56Var;
        y75 y75Var = (y75) obj;
        b85 b85Var = y75Var.b;
        if (y75Var == b85Var.j && (v56Var = b85Var.n) != null) {
            lt9 lt9Var = (lt9) v56Var.b;
            lt9Var.s2 = true;
            v2a v2aVar = lt9Var.h2;
            Handler handler = (Handler) v2aVar.b;
            if (handler != null) {
                handler.post(new kb0(v2aVar, this.b, 0));
            }
        }
    }
}
