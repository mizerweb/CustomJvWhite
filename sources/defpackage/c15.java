package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class c15 {
    public final ny8 a;

    public c15(ny8 ny8Var) {
        this.a = ny8Var;
    }

    public final void a(sdg sdgVar, int i) {
        String str;
        ae9 ae9Var = (ae9) this.a.getValue();
        if (i == 1) {
            str = "modal_is_shown";
        } else if (i == 2) {
            str = "download_file";
        } else {
            if (i != 3) {
                throw null;
            }
            str = "not_download_file";
        }
        ae9.k(ae9Var, "DANGEROUS_FILE_ACTIONS", str, ouk.a(new ylc("source_id", Long.valueOf(sdgVar.a)), new ylc("source_type", Integer.valueOf(sdgVar.b))), 8);
    }
}
