package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class fgj {
    public final ny8 a;
    public final ny8 b;

    public fgj(ny8 ny8Var, ny8 ny8Var2) {
        this.a = ny8Var;
        this.b = ny8Var2;
    }

    public static void a(fgj fgjVar, String str, long j, String str2, boolean z, int i, Integer num, Integer num2, int i2) {
        if ((i2 & 16) != 0) {
            i = 0;
        }
        if ((i2 & 32) != 0) {
            num = null;
        }
        if ((i2 & 64) != 0) {
            num2 = null;
        }
        ae9 ae9Var = (ae9) fgjVar.a.getValue();
        ul9 ul9Var = new ul9();
        ul9Var.put("sessionId", Long.valueOf(((xb9) ((et3) fgjVar.b.getValue())).Y()));
        ul9Var.put("botId", Long.valueOf(j));
        ul9Var.put("webAppName", str2);
        ul9Var.put("success", Integer.valueOf(z ? 1 : 0));
        ul9Var.put("type", Integer.valueOf(i));
        if (num != null) {
            ul9Var.put("method", num);
        }
        if (num2 != null) {
            ul9Var.put("code", num2);
        }
        ae9.k(ae9Var, "WEBAPP_BRIDGE", str, ul9Var.b(), 8);
    }
}
