package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class t28 implements gd2 {
    public long a;
    public Object b;
    public Object c;

    public t28() {
        this.b = t28.class.getName();
        this.a = Long.MIN_VALUE;
    }

    public ge3 b() {
        return new ge3(this);
    }

    @Override // defpackage.gd2
    public int c() {
        gd2 gd2Var = (gd2) this.b;
        if (gd2Var != null) {
            return gd2Var.c();
        }
        return 1;
    }

    @Override // defpackage.gd2
    public ghh d() {
        return (ghh) this.c;
    }

    public void e(int i, long j) {
        je9 je9Var = je9.d;
        if (((Float) this.c) != null || j < 0) {
            String str = (String) this.b;
            a4c a4cVar = gm0.f;
            if (a4cVar != null && a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "onSample: already captured i-frame interval", null);
                return;
            }
            return;
        }
        if ((i & 1) != 0) {
            long j2 = this.a;
            if (j2 == Long.MIN_VALUE) {
                String str2 = (String) this.b;
                a4c a4cVar2 = gm0.f;
                if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                    a4cVar2.c(je9Var, str2, zo5.j(j, "onSample: captured time of first i-frame -> "), null);
                }
                this.a = j;
                return;
            }
            long j3 = j - j2;
            if (j3 > 0) {
                String str3 = (String) this.b;
                a4c a4cVar3 = gm0.f;
                if (a4cVar3 != null && a4cVar3.b(je9Var)) {
                    a4cVar3.c(je9Var, str3, zo5.j(j, "onSample: captured time of second i-frame -> "), null);
                }
                this.c = Float.valueOf(j3 / 1000000.0f);
            }
        }
    }

    public void f() {
        je9 je9Var = je9.d;
        if (((Float) this.c) != null) {
            String str = (String) this.b;
            a4c a4cVar = gm0.f;
            if (a4cVar != null && a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "onTrackFinished: 2 i-frames collected", null);
                return;
            }
            return;
        }
        if (this.a != Long.MIN_VALUE) {
            String str2 = (String) this.b;
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                a4cVar2.c(je9Var, str2, "onTrackFinished: found just 1 i-frame", null);
            }
            this.c = Float.valueOf(Float.MAX_VALUE);
        }
    }

    public void g(long j) {
        this.a = j;
    }

    @Override // defpackage.gd2
    public long getTimestamp() {
        gd2 gd2Var = (gd2) this.b;
        if (gd2Var != null) {
            return gd2Var.getTimestamp();
        }
        long j = this.a;
        if (j != -1) {
            return j;
        }
        ore.k("No timestamp is available.");
        return 0L;
    }

    public void h(long j) {
        this.c = Long.valueOf(j);
    }

    public void i(ArrayList arrayList) {
        this.b = arrayList;
    }

    @Override // defpackage.gd2
    public dd2 r() {
        gd2 gd2Var = (gd2) this.b;
        return gd2Var != null ? gd2Var.r() : dd2.a;
    }

    @Override // defpackage.gd2
    public ed2 s() {
        gd2 gd2Var = (gd2) this.b;
        return gd2Var != null ? gd2Var.s() : ed2.a;
    }

    @Override // defpackage.gd2
    public cd2 w() {
        gd2 gd2Var = (gd2) this.b;
        return gd2Var != null ? gd2Var.w() : cd2.a;
    }

    public t28(gd2 gd2Var, ghh ghhVar, long j) {
        this.b = gd2Var;
        this.c = ghhVar;
        this.a = j;
    }
}
