package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class za0 implements t3d {
    public static final /* synthetic */ zv8[] m;
    public final xhh a;
    public final ka0 b;
    public final w7b c;
    public final gu4 d;
    public final String e = za0.class.getName();
    public final ny8 f;
    public final ny8 g;
    public final pzf h;
    public final q8e i;
    public final r8e j;
    public final p3c k;
    public final v56 l;

    static {
        z8b z8bVar = new z8b(za0.class, "updatePlayerJob", "getUpdatePlayerJob()Lkotlinx/coroutines/Job;");
        zfe.a.getClass();
        m = new zv8[]{z8bVar};
    }

    public za0(xhh xhhVar, ka0 ka0Var, w7b w7bVar, gu4 gu4Var, ny8 ny8Var, ny8 ny8Var2) {
        this.a = xhhVar;
        this.b = ka0Var;
        this.c = w7bVar;
        this.d = gu4Var;
        this.f = ny8Var;
        this.g = ny8Var2;
        pzf pzfVarB = e9i.b(1, 0, 6);
        this.h = pzfVarB;
        q8e q8eVar = new q8e(pzfVarB);
        this.i = q8eVar;
        this.j = e9i.G0(new r07(q8eVar, w7bVar.a.A, new ya0(3, null), 0), gu4Var, j0g.b, Float.valueOf(0.0f));
        this.k = qyj.S();
        this.l = new v56(5, this);
    }

    @Override // defpackage.t3d
    public final void a() {
        this.c.d();
        yab.i0(this.d, ((n0c) this.a).a(), 0, new m5(this, null, 6), 2);
    }

    @Override // defpackage.t3d
    public final void b() {
        xte xteVar = this.c.a;
        boolean z = xteVar.r;
        ka0 ka0Var = this.b;
        if (z) {
            ka0Var.a.b();
        } else if (xteVar.q) {
            xte xteVar2 = ka0Var.a.a;
            yab.i0(xteVar2.d, null, 0, new wte(xteVar2, null, 1), 3);
        }
    }

    @Override // defpackage.t3d
    public final i65 c() {
        u7b u7bVarJ = this.c.a.j();
        if (u7bVarJ != null) {
            Map mapB = u7bVarJ.b();
            Object obj = mapB.get("MediaMetadata.Extra.MESSAGE_ID");
            Long l = obj instanceof Long ? (Long) obj : null;
            if (l != null) {
                long jLongValue = l.longValue();
                Object obj2 = mapB.get("MediaMetadata.Extra.CHAT_ID");
                Long l2 = obj2 instanceof Long ? (Long) obj2 : null;
                if (l2 != null) {
                    long jLongValue2 = l2.longValue();
                    Object obj3 = mapB.get("MediaMetadata.Extra.ITEM_TYPE_ID");
                    Byte b = obj3 instanceof Byte ? (Byte) obj3 : null;
                    if (b == null || b.byteValue() != mg5.DELAYED.a) {
                        return b0d.k(b0d.b, jLongValue2, jLongValue);
                    }
                    b0d.b.getClass();
                    return b0d.r(jLongValue2, jLongValue);
                }
            }
        }
        return null;
    }

    public final void d() {
        sgg sggVarH0 = yab.h0(this.d, ((n0c) this.a).a(), 2, new qn6(this, (lq4) null, 4));
        this.k.B(this, m[0], sggVarH0);
    }

    @Override // defpackage.t3d
    public final void pause() {
        this.b.a.b();
    }
}
