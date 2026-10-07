package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class idj {
    public final ny8 a;

    public idj(ny8 ny8Var) {
        this.a = ny8Var;
    }

    public final void a(int i, long j, String str, bdj bdjVar, tu3 tu3Var) {
        String str2;
        ae9 ae9Var = (ae9) this.a.getValue();
        if (i == 1) {
            str2 = "OPEN";
        } else if (i == 2) {
            str2 = "CLOSE";
        } else if (i == 3) {
            str2 = "REFRESH";
        } else if (i == 4) {
            str2 = "MINIAPP_TAKE_PHOTO";
        } else {
            if (i != 5) {
                throw null;
            }
            str2 = "MINIAPP_TAKE_PHOTO_FROM_DOWNLOAD_MENU";
        }
        ul9 ul9Var = new ul9();
        ul9Var.put("botId", Long.valueOf(j));
        ul9Var.put("webAppName", str);
        ul9Var.put("entryPoint", Integer.valueOf(bdjVar.b));
        ul9Var.put("sourceType", Integer.valueOf(tu3Var.a));
        Long lB = tu3Var.b();
        if (lB != null) {
            ul9Var.put("sourceId", Long.valueOf(lB.longValue()));
        }
        ae9.k(ae9Var, "WEBAPP_ACTION", str2, ul9Var.b(), 8);
    }
}
