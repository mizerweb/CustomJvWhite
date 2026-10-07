package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ly extends kih {
    public List c;
    public List d;
    public List e;
    public List f;

    @Override // defpackage.kih
    public final void b(fka fkaVar, String str) {
        str.getClass();
        int i = 0;
        switch (str) {
            case "animojis":
                int iJ = ch3.J(fkaVar);
                this.e = new ArrayList(iJ);
                while (i < iJ) {
                    this.e.add(kl.h(fkaVar));
                    i++;
                }
                break;
            case "animojiSets":
                int iJ2 = ch3.J(fkaVar);
                this.f = new ArrayList(iJ2);
                while (i < iJ2) {
                    this.f.add(cn.a(fkaVar));
                    i++;
                }
                break;
            case "stickers":
                int iJ3 = ch3.J(fkaVar);
                this.c = new ArrayList(iJ3);
                while (i < iJ3) {
                    this.c.add(dlg.a(fkaVar));
                    i++;
                }
                break;
            case "stickerSets":
                int iJ4 = ch3.J(fkaVar);
                this.d = new ArrayList(iJ4);
                while (i < iJ4) {
                    this.d.add(fmg.a(fkaVar));
                    i++;
                }
                break;
            default:
                fkaVar.x();
                break;
        }
    }

    @Override // defpackage.sq0
    public final String toString() {
        int iO = tre.O(this.c);
        int iO2 = tre.O(this.d);
        int iO3 = tre.O(this.e);
        int iO4 = tre.O(this.f);
        StringBuilder sbP = qv1.p("{stickers=", iO, "stickerSets=", iO2, "animojis=");
        sbP.append(iO3);
        sbP.append("animojiSets=");
        sbP.append(iO4);
        sbP.append("}");
        return sbP.toString();
    }
}
