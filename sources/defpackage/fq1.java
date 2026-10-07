package defpackage;

import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class fq1 implements gq1 {
    public static final fq1 a = new fq1();
    public static final long b = tyb.c;
    public static final tnh c = new tnh(R.string.call_history_info_try_load_link_again);
    public static final zxb d = zxb.SECONDARY;

    @Override // defpackage.gq1
    public final zxb a() {
        return d;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof fq1);
    }

    @Override // defpackage.gq1
    public final long getItemId() {
        return b;
    }

    @Override // defpackage.gq1
    public final tnh getTitle() {
        return c;
    }

    public final int hashCode() {
        return -500105201;
    }

    public final String toString() {
        return "TryLoadLinkAgain";
    }
}
