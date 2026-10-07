package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import ru.ok.tamtam.messages.ChatException;

/* JADX INFO: loaded from: classes3.dex */
public final class gei {
    public final l7f a;
    public final ny8 b;
    public final ny8 c;
    public final ny8 d;
    public final ny8 e;
    public final ny8 f;
    public final ny8 g;
    public final ny8 h;
    public final String i = gei.class.getName();

    public gei(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, l7f l7fVar, ny8 ny8Var4, ny8 ny8Var5, ny8 ny8Var6, ny8 ny8Var7) {
        this.a = l7fVar;
        this.b = ny8Var;
        this.c = ny8Var2;
        this.d = ny8Var3;
        this.e = ny8Var4;
        this.f = ny8Var5;
        this.g = ny8Var6;
        this.h = ny8Var7;
    }

    public final rt2 a(final long j, final sfa sfaVar, final long j2, final int i, final long j3, final boolean z) {
        String str = this.i;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, zo5.j(j, "execute: "), null);
            }
        }
        boolean zD = sfaVar.D();
        ny8 ny8Var = this.b;
        if (zD) {
            return (rt2) ((xn3) ny8Var.getValue()).k(j).a.getValue();
        }
        xn3 xn3Var = (xn3) ny8Var.getValue();
        return xn3Var.j().v(j, false, new tg4() { // from class: fei
            /* JADX WARN: Code duplicated, block: B:121:0x02e9  */
            /* JADX WARN: Code duplicated, block: B:124:0x0315  */
            /* JADX WARN: Code duplicated, block: B:128:0x0344  */
            /* JADX WARN: Code duplicated, block: B:167:0x043f  */
            /* JADX WARN: Code duplicated, block: B:169:0x0449  */
            /* JADX WARN: Code duplicated, block: B:174:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:175:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:81:0x01d7  */
            @Override // defpackage.tg4
            public final void accept(Object obj) {
                long j4;
                long j5;
                long jS;
                i70 i70Var;
                long jLongValue;
                String str2;
                sfa sfaVarC;
                gei geiVar = this.a;
                sfa sfaVar2 = sfaVar;
                long j6 = j3;
                int i2 = i;
                long j7 = j;
                long j8 = j2;
                boolean z2 = z;
                tw2 tw2Var = (tw2) obj;
                je9 je9Var2 = je9.d;
                long jA = geiVar.a.a();
                boolean z3 = jA == sfaVar2.e;
                if (j6 >= 0 && tw2Var.c().containsKey(Long.valueOf(jA))) {
                    Map map = tw2Var.e;
                    mw mwVarV = map instanceof mw ? (mw) map : oc9.V(map);
                    mwVarV.put(Long.valueOf(jA), Long.valueOf(j6));
                    tw2Var.e = mwVarV;
                }
                if (i2 >= 0) {
                    tw2Var.m = i2;
                    tw2Var.O = tw2Var.O || (sfaVar2.H() && sfaVar2.q.e == jA);
                }
                long jX = ((s7f) ((et3) geiVar.c.getValue())).x();
                if (jX != 0 && sfaVar2.c > jX) {
                    ((s7f) ((et3) geiVar.c.getValue())).B(sfaVar2.c);
                }
                long j9 = sfaVar2.c;
                if (j9 > tw2Var.k) {
                    tw2Var.k = j9;
                }
                if (tw2Var.j != 0) {
                    sfa sfaVarL = ((qfa) ((sua) geiVar.d.getValue()).f.getValue()).l(tw2Var.j);
                    if (sfaVarL != null && sfaVar2.c > sfaVarL.c) {
                        if (sfaVarL.h != j7) {
                            ((s7f) ((et3) geiVar.c.getValue())).E(true);
                            long j10 = tw2Var.j;
                            long j11 = tw2Var.a;
                            StringBuilder sbS = qt4.s(j7, "invalid chatId=", " builder.lastMessageId=");
                            sbS.append(j10);
                            qt4.z(j11, "chat.serverId=", "currentLastMessage=", sbS);
                            sbS.append(sfaVarL);
                            sbS.append(", messageDb=");
                            sbS.append(sfaVar2);
                            sbS.append("; place=builder.lastMessageId != 0L");
                            gm0.V(geiVar.i, sbS.toString(), new ChatException.WrongLastMessage(j7, sfaVarL));
                        }
                        tw2Var.j = sfaVar2.a;
                    }
                } else {
                    if (sfaVar2.h != j7) {
                        ((s7f) ((et3) geiVar.c.getValue())).E(true);
                        gm0.V(geiVar.i, c0a.m(sfaVar2.h, ", place: else condition: builder.lastMessageId == 0L", qt4.s(j7, "invalid chatId=", " messageDb.chatId=")), new ChatException.WrongLastMessage(j7, sfaVar2));
                    }
                    tw2Var.j = sfaVar2.a;
                }
                if (!z3) {
                    List list = sfaVar2.D;
                    if (list != null) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            if (((cga) it.next()).a == jA) {
                                tw2Var.i0 = sfaVar2.b;
                                break;
                            }
                        }
                    }
                    sfa sfaVar3 = sfaVar2.q;
                    if (sfaVar3 != null && sfaVar2.o == 1 && sfaVar3.e == jA) {
                        tw2Var.i0 = sfaVar2.b;
                    }
                }
                if (sfaVar2.M()) {
                    ((iei) geiVar.e.getValue()).a(j7, tw2Var, sfaVar2);
                }
                if (j8 <= 0 || (sfaVarC = ((ose) ((sua) geiVar.d.getValue()).a).c(j7, j8)) == null || !sb8.s(tw2Var.n, sfaVarC.c, sfaVar2.c, sfaVar2.H)) {
                    ex2 ex2VarX = sb8.x(sfaVar2.c, tw2Var.n.e(sfaVar2.H));
                    if (ex2VarX != null) {
                        long j12 = ex2VarX.a;
                        long j13 = ex2VarX.b;
                        if (j12 == j13) {
                            j4 = 0;
                        } else {
                            j4 = j13;
                        }
                    } else {
                        j4 = 0;
                    }
                    char c = 232;
                    if (z2 && ((Number) ((e5d) geiVar.h.getValue()).w3.a(e5d.S6[232]).i()).intValue() == 1) {
                        c = 232;
                    } else {
                        String str3 = geiVar.i;
                        a4c a4cVar2 = gm0.f;
                        if (a4cVar2 != null && a4cVar2.b(je9Var2)) {
                            a4cVar2.c(je9Var2, str3, zo5.j(sfaVar2.c, "try insert msg chunk, time:"), null);
                        }
                        sb8.R(tw2Var.n, sfaVar2.c, sfaVar2.H);
                    }
                    String str4 = geiVar.i;
                    a4c a4cVar3 = gm0.f;
                    if (a4cVar3 != null && a4cVar3.b(je9Var2)) {
                        a4cVar3.c(je9Var2, str4, zo5.j(j4, "prevMesssage not found, load history to backwardTime="), null);
                    }
                    afh afhVar = (afh) geiVar.f.getValue();
                    long j14 = tw2Var.a;
                    char c2 = c;
                    j5 = j7;
                    int i3 = tw2Var.H;
                    long j15 = j4;
                    long j16 = sfaVar2.c;
                    mg5 mg5Var = sfaVar2.H;
                    afhVar.getClass();
                    if (!mg5Var.a()) {
                        int iIntValue = ((Number) ((g5d) ((gjf) afhVar.b.getValue())).a.w3.a(e5d.S6[c2]).i()).intValue();
                        if (iIntValue == 0) {
                            tw2Var = tw2Var;
                            gm0.x(afhVar.a, "use legacy strategy", null);
                            iz2.c((iz2) afhVar.c.getValue(), j5, j14, j16, j15, 0L, mg5.REGULAR);
                            ((lz2) afhVar.e.getValue()).a(9, Float.NaN);
                        } else if (iIntValue == 1) {
                            tw2Var = tw2Var;
                            gm0.x(afhVar.a, "use no chat history strategy", null);
                        } else if (iIntValue == 2) {
                            tw2Var = tw2Var;
                            yab.i0((wmi) afhVar.d.getValue(), null, 0, new zeh(i3, afhVar, j5, j14, j16, j15, null), 3);
                        }
                        if (z2) {
                            j5 = j5;
                            i70Var = (i70) geiVar.g.getValue();
                            jLongValue = ((Number) tw2Var.c().getOrDefault(Long.valueOf(jA), -1L)).longValue();
                            str2 = i70Var.a;
                            long j17 = sfaVar2.a;
                            if (sfaVar2.C()) {
                                ghb ghbVar = ew5.b;
                                long jO = qe7.O(7, lw5.DAYS);
                                long jF = ((s7f) ((et3) i70Var.e.getValue())).f();
                                lw5 lw5Var = lw5.MILLISECONDS;
                                long jP = qe7.P(jF, lw5Var);
                                if (jLongValue >= 0 || ew5.d(ew5.o(jP, qe7.P(jLongValue, lw5Var)), jO) > 0) {
                                    gm0.x(str2, "Don't need prefetch because it isn't fresh chat by readMark", null);
                                } else {
                                    y60 y60Var = y60.e;
                                    if (!sfaVar2.B(y60Var) || sfaVar2.n() == null) {
                                        y60 y60Var2 = y60.d;
                                        if (sfaVar2.B(y60Var2) && !sfaVar2.I() && ((Boolean) ((e5d) i70Var.d.getValue()).V3.a(e5d.S6[257]).i()).booleanValue() && ((u4a) i70Var.f.getValue()).c()) {
                                            e70 e70VarK = sfaVar2.k(y60Var2);
                                            d70 d70Var = e70VarK != null ? e70VarK.d : null;
                                            if (e70VarK == null || d70Var == null) {
                                                gm0.x(str2, "Can't prefetch video content, video is null", null);
                                            } else {
                                                gm0.n(str2, "Call fetch video in prefetcher");
                                                ((tyi) i70Var.c.getValue()).b(j5, Collections.singletonList(Long.valueOf(j17)));
                                            }
                                        }
                                    } else if (((Boolean) ((e5d) i70Var.d.getValue()).T3.a(e5d.S6[255]).i()).booleanValue()) {
                                        u4a u4aVar = (u4a) i70Var.f.getValue();
                                        if (u4aVar.a(u4aVar.b().c.d.getInt("app.media.load.audio_messages", 0))) {
                                            e70 e70VarK2 = sfaVar2.k(y60Var);
                                            b60 b60Var = e70VarK2 != null ? e70VarK2.e : null;
                                            if (e70VarK2 == null || b60Var == null) {
                                                gm0.x(str2, "Try prefetch audio content but audio is null", null);
                                            } else {
                                                gm0.n(str2, "Call fetch audio in prefetcher");
                                                ((m80) i70Var.b.getValue()).c(j5, Collections.singletonList(new ylc(Long.valueOf(j17), e70VarK2.t)));
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        if (z3) {
                            jS = sfaVar2.s();
                            if (tw2Var.b0 < jS) {
                                tw2Var.b0 = jS;
                            }
                        }
                    }
                    String str5 = afhVar.a;
                    a4c a4cVar4 = gm0.f;
                    if (a4cVar4 != null) {
                        je9 je9Var3 = je9.f;
                        if (a4cVar4.b(je9Var3)) {
                            a4cVar4.c(je9Var3, str5, "try to use delayed message", null);
                        }
                    }
                } else {
                    gm0.n(geiVar.i, "prevMesssage found, extend its chunk");
                    j5 = j7;
                }
                if (z2) {
                    j5 = j5;
                    i70Var = (i70) geiVar.g.getValue();
                    jLongValue = ((Number) tw2Var.c().getOrDefault(Long.valueOf(jA), -1L)).longValue();
                    str2 = i70Var.a;
                    long j18 = sfaVar2.a;
                    if (sfaVar2.C()) {
                        ghb ghbVar2 = ew5.b;
                        long jO2 = qe7.O(7, lw5.DAYS);
                        long jF2 = ((s7f) ((et3) i70Var.e.getValue())).f();
                        lw5 lw5Var2 = lw5.MILLISECONDS;
                        long jP2 = qe7.P(jF2, lw5Var2);
                        if (jLongValue >= 0) {
                            gm0.x(str2, "Don't need prefetch because it isn't fresh chat by readMark", null);
                        } else {
                            gm0.x(str2, "Don't need prefetch because it isn't fresh chat by readMark", null);
                        }
                    }
                }
                if (z3) {
                    jS = sfaVar2.s();
                    if (tw2Var.b0 < jS) {
                        tw2Var.b0 = jS;
                    }
                }
            }
        });
    }
}
