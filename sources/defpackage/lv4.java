package defpackage;

import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class lv4 implements k79 {
    public final int a;
    public final int b;
    public final tnh c;

    public lv4(int i, int i2, tnh tnhVar) {
        this.a = i;
        this.b = i2;
        this.c = tnhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lv4)) {
            return false;
        }
        lv4 lv4Var = (lv4) obj;
        return this.a == lv4Var.a && this.b == lv4Var.b && this.c.equals(lv4Var.c);
    }

    @Override // defpackage.k79
    public final long getItemId() {
        return this.a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c.c) + zo5.c(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    @Override // defpackage.k79
    /* JADX INFO: renamed from: j */
    public final int getF() {
        return R.id.oneme_startconversation_create_button_view_type;
    }

    public final String toString() {
        StringBuilder sbP = qv1.p("CreateButton(id=", this.a, ", icon=", this.b, ", text=");
        sbP.append(this.c);
        sbP.append(")");
        return sbP.toString();
    }
}
