package defpackage;

import android.content.Context;
import android.text.SpannableString;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes.dex */
public final class yfd extends c2f implements nnf {
    public final ny8 A;
    public final ny8 B;
    public final ny8 C;
    public final ifh D;
    public final ifh E;
    public final ConcurrentHashMap F;
    public final ConcurrentHashMap G;
    public final ifh H;
    public final AtomicBoolean I;
    public final p41 J;
    public final ConcurrentHashMap.KeySetView K;
    public final int X;
    public final xhh l;
    public final ite m;
    public final wmi n;
    public final l7f o;
    public final i5d p;
    public final i5d q;
    public final i5d r;
    public final i5d s;
    public final i5d t;
    public final i5d u;
    public final i5d v;
    public final b95 w;
    public final pfh x;
    public final ny8 y;
    public final ny8 z;

    public yfd(Context context, ny8 ny8Var, xhh xhhVar, ite iteVar, wmi wmiVar, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, l7f l7fVar, ny8 ny8Var6, ny8 ny8Var7, ny8 ny8Var8, ny8 ny8Var9, i5d i5dVar, i5d i5dVar2, i5d i5dVar3, i5d i5dVar4, i5d i5dVar5, i5d i5dVar6, i5d i5dVar7, b95 b95Var) {
        pfh pfhVar = new pfh(0);
        super(iteVar, 2);
        this.l = xhhVar;
        this.m = iteVar;
        this.n = wmiVar;
        this.o = l7fVar;
        this.p = i5dVar;
        this.q = i5dVar2;
        this.r = i5dVar3;
        this.s = i5dVar4;
        this.t = i5dVar5;
        this.u = i5dVar6;
        this.v = i5dVar7;
        this.w = b95Var;
        this.x = pfhVar;
        this.y = ny8Var;
        this.z = ny8Var2;
        this.A = ny8Var3;
        this.B = ny8Var4;
        this.C = ny8Var9;
        this.D = new ifh(new j3c(this, context, ny8Var7, ny8Var6, ny8Var5, ny8Var8, iteVar));
        this.E = new ifh(new a5d(7));
        this.F = new ConcurrentHashMap();
        this.G = new ConcurrentHashMap();
        this.H = new ifh(new a5d(8));
        this.I = new AtomicBoolean(false);
        p41 p41VarB = yab.b(0, 0, new g3(26, this), 3);
        this.J = p41VarB;
        gm0.x(this.g, "use new viewport logic", null);
        yab.i0(iteVar, null, 0, new gz(pfhVar, this, (lq4) null, 14), 3);
        tre.m0(e9i.T(new fz6(e9i.E(p41VarB), new l83(this, ny8Var2, ny8Var3, (lq4) null, 9), 3), ((n0c) xhhVar).a()), iteVar);
        b95Var.c(new xfd(this, ConcurrentHashMap.newKeySet()));
        this.K = ConcurrentHashMap.newKeySet(1);
        this.X = 100;
    }

