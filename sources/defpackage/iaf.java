package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class iaf {
    public final ldf a;
    public final String b;
    public final String c;
    public final List d;
    public final List e;
    public final List f;
    public final long g;
    public final int h;
    public final boolean i;
    public final long j;
    public final List k;
    public final List l;
    public final String m;
    public final List n;

    public iaf(haf hafVar) {
        this.a = hafVar.a;
        this.b = hafVar.b;
        this.c = hafVar.c;
        this.d = hafVar.d;
        this.e = hafVar.e;
        this.f = hafVar.f;
        this.g = hafVar.g;
        this.i = hafVar.i;
        this.h = hafVar.h;
        this.j = hafVar.j;
        this.k = hafVar.k;
        this.l = hafVar.l;
        this.m = hafVar.m;
        this.n = hafVar.n;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.a);
        int iO = tre.O(this.d);
        int iO2 = tre.O(this.e);
        int iO3 = tre.O(this.k);
        int iO4 = tre.O(this.l);
        int iO5 = tre.O(this.n);
        StringBuilder sbQ = qv1.q("Section{type=", strValueOf, ", id='", this.b, "', title='");
        sbQ.append(this.c);
        sbQ.append("', stickers=");
        sbQ.append(iO);
        sbQ.append(", stickerSets=");
        c0a.v(sbQ, iO2, ", marker=", this.g);
        sbQ.append(", totalCount=");
        sbQ.append(this.h);
        sbQ.append(", collapsed=");
        sbQ.append(this.i);
        qt4.z(this.j, ", updateTime=", ", recentEmojiList=", sbQ);
        qt4.x(iO3, iO4, ", recentsList=", ", animojiSets=", sbQ);
        sbQ.append(iO5);
        sbQ.append(", mode='");
        sbQ.append(this.m);
        sbQ.append("'}");
        return sbQ.toString();
    }
}
