package defpackage;

import java.util.Collections;
import java.util.List;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* JADX INFO: loaded from: classes3.dex */
public final class p01 extends aq implements qih {
    public final /* synthetic */ int f;
    public final long g;
    public final Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p01(long j, long j2) {
        super(j);
        this.f = 0;
        this.g = j2;
        this.h = p01.class.getName();
    }

    private final void w(yhh yhhVar) {
    }

    private final void x(kih kihVar) {
    }

    @Override // defpackage.qih
    public final void b(kih kihVar) {
        switch (this.f) {
            case 0:
                q01 q01Var = (q01) kihVar;
                pj4 pj4Var = q01Var.d;
                if (pj4Var != null) {
                    vg4 vg4VarF = q().f(pj4Var.a, false);
                    ji4 ji4Var = vg4VarF != null ? vg4VarF.a.b.k : null;
                    ji4 ji4Var2 = ji4.a;
                    if (ji4Var == ji4Var2) {
                        q().n(Collections.singletonList(pj4Var), ji4Var2);
                    } else {
                        q().n(Collections.singletonList(pj4Var), ji4.b);
                    }
                    o().c(new pu2(this.a, p().Q(this.g).a, q01Var.c, Collections.singletonMap(Long.valueOf(this.g), pj4Var)));
                    dig digVar = q01Var.e;
                    if (digVar != null) {
                        q().b(pj4Var.a, new o01(0, digVar));
                    }
                    break;
                } else {
                    String str = (String) this.h;
                    a4c a4cVar = gm0.f;
                    if (a4cVar != null) {
                        je9 je9Var = je9.d;
                        if (a4cVar.b(je9Var)) {
                            a4cVar.c(je9Var, str, nbh.s(this.g, "onSuccess: contact for botId = ", " is null"), null);
                        }
                        break;
                    }
                }
                break;
            case 1:
                q3b q3bVar = (q3b) kihVar;
                bq bqVar = this.e;
                ((x3b) (bqVar != null ? bqVar : null).X.getValue()).a(q3bVar, this.g, ww3.U1((List) this.h), this.a);
                break;
        }
    }

    @Override // defpackage.qih
    public final void f(yhh yhhVar) {
        switch (this.f) {
            case 0:
                break;
            case 1:
                bq bqVar = this.e;
                if (bqVar == null) {
                    bqVar = null;
                }
                ((t51) ((x3b) bqVar.X.getValue()).a.getValue()).c(new s3b(this.a, yhhVar, this.g, (List) this.h));
                break;
            default:
                o().c(new yq0(this.a, yhhVar));
                break;
        }
    }

    @Override // defpackage.aq
    public final Object m() {
        int i = this.f;
        Object obj = this.h;
        long j = this.g;
        switch (i) {
            case 0:
                vsb vsbVar = new vsb(kfc.n3, 20);
                vsbVar.f(j, "botId");
                return vsbVar;
            case 1:
                return new h3b(j, ww3.U1((List) obj));
            default:
                if (j == 0) {
                    return null;
                }
                w50 w50Var = (w50) obj;
                String str = w50Var != null ? w50Var.a : null;
                y4b y4bVar = new y4b(null);
                y4bVar.f(j, ApiProtocol.PARAM_CHAT_ID);
                if (str != null) {
                    y4bVar.h("type", str);
                }
                return y4bVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p01(int i, long j, long j2, Object obj) {
        super(j);
        this.f = i;
        this.g = j2;
        this.h = obj;
    }
}
