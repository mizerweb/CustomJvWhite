package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ss2 {
    public final ny8 a;

    public ss2(ny8 ny8Var) {
        this.a = ny8Var;
    }

    public final void a(int i, long j) {
        b(j, "channel_folder_click", i);
    }

    public final void b(long j, String str, int i) {
        ae9 ae9Var = (ae9) this.a.getValue();
        ul9 ul9Var = new ul9();
        ul9Var.put("channel_id", Long.valueOf(j));
        ul9Var.put("channel_position", Integer.valueOf(i));
        ae9.k(ae9Var, "CHANNEL_RECSYS_FOLDER", str, ul9Var.b(), 8);
    }

    public final void c(int i, long j) {
        b(j, "channel_folder_follow", i);
    }
}
