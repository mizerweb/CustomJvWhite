package defpackage;

import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class bq1 implements cq1 {
    public static final bq1 a = new bq1();
    public static final long b = tyb.e;
    public static final tnh c = new tnh(R.string.call_history_info_share);
    public static final bz8 d = new bz8(R.drawable.icon_share_android, 0, 6);
    public static final osf e = osf.a;

    @Override // defpackage.psf
    public final int A() {
        return 1;
    }

    @Override // defpackage.psf
    public final dz8 e() {
        return d;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof bq1);
    }

    @Override // defpackage.k79
    public final long getItemId() {
        return b;
    }

    @Override // defpackage.psf
    public final ynh getTitle() {
        return c;
    }

    @Override // defpackage.psf
    public final osf getType() {
        return e;
    }

    public final int hashCode() {
        return 357815453;
    }

    @Override // defpackage.psf, defpackage.k79
    /* JADX INFO: renamed from: j */
    public final int getF() {
        return R.id.call_info_action_vh;
    }

    @Override // defpackage.cq1
    public final int s() {
        return 3;
    }

    public final String toString() {
        return "ShareLink";
    }
}
