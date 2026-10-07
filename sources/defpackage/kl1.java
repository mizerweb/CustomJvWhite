package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import one.me.sdk.uikit.common.span.FitFontImageSpan;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.android.onelog.impl.BuildConfig;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class kl1 extends a8j implements g92 {
    public final mjg A;
    public final yl1 c;
    public final xu1 d;
    public final c92 e;
    public final i92 f;
    public final j92 g;
    public final ofb h;
    public final kfb i;
    public final ny8 j;
    public final xhh k;
    public final ny8 l;
    public final ny8 m;
    public final ny8 n;
    public final ny8 o;
    public final ny8 p;
    public final ny8 q;
    public final ny8 r;
    public final ny8 s;
    public final ny8 t;
    public final mjg u;
    public final mjg v;
    public final mjg w;
    public final mjg x;
    public final ic6 y;
    public final ic6 z;

    public kl1(yl1 yl1Var, xu1 xu1Var, c92 c92Var, i92 i92Var, j92 j92Var, ofb ofbVar, kfb kfbVar, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, xhh xhhVar, ny8 ny8Var6, ny8 ny8Var7, ny8 ny8Var8, ny8 ny8Var9, ny8 ny8Var10, ny8 ny8Var11) {
        xx6 gfbVar;
        this.c = yl1Var;
        this.d = xu1Var;
        this.e = c92Var;
        this.f = i92Var;
        this.g = j92Var;
        this.h = ofbVar;
        this.i = kfbVar;
        this.j = ny8Var;
        this.k = xhhVar;
        this.l = ny8Var2;
        this.m = ny8Var3;
        this.n = ny8Var5;
        this.o = ny8Var6;
        this.p = ny8Var11;
        this.q = ny8Var4;
        this.r = ny8Var9;
        this.s = ny8Var10;
        this.t = ny8Var8;
        mjg mjgVarA = p90.a(rlc.a);
        this.u = mjgVarA;
        this.v = mjgVarA;
        mjg mjgVarA2 = p90.a(Boolean.FALSE);
        this.w = mjgVarA2;
        this.x = mjgVarA2;
        this.y = new ic6(null);
        this.z = new ic6(null);
        final int i = 0;
        mjg mjgVarA3 = p90.a(0);
        this.A = mjgVarA3;
        final int i2 = 1;
        if (!E()) {
            G();
            i92Var.g(new e92(i92Var, 2));
            ((pa4) ny8Var7.getValue()).a(pa4.d | pa4.e, new oa4(this) { // from class: hl1
                public final /* synthetic */ kl1 b;

                {
                    this.b = this;
                }

                @Override // defpackage.oa4
                public final void a(Context context) {
                    Object value;
                    int i3 = i2;
                    kl1 kl1Var = this.b;
                    switch (i3) {
                        case 0:
                            mjg mjgVar = kl1Var.A;
                            do {
                                value = mjgVar.getValue();
                            } while (!mjgVar.h(value, Integer.valueOf(((Number) value).intValue() + 1)));
                            break;
                        default:
                            kl1Var.H();
                            break;
                    }
                }
            });
            return;
        }
        boolean z = yl1Var == yl1.MISSING;
        xj1 xj1Var = kfbVar.b;
        if (z) {
            final List list = kfb.j;
            final long jT = ((s7f) kfbVar.c).t();
            xj1Var.getClass();
            StringBuilder sb = new StringBuilder();
            sb.append("SELECT * FROM call_history WHERE hangup_type IN (");
            final int size = list.size();
            vd7.b(sb, size);
            sb.append(") AND caller_id != ");
            sb.append("?");
            sb.append(" ORDER BY time DESC");
            final String string = sb.toString();
            gfbVar = new gfb(ch3.i(xj1Var.a, new String[]{"call_history"}, new cf7() { // from class: uj1
                @Override // defpackage.cf7
                public final Object invoke(Object obj) throws Exception {
                    List list2 = list;
                    int i3 = size;
                    long j = jT;
                    vxe vxeVarO0 = ((qxe) obj).O0(string);
                    try {
                        Iterator it = list2.iterator();
                        int i4 = 1;
                        while (it.hasNext()) {
                            vxeVarO0.B(i4, (String) it.next());
                            i4++;
                        }
                        vxeVarO0.c(i3 + 1, j);
                        int iE = qyj.E(vxeVarO0, "history_id");
                        int iE2 = qyj.E(vxeVarO0, "call_id");
                        int iE3 = qyj.E(vxeVarO0, "call_name");
                        int iE4 = qyj.E(vxeVarO0, "caller_id");
                        int iE5 = qyj.E(vxeVarO0, "message_id");
                        int iE6 = qyj.E(vxeVarO0, "chat_id");
                        int iE7 = qyj.E(vxeVarO0, "call_type");
                        int iE8 = qyj.E(vxeVarO0, "hangup_type");
                        int iE9 = qyj.E(vxeVarO0, ApiProtocol.KEY_JOIN_LINK);
                        int iE10 = qyj.E(vxeVarO0, "time");
                        int iE11 = qyj.E(vxeVarO0, "duration_ms");
                        int iE12 = qyj.E(vxeVarO0, "group_call_type");
                        ArrayList arrayList = new ArrayList();
                        while (vxeVarO0.M0()) {
                            arrayList.add(new dk1(vxeVarO0.getLong(iE), vxeVarO0.B0(iE2), vxeVarO0.isNull(iE3) ? null : vxeVarO0.B0(iE3), vxeVarO0.getLong(iE4), vxeVarO0.isNull(iE5) ? null : Long.valueOf(vxeVarO0.getLong(iE5)), vxeVarO0.getLong(iE6), vxeVarO0.B0(iE7), vxeVarO0.isNull(iE8) ? null : vxeVarO0.B0(iE8), vxeVarO0.isNull(iE9) ? null : vxeVarO0.B0(iE9), vxeVarO0.getLong(iE10), vxeVarO0.isNull(iE11) ? null : Long.valueOf(vxeVarO0.getLong(iE11)), vxeVarO0.isNull(iE12) ? null : Integer.valueOf((int) vxeVarO0.getLong(iE12))));
                        }
                        return arrayList;
                    } finally {
                        vxeVarO0.close();
                    }
                }
            }), 1);
        } else {
            gfbVar = new gfb(ch3.i(xj1Var.a, new String[]{"call_history"}, new vi2(29)), 0);
        }
        e9i.j0(e9i.T(new fz6(new r07(yl1Var == yl1.ALL ? new bye(new dn0(this, gfbVar, (lq4) null, 10)) : gfbVar, mjgVarA3, new zu(3, (lq4) null, 3), 0), new i26(this, (lq4) null, 26), 3), ((n0c) xhhVar).a()), this.b);
        yab.i0(this.b, null, 0, new m5(this, null, 11), 3);
        ((pa4) ny8Var7.getValue()).a(pa4.d | pa4.e, new oa4(this) { // from class: hl1
            public final /* synthetic */ kl1 b;

            {
                this.b = this;
            }

            @Override // defpackage.oa4
            public final void a(Context context) {
                Object value;
                int i3 = i;
                kl1 kl1Var = this.b;
                switch (i3) {
                    case 0:
                        mjg mjgVar = kl1Var.A;
                        do {
                            value = mjgVar.getValue();
                        } while (!mjgVar.h(value, Integer.valueOf(((Number) value).intValue() + 1)));
                        break;
                    default:
                        kl1Var.H();
                        break;
                }
            }
        });
    }

    public final sa2 B() {
        return (sa2) this.o.getValue();
    }

    public final boolean C() {
        if (E()) {
            return false;
        }
        c92 c92Var = this.e;
        if ((this.c == yl1.MISSING ? (ArrayList) c92Var.e : c92Var.b).isEmpty()) {
            return false;
        }
        i92 i92Var = this.f;
        return i92Var.c == null || i92Var.c.d || !i92Var.b;
    }

    public final yw7 D(long j) {
        slc slcVar = (slc) this.u.getValue();
        if (slcVar instanceof qlc) {
            return (yw7) ((qlc) slcVar).a.get(Long.valueOf(j));
        }
        return null;
    }

    public final boolean E() {
        return ((Boolean) ((e5d) this.s.getValue()).c().i()).booleanValue();
    }

    public final void F(long j, long j2, List list, List list2) {
        je9 je9Var = je9.d;
        Long l = (Long) ww3.t1(list);
        if (l != null) {
            a4c a4cVar = gm0.f;
            if (a4cVar != null && a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, "CallHistoryNav", "nav: openMessage by localId=" + l + ", chatLocalId=" + j, null);
            }
            a8j.x(this.z, new sk1(j, l.longValue()));
            return;
        }
        Long l2 = (Long) ww3.t1(list2);
        if (l2 != null) {
            yab.i0(this.b, null, 0, new h01(this, j, j2, l2, null, 1), 3);
            return;
        }
        a4c a4cVar2 = gm0.f;
        if (a4cVar2 != null && a4cVar2.b(je9Var)) {
            a4cVar2.c(je9Var, "CallHistoryNav", zo5.j(j, "nav: openChat (no local/server msg ids), chatLocalId="), null);
        }
        a8j.x(this.z, new rk1(j));
    }

    public final void G() {
        if (E()) {
            return;
        }
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, "CallHistoryPageViewModel", "register load history callbacks for type=" + this.c, null);
            }
        }
        i92 i92Var = this.f;
        i92Var.o.S0().D0(k66.a, new e6(6, i92Var));
        this.f.f.add(this);
        H();
    }

    /* JADX WARN: Code duplicated, block: B:110:0x025c  */
    /* JADX WARN: Code duplicated, block: B:113:0x0269  */
    /* JADX WARN: Code duplicated, block: B:115:0x0270  */
    /* JADX WARN: Code duplicated, block: B:117:0x0274  */
    /* JADX WARN: Code duplicated, block: B:118:0x0279  */
    /* JADX WARN: Code duplicated, block: B:120:0x0281  */
    /* JADX WARN: Code duplicated, block: B:123:0x0296  */
    /* JADX WARN: Code duplicated, block: B:125:0x029c  */
    /* JADX WARN: Code duplicated, block: B:126:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:128:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:129:0x02af  */
    /* JADX WARN: Code duplicated, block: B:131:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:136:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:138:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:140:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:143:0x02da  */
    /* JADX WARN: Code duplicated, block: B:145:0x02de  */
    /* JADX WARN: Code duplicated, block: B:148:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:150:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:151:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:154:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:157:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:159:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:160:0x0303  */
    /* JADX WARN: Code duplicated, block: B:161:0x0305  */
    /* JADX WARN: Code duplicated, block: B:164:0x030f  */
    /* JADX WARN: Code duplicated, block: B:168:0x031e  */
    /* JADX WARN: Code duplicated, block: B:170:0x0323 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:178:0x033f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:179:0x0341  */
    /* JADX WARN: Code duplicated, block: B:181:0x034b  */
    /* JADX WARN: Code duplicated, block: B:184:0x0354  */
    /* JADX WARN: Code duplicated, block: B:187:0x035f  */
    /* JADX WARN: Code duplicated, block: B:188:0x0366  */
    /* JADX WARN: Code duplicated, block: B:191:0x036e  */
    /* JADX WARN: Code duplicated, block: B:192:0x0373  */
    /* JADX WARN: Code duplicated, block: B:195:0x037a  */
    /* JADX WARN: Code duplicated, block: B:196:0x037f  */
    /* JADX WARN: Code duplicated, block: B:199:0x0386  */
    /* JADX WARN: Code duplicated, block: B:204:0x0393  */
    /* JADX WARN: Code duplicated, block: B:207:0x039b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:211:0x03a2  */
    /* JADX WARN: Code duplicated, block: B:213:0x03a6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:216:0x03b3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:217:0x03b5  */
    /* JADX WARN: Code duplicated, block: B:220:0x03c4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:221:0x03c6  */
    /* JADX WARN: Code duplicated, block: B:222:0x03cf  */
    /* JADX WARN: Code duplicated, block: B:224:0x03d2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:227:0x03df A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:228:0x03e1  */
    /* JADX WARN: Code duplicated, block: B:231:0x03f0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:232:0x03f2  */
    /* JADX WARN: Code duplicated, block: B:233:0x03fb  */
    /* JADX WARN: Code duplicated, block: B:235:0x03ff  */
    /* JADX WARN: Code duplicated, block: B:236:0x0407 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:237:0x0409  */
    /* JADX WARN: Code duplicated, block: B:238:0x0411  */
    /* JADX WARN: Code duplicated, block: B:240:0x0417  */
    /* JADX WARN: Code duplicated, block: B:241:0x041f  */
    /* JADX WARN: Code duplicated, block: B:243:0x0428  */
    /* JADX WARN: Code duplicated, block: B:244:0x0448  */
    /* JADX WARN: Code duplicated, block: B:247:0x0452  */
    /* JADX WARN: Code duplicated, block: B:248:0x0461  */
    /* JADX WARN: Code duplicated, block: B:250:0x046b  */
    /* JADX WARN: Code duplicated, block: B:252:0x049b  */
    /* JADX WARN: Code duplicated, block: B:253:0x049e  */
    /* JADX WARN: Code duplicated, block: B:256:0x04a4  */
    /* JADX WARN: Code duplicated, block: B:257:0x04a9  */
    /* JADX WARN: Code duplicated, block: B:259:0x04ad  */
    /* JADX WARN: Code duplicated, block: B:296:0x04bc A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:75:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:94:0x021a  */
    /* JADX WARN: Code duplicated, block: B:95:0x021c  */
    public final void H() {
        mjg mjgVar;
        Object obj;
        Object value;
        String string;
        String str;
        r66 r66Var;
        rt2 rt2Var;
        fda fdaVar;
        vg4 vg4Var;
        String strE;
        r66 r66Var2;
        qw7 lw7Var;
        qw7 nw7Var;
        sfa sfaVar;
        e60 e60VarO;
        e60 e60VarO2;
        long j;
        vg4 vg4Var2;
        rt2 rt2Var2;
        long jA;
        us0 us0Var;
        vg4 vg4Var3;
        rt2 rt2Var3;
        String strS;
        boolean z;
        int i;
        bm1 bm1Var;
        long j2;
        int i2;
        boolean z2;
        CharSequence charSequenceK;
        Context context;
        e60 e60VarO3;
        char c;
        e60 e60VarO4;
        Long lValueOf;
        e60 e60VarO5;
        boolean zJ;
        e60 e60VarO6;
        boolean zG;
        boolean z3;
        boolean z4;
        Drawable drawable;
        String strA;
        FitFontImageSpan fitFontImageSpan;
        String str2;
        vg4 vg4Var4;
        rt2 rt2Var4;
        boolean z5;
        boolean z6;
        int i3;
        e60 e60VarO7;
        int i4;
        Object obj2;
        mjg mjgVar2 = this.u;
        while (true) {
            Object value2 = mjgVar2.getValue();
            slc slcVar = (slc) value2;
            c92 c92Var = this.e;
            qw2 qw2Var = (qw2) this.m.getValue();
            CopyOnWriteArrayList<fda> copyOnWriteArrayList = this.f.d;
            ArrayList arrayList = c92Var.b;
            arrayList.clear();
            int size = arrayList.size();
            for (fda fdaVar2 : copyOnWriteArrayList) {
                rt2 rt2VarN = qw2Var.N(fdaVar2.a.h);
                if (rt2VarN != null) {
                    if (rt2VarN.h0()) {
                        vg4 vg4VarW = rt2VarN.w();
                        if (vg4VarW != null) {
                            arrayList.add(new b92(fdaVar2, vg4VarW));
                        }
                    } else {
                        arrayList.add(new b92(rt2VarN, fdaVar2));
                    }
                }
            }
            c92Var.b(arrayList, size, arrayList.size() - 1);
            int i5 = 0;
            boolean z7 = this.c == yl1.MISSING;
            if (z7) {
                c92 c92Var2 = this.e;
                bi4 bi4Var = (bi4) this.l.getValue();
                CopyOnWriteArrayList copyOnWriteArrayList2 = this.f.d;
                this.g.getClass();
                ArrayList arrayList2 = (ArrayList) c92Var2.e;
                arrayList2.clear();
                if (copyOnWriteArrayList2 == null || copyOnWriteArrayList2.isEmpty()) {
                    mjgVar = mjgVar2;
                    obj = value2;
                    obj2 = Collections.EMPTY_LIST;
                } else {
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj3 : copyOnWriteArrayList2) {
                        try {
                            if (((fda) obj3).e()) {
                                fda fdaVar3 = (fda) obj3;
                                arrayList3.add(new b92(fdaVar3, bi4Var.f(((Long) fdaVar3.a.o().f.get(0)).longValue(), true)));
                            }
                            mjgVar2 = mjgVar2;
                            value2 = value2;
                        } catch (Throwable th) {
                            qr7.o(th);
                            return;
                        }
                    }
                    mjgVar = mjgVar2;
                    obj = value2;
                    obj2 = arrayList3;
                }
                arrayList2.addAll(obj2);
                c92Var2.b(arrayList2, 0, arrayList2.size() - 1);
            } else {
                mjgVar = mjgVar2;
                obj = value2;
            }
            c92 c92Var3 = this.e;
            ArrayList arrayList4 = z7 ? (ArrayList) c92Var3.e : c92Var3.b;
            int iP0 = wm9.P0(yw3.W0(arrayList4, 10));
            if (iP0 < 16) {
                iP0 = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iP0);
            for (Iterator it = arrayList4.iterator(); it.hasNext(); it = it) {
                b92 b92Var = (b92) it.next();
                Long lValueOf2 = Long.valueOf(b92Var.c.a.a);
                j92 j92Var = this.g;
                fda fdaVar4 = b92Var.c;
                rt2 rt2Var5 = b92Var.a;
                boolean zC = ((jcd) j92Var.c.getValue()).c(rt2Var5, b92Var.b);
                bm1 bm1Var2 = j92Var.a;
                bm1Var2.getClass();
                ArrayList arrayList5 = b92Var.d;
                int size2 = arrayList5 == null ? i5 : arrayList5.size();
                vg4 vg4Var5 = b92Var.b;
                CharSequence charSequenceU = "";
                if (vg4Var5 != null && size2 > 0) {
                    int i6 = size2 + 1;
                    Context context2 = bm1Var2.a;
                    String strK = vg4Var5.k();
                    if (strK == null) {
                        strK = "";
                    }
                    string = context2.getString(R.string.call_history_item_call_call_title_with_count_calls, strK, Integer.valueOf(i6));
                } else if (vg4Var5 != null) {
                    string = vg4Var5.k();
                    if (string == null) {
                        str = "";
                    }
                    r66Var = r66.a;
                    rt2Var = b92Var.a;
                    fdaVar = b92Var.c;
                    vg4Var = b92Var.b;
                    strE = null;
                    if (vg4Var != null) {
                        nw7Var = new ow7(vg4Var.v(), fdaVar.a.h, b92Var.a(), r66Var, 0L, fdaVar.a.c);
                        r66Var2 = r66Var;
                    } else {
                        r66Var2 = r66Var;
                        if (rt2Var == null && rt2Var.o0()) {
                            sfa sfaVar2 = fdaVar.a;
                            if ((sfaVar2 != null ? sfaVar2.o() : null) != null) {
                                sfa sfaVar3 = fdaVar.a;
                                String str3 = (sfaVar3 == null || (e60VarO2 = sfaVar3.o()) == null) ? null : e60VarO2.b;
                                nw7Var = new nw7(str3 == null ? "" : str3, rt2Var.a, Long.valueOf(rt2Var.A()), str, b92Var.a(), r66Var2, fdaVar.a.c);
                            } else {
                                if (rt2Var != null) {
                                    lw7Var = pw7.a;
                                } else {
                                    lw7Var = pw7.a;
                                }
                                nw7Var = lw7Var;
                            }
                        } else {
                            if (rt2Var != null || rt2Var.o0()) {
                                lw7Var = pw7.a;
                            } else {
                                long jA2 = rt2Var.A();
                                long j3 = rt2Var.a;
                                boolean zM0 = rt2Var.m0();
                                ArrayList arrayListA = b92Var.a();
                                String str4 = (fdaVar == null || (sfaVar = fdaVar.a) == null || (e60VarO = sfaVar.o()) == null) ? null : e60VarO.b;
                                lw7Var = new lw7(jA2, j3, zM0, arrayListA, str4 == null ? "" : str4, r66Var2, fdaVar.a.c);
                                r66Var2 = r66Var2;
                            }
                            nw7Var = lw7Var;
                        }
                    }
                    j = b92Var.c.a.a;
                    vg4Var2 = b92Var.b;
                    if (vg4Var2 != null) {
                        jA = vg4Var2.v();
                    } else {
                        rt2Var2 = b92Var.a;
                        if (rt2Var2 != null) {
                            jA = rt2Var2.A();
                        } else {
                            jA = BuildConfig.MAX_TIME_TO_UPLOAD;
                        }
                    }
                    long j4 = jA;
                    if (zC) {
                        strS = ((jcd) j92Var.c.getValue()).a().toString();
                    } else {
                        us0Var = us0.b;
                        vg4Var3 = b92Var.b;
                        if (vg4Var3 != null) {
                            strS = kh4.a(vg4Var3, us0Var);
                        } else {
                            rt2Var3 = b92Var.a;
                            if (rt2Var3 != null) {
                                strS = rt2Var3.s(us0Var, rs0.a);
                            } else {
                                strS = null;
                            }
                        }
                        String str5 = strS;
                        if (fdaVar4 == null && fdaVar4.e() && fdaVar4.d()) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (fdaVar4 != null) {
                            e60VarO7 = fdaVar4.a.o();
                            if (e60VarO7 == null && e60VarO7.k()) {
                                i4 = 2;
                            } else {
                                i4 = 1;
                            }
                            i = i4;
                        } else {
                            i = 1;
                        }
                        bm1Var = j92Var.a;
                        if (zC) {
                            if (b92Var.b != null) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            Context context3 = bm1Var.a;
                            bm1Var.b.getClass();
                            if (rt2Var5 != null) {
                                z6 = true;
                                if (rt2Var5.h0()) {
                                    i3 = R.string.portal_blocked_profile;
                                }
                                charSequenceK = context3.getString(i3);
                                j2 = j;
                            } else {
                                z6 = true;
                            }
                            if (z5) {
                                i3 = R.string.portal_blocked_profile;
                            } else if (rt2Var5 == null && rt2Var5.d0() == z6) {
                                i3 = R.string.portal_blocked_channel;
                            } else {
                                i3 = R.string.portal_blocked_chat;
                            }
                            charSequenceK = context3.getString(i3);
                            j2 = j;
                        } else {
                            bm1Var.getClass();
                            if (fdaVar4 == null && rt2Var5 != null && rt2Var5.o0()) {
                                e60 e60VarO8 = fdaVar4.a.o();
                                charSequenceK = bm1Var.b(e60VarO8 != null ? e60VarO8.e : 0L);
                                j2 = j;
                            } else {
                                if (fdaVar4 != null) {
                                    context = bm1Var.a;
                                    e60VarO3 = fdaVar4.a.o();
                                    if (e60VarO3 == null && e60VarO3.k()) {
                                        c = 2;
                                    } else {
                                        c = 1;
                                    }
                                    sfa sfaVar4 = fdaVar4.a;
                                    e60VarO4 = sfaVar4.o();
                                    j2 = j;
                                    if (e60VarO4 != null) {
                                        lValueOf = Long.valueOf(e60VarO4.e);
                                    } else {
                                        lValueOf = null;
                                    }
                                    e60VarO5 = sfaVar4.o();
                                    if (e60VarO5 != null) {
                                        zJ = e60VarO5.j();
                                    } else {
                                        zJ = false;
                                    }
                                    e60VarO6 = sfaVar4.o();
                                    if (e60VarO6 != null) {
                                        zG = e60VarO6.g();
                                    } else {
                                        zG = false;
                                    }
                                    if (fdaVar4.d() || !(fdaVar4.e() || zG || zJ)) {
                                        z3 = false;
                                    } else {
                                        z3 = true;
                                    }
                                    if (fdaVar4.d() && (zJ || zG)) {
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                    if (c != 2 && (z4 || z3)) {
                                        drawable = (Drawable) bm1Var.c.getValue();
                                    } else if (c != 2 && fdaVar4.d()) {
                                        drawable = (Drawable) bm1Var.e.getValue();
                                    } else if (c == 2) {
                                        drawable = (Drawable) bm1Var.g.getValue();
                                    } else if (c != 1 && (z4 || z3)) {
                                        drawable = (Drawable) bm1Var.d.getValue();
                                    } else if (c != 1 && fdaVar4.d()) {
                                        drawable = (Drawable) bm1Var.f.getValue();
                                    } else if (c == 1) {
                                        drawable = (Drawable) bm1Var.h.getValue();
                                    } else {
                                        drawable = null;
                                    }
                                    if (z3) {
                                        strA = context.getString(R.string.call_history_item_call_missed);
                                    } else if (z4) {
                                        strA = context.getString(R.string.call_history_item_call_reject);
                                    } else if (fdaVar4.d()) {
                                        strA = bm1Var.a(lValueOf, R.string.call_history_item_call_incoming);
                                    } else {
                                        strA = bm1Var.a(lValueOf, R.string.call_history_item_call_outgoing);
                                    }
                                    if (drawable != null) {
                                        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
                                        fitFontImageSpan = new FitFontImageSpan(drawable, null, false, false, 14, null);
                                    } else {
                                        fitFontImageSpan = null;
                                    }
                                    charSequenceK = qv1.k("\u200b ", strA);
                                    if (fitFontImageSpan != null) {
                                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequenceK);
                                        i2 = 0;
                                        z2 = true;
                                        spannableStringBuilder.setSpan(fitFontImageSpan, 0, 1, 17);
                                        charSequenceK = spannableStringBuilder;
                                    }
                                } else {
                                    j2 = j;
                                    i2 = 0;
                                    z2 = true;
                                    charSequenceK = "";
                                }
                                CharSequence charSequence = charSequenceK;
                                if (fdaVar4 != null) {
                                    ef3 ef3Var = (ef3) j92Var.b.getValue();
                                    long j5 = fdaVar4.a.c;
                                    p4c p4cVar = (p4c) ef3Var.b.get();
                                    strE = oc9.E(p4cVar.a, p4cVar.f, j5, p4cVar.c.f(), false, false, true);
                                }
                                if (strE == null) {
                                    str2 = "";
                                } else {
                                    str2 = strE;
                                }
                                vg4Var4 = b92Var.b;
                                if (vg4Var4 != null) {
                                    charSequenceU = vg4Var4.u();
                                } else {
                                    rt2Var4 = b92Var.a;
                                    if (rt2Var4 == null && !rt2Var4.o0()) {
                                        rt2 rt2Var6 = b92Var.a;
                                        rt2Var6.L0();
                                        charSequenceU = rt2Var6.m;
                                    }
                                }
                                linkedHashMap.put(lValueOf2, new yw7(j2, j4, charSequenceU, str5, nw7Var instanceof nw7, str, str2, z, charSequence, i, nw7Var, null, r66Var2));
                                i5 = i2;
                            }
                        }
                        i2 = 0;
                        z2 = true;
                        CharSequence charSequence2 = charSequenceK;
                        if (fdaVar4 != null) {
                            ef3 ef3Var2 = (ef3) j92Var.b.getValue();
                            long j6 = fdaVar4.a.c;
                            p4c p4cVar2 = (p4c) ef3Var2.b.get();
                            strE = oc9.E(p4cVar2.a, p4cVar2.f, j6, p4cVar2.c.f(), false, false, true);
                        }
                        if (strE == null) {
                            str2 = "";
                        } else {
                            str2 = strE;
                        }
                        vg4Var4 = b92Var.b;
                        if (vg4Var4 != null) {
                            charSequenceU = vg4Var4.u();
                        } else {
                            rt2Var4 = b92Var.a;
                            if (rt2Var4 == null) {
                            }
                        }
                        linkedHashMap.put(lValueOf2, new yw7(j2, j4, charSequenceU, str5, nw7Var instanceof nw7, str, str2, z, charSequence2, i, nw7Var, null, r66Var2));
                        i5 = i2;
                    }
                    String str6 = strS;
                    if (fdaVar4 == null) {
                        z = false;
                    } else {
                        z = false;
                    }
                    if (fdaVar4 != null) {
                        e60VarO7 = fdaVar4.a.o();
                        if (e60VarO7 == null) {
                            i4 = 1;
                        } else {
                            i4 = 1;
                        }
                        i = i4;
                    } else {
                        i = 1;
                    }
                    bm1Var = j92Var.a;
                    if (zC) {
                        if (b92Var.b != null) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        Context context4 = bm1Var.a;
                        bm1Var.b.getClass();
                        if (rt2Var5 != null) {
                            z6 = true;
                            if (rt2Var5.h0()) {
                                i3 = R.string.portal_blocked_profile;
                            }
                            charSequenceK = context4.getString(i3);
                            j2 = j;
                        } else {
                            z6 = true;
                        }
                        if (z5) {
                            i3 = R.string.portal_blocked_profile;
                        } else if (rt2Var5 == null) {
                            i3 = R.string.portal_blocked_chat;
                        } else {
                            i3 = R.string.portal_blocked_chat;
                        }
                        charSequenceK = context4.getString(i3);
                        j2 = j;
                    } else {
                        bm1Var.getClass();
                        if (fdaVar4 == null) {
                            if (fdaVar4 != null) {
                                context = bm1Var.a;
                                e60VarO3 = fdaVar4.a.o();
                                if (e60VarO3 == null) {
                                    c = 1;
                                } else {
                                    c = 1;
                                }
                                sfa sfaVar5 = fdaVar4.a;
                                e60VarO4 = sfaVar5.o();
                                j2 = j;
                                if (e60VarO4 != null) {
                                    lValueOf = Long.valueOf(e60VarO4.e);
                                } else {
                                    lValueOf = null;
                                }
                                e60VarO5 = sfaVar5.o();
                                if (e60VarO5 != null) {
                                    zJ = e60VarO5.j();
                                } else {
                                    zJ = false;
                                }
                                e60VarO6 = sfaVar5.o();
                                if (e60VarO6 != null) {
                                    zG = e60VarO6.g();
                                } else {
                                    zG = false;
                                }
                                if (fdaVar4.d()) {
                                    z3 = false;
                                } else {
                                    z3 = false;
                                }
                                if (fdaVar4.d()) {
                                    z4 = false;
                                } else {
                                    z4 = false;
                                }
                                if (c != 2) {
                                    if (c != 2) {
                                        if (c == 2) {
                                            drawable = (Drawable) bm1Var.g.getValue();
                                        } else if (c != 1) {
                                            if (c != 1) {
                                                if (c == 1) {
                                                    drawable = (Drawable) bm1Var.h.getValue();
                                                } else {
                                                    drawable = null;
                                                }
                                            } else if (c == 1) {
                                                drawable = (Drawable) bm1Var.h.getValue();
                                            } else {
                                                drawable = null;
                                            }
                                        } else if (c != 1) {
                                            if (c == 1) {
                                                drawable = (Drawable) bm1Var.h.getValue();
                                            } else {
                                                drawable = null;
                                            }
                                        } else if (c == 1) {
                                            drawable = (Drawable) bm1Var.h.getValue();
                                        } else {
                                            drawable = null;
                                        }
                                    } else if (c == 2) {
                                        drawable = (Drawable) bm1Var.g.getValue();
                                    } else if (c != 1) {
                                        if (c != 1) {
                                            if (c == 1) {
                                                drawable = (Drawable) bm1Var.h.getValue();
                                            } else {
                                                drawable = null;
                                            }
                                        } else if (c == 1) {
                                            drawable = (Drawable) bm1Var.h.getValue();
                                        } else {
                                            drawable = null;
                                        }
                                    } else if (c != 1) {
                                        if (c == 1) {
                                            drawable = (Drawable) bm1Var.h.getValue();
                                        } else {
                                            drawable = null;
                                        }
                                    } else if (c == 1) {
                                        drawable = (Drawable) bm1Var.h.getValue();
                                    } else {
                                        drawable = null;
                                    }
                                } else if (c != 2) {
                                    if (c == 2) {
                                        drawable = (Drawable) bm1Var.g.getValue();
                                    } else if (c != 1) {
                                        if (c != 1) {
                                            if (c == 1) {
                                                drawable = (Drawable) bm1Var.h.getValue();
                                            } else {
                                                drawable = null;
                                            }
                                        } else if (c == 1) {
                                            drawable = (Drawable) bm1Var.h.getValue();
                                        } else {
                                            drawable = null;
                                        }
                                    } else if (c != 1) {
                                        if (c == 1) {
                                            drawable = (Drawable) bm1Var.h.getValue();
                                        } else {
                                            drawable = null;
                                        }
                                    } else if (c == 1) {
                                        drawable = (Drawable) bm1Var.h.getValue();
                                    } else {
                                        drawable = null;
                                    }
                                } else if (c == 2) {
                                    drawable = (Drawable) bm1Var.g.getValue();
                                } else if (c != 1) {
                                    if (c != 1) {
                                        if (c == 1) {
                                            drawable = (Drawable) bm1Var.h.getValue();
                                        } else {
                                            drawable = null;
                                        }
                                    } else if (c == 1) {
                                        drawable = (Drawable) bm1Var.h.getValue();
                                    } else {
                                        drawable = null;
                                    }
                                } else if (c != 1) {
                                    if (c == 1) {
                                        drawable = (Drawable) bm1Var.h.getValue();
                                    } else {
                                        drawable = null;
                                    }
                                } else if (c == 1) {
                                    drawable = (Drawable) bm1Var.h.getValue();
                                } else {
                                    drawable = null;
                                }
                                if (z3) {
                                    strA = context.getString(R.string.call_history_item_call_missed);
                                } else if (z4) {
                                    strA = context.getString(R.string.call_history_item_call_reject);
                                } else if (fdaVar4.d()) {
                                    strA = bm1Var.a(lValueOf, R.string.call_history_item_call_incoming);
                                } else {
                                    strA = bm1Var.a(lValueOf, R.string.call_history_item_call_outgoing);
                                }
                                if (drawable != null) {
                                    drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
                                    fitFontImageSpan = new FitFontImageSpan(drawable, null, false, false, 14, null);
                                } else {
                                    fitFontImageSpan = null;
                                }
                                charSequenceK = qv1.k("\u200b ", strA);
                                if (fitFontImageSpan != null) {
                                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(charSequenceK);
                                    i2 = 0;
                                    z2 = true;
                                    spannableStringBuilder2.setSpan(fitFontImageSpan, 0, 1, 17);
                                    charSequenceK = spannableStringBuilder2;
                                }
                            } else {
                                j2 = j;
                                i2 = 0;
                                z2 = true;
                                charSequenceK = "";
                            }
                        } else if (fdaVar4 != null) {
                            context = bm1Var.a;
                            e60VarO3 = fdaVar4.a.o();
                            if (e60VarO3 == null) {
                                c = 1;
                            } else {
                                c = 1;
                            }
                            sfa sfaVar6 = fdaVar4.a;
                            e60VarO4 = sfaVar6.o();
                            j2 = j;
                            if (e60VarO4 != null) {
                                lValueOf = Long.valueOf(e60VarO4.e);
                            } else {
                                lValueOf = null;
                            }
                            e60VarO5 = sfaVar6.o();
                            if (e60VarO5 != null) {
                                zJ = e60VarO5.j();
                            } else {
                                zJ = false;
                            }
                            e60VarO6 = sfaVar6.o();
                            if (e60VarO6 != null) {
                                zG = e60VarO6.g();
                            } else {
                                zG = false;
                            }
                            if (fdaVar4.d()) {
                                z3 = false;
                            } else {
                                z3 = false;
                            }
                            if (fdaVar4.d()) {
                                z4 = false;
                            } else {
                                z4 = false;
                            }
                            if (c != 2) {
                                if (c != 2) {
                                    if (c == 2) {
                                        drawable = (Drawable) bm1Var.g.getValue();
                                    } else if (c != 1) {
                                        if (c != 1) {
                                            if (c == 1) {
                                                drawable = (Drawable) bm1Var.h.getValue();
                                            } else {
                                                drawable = null;
                                            }
                                        } else if (c == 1) {
                                            drawable = (Drawable) bm1Var.h.getValue();
                                        } else {
                                            drawable = null;
                                        }
                                    } else if (c != 1) {
                                        if (c == 1) {
                                            drawable = (Drawable) bm1Var.h.getValue();
                                        } else {
                                            drawable = null;
                                        }
                                    } else if (c == 1) {
                                        drawable = (Drawable) bm1Var.h.getValue();
                                    } else {
                                        drawable = null;
                                    }
                                } else if (c == 2) {
                                    drawable = (Drawable) bm1Var.g.getValue();
                                } else if (c != 1) {
                                    if (c != 1) {
                                        if (c == 1) {
                                            drawable = (Drawable) bm1Var.h.getValue();
                                        } else {
                                            drawable = null;
                                        }
                                    } else if (c == 1) {
                                        drawable = (Drawable) bm1Var.h.getValue();
                                    } else {
                                        drawable = null;
                                    }
                                } else if (c != 1) {
                                    if (c == 1) {
                                        drawable = (Drawable) bm1Var.h.getValue();
                                    } else {
                                        drawable = null;
                                    }
                                } else if (c == 1) {
                                    drawable = (Drawable) bm1Var.h.getValue();
                                } else {
                                    drawable = null;
                                }
                            } else if (c != 2) {
                                if (c == 2) {
                                    drawable = (Drawable) bm1Var.g.getValue();
                                } else if (c != 1) {
                                    if (c != 1) {
                                        if (c == 1) {
                                            drawable = (Drawable) bm1Var.h.getValue();
                                        } else {
                                            drawable = null;
                                        }
                                    } else if (c == 1) {
                                        drawable = (Drawable) bm1Var.h.getValue();
                                    } else {
                                        drawable = null;
                                    }
                                } else if (c != 1) {
                                    if (c == 1) {
                                        drawable = (Drawable) bm1Var.h.getValue();
                                    } else {
                                        drawable = null;
                                    }
                                } else if (c == 1) {
                                    drawable = (Drawable) bm1Var.h.getValue();
                                } else {
                                    drawable = null;
                                }
                            } else if (c == 2) {
                                drawable = (Drawable) bm1Var.g.getValue();
                            } else if (c != 1) {
                                if (c != 1) {
                                    if (c == 1) {
                                        drawable = (Drawable) bm1Var.h.getValue();
                                    } else {
                                        drawable = null;
                                    }
                                } else if (c == 1) {
                                    drawable = (Drawable) bm1Var.h.getValue();
                                } else {
                                    drawable = null;
                                }
                            } else if (c != 1) {
                                if (c == 1) {
                                    drawable = (Drawable) bm1Var.h.getValue();
                                } else {
                                    drawable = null;
                                }
                            } else if (c == 1) {
                                drawable = (Drawable) bm1Var.h.getValue();
                            } else {
                                drawable = null;
                            }
                            if (z3) {
                                strA = context.getString(R.string.call_history_item_call_missed);
                            } else if (z4) {
                                strA = context.getString(R.string.call_history_item_call_reject);
                            } else if (fdaVar4.d()) {
                                strA = bm1Var.a(lValueOf, R.string.call_history_item_call_incoming);
                            } else {
                                strA = bm1Var.a(lValueOf, R.string.call_history_item_call_outgoing);
                            }
                            if (drawable != null) {
                                drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
                                fitFontImageSpan = new FitFontImageSpan(drawable, null, false, false, 14, null);
                            } else {
                                fitFontImageSpan = null;
                            }
                            charSequenceK = qv1.k("\u200b ", strA);
                            if (fitFontImageSpan != null) {
                                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(charSequenceK);
                                i2 = 0;
                                z2 = true;
                                spannableStringBuilder3.setSpan(fitFontImageSpan, 0, 1, 17);
                                charSequenceK = spannableStringBuilder3;
                            }
                        } else {
                            j2 = j;
                            i2 = 0;
                            z2 = true;
                            charSequenceK = "";
                        }
                        CharSequence charSequence3 = charSequenceK;
                        if (fdaVar4 != null) {
                            ef3 ef3Var3 = (ef3) j92Var.b.getValue();
                            long j7 = fdaVar4.a.c;
                            p4c p4cVar3 = (p4c) ef3Var3.b.get();
                            strE = oc9.E(p4cVar3.a, p4cVar3.f, j7, p4cVar3.c.f(), false, false, true);
                        }
                        if (strE == null) {
                            str2 = "";
                        } else {
                            str2 = strE;
                        }
                        vg4Var4 = b92Var.b;
                        if (vg4Var4 != null) {
                            charSequenceU = vg4Var4.u();
                        } else {
                            rt2Var4 = b92Var.a;
                            if (rt2Var4 == null) {
                            }
                        }
                        linkedHashMap.put(lValueOf2, new yw7(j2, j4, charSequenceU, str6, nw7Var instanceof nw7, str, str2, z, charSequence3, i, nw7Var, null, r66Var2));
                        i5 = i2;
                    }
                    i2 = 0;
                    z2 = true;
                    CharSequence charSequence4 = charSequenceK;
                    if (fdaVar4 != null) {
                        ef3 ef3Var4 = (ef3) j92Var.b.getValue();
                        long j8 = fdaVar4.a.c;
                        p4c p4cVar4 = (p4c) ef3Var4.b.get();
                        strE = oc9.E(p4cVar4.a, p4cVar4.f, j8, p4cVar4.c.f(), false, false, true);
                    }
                    if (strE == null) {
                        str2 = "";
                    } else {
                        str2 = strE;
                    }
                    vg4Var4 = b92Var.b;
                    if (vg4Var4 != null) {
                        charSequenceU = vg4Var4.u();
                    } else {
                        rt2Var4 = b92Var.a;
                        if (rt2Var4 == null) {
                        }
                    }
                    linkedHashMap.put(lValueOf2, new yw7(j2, j4, charSequenceU, str6, nw7Var instanceof nw7, str, str2, z, charSequence4, i, nw7Var, null, r66Var2));
                    i5 = i2;
                } else {
                    rt2 rt2Var7 = b92Var.a;
                    if (rt2Var7 != null) {
                        rt2Var7.K0();
                        string = rt2Var7.j.toString();
                    } else {
                        string = bm1Var2.a.getString(R.string.call_history_item_call_unknown_call_title);
                    }
                }
                str = string;
                r66Var = r66.a;
                rt2Var = b92Var.a;
                fdaVar = b92Var.c;
                vg4Var = b92Var.b;
                strE = null;
                if (vg4Var != null) {
                    nw7Var = new ow7(vg4Var.v(), fdaVar.a.h, b92Var.a(), r66Var, 0L, fdaVar.a.c);
                    r66Var2 = r66Var;
                } else {
                    r66Var2 = r66Var;
                    if (rt2Var == null) {
                        if (rt2Var != null) {
                            lw7Var = pw7.a;
                        } else {
                            lw7Var = pw7.a;
                        }
                        nw7Var = lw7Var;
                    } else {
                        if (rt2Var != null) {
                            lw7Var = pw7.a;
                        } else {
                            lw7Var = pw7.a;
                        }
                        nw7Var = lw7Var;
                    }
                }
                j = b92Var.c.a.a;
                vg4Var2 = b92Var.b;
                if (vg4Var2 != null) {
                    jA = vg4Var2.v();
                } else {
                    rt2Var2 = b92Var.a;
                    if (rt2Var2 != null) {
                        jA = rt2Var2.A();
                    } else {
                        jA = BuildConfig.MAX_TIME_TO_UPLOAD;
                    }
                }
                long j9 = jA;
                if (zC) {
                    strS = ((jcd) j92Var.c.getValue()).a().toString();
                } else {
                    us0Var = us0.b;
                    vg4Var3 = b92Var.b;
                    if (vg4Var3 != null) {
                        strS = kh4.a(vg4Var3, us0Var);
                    } else {
                        rt2Var3 = b92Var.a;
                        if (rt2Var3 != null) {
                            strS = rt2Var3.s(us0Var, rs0.a);
                        } else {
                            strS = null;
                        }
                    }
                    String str7 = strS;
                    if (fdaVar4 == null) {
                        z = false;
                    } else {
                        z = false;
                    }
                    if (fdaVar4 != null) {
                        e60VarO7 = fdaVar4.a.o();
                        if (e60VarO7 == null) {
                            i4 = 1;
                        } else {
                            i4 = 1;
                        }
                        i = i4;
                    } else {
                        i = 1;
                    }
                    bm1Var = j92Var.a;
                    if (zC) {
                        if (b92Var.b != null) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        Context context5 = bm1Var.a;
                        bm1Var.b.getClass();
                        if (rt2Var5 != null) {
                            z6 = true;
                            if (rt2Var5.h0()) {
                                i3 = R.string.portal_blocked_profile;
                            }
                            charSequenceK = context5.getString(i3);
                            j2 = j;
                        } else {
                            z6 = true;
                        }
                        if (z5) {
                            i3 = R.string.portal_blocked_profile;
                        } else if (rt2Var5 == null) {
                            i3 = R.string.portal_blocked_chat;
                        } else {
                            i3 = R.string.portal_blocked_chat;
                        }
                        charSequenceK = context5.getString(i3);
                        j2 = j;
                    } else {
                        bm1Var.getClass();
                        if (fdaVar4 == null) {
                            if (fdaVar4 != null) {
                                context = bm1Var.a;
                                e60VarO3 = fdaVar4.a.o();
                                if (e60VarO3 == null) {
                                    c = 1;
                                } else {
                                    c = 1;
                                }
                                sfa sfaVar7 = fdaVar4.a;
                                e60VarO4 = sfaVar7.o();
                                j2 = j;
                                if (e60VarO4 != null) {
                                    lValueOf = Long.valueOf(e60VarO4.e);
                                } else {
                                    lValueOf = null;
                                }
                                e60VarO5 = sfaVar7.o();
                                if (e60VarO5 != null) {
                                    zJ = e60VarO5.j();
                                } else {
                                    zJ = false;
                                }
                                e60VarO6 = sfaVar7.o();
                                if (e60VarO6 != null) {
                                    zG = e60VarO6.g();
                                } else {
                                    zG = false;
                                }
                                if (fdaVar4.d()) {
                                    z3 = false;
                                } else {
                                    z3 = false;
                                }
                                if (fdaVar4.d()) {
                                    z4 = false;
                                } else {
                                    z4 = false;
                                }
                                if (c != 2) {
                                    if (c != 2) {
                                        if (c == 2) {
                                            drawable = (Drawable) bm1Var.g.getValue();
                                        } else if (c != 1) {
                                            if (c != 1) {
                                                if (c == 1) {
                                                    drawable = (Drawable) bm1Var.h.getValue();
                                                } else {
                                                    drawable = null;
                                                }
                                            } else if (c == 1) {
                                                drawable = (Drawable) bm1Var.h.getValue();
                                            } else {
                                                drawable = null;
                                            }
                                        } else if (c != 1) {
                                            if (c == 1) {
                                                drawable = (Drawable) bm1Var.h.getValue();
                                            } else {
                                                drawable = null;
                                            }
                                        } else if (c == 1) {
                                            drawable = (Drawable) bm1Var.h.getValue();
                                        } else {
                                            drawable = null;
                                        }
                                    } else if (c == 2) {
                                        drawable = (Drawable) bm1Var.g.getValue();
                                    } else if (c != 1) {
                                        if (c != 1) {
                                            if (c == 1) {
                                                drawable = (Drawable) bm1Var.h.getValue();
                                            } else {
                                                drawable = null;
                                            }
                                        } else if (c == 1) {
                                            drawable = (Drawable) bm1Var.h.getValue();
                                        } else {
                                            drawable = null;
                                        }
                                    } else if (c != 1) {
                                        if (c == 1) {
                                            drawable = (Drawable) bm1Var.h.getValue();
                                        } else {
                                            drawable = null;
                                        }
                                    } else if (c == 1) {
                                        drawable = (Drawable) bm1Var.h.getValue();
                                    } else {
                                        drawable = null;
                                    }
                                } else if (c != 2) {
                                    if (c == 2) {
                                        drawable = (Drawable) bm1Var.g.getValue();
                                    } else if (c != 1) {
                                        if (c != 1) {
                                            if (c == 1) {
                                                drawable = (Drawable) bm1Var.h.getValue();
                                            } else {
                                                drawable = null;
                                            }
                                        } else if (c == 1) {
                                            drawable = (Drawable) bm1Var.h.getValue();
                                        } else {
                                            drawable = null;
                                        }
                                    } else if (c != 1) {
                                        if (c == 1) {
                                            drawable = (Drawable) bm1Var.h.getValue();
                                        } else {
                                            drawable = null;
                                        }
                                    } else if (c == 1) {
                                        drawable = (Drawable) bm1Var.h.getValue();
                                    } else {
                                        drawable = null;
                                    }
                                } else if (c == 2) {
                                    drawable = (Drawable) bm1Var.g.getValue();
                                } else if (c != 1) {
                                    if (c != 1) {
                                        if (c == 1) {
                                            drawable = (Drawable) bm1Var.h.getValue();
                                        } else {
                                            drawable = null;
                                        }
                                    } else if (c == 1) {
                                        drawable = (Drawable) bm1Var.h.getValue();
                                    } else {
                                        drawable = null;
                                    }
                                } else if (c != 1) {
                                    if (c == 1) {
                                        drawable = (Drawable) bm1Var.h.getValue();
                                    } else {
                                        drawable = null;
                                    }
                                } else if (c == 1) {
                                    drawable = (Drawable) bm1Var.h.getValue();
                                } else {
                                    drawable = null;
                                }
                                if (z3) {
                                    strA = context.getString(R.string.call_history_item_call_missed);
                                } else if (z4) {
                                    strA = context.getString(R.string.call_history_item_call_reject);
                                } else if (fdaVar4.d()) {
                                    strA = bm1Var.a(lValueOf, R.string.call_history_item_call_incoming);
                                } else {
                                    strA = bm1Var.a(lValueOf, R.string.call_history_item_call_outgoing);
                                }
                                if (drawable != null) {
                                    drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
                                    fitFontImageSpan = new FitFontImageSpan(drawable, null, false, false, 14, null);
                                } else {
                                    fitFontImageSpan = null;
                                }
                                charSequenceK = qv1.k("\u200b ", strA);
                                if (fitFontImageSpan != null) {
                                    SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(charSequenceK);
                                    i2 = 0;
                                    z2 = true;
                                    spannableStringBuilder4.setSpan(fitFontImageSpan, 0, 1, 17);
                                    charSequenceK = spannableStringBuilder4;
                                }
                            } else {
                                j2 = j;
                                i2 = 0;
                                z2 = true;
                                charSequenceK = "";
                            }
                        } else if (fdaVar4 != null) {
                            context = bm1Var.a;
                            e60VarO3 = fdaVar4.a.o();
                            if (e60VarO3 == null) {
                                c = 1;
                            } else {
                                c = 1;
                            }
                            sfa sfaVar8 = fdaVar4.a;
                            e60VarO4 = sfaVar8.o();
                            j2 = j;
                            if (e60VarO4 != null) {
                                lValueOf = Long.valueOf(e60VarO4.e);
                            } else {
                                lValueOf = null;
                            }
                            e60VarO5 = sfaVar8.o();
                            if (e60VarO5 != null) {
                                zJ = e60VarO5.j();
                            } else {
                                zJ = false;
                            }
                            e60VarO6 = sfaVar8.o();
                            if (e60VarO6 != null) {
                                zG = e60VarO6.g();
                            } else {
                                zG = false;
                            }
                            if (fdaVar4.d()) {
                                z3 = false;
                            } else {
                                z3 = false;
                            }
                            if (fdaVar4.d()) {
                                z4 = false;
                            } else {
                                z4 = false;
                            }
                            if (c != 2) {
                                if (c != 2) {
                                    if (c == 2) {
                                        drawable = (Drawable) bm1Var.g.getValue();
                                    } else if (c != 1) {
                                        if (c != 1) {
                                            if (c == 1) {
                                                drawable = (Drawable) bm1Var.h.getValue();
                                            } else {
                                                drawable = null;
                                            }
                                        } else if (c == 1) {
                                            drawable = (Drawable) bm1Var.h.getValue();
                                        } else {
                                            drawable = null;
                                        }
                                    } else if (c != 1) {
                                        if (c == 1) {
                                            drawable = (Drawable) bm1Var.h.getValue();
                                        } else {
                                            drawable = null;
                                        }
                                    } else if (c == 1) {
                                        drawable = (Drawable) bm1Var.h.getValue();
                                    } else {
                                        drawable = null;
                                    }
                                } else if (c == 2) {
                                    drawable = (Drawable) bm1Var.g.getValue();
                                } else if (c != 1) {
                                    if (c != 1) {
                                        if (c == 1) {
                                            drawable = (Drawable) bm1Var.h.getValue();
                                        } else {
                                            drawable = null;
                                        }
                                    } else if (c == 1) {
                                        drawable = (Drawable) bm1Var.h.getValue();
                                    } else {
                                        drawable = null;
                                    }
                                } else if (c != 1) {
                                    if (c == 1) {
                                        drawable = (Drawable) bm1Var.h.getValue();
                                    } else {
                                        drawable = null;
                                    }
                                } else if (c == 1) {
                                    drawable = (Drawable) bm1Var.h.getValue();
                                } else {
                                    drawable = null;
                                }
                            } else if (c != 2) {
                                if (c == 2) {
                                    drawable = (Drawable) bm1Var.g.getValue();
                                } else if (c != 1) {
                                    if (c != 1) {
                                        if (c == 1) {
                                            drawable = (Drawable) bm1Var.h.getValue();
                                        } else {
                                            drawable = null;
                                        }
                                    } else if (c == 1) {
                                        drawable = (Drawable) bm1Var.h.getValue();
                                    } else {
                                        drawable = null;
                                    }
                                } else if (c != 1) {
                                    if (c == 1) {
                                        drawable = (Drawable) bm1Var.h.getValue();
                                    } else {
                                        drawable = null;
                                    }
                                } else if (c == 1) {
                                    drawable = (Drawable) bm1Var.h.getValue();
                                } else {
                                    drawable = null;
                                }
                            } else if (c == 2) {
                                drawable = (Drawable) bm1Var.g.getValue();
                            } else if (c != 1) {
                                if (c != 1) {
                                    if (c == 1) {
                                        drawable = (Drawable) bm1Var.h.getValue();
                                    } else {
                                        drawable = null;
                                    }
                                } else if (c == 1) {
                                    drawable = (Drawable) bm1Var.h.getValue();
                                } else {
                                    drawable = null;
                                }
                            } else if (c != 1) {
                                if (c == 1) {
                                    drawable = (Drawable) bm1Var.h.getValue();
                                } else {
                                    drawable = null;
                                }
                            } else if (c == 1) {
                                drawable = (Drawable) bm1Var.h.getValue();
                            } else {
                                drawable = null;
                            }
                            if (z3) {
                                strA = context.getString(R.string.call_history_item_call_missed);
                            } else if (z4) {
                                strA = context.getString(R.string.call_history_item_call_reject);
                            } else if (fdaVar4.d()) {
                                strA = bm1Var.a(lValueOf, R.string.call_history_item_call_incoming);
                            } else {
                                strA = bm1Var.a(lValueOf, R.string.call_history_item_call_outgoing);
                            }
                            if (drawable != null) {
                                drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
                                fitFontImageSpan = new FitFontImageSpan(drawable, null, false, false, 14, null);
                            } else {
                                fitFontImageSpan = null;
                            }
                            charSequenceK = qv1.k("\u200b ", strA);
                            if (fitFontImageSpan != null) {
                                SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(charSequenceK);
                                i2 = 0;
                                z2 = true;
                                spannableStringBuilder5.setSpan(fitFontImageSpan, 0, 1, 17);
                                charSequenceK = spannableStringBuilder5;
                            }
                        } else {
                            j2 = j;
                            i2 = 0;
                            z2 = true;
                            charSequenceK = "";
                        }
                        CharSequence charSequence5 = charSequenceK;
                        if (fdaVar4 != null) {
                            ef3 ef3Var5 = (ef3) j92Var.b.getValue();
                            long j10 = fdaVar4.a.c;
                            p4c p4cVar5 = (p4c) ef3Var5.b.get();
                            strE = oc9.E(p4cVar5.a, p4cVar5.f, j10, p4cVar5.c.f(), false, false, true);
                        }
                        if (strE == null) {
                            str2 = "";
                        } else {
                            str2 = strE;
                        }
                        vg4Var4 = b92Var.b;
                        if (vg4Var4 != null) {
                            charSequenceU = vg4Var4.u();
                        } else {
                            rt2Var4 = b92Var.a;
                            if (rt2Var4 == null) {
                            }
                        }
                        linkedHashMap.put(lValueOf2, new yw7(j2, j9, charSequenceU, str7, nw7Var instanceof nw7, str, str2, z, charSequence5, i, nw7Var, null, r66Var2));
                        i5 = i2;
                    }
                    i2 = 0;
                    z2 = true;
                    CharSequence charSequence6 = charSequenceK;
                    if (fdaVar4 != null) {
                        ef3 ef3Var6 = (ef3) j92Var.b.getValue();
                        long j11 = fdaVar4.a.c;
                        p4c p4cVar6 = (p4c) ef3Var6.b.get();
                        strE = oc9.E(p4cVar6.a, p4cVar6.f, j11, p4cVar6.c.f(), false, false, true);
                    }
                    if (strE == null) {
                        str2 = "";
                    } else {
                        str2 = strE;
                    }
                    vg4Var4 = b92Var.b;
                    if (vg4Var4 != null) {
                        charSequenceU = vg4Var4.u();
                    } else {
                        rt2Var4 = b92Var.a;
                        if (rt2Var4 == null) {
                        }
                    }
                    linkedHashMap.put(lValueOf2, new yw7(j2, j9, charSequenceU, str7, nw7Var instanceof nw7, str, str2, z, charSequence6, i, nw7Var, null, r66Var2));
                    i5 = i2;
                }
                String str8 = strS;
                if (fdaVar4 == null) {
                    z = false;
                } else {
                    z = false;
                }
                if (fdaVar4 != null) {
                    e60VarO7 = fdaVar4.a.o();
                    if (e60VarO7 == null) {
                        i4 = 1;
                    } else {
                        i4 = 1;
                    }
                    i = i4;
                } else {
                    i = 1;
                }
                bm1Var = j92Var.a;
                if (zC) {
                    if (b92Var.b != null) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    Context context6 = bm1Var.a;
                    bm1Var.b.getClass();
                    if (rt2Var5 != null) {
                        z6 = true;
                        if (rt2Var5.h0()) {
                            i3 = R.string.portal_blocked_profile;
                        }
                        charSequenceK = context6.getString(i3);
                        j2 = j;
                    } else {
                        z6 = true;
                    }
                    if (z5) {
                        i3 = R.string.portal_blocked_profile;
                    } else if (rt2Var5 == null) {
                        i3 = R.string.portal_blocked_chat;
                    } else {
                        i3 = R.string.portal_blocked_chat;
                    }
                    charSequenceK = context6.getString(i3);
                    j2 = j;
                } else {
                    bm1Var.getClass();
                    if (fdaVar4 == null) {
                        if (fdaVar4 != null) {
                            context = bm1Var.a;
                            e60VarO3 = fdaVar4.a.o();
                            if (e60VarO3 == null) {
                                c = 1;
                            } else {
                                c = 1;
                            }
                            sfa sfaVar9 = fdaVar4.a;
                            e60VarO4 = sfaVar9.o();
                            j2 = j;
                            if (e60VarO4 != null) {
                                lValueOf = Long.valueOf(e60VarO4.e);
                            } else {
                                lValueOf = null;
                            }
                            e60VarO5 = sfaVar9.o();
                            if (e60VarO5 != null) {
                                zJ = e60VarO5.j();
                            } else {
                                zJ = false;
                            }
                            e60VarO6 = sfaVar9.o();
                            if (e60VarO6 != null) {
                                zG = e60VarO6.g();
                            } else {
                                zG = false;
                            }
                            if (fdaVar4.d()) {
                                z3 = false;
                            } else {
                                z3 = false;
                            }
                            if (fdaVar4.d()) {
                                z4 = false;
                            } else {
                                z4 = false;
                            }
                            if (c != 2) {
                                if (c != 2) {
                                    if (c == 2) {
                                        drawable = (Drawable) bm1Var.g.getValue();
                                    } else if (c != 1) {
                                        if (c != 1) {
                                            if (c == 1) {
                                                drawable = (Drawable) bm1Var.h.getValue();
                                            } else {
                                                drawable = null;
                                            }
                                        } else if (c == 1) {
                                            drawable = (Drawable) bm1Var.h.getValue();
                                        } else {
                                            drawable = null;
                                        }
                                    } else if (c != 1) {
                                        if (c == 1) {
                                            drawable = (Drawable) bm1Var.h.getValue();
                                        } else {
                                            drawable = null;
                                        }
                                    } else if (c == 1) {
                                        drawable = (Drawable) bm1Var.h.getValue();
                                    } else {
                                        drawable = null;
                                    }
                                } else if (c == 2) {
                                    drawable = (Drawable) bm1Var.g.getValue();
                                } else if (c != 1) {
                                    if (c != 1) {
                                        if (c == 1) {
                                            drawable = (Drawable) bm1Var.h.getValue();
                                        } else {
                                            drawable = null;
                                        }
                                    } else if (c == 1) {
                                        drawable = (Drawable) bm1Var.h.getValue();
                                    } else {
                                        drawable = null;
                                    }
                                } else if (c != 1) {
                                    if (c == 1) {
                                        drawable = (Drawable) bm1Var.h.getValue();
                                    } else {
                                        drawable = null;
                                    }
                                } else if (c == 1) {
                                    drawable = (Drawable) bm1Var.h.getValue();
                                } else {
                                    drawable = null;
                                }
                            } else if (c != 2) {
                                if (c == 2) {
                                    drawable = (Drawable) bm1Var.g.getValue();
                                } else if (c != 1) {
                                    if (c != 1) {
                                        if (c == 1) {
                                            drawable = (Drawable) bm1Var.h.getValue();
                                        } else {
                                            drawable = null;
                                        }
                                    } else if (c == 1) {
                                        drawable = (Drawable) bm1Var.h.getValue();
                                    } else {
                                        drawable = null;
                                    }
                                } else if (c != 1) {
                                    if (c == 1) {
                                        drawable = (Drawable) bm1Var.h.getValue();
                                    } else {
                                        drawable = null;
                                    }
                                } else if (c == 1) {
                                    drawable = (Drawable) bm1Var.h.getValue();
                                } else {
                                    drawable = null;
                                }
                            } else if (c == 2) {
                                drawable = (Drawable) bm1Var.g.getValue();
                            } else if (c != 1) {
                                if (c != 1) {
                                    if (c == 1) {
                                        drawable = (Drawable) bm1Var.h.getValue();
                                    } else {
                                        drawable = null;
                                    }
                                } else if (c == 1) {
                                    drawable = (Drawable) bm1Var.h.getValue();
                                } else {
                                    drawable = null;
                                }
                            } else if (c != 1) {
                                if (c == 1) {
                                    drawable = (Drawable) bm1Var.h.getValue();
                                } else {
                                    drawable = null;
                                }
                            } else if (c == 1) {
                                drawable = (Drawable) bm1Var.h.getValue();
                            } else {
                                drawable = null;
                            }
                            if (z3) {
                                strA = context.getString(R.string.call_history_item_call_missed);
                            } else if (z4) {
                                strA = context.getString(R.string.call_history_item_call_reject);
                            } else if (fdaVar4.d()) {
                                strA = bm1Var.a(lValueOf, R.string.call_history_item_call_incoming);
                            } else {
                                strA = bm1Var.a(lValueOf, R.string.call_history_item_call_outgoing);
                            }
                            if (drawable != null) {
                                drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
                                fitFontImageSpan = new FitFontImageSpan(drawable, null, false, false, 14, null);
                            } else {
                                fitFontImageSpan = null;
                            }
                            charSequenceK = qv1.k("\u200b ", strA);
                            if (fitFontImageSpan != null) {
                                SpannableStringBuilder spannableStringBuilder6 = new SpannableStringBuilder(charSequenceK);
                                i2 = 0;
                                z2 = true;
                                spannableStringBuilder6.setSpan(fitFontImageSpan, 0, 1, 17);
                                charSequenceK = spannableStringBuilder6;
                            }
                        } else {
                            j2 = j;
                            i2 = 0;
                            z2 = true;
                            charSequenceK = "";
                        }
                    } else if (fdaVar4 != null) {
                        context = bm1Var.a;
                        e60VarO3 = fdaVar4.a.o();
                        if (e60VarO3 == null) {
                            c = 1;
                        } else {
                            c = 1;
                        }
                        sfa sfaVar10 = fdaVar4.a;
                        e60VarO4 = sfaVar10.o();
                        j2 = j;
                        if (e60VarO4 != null) {
                            lValueOf = Long.valueOf(e60VarO4.e);
                        } else {
                            lValueOf = null;
                        }
                        e60VarO5 = sfaVar10.o();
                        if (e60VarO5 != null) {
                            zJ = e60VarO5.j();
                        } else {
                            zJ = false;
                        }
                        e60VarO6 = sfaVar10.o();
                        if (e60VarO6 != null) {
                            zG = e60VarO6.g();
                        } else {
                            zG = false;
                        }
                        if (fdaVar4.d()) {
                            z3 = false;
                        } else {
                            z3 = false;
                        }
                        if (fdaVar4.d()) {
                            z4 = false;
                        } else {
                            z4 = false;
                        }
                        if (c != 2) {
                            if (c != 2) {
                                if (c == 2) {
                                    drawable = (Drawable) bm1Var.g.getValue();
                                } else if (c != 1) {
                                    if (c != 1) {
                                        if (c == 1) {
                                            drawable = (Drawable) bm1Var.h.getValue();
                                        } else {
                                            drawable = null;
                                        }
                                    } else if (c == 1) {
                                        drawable = (Drawable) bm1Var.h.getValue();
                                    } else {
                                        drawable = null;
                                    }
                                } else if (c != 1) {
                                    if (c == 1) {
                                        drawable = (Drawable) bm1Var.h.getValue();
                                    } else {
                                        drawable = null;
                                    }
                                } else if (c == 1) {
                                    drawable = (Drawable) bm1Var.h.getValue();
                                } else {
                                    drawable = null;
                                }
                            } else if (c == 2) {
                                drawable = (Drawable) bm1Var.g.getValue();
                            } else if (c != 1) {
                                if (c != 1) {
                                    if (c == 1) {
                                        drawable = (Drawable) bm1Var.h.getValue();
                                    } else {
                                        drawable = null;
                                    }
                                } else if (c == 1) {
                                    drawable = (Drawable) bm1Var.h.getValue();
                                } else {
                                    drawable = null;
                                }
                            } else if (c != 1) {
                                if (c == 1) {
                                    drawable = (Drawable) bm1Var.h.getValue();
                                } else {
                                    drawable = null;
                                }
                            } else if (c == 1) {
                                drawable = (Drawable) bm1Var.h.getValue();
                            } else {
                                drawable = null;
                            }
                        } else if (c != 2) {
                            if (c == 2) {
                                drawable = (Drawable) bm1Var.g.getValue();
                            } else if (c != 1) {
                                if (c != 1) {
                                    if (c == 1) {
                                        drawable = (Drawable) bm1Var.h.getValue();
                                    } else {
                                        drawable = null;
                                    }
                                } else if (c == 1) {
                                    drawable = (Drawable) bm1Var.h.getValue();
                                } else {
                                    drawable = null;
                                }
                            } else if (c != 1) {
                                if (c == 1) {
                                    drawable = (Drawable) bm1Var.h.getValue();
                                } else {
                                    drawable = null;
                                }
                            } else if (c == 1) {
                                drawable = (Drawable) bm1Var.h.getValue();
                            } else {
                                drawable = null;
                            }
                        } else if (c == 2) {
                            drawable = (Drawable) bm1Var.g.getValue();
                        } else if (c != 1) {
                            if (c != 1) {
                                if (c == 1) {
                                    drawable = (Drawable) bm1Var.h.getValue();
                                } else {
                                    drawable = null;
                                }
                            } else if (c == 1) {
                                drawable = (Drawable) bm1Var.h.getValue();
                            } else {
                                drawable = null;
                            }
                        } else if (c != 1) {
                            if (c == 1) {
                                drawable = (Drawable) bm1Var.h.getValue();
                            } else {
                                drawable = null;
                            }
                        } else if (c == 1) {
                            drawable = (Drawable) bm1Var.h.getValue();
                        } else {
                            drawable = null;
                        }
                        if (z3) {
                            strA = context.getString(R.string.call_history_item_call_missed);
                        } else if (z4) {
                            strA = context.getString(R.string.call_history_item_call_reject);
                        } else if (fdaVar4.d()) {
                            strA = bm1Var.a(lValueOf, R.string.call_history_item_call_incoming);
                        } else {
                            strA = bm1Var.a(lValueOf, R.string.call_history_item_call_outgoing);
                        }
                        if (drawable != null) {
                            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
                            fitFontImageSpan = new FitFontImageSpan(drawable, null, false, false, 14, null);
                        } else {
                            fitFontImageSpan = null;
                        }
                        charSequenceK = qv1.k("\u200b ", strA);
                        if (fitFontImageSpan != null) {
                            SpannableStringBuilder spannableStringBuilder7 = new SpannableStringBuilder(charSequenceK);
                            i2 = 0;
                            z2 = true;
                            spannableStringBuilder7.setSpan(fitFontImageSpan, 0, 1, 17);
                            charSequenceK = spannableStringBuilder7;
                        }
                    } else {
                        j2 = j;
                        i2 = 0;
                        z2 = true;
                        charSequenceK = "";
                    }
                    CharSequence charSequence7 = charSequenceK;
                    if (fdaVar4 != null) {
                        ef3 ef3Var7 = (ef3) j92Var.b.getValue();
                        long j12 = fdaVar4.a.c;
                        p4c p4cVar7 = (p4c) ef3Var7.b.get();
                        strE = oc9.E(p4cVar7.a, p4cVar7.f, j12, p4cVar7.c.f(), false, false, true);
                    }
                    if (strE == null) {
                        str2 = "";
                    } else {
                        str2 = strE;
                    }
                    vg4Var4 = b92Var.b;
                    if (vg4Var4 != null) {
                        charSequenceU = vg4Var4.u();
                    } else {
                        rt2Var4 = b92Var.a;
                        if (rt2Var4 == null) {
                        }
                    }
                    linkedHashMap.put(lValueOf2, new yw7(j2, j9, charSequenceU, str8, nw7Var instanceof nw7, str, str2, z, charSequence7, i, nw7Var, null, r66Var2));
                    i5 = i2;
                }
                i2 = 0;
                z2 = true;
                CharSequence charSequence8 = charSequenceK;
                if (fdaVar4 != null) {
                    ef3 ef3Var8 = (ef3) j92Var.b.getValue();
                    long j13 = fdaVar4.a.c;
                    p4c p4cVar8 = (p4c) ef3Var8.b.get();
                    strE = oc9.E(p4cVar8.a, p4cVar8.f, j13, p4cVar8.c.f(), false, false, true);
                }
                if (strE == null) {
                    str2 = "";
                } else {
                    str2 = strE;
                }
                vg4Var4 = b92Var.b;
                if (vg4Var4 != null) {
                    charSequenceU = vg4Var4.u();
                } else {
                    rt2Var4 = b92Var.a;
                    if (rt2Var4 == null) {
                    }
                }
                linkedHashMap.put(lValueOf2, new yw7(j2, j9, charSequenceU, str8, nw7Var instanceof nw7, str, str2, z, charSequence8, i, nw7Var, null, r66Var2));
                i5 = i2;
            }
            if (this.c == yl1.ALL) {
                mjg mjgVar3 = this.w;
                do {
                    value = mjgVar3.getValue();
                    ((Boolean) value).getClass();
                } while (!mjgVar3.h(value, Boolean.valueOf(linkedHashMap.isEmpty())));
            }
            if (mjgVar.h(obj, slcVar instanceof qlc ? new qlc(linkedHashMap) : new qlc(linkedHashMap))) {
                return;
            } else {
                mjgVar2 = mjgVar;
            }
        }
    }
}
