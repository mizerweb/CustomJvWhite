package defpackage;

import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class pn4 implements k79 {
    public final int a;
    public final Integer b;

    public pn4(int i, Integer num) {
        this.a = i;
        this.b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pn4)) {
            return false;
        }
        pn4 pn4Var = (pn4) obj;
        return this.a == pn4Var.a && cqk.d(this.b, pn4Var.b);
    }

    @Override // defpackage.k79
    public final long getItemId() {
        return 0L;
    }

    @Override // defpackage.k79
    public final boolean h(k79 k79Var) {
        return k79Var instanceof pn4;
    }

    public final int hashCode() {
        int iC = zo5.c(this.a, zo5.c(R.string.empty_search_contact_title, Integer.hashCode(R.drawable.icon_phone_book_fill) * 31, 31), 31);
        Integer num = this.b;
        return iC + (num == null ? 0 : num.hashCode());
    }

    @Override // defpackage.k79
    /* JADX INFO: renamed from: j */
    public final int getF() {
        return R.id.oneme_contactlist_empty_search_result_view_type;
    }

    @Override // defpackage.k79
    public final Object n(k79 k79Var) {
        pn4 pn4Var = k79Var instanceof pn4 ? (pn4) k79Var : null;
        if (pn4Var != null) {
            Integer num = pn4Var.b;
            if (!cqk.d(num, this.b)) {
                return new on4(num);
            }
        }
        return null;
    }

    public final String toString() {
        StringBuilder sbP = qv1.p("ContactsEmptySearchResultItem(iconRes=", R.drawable.icon_phone_book_fill, ", titleRes=", R.string.empty_search_contact_title, ", descriptionRes=");
        sbP.append(this.a);
        sbP.append(", buttonTitleRes=");
        sbP.append(this.b);
        sbP.append(")");
        return sbP.toString();
    }
}
