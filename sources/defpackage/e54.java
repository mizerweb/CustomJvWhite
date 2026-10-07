package defpackage;

import kotlin.collections.a;
import ru.ok.tamtam.nano.Tasks;

/* JADX INFO: loaded from: classes3.dex */
public final class e54 extends aq implements qih, btc {
    public final q54 f;
    public final byte g;
    public final long[] h;
    public final long[] i;
    public final Long j;
    public final String k;
    public final Long l;

    public e54(long j, q54 q54Var, byte b, long[] jArr, long[] jArr2, Long l, String str, Long l2) {
        super(j);
        this.f = q54Var;
        this.g = b;
        this.h = jArr;
        this.i = jArr2;
        this.j = l;
        this.k = str;
        this.l = l2;
    }

    @Override // defpackage.qih, defpackage.btc
    public final boolean a() {
        return false;
    }

    @Override // defpackage.qih
    public final void b(kih kihVar) {
        boolean z = ((f54) kihVar).c;
        long[] jArr = this.h;
        Long l = this.j;
        q54 q54Var = this.f;
        q54 q54Var2 = q54.STORY;
        if (q54Var != q54Var2 && z && l != null && this.l == null) {
            bq bqVar = this.e;
            ((wzj) (bqVar != null ? bqVar : null).g.getValue()).c(new gkf(l.longValue(), a.m1(jArr), true, mg5.REGULAR));
        } else if (q54Var == q54Var2 && z && l != null) {
            bq bqVar2 = this.e;
            ((a64) (bqVar2 != null ? bqVar2 : null).n0.getValue()).a.a(new z54(q54Var, rx8.h0(jArr), l.longValue()));
        }
    }

    @Override // defpackage.btc
    public final void d() {
        v().d(this.a);
    }

    @Override // defpackage.qih
    public final void f(yhh yhhVar) {
        if (p90.C(yhhVar.b)) {
            return;
        }
        d();
        o().c(new yq0(yhhVar));
    }

    @Override // defpackage.btc
    public final byte[] g() {
        Tasks.Complain complain = new Tasks.Complain();
        complain.requestId = this.a;
        Long l = this.j;
        complain.parentId = l != null ? l.longValue() : 0L;
        Long l2 = this.l;
        complain.postServerId = l2 != null ? l2.longValue() : 0L;
        complain.ids = this.h;
        complain.serverIds = this.i;
        complain.typeId = this.f.a;
        complain.reasonId = this.g;
        String str = this.k;
        if (str == null) {
            str = "";
        }
        complain.details = str;
        return sia.toByteArray(complain);
    }

    @Override // defpackage.btc
    public final long getId() {
        return this.a;
    }

    @Override // defpackage.btc
    public final ctc getType() {
        return ctc.TYPE_COMPLAIN;
    }

    @Override // defpackage.btc
    public final atc j() {
        return atc.a;
    }

    @Override // defpackage.btc
    public final int l() {
        return 1000000;
    }

    @Override // defpackage.aq
    public final Object m() {
        q54 q54Var = q54.STORY;
        Long l = this.j;
        q54 q54Var2 = this.f;
        if (q54Var2 == q54Var && l != null) {
            return new wy2(q54Var2, this.g, this.i, l, this.k, null);
        }
        Long l2 = this.j;
        if (l2 == null) {
            return new wy2(q54Var2, this.g, this.i, l2, this.k, null);
        }
        bq bqVar = this.e;
        if (bqVar == null) {
            bqVar = null;
        }
        rt2 rt2Var = (rt2) bqVar.d().k(l.longValue()).a.getValue();
        return new wy2(this.f, this.g, this.i, rt2Var != null ? new Long(rt2Var.A()) : null, this.k, this.l);
    }
}
