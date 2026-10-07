package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class vii {
    public final ahi a;
    public final zui b;

    public vii(ahi ahiVar, zui zuiVar) {
        oji ojiVar;
        this.a = ahiVar;
        this.b = zuiVar;
        if (zuiVar == null || (ojiVar = ahiVar.c) == oji.VIDEO) {
            return;
        }
        ore.e(ojiVar, "video conversion must be applicable only for Video, provided type: ");
        throw null;
    }
}
