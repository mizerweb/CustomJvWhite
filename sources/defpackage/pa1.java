package defpackage;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.URLSpan;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.function.UnaryOperator;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.waiting_room.WaitingRoomParticipantsUpdate;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class pa1 implements UnaryOperator {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ pa1(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:152:0x00d3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x00ce A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x00d0 A[LOOP:1: B:12:0x0055->B:38:0x00d0, LOOP_END] */
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        Object value;
        cd cdVar;
        pw pwVar;
        xyc xycVar;
        jeg jegVarV = null;
        switch (this.a) {
            case 0:
                WaitingRoomParticipantsUpdate waitingRoomParticipantsUpdate = (WaitingRoomParticipantsUpdate) this.b;
                ya1 ya1Var = (ya1) this.c;
                pw pwVar2 = (pw) obj;
                je9 je9Var = je9.d;
                List<ParticipantId> list = waitingRoomParticipantsUpdate.participantsIds;
                pw pwVar3 = new pw(0);
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    pwVar3.add(anc.a((ParticipantId) it.next()));
                }
                if (waitingRoomParticipantsUpdate.hasAdded) {
                    a4c a4cVar = gm0.f;
                    if (a4cVar != null && a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, "CallAdminSettingsController", "Waiting room added new users=" + pwVar3, null);
                    }
                    mjg mjgVar = ya1Var.i;
                    do {
                        value = mjgVar.getValue();
                        cdVar = (cd) value;
                        pwVar = new pw(0);
                        hw hwVar = new hw(pwVar3);
                        while (hwVar.hasNext()) {
                            Object next = hwVar.next();
                            if (!pwVar2.contains(Long.valueOf(((fu1) next).a))) {
                                pwVar.add(next);
                            }
                        }
                    } while (!mjgVar.h(value, cd.a(cdVar, null, pwVar, System.currentTimeMillis(), 1)));
                } else if (waitingRoomParticipantsUpdate.hasRemoved) {
                    a4c a4cVar2 = gm0.f;
                    if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                        a4cVar2.c(je9Var, "CallAdminSettingsController", "Waiting room remove users=" + pwVar3, null);
                    }
                } else {
                    a4c a4cVar3 = gm0.f;
                    if (a4cVar3 != null && a4cVar3.b(je9Var)) {
                        a4cVar3.c(je9Var, "CallAdminSettingsController", "Waiting room update users=" + pwVar3, null);
                    }
                }
                pw pwVar4 = new pw(0);
                hw hwVar2 = new hw(pwVar3);
                while (hwVar2.hasNext()) {
                    pwVar4.add(Long.valueOf(((fu1) hwVar2.next()).a));
                }
                return pwVar4;
            case 1:
                as2 as2Var = (as2) this.b;
                xt4 xt4Var = (xt4) this.c;
                hr2 hr2Var = (hr2) obj;
                if (hr2Var != null && !hr2Var.i(null)) {
                    gm0.Y(as2Var.e, "subscribeIfNeed#3: already closed!");
                }
                p41 p41VarB = yab.b(Integer.MAX_VALUE, 0, new j22(6, as2Var), 2);
                p41VarB.A(new tc(as2Var, 19, yab.i0(as2Var.b, xt4Var, 0, new f00(p41VarB, as2Var, (lq4) null, 11), 2)));
                return p41VarB;
            case 2:
                rt2 rt2Var = (rt2) this.b;
                fda fdaVar = (fda) this.c;
                amc amcVar = (amc) obj;
                if (fdaVar == null) {
                    return null;
                }
                sfa sfaVar = fdaVar.a;
                if (amcVar != null && ((Long) amcVar.a).longValue() == sfaVar.a) {
                    return amcVar;
                }
                e13 e13Var = fdaVar.h;
                e13Var.getClass();
                Spanned spannedG = e13.g(e13Var, rt2Var, fdaVar, 1);
                if (ch3.s(spannedG)) {
                    int i = jeg.a;
                    jeg jegVarV2 = ku6.v(spannedG);
                    for (Object obj2 : jegVarV2.getSpans(0, jegVarV2.length(), Object.class)) {
                        if ((obj2 instanceof URLSpan) || (obj2 instanceof gn9)) {
                            jegVarV2.removeSpan(obj2);
                        }
                    }
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(jegVarV2);
                    boolean z = true;
                    int i2 = 0;
                    while (i2 < spannableStringBuilder.length()) {
                        char cCharAt = spannableStringBuilder.charAt(i2);
                        if (!Character.isWhitespace(cCharAt)) {
                            z = false;
                        } else if (z) {
                            spannableStringBuilder.delete(i2, i2 + 1);
                        } else {
                            if (cCharAt != ' ') {
                                spannableStringBuilder.replace(i2, i2 + 1, (CharSequence) " ");
                            }
                            z = true;
                        }
                        i2++;
                    }
                    spannedG = spannableStringBuilder;
                }
                Long lValueOf = Long.valueOf(sfaVar.a);
                if (!ch3.r(spannedG)) {
                    int i3 = jeg.a;
                    jegVarV = ku6.v(spannedG);
                }
                return new amc(lValueOf, jegVarV);
            case 3:
                qu6 qu6VarM0 = yhf.m0(new sw(1, (List) this.b), new nv4(14, (d67) this.c));
                w57 w57Var = w57.b;
                Iterator it2 = qu6VarM0.iterator();
                if (!it2.hasNext()) {
                    return c76.a;
                }
                Object objInvoke = w57Var.invoke(it2.next());
                if (!it2.hasNext()) {
                    return Collections.singleton(objInvoke);
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                linkedHashSet.add(objInvoke);
                while (it2.hasNext()) {
                    linkedHashSet.add(w57Var.invoke(it2.next()));
                }
                return linkedHashSet;
            case 4:
                ava avaVar = (ava) this.b;
                rt2 rt2Var2 = (rt2) this.c;
                boolean z2 = avaVar.b;
                return new bva(z2 ? 1 : 4, !z2, true, (!z2 || rt2Var2.O()) ? i5f.a : i5f.b, 0L, avaVar.a, avaVar.c, 16);
            case 5:
                xde xdeVar = (xde) this.b;
                LinkedHashSet linkedHashSet2 = (LinkedHashSet) this.c;
                m8b m8bVar = (m8b) xdeVar.c;
                long[] jArr = m8bVar.b;
                long[] jArr2 = m8bVar.a;
                int length = jArr2.length - 2;
                if (length >= 0) {
                    int i4 = 0;
                    while (true) {
                        long j = jArr2[i4];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i5 = 8;
                            int i6 = 8 - ((~(i4 - length)) >>> 31);
                            int i7 = 0;
                            while (i7 < i6) {
                                if ((255 & j) < 128) {
                                    long j2 = jArr[(i4 << 3) + i7];
                                    xyc xycVarM = xdeVar.M(j2);
                                    if (xycVarM == null) {
                                        ny8 ny8Var = (ny8) xdeVar.b;
                                        if (ny8Var != null) {
                                            rt2 rt2Var3 = (rt2) ((xn3) ny8Var.getValue()).k(j2).a.getValue();
                                            xycVar = new xyc(2, (rt2Var3 == null || !rt2Var3.h0()) ? 1 : 2, j2);
                                        } else {
                                            xycVar = new xyc(2, 1, j2);
                                        }
                                    } else {
                                        xycVar = xycVarM;
                                    }
                                    linkedHashSet2.add(xycVar);
                                } else {
                                    i5 = i5;
                                }
                                j >>= i5;
                                i7++;
                                i5 = i5;
                            }
                            if (i6 == i5) {
                                if (i4 != length) {
                                    i4++;
                                }
                            }
                        } else if (i4 != length) {
                            i4++;
                        }
                    }
                }
                return linkedHashSet2;
            default:
                List list2 = (List) this.b;
                vng vngVar = (vng) this.c;
                List list3 = list2;
                ArrayList arrayList = new ArrayList(yw3.W0(list3, 10));
                Iterator it3 = list3.iterator();
                while (it3.hasNext()) {
                    arrayList.add(vng.B(vngVar, (clg) it3.next()));
                }
                return arrayList;
        }
    }
}
