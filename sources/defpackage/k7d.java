package defpackage;

import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class k7d extends o7d {
    public static final k7d a = new k7d();
    public static final long b = z5c.a;

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof k7d);
    }

    @Override // defpackage.k79
    public final long getItemId() {
        return b;
    }

    public final int hashCode() {
        return 723842854;
    }

    @Override // defpackage.k79
    public final int j() {
        return R.id.oneme_poll_create__add_answer_item_viewtype;
    }

    public final String toString() {
        return "AddAnswer";
    }
}
