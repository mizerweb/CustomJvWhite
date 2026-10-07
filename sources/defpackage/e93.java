package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class e93 extends wu3 {
    public static final e93 i;

    static {
        bsc bscVar = new bsc(new xyh());
        drc drcVar = new drc();
        drcVar.c = true;
        drcVar.b("open_chat_to_render");
        drcVar.b = bscVar;
        i = new e93(drcVar.a());
    }

    @Override // defpackage.wu3
    public final void A() {
        String str = this.g;
        owh owhVar = str != null ? new owh(str) : null;
        String str2 = owhVar != null ? owhVar.a : null;
        if (str2 != null) {
            qrc.k(i, "activity_created", 0, str2, false, null, p90.O(Integer.valueOf(d93.PUSH.a()), "flow"), 88);
            return;
        }
        String str3 = this.b;
        a4c a4cVar = gm0.f;
        if (a4cVar == null) {
            return;
        }
        je9 je9Var = je9.f;
        if (a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, str3, "Invoked 'onSlicingColdStart', but traceId is null or empty!", null);
        }
    }

    @Override // defpackage.wu3
    public final String B(p1f p1fVar) {
        long[] jArr = q1f.a;
        b9b b9bVar = new b9b();
        b9bVar.k("warm", 1);
        b9bVar.l(p1fVar);
        return qrc.x(this, null, b9bVar, null, null, 13);
    }

    public final void D(int i2, boolean z) {
        String str = this.g;
        owh owhVar = str != null ? new owh(str) : null;
        String str2 = owhVar != null ? owhVar.a : null;
        if (str2 != null) {
            e93 e93Var = i;
            b9b b9bVar = new b9b();
            if (!z) {
                b9bVar.k("no_data", 1);
            }
            if (i2 != 0) {
                b9bVar.k("waited_frames", Integer.valueOf(i2));
            }
            qrc.k(e93Var, "messages_render", 2, str2, true, null, b9bVar, 80);
            return;
        }
        String str3 = this.b;
        a4c a4cVar = gm0.f;
        if (a4cVar == null) {
            return;
        }
        je9 je9Var = je9.f;
        if (a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, str3, "Invoked 'onMessagesReadyToDraw', but traceId is null or empty!", null);
        }
    }

    @Override // defpackage.zqc
    public final b9b d(pxa pxaVar) {
        return p90.O(Byte.valueOf(this.a.c().a()), "class");
    }
}
