package defpackage;

import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class sj7 implements k79 {
    public final int a;
    public final int b;
    public final int c;
    public final Integer d;
    public final long e;
    public final ynh f;

    public sj7(int i, int i2) {
        ynh xnhVar;
        int i3 = i < i2 ? R.id.media_editor_aspect_ratio_portrait_view_type : i > i2 ? R.id.media_editor_aspect_ratio_album_view_type : R.id.media_editor_aspect_ratio_default_view_type;
        Integer numValueOf = (i == 1 && i2 == 1) ? Integer.valueOf(R.drawable.icon_ratio_1x1) : null;
        this.a = i3;
        this.b = i;
        this.c = i2;
        this.d = numValueOf;
        this.e = j4c.a;
        if (i == i2) {
            xnhVar = new tnh(R.string.media_picker_aspect_ratios_bottom_sheet_square_ratio);
        } else {
            xnhVar = new xnh(i + ":" + i2);
        }
        this.f = xnhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sj7)) {
            return false;
        }
        sj7 sj7Var = (sj7) obj;
        return this.a == sj7Var.a && this.b == sj7Var.b && this.c == sj7Var.c && cqk.d(this.d, sj7Var.d);
    }

    @Override // defpackage.k79
    public final long getItemId() {
        return this.e;
    }

    public final int hashCode() {
        int iC = zo5.c(this.c, zo5.c(this.b, Integer.hashCode(this.a) * 31, 31), 31);
        Integer num = this.d;
        return iC + (num == null ? 0 : num.hashCode());
    }

    @Override // defpackage.k79
    /* JADX INFO: renamed from: j */
    public final int getF() {
        return this.a;
    }

    public final String toString() {
        StringBuilder sbP = qv1.p("GenericAspectRatioModel(viewType=", this.a, ", width=", this.b, ", height=");
        sbP.append(this.c);
        sbP.append(", icon=");
        sbP.append(this.d);
        sbP.append(")");
        return sbP.toString();
    }
}
