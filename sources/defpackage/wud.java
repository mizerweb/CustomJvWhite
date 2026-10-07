package defpackage;

import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class wud implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ dvd b;

    public /* synthetic */ wud(dvd dvdVar, int i) {
        this.a = i;
        this.b = dvdVar;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        int i = this.a;
        sbi sbiVar = sbi.a;
        dvd dvdVar = this.b;
        j8c j8cVar = (j8c) obj;
        switch (i) {
            case 0:
                int iOrdinal = j8cVar.ordinal();
                if (iOrdinal == 0 || iOrdinal == 1) {
                    dvdVar.U();
                    dvdVar.C();
                    return sbiVar;
                }
                if (iOrdinal != 2) {
                    if (iOrdinal == 3) {
                        dvdVar.R();
                        return sbiVar;
                    }
                    if (iOrdinal != 4) {
                        ore.o();
                        return null;
                    }
                }
                dvdVar.s1 = false;
                return sbiVar;
            case 1:
                int iOrdinal2 = j8cVar.ordinal();
                if (iOrdinal2 == 0 || iOrdinal2 == 1) {
                    dvdVar.U();
                    return sbiVar;
                }
                if (iOrdinal2 != 2) {
                    if (iOrdinal2 == 3) {
                        a8j.x(dvdVar.B, new hud(new tnh(R.string.suspend_bot_snackbar_title), new wud(dvdVar, 1)));
                        return sbiVar;
                    }
                    if (iOrdinal2 != 4) {
                        ore.o();
                        return null;
                    }
                }
                dvdVar.s1 = false;
                return sbiVar;
            default:
                if (j8cVar == j8c.e) {
                    yab.i0(dvdVar.b, ((n0c) dvdVar.F()).b(), 0, new l0d(dvdVar, (lq4) null, 23), 2);
                }
                return sbiVar;
        }
    }
}
