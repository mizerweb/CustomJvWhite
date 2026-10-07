package defpackage;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import ru.ok.tamtam.messages.ChatException;
import ru.ok.tamtam.nano.Tasks;

/* JADX INFO: loaded from: classes.dex */
public final class v94 extends aq implements qih, btc {
    public final long f;
    public final boolean g;
    public final lni h;
    public final boolean i;
    public final long[] j;
    public final String k;

    public v94(long j, long j2, boolean z, lni lniVar, boolean z2, long[] jArr) {
        super(j);
        this.f = j2;
        this.g = z;
        this.h = lniVar;
        this.i = z2;
        this.j = jArr;
        this.k = v94.class.getName();
    }

    @Override // defpackage.qih, defpackage.btc
    public final boolean a() {
        return false;
    }

    @Override // defpackage.qih
    public final void b(kih kihVar) {
        if (kihVar instanceof w94) {
            bq bqVar = this.e;
            if (bqVar == null) {
                bqVar = null;
            }
            w94 w94Var = (w94) kihVar;
            ((zed) bqVar.c.getValue()).b.b().a.M.a(e5d.S6[31]).a(w94Var.h());
            if (w94Var.i() != null) {
                bq bqVar2 = this.e;
                if (bqVar2 == null) {
                    bqVar2 = null;
                }
                ((zed) bqVar2.c.getValue()).c.q(w94Var.i());
                lni lniVarI = w94Var.i();
                if (lniVarI != null ? cqk.d(lniVarI.w, Boolean.FALSE) : false) {
                    bq bqVar3 = this.e;
                    if (bqVar3 == null) {
                        bqVar3 = null;
                    }
                    xb9 xb9Var = (xb9) bqVar3.e();
                    xb9Var.e("app.pin_" + xb9Var.t(), null);
                }
                bq bqVar4 = this.e;
                (bqVar4 != null ? bqVar4 : null).b().c(new aa4());
            }
        }
    }

