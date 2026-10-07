package defpackage;

import android.net.Uri;
import java.util.List;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class sja extends y8f {
    public final Uri c;
    public final List d;
    public final gda e;
    public final rt2 f;
    public final String g;
    public final xcd h;
    public final CharSequence i;
    public final long j;
    public final String k;
    public final long l;

    public sja(Uri uri, List list, gda gdaVar, rt2 rt2Var, String str, xcd xcdVar, CharSequence charSequence, long j, String str2) {
        super(5, list);
        this.c = uri;
        this.d = list;
        this.e = gdaVar;
        this.f = rt2Var;
        this.g = str;
        this.h = xcdVar;
        this.i = charSequence;
        this.j = j;
        this.k = str2;
        this.l = gdaVar.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sja)) {
            return false;
        }
        sja sjaVar = (sja) obj;
        return cqk.d(this.c, sjaVar.c) && cqk.d(this.d, sjaVar.d) && cqk.d(this.e, sjaVar.e) && cqk.d(this.f, sjaVar.f) && cqk.d(this.g, sjaVar.g) && this.h.equals(sjaVar.h) && cqk.d(this.i, sjaVar.i) && this.j == sjaVar.j && cqk.d(this.k, sjaVar.k);
    }

    @Override // defpackage.k79
    public final long getItemId() {
        return this.l;
    }

    public final int hashCode() {
        Uri uri = this.c;
        int iHashCode = (this.e.hashCode() + qv1.c((uri == null ? 0 : uri.hashCode()) * 31, 31, this.d)) * 31;
        rt2 rt2Var = this.f;
        int iHashCode2 = (iHashCode + (rt2Var == null ? 0 : rt2Var.hashCode())) * 31;
        String str = this.g;
        int iHashCode3 = (this.h.hashCode() + ((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        CharSequence charSequence = this.i;
        int iG = qt4.g((iHashCode3 + (charSequence == null ? 0 : charSequence.hashCode())) * 31, 31, this.j);
        String str2 = this.k;
        return iG + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // defpackage.y8f
    public final boolean i(y8f y8fVar) {
        sja sjaVar = (sja) y8fVar;
        gda gdaVar = sjaVar.e;
        if (!cqk.d(this.c, sjaVar.c)) {
            return false;
        }
        gda gdaVar2 = this.e;
        return gdaVar2.c == gdaVar.c && cqk.d(gdaVar2.g, gdaVar.g) && gdaVar2.e == gdaVar.e;
    }

    @Override // defpackage.k79
    /* JADX INFO: renamed from: j */
    public final int getF() {
        return R.id.chats_search_message_view_type;
    }

    @Override // defpackage.y8f
    public final boolean o(y8f y8fVar) {
        return this.l == y8fVar.getItemId();
    }

    @Override // defpackage.y8f
    public final String q() {
        return this.k;
    }

    @Override // defpackage.y8f
    public final String toString() {
        String strC = gxl.c(this.i);
        StringBuilder sb = new StringBuilder("MessageSearchModel(avatar=");
        sb.append(this.c);
        sb.append(", messageHighlights=");
        sb.append(this.d);
        sb.append(", message=");
        sb.append(this.e);
        sb.append(", chat=");
        sb.append(this.f);
        sb.append(", feedback=");
        sb.append(this.g);
        sb.append(", preProcessedText=");
        sb.append(this.h);
        sb.append(", preProcessedChatTitle=");
        sb.append((Object) strC);
        sb.append(", chatId=");
        sb.append(this.j);
        sb.append(", viewType=");
        sb.append(R.id.chats_search_message_view_type);
        sb.append(", itemId=");
        return c0a.m(this.l, ")", sb);
    }
}