    public final CharSequence A(int i, agd agdVar) {
        int iOrdinal = agdVar.ordinal();
        ny8 ny8Var = this.y;
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                p4c p4cVar = (p4c) ny8Var.getValue();
                String string = p4cVar.a.getString(R.string.tt_contact_status_online);
                SpannableString spannableString = new SpannableString(string);
                spannableString.setSpan(new fqh(pq3.j.e(p4cVar.a).m(), new pyb(2)), 0, string.length(), 33);
                return spannableString;
            }
            if (iOrdinal == 2) {
                return ((p4c) ny8Var.getValue()).a.getString(R.string.presence_was_recently);
            }
            if (iOrdinal == 3) {
                return ((p4c) ny8Var.getValue()).a.getString(R.string.presence_was_long_ago);
            }
            ore.o();
            return null;
        }
        p4c p4cVar2 = (p4c) ny8Var.getValue();
        dc1 dc1VarJ = oc9.J(((long) i) * 1000, p4cVar2.c.f());
        Context context = p4cVar2.a;
        Locale locale = p4cVar2.f;
        String[] strArr = woh.b;
        int i2 = dc1VarJ.a;
        long j = dc1VarJ.b;
        switch (qt4.D(i2)) {
            case 0:
                return context.getString(R.string.tt_dates_right_now);
            case 1:
                return context.getString(R.string.tt_dates_minutes_last_seen, Integer.valueOf((int) j));
            case 2:
                return context.getString(R.string.tt_dates_hours_last_seen, Integer.valueOf((int) j));
            case 3:
                return j == 0 ? context.getString(R.string.tt_dates_yesterday_at_last_seen_no_time) : String.format(context.getString(R.string.tt_dates_yesterday_at), oc9.F(context, j, locale));
            case 4:
                return context.getString(R.string.tt_dates_days_last_seen, Integer.valueOf((int) j));
            case 5:
                return context.getString(R.string.tt_dates_weeks_last_seen, Integer.valueOf((int) j));
            case 6:
                return context.getString(R.string.tt_dates_months_last_seen, Integer.valueOf((int) j));
            case 7:
            case 8:
                return context.getString(R.string.tt_dates_full_last_seen_u, oc9.L(locale, j, qt4.e(i2, 8)));
            case 9:
                return context.getString(R.string.presence_was_long_ago);
            default:
                return "";
        }
    }

    public final qfd B(long j) {
        f9b f9bVar = (f9b) this.F.compute(Long.valueOf(j), new he7(new wfd(this, ((Boolean) this.p.i()).booleanValue()), 2));
        qfd qfdVar = f9bVar != null ? (qfd) f9bVar.getValue() : null;
        return qfdVar == null ? qfd.c : qfdVar;
    }

    public final vfd C() {
        return (vfd) this.D.getValue();
    }

    public final void D(zkb zkbVar) {
        if (((Boolean) this.u.i()).booleanValue()) {
            String str = this.g;
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.e;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str, zo5.j(zkbVar.h(), "handleNotifTyping for #"), null);
                }
            }
            this.F.compute(Long.valueOf(zkbVar.h()), new mw1(8, new uv2(this, 8, new k9d(this, 2, zkbVar))));
        }
    }

    public final boolean E(long j) {
        Long l = (Long) this.G.get(Long.valueOf(j));
        if (l == null) {
            return true;
        }
        long jLongValue = l.longValue();
        ghb ghbVar = ew5.b;
        return ew5.d(qe7.P(((s7f) ((et3) this.z.getValue())).f() - jLongValue, lw5.MILLISECONDS), qe7.O(((Number) this.s.i()).intValue(), lw5.SECONDS)) > 0;
    }

    public final void F() {
        StringBuilder sb;
        long[] jArr;
        long[] jArr2;
        StringBuilder sb2;
        qfd qfdVar;
        je9 je9Var = je9.e;
        gm0.x(this.g, "moveOnlineToOffline", null);
        l8b l8bVar = new l8b();
        char c = 7;
        uv2 uv2Var = new uv2(this, 7, l8bVar);
        for (Map.Entry entry : this.F.entrySet()) {
            Long l = (Long) entry.getKey();
            f9b f9bVar = (f9b) entry.getValue();
            qfd qfdVar2 = (qfd) f9bVar.getValue();
            if (qfdVar2 != null && (qfdVar = (qfd) uv2Var.invoke(l, qfdVar2)) != qfdVar2) {
                f9bVar.setValue(qfdVar);
            }
        }
        this.G.clear();
        if (l8bVar.e == 0) {
            String str = this.g;
            a4c a4cVar = gm0.f;
            if (a4cVar != null && a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "moveOnlineToOffline ignored, offlines are empty", null);
                return;
            }
            return;
        }
        ij4 ij4Var = (ij4) this.A.getValue();
        int i = 0;
        if (!l8bVar.h()) {
            yab.i0(ij4Var.b, null, 0, new qob(ij4Var, l8bVar, null, 19), 3);
        }
        String str2 = this.g;
        a4c a4cVar2 = gm0.f;
        if (a4cVar2 != null && a4cVar2.b(je9Var)) {
            StringBuilder sb3 = new StringBuilder("");
            long[] jArr3 = l8bVar.b;
            Object[] objArr = l8bVar.c;
            long[] jArr4 = l8bVar.a;
            int length = jArr4.length - 2;
            if (length >= 0) {
                int i2 = 0;
                int i3 = 0;
                loop1: while (true) {
                    long j = jArr4[i2];
                    char c2 = c;
                    if ((((~j) << c2) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i4 = 8;
                        int i5 = 8 - ((~(i2 - length)) >>> 31);
                        while (i < i5) {
                            if ((j & 255) < 128) {
                                int i6 = (i2 << 3) + i;
                                StringBuilder sb4 = sb3;
                                long j2 = jArr3[i6];
                                Object obj = objArr[i6];
                                if (i3 == -1) {
                                    sb = sb4;
                                    sb.append((CharSequence) "...");
                                    break loop1;
                                }
                                sb2 = sb4;
                                if (i3 != 0) {
                                    sb2.append((CharSequence) ", ");
                                }
                                sb2.append(j2);
                                sb2.append('=');
                                sb2.append(obj);
                                i3++;
                            } else {
                                sb2 = sb3;
                            }
                            j >>= i4;
                            sb3 = sb2;
                            i4 = i4;
                            jArr3 = jArr3;
                            i++;
                            jArr4 = jArr4;
                        }
                        jArr = jArr4;
                        sb = sb3;
                        jArr2 = jArr3;
                        if (i5 == i4) {
                        }
                    } else {
                        jArr = jArr4;
                        sb = sb3;
                        jArr2 = jArr3;
                    }
                    if (i2 != length) {
                        i2++;
                        sb3 = sb;
                        c = c2;
                        jArr4 = jArr;
                        jArr3 = jArr2;
                        i = 0;
                    }
                }
                a4cVar2.c(je9Var, str2, "moveOnlineToOffline ".concat(sb.toString()), null);
            }
            sb = sb3;
            sb.append((CharSequence) "");
            a4cVar2.c(je9Var, str2, "moveOnlineToOffline ".concat(sb.toString()), null);
        }
    }

    public final Object G(Collection collection, mdh mdhVar) {
        Collection collection2 = collection;
        boolean z = collection2 instanceof Collection;
        l7f l7fVar = this.o;
        if (!z || ((collection2 instanceof uv8) && !(collection2 instanceof vv8))) {
            Collection collection3 = collection;
            Long l = new Long(l7fVar.a());
            ArrayList arrayList = new ArrayList(yw3.W0(collection3, 10));
            boolean z2 = false;
            for (Object obj : collection3) {
                boolean z3 = true;
                if (!z2 && cqk.d(obj, l)) {
                    z2 = true;
                    z3 = false;
                }
                if (z3) {
                    arrayList.add(obj);
                }
            }
            collection = arrayList;
        } else {
            collection.remove(new Long(l7fVar.a()));
        }
        Object objR = r(new Long(l7fVar.a()), collection, mdhVar);
        return objR == hu4.a ? objR : sbi.a;
    }

    public final a2f H(long j, String str) {
        return v(Long.valueOf(this.o.a()), str, Long.valueOf(j));
    }

    /* JADX WARN: Code duplicated, block: B:25:0x007d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x007f A[LOOP:0: B:13:0x0035->B:26:0x007f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:35:0x0082 A[EDGE_INSN: B:35:0x0082->B:27:0x0082 BREAK  A[LOOP:0: B:13:0x0035->B:26:0x007f], SYNTHETIC] */
    public final void I(l8b l8bVar, boolean z) {
        int i;
        if (l8bVar.h()) {
            return;
        }
        l8b l8bVar2 = new l8b(l8bVar.e);
        long jF = z ? -1L : ((s7f) ((et3) this.z.getValue())).f();
        long[] jArr = l8bVar.b;
        Object[] objArr = l8bVar.c;
        long[] jArr2 = l8bVar.a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr2[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i2 != length) {
                        break;
                        break;
                    }
                    i2++;
                } else {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    long j2 = j;
                    int i4 = 0;
                    while (i4 < i3) {
                        if ((255 & j2) < 128) {
                            int i5 = (i2 << 3) + i4;
                            long j3 = jArr[i5];
                            qfd qfdVar = (qfd) objArr[i5];
                            i = i4;
                            if (K(j3, qfdVar, jF)) {
                                l8bVar2.i(j3, qfdVar);
                            }
                        } else {
                            i = i4;
                        }
                        j2 >>= 8;
                        i4 = i + 1;
                    }
                    if (i3 != 8) {
                        break;
                    } else if (i2 != length) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
        }
        if (l8bVar2.e != 0) {
            ij4 ij4Var = (ij4) this.A.getValue();
            if (l8bVar2.h()) {
                return;
            }
            yab.i0(ij4Var.b, null, 0, new qob(ij4Var, l8bVar2, null, 19), 3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0085 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x0087 A[LOOP:0: B:14:0x0039->B:28:0x0087, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:32:0x0083 A[EDGE_INSN: B:32:0x0083->B:26:0x0083 BREAK  A[LOOP:0: B:14:0x0039->B:28:0x0087], SYNTHETIC] */
    public final void J(l8b l8bVar) {
        String str = this.g;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, zo5.h(l8bVar.e, "onContactPresence, presence.count() = "), null);
            }
        }
        if (l8bVar.h()) {
            return;
        }
        l8b l8bVar2 = new l8b(l8bVar.e);
        long[] jArr = l8bVar.b;
        Object[] objArr = l8bVar.c;
        long[] jArr2 = l8bVar.a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr2[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i != length) {
                        break;
                        break;
                    }
                    i++;
                } else {
                    int i2 = 8;
                    int i3 = 8 - ((~(i - length)) >>> 31);
                    int i4 = 0;
                    while (i4 < i3) {
                        if ((255 & j) < 128) {
                            int i5 = (i << 3) + i4;
                            long j2 = jArr[i5];
                            rfd rfdVar = (rfd) objArr[i5];
                            l8bVar2.i(j2, new qfd(rfdVar.a, rfdVar.b));
                        }
                        j >>= i2;
                        i4++;
                        i2 = i2;
                    }
                    if (i3 != i2) {
                        break;
                    } else if (i != length) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
        I(l8bVar2, false);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0087  */
    public final boolean K(long j, qfd qfdVar, long j2) {
        Object value;
        long j3;
        qfd qfdVar2;
        boolean z;
        if (j2 != -1) {
            this.G.put(Long.valueOf(j), Long.valueOf(j2));
        }
        ((ConcurrentHashMap.KeySetView) this.E.getValue()).remove(Long.valueOf(j));
        boolean zBooleanValue = ((Boolean) this.r.i()).booleanValue();
        ConcurrentHashMap concurrentHashMap = this.F;
        if (!zBooleanValue) {
            f9b f9bVar = (f9b) concurrentHashMap.computeIfAbsent(Long.valueOf(j), new mm(17, new g3(27, qfdVar)));
            do {
                value = f9bVar.getValue();
                qfd qfdVar3 = (qfd) value;
                if (qfdVar3 == null || qfdVar3.a <= qfdVar.a) {
                    j3 = j;
                    qfdVar2 = qfdVar;
                } else {
                    String name = yfd.class.getName();
                    a4c a4cVar = gm0.f;
                    if (a4cVar == null) {
                        j3 = j;
                    } else {
                        je9 je9Var = je9.f;
                        if (a4cVar.b(je9Var)) {
                            int i = qfdVar3.a;
                            int i2 = qfdVar.a;
                            ghb ghbVar = ew5.b;
                            String strT = ew5.t(qe7.O(i - i2, lw5.SECONDS));
                            j3 = j;
                            StringBuilder sbQ = c0a.q(i, j3, "updatePresence for #", ": prev.seen more than new prev=");
                            sbQ.append(",new=");
                            sbQ.append(i2);
                            sbQ.append(",diff=");
                            sbQ.append(strT);
                            a4cVar.c(je9Var, name, sbQ.toString(), null);
                        } else {
                            j3 = j;
                        }
                    }
                    qfdVar2 = new qfd(qfdVar3.a, qfdVar.b);
                }
            } while (!f9bVar.h(value, qfdVar2));
            z = false;
            if (qfdVar2 != null && qfdVar2.a == qfdVar.a && qfdVar2.b == qfdVar.b) {
            }
            ((ConcurrentHashMap) this.H.getValue()).computeIfPresent(Long.valueOf(j3), new he7(new z00(4, qfdVar), 3));
            return z;
        }
        ((f9b) concurrentHashMap.computeIfAbsent(Long.valueOf(j), new am(16, new p7d(3, qfdVar)))).setValue(qfdVar);
        j3 = j;
        z = true;
        ((ConcurrentHashMap) this.H.getValue()).computeIfPresent(Long.valueOf(j3), new he7(new z00(4, qfdVar), 3));
        return z;
    }

    @Override // defpackage.nnf
    public final void b(int i) {
        String str = this.g;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "onSessionStateChanged " + i + ", allowOnlineStatus=" + this.I.get(), null);
            }
        }
        String str2 = this.g;
        if (i <= 1) {
            gm0.x(str2, "resetUpdateTime", null);
            this.G.clear();
            if (this.I.compareAndSet(true, false)) {
                F();
                return;
            }
            return;
        }
        a4c a4cVar2 = gm0.f;
        if (a4cVar2 != null) {
            je9 je9Var2 = je9.e;
            if (a4cVar2.b(je9Var2)) {
                a4cVar2.c(je9Var2, str2, zo5.g(this.d.get(), this.c.get(), "resetAccess: ", "|"), null);
            }
        }
        this.c.set(0L);
        this.d.set(0);
        this.I.set(true);
        yab.i0(this.n, null, 0, new qn6(this, (lq4) null, 27), 3);
    }

    @Override // defpackage.wed
    public final void f(LinkedHashSet linkedHashSet) {
        linkedHashSet.removeIf(new hk3(2, new lh3(((s7f) ((et3) this.z.getValue())).t(), this, 3)));
    }

    @Override // defpackage.wed
    public final long g() {
        return ew5.g(this.x.m());
    }

    @Override // defpackage.wed
    public final int j() {
        return this.X;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002e, code lost:
    
        if (r6.equals("service.unavailable") == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0037, code lost:
    
        if (r6.equals("too.many.requests") == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0040, code lost:
    
        if (r6.equals("internal") == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0049, code lost:
    
        if (r6.equals("io.exception") == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0052, code lost:
    
        if (r6.equals("proto.ver") == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005b, code lost:
    
        if (r6.equals("proto.payload") == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0064, code lost:
    
        if (r6.equals("service.timeout") == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x006d, code lost:
    
        if (r6.equals("proto.state") != false) goto L44;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.wed
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m(java.lang.Object r4, java.util.List r5, java.lang.Throwable r6) {
        /*
            Method dump skipped, instruction units count: 242
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yfd.m(java.lang.Object, java.util.List, java.lang.Throwable):void");
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0065 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0067 A[LOOP:0: B:5:0x0020->B:17:0x0067, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:20:0x0061 A[EDGE_INSN: B:20:0x0061->B:15:0x0061 BREAK  A[LOOP:0: B:5:0x0020->B:17:0x0067], SYNTHETIC] */
    @Override // defpackage.wed
    public final Object n(Object obj, List list, Object obj2, qed qedVar) {
        ((Number) obj).longValue();
        l8b l8bVar = ((pl4) obj2).c;
        l8b l8bVar2 = new l8b(l8bVar.e);
        long[] jArr = l8bVar.b;
        Object[] objArr = l8bVar.c;
        long[] jArr2 = l8bVar.a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr2[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i != length) {
                        break;
                        break;
                    }
                    i++;
                } else {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            long j2 = jArr[i4];
                            rfd rfdVar = (rfd) objArr[i4];
                            l8bVar2.i(j2, new qfd(rfdVar.a, rfdVar.b));
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                    if (i != length) {
                        break;
                    }
                    i++;
                }
            }
        }
        I(l8bVar2, false);
        return sbi.a;
    }

    @Override // defpackage.wed
    public final Object o(Object obj, List list, gz gzVar) {
        ((Number) obj).longValue();
        ky kyVar = new ky();
        kyVar.d("contactIds", list);
        return ((sih) this.B.getValue()).a.g(kyVar, gzVar);
    }

    @Override // defpackage.c2f
    public final boolean u(Object obj) {
        return ((Number) obj).longValue() == this.o.a();
    }

    @Override // defpackage.c2f
    public final long w(Long l) {
        ghb ghbVar = ew5.b;
        return qe7.O(((Number) this.s.i()).intValue(), lw5.SECONDS);
    }

    public final boolean x(long j, qfd qfdVar) {
        if (!qfdVar.b()) {
            return false;
        }
        Long lValueOf = Long.valueOf(this.o.a());
        Long lValueOf2 = Long.valueOf(j);
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.j.get(lValueOf);
        if ((concurrentHashMap != null && concurrentHashMap.containsKey(lValueOf2)) || this.b.contains(Long.valueOf(j))) {
            return false;
        }
        boolean zContains = this.K.contains(Long.valueOf(j));
        String str = this.g;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.e;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, bc1.l(j, "callFixApplied for #", ":", zContains), null);
            }
        }
        return !zContains && E(j);
    }

    public final CharSequence y(vg4 vg4Var) {
        qfd qfdVarB = B(vg4Var.v());
        return A(qfdVarB.a, qfdVarB.b);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x008d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:0x008e A[RETURN] */
    public final Object z(long j, mdh mdhVar) {
        Object objS;
        hu4 hu4Var = hu4.a;
        sbi sbiVar = sbi.a;
        if (j == this.o.a()) {
            gm0.Y(this.g, "fetchImmediately ignored: try to fetch self presence");
            return sbiVar;
        }
        Long l = new Long(this.o.a());
        Long l2 = new Long(j);
        boolean zContains = this.b.contains(l2);
        String str = this.g;
        if (!zContains) {
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.e;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str, "fetchImmediately for " + l + "|" + l2, null);
                }
            }
            objS = s(l, lof.W(l2), mdhVar);
            if (objS != hu4Var) {
            }
            if (objS == hu4Var) {
                return objS;
            }
            return sbiVar;
        }
        a4c a4cVar2 = gm0.f;
        if (a4cVar2 != null) {
            je9 je9Var2 = je9.f;
            if (a4cVar2.b(je9Var2)) {
                a4cVar2.c(je9Var2, str, "fetchImmediately fail, already processing for " + l + "|" + l2, null);
            }
        }
        objS = sbiVar;
        if (objS == hu4Var) {
            return objS;
        }
        return sbiVar;
    }
}
