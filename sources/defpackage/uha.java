package defpackage;

import android.text.Layout;

/* JADX INFO: loaded from: classes4.dex */
public final class uha implements wha {
    public final long a;
    public final String b;
    public final long c;
    public final Layout d;
    public final Layout e;

    public uha(long j, String str, long j2, Layout layout, Layout layout2) {
        this.a = j;
        this.b = str;
        this.c = j2;
        this.d = layout;
        this.e = layout2;
    }

    @Override // defpackage.wha
    public final Layout a() {
        return this.d;
    }

    @Override // defpackage.wha
    public final Layout b() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uha)) {
            return false;
        }
        uha uhaVar = (uha) obj;
        return this.a == uhaVar.a && cqk.d(this.b, uhaVar.b) && this.c == uhaVar.c && this.d.equals(uhaVar.d) && cqk.d(this.e, uhaVar.e);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.a) * 31;
        String str = this.b;
        int iHashCode2 = (this.d.hashCode() + qt4.g((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c)) * 31;
        Layout layout = this.e;
        return iHashCode2 + (layout != null ? layout.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbT = qt4.t(this.a, "Channel(chatId=", ", channelLink=", this.b);
        qt4.z(this.c, ", forwardedMessageId=", ", bodyLayout=", sbT);
        sbT.append(this.d);
        sbT.append(", forwardedTitleLayout=");
        sbT.append(this.e);
        sbT.append(")");
        return sbT.toString();
    }
}
