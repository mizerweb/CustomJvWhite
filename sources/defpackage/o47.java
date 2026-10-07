package defpackage;

import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class o47 implements k79 {
    public final long a;
    public final CharSequence b;
    public final CharSequence c;
    public final String d;
    public final n47 e;
    public final long f;

    public o47(long j, String str, String str2, String str3, n47 n47Var) {
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = n47Var;
        this.f = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o47)) {
            return false;
        }
        o47 o47Var = (o47) obj;
        return this.a == o47Var.a && cqk.d(this.b, o47Var.b) && cqk.d(this.c, o47Var.c) && cqk.d(this.d, o47Var.d) && cqk.d(this.e, o47Var.e);
    }

    @Override // defpackage.k79
    public final long getItemId() {
        return this.f;
    }

    public final int hashCode() {
        int iF = mw7.f(Long.hashCode(this.a) * 31, 31, this.b);
        CharSequence charSequence = this.c;
        int iHashCode = (iF + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        String str = this.d;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        n47 n47Var = this.e;
        return iHashCode2 + (n47Var != null ? n47Var.hashCode() : 0);
    }

    public final n47 i() {
        return this.e;
    }

    @Override // defpackage.k79
    /* JADX INFO: renamed from: j */
    public final int getF() {
        return R.id.oneme_folder_widget_view_type;
    }

    public final String toString() {
        return "FolderWidgetItem(id=" + this.a + ", name=" + ((Object) this.b) + ", description=" + ((Object) this.c) + ", iconUrl=" + this.d + ", clickAction=" + this.e + ")";
    }
}
