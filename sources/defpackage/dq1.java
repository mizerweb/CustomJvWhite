package defpackage;

import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class dq1 implements gq1 {
    public static final dq1 a = new dq1();
    public static final long b = tyb.f;
    public static final tnh c = new tnh(R.string.call_history_info_join_call);
    public static final zxb d = zxb.PRIMARY;

    @Override // defpackage.gq1
    public final zxb a() {
        return d;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof dq1);
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
        return 775372146;
    }

    public final String toString() {
        return "JoinCall";
    }
}
