package defpackage;

import android.text.Layout;

/* JADX INFO: loaded from: classes4.dex */
public final class xha implements cia {
    public final Layout a;
    public final Layout b;
    public final long c;
    public final CharSequence d;
    public final String e;

    public xha(Layout layout, Layout layout2, long j, CharSequence charSequence, String str) {
        this.a = layout;
        this.b = layout2;
        this.c = j;
        this.d = charSequence;
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xha)) {
            return false;
        }
        xha xhaVar = (xha) obj;
        return this.a.equals(xhaVar.a) && this.b.equals(xhaVar.b) && this.c == xhaVar.c && this.d.equals(xhaVar.d) && cqk.d(this.e, xhaVar.e);
    }

    public final int hashCode() {
        int iF = mw7.f(qt4.g((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d);
        String str = this.e;
        return iF + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Contact(contactTitleLayout=");
        sb.append(this.a);
        sb.append(", contactNameLayout=");
        sb.append(this.b);
        sb.append(", contactId=");
        sb.append(this.c);
        sb.append(", nameForAbbreviation=");
        sb.append((Object) this.d);
        return qt4.q(sb, ", url=", this.e, ")");
    }
}
