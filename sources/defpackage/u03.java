package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class u03 extends wu3 {
    public static final u03 i;
    public static volatile boolean j;

    static {
        bsc bscVar = new bsc(new xyh());
        drc drcVar = new drc();
        drcVar.c = true;
        drcVar.b("open_chats_to_render");
        drcVar.b = bscVar;
        i = new u03(drcVar.a());
    }

    @Override // defpackage.wu3
    public final void A() {
        String str = this.g;
        owh owhVar = str != null ? new owh(str) : null;
        String str2 = owhVar != null ? owhVar.a : null;
        if (str2 != null) {
            qrc.k(i, "app_init", 0, str2, false, null, null, 120);
            return;
        }
        String str3 = this.b;
        a4c a4cVar = gm0.f;
        if (a4cVar == null) {
            return;
        }
        je9 je9Var = je9.f;
        if (a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, str3, "Invoked 'onAppCreated', but traceId is null or empty!", null);
        }
    }

    @Override // defpackage.wu3
    public final String B(p1f p1fVar) {
        if (!j) {
            return qrc.x(this, null, p90.O(1, "warm"), null, null, 13);
        }
        String str = this.b;
        a4c a4cVar = gm0.f;
        if (a4cVar == null) {
            return "";
        }
        je9 je9Var = je9.f;
        if (!a4cVar.b(je9Var)) {
            return "";
        }
        a4cVar.c(je9Var, str, c0a.o("Metric '", i.r(), "' was already collected once, skip collecting again!"), null);
        return "";
    }

    public final void D(int i2) {
        String str = this.g;
        owh owhVar = str != null ? new owh(str) : null;
        String str2 = owhVar != null ? owhVar.a : null;
        if (str2 != null) {
            u03 u03Var = i;
            b9b b9bVar = new b9b();
            if (i2 != 0) {
                b9bVar.k("waited_frames", Integer.valueOf(i2));
            }
            qrc.k(u03Var, "chat_list_render", 3, str2, true, null, b9bVar, 80);
            return;
        }
        String str3 = this.b;
        a4c a4cVar = gm0.f;
        if (a4cVar == null) {
            return;
        }
        je9 je9Var = je9.f;
        if (a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, str3, "Invoked 'onReadyToDraw', but traceId is null or empty!", null);
        }
    }

    @Override // defpackage.zqc
    public final b9b d(pxa pxaVar) {
        return p90.O(Byte.valueOf(this.a.c().a()), "class");
    }

    @Override // defpackage.wu3
    public final void z(int i2) {
        if (i2 == 1) {
            j = true;
        }
    }
}
