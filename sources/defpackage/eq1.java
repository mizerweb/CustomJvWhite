package defpackage;

import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class eq1 implements gq1 {
    public static final eq1 a = new eq1();
    public static final long b = tyb.f;
    public static final tnh c = new tnh(R.string.call_history_info_start_call);
    public static final zxb d = zxb.PRIMARY;

    @Override // defpackage.gq1
    public final zxb a() {
        return d;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof eq1);
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
        return 952398934;
    }

    public final String toString() {
        return "StartCall";
    }
}
