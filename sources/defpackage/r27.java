package defpackage;

import ru.ok.android.onelog.impl.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final class r27 implements k79 {
    public final ynh a;
    public final boolean b;
    public final int c;
    public final int d;

    public r27(int i, ynh ynhVar, boolean z) {
        this.a = ynhVar;
        this.b = z;
        this.c = i;
        this.d = 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r27)) {
            return false;
        }
        r27 r27Var = (r27) obj;
        return cqk.d(this.a, r27Var.a) && this.b == r27Var.b && this.c == r27Var.c;
    }

    @Override // defpackage.k79
    public final long getItemId() {
        return BuildConfig.MAX_TIME_TO_UPLOAD;
    }

    public final int hashCode() {
        ynh ynhVar = this.a;
        return Integer.hashCode(this.c) + nbh.n((ynhVar == null ? 0 : ynhVar.hashCode()) * 31, 31, this.b);
    }

    @Override // defpackage.k79
    /* JADX INFO: renamed from: j */
    public final int getF() {
        return this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FolderEditNameInputItem(defaultValue=");
        sb.append(this.a);
        sb.append(", isEnabled=");
        sb.append(this.b);
        sb.append(", nameLengthLimit=");
        return zo5.t(sb, this.c, ")");
    }

    public /* synthetic */ r27(xnh xnhVar, boolean z) {
        this(20, xnhVar, z);
    }
}
