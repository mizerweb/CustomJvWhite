package defpackage;

import ru.ok.android.onelog.impl.BuildConfig;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class iv1 implements k79 {
    public final ynh a;
    public final ynh b;

    public iv1(tnh tnhVar, xnh xnhVar) {
        this.a = tnhVar;
        this.b = xnhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iv1) && cqk.d(this.a, ((iv1) obj).a);
    }

    @Override // defpackage.k79
    public final long getItemId() {
        return BuildConfig.MAX_TIME_TO_UPLOAD;
    }

    public final int hashCode() {
        int iC = zo5.c(0, qt4.D(4) * 31, 31);
        ynh ynhVar = this.a;
        return iC + (ynhVar != null ? ynhVar.hashCode() : 0);
    }

    @Override // defpackage.k79
    /* JADX INFO: renamed from: j */
    public final int getF() {
        return R.id.call_info_presettings_change_name_vh;
    }

    public final String toString() {
        return "CallPresettingsChangeNameItem(sectionItemType=" + pye.q(4) + ", itemSection=0, errorMessage=" + this.a + ", text=" + this.b + ")";
    }
}
