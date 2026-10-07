package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class pmg {
    public final rre a;
    public final pl b = new pl(17);

    public pmg(rre rreVar) {
        this.a = rreVar;
    }

    public final r07 a(long[] jArr) {
        StringBuilder sbC = nbh.C("SELECT * FROM sticker_sets WHERE id IN (");
        vd7.b(sbC, jArr.length);
        sbC.append(")");
        ol olVar = new ol(sbC.toString(), 19, jArr);
        return ch3.i(this.a, new String[]{"sticker_sets"}, olVar);
    }
}
