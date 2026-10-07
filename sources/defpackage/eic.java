package defpackage;

import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class eic implements k79 {
    public final CharSequence a;
    public final String b;

    public eic(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eic)) {
            return false;
        }
        eic eicVar = (eic) obj;
        return cqk.d(this.a, eicVar.a) && cqk.d(this.b, eicVar.b);
    }

    @Override // defpackage.k79
    public final long getItemId() {
        return -9223372036854775806L;
    }

    public final int hashCode() {
        CharSequence charSequence = this.a;
        int iHashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
        String str = this.b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @Override // defpackage.k79
    /* JADX INFO: renamed from: j */
    public final int getF() {
        return R.id.messages_list_organization_placeholder_view_type;
    }

    public final String toString() {
        return "OrganizationPlaceholderListItem(title=" + ((Object) this.a) + ", iconUrl=" + this.b + ")";
    }
}
