package defpackage;

import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class l7d extends o7d {
    public final tnh a;
    public final int b;
    public final long c;
    public String d;

    public l7d(String str, tnh tnhVar, int i, long j) {
        this.a = tnhVar;
        this.b = i;
        this.c = j;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l7d)) {
            return false;
        }
        l7d l7dVar = (l7d) obj;
        return this.b == l7dVar.b && this.c == l7dVar.c && this.a.equals(l7dVar.a) && cqk.d(this.d, l7dVar.d);
    }

    @Override // defpackage.k79
    public final long getItemId() {
        return this.c;
    }

    public final int hashCode() {
        return this.d.hashCode() + zo5.c(this.a.c, (((Long.hashCode(this.c) + ((3100 + this.b) * 31)) * 31) + R.id.oneme_poll_create__answer_item_viewtype) * 31, 31);
    }

    @Override // defpackage.k79
    /* JADX INFO: renamed from: j */
    public final int getF() {
        return R.id.oneme_poll_create__answer_item_viewtype;
    }

    @Override // defpackage.k79
    public final boolean m(k79 k79Var) {
        if (!(k79Var instanceof l7d)) {
            return false;
        }
        l7d l7dVar = (l7d) k79Var;
        return cqk.d(this.d, l7dVar.d) && this.a.equals(l7dVar.a) && this.b == l7dVar.b;
    }
}
