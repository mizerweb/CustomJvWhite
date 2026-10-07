package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class uhi {
    public final u1i a;
    public final oji b;
    public final String c;
    public sgg d;
    public final ny8 e;
    public final ny8 f;
    public final ny8 g;
    public final String h = uhi.class.getName();

    public uhi(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, u1i u1iVar, oji ojiVar, String str) {
        this.a = u1iVar;
        this.b = ojiVar;
        this.c = str;
        this.e = ny8Var;
        this.f = ny8Var2;
        this.g = ny8Var3;
    }

    public static void a(uhi uhiVar, long j, float f, Thread thread, int i) {
        if ((i & 1) != 0) {
            j = 0;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            f = 0.0f;
        }
        float f2 = f;
        boolean z = (i & 4) == 0;
        boolean z2 = (i & 8) == 0;
        Thread thread2 = (i & 16) != 0 ? null : thread;
        bk5 bk5Var = (bk5) ((zed) uhiVar.g.getValue()).b.j().i();
        bk5Var.getClass();
        zv8 zv8Var = bk5.c[3];
        if (bk5Var.b("upload_hang")) {
            sgg sggVar = uhiVar.d;
            if (sggVar != null) {
                sggVar.b(null);
            }
            if (!z2) {
                uhiVar.d = yab.i0((wmi) uhiVar.f.getValue(), null, 0, new thi(uhiVar, j2, f2, z, thread2, null), 3);
                return;
            }
            String str = uhiVar.h;
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.d;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str, "No need to start hang checker", null);
                }
            }
            uhiVar.d = null;
        }
    }
}
