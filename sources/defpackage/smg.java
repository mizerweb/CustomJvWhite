package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class smg extends kih {
    public ArrayList c;
    public long d;

    public smg(fka fkaVar) {
        super(fkaVar);
    }

    @Override // defpackage.kih
    public final void b(fka fkaVar, String str) {
        str.getClass();
        if (str.equals("marker")) {
            this.d = fkaVar.I0();
            return;
        }
        if (!str.equals("stickers")) {
            fkaVar.x();
            return;
        }
        int iJ = ch3.J(fkaVar);
        this.c = new ArrayList(iJ);
        for (int i = 0; i < iJ; i++) {
            this.c.add(Long.valueOf(fkaVar.I0()));
        }
    }

    @Override // defpackage.sq0
    public final String toString() {
        StringBuilder sbB = nbh.B(this.d, "{stickerIds=", String.valueOf(this.c), ", marker=");
        sbB.append("}");
        return sbB.toString();
    }
}
