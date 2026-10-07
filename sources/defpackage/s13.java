package defpackage;

import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class s13 implements hw7 {
    public final long b;
    public final ny8 c;
    public final ny8 d;
    public final Set e;

    public s13(long j, Set set, ny8 ny8Var, ny8 ny8Var2) {
        this.b = j;
        this.c = ny8Var;
        this.d = ny8Var2;
        this.e = fml.a(set);
    }

    @Override // defpackage.hw7
    public final long d() {
        ose oseVar = (ose) ((sua) this.d.getValue()).a;
        toa toaVar = (toa) oseVar.h();
        toaVar.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT * FROM messages WHERE chat_id = ? AND inserted_from_msg_link = 0 AND status <> ? AND media_type in (");
        Set set = this.e;
        int size = set.size();
        vd7.b(sb, size);
        sb.append(") AND delayed_attrs_time_to_fire IS NOT NULL AND delayed_attrs_notify_sender IS NOT NULL ORDER BY delayed_attrs_time_to_fire ASC LIMIT ");
        sb.append("?");
        gga ggaVar = (gga) ww3.t1((List) ch3.G(toaVar.a, true, false, new noa(sb.toString(), this.b, toaVar, wja.DELETED, set, size, 0)));
        sfa sfaVarB = ggaVar != null ? oseVar.b(ggaVar) : null;
        if (sfaVarB != null) {
            return sfaVarB.a;
        }
        return 0L;
    }

    @Override // defpackage.hw7
    public final long k() {
        ose oseVar = (ose) ((sua) this.d.getValue()).a;
        toa toaVar = (toa) oseVar.h();
        toaVar.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT * FROM messages WHERE chat_id = ? AND inserted_from_msg_link = 0 AND status <> ? AND media_type in (");
        Set set = this.e;
        int size = set.size();
        vd7.b(sb, size);
        sb.append(") AND delayed_attrs_time_to_fire IS NOT NULL AND delayed_attrs_notify_sender IS NOT NULL ORDER BY delayed_attrs_time_to_fire DESC LIMIT ");
        sb.append("?");
        gga ggaVar = (gga) ww3.t1((List) ch3.G(toaVar.a, true, false, new noa(sb.toString(), this.b, toaVar, wja.DELETED, set, size, 1)));
        sfa sfaVarB = ggaVar != null ? oseVar.b(ggaVar) : null;
        if (sfaVarB != null) {
            return sfaVarB.a;
        }
        return 0L;
    }

    @Override // defpackage.hw7
    public final List l() {
        return ((rt2) yab.A0(k66.a, new m5(this, null, 23))).b.n.e(mg5.DELAYED);
    }
}
