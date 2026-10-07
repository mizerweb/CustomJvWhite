package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class xy extends kih {
    public long c;
    public List d;
    public Map e;
    public Map f;
    public List g;
    public Map h;
    public Map i;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0, types: [haf] */
    /* JADX WARN: Type inference failed for: r5v54, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v55, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v56, types: [java.util.ArrayList] */
    @Override // defpackage.kih
    public final void b(fka fkaVar, String str) throws IOException {
        ArrayList arrayList;
        ?? arrayList2;
        str.getClass();
        switch (str) {
            case "animojiUpdates":
                this.h = aw5.a(fkaVar);
                break;
            case "stickerSetsUpdates":
                this.f = aw5.a(fkaVar);
                break;
            case "sync":
                this.c = fkaVar.I0();
                break;
            case "stickersUpdates":
                this.e = aw5.a(fkaVar);
                break;
            case "sections":
                this.d = new ArrayList();
                int iJ = ch3.J(fkaVar);
                for (int i = 0; i < iJ; i++) {
                    List list = this.d;
                    int iU = ch3.U(fkaVar);
                    iaf iafVarO = null;
                    if (iU != 0) {
                        ?? hafVar = new haf();
                        for (int i2 = 0; i2 < iU; i2++) {
                            String strS0 = fkaVar.S0();
                            strS0.getClass();
                            switch (strS0) {
                                case "recentsList":
                                    if (fkaVar.y().a() == 7) {
                                        arrayList = new ArrayList();
                                        int iT0 = fkaVar.t0();
                                        for (int i3 = 0; i3 < iT0; i3++) {
                                            arrayList.add(fae.a(fkaVar));
                                        }
                                    } else {
                                        fkaVar.x();
                                        arrayList = null;
                                    }
                                    hafVar.w(arrayList);
                                    break;
                                case "reactions":
                                    hafVar.u(b50.d(fkaVar));
                                    break;
                                case "marker":
                                    hafVar.s(fkaVar.I0());
                                    break;
                                case "totalCount":
                                    hafVar.A(ch3.R(fkaVar, 0));
                                    break;
                                case "recentEmojiList":
                                    if (fkaVar.y().a() == 7) {
                                        arrayList2 = new ArrayList();
                                        int iT1 = fkaVar.t0();
                                        for (int i4 = 0; i4 < iT1; i4++) {
                                            dae daeVarA = dae.a(fkaVar);
                                            if (daeVarA != null) {
                                                arrayList2.add(daeVarA);
                                            }
                                        }
                                    } else {
                                        fkaVar.x();
                                        arrayList2 = Collections.EMPTY_LIST;
                                    }
                                    hafVar.v(arrayList2);
                                    break;
                                case "updateTime":
                                    hafVar.C(ch3.T(fkaVar, 0L));
                                    break;
                                case "id":
                                    hafVar.r(ch3.W(fkaVar));
                                    break;
                                case "mode":
                                    hafVar.t(ch3.W(fkaVar));
                                    break;
                                case "type":
                                    hafVar.B(ldf.k(ch3.W(fkaVar)));
                                    break;
                                case "title":
                                    hafVar.z(ch3.W(fkaVar));
                                    break;
                                case "animojiSetIds":
                                    hafVar.p(b50.d(fkaVar));
                                    break;
                                case "stickers":
                                    hafVar.y(b50.d(fkaVar));
                                    break;
                                case "stickerSets":
                                    hafVar.x(b50.d(fkaVar));
                                    break;
                                case "collapsed":
                                    hafVar.q(ch3.L(fkaVar));
                                    break;
                                default:
                                    fkaVar.x();
                                    break;
                            }
                        }
                        iafVarO = hafVar.o();
                    }
                    list.add(iafVarO);
                }
                break;
            case "animojiSetUpdates":
                this.i = aw5.a(fkaVar);
                break;
            case "stickersOrder":
                this.g = b50.f(fkaVar);
                break;
            default:
                fkaVar.x();
                break;
        }
    }

    @Override // defpackage.sq0
    public final String toString() {
        long j = this.c;
        int iO = tre.O(this.d);
        int iP0 = tre.p0(this.e);
        int iP1 = tre.p0(this.f);
        int iO2 = tre.O(this.g);
        int iP2 = tre.p0(this.h);
        int iP3 = tre.p0(this.i);
        StringBuilder sbQ = c0a.q(iO, j, "{sync=", ", sections=");
        zo5.C(iP0, iP1, ", stickersUpdates=", ", stickersSetsUpdates=", sbQ);
        zo5.C(iO2, iP2, ", stickersOrder=", ", animojiUpdates=", sbQ);
        return qv1.o(sbQ, ", animojiSetsUpdates=", iP3, "}");
    }
}
