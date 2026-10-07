package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class uoe implements tp7 {
    public final cf7 a;
    public final Integer b;
    public final Long c;
    public final i64 d;
    public volatile tc7 e;
    public volatile Long f;
    public kme g;

    public uoe(cf7 cf7Var, Integer num, Long l) {
        this.a = cf7Var;
        this.b = num;
        this.c = l;
        this.d = new i64();
    }

    @Override // defpackage.tp7
    public final void a() {
        this.d.Q(new toe(3, null));
    }

    @Override // defpackage.tp7
    public final void c() {
        this.d.Q(new toe(3, null));
    }

    @Override // defpackage.tp7
    public final void d() {
        this.d.Q(new toe(3, null));
    }

    public uoe(Map map) {
        this(new p7d(19, map), null, null);
    }
}