    @Override // defpackage.btc
    public final void d() {
        bq bqVar = this.e;
        if (bqVar == null) {
            bqVar = null;
        }
        bqVar.k().d(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v94)) {
            return false;
        }
        v94 v94Var = (v94) obj;
        return this.f == v94Var.f && this.g == v94Var.g && this.i == v94Var.i && cqk.d(this.h, v94Var.h) && Arrays.equals(this.j, v94Var.j);
    }

    @Override // defpackage.qih
    public final void f(yhh yhhVar) {
        String str = yhhVar.b;
        if ("favorite.chats.limit".equals(str)) {
            bq bqVar = this.e;
            if (bqVar == null) {
                bqVar = null;
            }
            qw2 qw2VarC = bqVar.c();
            qw2VarC.getClass();
            StringBuilder sb = new StringBuilder("removeFromFavorites: ");
            long j = this.f;
            sb.append(j);
            gm0.n("qw2", sb.toString());
            qw2VarC.b0(j, 0L, false);
        }
        if (str.length() > 0 && (str.equals("wrong.device.token") || str.equals("WRONG_DEVICE_TOKEN"))) {
            bq bqVar2 = this.e;
            if (bqVar2 == null) {
                bqVar2 = null;
            }
            ((s7f) bqVar2.e()).O(null);
            bq bqVar3 = this.e;
            if (bqVar3 == null) {
                bqVar3 = null;
            }
            ((s7f) bqVar3.e()).J("");
            bq bqVar4 = this.e;
            if (bqVar4 == null) {
                bqVar4 = null;
            }
            ((hgh) bqVar4.u0.getValue()).h(true);
            bq bqVar5 = this.e;
            hgh hghVar = (hgh) (bqVar5 != null ? bqVar5 : null).u0.getValue();
            s7f s7fVar = (s7f) hghVar.f();
            hghVar.j();
        }
        if (yhhVar instanceof thh) {
            return;
        }
        d();
    }

    @Override // defpackage.btc
    public final byte[] g() {
        Map<String, String> map;
        Tasks.Config config = new Tasks.Config();
        config.requestId = this.a;
        config.chatId = this.f;
        config.isPushToken = this.g;
        config.reset = this.i;
        lni lniVar = this.h;
        if (lniVar != null) {
            mw mwVar = new mw(0);
            Boolean bool = lniVar.a;
            if (bool != null) {
                mwVar.put("pushNewContacts", String.valueOf(bool));
            }
            Long l = lniVar.b;
            if (l != null) {
                mwVar.put("dontDustirbUntil", String.valueOf(l));
            }
            String str = lniVar.c;
            if (str != null) {
                mwVar.put("dialogsPushNotification", str);
            }
            String str2 = lniVar.d;
            if (str2 != null) {
                mwVar.put("chatsPushNotification", str2);
            }
            String str3 = lniVar.e;
            if (str3 != null) {
                mwVar.put("pushSound", str3);
            }
            String str4 = lniVar.f;
            if (str4 != null) {
                mwVar.put("dialogsPushSound", str4);
            }
            String str5 = lniVar.g;
            if (str5 != null) {
                mwVar.put("chatsPushSound", str5);
            }
            Boolean bool2 = lniVar.h;
            if (bool2 != null) {
                mwVar.put("hiddenOnline", String.valueOf(bool2));
            }
            Integer num = lniVar.i;
            if (num != null) {
                mwVar.put("led", String.valueOf(num));
            }
            Integer num2 = lniVar.j;
            if (num2 != null) {
                mwVar.put("dialogsLed", String.valueOf(num2));
            }
            Integer num3 = lniVar.k;
            if (num3 != null) {
                mwVar.put("chatsLed", String.valueOf(num3));
            }
            Boolean bool3 = lniVar.l;
            if (bool3 != null) {
                mwVar.put("vibration", String.valueOf(bool3));
            }
            Boolean bool4 = lniVar.m;
            if (bool4 != null) {
                mwVar.put("dialogsVibration", String.valueOf(bool4));
            }
            Boolean bool5 = lniVar.n;
            if (bool5 != null) {
                mwVar.put("chatsVibration", String.valueOf(bool5));
            }
            int i = lniVar.o;
            if (i != 0) {
                mwVar.put("chatsInvite", nbh.k(i));
            }
            int i2 = lniVar.p;
            if (i2 != 0) {
                mwVar.put("incomingCall", nbh.k(i2));
            }
            kni kniVar = lniVar.r;
            if (kniVar != null) {
                mwVar.put("inactiveTTL", kniVar.a);
            }
            int i3 = lniVar.s;
            if (i3 != 0) {
                mwVar.put("groupChatCallNotificationStatus", nbh.j(i3));
            }
            int i4 = lniVar.t;
            if (i4 != 0) {
                mwVar.put("commentsPushNotification", nbh.i(i4));
            }
            int i5 = lniVar.u;
            if (i5 != 0) {
                mwVar.put("suggestStickersStatus", nbh.l(i5));
            }
            Boolean bool6 = lniVar.v;
            if (bool6 != null) {
                mwVar.put("audioTranscriptionEnabled", String.valueOf(bool6));
            }
            Boolean bool7 = lniVar.w;
            map = mwVar;
            if (bool7 != null) {
                mwVar.put("safeMode", String.valueOf(bool7));
                map = mwVar;
            }
        } else {
            map = s66.a;
        }
        config.userSettings = map;
        config.syncChatIds = this.j;
        return sia.toByteArray(config);
    }

    @Override // defpackage.btc
    public final long getId() {
        return this.a;
    }

    @Override // defpackage.btc
    public final ctc getType() {
        return ctc.TYPE_CONFIG;
    }

    public final int hashCode() {
        int iN = nbh.n(nbh.n(Long.hashCode(this.f) * 31, 31, this.g), 31, this.i);
        lni lniVar = this.h;
        int iHashCode = (iN + (lniVar != null ? lniVar.hashCode() : 0)) * 31;
        long[] jArr = this.j;
        return iHashCode + (jArr != null ? Arrays.hashCode(jArr) : 0);
    }

    /* JADX WARN: Code duplicated, block: B:111:0x0164 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:57:0x00c6  */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x0136, code lost:
    
        return defpackage.atc.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x012b, code lost:
    
        if (r9.a == 0) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0132, code lost:
    
        if (r9.c == defpackage.kx2.h) goto L99;
     */
    @Override // defpackage.btc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.atc j() {
        /*
            Method dump skipped, instruction units count: 357
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v94.j():atc");
    }

    @Override // defpackage.btc
    public final int l() {
        return 1000000;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00c5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:38:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:51:0x0102  */
    /* JADX WARN: Code duplicated, block: B:55:0x011f  */
    /* JADX WARN: Code duplicated, block: B:57:0x0122  */
    /* JADX WARN: Code duplicated, block: B:59:0x0128 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:66:0x013b  */
    /* JADX WARN: Code duplicated, block: B:69:0x0140  */
    /* JADX WARN: Code duplicated, block: B:72:0x014f  */
    /* JADX WARN: Code duplicated, block: B:76:0x0158  */
    /* JADX WARN: Code duplicated, block: B:78:0x015b  */
    /* JADX WARN: Code duplicated, block: B:79:0x015e  */
    /* JADX WARN: Code duplicated, block: B:82:0x0163  */
    /* JADX WARN: Code duplicated, block: B:86:0x0172  */
    /* JADX WARN: Code duplicated, block: B:88:0x0175  */
    /* JADX WARN: Code duplicated, block: B:95:0x0184  */
    @Override // defpackage.aq
    public final Object m() {
        l8b l8bVar;
        Boolean boolValueOf;
        ia4 ia4Var;
        bq bqVar;
        int iIntValue;
        c79 c79VarW;
        boolean z;
        String str;
        bq bqVar2;
        long jQ;
        boolean z2;
        bq bqVar3;
        String strH;
        long j = this.f;
        String str2 = this.k;
        if (j > 0) {
            bq bqVar4 = this.e;
            if (bqVar4 == null) {
                bqVar4 = null;
            }
            rt2 rt2VarN = bqVar4.c().N(j);
            if (rt2VarN != null) {
                nx2 nx2Var = rt2VarN.b;
                if (rt2VarN.W()) {
                    cx2 cx2VarA = nx2Var.a();
                    t28 t28VarB = ge3.b();
                    t28VarB.i(pm9.l(cx2VarA.b));
                    t28VarB.g(cx2VarA.a);
                    t28VarB.h(cx2VarA.e);
                    ge3 ge3VarB = t28VarB.b();
                    long j2 = nx2Var.a;
                    l8b l8bVar2 = ki9.a;
                    l8bVar = new l8b();
                    l8bVar.l(j2, ge3VarB);
                }
                bqVar = this.e;
                if (bqVar == null) {
                    bqVar = null;
                }
                iIntValue = ((Number) ((e5d) bqVar.d.getValue()).z().i()).intValue();
                boolean z3 = this.i;
                if (iIntValue == 1 && iIntValue != 2) {
                    z = this.g;
                    if (z) {
                        bqVar3 = this.e;
                        if (bqVar3 == null) {
                            bqVar3 = null;
                        }
                        strH = ((hgh) bqVar3.u0.getValue()).h(false);
                        if (strH != null || strH.length() == 0) {
                            str = null;
                        } else {
                            str = strH;
                        }
                    } else {
                        str = null;
                    }
                    if (z) {
                        bqVar2 = this.e;
                        if (bqVar2 == null) {
                            bqVar2 = null;
                        }
                        jQ = ((s7f) bqVar2.e()).q();
                    } else {
                        jQ = -1;
                    }
                    z2 = jQ >= 0;
                    if (ia4Var == null || !ch3.r(str) || z3 || z2) {
                        return new wy2(ia4Var, this.i, str, (List) null, z2 ? new Long(jQ) : null);
                    }
                } else {
                    c79VarW = w();
                    if (ia4Var == null || c79VarW != null || z3) {
                        return new wy2(ia4Var, this.i, (String) null, c79VarW, (Long) null);
                    }
                }
                return null;
            }
            String str3 = "config: chat is null or inactive " + (rt2VarN != null ? Boolean.valueOf(rt2VarN.W()) : null);
            gm0.V(str2, str3, new ChatException.NotFound(str3));
            bqVar = this.e;
            if (bqVar == null) {
                bqVar = null;
            }
            iIntValue = ((Number) ((e5d) bqVar.d.getValue()).z().i()).intValue();
            boolean z4 = this.i;
            if (iIntValue == 1) {
                c79VarW = w();
                if (ia4Var == null) {
                }
                return new wy2(ia4Var, this.i, (String) null, c79VarW, (Long) null);
            }
            z = this.g;
            if (z) {
                str = null;
            } else {
                bqVar3 = this.e;
                if (bqVar3 == null) {
                    bqVar3 = null;
                }
                strH = ((hgh) bqVar3.u0.getValue()).h(false);
                if (strH != null) {
                    str = null;
                } else {
                    str = null;
                }
            }
            if (z) {
                jQ = -1;
            } else {
                bqVar2 = this.e;
                if (bqVar2 == null) {
                    bqVar2 = null;
                }
                jQ = ((s7f) bqVar2.e()).q();
            }
            if (jQ >= 0) {
            }
            if (ia4Var == null) {
            }
            return new wy2(ia4Var, this.i, str, (List) null, z2 ? new Long(jQ) : null);
            return null;
        }
        long[] jArr = this.j;
        if (jArr == null || jArr.length == 0) {
            l8bVar = null;
        } else {
            l8bVar = new l8b(jArr.length);
            for (long j3 : jArr) {
                bq bqVar5 = this.e;
                if (bqVar5 == null) {
                    bqVar5 = null;
                }
                rt2 rt2VarN2 = bqVar5.c().N(j3);
                if (rt2VarN2 != null) {
                    nx2 nx2Var2 = rt2VarN2.b;
                    if (rt2VarN2.W()) {
                        cx2 cx2VarA2 = nx2Var2.a();
                        t28 t28VarB2 = ge3.b();
                        t28VarB2.i(pm9.l(cx2VarA2.b));
                        t28VarB2.g(cx2VarA2.a);
                        l8bVar.l(nx2Var2.a, t28VarB2.b());
                    } else {
                        if (rt2VarN2 != null) {
                            boolValueOf = Boolean.valueOf(rt2VarN2.W());
                        } else {
                            boolValueOf = null;
                        }
                        String str4 = "config: chat is null or inactive " + boolValueOf;
                        gm0.V(str2, str4, new ChatException.NotFound(str4));
                    }
                } else {
                    if (rt2VarN2 != null) {
                        boolValueOf = Boolean.valueOf(rt2VarN2.W());
                    } else {
                        boolValueOf = null;
                    }
                    String str5 = "config: chat is null or inactive " + boolValueOf;
                    gm0.V(str2, str5, new ChatException.NotFound(str5));
                }
            }
        }
        lni lniVar = this.h;
        ia4Var = ((l8bVar == null || l8bVar.h()) && lniVar == null) ? null : new ia4(l8bVar, lniVar, 16);
        bqVar = this.e;
        if (bqVar == null) {
            bqVar = null;
        }
        iIntValue = ((Number) ((e5d) bqVar.d.getValue()).z().i()).intValue();
        boolean z5 = this.i;
        if (iIntValue == 1) {
            c79VarW = w();
            if (ia4Var == null) {
            }
            return new wy2(ia4Var, this.i, (String) null, c79VarW, (Long) null);
        }
        z = this.g;
        if (z) {
            str = null;
        } else {
            bqVar3 = this.e;
            if (bqVar3 == null) {
                bqVar3 = null;
            }
            strH = ((hgh) bqVar3.u0.getValue()).h(false);
            if (strH != null) {
                str = null;
            } else {
                str = null;
            }
        }
        if (z) {
            jQ = -1;
        } else {
            bqVar2 = this.e;
            if (bqVar2 == null) {
                bqVar2 = null;
            }
            jQ = ((s7f) bqVar2.e()).q();
        }
        if (jQ >= 0) {
        }
        if (ia4Var == null) {
        }
        return new wy2(ia4Var, this.i, str, (List) null, z2 ? new Long(jQ) : null);
        return null;
    }

    public final c79 w() {
        if (this.g) {
            bq bqVar = this.e;
            if (bqVar == null) {
                bqVar = null;
            }
            hgh hghVar = (hgh) bqVar.u0.getValue();
            String strH = hghVar.h(false);
            s7f s7fVar = (s7f) hghVar.f();
            String str = (String) s7fVar.B.m(s7fVar, s7f.j0[24]);
            if (hghVar.j() == 0) {
                str = null;
            }
            bq bqVar2 = this.e;
            if (bqVar2 == null) {
                bqVar2 = null;
            }
            long jQ = ((s7f) bqVar2.e()).q();
            bq bqVar3 = this.e;
            if (bqVar3 == null) {
                bqVar3 = null;
            }
            ((wxb) bqVar3.t0.getValue()).getClass();
            String str2 = this.k;
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.d;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str2, "getPushTokens: pushOptions = ".concat(fzd.b(jQ)), null);
                }
            }
            c79 c79Var = new c79(2);
            if (strH != null && strH.length() != 0) {
                bq bqVar4 = this.e;
                if (bqVar4 == null) {
                    bqVar4 = null;
                }
                syd sydVar = ((umi) bqVar4.s0.getValue()).a().j;
                if (sydVar == null) {
                    ore.p("Required value was null.");
                    return null;
                }
                c79Var.add(new ozd(sydVar, strH, new fzd(jQ)));
            }
            if (str != null && str.length() != 0) {
                c79Var.add(new ozd(syd.RUSTORE, str, new fzd(jQ)));
            }
            c79 c79VarJ = yab.j(c79Var);
            if (!c79VarJ.isEmpty()) {
                return c79VarJ;
            }
        }
        return null;
    }
}
