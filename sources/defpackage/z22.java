package defpackage;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* JADX INFO: loaded from: classes3.dex */
public final class z22 extends aq implements qih {
    public final /* synthetic */ int f;
    public final Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z22(long j, Object obj, int i) {
        super(j);
        this.f = i;
        this.g = obj;
    }

    @Override // defpackage.qih
    public final void b(kih kihVar) {
        int i = this.f;
        long j = this.a;
        Object obj = this.g;
        switch (i) {
            case 0:
                a32 a32Var = (a32) kihVar;
                o().c(new if1(this.a, a32Var.d, a32Var.e, a32Var.f, a32Var.c, a32Var.g, a32Var.h));
                break;
            case 1:
                rj4 rj4Var = (rj4) kihVar;
                bq bqVar = this.e;
                ((tj4) (bqVar != null ? bqVar : null).R.getValue()).a(rj4Var, (long[]) obj, j);
                break;
            case 2:
                bof bofVar = (bof) kihVar;
                bq bqVar2 = this.e;
                ((svb) (bqVar2 != null ? bqVar2 : null).f.getValue()).e(bofVar.c);
                o().c(new cof(j));
                break;
            default:
                efh efhVar = (efh) kihVar;
                gm0.m("guc", "SyncApiTask: onSuccess contacts=%s, phones=%s", Integer.valueOf(efhVar.h().size()), Integer.valueOf(efhVar.d.size()));
                bq bqVar3 = this.e;
                (bqVar3 != null ? bqVar3 : null).b().c(new gfh(efhVar.h(), efhVar.d, (Map) obj));
                break;
        }
    }

    @Override // defpackage.qih
    public final void f(yhh yhhVar) {
        int i = this.f;
        long j = this.a;
        switch (i) {
            case 0:
                o().c(new yq0(j, yhhVar));
                break;
            case 1:
                bq bqVar = this.e;
                tj4 tj4Var = (tj4) (bqVar != null ? bqVar : null).R.getValue();
                long[] jArr = (long[]) this.g;
                tj4Var.getClass();
                if ("not.found".equals(yhhVar.b)) {
                    for (long j2 : jArr) {
                        ((an9) tj4Var.e.getValue()).b(j2);
                    }
                }
                ((t51) tj4Var.a.getValue()).c(new yq0(j, yhhVar));
                break;
            case 2:
                o().c(new yq0(j, yhhVar));
                break;
            default:
                bq bqVar2 = this.e;
                (bqVar2 != null ? bqVar2 : null).b().c(new yq0(j, yhhVar));
                break;
        }
    }

    @Override // defpackage.aq
    public final Object m() {
        int i = this.f;
        kfc kfcVar = null;
        Object obj = this.g;
        switch (i) {
            case 0:
                vsb vsbVar = new vsb(kfcVar, 24);
                vsbVar.h(ApiProtocol.PARAM_CONVERSATION_ID, (String) obj);
                return vsbVar;
            case 1:
                return new wy2((long[]) obj, (Long) null);
            case 2:
                List list = (List) obj;
                h3b h3bVar = new h3b(kfcVar, 22);
                if (list != null && !list.isEmpty()) {
                    h3bVar.d("pushTokens", list);
                }
                return h3bVar;
            default:
                Map map = (Map) obj;
                gm0.m("guc", "SyncApiTask: createRequest contactList.size=%s", new Integer(map.size()));
                lrg lrgVar = new lrg(kfc.q, 7);
                HashMap map2 = new HashMap();
                map.forEach(new ma4(4, map2));
                lrgVar.g("contactList", map2);
                return lrgVar;
        }
    }
}
