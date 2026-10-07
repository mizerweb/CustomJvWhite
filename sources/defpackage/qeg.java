package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qeg {
    public final ny8 a;

    public qeg(ny8 ny8Var) {
        this.a = ny8Var;
    }

    public final void a(int i, float f) {
        String str;
        ul9 ul9Var = new ul9();
        ul9Var.put("speed", Float.valueOf(f));
        if (i == 1) {
            str = "MENU";
        } else {
            if (i != 2) {
                throw null;
            }
            str = "SWIPE";
        }
        ul9Var.put("sourceType", str);
        ae9.k((ae9) this.a.getValue(), "CLICK", "video_speed_change", ouk.a(new ylc("source_meta", ul9Var.b())), 8);
    }
}
