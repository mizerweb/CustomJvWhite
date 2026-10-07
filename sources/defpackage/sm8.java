package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class sm8 {
    public final ny8 a;
    public final ny8 b;
    public final ny8 c;

    public sm8(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3) {
        this.a = ny8Var;
        this.b = ny8Var2;
        this.c = ny8Var3;
    }

    public final void a(String str, String str2, String str3) {
        Integer numC = ((tbb) this.b.getValue()).c();
        if (numC == null) {
            gm0.Y(sm8.class.getName(), "Early return in sendAnalytics cuz of navigationStats.currentScreenCode() is null");
            return;
        }
        ul9 ul9Var = new ul9();
        ul9Var.put("session_id", Long.valueOf(((xb9) ((et3) this.a.getValue())).Y()));
        ul9Var.put("screen", numC);
        ul9Var.put("entryPoint", str2);
        ul9Var.put("linkType", str3);
        ul9Var.put("status", "success");
        ae9.k((ae9) this.c.getValue(), "INVITE_MAX_BANNER", str, ul9Var.b(), 8);
    }

    public final void b() {
        a("click_link", "main", "invite_friends");
    }

    public final void c() {
        a("show", "main", "trigger_max");
    }
}
