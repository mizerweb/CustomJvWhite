package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.webrtc.MediaStreamTrack;

/* JADX INFO: loaded from: classes3.dex */
public final class coi extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ gpi g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ coi(gpi gpiVar, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = gpiVar;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        gpi gpiVar = this.g;
        switch (i) {
            case 0:
                coi coiVar = new coi(gpiVar, lq4Var, 0);
                coiVar.f = obj;
                return coiVar;
            case 1:
                coi coiVar2 = new coi(gpiVar, lq4Var, 1);
                coiVar2.f = obj;
                return coiVar2;
            case 2:
                coi coiVar3 = new coi(gpiVar, lq4Var, 2);
                coiVar3.f = obj;
                return coiVar3;
            case 3:
                coi coiVar4 = new coi(gpiVar, lq4Var, 3);
                coiVar4.f = obj;
                return coiVar4;
            default:
                coi coiVar5 = new coi(gpiVar, lq4Var, 4);
                coiVar5.f = obj;
                return coiVar5;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                ((coi) create((mpi) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            case 1:
                ((coi) create((z54) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            case 2:
                ((coi) create((wsg) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            case 3:
                ((coi) create((l8b) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            default:
                ((coi) create((lsg) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        int i;
        Integer numValueOf;
        Object value;
        int iIntValue;
        sbi sbiVar;
        sbi sbiVar2;
        Iterator it;
        mjg mjgVar;
        lsg isgVar;
        char c;
        String str;
        int i2 = 10;
        int i3 = 2;
        switch (this.e) {
            case 0:
                mpi mpiVar = (mpi) this.f;
                ch3.d0(obj);
                if (mpiVar instanceof kpi) {
                    this.g.O(6);
                }
                return sbi.a;
            case 1:
                z54 z54Var = (z54) this.f;
                ch3.d0(obj);
                gpi gpiVar = this.g;
                a8j.t(gpiVar, ((n0c) gpiVar.f).a(), new oli(gpiVar, z54Var.b, null, i3), 2);
                return sbi.a;
            case 2:
                je9 je9Var = je9.e;
                wsg wsgVar = (wsg) this.f;
                ch3.d0(obj);
                if (!wsgVar.b.isEmpty()) {
                    gpi gpiVar2 = this.g;
                    mjg mjgVar2 = gpiVar2.I;
                    v84 v84Var = new v84(wsgVar.b, gpiVar2.x1, false);
                    mjgVar2.getClass();
                    mjgVar2.j(null, v84Var);
                }
                List list = (List) this.g.A.getValue();
                List list2 = list;
                ArrayList arrayList = new ArrayList(yw3.W0(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    c0a.t(((lsg) it2.next()).c(), arrayList);
                }
                ArrayList arrayList2 = wsgVar.a;
                ArrayList arrayList3 = new ArrayList(yw3.W0(arrayList2, 10));
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    c0a.t(((lsg) it3.next()).c(), arrayList3);
                }
                boolean zEquals = arrayList.equals(arrayList3);
                boolean z = !zEquals;
                String str2 = this.g.p;
                a4c a4cVar = gm0.f;
                if (a4cVar != null && a4cVar.b(je9Var)) {
                    obj2 = null;
                    a4cVar.c(je9Var, str2, "StoryPlayer: new playlist=[" + wsgVar + "]; isPlaylistChanged=" + z, null);
                } else {
                    obj2 = null;
                }
                mjg mjgVar3 = this.g.A;
                ArrayList arrayList4 = wsgVar.a;
                mjgVar3.getClass();
                mjgVar3.j(obj2, arrayList4);
                if (!zEquals) {
                    gpi gpiVar3 = this.g;
                    int i4 = wsgVar.d;
                    ArrayList arrayList5 = wsgVar.a;
                    int iB = ((b8b) gpiVar3.B.getValue()).b();
                    int i5 = wsgVar.e;
                    if (i4 <= 0) {
                        numValueOf = null;
                    } else {
                        Iterator it4 = arrayList5.iterator();
                        int i6 = 0;
                        while (true) {
                            if (!it4.hasNext()) {
                                i6 = -1;
                            } else if (((lsg) it4.next()).a() == 4) {
                                i6++;
                            }
                        }
                        Integer numValueOf2 = Integer.valueOf(i6);
                        if (i6 == -1) {
                            numValueOf2 = null;
                        }
                        if (numValueOf2 != null) {
                            iB = numValueOf2.intValue();
                        } else if (list.isEmpty()) {
                            iB = i5 == i4 ? 0 : i5;
                        } else {
                            lsg lsgVar = (lsg) ww3.u1(iB, list);
                            Long lValueOf = lsgVar != null ? Long.valueOf(lsgVar.c()) : null;
                            if (lValueOf != null) {
                                long jLongValue = lValueOf.longValue();
                                Iterator it5 = arrayList5.iterator();
                                i = 0;
                                while (true) {
                                    if (!it5.hasNext()) {
                                        i = -1;
                                    } else if (((lsg) it5.next()).c() != jLongValue) {
                                        i++;
                                    }
                                }
                            } else {
                                i = -1;
                            }
                            if (i != -1) {
                                iB = i;
                            }
                        }
                        numValueOf = Integer.valueOf(oc9.v(iB, 0, i4 - 1));
                    }
                    if (numValueOf == null) {
                        String str3 = gpiVar3.p;
                        a4c a4cVar2 = gm0.f;
                        if (a4cVar2 != null) {
                            je9 je9Var2 = je9.f;
                            if (a4cVar2.b(je9Var2)) {
                                a4cVar2.c(je9Var2, str3, "StoryPlayer: skip setupProgress for empty playlist", null);
                            }
                        }
                    } else {
                        if (((lsg) ww3.u1(numValueOf.intValue(), wsgVar.a)) instanceof hsg) {
                            gpiVar3.K(6);
                        } else {
                            gpiVar3.O(6);
                        }
                        gpiVar3.X = numValueOf.intValue() - 1;
                        String str4 = gpiVar3.p;
                        a4c a4cVar3 = gm0.f;
                        if (a4cVar3 != null && a4cVar3.b(je9Var)) {
                            a4cVar3.c(je9Var, str4, "StoryPlayer: setupProgress. startIndex=" + numValueOf + ", totalCount=" + i4, null);
                        }
                        mjg mjgVar4 = gpiVar3.B;
                        do {
                            value = mjgVar4.getValue();
                            iIntValue = numValueOf.intValue();
                            ((b8b) value).getClass();
                        } while (!mjgVar4.h(value, new b8b(iIntValue, 0.0f)));
                        gpiVar3.O(5);
                    }
                }
                return sbi.a;
            case 3:
                sbi sbiVar3 = sbi.a;
                l8b l8bVar = (l8b) this.f;
                ch3.d0(obj);
                if (l8bVar.h()) {
                    sbiVar = sbiVar3;
                } else {
                    mjg mjgVar5 = this.g.A;
                    while (true) {
                        Object value2 = mjgVar5.getValue();
                        List list3 = (List) value2;
                        ArrayList arrayList6 = new ArrayList(yw3.W0(list3, i2));
                        Iterator it6 = list3.iterator();
                        while (it6.hasNext()) {
                            lsg lsgVar2 = (lsg) it6.next();
                            v1h v1hVar = (v1h) l8bVar.f(lsgVar2.c());
                            if (v1hVar != null) {
                                int i7 = v1hVar.a;
                                if (lsgVar2 instanceof jsg) {
                                    jsg jsgVar = (jsg) lsgVar2;
                                    mjgVar = mjgVar5;
                                    sbiVar2 = sbiVar3;
                                    it = it6;
                                    isgVar = new jsg(jsgVar.a, jsgVar.b, jsgVar.c, jsgVar.d, jsgVar.e, i7, jsgVar.g, jsgVar.h, jsgVar.i, jsgVar.j, jsgVar.k, jsgVar.l, jsgVar.m, jsgVar.n);
                                } else {
                                    sbiVar2 = sbiVar3;
                                    it = it6;
                                    mjgVar = mjgVar5;
                                    if (lsgVar2 instanceof hsg) {
                                        hsg hsgVar = (hsg) lsgVar2;
                                        isgVar = new hsg(hsgVar.a, hsgVar.b, hsgVar.c, hsgVar.d, hsgVar.e, i7, hsgVar.g, hsgVar.h, hsgVar.i, hsgVar.j, hsgVar.k);
                                    } else {
                                        if (!(lsgVar2 instanceof isg)) {
                                            ore.o();
                                            return null;
                                        }
                                        isg isgVar2 = (isg) lsgVar2;
                                        isgVar = new isg(isgVar2.a, isgVar2.b, isgVar2.c, isgVar2.d, i7, isgVar2.f, isgVar2.g, isgVar2.h);
                                    }
                                }
                                lsgVar2 = isgVar;
                            } else {
                                sbiVar2 = sbiVar3;
                                it = it6;
                                mjgVar = mjgVar5;
                            }
                            arrayList6.add(lsgVar2);
                            it6 = it;
                            mjgVar5 = mjgVar;
                            sbiVar3 = sbiVar2;
                        }
                        sbiVar = sbiVar3;
                        mjg mjgVar6 = mjgVar5;
                        if (!mjgVar6.h(value2, arrayList6)) {
                            mjgVar5 = mjgVar6;
                            sbiVar3 = sbiVar;
                            i2 = 10;
                        }
                    }
                }
                return sbiVar;
            default:
                lsg lsgVar3 = (lsg) this.f;
                ch3.d0(obj);
                if (lsgVar3 != null) {
                    gpi gpiVar4 = this.g;
                    t3h t3hVar = gpiVar4.l;
                    azg azgVar = gpiVar4.c;
                    long jC = lsgVar3.c();
                    if (lsgVar3 instanceof hsg) {
                        c = 1;
                    } else if (lsgVar3 instanceof jsg) {
                        c = 2;
                    } else {
                        if (!(lsgVar3 instanceof isg)) {
                            ore.o();
                            return null;
                        }
                        c = 3;
                    }
                    t3hVar.getClass();
                    if (c == 1) {
                        str = "photo";
                    } else if (c == 2) {
                        str = MediaStreamTrack.VIDEO_TRACK_KIND;
                    } else {
                        if (c != 3) {
                            throw null;
                        }
                        str = "unsupported";
                    }
                    t3h.z(t3hVar, azgVar, jC, "story_data_loaded", 2, p90.O(str, "story_type"), 16);
                }
                return sbi.a;
        }
    }
}
